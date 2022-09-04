package com.google.android.gms.fitness;

import android.content.Intent;
import android.os.Build;
import com.google.android.gms.common.C4538f;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.ako;
import com.google.android.gms.internal.akp;
import com.google.android.gms.internal.akq;
import com.google.android.gms.internal.akr;
import com.google.android.gms.internal.aks;
import com.google.android.gms.internal.akt;
import com.google.android.gms.internal.aku;
import com.google.android.gms.internal.akv;
import com.google.android.gms.internal.als;
import com.google.android.gms.internal.alt;
import com.google.android.gms.internal.alu;
import com.google.android.gms.internal.alv;
import com.google.android.gms.internal.alw;
import com.google.android.gms.internal.alx;
import com.google.android.gms.internal.aly;
import com.google.android.gms.internal.alz;
import com.google.android.gms.internal.ama;
import com.google.android.gms.internal.amc;
import java.util.concurrent.TimeUnit;
/* renamed from: com.google.android.gms.fitness.c */
/* loaded from: classes.dex */
public class C5128c {

    /* renamed from: A */
    public static final String f18215A = "vnd.google.fitness.VIEW";

    /* renamed from: B */
    public static final String f18216B = "vnd.google.fitness.VIEW_GOAL";

    /* renamed from: C */
    public static final String f18217C = "vnd.google.fitness.start_time";

    /* renamed from: D */
    public static final String f18218D = "vnd.google.fitness.end_time";
    @Deprecated

    /* renamed from: a */
    public static final Void f18219a = null;

    /* renamed from: b */
    public static final C4467a<C4467a.AbstractC4468a.C4470b> f18220b = aku.f22148e;

    /* renamed from: c */
    public static final AbstractC5175h f18221c = new alz();

    /* renamed from: d */
    public static final C4467a<C4467a.AbstractC4468a.C4470b> f18222d = akt.f22146e;

    /* renamed from: e */
    public static final AbstractC5174g f18223e = new aly();

    /* renamed from: f */
    public static final C4467a<C4467a.AbstractC4468a.C4470b> f18224f = akv.f22150e;

    /* renamed from: g */
    public static final AbstractC5176i f18225g = new ama();

    /* renamed from: h */
    public static final C4467a<C4467a.AbstractC4468a.C4470b> f18226h = akr.f22142e;

    /* renamed from: i */
    public static final AbstractC5172f f18227i = new alw();

    /* renamed from: j */
    public static final C4467a<C4467a.AbstractC4468a.C4470b> f18228j = akq.f22140e;

    /* renamed from: k */
    public static final AbstractC5183k f18229k = new alv();

    /* renamed from: l */
    public static final C4467a<C4467a.AbstractC4468a.C4470b> f18230l = akp.f22138e;

    /* renamed from: m */
    public static final AbstractC5127b f18231m = new alu();

    /* renamed from: n */
    public static final C4467a<C4467a.AbstractC4468a.C4470b> f18232n = ako.f22136e;

    /* renamed from: o */
    public static final AbstractC5126a f18233o = m21771a();

    /* renamed from: p */
    public static final C4467a<C4467a.AbstractC4468a.C4470b> f18234p = aks.f22144e;

    /* renamed from: q */
    public static final als f18235q = new alx();

    /* renamed from: r */
    public static final Scope f18236r = new Scope(C4538f.f16931k);

    /* renamed from: s */
    public static final Scope f18237s = new Scope(C4538f.f16932l);

    /* renamed from: t */
    public static final Scope f18238t = new Scope(C4538f.f16933m);

    /* renamed from: u */
    public static final Scope f18239u = new Scope(C4538f.f16934n);

    /* renamed from: v */
    public static final Scope f18240v = new Scope(C4538f.f16935o);

    /* renamed from: w */
    public static final Scope f18241w = new Scope(C4538f.f16936p);

    /* renamed from: x */
    public static final Scope f18242x = new Scope(C4538f.f16937q);

    /* renamed from: y */
    public static final Scope f18243y = new Scope(C4538f.f16938r);

    /* renamed from: z */
    public static final String f18244z = "vnd.google.fitness.TRACK";

    private C5128c() {
    }

    /* renamed from: a */
    public static long m21770a(Intent intent, TimeUnit timeUnit) {
        long longExtra = intent.getLongExtra(f18217C, -1L);
        if (longExtra == -1) {
            return -1L;
        }
        return timeUnit.convert(longExtra, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    private static AbstractC5126a m21771a() {
        return Build.VERSION.SDK_INT >= 18 ? new alt() : new amc();
    }

    /* renamed from: b */
    public static long m21769b(Intent intent, TimeUnit timeUnit) {
        long longExtra = intent.getLongExtra(f18218D, -1L);
        if (longExtra == -1) {
            return -1L;
        }
        return timeUnit.convert(longExtra, TimeUnit.MILLISECONDS);
    }
}
