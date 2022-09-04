package com.fimi.p149d.p150a;

import com.fimi.p140a.p145e.AbstractC1507b;
import com.fimi.p140a.p145e.C1508c;
import com.fimi.p140a.p145e.C1509d;
import java.util.Arrays;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.d.a.d */
/* loaded from: classes.dex */
public class C1529d extends AbstractC1507b {

    /* renamed from: a */
    private int f3702a;

    /* renamed from: b */
    private int f3703b;

    /* renamed from: c */
    private int f3704c;

    /* renamed from: d */
    private byte[] f3705d = new byte[4];

    /* renamed from: e */
    private byte[] f3706e = new byte[4];

    /* renamed from: f */
    private byte[] f3707f = new byte[4];

    @Override // com.fimi.p140a.p145e.AbstractC1507b
    /* renamed from: a */
    public void mo35236a(C1509d c1509d) {
        c1509d.m35449c();
        a(c1509d.m35447d());
        m35315g(c1509d.m35447d());
        m35317e(c1509d.m35446e());
        m35316f(c1509d.m35446e());
        this.f3705d[0] = c1509d.m35447d();
        this.f3705d[1] = c1509d.m35447d();
        this.f3705d[2] = c1509d.m35447d();
        this.f3705d[3] = c1509d.m35447d();
        this.f3706e[0] = c1509d.m35447d();
        this.f3706e[1] = c1509d.m35447d();
        this.f3706e[2] = c1509d.m35447d();
        this.f3706e[3] = c1509d.m35447d();
        this.f3707f[0] = c1509d.m35447d();
        this.f3707f[1] = c1509d.m35447d();
        this.f3707f[2] = c1509d.m35447d();
        this.f3707f[3] = c1509d.m35447d();
    }

    /* renamed from: e */
    public void m35317e(int i) {
        this.f3703b = i;
    }

    /* renamed from: f */
    public void m35316f(int i) {
        this.f3704c = i;
    }

    @Override // com.fimi.p140a.p145e.AbstractC1507b
    /* renamed from: g */
    public C1508c mo35234g() {
        return null;
    }

    /* renamed from: g */
    public void m35315g(int i) {
        this.f3702a = i;
    }

    /* renamed from: h */
    public byte[] m35314h() {
        return this.f3705d;
    }

    /* renamed from: i */
    public byte[] m35313i() {
        return this.f3706e;
    }

    /* renamed from: j */
    public byte[] m35312j() {
        return this.f3707f;
    }

    /* renamed from: k */
    public int m35311k() {
        return this.f3703b;
    }

    /* renamed from: l */
    public int m35310l() {
        return this.f3704c;
    }

    /* renamed from: m */
    public int m35309m() {
        return this.f3702a;
    }

    @Override // com.fimi.p140a.p145e.AbstractC1507b
    public String toString() {
        return "UpgradeC1Response{model=" + this.f3702a + ", hardwareVersion=" + this.f3703b + ", softwareVersion=" + this.f3704c + ", idA=" + Arrays.toString(this.f3705d) + ", idB=" + Arrays.toString(this.f3706e) + ", idC=" + Arrays.toString(this.f3707f) + C0494h.f735w;
    }
}
