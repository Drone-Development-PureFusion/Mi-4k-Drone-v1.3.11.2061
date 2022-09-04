package com.xiaomi.push.service.receivers;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.channel.commonutils.network.C10423d;
import com.xiaomi.mipush.sdk.C10469a;
import com.xiaomi.mipush.sdk.C10489p;
import com.xiaomi.mipush.sdk.C10494u;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xiaomi.push.service.C10636aw;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class NetworkStatusReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static int f33227a = 1;

    /* renamed from: b */
    private static int f33228b = 1;

    /* renamed from: c */
    private static int f33229c = 2;

    /* renamed from: d */
    private static BlockingQueue<Runnable> f33230d = new LinkedBlockingQueue();

    /* renamed from: e */
    private static ThreadPoolExecutor f33231e = new ThreadPoolExecutor(f33227a, f33228b, f33229c, TimeUnit.SECONDS, f33230d);

    /* renamed from: f */
    private static boolean f33232f = false;

    /* renamed from: g */
    private boolean f33233g;

    public NetworkStatusReceiver() {
        this.f33233g = false;
        this.f33233g = true;
    }

    public NetworkStatusReceiver(Object obj) {
        this.f33233g = false;
        f33232f = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m4113a(Context context) {
        if (!C10494u.m4943a(context).m4923c() && C10469a.m5034a(context).m5020i() && !C10469a.m5034a(context).m5015n()) {
            try {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(context, "com.xiaomi.push.service.XMPushService"));
                intent.setAction("com.xiaomi.push.network_status_changed");
                context.startService(intent);
            } catch (Exception e) {
                AbstractC10404b.m5267a(e);
            }
        }
        if (C10423d.m5213d(context) && C10494u.m4943a(context).m4919g()) {
            C10494u.m4943a(context).m4922d();
            C10636aw.m4319a().m4305b("NewWork Changed");
        }
        if (C10423d.m5213d(context)) {
            if ("disable_syncing".equals(C10489p.m4970a(context).m4971a())) {
                MiPushClient.disablePush(context);
            }
            if (!"enable_syncing".equals(C10489p.m4970a(context).m4971a())) {
                return;
            }
            MiPushClient.enablePush(context);
        }
    }

    /* renamed from: a */
    public static boolean m4114a() {
        return f33232f;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.f33233g) {
            return;
        }
        f33231e.execute(new RunnableC10691a(this, context));
    }
}
