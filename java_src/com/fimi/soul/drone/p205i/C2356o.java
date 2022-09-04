package com.fimi.soul.drone.p205i;

import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.C2247e;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.soul.drone.i.o */
/* loaded from: classes.dex */
public class C2356o extends C2247e {

    /* renamed from: b */
    public byte f7719b;

    /* renamed from: c */
    public byte f7720c;

    /* renamed from: d */
    public float f7721d;

    /* renamed from: e */
    public byte f7722e;

    public C2356o(C2083a c2083a) {
        super(c2083a);
    }

    /* renamed from: a */
    public byte m31900a() {
        return this.f7719b;
    }

    /* renamed from: a */
    public void m31899a(byte b) {
        this.f7719b = b;
    }

    /* renamed from: a */
    public void m31898a(byte b, byte b2, float f, byte b3) {
        this.f7719b = b;
        this.f7720c = b2;
        this.f7721d = f;
        this.f7722e = b3;
        this.f7081a.mo32909a(C2104d.EnumC2105a.RETURN_HEIGHT);
    }

    /* renamed from: a */
    public void m31897a(float f) {
        this.f7721d = f;
    }

    /* renamed from: b */
    public byte m31896b() {
        return this.f7720c;
    }

    /* renamed from: b */
    public void m31895b(byte b) {
        this.f7720c = b;
    }

    /* renamed from: c */
    public float m31894c() {
        return this.f7721d;
    }

    /* renamed from: c */
    public void m31893c(byte b) {
        this.f7722e = b;
    }

    /* renamed from: d */
    public byte m31892d() {
        return this.f7722e;
    }

    public String toString() {
        return "DroneRTHVariable{packPacketSequence=" + ((int) this.f7719b) + ", cmdID=" + ((int) this.f7720c) + ", height=" + this.f7721d + ", report=" + ((int) this.f7722e) + C0494h.f735w;
    }
}
