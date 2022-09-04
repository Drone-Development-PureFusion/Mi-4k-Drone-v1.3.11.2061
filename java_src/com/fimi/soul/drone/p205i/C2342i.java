package com.fimi.soul.drone.p205i;

import com.fimi.soul.drone.p195d.p196a.C2197d;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.soul.drone.i.i */
/* loaded from: classes.dex */
public class C2342i extends AbstractC2285a {

    /* renamed from: a */
    private boolean f7646a = true;

    /* renamed from: b */
    private EnumC2346d f7647b = EnumC2346d.Mid;

    /* renamed from: c */
    private EnumC2348f f7648c = EnumC2348f.DateTime;

    /* renamed from: d */
    private EnumC2347e f7649d = EnumC2347e._1280x720_120p_16vs9;

    /* renamed from: e */
    private EnumC2343a f7650e = EnumC2343a._13M_4128X3096_4vs3;

    /* renamed from: f */
    private EnumC2345c f7651f = EnumC2345c.Normal;

    /* renamed from: g */
    private EnumC2344b f7652g = EnumC2344b.DateTime;

    /* renamed from: h */
    private boolean f7653h = true;

    /* renamed from: i */
    private boolean f7654i = true;

    /* renamed from: j */
    private boolean f7655j = true;

    /* renamed from: k */
    private int f7656k = 0;

    /* renamed from: l */
    private short f7657l = 0;

    /* renamed from: m */
    private short f7658m = 0;

    /* renamed from: com.fimi.soul.drone.i.i$a */
    /* loaded from: classes.dex */
    public enum EnumC2343a {
        _16M_4068x3456_4vs3,
        _13M_4128X3096_4vs3,
        _8M_3264X2448_4vs3,
        _5M_2560X1920_4vs3
    }

    /* renamed from: com.fimi.soul.drone.i.i$b */
    /* loaded from: classes.dex */
    public enum EnumC2344b {
        Date,
        Time,
        DateTime
    }

    /* renamed from: com.fimi.soul.drone.i.i$c */
    /* loaded from: classes.dex */
    public enum EnumC2345c {
        Normal,
        TimeLapse,
        BurstShot
    }

    /* renamed from: com.fimi.soul.drone.i.i$d */
    /* loaded from: classes.dex */
    public enum EnumC2346d {
        High,
        Mid,
        Low
    }

    /* renamed from: com.fimi.soul.drone.i.i$e */
    /* loaded from: classes.dex */
    public enum EnumC2347e {
        _1920x1080_60p_16vs9,
        _1920x1080_30p_16vs9,
        _1920x1080_48p_16vs9,
        _1920x1080_24p_16vs9,
        _1280x960_60p_4vs3,
        _1280x960_48p_4vs3,
        _1280x720_60p_16vs9,
        _1280x720_48p_16vs9,
        _1280x720_120p_16vs9,
        _848x480_240p_16vs9
    }

    /* renamed from: com.fimi.soul.drone.i.i$f */
    /* loaded from: classes.dex */
    public enum EnumC2348f {
        Date,
        Time,
        DateTime
    }

    /* renamed from: a */
    private EnumC2346d m31971a(byte b) {
        if (b == 1) {
            return EnumC2346d.High;
        }
        if (b != 2 && b == 3) {
            return EnumC2346d.Low;
        }
        return EnumC2346d.Mid;
    }

    /* renamed from: b */
    private EnumC2348f m31961b(byte b) {
        if (b == 1) {
            return EnumC2348f.Date;
        }
        if (b == 2) {
            return EnumC2348f.Time;
        }
        if (b == 3) {
            return EnumC2348f.DateTime;
        }
        EnumC2348f enumC2348f = this.f7648c;
        return EnumC2348f.Date;
    }

    /* renamed from: c */
    private EnumC2347e m31956c(byte b) {
        if (b == 1) {
            return EnumC2347e._1920x1080_60p_16vs9;
        }
        if (b == 2) {
            return EnumC2347e._1920x1080_30p_16vs9;
        }
        if (b == 3) {
            return EnumC2347e._1920x1080_48p_16vs9;
        }
        if (b == 4) {
            return EnumC2347e._1920x1080_24p_16vs9;
        }
        if (b == 5) {
            return EnumC2347e._1280x960_60p_4vs3;
        }
        if (b == 6) {
            return EnumC2347e._1280x960_48p_4vs3;
        }
        if (b == 7) {
            return EnumC2347e._1280x720_60p_16vs9;
        }
        if (b == 8) {
            return EnumC2347e._1280x720_48p_16vs9;
        }
        if (b != 9 && b == 10) {
            return EnumC2347e._848x480_240p_16vs9;
        }
        return EnumC2347e._1280x720_120p_16vs9;
    }

    /* renamed from: d */
    private EnumC2343a m31953d(byte b) {
        return b == 1 ? EnumC2343a._16M_4068x3456_4vs3 : b == 2 ? EnumC2343a._13M_4128X3096_4vs3 : b == 3 ? EnumC2343a._8M_3264X2448_4vs3 : b == 4 ? EnumC2343a._5M_2560X1920_4vs3 : EnumC2343a._16M_4068x3456_4vs3;
    }

    /* renamed from: e */
    private EnumC2345c m31950e(byte b) {
        return b == 1 ? EnumC2345c.Normal : b == 2 ? EnumC2345c.TimeLapse : b == 3 ? EnumC2345c.BurstShot : EnumC2345c.Normal;
    }

    /* renamed from: f */
    private EnumC2344b m31948f(byte b) {
        return b == 1 ? EnumC2344b.Date : b == 2 ? EnumC2344b.Time : b == 3 ? EnumC2344b.DateTime : EnumC2344b.DateTime;
    }

    /* renamed from: g */
    private byte m31946g(byte b) {
        return (byte) (b & 63);
    }

    /* renamed from: h */
    private byte m31944h(byte b) {
        return (byte) ((b & 192) >>> 6);
    }

    @Override // com.fimi.soul.drone.p195d.AbstractC2108a
    /* renamed from: a */
    public void mo31936a(C2197d c2197d) {
        c2197d.m32741c();
        m31967a(m31971a(c2197d.m32739d()));
        m31965a(m31961b(c2197d.m32739d()));
        m31966a(m31956c(c2197d.m32739d()));
        m31970a(m31953d(c2197d.m32739d()));
        m31968a(m31950e(c2197d.m32739d()));
        m31969a(m31948f(c2197d.m32739d()));
        if (c2197d.m32739d() == 2) {
            m31955c(true);
        } else {
            m31955c(false);
        }
        if (c2197d.m32739d() == 2) {
            m31958b(true);
        } else {
            m31958b(false);
        }
        if (c2197d.m32739d() == 2) {
            m31955c(true);
        } else {
            m31955c(false);
        }
        if (a() == 51) {
            this.f7656k = c2197d.m32737f();
            this.f7657l = c2197d.m32738e();
            this.f7658m = c2197d.m32738e();
        }
    }

    /* renamed from: a */
    public void m31970a(EnumC2343a enumC2343a) {
        this.f7650e = enumC2343a;
    }

    /* renamed from: a */
    public void m31969a(EnumC2344b enumC2344b) {
        this.f7652g = enumC2344b;
    }

    /* renamed from: a */
    public void m31968a(EnumC2345c enumC2345c) {
        this.f7651f = enumC2345c;
    }

    /* renamed from: a */
    public void m31967a(EnumC2346d enumC2346d) {
        this.f7647b = enumC2346d;
    }

    /* renamed from: a */
    public void m31966a(EnumC2347e enumC2347e) {
        this.f7649d = enumC2347e;
    }

    /* renamed from: a */
    public void m31965a(EnumC2348f enumC2348f) {
        this.f7648c = enumC2348f;
    }

    /* renamed from: a */
    public void m31964a(short s) {
        this.f7657l = s;
    }

    /* renamed from: a */
    public void m31963a(boolean z) {
        this.f7653h = z;
    }

    /* renamed from: b */
    public EnumC2343a m31962b() {
        return this.f7650e;
    }

    /* renamed from: b */
    public void m31960b(int i) {
        this.f7656k = i;
    }

    /* renamed from: b */
    public void m31959b(short s) {
        this.f7658m = s;
    }

    /* renamed from: b */
    public void m31958b(boolean z) {
        this.f7654i = z;
    }

    /* renamed from: c */
    public EnumC2344b m31957c() {
        return this.f7652g;
    }

    /* renamed from: c */
    public void m31955c(boolean z) {
        this.f7655j = z;
    }

    /* renamed from: d */
    public void m31952d(boolean z) {
        this.f7646a = z;
    }

    /* renamed from: d */
    public boolean m31954d() {
        return this.f7653h;
    }

    /* renamed from: e */
    public boolean m31951e() {
        return this.f7654i;
    }

    /* renamed from: f */
    public boolean m31949f() {
        return this.f7655j;
    }

    /* renamed from: g */
    public EnumC2347e m31947g() {
        return this.f7649d;
    }

    /* renamed from: h */
    public boolean m31945h() {
        return this.f7646a;
    }

    /* renamed from: i */
    public EnumC2348f m31943i() {
        return this.f7648c;
    }

    /* renamed from: j */
    public EnumC2346d m31942j() {
        return this.f7647b;
    }

    /* renamed from: k */
    public EnumC2345c m31941k() {
        return this.f7651f;
    }

    /* renamed from: l */
    public int m31940l() {
        return this.f7656k;
    }

    /* renamed from: m */
    public short m31939m() {
        return this.f7657l;
    }

    /* renamed from: n */
    public short m31938n() {
        return this.f7658m;
    }

    public String toString() {
        return "CloudCameraVariable{isLenAC=" + this.f7646a + ", videoQualityType=" + this.f7647b + ", videoTimeStampType=" + this.f7648c + ", videoResolutionType=" + this.f7649d + ", imageResolutionType=" + this.f7650e + ", shotModeType=" + this.f7651f + ", photoTimeStampType=" + this.f7652g + ", enableAutoLowLight=" + this.f7653h + ", enableRecycleRecord=" + this.f7654i + ", enableAutoAC=" + this.f7655j + ", cameraTime=" + this.f7656k + ", cameraTotalStorage=" + ((int) this.f7657l) + ", cameraRemainStorage=" + ((int) this.f7658m) + C0494h.f735w;
    }
}
