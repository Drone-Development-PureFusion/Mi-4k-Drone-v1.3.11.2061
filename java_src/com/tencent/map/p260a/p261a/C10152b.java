package com.tencent.map.p260a.p261a;

import com.tencent.map.p262b.C10183h;
/* renamed from: com.tencent.map.a.a.b */
/* loaded from: classes2.dex */
public class C10152b {

    /* renamed from: a */
    private int f31318a;

    /* renamed from: b */
    private int f31319b;

    /* renamed from: c */
    private int f31320c;

    /* renamed from: d */
    private int f31321d;

    public C10152b(int i, int i2, int i3, int i4) {
        this.f31318a = 1;
        this.f31319b = 0;
        this.f31320c = 12;
        this.f31321d = 1;
        C10183h.m5928a("argument: " + this.f31318a + " " + this.f31321d + " " + this.f31319b);
        if (i >= 0 && i <= 1) {
            this.f31318a = i;
        }
        if (i2 >= 0 && i2 <= 1) {
            this.f31321d = i2;
        }
        if (i3 == 0 || i3 == 3 || i3 == 4 || i3 == 7) {
            this.f31319b = i3;
        }
        if (this.f31321d == 0) {
            this.f31319b = 0;
        }
        this.f31320c = i4;
    }

    /* renamed from: a */
    public int m6048a() {
        return this.f31318a;
    }

    /* renamed from: a */
    public void mo5614a(int i) {
    }

    /* renamed from: a */
    public void mo5613a(C10154d c10154d) {
    }

    /* renamed from: a */
    public void mo5612a(byte[] bArr, int i) {
    }

    /* renamed from: b */
    public int m6047b() {
        return this.f31319b;
    }

    /* renamed from: c */
    public int m6046c() {
        return this.f31321d;
    }
}
