## RADIO BUTTON

### AIM

    Write a Program to select gender using radio button

### PROGRAM

activity_main.xml

```xml
    <RadioGroup
        android:id="@+id/rgp"
        android:layout_width="match_parent"
        android:layout_height="191dp">
        <RadioButton
            android:id="@+id/rbm"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Male"/>
        <RadioButton
            android:id="@+id/rbf"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Female"/>
        <RadioButton
            android:id="@+id/rbo"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Others"/>


    </RadioGroup>
    <Button
        android:id="@+id/btn"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Submit"/>

```

MainActivity.java

```java
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

```
