package com.xgxzatx.ardudroid.connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class ConnectivityReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.w(ConnectivityReceiver.class.getSimpleName(), "action: "
                + intent.getAction());
    }

}