package com.tencent.stat;

import com.tencent.stat.p268a.AbstractC10327e;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.stat.r */
/* loaded from: classes2.dex */
public class RunnableC10366r implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AbstractC10327e f32300a;

    /* renamed from: b */
    final /* synthetic */ AbstractC10335c f32301b;

    /* renamed from: c */
    final /* synthetic */ C10362n f32302c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC10366r(C10362n c10362n, AbstractC10327e abstractC10327e, AbstractC10335c abstractC10335c) {
        this.f32302c = c10362n;
        this.f32300a = abstractC10327e;
        this.f32301b = abstractC10335c;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f32302c.m5348b(this.f32300a, this.f32301b);
    }
}
