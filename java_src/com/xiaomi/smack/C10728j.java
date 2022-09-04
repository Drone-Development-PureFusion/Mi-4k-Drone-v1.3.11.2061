package com.xiaomi.smack;

import com.xiaomi.push.service.XMPushService;
/* renamed from: com.xiaomi.smack.j */
/* loaded from: classes2.dex */
class C10728j extends XMPushService.AbstractC10592h {

    /* renamed from: b */
    final /* synthetic */ int f33445b;

    /* renamed from: c */
    final /* synthetic */ Exception f33446c;

    /* renamed from: d */
    final /* synthetic */ AbstractC10726h f33447d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10728j(AbstractC10726h abstractC10726h, int i, int i2, Exception exc) {
        super(i);
        this.f33447d = abstractC10726h;
        this.f33445b = i2;
        this.f33446c = exc;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
    /* renamed from: a */
    public void mo3811a() {
        this.f33447d.f33437r.m4499a(this.f33445b, this.f33446c);
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
    /* renamed from: b */
    public String mo3810b() {
        return "shutdown the connection. " + this.f33445b + ", " + this.f33446c;
    }
}
