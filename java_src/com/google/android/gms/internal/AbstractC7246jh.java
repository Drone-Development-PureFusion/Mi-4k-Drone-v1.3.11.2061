package com.google.android.gms.internal;
/* renamed from: com.google.android.gms.internal.jh */
/* loaded from: classes2.dex */
public abstract class AbstractC7246jh {

    /* renamed from: b */
    protected final EnumC7247a f24319b;

    /* renamed from: c */
    protected final C7248ji f24320c;

    /* renamed from: d */
    protected final C7160ij f24321d;

    /* renamed from: com.google.android.gms.internal.jh$a */
    /* loaded from: classes2.dex */
    public enum EnumC7247a {
        Overwrite,
        Merge,
        AckUserWrite,
        ListenComplete
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC7246jh(EnumC7247a enumC7247a, C7248ji c7248ji, C7160ij c7160ij) {
        this.f24319b = enumC7247a;
        this.f24320c = c7248ji;
        this.f24321d = c7160ij;
    }

    /* renamed from: a */
    public abstract AbstractC7246jh mo15090a(C7319kv c7319kv);

    /* renamed from: c */
    public C7160ij m15099c() {
        return this.f24321d;
    }

    /* renamed from: d */
    public C7248ji m15098d() {
        return this.f24320c;
    }

    /* renamed from: e */
    public EnumC7247a m15097e() {
        return this.f24319b;
    }
}
