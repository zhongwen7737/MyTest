package com.cn.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by admin on 2017/8/7.
 */

public class LoginActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
         button = (Button) findViewById(R.id.btn_name);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this,MainActivity.class);

                startActivity(intent);
                Toast.makeText(LoginActivity.this,"跳转新页面",Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        return super.onContextItemSelected(item);
    }

    @Override
    public void finish() {
        super.finish();

    }

    @Override
    protected void onRestart() {
        Log.e("onRestart","onRestart");
        super.onRestart();
    }

    @Override
    protected void onStop() {
        Log.e("onStop","onStop");
        super.onStop();
    }

    @Override
    protected void onResume() {
        Log.e("onResume","onResume");
        super.onResume();
    }
}
