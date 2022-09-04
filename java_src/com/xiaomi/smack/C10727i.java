package com.xiaomi.smack;

import com.xiaomi.push.service.XMPushService;
/* renamed from: com.xiaomi.smack.i */
/* loaded from: classes2.dex */
class C10727i extends XMPushService.AbstractC10592h {

    /* renamed from: b */
    final /* synthetic */ long f33443b;

    /* renamed from: c */
    final /* synthetic */ AbstractC10726h f33444c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10727i(AbstractC10726h abstractC10726h, int i, long j) {
        super(i);
        this.f33444c = abstractC10726h;
        this.f33443b = j;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
    /* renamed from: a */
    public void mo3811a() {
        Thread.yield();
        if (!this.f33444c.k() || this.f33444c.a(this.f33443b)) {
            return;
        }
        this.f33444c.f33437r.m4499a(22, (Exception) null);
        this.f33444c.f33437r.m4477a(true);
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
    /* renamed from: b */
    public String mo3810b() {
        return "check the ping-pong." + this.f33443b;
    }
}
