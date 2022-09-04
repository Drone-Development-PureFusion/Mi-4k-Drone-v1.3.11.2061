package com.fimi.soul.drone.p205i;

import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.C2247e;
/* renamed from: com.fimi.soul.drone.i.y */
/* loaded from: classes.dex */
public class C2366y extends C2247e {

    /* renamed from: b */
    private short f7775b;

    /* renamed from: c */
    private byte f7776c = 100;

    public C2366y(C2083a c2083a) {
        super(c2083a);
    }

    /* renamed from: a */
    public byte m31749a() {
        return this.f7776c;
    }

    /* renamed from: a */
    public void m31748a(short s, byte b) {
        this.f7775b = s;
        this.f7776c = b;
        this.f7081a.mo32909a(C2104d.EnumC2105a.ExecuteWaypoint);
    }

    /* renamed from: b */
    public short m31747b() {
        return this.f7775b;
    }

    /* renamed from: c */
    public void m31746c() {
        this.f7775b = (short) 0;
    }
}
