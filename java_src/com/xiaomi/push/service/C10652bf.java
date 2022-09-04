package com.xiaomi.push.service;

import com.xiaomi.push.service.C10615ak;
import com.xiaomi.push.service.XMPushService;
/* renamed from: com.xiaomi.push.service.bf */
/* loaded from: classes.dex */
class C10652bf implements C10615ak.AbstractC10616a {

    /* renamed from: a */
    final /* synthetic */ XMPushService f33109a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10652bf(XMPushService xMPushService) {
        this.f33109a = xMPushService;
    }

    @Override // com.xiaomi.push.service.C10615ak.AbstractC10616a
    /* renamed from: a */
    public void mo4284a() {
        this.f33109a.m4447n();
        if (C10615ak.m4383a().m4373c() <= 0) {
            this.f33109a.m4494a(new XMPushService.C10590f(12, null));
        }
    }
}
