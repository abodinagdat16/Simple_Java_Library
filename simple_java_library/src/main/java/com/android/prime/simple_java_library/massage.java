package com.android.prime.simple_java_library;

import android.content.Context;

import android.widget.Toast;

public class massage {
    public static void show(Context c, String msg){
        Toast.makeText( c.getApplicationContext() , msg, Toast.LENGTH_SHORT ).show();
    }


}
