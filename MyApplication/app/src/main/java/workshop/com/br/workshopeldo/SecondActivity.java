package workshop.com.br.workshopeldo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent in = getIntent();
        String name = in.getStringExtra("name");
        //String message = "Bem-Vindo, "+ name+"!"
        String message = String.format(getResources().getString(R.string.WelcomeMessage),name);
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(message);
    }


}