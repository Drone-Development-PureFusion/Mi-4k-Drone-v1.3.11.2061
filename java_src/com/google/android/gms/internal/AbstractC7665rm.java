package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.AbstractC6830df;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
/* renamed from: com.google.android.gms.internal.rm */
/* loaded from: classes2.dex */
public abstract class AbstractC7665rm extends AbstractC7601pr {

    /* renamed from: l */
    protected boolean f25451l;

    /* renamed from: m */
    protected String f25452m;

    /* renamed from: o */
    protected boolean f25453o = false;

    /* renamed from: p */
    protected boolean f25454p = false;

    /* renamed from: s */
    private static final String f25449s = AbstractC7665rm.class.getSimpleName();

    /* renamed from: t */
    private static long f25450t = 0;

    /* renamed from: n */
    static boolean f25446n = false;

    /* renamed from: q */
    protected static volatile C7677rw f25447q = null;

    /* renamed from: r */
    protected static final Object f25448r = new Object();

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC7665rm(Context context, String str) {
        super(context);
        this.f25451l = false;
        this.f25452m = str;
        this.f25451l = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC7665rm(Context context, String str, boolean z) {
        super(context);
        this.f25451l = false;
        this.f25452m = str;
        this.f25451l = z;
    }

    /* renamed from: a */
    static C7680rx m13805a(C7677rw c7677rw, MotionEvent motionEvent, DisplayMetrics displayMetrics) {
        Method m13725a = c7677rw.m13725a(C7671rr.m13767H(), C7671rr.m13766I());
        if (m13725a == null || motionEvent == null) {
            throw new C7672rs();
        }
        try {
            return new C7680rx((String) m13725a.invoke(null, motionEvent, displayMetrics));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new C7672rs(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static synchronized void m13807a(Context context, boolean z) {
        synchronized (AbstractC7665rm.class) {
            if (!f25446n) {
                f25450t = Calendar.getInstance().getTime().getTime() / 1000;
                f25447q = m13799b(context, z);
                f25446n = true;
            }
        }
    }

    /* renamed from: a */
    private static void m13806a(C7677rw c7677rw) {
        List<Class> singletonList = Collections.singletonList(Context.class);
        c7677rw.m13724a(C7671rr.m13750n(), C7671rr.m13749o(), singletonList);
        c7677rw.m13724a(C7671rr.m13740x(), C7671rr.m13739y(), singletonList);
        c7677rw.m13724a(C7671rr.m13742v(), C7671rr.m13741w(), singletonList);
        c7677rw.m13724a(C7671rr.m13756h(), C7671rr.m13755i(), singletonList);
        c7677rw.m13724a(C7671rr.m13746r(), C7671rr.m13745s(), singletonList);
        c7677rw.m13724a(C7671rr.m13760d(), C7671rr.m13759e(), singletonList);
        c7677rw.m13724a(C7671rr.m13765J(), C7671rr.m13764K(), singletonList);
        List<Class> asList = Arrays.asList(MotionEvent.class, DisplayMetrics.class);
        c7677rw.m13724a(C7671rr.m13767H(), C7671rr.m13766I(), asList);
        c7677rw.m13724a(C7671rr.m13769F(), C7671rr.m13768G(), asList);
        c7677rw.m13724a(C7671rr.m13752l(), C7671rr.m13751m(), Collections.emptyList());
        c7677rw.m13724a(C7671rr.m13771D(), C7671rr.m13770E(), Collections.emptyList());
        c7677rw.m13724a(C7671rr.m13744t(), C7671rr.m13743u(), Collections.emptyList());
        c7677rw.m13724a(C7671rr.m13754j(), C7671rr.m13753k(), Collections.emptyList());
        c7677rw.m13724a(C7671rr.m13748p(), C7671rr.m13747q(), Collections.emptyList());
        c7677rw.m13724a(C7671rr.m13773B(), C7671rr.m13772C(), Collections.emptyList());
        c7677rw.m13724a(C7671rr.m13758f(), C7671rr.m13757g(), Arrays.asList(Context.class, Boolean.TYPE));
        c7677rw.m13724a(C7671rr.m13738z(), C7671rr.m13774A(), Arrays.asList(StackTraceElement[].class));
    }

    /* renamed from: b */
    protected static C7677rw m13799b(Context context, boolean z) {
        if (f25447q == null) {
            synchronized (f25448r) {
                if (f25447q == null) {
                    C7677rw m13731a = C7677rw.m13731a(context, C7671rr.m13763a(), C7671rr.m13761c(), z);
                    m13806a(m13731a);
                    f25447q = m13731a;
                }
            }
        }
        return f25447q;
    }

    /* renamed from: d */
    private void m13796d(C7677rw c7677rw, AbstractC6830df.C6831a c6831a) {
        try {
            C7680rx m13805a = m13805a(c7677rw, this.f25189a, this.f25199k);
            c6831a.f22975n = m13805a.f25501a;
            c6831a.f22976o = m13805a.f25502b;
            c6831a.f22977p = m13805a.f25503c;
            if (this.f25198j) {
                c6831a.f22933D = m13805a.f25504d;
                c6831a.f22934E = m13805a.f25505e;
            }
            if (C7788uf.f25832bk.m13486c().booleanValue() || C7788uf.f25827bf.m13486c().booleanValue()) {
                AbstractC6830df.C6831a.C6832a c6832a = new AbstractC6830df.C6831a.C6832a();
                C7680rx mo13798b = mo13798b(this.f25189a);
                c6832a.f22989a = mo13798b.f25501a;
                c6832a.f22990b = mo13798b.f25502b;
                c6832a.f22996h = mo13798b.f25503c;
                if (this.f25198j) {
                    c6832a.f22991c = mo13798b.f25505e;
                    c6832a.f22993e = mo13798b.f25504d;
                    c6832a.f22995g = Integer.valueOf(mo13798b.f25506f.longValue() != 0 ? 1 : 0);
                    if (this.f25192d > 0) {
                        c6832a.f22992d = this.f25199k != null ? Long.valueOf(Math.round(this.f25197i / this.f25192d)) : null;
                        c6832a.f22994f = Long.valueOf(Math.round(this.f25196h / this.f25192d));
                    }
                    c6832a.f22998j = mo13798b.f25509i;
                    c6832a.f22997i = mo13798b.f25510j;
                    c6832a.f22999k = Integer.valueOf(mo13798b.f25511k.longValue() != 0 ? 1 : 0);
                    if (this.f25195g > 0) {
                        c6832a.f23000l = Long.valueOf(this.f25195g);
                    }
                }
                c6831a.f22952W = c6832a;
            }
        } catch (C7672rs e) {
        }
        if (this.f25191c > 0) {
            c6831a.f22938I = Long.valueOf(this.f25191c);
        }
        if (this.f25192d > 0) {
            c6831a.f22937H = Long.valueOf(this.f25192d);
        }
        if (this.f25193e > 0) {
            c6831a.f22936G = Long.valueOf(this.f25193e);
        }
        if (this.f25194f > 0) {
            c6831a.f22939J = Long.valueOf(this.f25194f);
        }
        try {
            int size = this.f25190b.size() - 1;
            if (size <= 0) {
                return;
            }
            c6831a.f22953X = new AbstractC6830df.C6831a.C6832a[size];
            for (int i = 0; i < size; i++) {
                C7680rx m13805a2 = m13805a(c7677rw, this.f25190b.get(i), this.f25199k);
                AbstractC6830df.C6831a.C6832a c6832a2 = new AbstractC6830df.C6831a.C6832a();
                c6832a2.f22989a = m13805a2.f25501a;
                c6832a2.f22990b = m13805a2.f25502b;
                c6831a.f22953X[i] = c6832a2;
            }
        } catch (C7672rs e2) {
            c6831a.f22953X = null;
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7601pr
    /* renamed from: a */
    protected long mo13801a(StackTraceElement[] stackTraceElementArr) {
        Method m13725a = f25447q.m13725a(C7671rr.m13738z(), C7671rr.m13774A());
        if (m13725a == null || stackTraceElementArr == null) {
            throw new C7672rs();
        }
        try {
            return new C7673rt((String) m13725a.invoke(null, stackTraceElementArr)).f25467a.longValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new C7672rs(e);
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7601pr
    /* renamed from: a */
    protected AbstractC6830df.C6831a mo13808a(Context context, View view) {
        AbstractC6830df.C6831a c6831a = new AbstractC6830df.C6831a();
        if (!TextUtils.isEmpty(this.f25452m)) {
            c6831a.f22963b = this.f25452m;
        }
        C7677rw m13799b = m13799b(context, this.f25451l);
        m13799b.m13705o();
        m13803a(m13799b, c6831a, view);
        m13799b.m13704p();
        return c6831a;
    }

    /* renamed from: a */
    protected void mo13804a(C7677rw c7677rw, AbstractC6830df.C6831a c6831a) {
        if (c7677rw.m13717c() == null) {
            return;
        }
        m13802a(mo13794b(c7677rw, c6831a));
    }

    /* renamed from: a */
    protected void m13803a(C7677rw c7677rw, AbstractC6830df.C6831a c6831a, View view) {
        m13796d(c7677rw, c6831a);
        m13802a(m13797c(c7677rw, c6831a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m13802a(List<Callable<Void>> list) {
        ExecutorService m13717c;
        if (f25447q == null || (m13717c = f25447q.m13717c()) == null || list.isEmpty()) {
            return;
        }
        try {
            m13717c.invokeAll(list, C7788uf.f25822ba.m13486c().longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Log.d(f25449s, String.format("class methods got exception: %s", C7681ry.m13696a(e)));
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7601pr
    /* renamed from: b */
    protected AbstractC6830df.C6831a mo13800b(Context context) {
        AbstractC6830df.C6831a c6831a = new AbstractC6830df.C6831a();
        if (!TextUtils.isEmpty(this.f25452m)) {
            c6831a.f22963b = this.f25452m;
        }
        C7677rw m13799b = m13799b(context, this.f25451l);
        m13799b.m13705o();
        mo13804a(m13799b, c6831a);
        m13799b.m13704p();
        return c6831a;
    }

    @Override // com.google.android.gms.internal.AbstractC7601pr
    /* renamed from: b */
    protected C7680rx mo13798b(MotionEvent motionEvent) {
        Method m13725a = f25447q.m13725a(C7671rr.m13769F(), C7671rr.m13768G());
        if (m13725a == null || motionEvent == null) {
            throw new C7672rs();
        }
        try {
            return new C7680rx((String) m13725a.invoke(null, motionEvent, this.f25199k));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new C7672rs(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public List<Callable<Void>> mo13794b(C7677rw c7677rw, AbstractC6830df.C6831a c6831a) {
        int m13703q = c7677rw.m13703q();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C7685sb(c7677rw, C7671rr.m13758f(), C7671rr.m13757g(), c6831a, m13703q, 27, C7788uf.f25826be.m13486c().booleanValue() || C7788uf.f25827bf.m13486c().booleanValue()));
        arrayList.add(new C7688se(c7677rw, C7671rr.m13752l(), C7671rr.m13751m(), c6831a, f25450t, m13703q, 25));
        arrayList.add(new C7693sj(c7677rw, C7671rr.m13744t(), C7671rr.m13743u(), c6831a, m13703q, 1));
        arrayList.add(new C7694sk(c7677rw, C7671rr.m13742v(), C7671rr.m13741w(), c6831a, m13703q, 31));
        arrayList.add(new C7697sn(c7677rw, C7671rr.m13771D(), C7671rr.m13770E(), c6831a, m13703q, 33));
        arrayList.add(new C7684sa(c7677rw, C7671rr.m13740x(), C7671rr.m13739y(), c6831a, m13703q, 29));
        arrayList.add(new C7686sc(c7677rw, C7671rr.m13756h(), C7671rr.m13755i(), c6831a, m13703q, 5));
        arrayList.add(new C7692si(c7677rw, C7671rr.m13746r(), C7671rr.m13745s(), c6831a, m13703q, 12));
        arrayList.add(new C7682rz(c7677rw, C7671rr.m13760d(), C7671rr.m13759e(), c6831a, m13703q, 3));
        arrayList.add(new C7687sd(c7677rw, C7671rr.m13754j(), C7671rr.m13753k(), c6831a, m13703q, 44));
        arrayList.add(new C7691sh(c7677rw, C7671rr.m13748p(), C7671rr.m13747q(), c6831a, m13703q, 22));
        if (C7788uf.f25829bh.m13486c().booleanValue() || C7788uf.f25827bf.m13486c().booleanValue()) {
            arrayList.add(new C7698so(c7677rw, C7671rr.m13765J(), C7671rr.m13764K(), c6831a, m13703q, 48));
        }
        if (C7788uf.f25834bm.m13486c().booleanValue() || C7788uf.f25827bf.m13486c().booleanValue()) {
            arrayList.add(new C7696sm(c7677rw, C7671rr.m13773B(), C7671rr.m13772C(), c6831a, m13703q, 51));
        }
        return arrayList;
    }

    /* renamed from: c */
    protected List<Callable<Void>> m13797c(C7677rw c7677rw, AbstractC6830df.C6831a c6831a) {
        ArrayList arrayList = new ArrayList();
        if (c7677rw.m13717c() == null) {
            return arrayList;
        }
        int m13703q = c7677rw.m13703q();
        arrayList.add(new CallableC7690sg(c7677rw, c6831a));
        arrayList.add(new C7693sj(c7677rw, C7671rr.m13744t(), C7671rr.m13743u(), c6831a, m13703q, 1));
        arrayList.add(new C7688se(c7677rw, C7671rr.m13752l(), C7671rr.m13751m(), c6831a, f25450t, m13703q, 25));
        arrayList.add(new C7687sd(c7677rw, C7671rr.m13754j(), C7671rr.m13753k(), c6831a, m13703q, 44));
        arrayList.add(new C7682rz(c7677rw, C7671rr.m13760d(), C7671rr.m13759e(), c6831a, m13703q, 3));
        arrayList.add(new C7691sh(c7677rw, C7671rr.m13748p(), C7671rr.m13747q(), c6831a, m13703q, 22));
        if (C7788uf.f25838bq.m13486c().booleanValue() || C7788uf.f25827bf.m13486c().booleanValue()) {
            arrayList.add(new C7686sc(c7677rw, C7671rr.m13756h(), C7671rr.m13755i(), c6831a, m13703q, 5));
        }
        if (C7788uf.f25831bj.m13486c().booleanValue() || C7788uf.f25827bf.m13486c().booleanValue()) {
            arrayList.add(new C7698so(c7677rw, C7671rr.m13765J(), C7671rr.m13764K(), c6831a, m13703q, 48));
        }
        if (C7788uf.f25836bo.m13486c().booleanValue() || C7788uf.f25827bf.m13486c().booleanValue()) {
            arrayList.add(new C7696sm(c7677rw, C7671rr.m13773B(), C7671rr.m13772C(), c6831a, m13703q, 51));
        }
        if (C7788uf.f25841bt.m13486c().booleanValue() || C7788uf.f25827bf.m13486c().booleanValue()) {
            arrayList.add(new C7695sl(c7677rw, C7671rr.m13738z(), C7671rr.m13774A(), c6831a, m13703q, 45, new Throwable().getStackTrace()));
        }
        return arrayList;
    }
}
