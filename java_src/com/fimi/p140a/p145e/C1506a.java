package com.fimi.p140a.p145e;
/* renamed from: com.fimi.a.e.a */
/* loaded from: classes.dex */
public class C1506a {

    /* renamed from: a */
    private static final int f3604a = 0;

    /* renamed from: b */
    private int f3605b;

    public C1506a() {
        m35490a();
    }

    /* renamed from: a */
    public void m35490a() {
        this.f3605b = 0;
    }

    /* renamed from: a */
    public void m35489a(int i) {
        this.f3605b = ((i & 255) + this.f3605b) % 65535;
    }

    /* renamed from: b */
    public int m35488b() {
        return (this.f3605b >> 8) & 255;
    }

    /* renamed from: b */
    public void m35487b(int i) {
        int i2 = (i & 255) ^ (this.f3605b & 255);
        int i3 = i2 ^ ((i2 << 4) & 255);
        this.f3605b = ((i3 >> 4) & 15) ^ ((((this.f3605b >> 8) & 255) ^ (i3 << 8)) ^ (i3 << 3));
    }

    /* renamed from: c */
    public int m35486c() {
        return this.f3605b & 255;
    }
}
