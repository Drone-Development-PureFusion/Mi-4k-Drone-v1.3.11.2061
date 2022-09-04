package com.p120c.p121a.p129b.p130a;
/* renamed from: com.c.a.b.a.b */
/* loaded from: classes.dex */
public class C1296b {

    /* renamed from: a */
    private final EnumC1297a f3244a;

    /* renamed from: b */
    private final Throwable f3245b;

    /* renamed from: com.c.a.b.a.b$a */
    /* loaded from: classes.dex */
    public enum EnumC1297a {
        IO_ERROR,
        DECODING_ERROR,
        NETWORK_DENIED,
        OUT_OF_MEMORY,
        UNKNOWN
    }

    public C1296b(EnumC1297a enumC1297a, Throwable th) {
        this.f3244a = enumC1297a;
        this.f3245b = th;
    }

    /* renamed from: a */
    public EnumC1297a m35913a() {
        return this.f3244a;
    }

    /* renamed from: b */
    public Throwable m35912b() {
        return this.f3245b;
    }
}
