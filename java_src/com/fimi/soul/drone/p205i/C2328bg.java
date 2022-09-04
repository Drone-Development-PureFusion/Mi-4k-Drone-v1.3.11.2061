package com.fimi.soul.drone.p205i;

import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.C2247e;
/* renamed from: com.fimi.soul.drone.i.bg */
/* loaded from: classes.dex */
public class C2328bg extends C2247e {

    /* renamed from: b */
    public byte f7553b;

    /* renamed from: c */
    public byte f7554c;

    public C2328bg(C2083a c2083a) {
        super(c2083a);
    }

    /* renamed from: a */
    public byte m32061a() {
        return this.f7554c;
    }

    /* renamed from: a */
    public void m32060a(byte b, byte b2) {
        this.f7554c = b;
        this.f7553b = b2;
        this.f7081a.mo32909a(C2104d.EnumC2105a.UPDATEDRONEFINISHREPORTCRC);
    }

    /* renamed from: b */
    public byte m32059b() {
        return this.f7553b;
    }
}
