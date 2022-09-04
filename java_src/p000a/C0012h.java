package p000a;

import android.support.p004v7.media.SystemMediaRouteProvider;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* renamed from: a.h */
/* loaded from: classes.dex */
final class C0012h {

    /* renamed from: a */
    private static final C0012h f35a = new C0012h();

    /* renamed from: b */
    private final ExecutorService f36b;

    /* renamed from: c */
    private final Executor f37c;

    /* renamed from: a.h$a */
    /* loaded from: classes.dex */
    private static class ExecutorC0014a implements Executor {

        /* renamed from: a */
        private static final int f38a = 15;

        /* renamed from: b */
        private ThreadLocal<Integer> f39b;

        private ExecutorC0014a() {
            this.f39b = new ThreadLocal<>();
        }

        /* renamed from: a */
        private int m39947a() {
            Integer num = this.f39b.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() + 1;
            this.f39b.set(Integer.valueOf(intValue));
            return intValue;
        }

        /* renamed from: b */
        private int m39946b() {
            Integer num = this.f39b.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.f39b.remove();
            } else {
                this.f39b.set(Integer.valueOf(intValue));
            }
            return intValue;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            try {
                if (m39947a() <= 15) {
                    runnable.run();
                } else {
                    C0012h.m39950a().execute(runnable);
                }
            } finally {
                m39946b();
            }
        }
    }

    private C0012h() {
        this.f36b = !m39948c() ? Executors.newCachedThreadPool() : C0001b.m39986a();
        this.f37c = new ExecutorC0014a();
    }

    /* renamed from: a */
    public static ExecutorService m39950a() {
        return f35a.f36b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static Executor m39949b() {
        return f35a.f37c;
    }

    /* renamed from: c */
    private static boolean m39948c() {
        String property = System.getProperty("java.runtime.name");
        if (property == null) {
            return false;
        }
        return property.toLowerCase(Locale.US).contains(SystemMediaRouteProvider.PACKAGE_NAME);
    }
}
