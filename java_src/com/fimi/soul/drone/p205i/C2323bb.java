package com.fimi.soul.drone.p205i;

import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.C2247e;
/* renamed from: com.fimi.soul.drone.i.bb */
/* loaded from: classes.dex */
public class C2323bb extends C2247e {

    /* renamed from: b */
    private short f7522b;

    /* renamed from: c */
    private byte f7523c;

    public C2323bb(C2083a c2083a) {
        super(c2083a);
    }

    /* renamed from: a */
    public byte m32115a() {
        return this.f7523c;
    }

    /* renamed from: a */
    public void m32114a(byte b) {
        this.f7523c = b;
    }

    /* renamed from: a */
    public void m32113a(short s, byte b) {
        this.f7523c = b;
        this.f7522b = s;
        this.f7081a.mo32909a(C2104d.EnumC2105a.SENDHOVERWAYPOINT);
    }

    /* renamed from: b */
    public short m32112b() {
        return this.f7522b;
    }

    /* renamed from: c */
    public void m32111c() {
        this.f7522b = (short) 0;
    }
}
