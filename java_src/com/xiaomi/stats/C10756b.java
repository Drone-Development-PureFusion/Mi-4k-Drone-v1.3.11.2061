package com.xiaomi.stats;

import com.xiaomi.push.service.XMPushService;
/* renamed from: com.xiaomi.stats.b */
/* loaded from: classes2.dex */
class C10756b extends XMPushService.AbstractC10592h {

    /* renamed from: b */
    final /* synthetic */ C10755a f33577b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10756b(C10755a c10755a, int i) {
        super(i);
        this.f33577b = c10755a;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
    /* renamed from: a */
    public void mo3811a() {
        this.f33577b.m3812c();
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
    /* renamed from: b */
    public String mo3810b() {
        return "Handling bind stats";
    }
}
