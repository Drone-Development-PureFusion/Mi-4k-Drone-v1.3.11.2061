package com.xiaomi.smack;

import android.util.Pair;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.channel.commonutils.network.C10423d;
import com.xiaomi.channel.commonutils.string.C10432c;
import com.xiaomi.measite.smack.C10459a;
import com.xiaomi.push.service.AbstractC10621am;
import com.xiaomi.push.service.C10615ak;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.slim.C10710b;
import com.xiaomi.smack.debugger.AbstractC10721a;
import com.xiaomi.smack.filter.AbstractC10724a;
import com.xiaomi.smack.packet.AbstractC10735d;
import java.io.Reader;
import java.io.Writer;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: com.xiaomi.smack.a */
/* loaded from: classes.dex */
public abstract class AbstractC10716a {

    /* renamed from: a */
    public static boolean f33398a;

    /* renamed from: o */
    private static final AtomicInteger f33399o = new AtomicInteger(0);

    /* renamed from: f */
    protected int f33404f;

    /* renamed from: m */
    protected C10718b f33411m;

    /* renamed from: n */
    protected XMPushService f33412n;

    /* renamed from: b */
    protected int f33400b = 0;

    /* renamed from: c */
    protected long f33401c = -1;

    /* renamed from: d */
    protected volatile long f33402d = 0;

    /* renamed from: e */
    protected volatile long f33403e = 0;

    /* renamed from: p */
    private LinkedList<Pair<Integer, Long>> f33413p = new LinkedList<>();

    /* renamed from: q */
    private final Collection<AbstractC10720d> f33414q = new CopyOnWriteArrayList();

    /* renamed from: g */
    protected final Map<AbstractC10723f, C10717a> f33405g = new ConcurrentHashMap();

    /* renamed from: h */
    protected final Map<AbstractC10723f, C10717a> f33406h = new ConcurrentHashMap();

    /* renamed from: i */
    protected AbstractC10721a f33407i = null;

    /* renamed from: j */
    protected String f33408j = "";

    /* renamed from: k */
    protected String f33409k = "";

    /* renamed from: r */
    private int f33415r = 2;

    /* renamed from: l */
    protected final int f33410l = f33399o.getAndIncrement();

    /* renamed from: s */
    private long f33416s = 0;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.xiaomi.smack.a$a */
    /* loaded from: classes2.dex */
    public static class C10717a {

        /* renamed from: a */
        private AbstractC10723f f33417a;

        /* renamed from: b */
        private AbstractC10724a f33418b;

        public C10717a(AbstractC10723f abstractC10723f, AbstractC10724a abstractC10724a) {
            this.f33417a = abstractC10723f;
            this.f33418b = abstractC10724a;
        }

        /* renamed from: a */
        public void m3966a(C10710b c10710b) {
            this.f33417a.mo3953a(c10710b);
        }

        /* renamed from: a */
        public void m3965a(AbstractC10735d abstractC10735d) {
            if (this.f33418b == null || this.f33418b.mo3951a(abstractC10735d)) {
                this.f33417a.mo3952b(abstractC10735d);
            }
        }
    }

    static {
        f33398a = false;
        try {
            f33398a = Boolean.getBoolean("smack.debugEnabled");
        } catch (Exception e) {
        }
        C10725g.m3950a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC10716a(XMPushService xMPushService, C10718b c10718b) {
        this.f33411m = c10718b;
        this.f33412n = xMPushService;
        m3974i();
    }

    /* renamed from: a */
    private String m3992a(int i) {
        return i == 1 ? "connected" : i == 0 ? "connecting" : i == 2 ? "disconnected" : "unknown";
    }

    /* renamed from: b */
    private void m3983b(int i) {
        synchronized (this.f33413p) {
            if (i == 1) {
                this.f33413p.clear();
            } else {
                this.f33413p.add(new Pair<>(Integer.valueOf(i), Long.valueOf(System.currentTimeMillis())));
                if (this.f33413p.size() > 6) {
                    this.f33413p.remove(0);
                }
            }
        }
    }

    /* renamed from: a */
    public void m3991a(int i, int i2, Exception exc) {
        if (i != this.f33415r) {
            AbstractC10404b.m5269a(String.format("update the connection status. %1$s -> %2$s : %3$s ", m3992a(this.f33415r), m3992a(i), AbstractC10621am.m4361a(i2)));
        }
        if (C10423d.m5213d(this.f33412n)) {
            m3983b(i);
        }
        if (i == 1) {
            this.f33412n.m4500a(10);
            if (this.f33415r != 0) {
                AbstractC10404b.m5269a("try set connected while not connecting.");
            }
            this.f33415r = i;
            for (AbstractC10720d abstractC10720d : this.f33414q) {
                abstractC10720d.mo3803a(this);
            }
        } else if (i == 0) {
            if (this.f33415r != 2) {
                AbstractC10404b.m5269a("try set connecting while not disconnected.");
            }
            this.f33415r = i;
            for (AbstractC10720d abstractC10720d2 : this.f33414q) {
                abstractC10720d2.mo3799b(this);
            }
        } else if (i == 2) {
            this.f33412n.m4500a(10);
            if (this.f33415r == 0) {
                for (AbstractC10720d abstractC10720d3 : this.f33414q) {
                    abstractC10720d3.mo3801a(this, exc == null ? new CancellationException("disconnect while connecting") : exc);
                }
            } else if (this.f33415r == 1) {
                for (AbstractC10720d abstractC10720d4 : this.f33414q) {
                    abstractC10720d4.mo3802a(this, i2, exc);
                }
            }
            this.f33415r = i;
        }
    }

    /* renamed from: a */
    public abstract void mo3989a(C10615ak.C10617b c10617b);

    /* renamed from: a */
    public void m3988a(AbstractC10720d abstractC10720d) {
        if (abstractC10720d != null && !this.f33414q.contains(abstractC10720d)) {
            this.f33414q.add(abstractC10720d);
        }
    }

    /* renamed from: a */
    public void m3987a(AbstractC10723f abstractC10723f, AbstractC10724a abstractC10724a) {
        if (abstractC10723f == null) {
            throw new NullPointerException("Packet listener is null.");
        }
        this.f33405g.put(abstractC10723f, new C10717a(abstractC10723f, abstractC10724a));
    }

    /* renamed from: a */
    public abstract void mo3986a(AbstractC10735d abstractC10735d);

    /* renamed from: a */
    public synchronized void m3985a(String str) {
        if (this.f33415r == 0) {
            AbstractC10404b.m5269a("setChallenge hash = " + C10432c.m5179a(str).substring(0, 8));
            this.f33408j = str;
            m3991a(1, 0, null);
        } else {
            AbstractC10404b.m5269a("ignore setChallenge because connection was disconnected");
        }
    }

    /* renamed from: a */
    public abstract void mo3984a(String str, String str2);

    /* renamed from: a */
    public abstract void mo3938a(C10710b[] c10710bArr);

    /* renamed from: a */
    public abstract void mo3937a(AbstractC10735d[] abstractC10735dArr);

    /* renamed from: a */
    public boolean mo3993a() {
        return false;
    }

    /* renamed from: a */
    public synchronized boolean m3990a(long j) {
        return this.f33416s >= j;
    }

    /* renamed from: b */
    public abstract void mo3935b(int i, Exception exc);

    /* renamed from: b */
    public abstract void mo3982b(C10710b c10710b);

    /* renamed from: b */
    public void m3981b(AbstractC10720d abstractC10720d) {
        this.f33414q.remove(abstractC10720d);
    }

    /* renamed from: b */
    public void m3980b(AbstractC10723f abstractC10723f, AbstractC10724a abstractC10724a) {
        if (abstractC10723f == null) {
            throw new NullPointerException("Packet listener is null.");
        }
        this.f33406h.put(abstractC10723f, new C10717a(abstractC10723f, abstractC10724a));
    }

    /* renamed from: b */
    public abstract void mo3933b(boolean z);

    /* renamed from: c */
    public C10718b m3979c() {
        return this.f33411m;
    }

    /* renamed from: d */
    public String mo3931d() {
        return this.f33411m.m3956e();
    }

    /* renamed from: e */
    public String m3978e() {
        return this.f33411m.m3958c();
    }

    /* renamed from: f */
    public int m3977f() {
        return this.f33404f;
    }

    /* renamed from: g */
    public long m3976g() {
        return this.f33403e;
    }

    /* renamed from: h */
    public void m3975h() {
        mo3935b(0, (Exception) null);
    }

    /* renamed from: i */
    protected void m3974i() {
        String str;
        Class<?> cls = null;
        if (!this.f33411m.m3955f() || this.f33407i != null) {
            return;
        }
        try {
            str = System.getProperty("smack.debuggerClass");
        } catch (Throwable th) {
            str = null;
        }
        if (str != null) {
            try {
                cls = Class.forName(str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (cls == null) {
            this.f33407i = new C10459a(this);
            return;
        }
        try {
            this.f33407i = (AbstractC10721a) cls.getConstructor(AbstractC10716a.class, Writer.class, Reader.class).newInstance(this);
        } catch (Exception e2) {
            throw new IllegalArgumentException("Can't initialize the configured debugger!", e2);
        }
    }

    /* renamed from: j */
    public boolean m3973j() {
        return this.f33415r == 0;
    }

    /* renamed from: k */
    public boolean m3972k() {
        return this.f33415r == 1;
    }

    /* renamed from: l */
    public int m3971l() {
        return this.f33400b;
    }

    /* renamed from: m */
    public int m3970m() {
        return this.f33415r;
    }

    /* renamed from: n */
    public synchronized void m3969n() {
        this.f33416s = System.currentTimeMillis();
    }

    /* renamed from: o */
    public synchronized boolean m3968o() {
        return System.currentTimeMillis() - this.f33416s < ((long) C10725g.m3947b());
    }

    /* renamed from: p */
    public void m3967p() {
        synchronized (this.f33413p) {
            this.f33413p.clear();
        }
    }
}
