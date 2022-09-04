package com.fimi.soul.drone.p205i;

import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2247e;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.soul.drone.i.af */
/* loaded from: classes.dex */
public class C2300af extends C2247e {

    /* renamed from: b */
    private byte f7380b = 0;

    /* renamed from: c */
    private short f7381c = 0;

    /* renamed from: d */
    private byte f7382d = 0;

    public C2300af(C2083a c2083a) {
        super(c2083a);
    }

    /* renamed from: a */
    public byte m32340a() {
        return this.f7380b;
    }

    /* renamed from: a */
    public void m32339a(byte b) {
        this.f7380b = b;
    }

    /* renamed from: a */
    public void m32338a(short s) {
        this.f7381c = (short) (s & 255);
    }

    /* renamed from: b */
    public short m32337b() {
        return this.f7381c;
    }

    /* renamed from: b */
    public void m32336b(byte b) {
        this.f7382d = b;
    }

    /* renamed from: c */
    public byte m32335c() {
        return this.f7382d;
    }

    public String toString() {
        return "GimbalVariable{roll_angle=" + ((int) this.f7380b) + ", pitch_angle=" + ((int) this.f7381c) + ", yaw_angle=" + ((int) this.f7382d) + C0494h.f735w;
    }
}
