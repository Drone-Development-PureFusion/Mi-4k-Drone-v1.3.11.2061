package com.p081b.p082a;

import android.view.animation.Interpolator;
import com.p081b.p082a.AbstractC0987j;
import java.util.ArrayList;
/* renamed from: com.b.a.g */
/* loaded from: classes.dex */
class C0984g extends C0991k {

    /* renamed from: g */
    private float f2222g;

    /* renamed from: h */
    private float f2223h;

    /* renamed from: i */
    private float f2224i;

    /* renamed from: j */
    private boolean f2225j = true;

    public C0984g(AbstractC0987j.C0988a... c0988aArr) {
        super(c0988aArr);
    }

    @Override // com.p081b.p082a.C0991k
    /* renamed from: a */
    public C0984g clone() {
        ArrayList<AbstractC0987j> arrayList = this.f2241e;
        int size = this.f2241e.size();
        AbstractC0987j.C0988a[] c0988aArr = new AbstractC0987j.C0988a[size];
        for (int i = 0; i < size; i++) {
            c0988aArr[i] = (AbstractC0987j.C0988a) arrayList.get(i).clone();
        }
        return new C0984g(c0988aArr);
    }

    @Override // com.p081b.p082a.C0991k
    /* renamed from: a */
    public Object mo37196a(float f) {
        return Float.valueOf(m37220b(f));
    }

    /* renamed from: b */
    public float m37220b(float f) {
        int i = 1;
        if (this.f2237a == 2) {
            if (this.f2225j) {
                this.f2225j = false;
                this.f2222g = ((AbstractC0987j.C0988a) this.f2241e.get(0)).m37204g();
                this.f2223h = ((AbstractC0987j.C0988a) this.f2241e.get(1)).m37204g();
                this.f2224i = this.f2223h - this.f2222g;
            }
            if (this.f2240d != null) {
                f = this.f2240d.getInterpolation(f);
            }
            return this.f2242f == null ? this.f2222g + (this.f2224i * f) : ((Number) this.f2242f.mo37111a(f, Float.valueOf(this.f2222g), Float.valueOf(this.f2223h))).floatValue();
        } else if (f <= 0.0f) {
            AbstractC0987j.C0988a c0988a = (AbstractC0987j.C0988a) this.f2241e.get(0);
            AbstractC0987j.C0988a c0988a2 = (AbstractC0987j.C0988a) this.f2241e.get(1);
            float m37204g = c0988a.m37204g();
            float m37204g2 = c0988a2.m37204g();
            float c = c0988a.c();
            float c2 = c0988a2.c();
            Interpolator d = c0988a2.d();
            if (d != null) {
                f = d.getInterpolation(f);
            }
            float f2 = (f - c) / (c2 - c);
            return this.f2242f == null ? (f2 * (m37204g2 - m37204g)) + m37204g : ((Number) this.f2242f.mo37111a(f2, Float.valueOf(m37204g), Float.valueOf(m37204g2))).floatValue();
        } else if (f >= 1.0f) {
            AbstractC0987j.C0988a c0988a3 = (AbstractC0987j.C0988a) this.f2241e.get(this.f2237a - 2);
            AbstractC0987j.C0988a c0988a4 = (AbstractC0987j.C0988a) this.f2241e.get(this.f2237a - 1);
            float m37204g3 = c0988a3.m37204g();
            float m37204g4 = c0988a4.m37204g();
            float c3 = c0988a3.c();
            float c4 = c0988a4.c();
            Interpolator d2 = c0988a4.d();
            if (d2 != null) {
                f = d2.getInterpolation(f);
            }
            float f3 = (f - c3) / (c4 - c3);
            return this.f2242f == null ? (f3 * (m37204g4 - m37204g3)) + m37204g3 : ((Number) this.f2242f.mo37111a(f3, Float.valueOf(m37204g3), Float.valueOf(m37204g4))).floatValue();
        } else {
            AbstractC0987j.C0988a c0988a5 = (AbstractC0987j.C0988a) this.f2241e.get(0);
            while (true) {
                AbstractC0987j.C0988a c0988a6 = c0988a5;
                if (i >= this.f2237a) {
                    return ((Number) this.f2241e.get(this.f2237a - 1).mo37199b()).floatValue();
                }
                c0988a5 = (AbstractC0987j.C0988a) this.f2241e.get(i);
                if (f < c0988a5.c()) {
                    Interpolator d3 = c0988a5.d();
                    if (d3 != null) {
                        f = d3.getInterpolation(f);
                    }
                    float c5 = (f - c0988a6.c()) / (c0988a5.c() - c0988a6.c());
                    float m37204g5 = c0988a6.m37204g();
                    float m37204g6 = c0988a5.m37204g();
                    return this.f2242f == null ? ((m37204g6 - m37204g5) * c5) + m37204g5 : ((Number) this.f2242f.mo37111a(c5, Float.valueOf(m37204g5), Float.valueOf(m37204g6))).floatValue();
                }
                i++;
            }
        }
    }
}
