package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.slim.C10710b;
import com.xiaomi.smack.C10730l;
import com.xiaomi.smack.packet.C10734c;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.push.service.a */
/* loaded from: classes.dex */
public class C10600a extends XMPushService.AbstractC10592h {

    /* renamed from: b */
    private XMPushService f32968b;

    /* renamed from: c */
    private C10734c[] f32969c;

    /* renamed from: d */
    private C10710b[] f32970d;

    public C10600a(XMPushService xMPushService, C10710b[] c10710bArr) {
        super(4);
        this.f32968b = null;
        this.f32968b = xMPushService;
        this.f32970d = c10710bArr;
    }

    public C10600a(XMPushService xMPushService, C10734c[] c10734cArr) {
        super(4);
        this.f32968b = null;
        this.f32968b = xMPushService;
        this.f32969c = c10734cArr;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
    /* renamed from: a */
    public void mo3811a() {
        try {
            if (this.f32969c != null) {
                this.f32968b.m4474a(this.f32969c);
            } else {
                this.f32968b.m4475a(this.f32970d);
            }
        } catch (C10730l e) {
            AbstractC10404b.m5267a(e);
            this.f32968b.m4499a(10, e);
        }
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
    /* renamed from: b */
    public String mo3810b() {
        return "batch send message.";
    }
}
