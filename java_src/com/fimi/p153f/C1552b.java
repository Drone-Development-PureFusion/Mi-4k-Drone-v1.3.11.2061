package com.fimi.p153f;

import com.fimi.p148c.AbstractC1522a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* renamed from: com.fimi.f.b */
/* loaded from: classes.dex */
public class C1552b {

    /* renamed from: b */
    private static C1552b f3793b = new C1552b();

    /* renamed from: a */
    ExecutorService f3794a = Executors.newFixedThreadPool(10);

    /* renamed from: c */
    private RunnableC1551a f3795c;

    /* renamed from: a */
    public static C1552b m35201a() {
        if (f3793b == null) {
            f3793b = new C1552b();
        }
        return f3793b;
    }

    /* renamed from: a */
    public void m35200a(AbstractC1522a abstractC1522a) {
        if (this.f3795c == null) {
            this.f3795c = new RunnableC1551a(abstractC1522a);
            m35199a(this.f3795c);
        }
    }

    /* renamed from: a */
    public void m35199a(Runnable runnable) {
        this.f3794a.execute(runnable);
    }

    /* renamed from: b */
    public void m35198b() {
        if (this.f3795c != null) {
            this.f3795c.m35203a();
        }
    }
}
