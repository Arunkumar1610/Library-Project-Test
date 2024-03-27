package com.example.toasterlibrary;

import android.content.Context;
import android.widget.Toast;

public class ToasterMsg {

    public void toaster(Context c, String s){
        Toast.makeText(c, s, Toast.LENGTH_SHORT).show();
    }
}
