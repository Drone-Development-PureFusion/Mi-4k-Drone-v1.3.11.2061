package com.google.android.gms.ads.internal;

import android.os.Build;
import com.google.android.gms.ads.internal.cache.C3488a;
import com.google.android.gms.ads.internal.overlay.C3639a;
import com.google.android.gms.ads.internal.overlay.C3657e;
import com.google.android.gms.ads.internal.overlay.C3671q;
import com.google.android.gms.ads.internal.overlay.C3672r;
import com.google.android.gms.ads.internal.purchase.C3693i;
import com.google.android.gms.ads.internal.request.C3708a;
import com.google.android.gms.common.util.AbstractC4682e;
import com.google.android.gms.common.util.C4685h;
import com.google.android.gms.internal.C7756tp;
import com.google.android.gms.internal.C7784uc;
import com.google.android.gms.internal.C7785ud;
import com.google.android.gms.internal.C7786ue;
import com.google.android.gms.internal.C7793ui;
import com.google.android.gms.internal.C7902wh;
import com.google.android.gms.internal.C7938wp;
import com.google.android.gms.internal.C7985xc;
import com.google.android.gms.internal.C7998xm;
import com.google.android.gms.internal.C8113zn;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.aal;
import com.google.android.gms.internal.abl;
import com.google.android.gms.internal.abv;
import com.google.android.gms.internal.abw;
import com.google.android.gms.internal.abz;
import com.google.android.gms.internal.acd;
import com.google.android.gms.internal.acf;
import com.google.android.gms.internal.acq;
import com.google.android.gms.internal.act;
import com.google.android.gms.internal.ada;
@aaa
/* renamed from: com.google.android.gms.ads.internal.u */
/* loaded from: classes.dex */
public class C3779u {

    /* renamed from: a */
    private static final Object f14700a = new Object();

    /* renamed from: b */
    private static C3779u f14701b;

    /* renamed from: c */
    private final C3639a f14708c = new C3639a();

    /* renamed from: d */
    private final C3708a f14709d = new C3708a();

    /* renamed from: e */
    private final C3657e f14710e = new C3657e();

    /* renamed from: f */
    private final C8113zn f14711f = new C8113zn();

    /* renamed from: g */
    private final abv f14712g = new abv();

    /* renamed from: h */
    private final ada f14713h = new ada();

    /* renamed from: i */
    private final abw f14714i = abw.m18305a(Build.VERSION.SDK_INT);

    /* renamed from: j */
    private final C7756tp f14715j = new C7756tp();

    /* renamed from: k */
    private final abl f14716k = new abl(this.f14712g);

    /* renamed from: l */
    private final C3488a f14717l = new C3488a();

    /* renamed from: m */
    private final AbstractC4682e f14718m = new C4685h();

    /* renamed from: n */
    private final C3619g f14719n = new C3619g();

    /* renamed from: o */
    private final C7793ui f14720o = new C7793ui();

    /* renamed from: p */
    private final abz f14721p = new abz();

    /* renamed from: q */
    private final aal f14722q = new aal();

    /* renamed from: r */
    private final C7784uc f14723r = new C7784uc();

    /* renamed from: s */
    private final C7785ud f14724s = new C7785ud();

    /* renamed from: t */
    private final C7786ue f14725t = new C7786ue();

    /* renamed from: u */
    private final acq f14726u = new acq();

    /* renamed from: v */
    private final C3693i f14727v = new C3693i();

    /* renamed from: w */
    private final C7938wp f14728w = new C7938wp();

    /* renamed from: x */
    private final C7985xc f14729x = new C7985xc();

    /* renamed from: y */
    private final acd f14730y = new acd();

    /* renamed from: z */
    private final C3671q f14731z = new C3671q();

    /* renamed from: A */
    private final C3672r f14702A = new C3672r();

    /* renamed from: B */
    private final C7998xm f14703B = new C7998xm();

    /* renamed from: C */
    private final acf f14704C = new acf();

    /* renamed from: D */
    private final C3682p f14705D = new C3682p();

    /* renamed from: E */
    private final C7902wh f14706E = new C7902wh();

    /* renamed from: F */
    private final act f14707F = new act();

    static {
        m26894a(new C3779u());
    }

    protected C3779u() {
    }

    /* renamed from: A */
    public static C3619g m26899A() {
        return m26896D().f14719n;
    }

    /* renamed from: B */
    public static C7902wh m26898B() {
        return m26896D().f14706E;
    }

    /* renamed from: C */
    public static act m26897C() {
        return m26896D().f14707F;
    }

    /* renamed from: D */
    private static C3779u m26896D() {
        C3779u c3779u;
        synchronized (f14700a) {
            c3779u = f14701b;
        }
        return c3779u;
    }

    /* renamed from: a */
    public static C3708a m26895a() {
        return m26896D().f14709d;
    }

    /* renamed from: a */
    protected static void m26894a(C3779u c3779u) {
        synchronized (f14700a) {
            f14701b = c3779u;
        }
    }

    /* renamed from: b */
    public static C3639a m26893b() {
        return m26896D().f14708c;
    }

    /* renamed from: c */
    public static C3657e m26892c() {
        return m26896D().f14710e;
    }

    /* renamed from: d */
    public static C8113zn m26891d() {
        return m26896D().f14711f;
    }

    /* renamed from: e */
    public static abv m26890e() {
        return m26896D().f14712g;
    }

    /* renamed from: f */
    public static ada m26889f() {
        return m26896D().f14713h;
    }

    /* renamed from: g */
    public static abw m26888g() {
        return m26896D().f14714i;
    }

    /* renamed from: h */
    public static C7756tp m26887h() {
        return m26896D().f14715j;
    }

    /* renamed from: i */
    public static abl m26886i() {
        return m26896D().f14716k;
    }

    /* renamed from: j */
    public static C3488a m26885j() {
        return m26896D().f14717l;
    }

    /* renamed from: k */
    public static AbstractC4682e m26884k() {
        return m26896D().f14718m;
    }

    /* renamed from: l */
    public static C7793ui m26883l() {
        return m26896D().f14720o;
    }

    /* renamed from: m */
    public static abz m26882m() {
        return m26896D().f14721p;
    }

    /* renamed from: n */
    public static aal m26881n() {
        return m26896D().f14722q;
    }

    /* renamed from: o */
    public static C7785ud m26880o() {
        return m26896D().f14724s;
    }

    /* renamed from: p */
    public static C7784uc m26879p() {
        return m26896D().f14723r;
    }

    /* renamed from: q */
    public static C7786ue m26878q() {
        return m26896D().f14725t;
    }

    /* renamed from: r */
    public static acq m26877r() {
        return m26896D().f14726u;
    }

    /* renamed from: s */
    public static C3693i m26876s() {
        return m26896D().f14727v;
    }

    /* renamed from: t */
    public static C7938wp m26875t() {
        return m26896D().f14728w;
    }

    /* renamed from: u */
    public static acd m26874u() {
        return m26896D().f14730y;
    }

    /* renamed from: v */
    public static C3671q m26873v() {
        return m26896D().f14731z;
    }

    /* renamed from: w */
    public static C3672r m26872w() {
        return m26896D().f14702A;
    }

    /* renamed from: x */
    public static C7998xm m26871x() {
        return m26896D().f14703B;
    }

    /* renamed from: y */
    public static C3682p m26870y() {
        return m26896D().f14705D;
    }

    /* renamed from: z */
    public static acf m26869z() {
        return m26896D().f14704C;
    }
}
