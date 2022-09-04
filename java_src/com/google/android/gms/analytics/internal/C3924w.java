package com.google.android.gms.analytics.internal;

import android.content.Context;
import com.google.android.gms.analytics.C3836c;
import com.google.android.gms.analytics.C3940p;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.util.AbstractC4682e;
import com.google.android.gms.common.util.C4685h;
/* renamed from: com.google.android.gms.analytics.internal.w */
/* loaded from: classes2.dex */
public class C3924w {

    /* renamed from: a */
    private final Context f15172a;

    /* renamed from: b */
    private final Context f15173b;

    public C3924w(Context context) {
        C4588d.m23627a(context);
        Context applicationContext = context.getApplicationContext();
        C4588d.m23626a(applicationContext, "Application context can't be null");
        this.f15172a = applicationContext;
        this.f15173b = applicationContext;
    }

    /* renamed from: a */
    public Context m26094a() {
        return this.f15172a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public C3878ak m26092a(C3922v c3922v) {
        return new C3878ak(c3922v);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public C3940p m26093a(Context context) {
        return C3940p.m25973a(context);
    }

    /* renamed from: b */
    public Context m26091b() {
        return this.f15173b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public C3859aa m26090b(C3922v c3922v) {
        return new C3859aa(c3922v);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public C3858a m26089c(C3922v c3922v) {
        return new C3858a(c3922v);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public C3867ad m26088d(C3922v c3922v) {
        return new C3867ad(c3922v);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public C3910q m26087e(C3922v c3922v) {
        return new C3910q(c3922v);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public C3893g m26086f(C3922v c3922v) {
        return new C3893g(c3922v);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public C3874ah m26085g(C3922v c3922v) {
        return new C3874ah(c3922v);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public AbstractC4682e m26084h(C3922v c3922v) {
        return C4685h.m23138d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public C3836c m26083i(C3922v c3922v) {
        return new C3836c(c3922v);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public C3860ab m26082j(C3922v c3922v) {
        return new C3860ab(c3922v, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public C3894h m26081k(C3922v c3922v) {
        return new C3894h(c3922v);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public C3911r m26080l(C3922v c3922v) {
        return new C3911r(c3922v, this);
    }

    /* renamed from: m */
    public C3931z m26079m(C3922v c3922v) {
        return new C3931z(c3922v);
    }

    /* renamed from: n */
    public C3895i m26078n(C3922v c3922v) {
        return new C3895i(c3922v);
    }

    /* renamed from: o */
    public C3926y m26077o(C3922v c3922v) {
        return new C3926y(c3922v);
    }

    /* renamed from: p */
    public C3879al m26076p(C3922v c3922v) {
        return new C3879al(c3922v);
    }

    /* renamed from: q */
    public C3897j m26075q(C3922v c3922v) {
        return new C3897j(c3922v);
    }
}
