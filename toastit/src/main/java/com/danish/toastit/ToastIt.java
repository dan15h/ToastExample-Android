package com.danish.toastit;

import android.content.Context;
import android.widget.Toast;

public class ToastIt {

    static public void shortToast(Context context, String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }

    static public void longToast(Context context, String msg){
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
    }

}
