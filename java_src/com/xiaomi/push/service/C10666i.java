package com.xiaomi.push.service;

import android.os.SystemClock;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import java.util.concurrent.RejectedExecutionException;
/* renamed from: com.xiaomi.push.service.i */
/* loaded from: classes.dex */
public class C10666i {

    /* renamed from: a */
    private static long f33136a;

    /* renamed from: b */
    private static long f33137b;

    /* renamed from: c */
    private static long f33138c;

    /* renamed from: d */
    private final C10669c f33139d;

    /* renamed from: e */
    private final C10667a f33140e;

    /* renamed from: com.xiaomi.push.service.i$a */
    /* loaded from: classes.dex */
    private static final class C10667a {

        /* renamed from: a */
        private final C10669c f33141a;

        C10667a(C10669c c10669c) {
            this.f33141a = c10669c;
        }

        protected void finalize() {
            try {
                synchronized (this.f33141a) {
                    this.f33141a.f33147e = true;
                    this.f33141a.notify();
                }
            } finally {
                super.finalize();
            }
        }
    }

    /* renamed from: com.xiaomi.push.service.i$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractRunnableC10668b implements Runnable {

        /* renamed from: a */
        protected int f33142a;

        public AbstractRunnableC10668b(int i) {
            this.f33142a = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.xiaomi.push.service.i$c */
    /* loaded from: classes.dex */
    public static final class C10669c extends Thread {

        /* renamed from: d */
        private boolean f33146d;

        /* renamed from: e */
        private boolean f33147e;

        /* renamed from: a */
        private volatile long f33143a = 0;

        /* renamed from: b */
        private volatile boolean f33144b = false;

        /* renamed from: c */
        private long f33145c = 50;

        /* renamed from: f */
        private C10670a f33148f = new C10670a();

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.xiaomi.push.service.i$c$a */
        /* loaded from: classes.dex */
        public static final class C10670a {

            /* renamed from: a */
            private int f33149a;

            /* renamed from: b */
            private C10671d[] f33150b;

            /* renamed from: c */
            private int f33151c;

            /* renamed from: d */
            private int f33152d;

            private C10670a() {
                this.f33149a = 256;
                this.f33150b = new C10671d[this.f33149a];
                this.f33151c = 0;
                this.f33152d = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: b */
            public int m4222b(C10671d c10671d) {
                for (int i = 0; i < this.f33150b.length; i++) {
                    if (this.f33150b[i] == c10671d) {
                        return i;
                    }
                }
                return -1;
            }

            /* renamed from: d */
            private void m4218d(int i) {
                int i2 = (i * 2) + 1;
                while (i2 < this.f33151c && this.f33151c > 0) {
                    int i3 = (i2 + 1 >= this.f33151c || this.f33150b[i2 + 1].f33155c >= this.f33150b[i2].f33155c) ? i2 : i2 + 1;
                    if (this.f33150b[i].f33155c < this.f33150b[i3].f33155c) {
                        return;
                    }
                    C10671d c10671d = this.f33150b[i];
                    this.f33150b[i] = this.f33150b[i3];
                    this.f33150b[i3] = c10671d;
                    i2 = (i3 * 2) + 1;
                    i = i3;
                }
            }

            /* renamed from: e */
            private void m4217e() {
                int i = this.f33151c - 1;
                for (int i2 = (i - 1) / 2; this.f33150b[i].f33155c < this.f33150b[i2].f33155c; i2 = (i2 - 1) / 2) {
                    C10671d c10671d = this.f33150b[i];
                    this.f33150b[i] = this.f33150b[i2];
                    this.f33150b[i2] = c10671d;
                    i = i2;
                }
            }

            /* renamed from: a */
            public C10671d m4229a() {
                return this.f33150b[0];
            }

            /* renamed from: a */
            public void m4227a(int i, AbstractRunnableC10668b abstractRunnableC10668b) {
                for (int i2 = 0; i2 < this.f33151c; i2++) {
                    if (this.f33150b[i2].f33156d == abstractRunnableC10668b) {
                        this.f33150b[i2].m4216a();
                    }
                }
                m4219d();
            }

            /* renamed from: a */
            public void m4225a(C10671d c10671d) {
                if (this.f33150b.length == this.f33151c) {
                    C10671d[] c10671dArr = new C10671d[this.f33151c * 2];
                    System.arraycopy(this.f33150b, 0, c10671dArr, 0, this.f33151c);
                    this.f33150b = c10671dArr;
                }
                C10671d[] c10671dArr2 = this.f33150b;
                int i = this.f33151c;
                this.f33151c = i + 1;
                c10671dArr2[i] = c10671d;
                m4217e();
            }

            /* renamed from: a */
            public boolean m4228a(int i) {
                for (int i2 = 0; i2 < this.f33151c; i2++) {
                    if (this.f33150b[i2].f33157e == i) {
                        return true;
                    }
                }
                return false;
            }

            /* renamed from: b */
            public void m4223b(int i) {
                for (int i2 = 0; i2 < this.f33151c; i2++) {
                    if (this.f33150b[i2].f33157e == i) {
                        this.f33150b[i2].m4216a();
                    }
                }
                m4219d();
            }

            /* renamed from: b */
            public boolean m4224b() {
                return this.f33151c == 0;
            }

            /* renamed from: c */
            public void m4221c() {
                this.f33150b = new C10671d[this.f33149a];
                this.f33151c = 0;
            }

            /* renamed from: c */
            public void m4220c(int i) {
                if (i < 0 || i >= this.f33151c) {
                    return;
                }
                C10671d[] c10671dArr = this.f33150b;
                C10671d[] c10671dArr2 = this.f33150b;
                int i2 = this.f33151c - 1;
                this.f33151c = i2;
                c10671dArr[i] = c10671dArr2[i2];
                this.f33150b[this.f33151c] = null;
                m4218d(i);
            }

            /* renamed from: d */
            public void m4219d() {
                int i = 0;
                while (i < this.f33151c) {
                    if (this.f33150b[i].f33154b) {
                        this.f33152d++;
                        m4220c(i);
                        i--;
                    }
                    i++;
                }
            }
        }

        C10669c(String str, boolean z) {
            setName(str);
            setDaemon(z);
            start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m4232a(C10671d c10671d) {
            this.f33148f.m4225a(c10671d);
            notify();
        }

        /* renamed from: a */
        public synchronized void m4236a() {
            this.f33146d = true;
            this.f33148f.m4221c();
            notify();
        }

        /* renamed from: b */
        public boolean m4231b() {
            return this.f33144b && SystemClock.uptimeMillis() - this.f33143a > 600000;
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x00a4, code lost:
            r8.f33143a = android.os.SystemClock.uptimeMillis();
            r8.f33144b = true;
            r2.f33156d.run();
            r8.f33144b = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00b7, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00b8, code lost:
            monitor-enter(r8);
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00ba, code lost:
            r8.f33146d = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00bd, code lost:
            throw r0;
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            while (true) {
                synchronized (this) {
                    if (this.f33146d) {
                        return;
                    }
                    if (!this.f33148f.m4224b()) {
                        long m4247a = C10666i.m4247a();
                        C10671d m4229a = this.f33148f.m4229a();
                        synchronized (m4229a.f33153a) {
                            if (m4229a.f33154b) {
                                this.f33148f.m4220c(0);
                            } else {
                                long j = m4229a.f33155c - m4247a;
                                if (j > 0) {
                                    if (j > this.f33145c) {
                                        j = this.f33145c;
                                    }
                                    this.f33145c += 50;
                                    if (this.f33145c > 500) {
                                        this.f33145c = 500L;
                                    }
                                    try {
                                        wait(j);
                                    } catch (InterruptedException e) {
                                    }
                                } else {
                                    this.f33145c = 50L;
                                    synchronized (m4229a.f33153a) {
                                        int i = 0;
                                        if (this.f33148f.m4229a().f33155c != m4229a.f33155c) {
                                            i = this.f33148f.m4222b(m4229a);
                                        }
                                        if (m4229a.f33154b) {
                                            this.f33148f.m4220c(this.f33148f.m4222b(m4229a));
                                        } else {
                                            m4229a.m4215a(m4229a.f33155c);
                                            this.f33148f.m4220c(i);
                                            m4229a.f33155c = 0L;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (this.f33147e) {
                        return;
                    } else {
                        try {
                            wait();
                        } catch (InterruptedException e2) {
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.xiaomi.push.service.i$d */
    /* loaded from: classes.dex */
    public static class C10671d {

        /* renamed from: a */
        final Object f33153a = new Object();

        /* renamed from: b */
        boolean f33154b;

        /* renamed from: c */
        long f33155c;

        /* renamed from: d */
        AbstractRunnableC10668b f33156d;

        /* renamed from: e */
        int f33157e;

        /* renamed from: f */
        private long f33158f;

        C10671d() {
        }

        /* renamed from: a */
        void m4215a(long j) {
            synchronized (this.f33153a) {
                this.f33158f = j;
            }
        }

        /* renamed from: a */
        public boolean m4216a() {
            boolean z = true;
            synchronized (this.f33153a) {
                if (this.f33154b || this.f33155c <= 0) {
                    z = false;
                }
                this.f33154b = true;
            }
            return z;
        }
    }

    static {
        long j = 0;
        if (SystemClock.elapsedRealtime() > 0) {
            j = SystemClock.elapsedRealtime();
        }
        f33136a = j;
        f33137b = f33136a;
    }

    public C10666i() {
        this(false);
    }

    public C10666i(String str) {
        this(str, false);
    }

    public C10666i(String str, boolean z) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        this.f33139d = new C10669c(str, z);
        this.f33140e = new C10667a(this.f33139d);
    }

    public C10666i(boolean z) {
        this("Timer-" + m4237e(), z);
    }

    /* renamed from: a */
    static synchronized long m4247a() {
        long j;
        synchronized (C10666i.class) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime > f33137b) {
                f33136a += elapsedRealtime - f33137b;
            }
            f33137b = elapsedRealtime;
            j = f33136a;
        }
        return j;
    }

    /* renamed from: b */
    private void m4240b(AbstractRunnableC10668b abstractRunnableC10668b, long j) {
        synchronized (this.f33139d) {
            if (this.f33139d.f33146d) {
                throw new IllegalStateException("Timer was canceled");
            }
            long m4247a = m4247a() + j;
            if (m4247a < 0) {
                throw new IllegalArgumentException("Illegal delay to start the TimerTask: " + m4247a);
            }
            C10671d c10671d = new C10671d();
            c10671d.f33157e = abstractRunnableC10668b.f33142a;
            c10671d.f33156d = abstractRunnableC10668b;
            c10671d.f33155c = m4247a;
            this.f33139d.m4232a(c10671d);
        }
    }

    /* renamed from: e */
    private static synchronized long m4237e() {
        long j;
        synchronized (C10666i.class) {
            j = f33138c;
            f33138c = 1 + j;
        }
        return j;
    }

    /* renamed from: a */
    public void m4245a(int i, AbstractRunnableC10668b abstractRunnableC10668b) {
        synchronized (this.f33139d) {
            this.f33139d.f33148f.m4227a(i, abstractRunnableC10668b);
        }
    }

    /* renamed from: a */
    public void m4244a(AbstractRunnableC10668b abstractRunnableC10668b) {
        if (AbstractC10404b.m5275a() >= 1 || Thread.currentThread() == this.f33139d) {
            abstractRunnableC10668b.run();
        } else {
            AbstractC10404b.m5264d("run job outside job job thread");
            throw new RejectedExecutionException("Run job outside job thread");
        }
    }

    /* renamed from: a */
    public void m4243a(AbstractRunnableC10668b abstractRunnableC10668b, long j) {
        if (j < 0) {
            throw new IllegalArgumentException("delay < 0: " + j);
        }
        m4240b(abstractRunnableC10668b, j);
    }

    /* renamed from: a */
    public boolean m4246a(int i) {
        boolean m4228a;
        synchronized (this.f33139d) {
            m4228a = this.f33139d.f33148f.m4228a(i);
        }
        return m4228a;
    }

    /* renamed from: b */
    public void m4242b() {
        this.f33139d.m4236a();
    }

    /* renamed from: b */
    public void m4241b(int i) {
        synchronized (this.f33139d) {
            this.f33139d.f33148f.m4223b(i);
        }
    }

    /* renamed from: c */
    public void m4239c() {
        synchronized (this.f33139d) {
            this.f33139d.f33148f.m4221c();
        }
    }

    /* renamed from: d */
    public boolean m4238d() {
        return this.f33139d.m4231b();
    }
}
