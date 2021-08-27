package com.android.prime.simple_java_library;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class NightToast {


    public static Toast show(Context context,String message,int duration){

        Toast toast = new Toast(context);
        toast.setDuration(duration);
        View layout = LayoutInflater.from(context).inflate(R.layout.night_toast, null, false);
        TextView l1 = (TextView) layout.findViewById(R.id.massage);
        LinearLayout linearLayout=(LinearLayout) layout.findViewById( R.id.linear);
        ImageView img=(ImageView) layout.findViewById(R.id.image);
        l1.setText(message);
        linearLayout.setBackgroundResource(R.drawable.toast_night);
        toast.setView(layout);
        toast.show();
        return toast;
    }



}
