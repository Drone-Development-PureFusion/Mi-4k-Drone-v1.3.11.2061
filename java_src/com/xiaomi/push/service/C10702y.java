package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.smack.C10730l;
import com.xiaomi.xmpush.thrift.C10769ab;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.push.service.y */
/* loaded from: classes2.dex */
public final class C10702y extends XMPushService.AbstractC10592h {

    /* renamed from: b */
    final /* synthetic */ XMPushService f33254b;

    /* renamed from: c */
    final /* synthetic */ C10769ab f33255c;

    /* renamed from: d */
    final /* synthetic */ String f33256d;

    /* renamed from: e */
    final /* synthetic */ String f33257e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10702y(int i, XMPushService xMPushService, C10769ab c10769ab, String str, String str2) {
        super(i);
        this.f33254b = xMPushService;
        this.f33255c = c10769ab;
        this.f33256d = str;
        this.f33257e = str2;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
    /* renamed from: a */
    public void mo3811a() {
        try {
            C10769ab m4109a = C10692s.m4109a((Context) this.f33254b, this.f33255c);
            m4109a.f33673h.m3301a("error", this.f33256d);
            m4109a.f33673h.m3301a("reason", this.f33257e);
            C10601aa.m4440a(this.f33254b, m4109a);
        } catch (C10730l e) {
            AbstractC10404b.m5267a(e);
            this.f33254b.m4499a(10, e);
        }
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
    /* renamed from: b */
    public String mo3810b() {
        return "send wrong message ack for message.";
    }
}
