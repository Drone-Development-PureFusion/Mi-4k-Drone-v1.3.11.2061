package com.fimi.soul.drone.p195d.p196a.p197a;

import android.util.Log;
import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p195d.p196a.C2197d;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.soul.drone.d.a.a.z */
/* loaded from: classes.dex */
public class C2194z extends AbstractC2195b {

    /* renamed from: a */
    public static final int f6899a = 40;

    /* renamed from: c */
    public static final int f6900c = 19;
    private static final long serialVersionUID = 40;

    /* renamed from: d */
    public byte f6901d;

    /* renamed from: e */
    public byte f6902e;

    /* renamed from: f */
    public short f6903f;

    /* renamed from: g */
    public short f6904g;

    /* renamed from: h */
    public short f6905h;

    /* renamed from: i */
    public short f6906i;

    /* renamed from: j */
    public short f6907j;

    /* renamed from: k */
    public short f6908k;

    /* renamed from: l */
    public C2196c f6909l;

    public C2194z() {
        this.f6910b = 40;
    }

    public C2194z(C2196c c2196c) {
        this.f6910b = 40;
        this.f6909l = c2196c;
        mo32763a(c2196c.f6914d);
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: a */
    public void mo32763a(C2197d c2197d) {
        c2197d.m32741c();
        this.f6901d = c2197d.m32739d();
        this.f6902e = c2197d.m32739d();
        c2197d.m32740c(7);
        this.f6903f = c2197d.m32738e();
        this.f6904g = c2197d.m32738e();
        this.f6905h = c2197d.m32738e();
        this.f6906i = c2197d.m32738e();
        this.f6907j = c2197d.m32738e();
        this.f6908k = c2197d.m32738e();
        Log.e("IMU1", "gyroX:" + ((int) this.f6903f) + "gyroY:" + ((int) this.f6904g) + "gyroZ:" + ((int) this.f6905h) + "accelX:" + ((int) this.f6906i) + "accelY:" + ((int) this.f6907j) + "accelZ:" + ((int) this.f6908k) + "++++");
    }

    @Override // com.fimi.soul.drone.p195d.p196a.AbstractC2195b
    /* renamed from: b */
    public C2196c mo32762b() {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 19;
        c2196c.f6913c = 40;
        return c2196c;
    }

    public String toString() {
        return "IMUInfoDwonLink{gyroX=" + ((int) this.f6903f) + ", gyroY=" + ((int) this.f6904g) + ", gyroZ=" + ((int) this.f6905h) + ", accelX=" + ((int) this.f6906i) + ", accelY=" + ((int) this.f6907j) + ", accelZ=" + ((int) this.f6908k) + ", miLinkPacket=" + this.f6909l + C0494h.f735w;
    }
}
