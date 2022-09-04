package com.xiaomi.channel.commonutils.misc;

import com.xiaomi.channel.commonutils.misc.C10414h;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.channel.commonutils.misc.j */
/* loaded from: classes2.dex */
public class RunnableC10418j implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C10414h.AbstractC10416b f32364a;

    /* renamed from: b */
    final /* synthetic */ C10414h f32365b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC10418j(C10414h c10414h, C10414h.AbstractC10416b abstractC10416b) {
        this.f32365b = c10414h;
        this.f32364a = abstractC10416b;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f32365b.m5243a(this.f32364a);
    }
}
