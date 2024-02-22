## ADDITION OF TWO NUMBERS

### AIM

   8. Write a program to add two numbers

### PROGRAM

activity_main.xml

```xml
    <EditText
        android:id="@+id/num1"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Enter Number 1"/>
    <EditText
        android:id="@+id/num2"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Enter Number 2"/>
    <TextView
        android:id="@+id/res"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"/>
    <Button
        android:id="@+id/btn"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Add"/>
```

MainActivity.java

```java
public class MainActivity extends AppCompatActivity {
    EditText num1, num2;
    TextView res;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);

        btn = (Button) findViewById(R.id.btn);
        res = (TextView) findViewById(R.id.res);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double n1 = Double.parseDouble(num1.getText().toString());
                Double n2 = Double.parseDouble(num2.getText().toString());
                Double sum = n1+n2;
                res.setText(Double.toString(sum));
            }
        });
    }
}
```
