package com.fimi.soul.drone.p195d.p196a;
/* renamed from: com.fimi.soul.drone.d.a.a */
/* loaded from: classes.dex */
public class C2109a {

    /* renamed from: a */
    private static final int f6254a = 0;

    /* renamed from: b */
    private int f6255b;

    public C2109a() {
        m32880a();
    }

    /* renamed from: a */
    public void m32880a() {
        this.f6255b = 0;
    }

    /* renamed from: a */
    public void m32879a(int i) {
        this.f6255b = ((i & 255) + this.f6255b) % 65535;
    }

    /* renamed from: b */
    public int m32878b() {
        return (this.f6255b >> 8) & 255;
    }

    /* renamed from: b */
    public void m32877b(int i) {
        int i2 = (i & 255) ^ (this.f6255b & 255);
        int i3 = i2 ^ ((i2 << 4) & 255);
        this.f6255b = ((i3 >> 4) & 15) ^ ((((this.f6255b >> 8) & 255) ^ (i3 << 8)) ^ (i3 << 3));
    }

    /* renamed from: c */
    public int m32876c() {
        return this.f6255b & 255;
    }
}
