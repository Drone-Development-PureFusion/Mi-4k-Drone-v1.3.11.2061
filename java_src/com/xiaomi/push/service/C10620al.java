package com.xiaomi.push.service;

import com.xiaomi.push.service.C10615ak;
import com.xiaomi.push.service.XMPushService;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.push.service.al */
/* loaded from: classes2.dex */
public class C10620al implements C10615ak.C10617b.AbstractC10618a {

    /* renamed from: a */
    final /* synthetic */ C10615ak.C10617b f33017a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10620al(C10615ak.C10617b c10617b) {
        this.f33017a = c10617b;
    }

    @Override // com.xiaomi.push.service.C10615ak.C10617b.AbstractC10618a
    /* renamed from: a */
    public void mo3815a(C10615ak.EnumC10619c enumC10619c, C10615ak.EnumC10619c enumC10619c2, int i) {
        XMPushService xMPushService;
        XMPushService.C10586b c10586b;
        XMPushService xMPushService2;
        XMPushService.C10586b c10586b2;
        if (enumC10619c2 == C10615ak.EnumC10619c.binding) {
            xMPushService2 = this.f33017a.f33011p;
            c10586b2 = this.f33017a.f33012q;
            xMPushService2.m4493a(c10586b2, 60000L);
            return;
        }
        xMPushService = this.f33017a.f33011p;
        c10586b = this.f33017a.f33012q;
        xMPushService.m4470b(c10586b);
    }
}
