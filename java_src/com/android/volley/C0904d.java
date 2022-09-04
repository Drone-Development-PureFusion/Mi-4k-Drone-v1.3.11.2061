package com.android.volley;
/* renamed from: com.android.volley.d */
/* loaded from: classes.dex */
public class C0904d implements AbstractC0928r {

    /* renamed from: a */
    public static final int f1994a = 2500;

    /* renamed from: b */
    public static final int f1995b = 0;

    /* renamed from: c */
    public static final float f1996c = 1.0f;

    /* renamed from: d */
    private int f1997d;

    /* renamed from: e */
    private int f1998e;

    /* renamed from: f */
    private final int f1999f;

    /* renamed from: g */
    private final float f2000g;

    public C0904d() {
        this(f1994a, 0, 1.0f);
    }

    public C0904d(int i, int i2, float f) {
        this.f1997d = i;
        this.f1999f = i2;
        this.f2000g = f;
    }

    @Override // com.android.volley.AbstractC0928r
    /* renamed from: a */
    public int mo37378a() {
        return this.f1997d;
    }

    @Override // com.android.volley.AbstractC0928r
    /* renamed from: a */
    public void mo37377a(C0967u c0967u) {
        this.f1998e++;
        this.f1997d = (int) (this.f1997d + (this.f1997d * this.f2000g));
        if (!m37438d()) {
            throw c0967u;
        }
    }

    @Override // com.android.volley.AbstractC0928r
    /* renamed from: b */
    public int mo37376b() {
        return this.f1998e;
    }

    /* renamed from: c */
    public float m37439c() {
        return this.f2000g;
    }

    /* renamed from: d */
    protected boolean m37438d() {
        return this.f1998e <= this.f1999f;
    }
}
