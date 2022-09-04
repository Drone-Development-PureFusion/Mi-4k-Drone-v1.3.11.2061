package com.tencent.stat;
/* renamed from: com.tencent.stat.m */
/* loaded from: classes2.dex */
class C10361m implements AbstractC10335c {

    /* renamed from: a */
    final /* synthetic */ RunnableC10359k f32286a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10361m(RunnableC10359k runnableC10359k) {
        this.f32286a = runnableC10359k;
    }

    @Override // com.tencent.stat.AbstractC10335c
    /* renamed from: a */
    public void mo5338a() {
        if (C10362n.m5351b().m5364a() >= StatConfig.getMaxBatchReportCount()) {
            C10362n.m5351b().m5363a(StatConfig.getMaxBatchReportCount());
        }
    }

    @Override // com.tencent.stat.AbstractC10335c
    /* renamed from: b */
    public void mo5337b() {
    }
}
