package com.fimi.soul.drone.p205i;

import com.fimi.soul.drone.p195d.p196a.C2197d;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.soul.drone.i.j */
/* loaded from: classes.dex */
public class C2349j extends AbstractC2285a {

    /* renamed from: a */
    private boolean f7691a = false;

    /* renamed from: b */
    private boolean f7692b = false;

    /* renamed from: c */
    private EnumC2351b f7693c = EnumC2351b.Set;

    /* renamed from: d */
    private EnumC2350a f7694d = EnumC2350a.None;

    /* renamed from: e */
    private int f7695e = 0;

    /* renamed from: f */
    private int f7696f = 0;

    /* renamed from: com.fimi.soul.drone.i.j$a */
    /* loaded from: classes.dex */
    public enum EnumC2350a {
        None,
        StartRecord,
        StopRecrod,
        QuicklyShot,
        StopQuicklyShot,
        NormalShot
    }

    /* renamed from: com.fimi.soul.drone.i.j$b */
    /* loaded from: classes.dex */
    public enum EnumC2351b {
        Set,
        Get
    }

    /* renamed from: a */
    private EnumC2350a m31937a(byte b) {
        return b == 1 ? EnumC2350a.StartRecord : b == 2 ? EnumC2350a.StopRecrod : b == 6 ? EnumC2350a.QuicklyShot : b == 9 ? EnumC2350a.StopQuicklyShot : b == 5 ? EnumC2350a.NormalShot : EnumC2350a.None;
    }

    /* renamed from: b */
    private EnumC2351b m31931b(byte b) {
        if (b != 1 && b == 2) {
            return EnumC2351b.Get;
        }
        return EnumC2351b.Set;
    }

    @Override // com.fimi.soul.drone.p195d.AbstractC2108a
    /* renamed from: a */
    public void mo31936a(C2197d c2197d) {
        c2197d.m32741c();
        byte m32739d = c2197d.m32739d();
        byte m32739d2 = c2197d.m32739d();
        if (a() == 51) {
            this.f7695e = (m32739d2 * 100) + c2197d.m32739d();
            this.f7696f = c2197d.m32739d();
        }
        m31935a(m31937a(m32739d));
        m31934a(m31931b(m32739d2));
        if (c2197d.m32739d() == 1) {
            m31929b(true);
        }
        if (c2197d.m32739d() == 1) {
            m31933a(true);
        }
    }

    /* renamed from: a */
    public void m31935a(EnumC2350a enumC2350a) {
        this.f7694d = enumC2350a;
    }

    /* renamed from: a */
    public void m31934a(EnumC2351b enumC2351b) {
        this.f7693c = enumC2351b;
    }

    /* renamed from: a */
    public void m31933a(boolean z) {
        this.f7692b = z;
    }

    /* renamed from: b */
    public int m31932b() {
        return this.f7696f;
    }

    /* renamed from: b */
    public void m31930b(int i) {
        this.f7696f = i;
    }

    /* renamed from: b */
    public void m31929b(boolean z) {
        this.f7691a = z;
    }

    /* renamed from: c */
    public EnumC2351b m31928c() {
        return this.f7693c;
    }

    /* renamed from: d */
    public int m31927d() {
        return this.f7695e;
    }

    /* renamed from: e */
    public EnumC2350a m31926e() {
        return this.f7694d;
    }

    /* renamed from: f */
    public boolean m31925f() {
        return this.f7692b;
    }

    /* renamed from: g */
    public boolean m31924g() {
        return this.f7691a;
    }

    public String toString() {
        return "CloudCamraActionVariable{isFormatSDCard=" + this.f7691a + ", isResetFactory=" + this.f7692b + ", cameraRequestType=" + this.f7693c + ", cameraActionType=" + this.f7694d + C0494h.f735w;
    }
}
