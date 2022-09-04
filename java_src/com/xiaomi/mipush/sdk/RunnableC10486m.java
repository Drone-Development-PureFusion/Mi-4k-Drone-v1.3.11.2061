package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.channel.commonutils.android.C10394e;
import com.xiaomi.channel.commonutils.string.C10433d;
import com.xiaomi.xmpush.thrift.C10775ae;
import com.xiaomi.xmpush.thrift.EnumC10766a;
import java.util.HashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.mipush.sdk.m */
/* loaded from: classes2.dex */
public final class RunnableC10486m implements Runnable {
    @Override // java.lang.Runnable
    public void run() {
        Context context;
        Context context2;
        Context context3;
        Context context4;
        context = MiPushClient.sContext;
        if (C10394e.m5310c(context) != null) {
            C10775ae c10775ae = new C10775ae();
            context2 = MiPushClient.sContext;
            c10775ae.m3698b(C10469a.m5034a(context2).m5026c());
            c10775ae.m3695c("client_info_update");
            c10775ae.m3706a(MiPushClient.generatePacketID());
            c10775ae.m3703a(new HashMap());
            Map<String, String> m3688i = c10775ae.m3688i();
            context3 = MiPushClient.sContext;
            m3688i.put(Constants.EXTRA_KEY_IMEI_MD5, C10433d.m5176a(C10394e.m5310c(context3)));
            int m5312b = C10394e.m5312b();
            if (m5312b >= 0) {
                c10775ae.m3688i().put("space_id", Integer.toString(m5312b));
            }
            context4 = MiPushClient.sContext;
            C10494u.m4943a(context4).m4932a(c10775ae, EnumC10766a.Notification, false, null);
        }
    }
}
