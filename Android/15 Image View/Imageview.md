##        IMAGE VIEW
### AIM

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

    <ImageView
        android:id="@+id/img1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:src="@drawable/img_1" />

    <ImageView
        android:id="@+id/img2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:src="@drawable/img_2"/>

    <ImageView
        android:id="@+id/img3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:src="@drawable/img_3"/>



</LinearLayout>
```