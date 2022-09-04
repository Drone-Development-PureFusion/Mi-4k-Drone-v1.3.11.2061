package com.xiaomi.push.service;

import com.xiaomi.push.service.XMPushService;
/* renamed from: com.xiaomi.push.service.ba */
/* loaded from: classes.dex */
class C10647ba extends XMPushService.AbstractC10592h {

    /* renamed from: b */
    final /* synthetic */ XMPushService f33104b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10647ba(XMPushService xMPushService, int i) {
        super(i);
        this.f33104b = xMPushService;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
    /* renamed from: a */
    public void mo3811a() {
        if (this.f33104b.f32937i != null) {
            this.f33104b.f32937i.mo3935b(15, (Exception) null);
            this.f33104b.f32937i = null;
        }
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
    /* renamed from: b */
    public String mo3810b() {
        return "disconnect for service destroy.";
    }
}
