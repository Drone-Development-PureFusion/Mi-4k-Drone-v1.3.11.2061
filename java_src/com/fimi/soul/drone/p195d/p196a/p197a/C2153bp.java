package com.fimi.soul.drone.p195d.p196a.p197a;

import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
/* renamed from: com.fimi.soul.drone.d.a.a.bp */
/* loaded from: classes.dex */
public class C2153bp extends AbstractC2195b {

    /* renamed from: a */
    public static final int f6598a = 6;

    /* renamed from: c */
    public static final int f6599c = 18;
    private static final long serialVersionUID = 6;

    /* renamed from: d */
    public float f6600d;

    /* renamed from: e */
    public float f6601e;

    /* renamed from: f */
    public float f6602f;

    /* renamed from: g */
    public short f6603g;

    /* renamed from: h */
    public short f6604h;

    /* renamed from: i */
    public byte f6605i;

    /* renamed from: j */
    public short f6606j;

    public C2153bp() {
        this.f6910b = 6;
    }

    public C2153bp(C2196c c2196c) {
        this.f6910b = 6;
        mo32763a(c2196c.f6914d);
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        c2197d.m32741c();
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 18;
        c2196c.f6913c = 6;
        c2196c.f6914d.m32749a(this.f6600d);
        c2196c.f6914d.m32749a(this.f6601e);
        c2196c.f6914d.m32748a((int) this.f6602f);
        c2196c.f6914d.m32746a(this.f6603g);
        c2196c.f6914d.m32746a(this.f6604h);
        c2196c.f6914d.m32744b(this.f6605i);
        c2196c.f6914d.m32746a(this.f6606j);
        return c2196c;
    }

    public String toString() {
        return "msg_followme [Packet_Sequence=Packet_Sequence, GCSLongitude=" + this.f6600d + ", GCSLatitude=" + this.f6601e + ", HomeAltitude=" + this.f6602f + ", ground_speed=" + ((int) this.f6603g) + ", ground_course=" + ((int) this.f6604h) + ", SatelliteNumber=" + ((int) this.f6605i) + ", accuracy=" + ((int) this.f6606j) + "]";
    }
}
