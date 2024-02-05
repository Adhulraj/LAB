##  03          HELLO WORLD
### AIM
    To write a program to toast a message
### PROGRAM

activity_main.xml
```xml

<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context=".MainActivity" >


    <TextView
        android:id="@+id/textVeiw"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello World !" />

</LinearLayout>
```

MainActivity.java
```java

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "Hello World", Toast.LENGTH_SHORT).show();
    }
}
```