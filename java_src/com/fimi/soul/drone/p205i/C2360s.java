package com.fimi.soul.drone.p205i;

import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.C2247e;
/* renamed from: com.fimi.soul.drone.i.s */
/* loaded from: classes.dex */
public class C2360s extends C2247e {

    /* renamed from: b */
    private byte f7739b;

    /* renamed from: c */
    private byte f7740c;

    /* renamed from: d */
    private short f7741d;

    /* renamed from: e */
    private byte f7742e;

    public C2360s(C2083a c2083a) {
        super(c2083a);
    }

    /* renamed from: a */
    public byte m31863a() {
        return this.f7739b;
    }

    /* renamed from: a */
    public void m31862a(byte b, byte b2, short s, byte b3) {
        this.f7741d = s;
        this.f7739b = b;
        this.f7740c = b2;
        this.f7742e = b3;
        this.f7081a.mo32909a(C2104d.EnumC2105a.DYNC4KBACKDATA);
    }

    /* renamed from: b */
    public byte m31861b() {
        return this.f7740c;
    }

    /* renamed from: c */
    public short m31860c() {
        return this.f7741d;
    }

    /* renamed from: d */
    public byte m31859d() {
        return this.f7742e;
    }
}
