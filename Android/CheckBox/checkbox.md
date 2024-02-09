## CHECKBOX
### AIM
    Write a Program to check the items listed
### PROGRAM
activity_main.xml
```xml

    <CheckBox
        android:id="@+id/checkBox1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Pizza"/>

    <CheckBox
        android:id="@+id/checkBox2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Burger" />
    <CheckBox
        android:id="@+id/checkBox3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Coffee"/>

    <Button
        android:id="@+id/btn"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Order"/>
```



MainActivity.java
```java

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
```