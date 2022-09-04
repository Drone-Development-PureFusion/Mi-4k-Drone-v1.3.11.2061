package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.slim.C10710b;
import com.xiaomi.smack.C10730l;
import com.xiaomi.smack.packet.AbstractC10735d;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.push.service.as */
/* loaded from: classes.dex */
public class C10629as extends XMPushService.AbstractC10592h {

    /* renamed from: b */
    private XMPushService f33068b;

    /* renamed from: c */
    private AbstractC10735d f33069c;

    /* renamed from: d */
    private C10710b f33070d;

    public C10629as(XMPushService xMPushService, C10710b c10710b) {
        super(4);
        this.f33068b = null;
        this.f33068b = xMPushService;
        this.f33070d = c10710b;
    }

    public C10629as(XMPushService xMPushService, AbstractC10735d abstractC10735d) {
        super(4);
        this.f33068b = null;
        this.f33068b = xMPushService;
        this.f33069c = abstractC10735d;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
    /* renamed from: a */
    public void mo3811a() {
        try {
            if (this.f33069c != null) {
                this.f33068b.m4484a(this.f33069c);
            } else {
                this.f33068b.m4486a(this.f33070d);
            }
        } catch (C10730l e) {
            AbstractC10404b.m5267a(e);
            this.f33068b.m4499a(10, e);
        }
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
    /* renamed from: b */
    public String mo3810b() {
        return "send a message.";
    }
}
