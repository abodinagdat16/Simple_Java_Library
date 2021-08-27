package com.android.prime.myapplication;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;

import com.android.prime.simple_java_library.Exit_Ios_Dialog;
import com.android.prime.simple_java_library.NightToast;
import com.android.prime.simple_java_library.massage;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );


        NightToast.show( getApplicationContext(), "Hello World !" , Gravity.TOP );
    }

    @Override
    public void onBackPressed() {
        Exit_Ios_Dialog.NewIosDialogShow( MainActivity.this, "تنويه", "هل تريد خروج من تطبيق", "نعم", "لا" );

        super.onBackPressed();
    }
}

