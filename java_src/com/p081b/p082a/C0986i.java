package com.p081b.p082a;

import android.view.animation.Interpolator;
import com.p081b.p082a.AbstractC0987j;
import java.util.ArrayList;
/* renamed from: com.b.a.i */
/* loaded from: classes.dex */
class C0986i extends C0991k {

    /* renamed from: g */
    private int f2226g;

    /* renamed from: h */
    private int f2227h;

    /* renamed from: i */
    private int f2228i;

    /* renamed from: j */
    private boolean f2229j = true;

    public C0986i(AbstractC0987j.C0989b... c0989bArr) {
        super(c0989bArr);
    }

    @Override // com.p081b.p082a.C0991k
    /* renamed from: a */
    public C0986i clone() {
        ArrayList<AbstractC0987j> arrayList = this.f2241e;
        int size = this.f2241e.size();
        AbstractC0987j.C0989b[] c0989bArr = new AbstractC0987j.C0989b[size];
        for (int i = 0; i < size; i++) {
            c0989bArr[i] = (AbstractC0987j.C0989b) arrayList.get(i).clone();
        }
        return new C0986i(c0989bArr);
    }

    @Override // com.p081b.p082a.C0991k
    /* renamed from: a */
    public Object mo37196a(float f) {
        return Integer.valueOf(m37217b(f));
    }

    /* renamed from: b */
    public int m37217b(float f) {
        int i = 1;
        if (this.f2237a == 2) {
            if (this.f2229j) {
                this.f2229j = false;
                this.f2226g = ((AbstractC0987j.C0989b) this.f2241e.get(0)).m37202g();
                this.f2227h = ((AbstractC0987j.C0989b) this.f2241e.get(1)).m37202g();
                this.f2228i = this.f2227h - this.f2226g;
            }
            if (this.f2240d != null) {
                f = this.f2240d.getInterpolation(f);
            }
            return this.f2242f == null ? this.f2226g + ((int) (this.f2228i * f)) : ((Number) this.f2242f.mo37111a(f, Integer.valueOf(this.f2226g), Integer.valueOf(this.f2227h))).intValue();
        } else if (f <= 0.0f) {
            AbstractC0987j.C0989b c0989b = (AbstractC0987j.C0989b) this.f2241e.get(0);
            AbstractC0987j.C0989b c0989b2 = (AbstractC0987j.C0989b) this.f2241e.get(1);
            int m37202g = c0989b.m37202g();
            int m37202g2 = c0989b2.m37202g();
            float c = c0989b.c();
            float c2 = c0989b2.c();
            Interpolator d = c0989b2.d();
            if (d != null) {
                f = d.getInterpolation(f);
            }
            float f2 = (f - c) / (c2 - c);
            return this.f2242f == null ? ((int) (f2 * (m37202g2 - m37202g))) + m37202g : ((Number) this.f2242f.mo37111a(f2, Integer.valueOf(m37202g), Integer.valueOf(m37202g2))).intValue();
        } else if (f >= 1.0f) {
            AbstractC0987j.C0989b c0989b3 = (AbstractC0987j.C0989b) this.f2241e.get(this.f2237a - 2);
            AbstractC0987j.C0989b c0989b4 = (AbstractC0987j.C0989b) this.f2241e.get(this.f2237a - 1);
            int m37202g3 = c0989b3.m37202g();
            int m37202g4 = c0989b4.m37202g();
            float c3 = c0989b3.c();
            float c4 = c0989b4.c();
            Interpolator d2 = c0989b4.d();
            if (d2 != null) {
                f = d2.getInterpolation(f);
            }
            float f3 = (f - c3) / (c4 - c3);
            return this.f2242f == null ? ((int) (f3 * (m37202g4 - m37202g3))) + m37202g3 : ((Number) this.f2242f.mo37111a(f3, Integer.valueOf(m37202g3), Integer.valueOf(m37202g4))).intValue();
        } else {
            AbstractC0987j.C0989b c0989b5 = (AbstractC0987j.C0989b) this.f2241e.get(0);
            while (true) {
                AbstractC0987j.C0989b c0989b6 = c0989b5;
                if (i >= this.f2237a) {
                    return ((Number) this.f2241e.get(this.f2237a - 1).mo37199b()).intValue();
                }
                c0989b5 = (AbstractC0987j.C0989b) this.f2241e.get(i);
                if (f < c0989b5.c()) {
                    Interpolator d3 = c0989b5.d();
                    if (d3 != null) {
                        f = d3.getInterpolation(f);
                    }
                    float c5 = (f - c0989b6.c()) / (c0989b5.c() - c0989b6.c());
                    int m37202g5 = c0989b6.m37202g();
                    int m37202g6 = c0989b5.m37202g();
                    return this.f2242f == null ? ((int) ((m37202g6 - m37202g5) * c5)) + m37202g5 : ((Number) this.f2242f.mo37111a(c5, Integer.valueOf(m37202g5), Integer.valueOf(m37202g6))).intValue();
                }
                i++;
            }
        }
    }
}
