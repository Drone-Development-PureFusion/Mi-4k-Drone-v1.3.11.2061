package com.fimi.soul.drone.p195d.p196a.p197a;

import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
import java.io.Serializable;
/* renamed from: com.fimi.soul.drone.d.a.a.m */
/* loaded from: classes.dex */
public class C2181m extends AbstractC2195b implements Serializable {

    /* renamed from: a */
    public final int f6791a = 137;

    /* renamed from: c */
    private final byte f6792c = 19;

    /* renamed from: d */
    private byte[] f6793d = new byte[2];

    /* renamed from: e */
    private byte[] f6794e;

    /* renamed from: f */
    private byte f6795f;

    public C2181m() {
        this.f6910b = 137;
    }

    /* renamed from: a */
    public void m32797a(byte b) {
        this.f6795f = b;
    }

    /* renamed from: a */
    public void m32796a(C2196c c2196c) {
        mo32763a(c2196c.f6914d);
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        c2197d.m32741c();
        this.f6793d[0] = c2197d.m32739d();
        this.f6793d[1] = c2197d.m32739d();
        this.f6795f = c2197d.m32739d();
    }

    /* renamed from: a */
    public void m32795a(byte[] bArr) {
        this.f6793d = bArr;
    }

    /* renamed from: a */
    public byte[] m32798a() {
        return this.f6793d;
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        C2196c c2196c = new C2196c();
        c2196c.f6913c = 137;
        c2196c.f6912b = 19;
        if (this.f6794e != null && this.f6794e.length > 0) {
            for (byte b : this.f6794e) {
                c2196c.f6914d.m32744b(b);
            }
        }
        return c2196c;
    }

    /* renamed from: b */
    public void m32794b(byte[] bArr) {
        this.f6794e = bArr;
    }

    /* renamed from: c */
    public byte m32793c() {
        return this.f6795f;
    }
}
