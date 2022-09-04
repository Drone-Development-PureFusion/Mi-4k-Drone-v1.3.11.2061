package com.google.android.gms.internal;

import android.os.Binder;
/* loaded from: classes2.dex */
public abstract class aiz<T> {

    /* renamed from: c */
    private static final Object f21976c = new Object();

    /* renamed from: d */
    private static AbstractC6398a f21977d = null;

    /* renamed from: e */
    private static int f21978e = 0;

    /* renamed from: f */
    private static String f21979f = "com.google.android.providers.gsf.permission.READ_GSERVICES";

    /* renamed from: a */
    protected final String f21980a;

    /* renamed from: b */
    protected final T f21981b;

    /* renamed from: g */
    private T f21982g = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.aiz$a */
    /* loaded from: classes2.dex */
    public interface AbstractC6398a {
        /* renamed from: a */
        Boolean m17148a(String str, Boolean bool);

        /* renamed from: a */
        Float m17147a(String str, Float f);

        /* renamed from: a */
        Integer m17146a(String str, Integer num);

        /* renamed from: a */
        Long m17145a(String str, Long l);

        /* renamed from: a */
        String m17144a(String str, String str2);
    }

    protected aiz(String str, T t) {
        this.f21980a = str;
        this.f21981b = t;
    }

    /* renamed from: a */
    public static aiz<Float> m17160a(String str, Float f) {
        return new aiz<Float>(str, f) { // from class: com.google.android.gms.internal.aiz.4
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.aiz
            /* renamed from: b */
            public Float mo17150a(String str2) {
                return aiz.m17155b().m17147a(this.f21980a, (Float) this.f21981b);
            }
        };
    }

    /* renamed from: a */
    public static aiz<Integer> m17159a(String str, Integer num) {
        return new aiz<Integer>(str, num) { // from class: com.google.android.gms.internal.aiz.3
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.aiz
            /* renamed from: b */
            public Integer mo17150a(String str2) {
                return aiz.m17155b().m17146a(this.f21980a, (Integer) this.f21981b);
            }
        };
    }

    /* renamed from: a */
    public static aiz<Long> m17158a(String str, Long l) {
        return new aiz<Long>(str, l) { // from class: com.google.android.gms.internal.aiz.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.aiz
            /* renamed from: b */
            public Long mo17150a(String str2) {
                return aiz.m17155b().m17145a(this.f21980a, (Long) this.f21981b);
            }
        };
    }

    /* renamed from: a */
    public static aiz<String> m17157a(String str, String str2) {
        return new aiz<String>(str, str2) { // from class: com.google.android.gms.internal.aiz.5
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.aiz
            /* renamed from: b */
            public String mo17150a(String str3) {
                return aiz.m17155b().m17144a(this.f21980a, (String) this.f21981b);
            }
        };
    }

    /* renamed from: a */
    public static aiz<Boolean> m17156a(String str, boolean z) {
        return new aiz<Boolean>(str, Boolean.valueOf(z)) { // from class: com.google.android.gms.internal.aiz.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.aiz
            /* renamed from: b */
            public Boolean mo17150a(String str2) {
                return aiz.m17155b().m17148a(this.f21980a, (Boolean) this.f21981b);
            }
        };
    }

    /* renamed from: b */
    static /* synthetic */ AbstractC6398a m17155b() {
        return null;
    }

    /* renamed from: a */
    public final T m17161a() {
        try {
            return mo17150a(this.f21980a);
        } catch (SecurityException e) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return mo17150a(this.f21980a);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    /* renamed from: a */
    protected abstract T mo17150a(String str);
}
