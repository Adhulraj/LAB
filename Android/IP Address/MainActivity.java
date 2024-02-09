package com.example.ipaddress;

import androidx.appcompat.app.AppCompatActivity;

import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.text.format.Formatter;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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