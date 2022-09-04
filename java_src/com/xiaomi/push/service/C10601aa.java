package com.xiaomi.push.service;

import android.content.Context;
import com.tencent.p263mm.sdk.message.RMsgInfoDB;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.mipush.sdk.ErrorCode;
import com.xiaomi.push.service.C10615ak;
import com.xiaomi.slim.C10710b;
import com.xiaomi.smack.AbstractC10716a;
import com.xiaomi.smack.C10730l;
import com.xiaomi.smack.packet.AbstractC10735d;
import com.xiaomi.xmpush.thrift.C10769ab;
import com.xiaomi.xmpush.thrift.C10775ae;
import com.xiaomi.xmpush.thrift.C10799aq;
import com.xiaomi.xmpush.thrift.C10831u;
import com.xiaomi.xmpush.thrift.EnumC10766a;
import java.nio.ByteBuffer;
import org.p286a.p321b.AbstractC11361a;
import org.p286a.p321b.C11392f;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.push.service.aa */
/* loaded from: classes.dex */
public final class C10601aa {
    /* renamed from: a */
    static C10710b m4438a(XMPushService xMPushService, byte[] bArr) {
        C10769ab c10769ab = new C10769ab();
        try {
            C10799aq.m3470a(c10769ab, bArr);
            return m4437a(C10686o.m4137a(xMPushService), xMPushService, c10769ab);
        } catch (C11392f e) {
            AbstractC10404b.m5267a(e);
            return null;
        }
    }

    /* renamed from: a */
    static C10710b m4437a(C10685n c10685n, Context context, C10769ab c10769ab) {
        try {
            C10710b c10710b = new C10710b();
            c10710b.m4034a(5);
            c10710b.m4022c(c10685n.f33206a);
            c10710b.m4025b(c10769ab.f33671f);
            c10710b.m4030a("SECMSG", RMsgInfoDB.TABLE);
            String str = c10685n.f33206a;
            c10769ab.f33672g.f34543b = str.substring(0, str.indexOf("@"));
            c10769ab.f33672g.f34545d = str.substring(str.indexOf("/") + 1);
            c10710b.m4027a(C10799aq.m3471a(c10769ab), c10685n.f33208c);
            c10710b.m4028a((short) 1);
            AbstractC10404b.m5269a("try send mi push message. packagename:" + c10769ab.f33671f + " action:" + c10769ab.f33666a);
            return c10710b;
        } catch (NullPointerException e) {
            AbstractC10404b.m5267a(e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C10769ab m4436a(String str, String str2) {
        C10775ae c10775ae = new C10775ae();
        c10775ae.m3698b(str2);
        c10775ae.m3695c("package uninstalled");
        c10775ae.m3706a(AbstractC10735d.m3887j());
        c10775ae.m3702a(false);
        return m4435a(str, str2, c10775ae, EnumC10766a.Notification);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static <T extends AbstractC11361a<T, ?>> C10769ab m4435a(String str, String str2, T t, EnumC10766a enumC10766a) {
        byte[] m3471a = C10799aq.m3471a(t);
        C10769ab c10769ab = new C10769ab();
        C10831u c10831u = new C10831u();
        c10831u.f34542a = 5L;
        c10831u.f34543b = "fakeid";
        c10769ab.m3747a(c10831u);
        c10769ab.m3745a(ByteBuffer.wrap(m3471a));
        c10769ab.m3750a(enumC10766a);
        c10769ab.m3738c(true);
        c10769ab.m3741b(str);
        c10769ab.m3744a(false);
        c10769ab.m3746a(str2);
        return c10769ab;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m4442a(XMPushService xMPushService) {
        if (C10686o.m4137a(xMPushService.getApplicationContext()) != null) {
            C10615ak.C10617b m4141a = C10686o.m4137a(xMPushService.getApplicationContext()).m4141a(xMPushService);
            m4441a(xMPushService, m4141a);
            C10615ak.m4383a().m4379a(m4141a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m4441a(XMPushService xMPushService, C10615ak.C10617b c10617b) {
        c10617b.m4366a(new C10602ab(xMPushService));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m4440a(XMPushService xMPushService, C10769ab c10769ab) {
        AbstractC10716a m4453h = xMPushService.m4453h();
        if (m4453h != null) {
            if (!m4453h.mo3993a()) {
                throw new C10730l("Don't support XMPP connection.");
            }
            C10710b m4437a = m4437a(C10686o.m4137a(xMPushService), xMPushService, c10769ab);
            if (m4437a == null) {
                return;
            }
            m4453h.mo3982b(m4437a);
            return;
        }
        throw new C10730l("try send msg while connection is null.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m4439a(XMPushService xMPushService, String str, byte[] bArr) {
        AbstractC10716a m4453h = xMPushService.m4453h();
        if (m4453h != null) {
            if (!m4453h.mo3993a()) {
                throw new C10730l("Don't support XMPP connection.");
            }
            C10710b m4438a = m4438a(xMPushService, bArr);
            if (m4438a != null) {
                m4453h.mo3982b(m4438a);
                return;
            } else {
                C10690r.m4119a(xMPushService, str, bArr, ErrorCode.ERROR_INVALID_PAYLOAD, "not a valid message");
                return;
            }
        }
        throw new C10730l("try send msg while connection is null.");
    }
}
