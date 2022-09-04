package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.smack.C10730l;
import com.xiaomi.xmpush.thrift.C10769ab;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.push.service.x */
/* loaded from: classes2.dex */
public final class C10701x extends XMPushService.AbstractC10592h {

    /* renamed from: b */
    final /* synthetic */ XMPushService f33251b;

    /* renamed from: c */
    final /* synthetic */ C10769ab f33252c;

    /* renamed from: d */
    final /* synthetic */ String f33253d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10701x(int i, XMPushService xMPushService, C10769ab c10769ab, String str) {
        super(i);
        this.f33251b = xMPushService;
        this.f33252c = c10769ab;
        this.f33253d = str;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
    /* renamed from: a */
    public void mo3811a() {
        try {
            C10769ab m4109a = C10692s.m4109a((Context) this.f33251b, this.f33252c);
            m4109a.m3727m().m3301a("absent_target_package", this.f33253d);
            C10601aa.m4440a(this.f33251b, m4109a);
        } catch (C10730l e) {
            AbstractC10404b.m5267a(e);
            this.f33251b.m4499a(10, e);
        }
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
    /* renamed from: b */
    public String mo3810b() {
        return "send app absent ack message for message.";
    }
}
