package com.android.prime.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.android.prime.simple_java_library.massage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        massage.show( getApplicationContext(),"hello" );
    }
}