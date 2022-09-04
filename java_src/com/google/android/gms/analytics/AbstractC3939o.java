package com.google.android.gms.analytics;

import com.google.android.gms.analytics.AbstractC3939o;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.util.AbstractC4682e;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.google.android.gms.analytics.o */
/* loaded from: classes2.dex */
public abstract class AbstractC3939o<T extends AbstractC3939o> {

    /* renamed from: a */
    protected final C3936l f15212a;

    /* renamed from: b */
    private final C3940p f15213b;

    /* renamed from: c */
    private final List<AbstractC3937m> f15214c = new ArrayList();

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC3939o(C3940p c3940p, AbstractC4682e abstractC4682e) {
        C4588d.m23627a(c3940p);
        this.f15213b = c3940p;
        C3936l c3936l = new C3936l(this, abstractC4682e);
        c3936l.m25985k();
        this.f15212a = c3936l;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25980a(C3936l c3936l) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public void m25979b(C3936l c3936l) {
        for (AbstractC3937m abstractC3937m : this.f15214c) {
            abstractC3937m.m25984a(this, c3936l);
        }
    }

    /* renamed from: l */
    public C3936l mo25978l() {
        C3936l m26000a = this.f15212a.m26000a();
        m25979b(m26000a);
        return m26000a;
    }

    /* renamed from: m */
    public C3936l m25977m() {
        return this.f15212a;
    }

    /* renamed from: n */
    public List<AbstractC3947r> m25976n() {
        return this.f15212a.m25994c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public C3940p m25975o() {
        return this.f15213b;
    }
}
