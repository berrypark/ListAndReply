package com.drama.darang.listandreply;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Darang on 2015-12-19.
 */
public class NextActivity extends AppCompatActivity {

    @Override
    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String text = intent.getStringExtra("text");

        TextView tv1 = (TextView) findViewById(R.id.textView1);
        tv1.setText(name);
        TextView tv2 = (TextView) findViewById(R.id.textView2);
        tv2.setText(text);
    }

}
