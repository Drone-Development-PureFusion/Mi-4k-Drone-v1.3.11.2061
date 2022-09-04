package com.fimi.soul.drone.p205i.p206a;

import com.fimi.soul.biz.p187o.C2022a;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.C2247e;
import com.fimi.soul.utils.C3078af;
import com.fimi.soul.utils.C3084al;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.soul.drone.i.a.a */
/* loaded from: classes.dex */
public class C2286a extends C2247e {

    /* renamed from: b */
    public byte f7302b;

    /* renamed from: c */
    public byte f7303c;

    /* renamed from: d */
    public byte f7304d;

    /* renamed from: e */
    public short f7305e;

    /* renamed from: f */
    public short f7306f;

    /* renamed from: g */
    public short f7307g;

    /* renamed from: h */
    public short f7308h;

    /* renamed from: i */
    public float f7309i;

    /* renamed from: j */
    public float f7310j;

    /* renamed from: k */
    public byte f7311k;

    public C2286a(C2083a c2083a) {
        super(c2083a);
    }

    /* renamed from: a */
    public byte m32433a() {
        return this.f7302b;
    }

    /* renamed from: a */
    public void m32432a(byte b, byte b2, byte b3, short s, short s2, short s3, short s4, float f, float f2, byte b4) {
        if (!C2022a.m33223a().m33221b()) {
            C3084al m29346a = C3078af.m29346a(f2, f);
            this.f7309i = (float) m29346a.m29320b();
            this.f7310j = (float) m29346a.m29322a();
        } else {
            this.f7309i = f;
            this.f7310j = f2;
        }
        this.f7302b = b;
        this.f7303c = b2;
        this.f7304d = b3;
        this.f7305e = s;
        this.f7306f = s2;
        this.f7307g = s3;
        this.f7308h = s4;
        this.f7311k = b4;
        this.f7081a.mo32909a(C2104d.EnumC2105a.TAKEPHOTOBACKDATA);
    }

    /* renamed from: b */
    public byte m32431b() {
        return this.f7311k;
    }

    /* renamed from: c */
    public float m32430c() {
        return this.f7310j;
    }

    /* renamed from: d */
    public short m32429d() {
        return this.f7308h;
    }

    /* renamed from: e */
    public float m32428e() {
        return this.f7309i;
    }

    /* renamed from: f */
    public short m32427f() {
        return this.f7306f;
    }

    /* renamed from: g */
    public short m32426g() {
        return this.f7307g;
    }

    /* renamed from: h */
    public short m32425h() {
        return this.f7305e;
    }

    /* renamed from: i */
    public byte m32424i() {
        return this.f7304d;
    }

    /* renamed from: j */
    public byte m32423j() {
        return this.f7303c;
    }

    public String toString() {
        return "DroneTakePhotoBean{packPacket_sequence=" + ((int) this.f7302b) + ", CMD_ID=" + ((int) this.f7303c) + ", Mode=" + ((int) this.f7304d) + ", Route_Length=" + ((int) this.f7305e) + ", Climb_Angle=" + ((int) this.f7306f) + ", Route_Speed=" + ((int) this.f7307g) + ", Start_point_Altitude=" + ((int) this.f7308h) + ", Start_point_Longitude=" + this.f7309i + ", Start_point_Latitude=" + this.f7310j + ", report=" + ((int) this.f7311k) + C0494h.f735w;
    }
}
