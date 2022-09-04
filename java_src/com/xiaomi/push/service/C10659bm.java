package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.smack.C10730l;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.push.service.bm */
/* loaded from: classes.dex */
public class C10659bm extends XMPushService.AbstractC10592h {

    /* renamed from: b */
    final /* synthetic */ String f33123b;

    /* renamed from: c */
    final /* synthetic */ byte[] f33124c;

    /* renamed from: d */
    final /* synthetic */ XMPushService f33125d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10659bm(XMPushService xMPushService, int i, String str, byte[] bArr) {
        super(i);
        this.f33125d = xMPushService;
        this.f33123b = str;
        this.f33124c = bArr;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
    /* renamed from: a */
    public void mo3811a() {
        try {
            C10601aa.m4439a(this.f33125d, this.f33123b, this.f33124c);
        } catch (C10730l e) {
            AbstractC10404b.m5267a(e);
            this.f33125d.m4499a(10, e);
        }
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
    /* renamed from: b */
    public String mo3810b() {
        return "send mi push message";
    }
}
