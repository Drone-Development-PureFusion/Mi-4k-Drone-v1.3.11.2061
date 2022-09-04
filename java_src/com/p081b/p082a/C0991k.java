package com.p081b.p082a;

import android.view.animation.Interpolator;
import com.p081b.p082a.AbstractC0987j;
import java.util.ArrayList;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.b.a.k */
/* loaded from: classes.dex */
public class C0991k {

    /* renamed from: a */
    int f2237a;

    /* renamed from: c */
    AbstractC0987j f2239c;

    /* renamed from: d */
    Interpolator f2240d;

    /* renamed from: f */
    AbstractC1014p f2242f;

    /* renamed from: e */
    ArrayList<AbstractC0987j> f2241e = new ArrayList<>();

    /* renamed from: b */
    AbstractC0987j f2238b = this.f2241e.get(0);

    public C0991k(AbstractC0987j... abstractC0987jArr) {
        this.f2237a = abstractC0987jArr.length;
        this.f2241e.addAll(Arrays.asList(abstractC0987jArr));
        this.f2239c = this.f2241e.get(this.f2237a - 1);
        this.f2240d = this.f2239c.m37207d();
    }

    /* renamed from: a */
    public static C0991k m37194a(float... fArr) {
        int length = fArr.length;
        AbstractC0987j.C0988a[] c0988aArr = new AbstractC0987j.C0988a[Math.max(length, 2)];
        if (length == 1) {
            c0988aArr[0] = (AbstractC0987j.C0988a) AbstractC0987j.m37210b(0.0f);
            c0988aArr[1] = (AbstractC0987j.C0988a) AbstractC0987j.m37214a(1.0f, fArr[0]);
        } else {
            c0988aArr[0] = (AbstractC0987j.C0988a) AbstractC0987j.m37214a(0.0f, fArr[0]);
            for (int i = 1; i < length; i++) {
                c0988aArr[i] = (AbstractC0987j.C0988a) AbstractC0987j.m37214a(i / (length - 1), fArr[i]);
            }
        }
        return new C0984g(c0988aArr);
    }

    /* renamed from: a */
    public static C0991k m37193a(int... iArr) {
        int length = iArr.length;
        AbstractC0987j.C0989b[] c0989bArr = new AbstractC0987j.C0989b[Math.max(length, 2)];
        if (length == 1) {
            c0989bArr[0] = (AbstractC0987j.C0989b) AbstractC0987j.m37215a(0.0f);
            c0989bArr[1] = (AbstractC0987j.C0989b) AbstractC0987j.m37213a(1.0f, iArr[0]);
        } else {
            c0989bArr[0] = (AbstractC0987j.C0989b) AbstractC0987j.m37213a(0.0f, iArr[0]);
            for (int i = 1; i < length; i++) {
                c0989bArr[i] = (AbstractC0987j.C0989b) AbstractC0987j.m37213a(i / (length - 1), iArr[i]);
            }
        }
        return new C0986i(c0989bArr);
    }

    /* renamed from: a */
    public static C0991k m37192a(AbstractC0987j... abstractC0987jArr) {
        int length = abstractC0987jArr.length;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (int i = 0; i < length; i++) {
            if (abstractC0987jArr[i] instanceof AbstractC0987j.C0988a) {
                z3 = true;
            } else if (abstractC0987jArr[i] instanceof AbstractC0987j.C0989b) {
                z2 = true;
            } else {
                z = true;
            }
        }
        if (z3 && !z2 && !z) {
            AbstractC0987j.C0988a[] c0988aArr = new AbstractC0987j.C0988a[length];
            for (int i2 = 0; i2 < length; i2++) {
                c0988aArr[i2] = (AbstractC0987j.C0988a) abstractC0987jArr[i2];
            }
            return new C0984g(c0988aArr);
        } else if (!z2 || z3 || z) {
            return new C0991k(abstractC0987jArr);
        } else {
            AbstractC0987j.C0989b[] c0989bArr = new AbstractC0987j.C0989b[length];
            for (int i3 = 0; i3 < length; i3++) {
                c0989bArr[i3] = (AbstractC0987j.C0989b) abstractC0987jArr[i3];
            }
            return new C0986i(c0989bArr);
        }
    }

    /* renamed from: a */
    public static C0991k m37191a(Object... objArr) {
        int length = objArr.length;
        AbstractC0987j.C0990c[] c0990cArr = new AbstractC0987j.C0990c[Math.max(length, 2)];
        if (length == 1) {
            c0990cArr[0] = (AbstractC0987j.C0990c) AbstractC0987j.m37208c(0.0f);
            c0990cArr[1] = (AbstractC0987j.C0990c) AbstractC0987j.m37212a(1.0f, objArr[0]);
        } else {
            c0990cArr[0] = (AbstractC0987j.C0990c) AbstractC0987j.m37212a(0.0f, objArr[0]);
            for (int i = 1; i < length; i++) {
                c0990cArr[i] = (AbstractC0987j.C0990c) AbstractC0987j.m37212a(i / (length - 1), objArr[i]);
            }
        }
        return new C0991k(c0990cArr);
    }

    /* renamed from: a */
    public Object mo37196a(float f) {
        if (this.f2237a == 2) {
            if (this.f2240d != null) {
                f = this.f2240d.getInterpolation(f);
            }
            return this.f2242f.mo37111a(f, this.f2238b.mo37199b(), this.f2239c.mo37199b());
        } else if (f <= 0.0f) {
            AbstractC0987j abstractC0987j = this.f2241e.get(1);
            Interpolator m37207d = abstractC0987j.m37207d();
            if (m37207d != null) {
                f = m37207d.getInterpolation(f);
            }
            float m37209c = this.f2238b.m37209c();
            return this.f2242f.mo37111a((f - m37209c) / (abstractC0987j.m37209c() - m37209c), this.f2238b.mo37199b(), abstractC0987j.mo37199b());
        } else if (f >= 1.0f) {
            AbstractC0987j abstractC0987j2 = this.f2241e.get(this.f2237a - 2);
            Interpolator m37207d2 = this.f2239c.m37207d();
            if (m37207d2 != null) {
                f = m37207d2.getInterpolation(f);
            }
            float m37209c2 = abstractC0987j2.m37209c();
            return this.f2242f.mo37111a((f - m37209c2) / (this.f2239c.m37209c() - m37209c2), abstractC0987j2.mo37199b(), this.f2239c.mo37199b());
        } else {
            AbstractC0987j abstractC0987j3 = this.f2238b;
            int i = 1;
            while (i < this.f2237a) {
                AbstractC0987j abstractC0987j4 = this.f2241e.get(i);
                if (f < abstractC0987j4.m37209c()) {
                    Interpolator m37207d3 = abstractC0987j4.m37207d();
                    if (m37207d3 != null) {
                        f = m37207d3.getInterpolation(f);
                    }
                    float m37209c3 = abstractC0987j3.m37209c();
                    return this.f2242f.mo37111a((f - m37209c3) / (abstractC0987j4.m37209c() - m37209c3), abstractC0987j3.mo37199b(), abstractC0987j4.mo37199b());
                }
                i++;
                abstractC0987j3 = abstractC0987j4;
            }
            return this.f2239c.mo37199b();
        }
    }

    /* renamed from: a */
    public void m37195a(AbstractC1014p abstractC1014p) {
        this.f2242f = abstractC1014p;
    }

    @Override // 
    /* renamed from: b */
    public C0991k clone() {
        ArrayList<AbstractC0987j> arrayList = this.f2241e;
        int size = this.f2241e.size();
        AbstractC0987j[] abstractC0987jArr = new AbstractC0987j[size];
        for (int i = 0; i < size; i++) {
            abstractC0987jArr[i] = arrayList.get(i).clone();
        }
        return new C0991k(abstractC0987jArr);
    }

    public String toString() {
        String str = " ";
        int i = 0;
        while (i < this.f2237a) {
            String str2 = str + this.f2241e.get(i).mo37199b() + "  ";
            i++;
            str = str2;
        }
        return str;
    }
}
