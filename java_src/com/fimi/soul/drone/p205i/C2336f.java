package com.fimi.soul.drone.p205i;

import com.fimi.soul.drone.C2247e;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.p197a.C2114ad;
/* renamed from: com.fimi.soul.drone.i.f */
/* loaded from: classes.dex */
public class C2336f extends C2247e {

    /* renamed from: b */
    private byte f7598b;

    /* renamed from: c */
    private byte f7599c;

    /* renamed from: d */
    private short f7600d;

    /* renamed from: e */
    private byte f7601e;

    /* renamed from: f */
    private byte f7602f;

    /* renamed from: a */
    public byte m32008a() {
        return this.f7598b;
    }

    /* renamed from: a */
    public C2196c m32006a(int i, C2336f c2336f) {
        C2114ad c2114ad = new C2114ad();
        c2114ad.f6290d = (byte) 0;
        c2114ad.f6291e = (byte) 13;
        c2114ad.f6292f = (byte) 18;
        c2114ad.f6293g = c2336f.m32003b();
        c2114ad.f6294h = (short) ((i * 1024) / 100.0f);
        c2114ad.f6295i = (byte) 1;
        return c2114ad.mo32762b();
    }

    /* renamed from: a */
    public C2196c m32004a(boolean z, C2336f c2336f) {
        C2114ad c2114ad = new C2114ad();
        c2114ad.f6290d = (byte) 0;
        c2114ad.f6291e = (byte) 13;
        c2114ad.f6292f = (byte) 18;
        if (z) {
            c2114ad.f6293g = (byte) 1;
        } else {
            c2114ad.f6293g = (byte) 0;
        }
        c2114ad.f6294h = c2336f.m32000c();
        c2114ad.f6295i = c2336f.m31998d();
        return c2114ad.mo32762b();
    }

    /* renamed from: a */
    public void m32007a(byte b) {
        this.f7598b = b;
    }

    /* renamed from: a */
    public void m32005a(short s) {
        this.f7600d = s;
    }

    /* renamed from: b */
    public byte m32003b() {
        return this.f7599c;
    }

    /* renamed from: b */
    public C2196c m32001b(int i, C2336f c2336f) {
        C2114ad c2114ad = new C2114ad();
        c2114ad.f6290d = (byte) 0;
        c2114ad.f6291e = (byte) 13;
        c2114ad.f6292f = (byte) 18;
        c2114ad.f6293g = c2336f.m32003b();
        c2114ad.f6294h = c2336f.m32000c();
        if (i == 0) {
            c2114ad.f6295i = (byte) 1;
        } else if (i == 1) {
            c2114ad.f6295i = (byte) 2;
        }
        return c2114ad.mo32762b();
    }

    /* renamed from: b */
    public void m32002b(byte b) {
        this.f7599c = b;
    }

    /* renamed from: c */
    public short m32000c() {
        return this.f7600d;
    }

    /* renamed from: c */
    public void m31999c(byte b) {
        this.f7601e = b;
    }

    /* renamed from: d */
    public byte m31998d() {
        return this.f7601e;
    }

    /* renamed from: d */
    public void m31997d(byte b) {
        this.f7602f = b;
    }

    /* renamed from: e */
    public byte m31996e() {
        return this.f7602f;
    }

    /* renamed from: f */
    public C2196c m31995f() {
        C2114ad c2114ad = new C2114ad();
        c2114ad.f6290d = (byte) 0;
        c2114ad.f6291e = (byte) 13;
        c2114ad.f6292f = (byte) 19;
        c2114ad.f6293g = (byte) 1;
        c2114ad.f6294h = (short) 0;
        c2114ad.f6295i = (byte) 2;
        return c2114ad.mo32762b();
    }

    /* renamed from: g */
    public boolean m31994g() {
        return this.f7601e == 2 && this.f7602f == 0;
    }

    /* renamed from: h */
    public boolean m31993h() {
        return this.f7601e == 2;
    }

    /* renamed from: i */
    public boolean m31992i() {
        return this.f7599c == 1;
    }

    /* renamed from: j */
    public boolean m31991j() {
        return this.f7602f == 0;
    }
}
