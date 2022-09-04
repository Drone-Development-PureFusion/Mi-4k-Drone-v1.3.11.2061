package com.xiaomi.push.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.smack.util.C10750e;
import org.p286a.p287a.C11086e;
/* renamed from: com.xiaomi.push.service.bg */
/* loaded from: classes.dex */
class C10653bg extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ XMPushService f33110a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10653bg(XMPushService xMPushService) {
        this.f33110a = xMPushService;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        boolean m4479a;
        if (intent.getAction().equals("com.xiaomi.metok.geofencing.state_change")) {
            String stringExtra = intent.getStringExtra(C11086e.f35686H);
            String stringExtra2 = intent.getStringExtra("Describe");
            String stringExtra3 = intent.getStringExtra("State");
            if (TextUtils.isEmpty(stringExtra2)) {
                return;
            }
            m4479a = this.f33110a.m4479a(stringExtra3, stringExtra2, context);
            if (!m4479a) {
                stringExtra3 = "Unknown";
                AbstractC10404b.m5269a(" updated geofence statue about geo_id:" + stringExtra2 + " falied. current_statue:" + stringExtra3);
            }
            C10750e.m3831a(new RunnableC10654bh(this, context, stringExtra2, stringExtra3));
            AbstractC10404b.m5265c("ownresilt结果:state= " + stringExtra3 + "\n describe=" + stringExtra2 + "\n location=" + stringExtra);
        }
    }
}
