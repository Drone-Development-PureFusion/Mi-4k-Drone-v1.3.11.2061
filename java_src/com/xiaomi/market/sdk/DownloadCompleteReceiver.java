package com.xiaomi.market.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
/* loaded from: classes.dex */
public class DownloadCompleteReceiver extends BroadcastReceiver {
    private static final String TAG = "MarketSDKDownloadReceiver";

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.DOWNLOAD_COMPLETE".equals(intent.getAction())) {
            long longExtra = intent.getLongExtra("extra_download_id", -1L);
            Log.d(TAG, "on sdk download complete : id = " + longExtra);
            if (longExtra == -1) {
                return;
            }
            C10448m.m5094i(context).m5107a(longExtra);
        }
    }
}
