package com.fimi.soul.drone.p195d.p196a.p197a;

import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
import java.io.Serializable;
/* renamed from: com.fimi.soul.drone.d.a.a.l */
/* loaded from: classes.dex */
public class C2180l extends AbstractC2195b implements Serializable {

    /* renamed from: e */
    private byte[] f6779e;

    /* renamed from: f */
    private byte f6780f;

    /* renamed from: g */
    private byte f6781g;

    /* renamed from: h */
    private byte f6782h;

    /* renamed from: i */
    private byte f6783i;

    /* renamed from: k */
    private byte f6785k;

    /* renamed from: l */
    private byte f6786l;

    /* renamed from: m */
    private byte f6787m;

    /* renamed from: a */
    public final int f6776a = 136;

    /* renamed from: c */
    private byte f6777c = 19;

    /* renamed from: d */
    private byte[] f6778d = new byte[2];

    /* renamed from: j */
    private byte f6784j = 0;

    /* renamed from: n */
    private boolean f6788n = false;

    /* renamed from: o */
    private boolean f6789o = true;

    /* renamed from: p */
    private boolean f6790p = false;

    public C2180l() {
        this.f6910b = 136;
    }

    /* renamed from: o */
    private C2196c m32800o() {
        C2196c c2196c = new C2196c();
        c2196c.f6913c = 136;
        if (this.f6789o) {
            c2196c.f6912b = 19;
            if (this.f6779e != null && this.f6779e.length > 0) {
                for (byte b : this.f6779e) {
                    c2196c.f6914d.m32744b(b);
                }
            }
        } else {
            c2196c.f6912b = 10;
            c2196c.f6914d.m32744b((byte) 0);
            c2196c.f6914d.m32744b((byte) 0);
            c2196c.f6914d.m32744b((byte) 13);
            c2196c.f6914d.m32744b((byte) 1);
            c2196c.f6914d.m32744b(this.f6784j);
            c2196c.f6914d.m32744b((byte) 0);
            c2196c.f6914d.m32744b((byte) 0);
            c2196c.f6914d.m32744b((byte) 0);
            c2196c.f6914d.m32744b(this.f6786l);
            c2196c.f6914d.m32744b((byte) 0);
        }
        return c2196c;
    }

    /* renamed from: p */
    private C2196c m32799p() {
        C2196c c2196c = new C2196c();
        c2196c.f6913c = 136;
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 13);
        if (this.f6789o) {
            c2196c.f6914d.m32744b((byte) 0);
            if (this.f6790p) {
                c2196c.f6912b = 26;
                c2196c.f6914d.m32744b((byte) 0);
            } else {
                c2196c.f6912b = 36;
                c2196c.f6914d.m32744b((byte) 1);
            }
        } else {
            c2196c.f6912b = 10;
            c2196c.f6914d.m32744b((byte) 1);
            c2196c.f6914d.m32744b((byte) 0);
        }
        c2196c.f6914d.m32744b(this.f6778d[0]);
        c2196c.f6914d.m32744b(this.f6778d[1]);
        if (!this.f6789o) {
            c2196c.f6914d.m32744b((byte) 0);
            c2196c.f6914d.m32744b((byte) 0);
            c2196c.f6914d.m32744b((byte) 0);
        } else if (this.f6779e != null && this.f6779e.length > 0) {
            for (byte b : this.f6779e) {
                c2196c.f6914d.m32744b(b);
            }
        }
        return c2196c;
    }

    /* renamed from: a */
    public void m32826a(byte b) {
        this.f6777c = b;
    }

    /* renamed from: a */
    public void m32825a(C2196c c2196c) {
        mo32763a(c2196c.f6914d);
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        c2197d.m32741c();
        this.f6781g = c2197d.m32739d();
        this.f6780f = c2197d.m32739d();
        this.f6782h = c2197d.m32739d();
        this.f6783i = c2197d.m32739d();
        this.f6784j = c2197d.m32739d();
        this.f6778d[0] = c2197d.m32739d();
        this.f6778d[1] = c2197d.m32739d();
        this.f6785k = c2197d.m32739d();
        this.f6786l = c2197d.m32739d();
        this.f6787m = c2197d.m32739d();
        byte[] bArr = {this.f6781g, this.f6780f, this.f6782h, this.f6783i, m32804k(), this.f6778d[0], this.f6778d[1], this.f6785k, this.f6786l, this.f6787m};
    }

    /* renamed from: a */
    public void m32824a(boolean z) {
        this.f6788n = z;
    }

    /* renamed from: a */
    public void m32823a(byte[] bArr) {
        this.f6778d = bArr;
    }

    /* renamed from: a */
    public boolean m32827a() {
        return this.f6788n;
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        return this.f6788n ? m32799p() : m32800o();
    }

    /* renamed from: b */
    public void m32822b(byte b) {
        this.f6783i = b;
    }

    /* renamed from: b */
    public void m32821b(boolean z) {
        this.f6790p = z;
    }

    /* renamed from: b */
    public void m32820b(byte[] bArr) {
        this.f6779e = bArr;
    }

    /* renamed from: c */
    public void m32818c(byte b) {
        this.f6780f = b;
    }

    /* renamed from: c */
    public void m32817c(boolean z) {
        this.f6789o = z;
    }

    /* renamed from: c */
    public boolean m32819c() {
        return this.f6790p;
    }

    /* renamed from: d */
    public void m32815d(byte b) {
        this.f6782h = b;
    }

    /* renamed from: d */
    public boolean m32816d() {
        return this.f6789o;
    }

    /* renamed from: e */
    public byte m32814e() {
        return this.f6777c;
    }

    /* renamed from: e */
    public void m32813e(byte b) {
        this.f6784j = b;
    }

    /* renamed from: f */
    public void m32811f(byte b) {
        this.f6785k = b;
    }

    /* renamed from: f */
    public byte[] m32812f() {
        return this.f6778d;
    }

    /* renamed from: g */
    public byte m32810g() {
        return this.f6783i;
    }

    /* renamed from: g */
    public void m32809g(byte b) {
        this.f6786l = b;
    }

    /* renamed from: h */
    public void m32807h(byte b) {
        this.f6787m = b;
    }

    /* renamed from: h */
    public byte[] m32808h() {
        return this.f6779e;
    }

    /* renamed from: i */
    public byte m32806i() {
        return this.f6780f;
    }

    /* renamed from: j */
    public byte m32805j() {
        return this.f6782h;
    }

    /* renamed from: k */
    public byte m32804k() {
        return this.f6784j;
    }

    /* renamed from: l */
    public byte m32803l() {
        return this.f6785k;
    }

    /* renamed from: m */
    public byte m32802m() {
        return this.f6786l;
    }

    /* renamed from: n */
    public byte m32801n() {
        return this.f6787m;
    }
}
