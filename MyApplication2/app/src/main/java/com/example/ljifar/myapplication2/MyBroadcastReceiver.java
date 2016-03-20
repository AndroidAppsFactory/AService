package com.example.ljifar.myapplication2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by ljifar on 01/03/2016.
 */
public class MyBroadcastReceiver extends BroadcastReceiver {

    //private static final String MY_LOG_TAG = "MY_LOG_TAG";

    @Override
    public void onReceive(Context context, Intent intent) {
        //Log.i(MY_LOG_TAG, "Call Placed" + intent.getDataString());
        Toast.makeText(context, "Intent Detected.", Toast.LENGTH_LONG).show();
    }
}
