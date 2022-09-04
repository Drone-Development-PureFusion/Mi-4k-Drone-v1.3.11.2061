package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.mipush.sdk.ErrorCode;
import com.xiaomi.push.service.C10615ak;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.smack.C10730l;
import java.io.IOException;
import java.util.Collection;
import org.json.JSONException;
/* renamed from: com.xiaomi.push.service.q */
/* loaded from: classes.dex */
public class C10689q extends XMPushService.AbstractC10592h {

    /* renamed from: b */
    private XMPushService f33220b;

    /* renamed from: c */
    private byte[] f33221c;

    /* renamed from: d */
    private String f33222d;

    /* renamed from: e */
    private String f33223e;

    /* renamed from: f */
    private String f33224f;

    public C10689q(XMPushService xMPushService, String str, String str2, String str3, byte[] bArr) {
        super(9);
        this.f33220b = xMPushService;
        this.f33222d = str;
        this.f33221c = bArr;
        this.f33223e = str2;
        this.f33224f = str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo3811a() {
        C10685n c10685n;
        C10615ak.C10617b next;
        C10685n m4137a = C10686o.m4137a(this.f33220b);
        if (m4137a == null) {
            try {
                c10685n = C10686o.m4135a(this.f33220b, this.f33222d, this.f33223e, this.f33224f);
            } catch (IOException e) {
                AbstractC10404b.m5267a(e);
                c10685n = m4137a;
            } catch (JSONException e2) {
                AbstractC10404b.m5267a(e2);
            }
            if (c10685n != null) {
                AbstractC10404b.m5264d("no account for mipush");
                C10690r.m4120a(this.f33220b, ErrorCode.ERROR_AUTHERICATION_ERROR, "no account.");
                return;
            }
            Collection<C10615ak.C10617b> m4372c = C10615ak.m4383a().m4372c("5");
            if (m4372c.isEmpty()) {
                next = c10685n.m4141a(this.f33220b);
                C10601aa.m4441a(this.f33220b, next);
                C10615ak.m4383a().m4379a(next);
            } else {
                next = m4372c.iterator().next();
            }
            if (!this.f33220b.m4457f()) {
                this.f33220b.m4477a(true);
                return;
            }
            try {
                if (next.f33008m == C10615ak.EnumC10619c.binded) {
                    C10601aa.m4439a(this.f33220b, this.f33222d, this.f33221c);
                } else if (next.f33008m == C10615ak.EnumC10619c.unbind) {
                    XMPushService xMPushService = this.f33220b;
                    XMPushService xMPushService2 = this.f33220b;
                    xMPushService2.getClass();
                    xMPushService.m4494a(new XMPushService.C10585a(next));
                }
                return;
            } catch (C10730l e3) {
                AbstractC10404b.m5267a(e3);
                this.f33220b.m4499a(10, e3);
                return;
            }
        }
        c10685n = m4137a;
        if (c10685n != null) {
        }
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC10592h
    /* renamed from: b */
    public String mo3810b() {
        return "register app";
    }
}
