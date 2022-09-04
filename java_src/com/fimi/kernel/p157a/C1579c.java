package com.fimi.kernel.p157a;

import android.graphics.drawable.Drawable;
/* renamed from: com.fimi.kernel.a.c */
/* loaded from: classes.dex */
public class C1579c implements Comparable<C1579c> {

    /* renamed from: a */
    public String f3884a;

    /* renamed from: b */
    public String f3885b;

    /* renamed from: c */
    public int f3886c;

    /* renamed from: d */
    public int f3887d;

    /* renamed from: e */
    public Drawable f3888e;

    /* renamed from: f */
    public long f3889f;

    /* renamed from: g */
    public String f3890g;

    /* renamed from: h */
    public String f3891h;

    /* renamed from: i */
    public String f3892i;

    public C1579c() {
    }

    public C1579c(String str, int i, int i2) {
        this.f3885b = str;
        this.f3886c = i;
        this.f3887d = i2;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(C1579c c1579c) {
        if (this.f3885b.compareTo(c1579c.f3885b) == 0) {
            if (this.f3889f < c1579c.f3889f) {
                return 1;
            }
            return this.f3889f == c1579c.f3889f ? 0 : -1;
        }
        return this.f3885b.compareTo(c1579c.f3885b);
    }
}
