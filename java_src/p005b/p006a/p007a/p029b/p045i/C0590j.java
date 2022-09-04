package p005b.p006a.p007a.p029b.p045i;

import p005b.p006a.p007a.p029b.AbstractC0594j;
import p005b.p006a.p007a.p029b.p032c.C0415f;
/* renamed from: b.a.a.b.i.j */
/* loaded from: classes.dex */
public class C0590j<E> extends C0415f<E> {

    /* renamed from: d */
    String f1018d;

    /* renamed from: e */
    protected boolean f1019e = false;

    @Override // p005b.p006a.p007a.p029b.p032c.C0415f
    /* renamed from: a */
    public void mo38785a(AbstractC0594j<E> abstractC0594j) {
        throw new UnsupportedOperationException("one cannot set the layout of " + getClass().getName());
    }

    /* renamed from: a */
    public void m38784a(String str) {
        this.f1018d = str;
    }

    /* renamed from: b */
    public void m38783b(boolean z) {
        this.f1019e = z;
    }

    /* renamed from: c */
    public void m38782c(boolean z) {
        e("[outputPatternAsPresentationHeader] property is deprecated. Please use [outputPatternAsHeader] option instead.");
        this.f1019e = z;
    }

    /* renamed from: h */
    public String m38781h() {
        return this.f1018d;
    }

    /* renamed from: l */
    public boolean m38780l() {
        return this.f1019e;
    }

    /* renamed from: m */
    public boolean m38779m() {
        return this.f1019e;
    }
}
