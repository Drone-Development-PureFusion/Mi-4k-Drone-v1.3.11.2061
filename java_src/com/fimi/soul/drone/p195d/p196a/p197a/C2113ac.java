package com.fimi.soul.drone.p195d.p196a.p197a;

import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
import java.io.Serializable;
/* renamed from: com.fimi.soul.drone.d.a.a.ac */
/* loaded from: classes.dex */
public class C2113ac extends AbstractC2195b implements Serializable {

    /* renamed from: a */
    static final byte f6274a = 10;

    /* renamed from: c */
    static final byte f6275c = 108;

    /* renamed from: d */
    static final byte f6276d = 1;

    /* renamed from: e */
    static final byte f6277e = 11;

    /* renamed from: f */
    static final byte f6278f = 1;

    /* renamed from: g */
    public static final byte f6279g = 8;

    /* renamed from: h */
    public static final byte f6280h = 9;

    /* renamed from: i */
    byte f6281i = 8;

    /* renamed from: j */
    byte f6282j = f6277e;

    /* renamed from: k */
    public byte f6283k;

    /* renamed from: l */
    public byte f6284l;

    /* renamed from: m */
    public byte f6285m;

    /* renamed from: n */
    public byte f6286n;

    /* renamed from: o */
    public byte f6287o;

    public C2113ac() {
        this.f6910b = 108;
    }

    /* renamed from: a */
    public void m32875a(byte b) {
        this.f6281i = b;
    }

    /* renamed from: a */
    public void m32874a(C2196c c2196c) {
        mo32763a(c2196c.f6914d);
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        c2197d.m32741c();
        this.f6284l = c2197d.m32739d();
        this.f6285m = c2197d.m32739d();
        this.f6286n = c2197d.m32739d();
        this.f6287o = c2197d.m32739d();
    }

    /* renamed from: a */
    public void m32873a(boolean z) {
        if (z) {
            this.f6282j = f6277e;
        } else {
            this.f6282j = (byte) 1;
        }
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        C2196c c2196c = new C2196c();
        c2196c.f6913c = 108;
        c2196c.f6912b = 10;
        c2196c.f6914d.m32744b(this.f6282j);
        c2196c.f6914d.m32744b((byte) 1);
        c2196c.f6914d.m32744b(this.f6281i);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 0);
        return c2196c;
    }
}
