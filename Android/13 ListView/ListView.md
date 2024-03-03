## 13                        ListView

### AIM
    To write a Program to display the items in a list

### PROGRAM

activity_main.xml

```xml

    <Button
        android:id="@+id/btn"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:baselineAligned="false"
        android:text="Close App" />

```


MainActivity.java

```java


public class MainActivity extends AppCompatActivity {
    ListView list;
    String[] listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView) findViewById(R.id.list);
        listItems = getResources().getStringArray(R.array.friends);

        ArrayAdapter adapter = new ArrayAdapter(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                listItems
        );
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "You have selected "+ adapter.getItem(i), Toast.LENGTH_SHORT).show();
            }
        });
    }
}

```

strings.xml

```xml

<resources>
    <string name="app_name">List View</string>
    <string-array name="friends">
        <item>Akash</item>
        <item>Midhun</item>
        <item>Vishnu</item>
    </string-array>
</resources>
```