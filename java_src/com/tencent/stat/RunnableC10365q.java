package com.tencent.stat;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.stat.q */
/* loaded from: classes2.dex */
public class RunnableC10365q implements Runnable {

    /* renamed from: a */
    final /* synthetic */ List f32298a;

    /* renamed from: b */
    final /* synthetic */ C10362n f32299b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC10365q(C10362n c10362n, List list) {
        this.f32299b = c10362n;
        this.f32298a = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f32299b.m5345b(this.f32298a);
    }
}
