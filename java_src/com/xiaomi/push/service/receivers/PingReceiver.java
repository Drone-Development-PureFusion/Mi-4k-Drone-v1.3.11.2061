package com.xiaomi.push.service.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.push.service.AbstractC10621am;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.timers.C10694a;
/* loaded from: classes.dex */
public class PingReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        C10694a.m4085a(false);
        AbstractC10404b.m5265c(intent.getPackage() + " is the package name");
        if (!AbstractC10621am.f33040o.equals(intent.getAction())) {
            AbstractC10404b.m5269a("cancel the old ping timer");
            C10694a.m4087a();
        } else if (!TextUtils.equals(context.getPackageName(), intent.getPackage())) {
        } else {
            AbstractC10404b.m5265c("Ping XMChannelService on timer");
            try {
                Intent intent2 = new Intent(context, XMPushService.class);
                intent2.putExtra("time_stamp", System.currentTimeMillis());
                intent2.setAction("com.xiaomi.push.timer");
                context.startService(intent2);
            } catch (Exception e) {
                AbstractC10404b.m5267a(e);
            }
        }
    }
}
