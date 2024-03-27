package com.example.libraryproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.toasterlibrary.ToasterMsg;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToasterMsg.toaster(this
        ,"hi");
    }
}