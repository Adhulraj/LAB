package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btn);
        rg = (RadioGroup) findViewById(R.id.rgp);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int Selected = rg.getCheckedRadioButtonId();
                RadioButton rb = (RadioButton) findViewById(Selected);
                Toast.makeText(MainActivity.this, "You have selected " + rb.getText(),Toast.LENGTH_SHORT).show();
            }
        });

    }
}