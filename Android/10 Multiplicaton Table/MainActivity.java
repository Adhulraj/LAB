package com.example.multiplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText number, limit;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number = (EditText) findViewById(R.id.number);
        limit = (EditText) findViewById(R.id.limit);
        btn = (Button) findViewById(R.id.btn);
        result = (TextView) findViewById(R.id.result);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.btn){
                    StringBuffer buffer = new StringBuffer();
                    int num = Integer.parseInt(number.getText().toString());
                    int lim = Integer.parseInt(limit.getText().toString());
                    for(int i = 1; i <= lim; i++){
                        buffer.append(num + "x" + i + "=" + i*num + "\n");
                    }
                    result.setText(buffer);
                }
            }
        });
    }
}