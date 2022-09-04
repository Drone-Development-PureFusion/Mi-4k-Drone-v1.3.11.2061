package com.fimi.soul.drone.p205i;

import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.C2247e;
/* renamed from: com.fimi.soul.drone.i.e */
/* loaded from: classes.dex */
public class C2335e extends C2247e {

    /* renamed from: b */
    public short f7593b;

    /* renamed from: c */
    public short f7594c;

    /* renamed from: d */
    public short f7595d;

    /* renamed from: e */
    public short f7596e;

    /* renamed from: f */
    public short f7597f;

    public C2335e() {
    }

    public C2335e(C2083a c2083a) {
        super(c2083a);
    }

    /* renamed from: a */
    public short m32014a() {
        return this.f7593b;
    }

    /* renamed from: a */
    public void m32013a(short s, short s2, short s3, short s4, short s5) {
        this.f7593b = s;
        this.f7594c = s2;
        this.f7595d = s5;
        this.f7596e = s3;
        this.f7597f = s4;
        if (this.f7081a != null) {
            this.f7081a.mo32909a(C2104d.EnumC2105a.BATTERYINFO);
        }
    }

    /* renamed from: b */
    public short m32012b() {
        return this.f7594c;
    }

    /* renamed from: c */
    public short m32011c() {
        return this.f7595d;
    }

    /* renamed from: d */
    public short m32010d() {
        return this.f7596e;
    }

    /* renamed from: e */
    public short m32009e() {
        return this.f7597f;
    }
}
