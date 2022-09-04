package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.network.C10423d;
import com.xiaomi.push.service.XMPushService;
/* renamed from: com.xiaomi.push.service.be */
/* loaded from: classes.dex */
class C10651be extends XMPushService.AbstractC10592h {

    /* renamed from: b */
    final /* synthetic */ XMPushService f33108b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10651be(XMPushService xMPushService, int i) {
        super(i);
        this.f33108b = xMPushService;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
    /* renamed from: a */
    public void mo3811a() {
        C10601aa.m4442a(this.f33108b);
        if (C10423d.m5213d(this.f33108b)) {
            this.f33108b.m4477a(true);
        }
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
    /* renamed from: b */
    public String mo3810b() {
        return "prepare the mi push account.";
    }
}
