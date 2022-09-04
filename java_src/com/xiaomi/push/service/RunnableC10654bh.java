package com.xiaomi.push.service;

import android.content.Context;
import android.content.Intent;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.push.service.module.C10678b;
import java.util.Iterator;
/* renamed from: com.xiaomi.push.service.bh */
/* loaded from: classes.dex */
class RunnableC10654bh implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f33111a;

    /* renamed from: b */
    final /* synthetic */ String f33112b;

    /* renamed from: c */
    final /* synthetic */ String f33113c;

    /* renamed from: d */
    final /* synthetic */ C10653bg f33114d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC10654bh(C10653bg c10653bg, Context context, String str, String str2) {
        this.f33114d = c10653bg;
        this.f33111a = context;
        this.f33112b = str;
        this.f33113c = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        Iterator<C10678b> it2 = C10664g.m4257a(this.f33111a).m4252c(this.f33112b).iterator();
        while (it2.hasNext()) {
            C10678b next = it2.next();
            if (XMPushService.m4498a(next.m4156e(), this.f33113c)) {
                if (next.m4165a() >= System.currentTimeMillis()) {
                    byte[] m4157d = next.m4157d();
                    if (m4157d == null) {
                        AbstractC10404b.m5269a("Geo canBeShownMessage content null");
                    } else {
                        Intent m4094a = C10692s.m4094a(m4157d, System.currentTimeMillis());
                        if (m4094a == null) {
                            AbstractC10404b.m5269a("Geo canBeShownMessage intent null");
                        } else {
                            C10692s.m4099a(this.f33114d.f33110a, (String) null, m4157d, m4094a, true);
                            if (C10664g.m4257a(this.f33114d.f33110a).m4255a(next.m4160b()) == 0) {
                                AbstractC10404b.m5269a("show some exit geofence message. then remove this message failed. message_id:" + next.m4160b());
                            }
                        }
                    }
                } else if (C10664g.m4257a(this.f33111a).m4255a(next.m4160b()) == 0) {
                    AbstractC10404b.m5269a("XMPushService remove some geofence message failed. message_id:" + next.m4160b());
                }
            }
        }
    }
}
