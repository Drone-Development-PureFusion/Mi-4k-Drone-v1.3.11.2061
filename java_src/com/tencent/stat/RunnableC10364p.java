package com.tencent.stat;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.stat.p */
/* loaded from: classes2.dex */
public class RunnableC10364p implements Runnable {

    /* renamed from: a */
    final /* synthetic */ List f32295a;

    /* renamed from: b */
    final /* synthetic */ int f32296b;

    /* renamed from: c */
    final /* synthetic */ C10362n f32297c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC10364p(C10362n c10362n, List list, int i) {
        this.f32297c = c10362n;
        this.f32295a = list;
        this.f32296b = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f32297c.m5344b(this.f32295a, this.f32296b);
    }
}
