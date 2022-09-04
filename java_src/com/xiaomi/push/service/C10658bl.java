package com.xiaomi.push.service;

import com.xiaomi.push.service.XMPushService;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.push.service.bl */
/* loaded from: classes.dex */
public class C10658bl extends XMPushService.AbstractC10592h {

    /* renamed from: b */
    final /* synthetic */ XMPushService f33122b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10658bl(XMPushService xMPushService, int i) {
        super(i);
        this.f33122b = xMPushService;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
    /* renamed from: a */
    public void mo3811a() {
        if (this.f33122b.f32937i != null) {
            this.f33122b.f32937i.m3975h();
            this.f33122b.f32937i = null;
        }
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
    /* renamed from: b */
    public String mo3810b() {
        return "disconnect for disable push";
    }
}
