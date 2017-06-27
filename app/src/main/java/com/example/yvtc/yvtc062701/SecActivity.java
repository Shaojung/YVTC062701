package com.example.yvtc.yvtc062701;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);

        Intent it = getIntent();
        Bundle bundle = it.getExtras();
        int a = bundle.getInt("va");
        int b = bundle.getInt("vb");
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText(String.valueOf(a + b));
    }
}
