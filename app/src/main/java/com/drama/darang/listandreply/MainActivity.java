package com.drama.darang.listandreply;

//import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
//import android.view.View;
//import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Darang on 2015-12-19.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 댓글 입력 수 자동 카운트
        EditText t = (EditText) findViewById(R.id.editText1); // 입력창
        t.setHorizontallyScrolling(false);

        t.addTextChangedListener(new TextWatcher() {
            TextView cntText = (TextView) findViewById(R.id.count); // 결과창
            String strCnt;

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                strCnt = s.toString();
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                    cntText.setText(String.valueOf(s.length()));
        }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        // 등록 버튼 눌렀을시 이벤트
        /*Button b = (Button) findViewById(R.id.button1);

        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                EditText t = (EditText) findViewById(R.id.editText1);
                Intent intent = new Intent(getApplicationContext(), NextActivity.class);

                intent.putExtra("name", "주인공");
                intent.putExtra("text", t.getText().toString());

                startActivity(intent);
            }
        });*/
    }
}
