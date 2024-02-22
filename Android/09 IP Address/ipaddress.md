## IP ADDRESS

### AIM

   9. Write a program to Get IP Address of the device

### PROGRAM

activity_main.xml

```xml
    <Button
        android:id="@+id/btn"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Get IP Address"/>

    <TextView
        android:id="@+id/ipview"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        />
```

MainActivity.java

```java


public class MainActivity extends AppCompatActivity {
    TextView ipView;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ipView = (TextView) findViewById(R.id.ipview);
        btn = (Button) findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WifiManager WM = (WifiManager) getApplicationContext().getSystemService(WIFI_SERVICE);
                String ipAddress = Formatter.formatIpAddress(WM.getConnectionInfo().getIpAddress());
                ipView.setText("Your IP Address is " + ipAddress);
            }
        });
    }
}
```
