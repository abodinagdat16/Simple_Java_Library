package com.android.prime.simple_java_library;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Exit_Ios_Dialog extends Activity {


    public static void NewIosDialogShow(Context context, String name_title , String title,String Yes,String NO){
        Dialog  IosDialog = new Dialog( context);
       IosDialog.getWindow().setBackgroundDrawable( new ColorDrawable( Color.TRANSPARENT ) );
        IosDialog.setContentView( R.layout.ios_dialog );
        TextView nametitle = IosDialog.findViewById( R.id.textview1);
        TextView titled = IosDialog.findViewById( R.id.textview2 );
        TextView no_btn = IosDialog.findViewById( R.id.textview4 );
        no_btn.setText( NO );

        TextView yes_btn = IosDialog.findViewById( R.id.textview3 );
        yes_btn.setText( Yes );
        LinearLayout yes= IosDialog.findViewById( R.id.linear5);
        yes.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Activity activity = (Activity) context;
                activity.finish();
            }
        } );
        LinearLayout no= IosDialog.findViewById( R.id.linear3);
        no.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IosDialog.dismiss();
            }
        } );

        nametitle.setText( name_title );
        titled.setText( title );

        IosDialog.show();

    }



}
