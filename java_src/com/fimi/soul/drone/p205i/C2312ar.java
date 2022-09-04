package com.fimi.soul.drone.p205i;

import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.C2247e;
/* renamed from: com.fimi.soul.drone.i.ar */
/* loaded from: classes.dex */
public class C2312ar extends C2247e {

    /* renamed from: b */
    private byte f7470b;

    /* renamed from: c */
    private byte f7471c;

    /* renamed from: d */
    private byte f7472d;

    public C2312ar(C2083a c2083a) {
        super(c2083a);
    }

    /* renamed from: a */
    public byte m32184a() {
        return this.f7470b;
    }

    /* renamed from: a */
    public void m32183a(byte b, byte b2, byte b3) {
        this.f7470b = b;
        this.f7472d = b2;
        this.f7471c = b3;
        this.f7081a.mo32909a(C2104d.EnumC2105a.PowerBatteryProgress);
    }

    /* renamed from: b */
    public byte m32182b() {
        return this.f7471c;
    }

    /* renamed from: c */
    public byte m32181c() {
        return this.f7472d;
    }
}
