package com.xiaomi.push.service;

import com.xiaomi.push.service.XMPushService;
import com.xiaomi.slim.C10710b;
import com.xiaomi.smack.AbstractC10723f;
import com.xiaomi.smack.packet.AbstractC10735d;
/* renamed from: com.xiaomi.push.service.az */
/* loaded from: classes.dex */
class C10645az implements AbstractC10723f {

    /* renamed from: a */
    final /* synthetic */ XMPushService f33102a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10645az(XMPushService xMPushService) {
        this.f33102a = xMPushService;
    }

    @Override // com.xiaomi.smack.AbstractC10723f
    /* renamed from: a */
    public void mo3953a(C10710b c10710b) {
        this.f33102a.m4494a(new XMPushService.C10587c(c10710b));
    }

    @Override // com.xiaomi.smack.AbstractC10723f
    /* renamed from: b */
    public void mo3952b(AbstractC10735d abstractC10735d) {
        this.f33102a.m4494a(new XMPushService.C10595k(abstractC10735d));
    }
}
