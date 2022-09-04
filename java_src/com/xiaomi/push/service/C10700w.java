package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.smack.C10730l;
import com.xiaomi.xmpush.thrift.C10769ab;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.push.service.w */
/* loaded from: classes2.dex */
public final class C10700w extends XMPushService.AbstractC10592h {

    /* renamed from: b */
    final /* synthetic */ XMPushService f33249b;

    /* renamed from: c */
    final /* synthetic */ C10769ab f33250c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10700w(int i, XMPushService xMPushService, C10769ab c10769ab) {
        super(i);
        this.f33249b = xMPushService;
        this.f33250c = c10769ab;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
    /* renamed from: a */
    public void mo3811a() {
        try {
            C10769ab m4109a = C10692s.m4109a((Context) this.f33249b, this.f33250c);
            m4109a.m3727m().m3301a("miui_message_unrecognized", "1");
            C10601aa.m4440a(this.f33249b, m4109a);
        } catch (C10730l e) {
            AbstractC10404b.m5267a(e);
            this.f33249b.m4499a(10, e);
        }
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
    /* renamed from: b */
    public String mo3810b() {
        return "send ack message for unrecognized new miui message.";
    }
}
