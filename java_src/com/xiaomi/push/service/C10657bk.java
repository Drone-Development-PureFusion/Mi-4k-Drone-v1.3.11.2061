package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.misc.C10405a;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.smack.C10718b;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.push.service.bk */
/* loaded from: classes.dex */
public class C10657bk extends XMPushService.AbstractC10592h {

    /* renamed from: b */
    final /* synthetic */ int f33118b;

    /* renamed from: c */
    final /* synthetic */ byte[] f33119c;

    /* renamed from: d */
    final /* synthetic */ String f33120d;

    /* renamed from: e */
    final /* synthetic */ XMPushService f33121e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10657bk(XMPushService xMPushService, int i, int i2, byte[] bArr, String str) {
        super(i);
        this.f33121e = xMPushService;
        this.f33118b = i2;
        this.f33119c = bArr;
        this.f33120d = str;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
    /* renamed from: a */
    public void mo3811a() {
        C10718b c10718b;
        C10686o.m4133b(this.f33121e);
        C10615ak.m4383a().m4378a("5");
        C10405a.m5261a(this.f33118b);
        c10718b = this.f33121e.f32932c;
        c10718b.m3959b(C10718b.m3960b());
        this.f33121e.m4476a(this.f33119c, this.f33120d);
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
    /* renamed from: b */
    public String mo3810b() {
        return "clear account cache.";
    }
}
