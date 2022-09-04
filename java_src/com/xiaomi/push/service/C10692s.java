package com.xiaomi.push.service;

import android.accounts.Account;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.tencent.tauth.AuthActivity;
import com.xiaomi.channel.commonutils.android.C10390b;
import com.xiaomi.channel.commonutils.android.C10395f;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.service.C10603ac;
import com.xiaomi.push.service.C10615ak;
import com.xiaomi.slim.C10710b;
import com.xiaomi.smack.packet.AbstractC10735d;
import com.xiaomi.smack.packet.C10731a;
import com.xiaomi.smack.packet.C10734c;
import com.xiaomi.smack.util.C10752g;
import com.xiaomi.xmpush.thrift.C10769ab;
import com.xiaomi.xmpush.thrift.C10799aq;
import com.xiaomi.xmpush.thrift.C10826r;
import com.xiaomi.xmpush.thrift.C10835w;
import com.xiaomi.xmpush.thrift.EnumC10766a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
/* renamed from: com.xiaomi.push.service.s */
/* loaded from: classes2.dex */
public class C10692s {
    /* renamed from: a */
    public static Intent m4094a(byte[] bArr, long j) {
        C10769ab m4095a = m4095a(bArr);
        if (m4095a == null) {
            return null;
        }
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.putExtra("mipush_payload", bArr);
        intent.putExtra("mrt", Long.toString(j));
        intent.setPackage(m4095a.f33671f);
        return intent;
    }

    /* renamed from: a */
    public static C10769ab m4109a(Context context, C10769ab c10769ab) {
        return m4108a(context, c10769ab, false, false, false);
    }

    /* renamed from: a */
    public static C10769ab m4108a(Context context, C10769ab c10769ab, boolean z, boolean z2, boolean z3) {
        C10835w c10835w = new C10835w();
        c10835w.m3225b(c10769ab.m3732h());
        C10826r m3727m = c10769ab.m3727m();
        if (m3727m != null) {
            c10835w.m3230a(m3727m.m3298b());
            c10835w.m3232a(m3727m.m3289d());
            if (!TextUtils.isEmpty(m3727m.m3284f())) {
                c10835w.m3221c(m3727m.m3284f());
            }
        }
        c10835w.m3229a(C10799aq.m3472a(context, c10769ab));
        c10835w.m3224b(C10799aq.m3469a(z, z2, z3));
        C10769ab m4435a = C10601aa.m4435a(c10769ab.m3730j(), c10769ab.m3732h(), c10835w, EnumC10766a.AckMessage);
        C10826r m3305a = c10769ab.m3727m().m3305a();
        m3305a.m3301a("mat", Long.toString(System.currentTimeMillis()));
        m4435a.m3748a(m3305a);
        return m4435a;
    }

    /* renamed from: a */
    public static C10769ab m4095a(byte[] bArr) {
        C10769ab c10769ab = new C10769ab();
        try {
            C10799aq.m3470a(c10769ab, bArr);
            return c10769ab;
        } catch (Throwable th) {
            AbstractC10404b.m5267a(th);
            return null;
        }
    }

    /* renamed from: a */
    private static void m4104a(XMPushService xMPushService, C10769ab c10769ab) {
        xMPushService.m4494a(new C10693t(4, xMPushService, c10769ab));
    }

    /* renamed from: a */
    private static void m4103a(XMPushService xMPushService, C10769ab c10769ab, String str) {
        xMPushService.m4494a(new C10701x(4, xMPushService, c10769ab, str));
    }

    /* renamed from: a */
    private static void m4102a(XMPushService xMPushService, C10769ab c10769ab, String str, String str2) {
        xMPushService.m4494a(new C10702y(4, xMPushService, c10769ab, str, str2));
    }

    /* renamed from: a */
    public static void m4101a(XMPushService xMPushService, C10769ab c10769ab, boolean z, boolean z2, boolean z3) {
        xMPushService.m4494a(new C10703z(4, xMPushService, c10769ab, z, z2, z3));
    }

    /* renamed from: a */
    public static void m4099a(XMPushService xMPushService, String str, byte[] bArr, Intent intent, boolean z) {
        C10769ab m4095a = m4095a(bArr);
        C10826r m3727m = m4095a.m3727m();
        if (m4090c(m4095a) && m4107a(xMPushService, str)) {
            m4089d(xMPushService, m4095a);
        } else if (m4097a(m4095a) && !m4107a(xMPushService, str) && !m4092b(m4095a)) {
            m4088e(xMPushService, m4095a);
        } else if ((!C10603ac.m4414b(m4095a) || !C10390b.m5319f(xMPushService, m4095a.f33671f)) && !m4111a(xMPushService, intent)) {
            if (!C10390b.m5319f(xMPushService, m4095a.f33671f)) {
                m4104a(xMPushService, m4095a);
            } else {
                AbstractC10404b.m5269a("receive a mipush message, we can see the app, but we can't see the receiver.");
            }
        } else {
            if (EnumC10766a.Registration == m4095a.m3751a()) {
                String m3730j = m4095a.m3730j();
                SharedPreferences.Editor edit = xMPushService.getSharedPreferences("pref_registered_pkg_names", 0).edit();
                edit.putString(m3730j, m4095a.f33670e);
                edit.commit();
                C10636aw.m4319a().m4305b("Registe Success, package name is " + m3730j);
            }
            if (m3727m != null && !TextUtils.isEmpty(m3727m.m3282h()) && !TextUtils.isEmpty(m3727m.m3280j()) && m3727m.f34500h != 1 && (C10603ac.m4418a(m3727m.m3271s()) || !C10603ac.m4426a(xMPushService, m4095a.f33671f))) {
                boolean z2 = false;
                String str2 = null;
                if (m3727m != null) {
                    if (m3727m.f34502j != null) {
                        str2 = m3727m.f34502j.get("jobkey");
                    }
                    if (TextUtils.isEmpty(str2)) {
                        str2 = m3727m.m3298b();
                    }
                    z2 = C10606ad.m4409a(xMPushService, m4095a.f33671f, str2);
                }
                if (z2) {
                    AbstractC10404b.m5269a("drop a duplicate message, key=" + str2);
                } else {
                    C10603ac.C10605b m4429a = C10603ac.m4429a(xMPushService, m4095a, bArr);
                    if (m4429a.f32977b > 0 && !TextUtils.isEmpty(m4429a.f32976a)) {
                        C10752g.m3827a(xMPushService, m4429a.f32976a, m4429a.f32977b, true, System.currentTimeMillis());
                    }
                    if (!C10603ac.m4414b(m4095a)) {
                        Intent intent2 = new Intent("com.xiaomi.mipush.MESSAGE_ARRIVED");
                        intent2.putExtra("mipush_payload", bArr);
                        intent2.setPackage(m4095a.f33671f);
                        try {
                            List<ResolveInfo> queryBroadcastReceivers = xMPushService.getPackageManager().queryBroadcastReceivers(intent2, 0);
                            if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
                                xMPushService.sendBroadcast(intent2, C10646b.m4285a(m4095a.f33671f));
                            }
                        } catch (Exception e) {
                            xMPushService.sendBroadcast(intent2, C10646b.m4285a(m4095a.f33671f));
                        }
                    }
                }
                if (z) {
                    m4101a(xMPushService, m4095a, false, true, false);
                } else {
                    m4091c(xMPushService, m4095a);
                }
            } else if (!"com.xiaomi.xmsf".contains(m4095a.f33671f) || m4095a.m3739c() || m3727m == null || m3727m.m3271s() == null || !m3727m.m3271s().containsKey("ab")) {
                xMPushService.sendBroadcast(intent, C10646b.m4285a(m4095a.f33671f));
            } else {
                m4091c(xMPushService, m4095a);
                AbstractC10404b.m5265c("receive abtest message. ack it." + m3727m.m3298b());
            }
            if (m4095a.m3751a() != EnumC10766a.UnRegistration || "com.xiaomi.xmsf".equals(xMPushService.getPackageName())) {
                return;
            }
            xMPushService.stopSelf();
        }
    }

    /* renamed from: a */
    private static void m4098a(XMPushService xMPushService, byte[] bArr, long j) {
        Map<String, String> m3271s;
        C10769ab m4095a = m4095a(bArr);
        if (m4095a == null) {
            return;
        }
        if (TextUtils.isEmpty(m4095a.f33671f)) {
            AbstractC10404b.m5269a("receive a mipush message without package name");
            return;
        }
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        Intent m4094a = m4094a(bArr, valueOf.longValue());
        String m4421a = C10603ac.m4421a(m4095a);
        C10752g.m3827a(xMPushService, m4421a, j, true, System.currentTimeMillis());
        C10826r m3727m = m4095a.m3727m();
        if (m3727m != null) {
            m3727m.m3301a("mrt", Long.toString(valueOf.longValue()));
        }
        if (EnumC10766a.SendMessage == m4095a.m3751a() && C10688p.m4130a(xMPushService).m4129a(m4095a.f33671f) && !C10603ac.m4414b(m4095a)) {
            String str = "";
            if (m3727m != null) {
                str = m3727m.m3298b();
            }
            AbstractC10404b.m5269a("Drop a message for unregistered, msgid=" + str);
            m4103a(xMPushService, m4095a, m4095a.f33671f);
        } else if (EnumC10766a.SendMessage == m4095a.m3751a() && C10688p.m4130a(xMPushService).m4127c(m4095a.f33671f) && !C10603ac.m4414b(m4095a)) {
            String str2 = "";
            if (m3727m != null) {
                str2 = m3727m.m3298b();
            }
            AbstractC10404b.m5269a("Drop a message for push closed, msgid=" + str2);
            m4103a(xMPushService, m4095a, m4095a.f33671f);
        } else if (EnumC10766a.SendMessage == m4095a.m3751a() && !TextUtils.equals(xMPushService.getPackageName(), "com.xiaomi.xmsf") && !TextUtils.equals(xMPushService.getPackageName(), m4095a.f33671f)) {
            AbstractC10404b.m5269a("Receive a message with wrong package name, expect " + xMPushService.getPackageName() + ", received " + m4095a.f33671f);
            m4102a(xMPushService, m4095a, "unmatched_package", "package should be " + xMPushService.getPackageName() + ", but got " + m4095a.f33671f);
        } else {
            if (m3727m != null && m3727m.m3298b() != null) {
                AbstractC10404b.m5269a(String.format("receive a message, appid=%1$s, msgid= %2$s", m4095a.m3732h(), m3727m.m3298b()));
            }
            if (m3727m != null && (m3271s = m3727m.m3271s()) != null && m3271s.containsKey("hide") && "true".equalsIgnoreCase(m3271s.get("hide"))) {
                m4091c(xMPushService, m4095a);
                return;
            }
            if (m3727m != null && m3727m.m3271s() != null && m3727m.m3271s().containsKey("__miid")) {
                String str3 = m3727m.m3271s().get("__miid");
                Account m5304a = C10395f.m5304a(xMPushService);
                if ((m5304a == null) | (!TextUtils.equals(str3, m5304a.name))) {
                    AbstractC10404b.m5269a(new StringBuilder().append(str3).append(" should be login, but got ").append(m5304a).toString() == null ? "nothing" : m5304a.name);
                    m4102a(xMPushService, m4095a, "miid already logout or anther already login", new StringBuilder().append(str3).append(" should be login, but got ").append(m5304a).toString() == null ? "nothing" : m5304a.name);
                    return;
                }
            }
            boolean z = m3727m != null && m4096a(m3727m.m3271s());
            if (z) {
                if (!m4093b(xMPushService, m4095a)) {
                    return;
                }
                boolean m4100a = m4100a(xMPushService, m3727m, bArr);
                m4101a(xMPushService, m4095a, true, false, false);
                if (!m4100a) {
                    return;
                }
            }
            m4099a(xMPushService, m4421a, bArr, m4094a, z);
        }
    }

    /* renamed from: a */
    private static boolean m4111a(Context context, Intent intent) {
        try {
            List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 32);
            if (queryBroadcastReceivers != null) {
                if (!queryBroadcastReceivers.isEmpty()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return true;
        }
    }

    /* renamed from: a */
    private static boolean m4107a(Context context, String str) {
        Intent intent = new Intent("com.xiaomi.mipush.miui.CLICK_MESSAGE");
        intent.setPackage(str);
        Intent intent2 = new Intent("com.xiaomi.mipush.miui.RECEIVE_MESSAGE");
        intent2.setPackage(str);
        PackageManager packageManager = context.getPackageManager();
        try {
            List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 32);
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 32);
            if (queryBroadcastReceivers.isEmpty()) {
                if (queryIntentServices.isEmpty()) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            AbstractC10404b.m5267a(e);
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m4100a(XMPushService xMPushService, C10826r c10826r, byte[] bArr) {
        Map<String, String> m3271s = c10826r.m3271s();
        String[] split = m3271s.get("__geo_ids").split(Constants.ACCEPT_TIME_SEPARATOR_SP);
        ArrayList<ContentValues> arrayList = new ArrayList<>();
        for (String str : split) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("geo_id", str);
            contentValues.put("message_id", c10826r.m3298b());
            int parseInt = Integer.parseInt(m3271s.get("__geo_action"));
            contentValues.put(AuthActivity.ACTION_KEY, Integer.valueOf(parseInt));
            contentValues.put("content", bArr);
            contentValues.put("deadline", Long.valueOf(Long.parseLong(m3271s.get("__geo_deadline"))));
            if (TextUtils.equals(C10662e.m4274a(xMPushService).m4264c(str), "Enter") && parseInt == 1) {
                return true;
            }
            arrayList.add(contentValues);
        }
        if (!C10664g.m4257a(xMPushService).m4254a(arrayList)) {
            AbstractC10404b.m5265c("geofence added some new geofence message failed messagi_id:" + c10826r.m3298b());
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m4097a(C10769ab c10769ab) {
        return "com.xiaomi.xmsf".equals(c10769ab.f33671f) && c10769ab.m3727m() != null && c10769ab.m3727m().m3271s() != null && c10769ab.m3727m().m3271s().containsKey("miui_package_name");
    }

    /* renamed from: a */
    private static boolean m4096a(Map<String, String> map) {
        return map != null && map.containsKey("__geo_ids");
    }

    /* renamed from: b */
    private static boolean m4093b(XMPushService xMPushService, C10769ab c10769ab) {
        if (C10665h.m4251a(xMPushService) && C10665h.m4248b(xMPushService)) {
            if (!C10390b.m5319f(xMPushService, c10769ab.f33671f)) {
                m4104a(xMPushService, c10769ab);
                return false;
            }
            Map<String, String> m3271s = c10769ab.m3727m().m3271s();
            return m3271s != null && "12".contains(m3271s.get("__geo_action")) && !TextUtils.isEmpty(m3271s.get("__geo_ids"));
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m4092b(C10769ab c10769ab) {
        Map<String, String> m3271s = c10769ab.m3727m().m3271s();
        return m3271s != null && m3271s.containsKey("notify_effect");
    }

    /* renamed from: c */
    private static void m4091c(XMPushService xMPushService, C10769ab c10769ab) {
        xMPushService.m4494a(new C10698u(4, xMPushService, c10769ab));
    }

    /* renamed from: c */
    private static boolean m4090c(C10769ab c10769ab) {
        if (c10769ab.m3727m() == null || c10769ab.m3727m().m3271s() == null) {
            return false;
        }
        return "1".equals(c10769ab.m3727m().m3271s().get("obslete_ads_message"));
    }

    /* renamed from: d */
    private static void m4089d(XMPushService xMPushService, C10769ab c10769ab) {
        xMPushService.m4494a(new C10699v(4, xMPushService, c10769ab));
    }

    /* renamed from: e */
    private static void m4088e(XMPushService xMPushService, C10769ab c10769ab) {
        xMPushService.m4494a(new C10700w(4, xMPushService, c10769ab));
    }

    /* renamed from: a */
    public void m4110a(Context context, C10615ak.C10617b c10617b, boolean z, int i, String str) {
        C10685n m4137a;
        if (z || (m4137a = C10686o.m4137a(context)) == null || !"token-expired".equals(str)) {
            return;
        }
        try {
            C10686o.m4135a(context, m4137a.f33209d, m4137a.f33210e, m4137a.f33211f);
        } catch (IOException e) {
            AbstractC10404b.m5267a(e);
        } catch (JSONException e2) {
            AbstractC10404b.m5267a(e2);
        }
    }

    /* renamed from: a */
    public void m4106a(XMPushService xMPushService, C10710b c10710b, C10615ak.C10617b c10617b) {
        try {
            m4098a(xMPushService, c10710b.m4019d(c10617b.f33004i), c10710b.m4011l());
        } catch (IllegalArgumentException e) {
            AbstractC10404b.m5267a(e);
        }
    }

    /* renamed from: a */
    public void m4105a(XMPushService xMPushService, AbstractC10735d abstractC10735d, C10615ak.C10617b c10617b) {
        if (!(abstractC10735d instanceof C10734c)) {
            AbstractC10404b.m5269a("not a mipush message");
            return;
        }
        C10734c c10734c = (C10734c) abstractC10735d;
        C10731a p = c10734c.p("s");
        if (p == null) {
            return;
        }
        try {
            m4098a(xMPushService, C10627aq.m4344b(C10627aq.m4350a(c10617b.f33004i, c10734c.k()), p.m3917c()), C10752g.m3824a(abstractC10735d.mo3862c()));
        } catch (IllegalArgumentException e) {
            AbstractC10404b.m5267a(e);
        }
    }
}
