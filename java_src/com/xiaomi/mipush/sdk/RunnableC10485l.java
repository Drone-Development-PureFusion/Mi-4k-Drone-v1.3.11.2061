package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.push.service.module.C10679c;
import com.xiaomi.push.service.module.C10680d;
import com.xiaomi.push.service.module.EnumC10683e;
import java.lang.reflect.Method;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.mipush.sdk.l */
/* loaded from: classes2.dex */
public final class RunnableC10485l implements Runnable {
    @Override // java.lang.Runnable
    public void run() {
        Context context;
        Context context2;
        context = MiPushClient.sContext;
        C10679c m4150a = C10680d.m4152a(context).m4150a(EnumC10683e.MODULE_CDATA);
        if (m4150a != null) {
            try {
                Method method = m4150a.m4155a().loadClass("com.xiaomi.push.mpcd.MpcdPlugin").getMethod("main", Context.class);
                context2 = MiPushClient.sContext;
                method.invoke(null, context2);
            } catch (Exception e) {
                AbstractC10404b.m5269a("plugin load fail");
            }
        }
    }
}
