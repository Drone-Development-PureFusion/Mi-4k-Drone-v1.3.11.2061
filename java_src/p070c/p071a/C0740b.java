package p070c.p071a;

import p070c.p072b.AbstractC0753i;
import p070c.p072b.C0757m;
/* renamed from: c.a.b */
/* loaded from: classes.dex */
public class C0740b extends C0741c {

    /* renamed from: b */
    private int f1387b;

    public C0740b(AbstractC0753i abstractC0753i, int i) {
        super(abstractC0753i);
        if (i < 0) {
            throw new IllegalArgumentException("Repetition count must be >= 0");
        }
        this.f1387b = i;
    }

    @Override // p070c.p071a.C0741c, p070c.p072b.AbstractC0753i
    /* renamed from: a */
    public int mo38166a() {
        return super.mo38166a() * this.f1387b;
    }

    @Override // p070c.p071a.C0741c, p070c.p072b.AbstractC0753i
    /* renamed from: a */
    public void mo38162a(C0757m c0757m) {
        for (int i = 0; i < this.f1387b && !c0757m.m38171f(); i++) {
            super.mo38162a(c0757m);
        }
    }

    @Override // p070c.p071a.C0741c
    public String toString() {
        return super.toString() + "(repeated)";
    }
}
