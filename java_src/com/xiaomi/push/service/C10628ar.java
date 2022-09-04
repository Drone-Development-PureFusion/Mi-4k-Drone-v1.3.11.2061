package com.xiaomi.push.service;

import com.tencent.p263mm.sdk.platformtools.LocaleUtil;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.mistatistic.sdk.MiStatInterface;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.stats.C10761f;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.push.service.ar */
/* loaded from: classes.dex */
public class C10628ar {

    /* renamed from: e */
    private static int f33063e = 300000;

    /* renamed from: a */
    private XMPushService f33064a;

    /* renamed from: d */
    private int f33067d = 0;

    /* renamed from: b */
    private int f33065b = 500;

    /* renamed from: c */
    private long f33066c = 0;

    public C10628ar(XMPushService xMPushService) {
        this.f33064a = xMPushService;
    }

    /* renamed from: b */
    private int m4341b() {
        if (this.f33067d > 8) {
            return 300000;
        }
        if (this.f33067d > 4) {
            return 60000;
        }
        if (this.f33067d > 1) {
            return 10000;
        }
        if (this.f33066c == 0) {
            return 0;
        }
        if (System.currentTimeMillis() - this.f33066c >= MiStatInterface.MIN_UPLOAD_INTERVAL) {
            this.f33065b = 500;
            return 0;
        } else if (this.f33065b >= f33063e) {
            return this.f33065b;
        } else {
            int i = this.f33065b;
            this.f33065b = (int) (this.f33065b * 1.5d);
            return i;
        }
    }

    /* renamed from: a */
    public void m4343a() {
        this.f33066c = System.currentTimeMillis();
        this.f33064a.m4500a(1);
        this.f33067d = 0;
    }

    /* renamed from: a */
    public void m4342a(boolean z) {
        if (!this.f33064a.m4473b()) {
            AbstractC10404b.m5265c("should not reconnect as no client or network.");
        } else if (z) {
            if (!this.f33064a.m4472b(1)) {
                this.f33067d++;
            }
            this.f33064a.m4500a(1);
            XMPushService xMPushService = this.f33064a;
            XMPushService xMPushService2 = this.f33064a;
            xMPushService2.getClass();
            xMPushService.m4494a(new XMPushService.C10588d());
        } else if (this.f33064a.m4472b(1)) {
        } else {
            int m4341b = m4341b();
            if (!this.f33064a.m4472b(1)) {
                this.f33067d++;
            }
            AbstractC10404b.m5269a("schedule reconnect in " + m4341b + LocaleUtil.MALAY);
            XMPushService xMPushService3 = this.f33064a;
            XMPushService xMPushService4 = this.f33064a;
            xMPushService4.getClass();
            xMPushService3.m4493a(new XMPushService.C10588d(), m4341b);
            if (this.f33067d == 2 && C10761f.m3796a().m3789c()) {
                C10607ae.m4405b();
            }
            if (this.f33067d != 3) {
                return;
            }
            C10607ae.m4408a();
        }
    }
}
