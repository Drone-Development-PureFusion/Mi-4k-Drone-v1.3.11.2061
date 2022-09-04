package com.fimi.soul.drone.p195d.p196a.p197a;

import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
/* renamed from: com.fimi.soul.drone.d.a.a.s */
/* loaded from: classes.dex */
public class C2187s extends AbstractC2195b {

    /* renamed from: a */
    public C2196c f6833a;

    /* renamed from: c */
    private int f6834c;

    /* renamed from: d */
    private int f6835d;

    /* renamed from: e */
    private short f6836e;

    /* renamed from: f */
    private int f6837f;

    public C2187s(C2196c c2196c) {
        this.f6833a = c2196c;
        this.f6910b = 9;
        mo32763a(c2196c.f6914d);
    }

    /* renamed from: a */
    public int m32767a() {
        return this.f6834c;
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        c2197d.m32741c();
        this.f6834c = c2197d.m32737f();
        this.f6835d = c2197d.m32737f();
        this.f6836e = c2197d.m32738e();
        this.f6837f = c2197d.m32737f();
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        return new C2196c();
    }

    /* renamed from: c */
    public int m32766c() {
        return this.f6835d;
    }

    /* renamed from: d */
    public int m32765d() {
        return this.f6837f;
    }

    /* renamed from: e */
    public short m32764e() {
        return this.f6836e;
    }

    public String toString() {
        return "selfError" + this.f6834c;
    }
}
