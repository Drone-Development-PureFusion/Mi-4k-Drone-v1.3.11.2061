package com.google.android.gms.games.internal.p244d;

import java.util.concurrent.atomic.AtomicReference;
/* renamed from: com.google.android.gms.games.internal.d.c */
/* loaded from: classes2.dex */
public abstract class AbstractC5840c {

    /* renamed from: a */
    private final AtomicReference<AbstractC5837a> f19991a = new AtomicReference<>();

    /* renamed from: a */
    protected abstract AbstractC5837a mo20026a();

    /* renamed from: a */
    public void m20024a(String str, int i) {
        AbstractC5837a abstractC5837a = this.f19991a.get();
        if (abstractC5837a == null) {
            abstractC5837a = mo20026a();
            if (!this.f19991a.compareAndSet(null, abstractC5837a)) {
                abstractC5837a = this.f19991a.get();
            }
        }
        abstractC5837a.m20036b(str, i);
    }

    /* renamed from: b */
    public void m20023b() {
        AbstractC5837a abstractC5837a = this.f19991a.get();
        if (abstractC5837a != null) {
            abstractC5837a.m20039a();
        }
    }
}
