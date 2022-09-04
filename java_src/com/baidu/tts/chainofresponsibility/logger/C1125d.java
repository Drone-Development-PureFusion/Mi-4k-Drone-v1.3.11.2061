package com.baidu.tts.chainofresponsibility.logger;

import android.util.Log;
import com.baidu.tts.p103g.p104a.ThreadFactoryC1188a;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* renamed from: com.baidu.tts.chainofresponsibility.logger.d */
/* loaded from: classes.dex */
public class C1125d {

    /* renamed from: a */
    private static volatile C1125d f2599a = null;

    /* renamed from: e */
    private C1129e f2603e = new C1129e();

    /* renamed from: f */
    private EnumC1127a f2604f = EnumC1127a.RELEASE;

    /* renamed from: g */
    private boolean f2605g = false;

    /* renamed from: b */
    private List<AbstractC1123b> f2600b = m36527g();

    /* renamed from: d */
    private C1130f f2602d = new C1130f();

    /* renamed from: c */
    private ExecutorService f2601c = Executors.newSingleThreadExecutor(new ThreadFactoryC1188a("LoggerChainPoolThread"));

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.baidu.tts.chainofresponsibility.logger.d$a */
    /* loaded from: classes.dex */
    public enum EnumC1127a {
        DEVELOP,
        RELEASE
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.baidu.tts.chainofresponsibility.logger.d$b */
    /* loaded from: classes.dex */
    public class RunnableC1128b implements Runnable {

        /* renamed from: b */
        private C1124c f2611b;

        public RunnableC1128b(C1124c c1124c) {
            this.f2611b = c1124c;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (AbstractC1123b abstractC1123b : C1125d.this.f2600b) {
                abstractC1123b.a(this.f2611b, null, C1125d.f2599a);
            }
        }
    }

    private C1125d() {
        this.f2600b.add(this.f2602d);
    }

    /* renamed from: a */
    public static C1125d m36542a() {
        if (f2599a == null) {
            synchronized (C1125d.class) {
                if (f2599a == null) {
                    f2599a = new C1125d();
                }
            }
        }
        return f2599a;
    }

    /* renamed from: a */
    private void m36539a(C1124c c1124c, int i, String str, String str2) {
        if (c1124c == null) {
            c1124c = new C1124c();
        }
        c1124c.m36548a(i);
        c1124c.m36547a(str);
        c1124c.m36545b(str2);
        m36540a(c1124c);
    }

    /* renamed from: b */
    private void m36533b(C1124c c1124c) {
        try {
            if (this.f2601c == null || this.f2601c.isShutdown()) {
                return;
            }
            this.f2601c.execute(new RunnableC1128b(c1124c));
        } catch (Exception e) {
            Log.e("LoggerChain", "executeWork exception=" + e.toString());
        }
    }

    /* renamed from: g */
    private List<AbstractC1123b> m36527g() {
        return this.f2600b == null ? new CopyOnWriteArrayList() : this.f2600b;
    }

    /* renamed from: a */
    public void m36541a(int i, String str, String str2) {
        m36539a(new C1124c(), i, str, str2);
    }

    /* renamed from: a */
    public void m36540a(C1124c c1124c) {
        if (c1124c != null) {
            switch (this.f2604f) {
                case DEVELOP:
                    c1124c.m36548a(6);
                    this.f2603e.m36525a(c1124c, null, f2599a);
                    break;
                case RELEASE:
                    if (this.f2605g) {
                        this.f2603e.m36525a(c1124c, null, f2599a);
                        break;
                    }
                    break;
            }
            m36533b(c1124c);
        }
    }

    /* renamed from: a */
    public void m36537a(String str) {
        if (this.f2603e != null) {
            this.f2603e.m36524a(str);
        }
    }

    /* renamed from: a */
    public void m36536a(List<String> list) {
        if (this.f2603e != null) {
            this.f2603e.m36523a(list);
        }
    }

    /* renamed from: a */
    public void m36535a(boolean z) {
        this.f2605g = z;
    }

    /* renamed from: b */
    public void m36534b() {
        if (this.f2600b != null) {
            this.f2600b.clear();
        }
    }

    /* renamed from: b */
    public void m36532b(String str) {
        if (this.f2603e != null) {
            this.f2603e.m36522b(str);
        }
    }

    /* renamed from: c */
    public void m36531c() {
        if (this.f2603e != null) {
            this.f2603e.m36526a();
        }
    }

    /* renamed from: d */
    public void m36530d() {
        this.f2604f = EnumC1127a.RELEASE;
    }

    /* renamed from: e */
    public boolean m36529e() {
        return this.f2604f == null || this.f2604f == EnumC1127a.RELEASE;
    }
}
