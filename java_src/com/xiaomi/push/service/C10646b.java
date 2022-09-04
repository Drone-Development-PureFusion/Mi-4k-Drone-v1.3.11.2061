package com.xiaomi.push.service;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.push.service.C10615ak;
import com.xiaomi.slim.C10710b;
import com.xiaomi.smack.packet.AbstractC10735d;
import com.xiaomi.smack.packet.C10732b;
import com.xiaomi.smack.packet.C10734c;
import com.xiaomi.smack.packet.C10737f;
import java.util.Collection;
import java.util.Iterator;
/* renamed from: com.xiaomi.push.service.b */
/* loaded from: classes.dex */
public class C10646b {

    /* renamed from: a */
    private C10692s f33103a = new C10692s();

    /* renamed from: a */
    public static String m4285a(String str) {
        return str + ".permission.MIPUSH_RECEIVE";
    }

    /* renamed from: a */
    private static void m4293a(Context context, Intent intent, String str) {
        if ("com.xiaomi.xmsf".equals(context.getPackageName())) {
            context.sendBroadcast(intent);
        } else {
            context.sendBroadcast(intent, m4285a(str));
        }
    }

    /* renamed from: a */
    C10615ak.C10617b m4287a(C10710b c10710b) {
        Collection<C10615ak.C10617b> m4372c = C10615ak.m4383a().m4372c(Integer.toString(c10710b.m4023c()));
        if (m4372c.isEmpty()) {
            return null;
        }
        Iterator<C10615ak.C10617b> it2 = m4372c.iterator();
        if (m4372c.size() == 1) {
            return it2.next();
        }
        String m4013j = c10710b.m4013j();
        while (it2.hasNext()) {
            C10615ak.C10617b next = it2.next();
            if (TextUtils.equals(m4013j, next.f32997b)) {
                return next;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    C10615ak.C10617b m4286a(AbstractC10735d abstractC10735d) {
        Collection<C10615ak.C10617b> m4372c = C10615ak.m4383a().m4372c(abstractC10735d.m3884l());
        if (m4372c.isEmpty()) {
            return null;
        }
        Iterator<C10615ak.C10617b> it2 = m4372c.iterator();
        if (m4372c.size() == 1) {
            return it2.next();
        }
        String m3880n = abstractC10735d.m3880n();
        String m3882m = abstractC10735d.m3882m();
        while (it2.hasNext()) {
            C10615ak.C10617b next = it2.next();
            if (TextUtils.equals(m3880n, next.f32997b) || TextUtils.equals(m3882m, next.f32997b)) {
                return next;
            }
            while (it2.hasNext()) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m4294a(Context context) {
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.push.service_started");
        context.sendBroadcast(intent);
    }

    /* renamed from: a */
    public void m4292a(Context context, C10615ak.C10617b c10617b, int i) {
        if ("5".equalsIgnoreCase(c10617b.f33003h)) {
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.push.channel_closed");
        intent.setPackage(c10617b.f32996a);
        intent.putExtra(AbstractC10621am.f33042q, c10617b.f33003h);
        intent.putExtra("ext_reason", i);
        intent.putExtra(AbstractC10621am.f33041p, c10617b.f32997b);
        intent.putExtra(AbstractC10621am.f33019B, c10617b.f33005j);
        m4293a(context, intent, c10617b.f32996a);
    }

    /* renamed from: a */
    public void m4291a(Context context, C10615ak.C10617b c10617b, String str, String str2) {
        if ("5".equalsIgnoreCase(c10617b.f33003h)) {
            AbstractC10404b.m5264d("mipush kicked by server");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.push.kicked");
        intent.setPackage(c10617b.f32996a);
        intent.putExtra("ext_kick_type", str);
        intent.putExtra("ext_kick_reason", str2);
        intent.putExtra("ext_chid", c10617b.f33003h);
        intent.putExtra(AbstractC10621am.f33041p, c10617b.f32997b);
        intent.putExtra(AbstractC10621am.f33019B, c10617b.f33005j);
        m4293a(context, intent, c10617b.f32996a);
    }

    /* renamed from: a */
    public void m4290a(Context context, C10615ak.C10617b c10617b, boolean z, int i, String str) {
        if ("5".equalsIgnoreCase(c10617b.f33003h)) {
            this.f33103a.m4110a(context, c10617b, z, i, str);
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.push.channel_opened");
        intent.setPackage(c10617b.f32996a);
        intent.putExtra("ext_succeeded", z);
        if (!z) {
            intent.putExtra("ext_reason", i);
        }
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("ext_reason_msg", str);
        }
        intent.putExtra("ext_chid", c10617b.f33003h);
        intent.putExtra(AbstractC10621am.f33041p, c10617b.f32997b);
        intent.putExtra(AbstractC10621am.f33019B, c10617b.f33005j);
        m4293a(context, intent, c10617b.f32996a);
    }

    /* renamed from: a */
    public void m4289a(XMPushService xMPushService, String str, C10710b c10710b) {
        C10615ak.C10617b m4287a = m4287a(c10710b);
        if (m4287a == null) {
            AbstractC10404b.m5264d("error while notify channel closed! channel " + str + " not registered");
        } else if ("5".equalsIgnoreCase(str)) {
            this.f33103a.m4106a(xMPushService, c10710b, m4287a);
        } else {
            AbstractC10404b.m5269a("don't support binary yet");
        }
    }

    /* renamed from: a */
    public void m4288a(XMPushService xMPushService, String str, AbstractC10735d abstractC10735d) {
        String str2;
        C10615ak.C10617b m4286a = m4286a(abstractC10735d);
        if (m4286a == null) {
            AbstractC10404b.m5264d("error while notify channel closed! channel " + str + " not registered");
        } else if ("5".equalsIgnoreCase(str)) {
            this.f33103a.m4105a(xMPushService, abstractC10735d, m4286a);
        } else {
            String str3 = m4286a.f32996a;
            if (abstractC10735d instanceof C10734c) {
                str2 = "com.xiaomi.push.new_msg";
            } else if (abstractC10735d instanceof C10732b) {
                str2 = "com.xiaomi.push.new_iq";
            } else if (!(abstractC10735d instanceof C10737f)) {
                AbstractC10404b.m5264d("unknown packet type, drop it");
                return;
            } else {
                str2 = "com.xiaomi.push.new_pres";
            }
            Intent intent = new Intent();
            intent.setAction(str2);
            intent.setPackage(str3);
            intent.putExtra("ext_chid", str);
            intent.putExtra("ext_packet", abstractC10735d.mo3863b());
            intent.putExtra(AbstractC10621am.f33019B, m4286a.f33005j);
            intent.putExtra(AbstractC10621am.f33046u, m4286a.f33004i);
            m4293a(xMPushService, intent, str3);
        }
    }
}
