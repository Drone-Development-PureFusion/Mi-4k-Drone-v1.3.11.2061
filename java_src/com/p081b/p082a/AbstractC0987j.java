package com.p081b.p082a;

import android.view.animation.Interpolator;
/* renamed from: com.b.a.j */
/* loaded from: classes.dex */
public abstract class AbstractC0987j implements Cloneable {

    /* renamed from: a */
    float f2230a;

    /* renamed from: b */
    Class f2231b;

    /* renamed from: d */
    private Interpolator f2233d = null;

    /* renamed from: c */
    boolean f2232c = false;

    /* renamed from: com.b.a.j$a */
    /* loaded from: classes.dex */
    static class C0988a extends AbstractC0987j {

        /* renamed from: d */
        float f2234d;

        C0988a(float f) {
            this.f2230a = f;
            this.f2231b = Float.TYPE;
        }

        C0988a(float f, float f2) {
            this.f2230a = f;
            this.f2234d = f2;
            this.f2231b = Float.TYPE;
            this.f2232c = true;
        }

        @Override // com.p081b.p082a.AbstractC0987j
        /* renamed from: a */
        public void mo37200a(Object obj) {
            if (obj == null || obj.getClass() != Float.class) {
                return;
            }
            this.f2234d = ((Float) obj).floatValue();
            this.f2232c = true;
        }

        @Override // com.p081b.p082a.AbstractC0987j
        /* renamed from: b */
        public Object mo37199b() {
            return Float.valueOf(this.f2234d);
        }

        /* renamed from: g */
        public float m37204g() {
            return this.f2234d;
        }

        @Override // com.p081b.p082a.AbstractC0987j
        /* renamed from: h */
        public C0988a mo37198f() {
            C0988a c0988a = new C0988a(c(), this.f2234d);
            c0988a.a(d());
            return c0988a;
        }
    }

    /* renamed from: com.b.a.j$b */
    /* loaded from: classes.dex */
    static class C0989b extends AbstractC0987j {

        /* renamed from: d */
        int f2235d;

        C0989b(float f) {
            this.f2230a = f;
            this.f2231b = Integer.TYPE;
        }

        C0989b(float f, int i) {
            this.f2230a = f;
            this.f2235d = i;
            this.f2231b = Integer.TYPE;
            this.f2232c = true;
        }

        @Override // com.p081b.p082a.AbstractC0987j
        /* renamed from: a */
        public void mo37200a(Object obj) {
            if (obj == null || obj.getClass() != Integer.class) {
                return;
            }
            this.f2235d = ((Integer) obj).intValue();
            this.f2232c = true;
        }

        @Override // com.p081b.p082a.AbstractC0987j
        /* renamed from: b */
        public Object mo37199b() {
            return Integer.valueOf(this.f2235d);
        }

        /* renamed from: g */
        public int m37202g() {
            return this.f2235d;
        }

        @Override // com.p081b.p082a.AbstractC0987j
        /* renamed from: h */
        public C0989b mo37198f() {
            C0989b c0989b = new C0989b(c(), this.f2235d);
            c0989b.a(d());
            return c0989b;
        }
    }

    /* renamed from: com.b.a.j$c */
    /* loaded from: classes.dex */
    static class C0990c extends AbstractC0987j {

        /* renamed from: d */
        Object f2236d;

        C0990c(float f, Object obj) {
            this.f2230a = f;
            this.f2236d = obj;
            this.f2232c = obj != null;
            this.f2231b = this.f2232c ? obj.getClass() : Object.class;
        }

        @Override // com.p081b.p082a.AbstractC0987j
        /* renamed from: a */
        public void mo37200a(Object obj) {
            this.f2236d = obj;
            this.f2232c = obj != null;
        }

        @Override // com.p081b.p082a.AbstractC0987j
        /* renamed from: b */
        public Object mo37199b() {
            return this.f2236d;
        }

        @Override // com.p081b.p082a.AbstractC0987j
        /* renamed from: g */
        public C0990c mo37198f() {
            C0990c c0990c = new C0990c(c(), this.f2236d);
            c0990c.a(d());
            return c0990c;
        }
    }

    /* renamed from: a */
    public static AbstractC0987j m37215a(float f) {
        return new C0989b(f);
    }

    /* renamed from: a */
    public static AbstractC0987j m37214a(float f, float f2) {
        return new C0988a(f, f2);
    }

    /* renamed from: a */
    public static AbstractC0987j m37213a(float f, int i) {
        return new C0989b(f, i);
    }

    /* renamed from: a */
    public static AbstractC0987j m37212a(float f, Object obj) {
        return new C0990c(f, obj);
    }

    /* renamed from: b */
    public static AbstractC0987j m37210b(float f) {
        return new C0988a(f);
    }

    /* renamed from: c */
    public static AbstractC0987j m37208c(float f) {
        return new C0990c(f, null);
    }

    /* renamed from: a */
    public void m37211a(Interpolator interpolator) {
        this.f2233d = interpolator;
    }

    /* renamed from: a */
    public abstract void mo37200a(Object obj);

    /* renamed from: a */
    public boolean m37216a() {
        return this.f2232c;
    }

    /* renamed from: b */
    public abstract Object mo37199b();

    /* renamed from: c */
    public float m37209c() {
        return this.f2230a;
    }

    /* renamed from: d */
    public Interpolator m37207d() {
        return this.f2233d;
    }

    /* renamed from: d */
    public void m37206d(float f) {
        this.f2230a = f;
    }

    /* renamed from: e */
    public Class m37205e() {
        return this.f2231b;
    }

    @Override // 
    /* renamed from: f */
    public abstract AbstractC0987j clone();
}
