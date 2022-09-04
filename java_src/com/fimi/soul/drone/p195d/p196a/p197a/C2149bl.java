package com.fimi.soul.drone.p195d.p196a.p197a;

import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.soul.drone.d.a.a.bl */
/* loaded from: classes.dex */
public class C2149bl extends AbstractC2195b {

    /* renamed from: a */
    public static final int f6567a = 193;

    /* renamed from: c */
    public static final int f6568c = 10;
    private static final long serialVersionUID = 193;

    /* renamed from: d */
    public byte f6569d;

    /* renamed from: e */
    public byte f6570e;

    /* renamed from: f */
    public byte f6571f;

    /* renamed from: g */
    public byte f6572g;

    /* renamed from: j */
    public byte f6575j;

    /* renamed from: l */
    public byte f6577l;

    /* renamed from: h */
    public byte f6573h = 0;

    /* renamed from: i */
    public byte f6574i = 2;

    /* renamed from: k */
    public byte f6576k = 2;

    /* renamed from: m */
    public byte f6578m = 6;

    public C2149bl() {
        this.f6910b = 193;
    }

    public C2149bl(C2196c c2196c) {
        this.f6910b = 193;
        mo32763a(c2196c.f6914d);
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        c2197d.m32741c();
        this.f6569d = c2197d.m32739d();
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 10;
        c2196c.f6913c = 193;
        c2196c.f6914d.m32744b(this.f6569d);
        c2196c.f6914d.m32744b(this.f6570e);
        c2196c.f6914d.m32744b(this.f6571f);
        c2196c.f6914d.m32744b(this.f6572g);
        c2196c.f6914d.m32744b(this.f6573h);
        c2196c.f6914d.m32744b(this.f6574i);
        c2196c.f6914d.m32744b(this.f6575j);
        c2196c.f6914d.m32744b(this.f6576k);
        c2196c.f6914d.m32744b(this.f6577l);
        c2196c.f6914d.m32744b(this.f6578m);
        return c2196c;
    }

    public String toString() {
        return "msg_RequestVersionUplink{Type=" + ((int) this.f6569d) + ", app_main_version=" + ((int) this.f6570e) + ", app_sub_version=" + ((int) this.f6571f) + ", app_patch_version=" + ((int) this.f6572g) + ", reserved=" + ((int) this.f6573h) + ", app_project_id=" + ((int) this.f6574i) + ", reserved2=" + ((int) this.f6575j) + ", app_paform=" + ((int) this.f6576k) + ", app_type=" + ((int) this.f6577l) + ", app_compability=" + ((int) this.f6578m) + C0494h.f735w;
    }
}
