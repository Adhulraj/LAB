## MULTIPLICATION TABLE

### AIM

    Write a program to display multiplication table of a given number

### PROGRAM

activity_main.xml

```xml
  <EditText
        android:id="@+id/number"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:hint="Enter the number: "/>
    <EditText
        android:id="@+id/limit"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:hint="Enter the limit"/>
    <Button
        android:id="@+id/btn"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Show Multiplication Table"/>
    <TextView
        android:id="@+id/result"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"/>
```



MainActivity.java

```java
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

```
