package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
import p005b.p006a.p007a.p029b.p036g.p037a.AbstractC0437d;
/* renamed from: com.google.android.gms.internal.ee */
/* loaded from: classes2.dex */
public final class C6886ee extends AbstractC6880ea<AbstractC6880ea<?>> {

    /* renamed from: b */
    public static final C6886ee f23119b = new C6886ee("BREAK");

    /* renamed from: c */
    public static final C6886ee f23120c = new C6886ee("CONTINUE");

    /* renamed from: d */
    public static final C6886ee f23121d = new C6886ee(AbstractC0437d.f576k);

    /* renamed from: e */
    public static final C6886ee f23122e = new C6886ee("UNDEFINED");

    /* renamed from: f */
    private final String f23123f;

    /* renamed from: g */
    private final boolean f23124g;

    /* renamed from: h */
    private final AbstractC6880ea<?> f23125h;

    public C6886ee(AbstractC6880ea<?> abstractC6880ea) {
        C4588d.m23627a(abstractC6880ea);
        this.f23123f = "RETURN";
        this.f23124g = true;
        this.f23125h = abstractC6880ea;
    }

    private C6886ee(String str) {
        this.f23123f = str;
        this.f23124g = false;
        this.f23125h = null;
    }

    @Override // com.google.android.gms.internal.AbstractC6880ea
    /* renamed from: d */
    public AbstractC6880ea mo16034b() {
        return this.f23125h;
    }

    /* renamed from: e */
    public boolean m16053e() {
        return this.f23124g;
    }

    @Override // com.google.android.gms.internal.AbstractC6880ea
    public String toString() {
        return this.f23123f;
    }
}
