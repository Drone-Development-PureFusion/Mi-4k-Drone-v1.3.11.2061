package com.fimi.soul.drone.p195d.p196a.p197a;

import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
import java.util.Arrays;
/* renamed from: com.fimi.soul.drone.d.a.a.bz */
/* loaded from: classes.dex */
public class C2163bz extends AbstractC2195b {

    /* renamed from: a */
    public static final int f6673a = 201;
    private static final long serialVersionUID = 201;

    /* renamed from: c */
    public int f6674c;

    /* renamed from: d */
    public short f6675d;

    /* renamed from: e */
    public byte f6676e;

    /* renamed from: f */
    public byte[] f6677f;

    public C2163bz() {
        this.f6910b = 201;
    }

    public C2163bz(C2196c c2196c) {
        this.f6910b = 201;
        mo32763a(c2196c.f6914d);
    }

    /* renamed from: a */
    public void m32866a(int i) {
        this.f6677f = new byte[i];
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        c2197d.m32741c();
        this.f6675d = c2197d.m32738e();
    }

    /* renamed from: a */
    public byte[] m32867a() {
        return this.f6677f;
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = this.f6674c;
        c2196c.f6913c = 201;
        c2196c.f6914d.m32744b(this.f6676e);
        c2196c.f6914d.m32746a(this.f6675d);
        for (int i = 0; i < this.f6677f.length; i++) {
            c2196c.f6914d.m32744b(this.f6677f[i]);
        }
        return c2196c;
    }

    /* renamed from: b */
    public void m32865b(int i) {
        this.f6674c = i;
    }

    /* renamed from: c */
    public int m32864c() {
        return this.f6674c;
    }

    public String toString() {
        return "updatedrone [Packet_sequence=" + ((int) this.f6675d) + ", data=" + Arrays.toString(this.f6677f) + "]";
    }
}
