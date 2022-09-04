package com.tencent.stat;

import com.tencent.stat.common.StatLogger;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.stat.f */
/* loaded from: classes2.dex */
public class RunnableC10354f implements Runnable {

    /* renamed from: a */
    final /* synthetic */ List f32274a;

    /* renamed from: b */
    final /* synthetic */ AbstractC10335c f32275b;

    /* renamed from: c */
    final /* synthetic */ C10352d f32276c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC10354f(C10352d c10352d, List list, AbstractC10335c abstractC10335c) {
        this.f32276c = c10352d;
        this.f32274a = list;
        this.f32275b = abstractC10335c;
    }

    @Override // java.lang.Runnable
    public void run() {
        StatLogger statLogger;
        try {
            this.f32276c.m5373a(this.f32274a, this.f32275b);
        } catch (Throwable th) {
            statLogger = C10352d.f32267c;
            statLogger.m5464e(th);
        }
    }
}
