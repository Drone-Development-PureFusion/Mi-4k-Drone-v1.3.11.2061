package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import android.util.Pair;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.api.C4467a.AbstractC4468a;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.C4593i;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.internal.ahh;
import com.google.android.gms.internal.ahl;
import com.google.android.gms.internal.aic;
import com.google.android.gms.internal.aid;
import com.google.android.gms.internal.aim;
import com.google.android.gms.internal.aiv;
import com.google.android.gms.p239g.AbstractC5285f;
import com.google.android.gms.p239g.C5286g;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: com.google.android.gms.common.api.u */
/* loaded from: classes2.dex */
public abstract class AbstractC4510u<O extends C4467a.AbstractC4468a> {

    /* renamed from: a */
    private final Context f16862a;

    /* renamed from: b */
    private final aim f16863b;

    /* renamed from: c */
    private final C4467a<O> f16864c;

    /* renamed from: d */
    private final O f16865d;

    /* renamed from: e */
    private final ahh<O> f16866e;

    /* renamed from: f */
    private final Looper f16867f;

    /* renamed from: g */
    private final int f16868g;

    /* renamed from: h */
    private final aic f16869h;

    /* renamed from: i */
    private final AbstractC4489g f16870i;

    /* renamed from: j */
    private final AtomicBoolean f16871j;

    /* renamed from: k */
    private final AtomicInteger f16872k;

    /* renamed from: l */
    private C4467a.AbstractC4477f f16873l;

    public AbstractC4510u(@NonNull Context context, C4467a<O> c4467a, O o) {
        this(context, c4467a, o, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
    }

    public AbstractC4510u(@NonNull Context context, C4467a<O> c4467a, O o, Looper looper) {
        this.f16871j = new AtomicBoolean(false);
        this.f16872k = new AtomicInteger(0);
        C4588d.m23626a(context, "Null context is not permitted.");
        C4588d.m23626a(c4467a, "Api must not be null.");
        C4588d.m23626a(looper, "Looper must not be null.");
        this.f16862a = context.getApplicationContext();
        this.f16864c = c4467a;
        this.f16865d = o;
        this.f16867f = looper;
        this.f16863b = new aim();
        this.f16866e = ahh.m17488a(this.f16864c, this.f16865d);
        this.f16870i = new aid(this);
        Pair<aic, Integer> m17315a = aic.m17315a(this.f16862a, (AbstractC4510u<?>) this);
        this.f16869h = (aic) m17315a.first;
        this.f16868g = ((Integer) m17315a.second).intValue();
    }

    /* renamed from: a */
    private <TResult, A extends C4467a.AbstractC4474c> AbstractC5285f<TResult> m23940a(int i, @NonNull aiv<A, TResult> aivVar) {
        C5286g<TResult> c5286g = new C5286g<>();
        this.f16869h.m17310a(this, i, aivVar, c5286g);
        return c5286g.m20832a();
    }

    /* renamed from: a */
    private <A extends C4467a.AbstractC4474c, T extends ahl.AbstractC6343a<? extends AbstractC4502m, A>> T m23941a(int i, @NonNull T t) {
        t.l();
        this.f16869h.m17311a(this, i, (ahl.AbstractC6343a<? extends AbstractC4502m, C4467a.AbstractC4474c>) t);
        return t;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.google.android.gms.common.api.a$f] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.google.android.gms.common.api.a$h] */
    @WorkerThread
    /* renamed from: a */
    public C4467a.AbstractC4477f m23939a(Looper looper, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
        if (!m23932d()) {
            if (this.f16864c.m24008e()) {
                C4467a.AbstractC4480i<?, O> m24010c = this.f16864c.m24010c();
                this.f16873l = new C4593i(this.f16862a, looper, m24010c.m23997b(), abstractC4491b, abstractC4492c, C4626s.m23536a(this.f16862a), m24010c.m23996b(this.f16865d));
            } else {
                this.f16873l = this.f16864c.m24011b().mo7438a(this.f16862a, looper, C4626s.m23536a(this.f16862a), this.f16865d, abstractC4491b, abstractC4492c);
            }
        }
        return this.f16873l;
    }

    /* renamed from: a */
    public <TResult, A extends C4467a.AbstractC4474c> AbstractC5285f<TResult> m23937a(aiv<A, TResult> aivVar) {
        return m23940a(0, aivVar);
    }

    /* renamed from: a */
    public <A extends C4467a.AbstractC4474c, T extends ahl.AbstractC6343a<? extends AbstractC4502m, A>> T m23938a(@NonNull T t) {
        return (T) m23941a(0, (int) t);
    }

    /* renamed from: a */
    public void m23942a() {
        boolean z = true;
        if (this.f16871j.getAndSet(true)) {
            return;
        }
        this.f16863b.m17211a();
        aic aicVar = this.f16869h;
        int i = this.f16868g;
        if (this.f16872k.get() <= 0) {
            z = false;
        }
        aicVar.m17316a(i, z);
    }

    /* renamed from: b */
    public <TResult, A extends C4467a.AbstractC4474c> AbstractC5285f<TResult> m23934b(aiv<A, TResult> aivVar) {
        return m23940a(1, aivVar);
    }

    /* renamed from: b */
    public <A extends C4467a.AbstractC4474c, T extends ahl.AbstractC6343a<? extends AbstractC4502m, A>> T m23935b(@NonNull T t) {
        return (T) m23941a(1, (int) t);
    }

    /* renamed from: b */
    public void m23936b() {
        this.f16872k.incrementAndGet();
    }

    /* renamed from: c */
    public void m23933c() {
        if (this.f16872k.decrementAndGet() != 0 || !this.f16871j.get()) {
            return;
        }
        this.f16869h.m17316a(this.f16868g, false);
    }

    /* renamed from: d */
    public boolean m23932d() {
        return this.f16873l != null;
    }

    /* renamed from: e */
    public ahh<O> m23931e() {
        return this.f16866e;
    }

    /* renamed from: f */
    public int m23930f() {
        return this.f16868g;
    }

    /* renamed from: g */
    public AbstractC4489g m23929g() {
        return this.f16870i;
    }

    /* renamed from: h */
    public Looper m23928h() {
        return this.f16867f;
    }
}
