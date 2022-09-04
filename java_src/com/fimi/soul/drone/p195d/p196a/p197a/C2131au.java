package com.fimi.soul.drone.p195d.p196a.p197a;

import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.soul.drone.d.a.a.au */
/* loaded from: classes.dex */
public class C2131au extends AbstractC2195b {

    /* renamed from: a */
    public static final int f6439a = 193;

    /* renamed from: c */
    public static final int f6440c = 22;
    private static final long serialVersionUID = 193;

    /* renamed from: d */
    public byte f6441d;

    /* renamed from: e */
    public byte f6442e;

    /* renamed from: f */
    public char f6443f;

    /* renamed from: g */
    public short f6444g;

    /* renamed from: h */
    public long f6445h;

    /* renamed from: i */
    public long f6446i;

    /* renamed from: j */
    public long f6447j;

    /* renamed from: k */
    public long f6448k;

    /* renamed from: l */
    public C2196c f6449l;

    public C2131au() {
        this.f6910b = 193;
    }

    public C2131au(C2196c c2196c) {
        this.f6910b = 193;
        this.f6449l = c2196c;
        mo32763a(c2196c.f6914d);
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        c2197d.m32741c();
        this.f6441d = c2197d.m32739d();
        this.f6442e = c2197d.m32739d();
        this.f6443f = c2197d.m32731l();
        this.f6444g = c2197d.m32738e();
        this.f6445h = c2197d.m32730m();
        this.f6446i = c2197d.m32730m();
        this.f6447j = c2197d.m32730m();
        this.f6448k = c2197d.m32730m();
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 22;
        c2196c.f6913c = 193;
        c2196c.f6914d.m32744b(this.f6441d);
        c2196c.f6914d.m32744b(this.f6442e);
        c2196c.f6914d.m32751a(this.f6443f);
        c2196c.f6914d.m32746a(this.f6444g);
        c2196c.f6914d.m32747a(this.f6445h);
        c2196c.f6914d.m32747a(this.f6446i);
        c2196c.f6914d.m32747a(this.f6447j);
        c2196c.f6914d.m32747a(this.f6448k);
        return c2196c;
    }

    public String toString() {
        return "msg_FCAnswerDownlink{type=" + ((int) this.f6441d) + ", Model=" + ((int) this.f6442e) + ", FC_hardware_version=" + this.f6443f + ", Software_version=" + ((int) this.f6444g) + ", IDA=" + this.f6445h + ", IDB=" + this.f6446i + ", IDC=" + this.f6447j + ", reserve=" + this.f6448k + C0494h.f735w;
    }
}
