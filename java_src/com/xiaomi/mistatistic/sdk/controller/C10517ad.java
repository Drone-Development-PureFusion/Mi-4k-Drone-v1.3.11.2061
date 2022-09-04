package com.xiaomi.mistatistic.sdk.controller;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.mistatistic.sdk.controller.ad */
/* loaded from: classes2.dex */
public class C10517ad implements AbstractC10524e {

    /* renamed from: a */
    final /* synthetic */ int f32662a;

    /* renamed from: b */
    final /* synthetic */ long f32663b;

    /* renamed from: c */
    final /* synthetic */ C10515ab f32664c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10517ad(C10515ab c10515ab, int i, long j) {
        this.f32664c = c10515ab;
        this.f32662a = i;
        this.f32663b = j;
    }

    @Override // com.xiaomi.mistatistic.sdk.controller.AbstractC10524e
    /* renamed from: a */
    public void mo4784a() {
        int i;
        int i2;
        int i3;
        long j;
        long j2;
        this.f32664c.f32658b = this.f32662a;
        i = this.f32664c.f32658b;
        if (i == 4) {
            this.f32664c.f32659c = this.f32663b;
        } else {
            this.f32664c.f32659c = -1L;
        }
        Context m4880a = AbstractC10508a.m4880a();
        i2 = this.f32664c.f32658b;
        C10538s.m4809b(m4880a, "upload_policy", i2);
        i3 = this.f32664c.f32658b;
        if (i3 == 4) {
            Context m4880a2 = AbstractC10508a.m4880a();
            j = this.f32664c.f32659c;
            C10538s.m4808b(m4880a2, "upload_interval", j);
            C10521b m4859a = C10521b.m4859a();
            C10518ae c10518ae = new C10518ae(this);
            j2 = this.f32664c.f32659c;
            m4859a.m4855a(c10518ae, j2);
        }
    }
}
