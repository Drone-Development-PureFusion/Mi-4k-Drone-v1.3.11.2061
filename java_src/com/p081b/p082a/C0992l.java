package com.p081b.p082a;

import android.view.View;
import com.p081b.p083b.AbstractC1026d;
import com.p081b.p084c.p085a.C1030a;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.b.a.l */
/* loaded from: classes.dex */
public final class C0992l extends C1015q {

    /* renamed from: p */
    private static final boolean f2243p = false;

    /* renamed from: q */
    private static final Map<String, AbstractC1026d> f2244q = new HashMap();

    /* renamed from: r */
    private Object f2245r;

    /* renamed from: s */
    private String f2246s;

    /* renamed from: t */
    private AbstractC1026d f2247t;

    static {
        f2244q.put("alpha", C0993m.f2248a);
        f2244q.put("pivotX", C0993m.f2249b);
        f2244q.put("pivotY", C0993m.f2250c);
        f2244q.put("translationX", C0993m.f2251d);
        f2244q.put("translationY", C0993m.f2252e);
        f2244q.put("rotation", C0993m.f2253f);
        f2244q.put("rotationX", C0993m.f2254g);
        f2244q.put("rotationY", C0993m.f2255h);
        f2244q.put("scaleX", C0993m.f2256i);
        f2244q.put("scaleY", C0993m.f2257j);
        f2244q.put("scrollX", C0993m.f2258k);
        f2244q.put("scrollY", C0993m.f2259l);
        f2244q.put("x", C0993m.f2260m);
        f2244q.put("y", C0993m.f2261n);
    }

    public C0992l() {
    }

    private <T> C0992l(T t, AbstractC1026d<T, ?> abstractC1026d) {
        this.f2245r = t;
        m37189a((AbstractC1026d) abstractC1026d);
    }

    private C0992l(Object obj, String str) {
        this.f2245r = obj;
        m37180a(str);
    }

    /* renamed from: a */
    public static <T, V> C0992l m37187a(T t, AbstractC1026d<T, V> abstractC1026d, AbstractC1014p<V> abstractC1014p, V... vArr) {
        C0992l c0992l = new C0992l(t, abstractC1026d);
        c0992l.mo37086a((Object[]) vArr);
        c0992l.a((AbstractC1014p) abstractC1014p);
        return c0992l;
    }

    /* renamed from: a */
    public static <T> C0992l m37186a(T t, AbstractC1026d<T, Float> abstractC1026d, float... fArr) {
        C0992l c0992l = new C0992l(t, abstractC1026d);
        c0992l.mo37089a(fArr);
        return c0992l;
    }

    /* renamed from: a */
    public static <T> C0992l m37185a(T t, AbstractC1026d<T, Integer> abstractC1026d, int... iArr) {
        C0992l c0992l = new C0992l(t, abstractC1026d);
        c0992l.mo37088a(iArr);
        return c0992l;
    }

    /* renamed from: a */
    public static C0992l m37184a(Object obj, String str, AbstractC1014p abstractC1014p, Object... objArr) {
        C0992l c0992l = new C0992l(obj, str);
        c0992l.mo37086a(objArr);
        c0992l.a(abstractC1014p);
        return c0992l;
    }

    /* renamed from: a */
    public static C0992l m37183a(Object obj, String str, float... fArr) {
        C0992l c0992l = new C0992l(obj, str);
        c0992l.mo37089a(fArr);
        return c0992l;
    }

    /* renamed from: a */
    public static C0992l m37182a(Object obj, String str, int... iArr) {
        C0992l c0992l = new C0992l(obj, str);
        c0992l.mo37088a(iArr);
        return c0992l;
    }

    /* renamed from: a */
    public static C0992l m37181a(Object obj, C1008n... c1008nArr) {
        C0992l c0992l = new C0992l();
        c0992l.f2245r = obj;
        c0992l.b(c1008nArr);
        return c0992l;
    }

    @Override // com.p081b.p082a.C1015q, com.p081b.p082a.AbstractC0971a
    /* renamed from: a */
    public void mo37101a() {
        super.mo37101a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.p081b.p082a.C1015q
    /* renamed from: a */
    public void mo37100a(float f) {
        super.mo37100a(f);
        int length = this.f2322k.length;
        for (int i = 0; i < length; i++) {
            this.f2322k[i].mo37115d(this.f2245r);
        }
    }

    /* renamed from: a */
    public void m37189a(AbstractC1026d abstractC1026d) {
        if (this.f2322k != null) {
            C1008n c1008n = this.f2322k[0];
            String m37124c = c1008n.m37124c();
            c1008n.m37144a(abstractC1026d);
            this.f2323l.remove(m37124c);
            this.f2323l.put(this.f2246s, c1008n);
        }
        if (this.f2247t != null) {
            this.f2246s = abstractC1026d.m37041b();
        }
        this.f2247t = abstractC1026d;
        this.f2321j = false;
    }

    @Override // com.p081b.p082a.AbstractC0971a
    /* renamed from: a */
    public void mo37188a(Object obj) {
        if (this.f2245r != obj) {
            Object obj2 = this.f2245r;
            this.f2245r = obj;
            if (obj2 != null && obj != null && obj2.getClass() == obj.getClass()) {
                return;
            }
            this.f2321j = false;
        }
    }

    /* renamed from: a */
    public void m37180a(String str) {
        if (this.f2322k != null) {
            C1008n c1008n = this.f2322k[0];
            String m37124c = c1008n.m37124c();
            c1008n.m37135a(str);
            this.f2323l.remove(m37124c);
            this.f2323l.put(str, c1008n);
        }
        this.f2246s = str;
        this.f2321j = false;
    }

    @Override // com.p081b.p082a.C1015q
    /* renamed from: a */
    public void mo37089a(float... fArr) {
        if (this.f2322k != null && this.f2322k.length != 0) {
            super.mo37089a(fArr);
        } else if (this.f2247t != null) {
            b(C1008n.m37142a(this.f2247t, fArr));
        } else {
            b(C1008n.m37132a(this.f2246s, fArr));
        }
    }

    @Override // com.p081b.p082a.C1015q
    /* renamed from: a */
    public void mo37088a(int... iArr) {
        if (this.f2322k != null && this.f2322k.length != 0) {
            super.mo37088a(iArr);
        } else if (this.f2247t != null) {
            b(C1008n.m37141a((AbstractC1026d<?, Integer>) this.f2247t, iArr));
        } else {
            b(C1008n.m37131a(this.f2246s, iArr));
        }
    }

    @Override // com.p081b.p082a.C1015q
    /* renamed from: a */
    public void mo37086a(Object... objArr) {
        if (this.f2322k != null && this.f2322k.length != 0) {
            super.mo37086a(objArr);
        } else if (this.f2247t != null) {
            b(C1008n.m37143a(this.f2247t, (AbstractC1014p) null, objArr));
        } else {
            b(C1008n.m37134a(this.f2246s, (AbstractC1014p) null, objArr));
        }
    }

    @Override // com.p081b.p082a.C1015q
    /* renamed from: a_ */
    public C0992l mo37072d(long j) {
        super.mo37083b(j);
        return this;
    }

    @Override // com.p081b.p082a.AbstractC0971a
    /* renamed from: k */
    public void mo37178k() {
        mo37063n();
        int length = this.f2322k.length;
        for (int i = 0; i < length; i++) {
            this.f2322k[i].m37125b(this.f2245r);
        }
    }

    @Override // com.p081b.p082a.AbstractC0971a
    /* renamed from: l */
    public void mo37177l() {
        mo37063n();
        int length = this.f2322k.length;
        for (int i = 0; i < length; i++) {
            this.f2322k[i].m37123c(this.f2245r);
        }
    }

    /* renamed from: m */
    public String m37176m() {
        return this.f2246s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.p081b.p082a.C1015q
    /* renamed from: n */
    public void mo37063n() {
        if (!this.f2321j) {
            if (this.f2247t == null && C1030a.f2333a && (this.f2245r instanceof View) && f2244q.containsKey(this.f2246s)) {
                m37189a(f2244q.get(this.f2246s));
            }
            int length = this.f2322k.length;
            for (int i = 0; i < length; i++) {
                this.f2322k[i].m37137a(this.f2245r);
            }
            super.mo37063n();
        }
    }

    /* renamed from: o */
    public Object m37175o() {
        return this.f2245r;
    }

    @Override // com.p081b.p082a.C1015q
    /* renamed from: p */
    public C0992l mo37061q() {
        return (C0992l) super.mo37065j();
    }

    @Override // com.p081b.p082a.C1015q
    public String toString() {
        String str = "ObjectAnimator@" + Integer.toHexString(hashCode()) + ", target " + this.f2245r;
        if (this.f2322k != null) {
            for (int i = 0; i < this.f2322k.length; i++) {
                str = str + "\n    " + this.f2322k[i].toString();
            }
        }
        return str;
    }
}
