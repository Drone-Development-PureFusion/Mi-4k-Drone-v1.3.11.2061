package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.smack.C10730l;
import com.xiaomi.xmpush.thrift.C10769ab;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.push.service.z */
/* loaded from: classes2.dex */
public final class C10703z extends XMPushService.AbstractC10592h {

    /* renamed from: b */
    final /* synthetic */ XMPushService f33258b;

    /* renamed from: c */
    final /* synthetic */ C10769ab f33259c;

    /* renamed from: d */
    final /* synthetic */ boolean f33260d;

    /* renamed from: e */
    final /* synthetic */ boolean f33261e;

    /* renamed from: f */
    final /* synthetic */ boolean f33262f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10703z(int i, XMPushService xMPushService, C10769ab c10769ab, boolean z, boolean z2, boolean z3) {
        super(i);
        this.f33258b = xMPushService;
        this.f33259c = c10769ab;
        this.f33260d = z;
        this.f33261e = z2;
        this.f33262f = z3;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
    /* renamed from: a */
    public void mo3811a() {
        try {
            C10601aa.m4440a(this.f33258b, C10692s.m4108a((Context) this.f33258b, this.f33259c, this.f33260d, this.f33261e, this.f33262f));
        } catch (C10730l e) {
            AbstractC10404b.m5267a(e);
            this.f33258b.m4499a(10, e);
        }
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
    /* renamed from: b */
    public String mo3810b() {
        return "send wrong message ack for message.";
    }
}
