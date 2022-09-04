package com.fimi.soul.drone.p205i;

import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.C2247e;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.soul.drone.i.bj */
/* loaded from: classes.dex */
public class C2331bj extends C2247e {

    /* renamed from: b */
    public byte f7560b;

    /* renamed from: c */
    public short f7561c;

    /* renamed from: d */
    public byte f7562d;

    public C2331bj(C2083a c2083a) {
        super(c2083a);
    }

    /* renamed from: a */
    public short m32051a() {
        return this.f7561c;
    }

    /* renamed from: a */
    public void m32050a(byte b, short s, byte b2) {
        this.f7560b = b;
        this.f7561c = s;
        this.f7562d = b2;
        this.f7081a.mo32909a(C2104d.EnumC2105a.UPDATEDRONEREPORT);
    }

    /* renamed from: b */
    public byte m32049b() {
        return this.f7562d;
    }

    /* renamed from: c */
    public byte m32048c() {
        return this.f7560b;
    }

    public String toString() {
        return "UpdateDronerepory{target_ID=" + ((int) this.f7560b) + ", Packet_sequence=" + ((int) this.f7561c) + ", report=" + ((int) this.f7562d) + C0494h.f735w;
    }
}
