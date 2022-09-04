package com.fimi.soul.drone.p195d.p196a.p197a;

import com.fimi.kernel.utils.C1662f;
import com.fimi.soul.biz.camera.C1831e;
import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.C2104d;
import com.fimi.soul.drone.p195d.p196a.AbstractC2195b;
import com.fimi.soul.drone.p195d.p196a.C2196c;
import com.fimi.soul.drone.p205i.C2338h;
import com.fimi.soul.drone.p205i.C2342i;
import com.fimi.soul.module.dronemanage.C2696a;
import com.fimi.soul.module.dronemanage.C2715j;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.Date;
/* renamed from: com.fimi.soul.drone.d.a.a.f */
/* loaded from: classes.dex */
public class C2172f {

    /* renamed from: a */
    public static final int f6730a = 49;

    /* renamed from: b */
    public static final int f6731b = 51;

    /* renamed from: c */
    public static final int f6732c = 50;

    /* renamed from: d */
    public static final int f6733d = 51;

    /* renamed from: e */
    private static C2172f f6734e;

    /* renamed from: f */
    private C2083a f6735f;

    /* renamed from: g */
    private C2696a f6736g;

    /* renamed from: h */
    private C2696a f6737h;

    /* renamed from: i */
    private C2696a f6738i;

    /* renamed from: j */
    private C2696a f6739j;

    /* renamed from: k */
    private SimpleDateFormat f6740k = new SimpleDateFormat(C1662f.f4115e);

    /* renamed from: com.fimi.soul.drone.d.a.a.f$a */
    /* loaded from: classes.dex */
    public enum EnumC2174a {
        StartRecord,
        TakePhoto,
        StopRecord
    }

    private C2172f() {
    }

    /* renamed from: a */
    public static synchronized C2172f m32859a(C2083a c2083a) {
        C2172f c2172f;
        synchronized (C2172f.class) {
            if (f6734e == null) {
                f6734e = new C2172f();
                f6734e.f6735f = c2083a;
            }
            c2172f = f6734e;
        }
        return c2172f;
    }

    /* renamed from: a */
    private void m32861a(int i, byte[] bArr) {
        m32857a(C2176h.m32829a(i, bArr));
    }

    /* renamed from: a */
    private void m32857a(C2196c c2196c) {
        m32835n().mo32906ab().mo32587a(c2196c);
    }

    /* renamed from: a */
    public static boolean m32858a(AbstractC2195b abstractC2195b, C2083a c2083a) {
        if (abstractC2195b.f6910b == 49 || abstractC2195b.f6910b == 50 || abstractC2195b.f6910b == 51) {
            c2083a.f5918c = ((C2175g) abstractC2195b).m32833a();
            if (abstractC2195b.f6910b == 50) {
                c2083a.m33032a((C2338h) c2083a.f5918c);
            }
            c2083a.mo32909a(C2104d.EnumC2105a.OnRecivedCloudCameraCommandInfo);
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private byte[] m32862a(int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = 0;
        }
        return bArr;
    }

    /* renamed from: n */
    private C2083a m32835n() {
        return this.f6735f;
    }

    /* renamed from: o */
    private byte[] m32834o() {
        return new byte[10];
    }

    /* renamed from: a */
    public void m32863a() {
        C2196c m32829a = C2176h.m32829a(50, new byte[]{0});
        if (this.f6736g == null) {
            this.f6736g = new C2696a();
        }
        this.f6736g.m30587a(this.f6735f, m32829a);
        this.f6736g.m30586b();
    }

    /* renamed from: a */
    public void m32860a(C1831e.EnumC1832a enumC1832a) {
        if (enumC1832a == C1831e.EnumC1832a.StartRecord) {
            if (this.f6738i == null) {
                this.f6738i = new C2696a();
            }
            this.f6738i.m30585c();
        }
        if (enumC1832a == C1831e.EnumC1832a.StopRecord) {
            if (this.f6739j == null) {
                this.f6739j = new C2696a();
            }
            this.f6739j.m30585c();
        }
        if (enumC1832a == C1831e.EnumC1832a.TakePhote) {
            if (this.f6737h == null) {
                this.f6737h = new C2696a();
            }
            this.f6737h.m30585c();
        }
    }

    /* renamed from: a */
    public void m32856a(C2342i.EnumC2343a enumC2343a) {
        byte[] m32862a = m32862a(13);
        switch (enumC2343a) {
            case _8M_3264X2448_4vs3:
                m32862a[3] = -63;
                break;
            case _13M_4128X3096_4vs3:
                m32862a[3] = -62;
                break;
            case _16M_4068x3456_4vs3:
                m32862a[3] = -61;
                break;
        }
        m32857a(C2176h.m32829a(50, m32862a));
    }

    /* renamed from: a */
    public void m32855a(C2342i.EnumC2345c enumC2345c) {
        byte[] m32862a = m32862a(13);
        switch (enumC2345c) {
            case BurstShot:
                m32862a[4] = -63;
                break;
            case Normal:
                m32862a[4] = -62;
                break;
            case TimeLapse:
                m32862a[4] = -61;
                break;
        }
        m32857a(C2176h.m32829a(50, m32862a));
    }

    /* renamed from: a */
    public void m32854a(C2342i.EnumC2346d enumC2346d) {
        byte[] m32862a = m32862a(13);
        switch (enumC2346d) {
            case Mid:
                m32862a[0] = -63;
                break;
            case High:
                m32862a[0] = -62;
                break;
            case Low:
                m32862a[0] = -61;
                break;
        }
        m32857a(C2176h.m32829a(50, m32862a));
    }

    /* renamed from: a */
    public void m32853a(C2342i.EnumC2347e enumC2347e) {
        byte[] m32862a = m32862a(13);
        switch (enumC2347e) {
            case _1920x1080_60p_16vs9:
                m32862a[2] = -63;
                break;
            case _1920x1080_30p_16vs9:
                m32862a[2] = -62;
                break;
            case _1920x1080_48p_16vs9:
                m32862a[2] = -61;
                break;
            case _1920x1080_24p_16vs9:
                m32862a[2] = -60;
                break;
            case _1280x960_60p_4vs3:
                m32862a[2] = -59;
                break;
            case _1280x960_48p_4vs3:
                m32862a[2] = -58;
                break;
            case _1280x720_60p_16vs9:
                m32862a[2] = -57;
                break;
            case _1280x720_48p_16vs9:
                m32862a[2] = -56;
                break;
            case _1280x720_120p_16vs9:
                m32862a[2] = -55;
                break;
            case _848x480_240p_16vs9:
                m32862a[2] = -54;
                break;
        }
        m32857a(C2176h.m32829a(50, m32862a));
    }

    /* renamed from: a */
    public void m32852a(C2342i.EnumC2348f enumC2348f) {
        byte[] m32862a = m32862a(13);
        switch (enumC2348f) {
            case Date:
                m32862a[1] = -63;
                break;
            case Time:
                m32862a[1] = -62;
                break;
            case DateTime:
                m32862a[1] = -61;
                break;
        }
        m32857a(C2176h.m32829a(50, m32862a));
    }

    /* renamed from: a */
    public void m32851a(Date date) {
        byte[] m32862a = m32862a(13);
        byte[] array = ByteBuffer.allocate(4).putInt(Integer.parseInt(this.f6740k.format(date))).array();
        for (int i = 0; i < array.length; i++) {
            m32862a[(m32862a.length - array.length) + i] = array[i];
        }
        m32857a(C2176h.m32829a(50, m32862a));
    }

    /* renamed from: a */
    public void m32850a(boolean z) {
        byte[] m32862a = m32862a(13);
        if (z) {
            m32862a[6] = -63;
        } else {
            m32862a[6] = -62;
        }
        m32857a(C2176h.m32829a(50, new byte[]{1, 0, 0, 0}));
    }

    /* renamed from: b */
    public void m32849b() {
        C2196c m32829a = C2176h.m32829a(49, new byte[]{1, 0, 0, 0});
        if (this.f6738i == null) {
            this.f6738i = new C2696a();
        }
        this.f6738i.m30587a(this.f6735f, m32829a);
        this.f6738i.m30588a();
    }

    /* renamed from: b */
    public void m32848b(boolean z) {
        m32857a(C2176h.m32829a(49, new byte[]{1, 0, 0, 0}));
    }

    /* renamed from: c */
    public void m32847c() {
        this.f6735f.mo32906ab().mo32587a(C2176h.m32829a(51, new byte[]{1, 0, 0, 0}));
    }

    /* renamed from: c */
    public void m32846c(boolean z) {
        m32857a(C2176h.m32829a(50, new byte[]{1, 0, 0, 0}));
    }

    /* renamed from: d */
    public void m32845d() {
        C2196c m32829a = C2176h.m32829a(49, new byte[]{2, 0, 0, 0});
        if (this.f6739j == null) {
            this.f6739j = new C2696a();
        }
        this.f6739j.m30587a(this.f6735f, m32829a);
        this.f6739j.m30588a();
    }

    /* renamed from: e */
    public void m32844e() {
        m32857a(C2176h.m32829a(49, new byte[]{3, 0, 0, 0}));
    }

    /* renamed from: f */
    public void m32843f() {
        C2196c m32829a = C2176h.m32829a(49, new byte[]{4, 0, 0, 0});
        if (this.f6737h == null) {
            this.f6737h = new C2696a();
        }
        this.f6737h.m30587a(this.f6735f, m32829a);
        this.f6737h.m30588a();
    }

    /* renamed from: g */
    public void m32842g() {
        C2715j.m30534a(this.f6735f, C2176h.m32829a(49, new byte[]{8, 0, 0, 0}));
        C2715j.m30535a();
    }

    /* renamed from: h */
    public void m32841h() {
        C2715j.m30534a(this.f6735f, C2176h.m32829a(49, new byte[]{9, 0, 0, 0}));
        C2715j.m30535a();
    }

    /* renamed from: i */
    public void m32840i() {
        C2715j.m30534a(this.f6735f, C2176h.m32829a(49, new byte[]{6, 0, 0, 0}));
        C2715j.m30535a();
    }

    /* renamed from: j */
    public void m32839j() {
        m32857a(C2176h.m32829a(49, new byte[]{0, 1, 0, 0}));
    }

    /* renamed from: k */
    public void m32838k() {
        m32857a(C2176h.m32829a(49, new byte[]{0, 2, 0, 0}));
    }

    /* renamed from: l */
    public void m32837l() {
        m32857a(C2176h.m32829a(49, new byte[]{1, 0, 1, 0}));
    }

    /* renamed from: m */
    public void m32836m() {
        m32857a(C2176h.m32829a(49, new byte[]{1, 0, 0, 1}));
    }
}
