package com.google.android.gms.internal;

import android.os.RemoteException;
/* loaded from: classes.dex */
public abstract class amf<T> {

    /* renamed from: a */
    private final int f22260a;

    /* renamed from: b */
    private final String f22261b;

    /* renamed from: c */
    private final T f22262c;

    /* renamed from: com.google.android.gms.internal.amf$a */
    /* loaded from: classes2.dex */
    public static class C6561a extends amf<Boolean> {
        public C6561a(int i, String str, Boolean bool) {
            super(i, str, bool);
        }

        @Override // com.google.android.gms.internal.amf
        /* renamed from: b */
        public Boolean mo16819a(ami amiVar) {
            try {
                return Boolean.valueOf(amiVar.getBooleanFlagValue(a(), b().booleanValue(), d()));
            } catch (RemoteException e) {
                return b();
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.amf$b */
    /* loaded from: classes2.dex */
    public static class C6562b extends amf<Integer> {
        public C6562b(int i, String str, Integer num) {
            super(i, str, num);
        }

        @Override // com.google.android.gms.internal.amf
        /* renamed from: b */
        public Integer mo16819a(ami amiVar) {
            try {
                return Integer.valueOf(amiVar.getIntFlagValue(a(), b().intValue(), d()));
            } catch (RemoteException e) {
                return b();
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.amf$c */
    /* loaded from: classes2.dex */
    public static class C6563c extends amf<Long> {
        public C6563c(int i, String str, Long l) {
            super(i, str, l);
        }

        @Override // com.google.android.gms.internal.amf
        /* renamed from: b */
        public Long mo16819a(ami amiVar) {
            try {
                return Long.valueOf(amiVar.getLongFlagValue(a(), b().longValue(), d()));
            } catch (RemoteException e) {
                return b();
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.amf$d */
    /* loaded from: classes2.dex */
    public static class C6564d extends amf<String> {
        public C6564d(int i, String str, String str2) {
            super(i, str, str2);
        }

        @Override // com.google.android.gms.internal.amf
        /* renamed from: b */
        public String mo16819a(ami amiVar) {
            try {
                return amiVar.getStringFlagValue(a(), b(), d());
            } catch (RemoteException e) {
                return b();
            }
        }
    }

    private amf(int i, String str, T t) {
        this.f22260a = i;
        this.f22261b = str;
        this.f22262c = t;
        amk.m16793a().m16816a(this);
    }

    /* renamed from: a */
    public static C6561a m16827a(int i, String str, Boolean bool) {
        return new C6561a(i, str, bool);
    }

    /* renamed from: a */
    public static C6562b m16829a(int i, String str, int i2) {
        return new C6562b(i, str, Integer.valueOf(i2));
    }

    /* renamed from: a */
    public static C6563c m16828a(int i, String str, long j) {
        return new C6563c(i, str, Long.valueOf(j));
    }

    /* renamed from: a */
    public static C6564d m16826a(int i, String str, String str2) {
        return new C6564d(i, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo16819a(ami amiVar);

    /* renamed from: a */
    public String m16830a() {
        return this.f22261b;
    }

    /* renamed from: b */
    public T m16825b() {
        return this.f22262c;
    }

    /* renamed from: c */
    public T m16824c() {
        return (T) amk.m16791b().m16814a(this);
    }

    /* renamed from: d */
    public int m16823d() {
        return this.f22260a;
    }
}
