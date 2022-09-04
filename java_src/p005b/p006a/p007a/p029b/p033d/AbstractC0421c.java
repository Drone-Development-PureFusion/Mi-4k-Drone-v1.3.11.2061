package p005b.p006a.p007a.p029b.p033d;

import p005b.p006a.p007a.p029b.p055o.AbstractC0669m;
import p005b.p006a.p007a.p029b.p055o.C0662f;
import p005b.p006a.p007a.p029b.p055o.EnumC0668l;
/* renamed from: b.a.a.b.d.c */
/* loaded from: classes.dex */
public abstract class AbstractC0421c<E> extends C0662f implements AbstractC0669m {

    /* renamed from: a */
    private String f521a;

    /* renamed from: d */
    boolean f522d = false;

    /* renamed from: a */
    public abstract EnumC0668l mo39358a(E e);

    /* renamed from: b */
    public void m39357b(String str) {
        this.f521a = str;
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: b_ */
    public boolean mo38480b_() {
        return this.f522d;
    }

    /* renamed from: e */
    public String m39356e() {
        return this.f521a;
    }

    /* renamed from: j */
    public void mo38474j() {
        this.f522d = true;
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: k */
    public void mo38473k() {
        this.f522d = false;
    }
}
