package com.klaus.mauricio.httpexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickBtn1(View view) {
        EditText edt1 = (EditText) findViewById(R.id.editText1);
        new httpRequestExample(MainActivity.this, edt1.getText().toString()) ;
    }

}
