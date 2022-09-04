package com.tencent.stat;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.stat.v */
/* loaded from: classes2.dex */
public class RunnableC10370v implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f32309a;

    /* renamed from: b */
    final /* synthetic */ C10362n f32310b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC10370v(C10362n c10362n, int i) {
        this.f32310b = c10362n;
        this.f32309a = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        int m5528a = StatConfig.m5528a();
        int i = this.f32309a == -1 ? this.f32310b.f32290b : this.f32309a;
        int i2 = i / m5528a;
        int i3 = i % m5528a;
        for (int i4 = 0; i4 < i2 + 1; i4++) {
            this.f32310b.m5350b(m5528a);
        }
        if (i3 > 0) {
            this.f32310b.m5350b(i3);
        }
    }
}
