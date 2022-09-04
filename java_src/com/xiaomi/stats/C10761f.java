package com.xiaomi.stats;

import com.xiaomi.channel.commonutils.android.C10394e;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.channel.commonutils.network.C10423d;
import com.xiaomi.channel.commonutils.stats.C10428a;
import com.xiaomi.push.service.C10630at;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.thrift.C10705b;
import com.xiaomi.push.thrift.C10707c;
import com.xiaomi.push.thrift.EnumC10704a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import org.p286a.p321b.C11392f;
import org.p286a.p321b.p323b.AbstractC11376e;
import org.p286a.p321b.p323b.C11382k;
import org.p286a.p321b.p324c.C11386b;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.xiaomi.stats.f */
/* loaded from: classes.dex */
public class C10761f {

    /* renamed from: a */
    private String f33592a;

    /* renamed from: c */
    private int f33594c;

    /* renamed from: d */
    private long f33595d;

    /* renamed from: e */
    private C10760e f33596e;

    /* renamed from: b */
    private boolean f33593b = false;

    /* renamed from: f */
    private C10428a f33597f = C10428a.m5193a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.xiaomi.stats.f$a */
    /* loaded from: classes2.dex */
    public static class C10762a {

        /* renamed from: a */
        static final C10761f f33598a = new C10761f();
    }

    /* renamed from: a */
    private C10705b m3794a(C10428a.C10429a c10429a) {
        if (c10429a.f32382a == 0) {
            if (!(c10429a.f32384c instanceof C10705b)) {
                return null;
            }
            return (C10705b) c10429a.f32384c;
        }
        C10705b m3786f = m3786f();
        m3786f.m4073a(EnumC10704a.CHANNEL_STATS_COUNTER.m4077a());
        m3786f.m4063c(c10429a.f32382a);
        m3786f.m4062c(c10429a.f32383b);
        return m3786f;
    }

    /* renamed from: a */
    public static C10761f m3796a() {
        return C10762a.f33598a;
    }

    /* renamed from: b */
    private C10707c m3790b(int i) {
        ArrayList arrayList = new ArrayList();
        C10707c c10707c = new C10707c(this.f33592a, arrayList);
        if (!C10423d.m5211f(this.f33596e.f33581a)) {
            c10707c.m4043a(C10394e.m5307f(this.f33596e.f33581a));
        }
        C11386b c11386b = new C11386b(i);
        AbstractC11376e mo1221a = new C11382k.C11383a().mo1221a(c11386b);
        try {
            c10707c.mo1285b(mo1221a);
        } catch (C11392f e) {
        }
        LinkedList<C10428a.C10429a> m5190c = this.f33597f.m5190c();
        while (m5190c.size() > 0) {
            try {
                C10705b m3794a = m3794a(m5190c.getLast());
                if (m3794a != null) {
                    m3794a.mo1285b(mo1221a);
                }
                if (c11386b.m1220B_() > i) {
                    break;
                }
                if (m3794a != null) {
                    arrayList.add(m3794a);
                }
                m5190c.removeLast();
            } catch (NoSuchElementException e2) {
            } catch (C11392f e3) {
            }
        }
        return c10707c;
    }

    /* renamed from: b */
    public static C10760e m3791b() {
        C10760e c10760e;
        synchronized (C10762a.f33598a) {
            c10760e = C10762a.f33598a.f33596e;
        }
        return c10760e;
    }

    /* renamed from: g */
    private void m3785g() {
        if (!this.f33593b || System.currentTimeMillis() - this.f33595d <= this.f33594c) {
            return;
        }
        this.f33593b = false;
        this.f33595d = 0L;
    }

    /* renamed from: a */
    public void m3795a(int i) {
        int i2 = C0494h.f707aa;
        if (i > 0) {
            int i3 = i * 1000;
            if (i3 <= 604800000) {
                i2 = i3;
            }
            if (this.f33594c == i2 && this.f33593b) {
                return;
            }
            this.f33593b = true;
            this.f33595d = System.currentTimeMillis();
            this.f33594c = i2;
            AbstractC10404b.m5265c("enable dot duration = " + i2 + " start = " + this.f33595d);
        }
    }

    /* renamed from: a */
    public synchronized void m3793a(XMPushService xMPushService) {
        this.f33596e = new C10760e(xMPushService);
        this.f33592a = "";
        C10630at.m4340a().m4338a(new C10763g(this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void m3792a(C10705b c10705b) {
        this.f33597f.m5192a(c10705b);
    }

    /* renamed from: c */
    public boolean m3789c() {
        return this.f33593b;
    }

    /* renamed from: d */
    boolean m3788d() {
        m3785g();
        return this.f33593b && this.f33597f.m5191b() > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized C10707c m3787e() {
        C10707c c10707c;
        c10707c = null;
        if (m3788d()) {
            int i = 750;
            if (!C10423d.m5211f(this.f33596e.f33581a)) {
                i = 375;
            }
            c10707c = m3790b(i);
        }
        return c10707c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public synchronized C10705b m3786f() {
        C10705b c10705b;
        c10705b = new C10705b();
        c10705b.m4071a(C10423d.m5206k(this.f33596e.f33581a));
        c10705b.f33332a = (byte) 0;
        c10705b.f33334c = 1;
        c10705b.m4059d((int) (System.currentTimeMillis() / 1000));
        if (this.f33596e.f33582b != null) {
            c10705b.m4055e(this.f33596e.f33582b.m3977f());
        }
        return c10705b;
    }
}
