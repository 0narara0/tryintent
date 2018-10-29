package com.cmy.www.tryintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = findViewById(R.id.button1);
        btn1.setOnClickListener(this);
        Button btn2 = findViewById(R.id.button2);
        btn2.setOnClickListener(this);
        Button btn3 = findViewById(R.id.button3);
        btn3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent intent1, intent2, intent3 = null;
        switch (id) {
            case R.id.button1:
                intent1 = new Intent(this, Explicit1Activity.class);
                startActivity(intent1);
                break;
            case R.id.button2:
                intent2 = new Intent(this, Explicit2Activity.class);
                startActivity(intent2);
                break;
            case R.id.button3:
                intent3 = new Intent(this, Explicit3Activity.class);
                startActivity(intent3);
                break;
        }

    }
}
