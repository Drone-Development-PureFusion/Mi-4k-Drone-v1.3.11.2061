package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC7103hr;
import com.google.android.gms.internal.AbstractC7316kt;
import java.lang.Thread;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ih */
/* loaded from: classes2.dex */
public enum EnumC7154ih implements AbstractC7163il {
    INSTANCE;
    

    /* renamed from: b */
    static ThreadFactory f24071b;

    /* renamed from: c */
    static final AbstractC7230iw f24072c = new AbstractC7230iw() { // from class: com.google.android.gms.internal.ih.1
        @Override // com.google.android.gms.internal.AbstractC7230iw
        /* renamed from: a */
        public void mo15160a(Thread thread, String str) {
        }

        @Override // com.google.android.gms.internal.AbstractC7230iw
        /* renamed from: a */
        public void mo15159a(Thread thread, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            thread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
        }

        @Override // com.google.android.gms.internal.AbstractC7230iw
        /* renamed from: a */
        public void mo15158a(Thread thread, boolean z) {
        }
    };

    /* renamed from: a */
    public static boolean m15374a() {
        return m15372c() != null;
    }

    /* renamed from: c */
    private static ThreadFactory m15372c() {
        if (f24071b == null) {
            try {
                Class<?> cls = Class.forName("com.google.appengine.api.ThreadManager");
                if (cls != null) {
                    f24071b = (ThreadFactory) cls.getMethod("backgroundThreadFactory", new Class[0]).invoke(null, new Object[0]);
                }
            } catch (ClassNotFoundException e) {
                return null;
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException(e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException(e4);
            }
        }
        return f24071b;
    }

    @Override // com.google.android.gms.internal.AbstractC7163il
    /* renamed from: a */
    public AbstractC7103hr mo15351a(C7146ic c7146ic, C7099hn c7099hn, C7101hp c7101hp, AbstractC7103hr.AbstractC7104a abstractC7104a) {
        return new C7105hs(c7146ic.m15403i(), c7101hp, abstractC7104a);
    }

    @Override // com.google.android.gms.internal.AbstractC7163il
    /* renamed from: a */
    public AbstractC7136hy mo15348a(ScheduledExecutorService scheduledExecutorService) {
        throw new RuntimeException("Authentication is not implemented yet");
    }

    @Override // com.google.android.gms.internal.AbstractC7163il
    /* renamed from: a */
    public AbstractC7153ig mo15352a(C7146ic c7146ic) {
        return new C7232ix(m15372c(), f24072c);
    }

    @Override // com.google.android.gms.internal.AbstractC7163il
    /* renamed from: a */
    public AbstractC7257jp mo15349a(C7146ic c7146ic, String str) {
        return null;
    }

    @Override // com.google.android.gms.internal.AbstractC7163il
    /* renamed from: a */
    public AbstractC7316kt mo15350a(C7146ic c7146ic, AbstractC7316kt.EnumC7317a enumC7317a, List<String> list) {
        return new C7313kr(enumC7317a, list);
    }

    @Override // com.google.android.gms.internal.AbstractC7163il
    /* renamed from: b */
    public AbstractC7199ip mo15347b(C7146ic c7146ic) {
        final C7315ks m15413a = c7146ic.m15413a("RunLoop");
        return new AbstractC7383me() { // from class: com.google.android.gms.internal.ih.3
            @Override // com.google.android.gms.internal.AbstractC7383me
            /* renamed from: a */
            protected ThreadFactory mo14629a() {
                return EnumC7154ih.f24071b;
            }

            @Override // com.google.android.gms.internal.AbstractC7383me
            /* renamed from: a */
            public void mo14627a(Throwable th) {
                m15413a.m14842a(AbstractC7383me.m14625b(th), th);
            }

            @Override // com.google.android.gms.internal.AbstractC7383me
            /* renamed from: b */
            protected AbstractC7230iw mo14626b() {
                return EnumC7154ih.f24072c;
            }
        };
    }

    /* renamed from: b */
    public void m15373b() {
        C7365ls.m14685a(f24071b, new AbstractC7364lr() { // from class: com.google.android.gms.internal.ih.2
            @Override // com.google.android.gms.internal.AbstractC7364lr
            /* renamed from: a */
            public void mo14672a(Thread thread, String str) {
                EnumC7154ih.f24072c.mo15160a(thread, str);
            }
        });
    }

    @Override // com.google.android.gms.internal.AbstractC7163il
    /* renamed from: c */
    public String mo15346c(C7146ic c7146ic) {
        String property = System.getProperty("java.specification.version", "Unknown");
        return new StringBuilder(String.valueOf(property).length() + 1 + String.valueOf("AppEngine").length()).append(property).append("/").append("AppEngine").toString();
    }
}
