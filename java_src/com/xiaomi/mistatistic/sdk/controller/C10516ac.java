package com.xiaomi.mistatistic.sdk.controller;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.mistatistic.sdk.controller.ac */
/* loaded from: classes2.dex */
public class C10516ac implements AbstractC10524e {

    /* renamed from: a */
    final /* synthetic */ C10515ab f32661a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10516ac(C10515ab c10515ab) {
        this.f32661a = c10515ab;
    }

    @Override // com.xiaomi.mistatistic.sdk.controller.AbstractC10524e
    /* renamed from: a */
    public void mo4784a() {
        int i;
        int i2;
        this.f32661a.f32658b = C10538s.m4812a(AbstractC10508a.m4880a(), "upload_policy", 3);
        i = this.f32661a.f32658b;
        if (i == 4) {
            this.f32661a.f32659c = C10538s.m4811a(AbstractC10508a.m4880a(), "upload_interval", 86400000L);
        } else {
            this.f32661a.f32659c = -1L;
        }
        i2 = this.f32661a.f32658b;
        if (i2 == 3) {
            new C10539t().m4806a();
        }
    }
}
