package p005b.p006a.p007a.p008a.p027o;

import org.p356d.AbstractC11759f;
import p005b.p006a.p007a.p008a.C0281d;
import p005b.p006a.p007a.p008a.C0283e;
import p005b.p006a.p007a.p029b.p055o.EnumC0668l;
/* renamed from: b.a.a.a.o.a */
/* loaded from: classes.dex */
public class C0383a extends AbstractC0392i {

    /* renamed from: a */
    public static final int f429a = 100;

    /* renamed from: b */
    public static final int f430b = 5;

    /* renamed from: c */
    public int f431c = 5;

    /* renamed from: d */
    public int f432d = 100;

    /* renamed from: e */
    private C0385c f433e;

    /* renamed from: a */
    public int m39482a() {
        return this.f431c;
    }

    @Override // p005b.p006a.p007a.p008a.p027o.AbstractC0392i
    /* renamed from: a */
    public EnumC0668l mo39443a(AbstractC11759f abstractC11759f, C0283e c0283e, C0281d c0281d, String str, Object[] objArr, Throwable th) {
        return this.f433e.m39469a(str) <= this.f431c ? EnumC0668l.NEUTRAL : EnumC0668l.DENY;
    }

    /* renamed from: a */
    public void m39481a(int i) {
        this.f431c = i;
    }

    /* renamed from: b */
    public int m39480b() {
        return this.f432d;
    }

    /* renamed from: b */
    public void m39479b(int i) {
        this.f432d = i;
    }

    @Override // p005b.p006a.p007a.p008a.p027o.AbstractC0392i, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: j */
    public void mo38474j() {
        this.f433e = new C0385c(this.f432d);
        super.mo38474j();
    }

    @Override // p005b.p006a.p007a.p008a.p027o.AbstractC0392i, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: k */
    public void mo38473k() {
        this.f433e.clear();
        this.f433e = null;
        super.mo38473k();
    }
}
