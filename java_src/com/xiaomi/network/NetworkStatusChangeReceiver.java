package com.xiaomi.network;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.channel.commonutils.network.C10423d;
/* loaded from: classes2.dex */
public class NetworkStatusChangeReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (C10423d.m5211f(context)) {
            try {
                context.startService(new Intent(context, HostRefreshService.class));
            } catch (Exception e) {
                AbstractC10404b.m5267a(e);
            }
        }
    }
}
