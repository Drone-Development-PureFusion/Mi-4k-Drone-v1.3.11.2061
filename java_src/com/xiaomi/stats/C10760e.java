package com.xiaomi.stats;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.channel.commonutils.network.C10423d;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.thrift.C10705b;
import com.xiaomi.push.thrift.EnumC10704a;
import com.xiaomi.smack.AbstractC10716a;
import com.xiaomi.smack.AbstractC10720d;
import com.xiaomi.smack.C10725g;
/* renamed from: com.xiaomi.stats.e */
/* loaded from: classes.dex */
public class C10760e implements AbstractC10720d {

    /* renamed from: a */
    XMPushService f33581a;

    /* renamed from: b */
    AbstractC10716a f33582b;

    /* renamed from: c */
    private int f33583c;

    /* renamed from: d */
    private Exception f33584d;

    /* renamed from: e */
    private String f33585e;

    /* renamed from: f */
    private long f33586f = 0;

    /* renamed from: g */
    private long f33587g = 0;

    /* renamed from: h */
    private long f33588h = 0;

    /* renamed from: i */
    private long f33589i = 0;

    /* renamed from: j */
    private long f33590j;

    /* renamed from: k */
    private long f33591k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10760e(XMPushService xMPushService) {
        this.f33590j = 0L;
        this.f33591k = 0L;
        this.f33581a = xMPushService;
        this.f33585e = C10423d.m5206k(xMPushService);
        m3798c();
        int myUid = Process.myUid();
        this.f33591k = TrafficStats.getUidRxBytes(myUid);
        this.f33590j = TrafficStats.getUidTxBytes(myUid);
    }

    /* renamed from: c */
    private void m3798c() {
        this.f33587g = 0L;
        this.f33589i = 0L;
        this.f33586f = 0L;
        this.f33588h = 0L;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (C10423d.m5213d(this.f33581a)) {
            this.f33586f = elapsedRealtime;
        }
        if (this.f33581a.m4457f()) {
            this.f33588h = elapsedRealtime;
        }
    }

    /* renamed from: d */
    private synchronized void m3797d() {
        AbstractC10404b.m5265c("stat connpt = " + this.f33585e + " netDuration = " + this.f33587g + " ChannelDuration = " + this.f33589i + " channelConnectedTime = " + this.f33588h);
        C10705b c10705b = new C10705b();
        c10705b.f33332a = (byte) 0;
        c10705b.m4073a(EnumC10704a.CHANNEL_ONLINE_RATE.m4077a());
        c10705b.m4071a(this.f33585e);
        c10705b.m4059d((int) (System.currentTimeMillis() / 1000));
        c10705b.m4068b((int) (this.f33587g / 1000));
        c10705b.m4063c((int) (this.f33589i / 1000));
        C10761f.m3796a().m3792a(c10705b);
        m3798c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Exception m3804a() {
        return this.f33584d;
    }

    @Override // com.xiaomi.smack.AbstractC10720d
    /* renamed from: a */
    public void mo3803a(AbstractC10716a abstractC10716a) {
        m3800b();
        this.f33588h = SystemClock.elapsedRealtime();
        C10764h.m3779a(0, EnumC10704a.CONN_SUCCESS.m4077a(), abstractC10716a.mo3931d(), abstractC10716a.m3971l());
    }

    @Override // com.xiaomi.smack.AbstractC10720d
    /* renamed from: a */
    public void mo3802a(AbstractC10716a abstractC10716a, int i, Exception exc) {
        if (this.f33583c == 0 && this.f33584d == null) {
            this.f33583c = i;
            this.f33584d = exc;
            C10764h.m3774b(abstractC10716a.mo3931d(), exc);
        }
        if (i == 22 && this.f33588h != 0) {
            long m3976g = abstractC10716a.m3976g() - this.f33588h;
            if (m3976g < 0) {
                m3976g = 0;
            }
            this.f33589i = m3976g + (C10725g.m3946c() / 2) + this.f33589i;
            this.f33588h = 0L;
        }
        m3800b();
        int myUid = Process.myUid();
        long uidRxBytes = TrafficStats.getUidRxBytes(myUid);
        long uidTxBytes = TrafficStats.getUidTxBytes(myUid);
        AbstractC10404b.m5265c("Stats rx=" + (uidRxBytes - this.f33591k) + ", tx=" + (uidTxBytes - this.f33590j));
        this.f33591k = uidRxBytes;
        this.f33590j = uidTxBytes;
    }

    @Override // com.xiaomi.smack.AbstractC10720d
    /* renamed from: a */
    public void mo3801a(AbstractC10716a abstractC10716a, Exception exc) {
        C10764h.m3780a(0, EnumC10704a.CHANNEL_CON_FAIL.m4077a(), 1, abstractC10716a.mo3931d(), C10423d.m5213d(this.f33581a) ? 1 : 0);
        m3800b();
    }

    /* renamed from: b */
    public synchronized void m3800b() {
        if (this.f33581a != null) {
            String m5206k = C10423d.m5206k(this.f33581a);
            boolean m5213d = C10423d.m5213d(this.f33581a);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f33586f > 0) {
                this.f33587g += elapsedRealtime - this.f33586f;
                this.f33586f = 0L;
            }
            if (this.f33588h != 0) {
                this.f33589i += elapsedRealtime - this.f33588h;
                this.f33588h = 0L;
            }
            if (m5213d) {
                if ((!TextUtils.equals(this.f33585e, m5206k) && this.f33587g > NotificationOptions.f16268b) || this.f33587g > 5400000) {
                    m3797d();
                }
                this.f33585e = m5206k;
                if (this.f33586f == 0) {
                    this.f33586f = elapsedRealtime;
                }
                if (this.f33581a.m4457f()) {
                    this.f33588h = elapsedRealtime;
                }
            }
        }
    }

    @Override // com.xiaomi.smack.AbstractC10720d
    /* renamed from: b */
    public void mo3799b(AbstractC10716a abstractC10716a) {
        this.f33583c = 0;
        this.f33584d = null;
        this.f33582b = abstractC10716a;
        C10764h.m3781a(0, EnumC10704a.CONN_SUCCESS.m4077a());
    }
}
