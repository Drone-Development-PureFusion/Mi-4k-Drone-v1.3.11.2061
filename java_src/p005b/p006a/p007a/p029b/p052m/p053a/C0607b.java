package p005b.p006a.p007a.p029b.p052m.p053a;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
/* renamed from: b.a.a.b.m.a.b */
/* loaded from: classes.dex */
public class C0607b {

    /* renamed from: a */
    C0610e f1051a;

    public C0607b(C0610e c0610e) {
        this.f1051a = c0610e;
    }

    /* renamed from: a */
    public Future<?> m38736a(String str, String str2, String str3) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1);
        Future<?> submit = newScheduledThreadPool.submit(new RunnableC0609d(this.f1051a, str, str2, str3));
        newScheduledThreadPool.shutdown();
        return submit;
    }
}
