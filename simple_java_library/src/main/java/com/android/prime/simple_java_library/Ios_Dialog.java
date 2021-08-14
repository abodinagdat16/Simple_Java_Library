package com.android.prime.simple_java_library;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.TextView;

public class Ios_Dialog {
    public static void NewIosDialogShow(Context context, String name_title , String title){
        Dialog  IosDialog = new Dialog( context);
       IosDialog.getWindow().setBackgroundDrawable( new ColorDrawable( Color.TRANSPARENT ) );
        IosDialog.setContentView( R.layout.ios_dialog );
        TextView nametitle = IosDialog.findViewById( R.id.name_title );
        TextView titled = IosDialog.findViewById( R.id.title );
        TextView dimess= IosDialog.findViewById( R.id.dimess);
        dimess.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IosDialog.show();
            }
        } );

        nametitle.setText( name_title );
        titled.setText( title );
        IosDialog.show();

    }
}
