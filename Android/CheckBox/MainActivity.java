package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    CheckBox pizza, burger, coffee;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn);
        pizza = (CheckBox) findViewById(R.id.checkBox1);
        burger = (CheckBox) findViewById(R.id.checkBox2);
        coffee = (CheckBox) findViewById(R.id.checkBox3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder result = new StringBuilder();
                result.append("Selected items are ");
                if(pizza.isChecked())
                    result.append(" Pizza ");
                if(burger.isChecked())
                    result.append(" Burger ");
                if(coffee.isChecked())
                    result.append(" Coffee ");
                Toast.makeText(MainActivity.this, result.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}