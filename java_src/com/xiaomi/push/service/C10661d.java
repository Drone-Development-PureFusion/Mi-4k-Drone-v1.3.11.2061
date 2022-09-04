package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.channel.commonutils.misc.C10410f;
import com.xiaomi.push.service.module.C10678b;
import java.util.Iterator;
/* renamed from: com.xiaomi.push.service.d */
/* loaded from: classes.dex */
public class C10661d extends C10410f.AbstractRunnableC10411a {

    /* renamed from: a */
    private XMPushService f33126a;

    public C10661d(XMPushService xMPushService) {
        this.f33126a = xMPushService;
    }

    @Override // com.xiaomi.channel.commonutils.misc.C10410f.AbstractRunnableC10411a
    /* renamed from: a */
    public int mo4276a() {
        return 15;
    }

    @Override // java.lang.Runnable
    public void run() {
        Iterator<C10678b> it2 = C10664g.m4257a(this.f33126a).m4258a().iterator();
        while (it2.hasNext()) {
            C10678b next = it2.next();
            if (next.m4165a() < System.currentTimeMillis()) {
                if (C10664g.m4257a(this.f33126a).m4255a(next.m4160b()) == 0) {
                    AbstractC10404b.m5269a("GeofenceDbCleaner delete a geofence message failed message_id:" + next.m4160b());
                }
                C10692s.m4101a(this.f33126a, C10692s.m4095a(next.m4157d()), false, false, true);
            }
        }
    }
}
