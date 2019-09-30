package com.lxkj.store.Util;

import android.content.Context;
import android.os.Looper;
import android.widget.Toast;

/**
 * kylin on 2016-6-20.
 */
public class MUIToast {

    private static Toast toast;

    public static  void toast(Context context, int msg){
        //Toast.makeText(context,msg, Toast.LENGTH_SHORT).show();
        Looper.prepare();
        if (toast == null) {
            toast = Toast.makeText(context,msg,
                    Toast.LENGTH_SHORT);
        } else {
            toast.setText(context.getResources().getString(msg)+"");
        }
        toast.show();
        Looper.loop();
    }

    public static  void show(Context context, String msg){
        //Toast.makeText(context,msg, Toast.LENGTH_SHORT).show();
        if (toast == null) {
            toast = Toast.makeText(context,
                    msg,
                    Toast.LENGTH_SHORT);
        } else {
            toast.setText(msg);
        }
        toast.show();
    }

    public static  void showInNet(Context context, String msg){
        Looper.prepare();
        if (toast == null) {
            toast = Toast.makeText(context,
                    msg,
                    Toast.LENGTH_SHORT);
        } else {
            toast.setText(msg);
        }
        toast.show();
        Looper.loop();
    }
}
