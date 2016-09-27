package workshop.com.br.workshopeldo;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private static final String TAG = "MainActivity";
    private static final String SharedPref = "SharedPref";
    EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences sp = getSharedPreferences(SharedPref, Context.MODE_PRIVATE);
        String name = sp.getString("nameKey", "");
        edit = (EditText) findViewById(R.id.textView);
        edit.setText(name);
        Log.d(TAG,"onCreate");
        Intent intent = new Intent(this, WorkShopService.class);
        startService(intent);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause");
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("name",edit.getText().toString());
        SharedPreferences.Editor editor = getSharedPreferences(SharedPref,Context.MODE_PRIVATE).edit();
        editor.putString("nameKey", edit.getText().toString());
        editor.apply();
        startActivity(intent);
    }
}
