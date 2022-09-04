package p005b.p006a.p007a.p029b.p058r;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: b.a.a.b.r.m */
/* loaded from: classes.dex */
public class C0714m {
    /* renamed from: a */
    public static ExecutorService m38412a() {
        return new ThreadPoolExecutor(C0494h.f706a, 32, 0L, TimeUnit.MILLISECONDS, new SynchronousQueue());
    }

    /* renamed from: a */
    public static void m38411a(ExecutorService executorService) {
        executorService.shutdownNow();
    }
}
