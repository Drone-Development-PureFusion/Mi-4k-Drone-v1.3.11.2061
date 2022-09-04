package com.xiaomi.push.service;

import com.xiaomi.mipush.sdk.ErrorCode;
import com.xiaomi.push.service.C10615ak;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.push.service.ab */
/* loaded from: classes2.dex */
public final class C10602ab implements C10615ak.C10617b.AbstractC10618a {

    /* renamed from: a */
    final /* synthetic */ XMPushService f32971a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10602ab(XMPushService xMPushService) {
        this.f32971a = xMPushService;
    }

    @Override // com.xiaomi.push.service.C10615ak.C10617b.AbstractC10618a
    /* renamed from: a */
    public void mo3815a(C10615ak.EnumC10619c enumC10619c, C10615ak.EnumC10619c enumC10619c2, int i) {
        if (enumC10619c2 == C10615ak.EnumC10619c.binded) {
            C10690r.m4118a(this.f32971a);
            C10690r.m4116b(this.f32971a);
        } else if (enumC10619c2 != C10615ak.EnumC10619c.unbind) {
        } else {
            C10690r.m4120a(this.f32971a, ErrorCode.ERROR_SERVICE_UNAVAILABLE, " the push is not connected.");
        }
    }
}
