package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.smack.C10730l;
import com.xiaomi.xmpush.thrift.C10769ab;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.push.service.u */
/* loaded from: classes2.dex */
public final class C10698u extends XMPushService.AbstractC10592h {

    /* renamed from: b */
    final /* synthetic */ XMPushService f33245b;

    /* renamed from: c */
    final /* synthetic */ C10769ab f33246c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10698u(int i, XMPushService xMPushService, C10769ab c10769ab) {
        super(i);
        this.f33245b = xMPushService;
        this.f33246c = c10769ab;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
    /* renamed from: a */
    public void mo3811a() {
        try {
            C10601aa.m4440a(this.f33245b, C10692s.m4109a((Context) this.f33245b, this.f33246c));
        } catch (C10730l e) {
            AbstractC10404b.m5267a(e);
            this.f33245b.m4499a(10, e);
        }
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
    /* renamed from: b */
    public String mo3810b() {
        return "send ack message for message.";
    }
}
