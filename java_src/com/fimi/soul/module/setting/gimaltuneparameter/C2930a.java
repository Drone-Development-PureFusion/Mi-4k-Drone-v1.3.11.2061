package com.fimi.soul.module.setting.gimaltuneparameter;

import com.fimi.soul.drone.C2083a;
import com.fimi.soul.drone.p195d.p196a.C2196c;
/* renamed from: com.fimi.soul.module.setting.gimaltuneparameter.a */
/* loaded from: classes.dex */
public class C2930a {

    /* renamed from: a */
    public static final byte f10521a = 0;

    /* renamed from: b */
    public static final byte f10522b = 1;

    /* renamed from: c */
    public static final byte f10523c = 2;

    /* renamed from: d */
    public static final byte f10524d = 0;

    /* renamed from: e */
    public static final byte f10525e = 1;

    /* renamed from: f */
    public static final byte f10526f = 2;

    /* renamed from: g */
    public static final byte f10527g = 3;

    /* renamed from: h */
    public static final byte f10528h = 4;

    /* renamed from: i */
    public static final byte f10529i = 5;

    /* renamed from: j */
    public static final byte f10530j = 0;

    /* renamed from: k */
    public static final byte f10531k = 1;

    /* renamed from: l */
    public static final byte f10532l = 2;

    /* renamed from: m */
    public static final byte f10533m = 3;

    /* renamed from: n */
    public static final byte f10534n = 4;

    /* renamed from: o */
    public static final byte f10535o = 5;

    /* renamed from: p */
    private static final int f10536p = 7;

    /* renamed from: q */
    private C2083a f10537q;

    public C2930a(C2083a c2083a) {
        this.f10537q = c2083a;
    }

    /* renamed from: b */
    private C2196c m29895b(byte b) {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 7;
        c2196c.f6913c = 114;
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b(b);
        c2196c.f6914d.m32744b((byte) 1);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 0);
        return c2196c;
    }

    /* renamed from: b */
    private C2196c m29894b(byte b, int i, int i2, int i3) {
        C2196c c2196c = new C2196c();
        c2196c.f6912b = 7;
        c2196c.f6913c = 114;
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b((byte) 0);
        c2196c.f6914d.m32744b(b);
        c2196c.f6914d.m32744b((byte) 2);
        c2196c.f6914d.m32744b((byte) i);
        c2196c.f6914d.m32744b((byte) i2);
        c2196c.f6914d.m32744b((byte) i3);
        return c2196c;
    }

    /* renamed from: a */
    public void m29897a(byte b) {
        this.f10537q.mo32906ab().mo32587a(m29895b(b));
    }

    /* renamed from: a */
    public void m29896a(byte b, int i, int i2, int i3) {
        this.f10537q.mo32906ab().mo32587a(m29894b(b, i, i2, i3));
    }
}
