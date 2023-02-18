package com.example.a24e1;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Set;

public class MainActivity extends AppCompatActivity {
    private BluetoothAdapter ba;
    private Set<BluetoothAdapter> pairedDevices;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.lv);
        ba = BluetoothAdapter.getDefaultAdapter();
    }

    public void on(View view) {
        if(!ba.isEnabled()){
            Intent i = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            startActivityForResult(i,0);
            Toast.makeText(this, "Turned on", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Already on", Toast.LENGTH_SHORT).show();
        }
    }

    public void visible(View view) {
        Intent gv = new Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);
        startActivityForResult(gv,0);
    }


    public void list(View view) {
    }

    public void off(View view) {
    }
}