package com.fimi.soul.drone.p195d.p196a.p197a;

import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
/* renamed from: com.fimi.soul.drone.d.a.a.br */
/* loaded from: classes.dex */
public class C2155br extends AbstractC2195b {

    /* renamed from: a */
    public static final int f6614a = 98;

    /* renamed from: c */
    public static final int f6615c = 3;
    private static final long serialVersionUID = 98;

    /* renamed from: d */
    public byte f6616d;

    /* renamed from: e */
    public byte f6617e;

    /* renamed from: f */
    public byte f6618f;

    /* renamed from: g */
    public C2196c f6619g;

    public C2155br() {
        this.f6910b = 98;
    }

    public C2155br(C2196c c2196c) {
        this.f6910b = 98;
        this.f6619g = c2196c;
        mo32763a(c2196c.f6914d);
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        c2197d.m32741c();
        this.f6616d = c2197d.m32739d();
        this.f6617e = c2197d.m32739d();
        this.f6618f = c2197d.m32739d();
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 3;
        c2196c.f6913c = 98;
        c2196c.f6914d.m32744b(this.f6616d);
        c2196c.f6914d.m32744b(this.f6617e);
        c2196c.f6914d.m32744b(this.f6618f);
        return c2196c;
    }

    public String toString() {
        return "msg_sendinfocontrol [model=" + ((int) this.f6616d) + ", status=" + ((int) this.f6617e) + ", msgid=" + this.f6910b + ", pack()=" + mo32762b() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }
}
