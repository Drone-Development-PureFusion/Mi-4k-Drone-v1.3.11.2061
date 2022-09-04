package com.xiaomi.stats;

import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.push.service.C10615ak;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.thrift.C10705b;
import com.xiaomi.push.thrift.C10707c;
import com.xiaomi.push.thrift.EnumC10704a;
import com.xiaomi.stats.C10758d;
import com.xiaomi.xmpush.thrift.C10799aq;
import java.util.Hashtable;
/* renamed from: com.xiaomi.stats.h */
/* loaded from: classes.dex */
public class C10764h {

    /* renamed from: a */
    private static final int f33600a = EnumC10704a.PING_RTT.m4077a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.xiaomi.stats.h$a */
    /* loaded from: classes2.dex */
    public static class C10765a {

        /* renamed from: a */
        static Hashtable<Integer, Long> f33601a = new Hashtable<>();
    }

    /* renamed from: a */
    public static void m3783a() {
        m3781a(0, f33600a);
    }

    /* renamed from: a */
    public static void m3782a(int i) {
        C10705b m3786f = C10761f.m3796a().m3786f();
        m3786f.m4073a(EnumC10704a.CHANNEL_STATS_COUNTER.m4077a());
        m3786f.m4063c(i);
        C10761f.m3796a().m3792a(m3786f);
    }

    /* renamed from: a */
    public static synchronized void m3781a(int i, int i2) {
        synchronized (C10764h.class) {
            if (i2 < 16777215) {
                C10765a.f33601a.put(Integer.valueOf((i << 24) | i2), Long.valueOf(System.currentTimeMillis()));
            } else {
                AbstractC10404b.m5264d("stats key should less than 16777215");
            }
        }
    }

    /* renamed from: a */
    public static void m3780a(int i, int i2, int i3, String str, int i4) {
        C10705b m3786f = C10761f.m3796a().m3786f();
        m3786f.m4074a((byte) i);
        m3786f.m4073a(i2);
        m3786f.m4068b(i3);
        m3786f.m4066b(str);
        m3786f.m4063c(i4);
        C10761f.m3796a().m3792a(m3786f);
    }

    /* renamed from: a */
    public static synchronized void m3779a(int i, int i2, String str, int i3) {
        synchronized (C10764h.class) {
            long currentTimeMillis = System.currentTimeMillis();
            int i4 = (i << 24) | i2;
            if (C10765a.f33601a.containsKey(Integer.valueOf(i4))) {
                C10705b m3786f = C10761f.m3796a().m3786f();
                m3786f.m4073a(i2);
                m3786f.m4068b((int) (currentTimeMillis - C10765a.f33601a.get(Integer.valueOf(i4)).longValue()));
                m3786f.m4066b(str);
                if (i3 > -1) {
                    m3786f.m4063c(i3);
                }
                C10761f.m3796a().m3792a(m3786f);
                C10765a.f33601a.remove(Integer.valueOf(i2));
            } else {
                AbstractC10404b.m5264d("stats key not found");
            }
        }
    }

    /* renamed from: a */
    public static void m3778a(XMPushService xMPushService, C10615ak.C10617b c10617b) {
        new C10755a(xMPushService, c10617b).m3816a();
    }

    /* renamed from: a */
    public static void m3777a(String str, int i, Exception exc) {
        C10705b m3786f = C10761f.m3796a().m3786f();
        if (i > 0) {
            m3786f.m4073a(EnumC10704a.GSLB_REQUEST_SUCCESS.m4077a());
            m3786f.m4066b(str);
            m3786f.m4068b(i);
            C10761f.m3796a().m3792a(m3786f);
            return;
        }
        try {
            C10758d.C10759a m3809a = C10758d.m3809a(exc);
            m3786f.m4073a(m3809a.f33579a.m4077a());
            m3786f.m4062c(m3809a.f33580b);
            m3786f.m4066b(str);
            C10761f.m3796a().m3792a(m3786f);
        } catch (NullPointerException e) {
        }
    }

    /* renamed from: a */
    public static void m3776a(String str, Exception exc) {
        try {
            C10758d.C10759a m3808b = C10758d.m3808b(exc);
            C10705b m3786f = C10761f.m3796a().m3786f();
            m3786f.m4073a(m3808b.f33579a.m4077a());
            m3786f.m4062c(m3808b.f33580b);
            m3786f.m4066b(str);
            C10761f.m3796a().m3792a(m3786f);
        } catch (NullPointerException e) {
        }
    }

    /* renamed from: b */
    public static void m3775b() {
        m3779a(0, f33600a, null, -1);
    }

    /* renamed from: b */
    public static void m3774b(String str, Exception exc) {
        try {
            C10758d.C10759a m3806d = C10758d.m3806d(exc);
            C10705b m3786f = C10761f.m3796a().m3786f();
            m3786f.m4073a(m3806d.f33579a.m4077a());
            m3786f.m4062c(m3806d.f33580b);
            m3786f.m4066b(str);
            C10761f.m3796a().m3792a(m3786f);
        } catch (NullPointerException e) {
        }
    }

    /* renamed from: c */
    public static byte[] m3773c() {
        C10707c m3787e = C10761f.m3796a().m3787e();
        if (m3787e != null) {
            return C10799aq.m3471a(m3787e);
        }
        return null;
    }
}
