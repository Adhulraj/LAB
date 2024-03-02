## 01                        SPINNER

### AIM
    To write a program to spin the four items

### PROGRAM

activity_main.xml
```xml

    <EditText
        android:id="@+id/editText"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:hint="TYpe Elements" />

    <Button
        android:id="@+id/btn"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:baselineAligned="false"
        android:text="Add" />

    <Spinner
        android:id="@+id/spinner"
        android:layout_width="wrap_content"
        android:layout_height="43dp" />
```

MainActivity.java
```java


public class MainActivity extends AppCompatActivity {

    EditText editText;
    Spinner spinner;
    Button btn;
    String[] spinnerItems = {"ANDROID", "PHP"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
        spinner = (Spinner) findViewById(R.id.spinner);
        btn = (Button) findViewById(R.id.btn);

        List stringList = new ArrayList(Arrays.asList(spinnerItems));
        ArrayAdapter adapter = new ArrayAdapter(
                MainActivity.this,
                android.R.layout.simple_spinner_item,
                stringList
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getText = editText.getText().toString();
                stringList.add(getText);
                adapter.notifyDataSetChanged();
                    Toast.makeText(MainActivity.this, "Item Added", Toast.LENGTH_LONG).show();
            }
        });
    }
}

```
