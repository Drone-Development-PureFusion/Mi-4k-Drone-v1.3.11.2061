package com.xiaomi.mipush.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.common.util.UriUtil;
import com.fimi.soul.utils.p219a.C3070c;
import com.google.android.gms.drive.AbstractC4808e;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.channel.commonutils.string.C10433d;
import com.xiaomi.mipush.sdk.PushMessageHandler;
import com.xiaomi.push.service.AbstractC10621am;
import com.xiaomi.push.service.C10603ac;
import com.xiaomi.push.service.C10612ah;
import com.xiaomi.push.service.C10613ai;
import com.xiaomi.xmpush.thrift.C10767aa;
import com.xiaomi.xmpush.thrift.C10769ab;
import com.xiaomi.xmpush.thrift.C10771ac;
import com.xiaomi.xmpush.thrift.C10773ad;
import com.xiaomi.xmpush.thrift.C10775ae;
import com.xiaomi.xmpush.thrift.C10779ag;
import com.xiaomi.xmpush.thrift.C10785aj;
import com.xiaomi.xmpush.thrift.C10789al;
import com.xiaomi.xmpush.thrift.C10793an;
import com.xiaomi.xmpush.thrift.C10797ap;
import com.xiaomi.xmpush.thrift.C10799aq;
import com.xiaomi.xmpush.thrift.C10824q;
import com.xiaomi.xmpush.thrift.C10826r;
import com.xiaomi.xmpush.thrift.C10835w;
import com.xiaomi.xmpush.thrift.C10837x;
import com.xiaomi.xmpush.thrift.EnumC10766a;
import com.xiaomi.xmpush.thrift.EnumC10821o;
import com.xiaomi.xmpush.thrift.EnumC10830t;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TimeZone;
import org.p286a.p321b.AbstractC11361a;
import org.p286a.p321b.C11392f;
/* renamed from: com.xiaomi.mipush.sdk.s */
/* loaded from: classes.dex */
public class C10492s {

    /* renamed from: c */
    private static Queue<String> f32592c;

    /* renamed from: b */
    private Context f32594b;

    /* renamed from: a */
    private static C10492s f32591a = null;

    /* renamed from: d */
    private static Object f32593d = new Object();

    private C10492s(Context context) {
        this.f32594b = context.getApplicationContext();
        if (this.f32594b == null) {
            this.f32594b = context;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Intent m4953a(Context context, String str, Map<String, String> map) {
        Intent intent;
        String str2;
        Intent intent2;
        URISyntaxException e;
        if (map == null || !map.containsKey("notify_effect")) {
            return null;
        }
        String str3 = map.get("notify_effect");
        if (AbstractC10621am.f33026a.equals(str3)) {
            try {
                intent = context.getPackageManager().getLaunchIntentForPackage(str);
            } catch (Exception e2) {
                AbstractC10404b.m5264d("Cause: " + e2.getMessage());
                intent = null;
            }
        } else {
            if (AbstractC10621am.f33027b.equals(str3)) {
                if (map.containsKey("intent_uri")) {
                    String str4 = map.get("intent_uri");
                    if (str4 != null) {
                        try {
                            intent = Intent.parseUri(str4, 1);
                        } catch (URISyntaxException e3) {
                            e = e3;
                            intent = null;
                        }
                        try {
                            intent.setPackage(str);
                        } catch (URISyntaxException e4) {
                            e = e4;
                            AbstractC10404b.m5264d("Cause: " + e.getMessage());
                            if (intent == null) {
                            }
                        }
                    } else {
                        intent = null;
                    }
                } else if (map.containsKey("class_name")) {
                    Intent intent3 = new Intent();
                    intent3.setComponent(new ComponentName(str, map.get("class_name")));
                    try {
                        if (map.containsKey("intent_flag")) {
                            intent3.setFlags(Integer.parseInt(map.get("intent_flag")));
                        }
                    } catch (NumberFormatException e5) {
                        AbstractC10404b.m5264d("Cause by intent_flag: " + e5.getMessage());
                    }
                    intent = intent3;
                }
            } else if (AbstractC10621am.f33028c.equals(str3) && (str2 = map.get("web_uri")) != null) {
                String trim = str2.trim();
                String str5 = (trim.startsWith("http://") || trim.startsWith("https://")) ? trim : "http://" + trim;
                try {
                    String protocol = new URL(str5).getProtocol();
                    if (UriUtil.HTTP_SCHEME.equals(protocol) || UriUtil.HTTPS_SCHEME.equals(protocol)) {
                        intent = new Intent("android.intent.action.VIEW");
                        try {
                            intent.setData(Uri.parse(str5));
                        } catch (MalformedURLException e6) {
                            intent2 = intent;
                            e = e6;
                            AbstractC10404b.m5264d("Cause: " + e.getMessage());
                            intent = intent2;
                            if (intent == null) {
                            }
                        }
                    } else {
                        intent = null;
                    }
                } catch (MalformedURLException e7) {
                    e = e7;
                    intent2 = null;
                }
            }
            intent = null;
        }
        if (intent == null) {
            return null;
        }
        intent.addFlags(AbstractC4808e.f17570a_);
        try {
            if (context.getPackageManager().resolveActivity(intent, 65536) == null) {
                return null;
            }
            return intent;
        } catch (Exception e8) {
            AbstractC10404b.m5264d("Cause: " + e8.getMessage());
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:286:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x06cc  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private PushMessageHandler.AbstractC10468a m4950a(C10769ab c10769ab, boolean z, byte[] bArr) {
        int i;
        List<String> list;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        MiPushCommandMessage miPushCommandMessage = null;
        try {
            AbstractC11361a m4963a = C10490q.m4963a(this.f32594b, c10769ab);
            if (m4963a != null) {
                AbstractC10404b.m5265c("receive a message." + m4963a);
                EnumC10766a m3751a = c10769ab.m3751a();
                AbstractC10404b.m5269a("processing a message, action=" + m3751a);
                switch (C10493t.f32595a[m3751a.ordinal()]) {
                    case 1:
                        if (C10469a.m5034a(this.f32594b).m5017l() && !z) {
                            AbstractC10404b.m5269a("receive a message in pause state. drop it");
                            break;
                        } else {
                            C10785aj c10785aj = (C10785aj) m4963a;
                            C10824q m3580l = c10785aj.m3580l();
                            if (m3580l != null) {
                                if (z) {
                                    if (C10603ac.m4414b(c10769ab)) {
                                        MiPushClient.reportIgnoreRegMessageClicked(this.f32594b, m3580l.m3320b(), c10769ab.m3727m(), c10769ab.f33671f, m3580l.m3316d());
                                    } else {
                                        MiPushClient.reportMessageClicked(this.f32594b, m3580l.m3320b(), c10769ab.m3727m(), m3580l.m3316d());
                                    }
                                }
                                if (!z) {
                                    if (!TextUtils.isEmpty(c10785aj.m3582j()) && MiPushClient.aliasSetTime(this.f32594b, c10785aj.m3582j()) < 0) {
                                        MiPushClient.addAlias(this.f32594b, c10785aj.m3582j());
                                    } else if (!TextUtils.isEmpty(c10785aj.m3584h()) && MiPushClient.topicSubscribedTime(this.f32594b, c10785aj.m3584h()) < 0) {
                                        MiPushClient.addTopic(this.f32594b, c10785aj.m3584h());
                                    }
                                }
                                String str = (c10769ab.f33673h == null || c10769ab.f33673h.m3271s() == null) ? null : c10769ab.f33673h.f34502j.get("jobkey");
                                String m3320b = TextUtils.isEmpty(str) ? m3580l.m3320b() : str;
                                if (z || !m4954a(this.f32594b, m3320b)) {
                                    MiPushMessage generateMessage = PushMessageHelper.generateMessage(c10785aj, c10769ab.m3727m(), z);
                                    if (generateMessage.getPassThrough() == 0 && !z && C10603ac.m4418a(generateMessage.getExtra())) {
                                        C10603ac.m4429a(this.f32594b, c10769ab, bArr);
                                        break;
                                    } else {
                                        AbstractC10404b.m5269a("receive a message, msgid=" + m3580l.m3320b() + ", jobkey=" + m3320b);
                                        if (z && generateMessage.getExtra() != null && generateMessage.getExtra().containsKey("notify_effect")) {
                                            Map<String, String> extra = generateMessage.getExtra();
                                            String str2 = extra.get("notify_effect");
                                            if (!C10603ac.m4414b(c10769ab)) {
                                                Intent m4953a = m4953a(this.f32594b, this.f32594b.getPackageName(), extra);
                                                if (m4953a != null) {
                                                    if (!str2.equals(AbstractC10621am.f33028c)) {
                                                        m4953a.putExtra(PushMessageHelper.KEY_MESSAGE, generateMessage);
                                                    }
                                                    this.f32594b.startActivity(m4953a);
                                                    break;
                                                }
                                            } else {
                                                Intent m4953a2 = m4953a(this.f32594b, c10769ab.f33671f, extra);
                                                if (m4953a2 != null) {
                                                    String m3314f = m3580l.m3314f();
                                                    if (!TextUtils.isEmpty(m3314f)) {
                                                        m4953a2.putExtra(C3070c.C3071a.f11500d, m3314f);
                                                    }
                                                    this.f32594b.startActivity(m4953a2);
                                                    break;
                                                } else {
                                                    AbstractC10404b.m5269a("Getting Intent fail from ignore reg message. ");
                                                    break;
                                                }
                                            }
                                        } else {
                                            miPushCommandMessage = generateMessage;
                                        }
                                    }
                                } else {
                                    AbstractC10404b.m5269a("drop a duplicate message, key=" + m3320b);
                                }
                                if (c10769ab.m3727m() == null && !z) {
                                    m4948a(c10785aj, c10769ab);
                                    break;
                                }
                            } else {
                                AbstractC10404b.m5264d("receive an empty message without push content, drop it");
                                break;
                            }
                        }
                        break;
                    case 2:
                        C10779ag c10779ag = (C10779ag) m4963a;
                        if (c10779ag.f33845f == 0) {
                            C10469a.m5034a(this.f32594b).m5027b(c10779ag.f33847h, c10779ag.f33848i);
                        }
                        if (!TextUtils.isEmpty(c10779ag.f33847h)) {
                            arrayList3 = new ArrayList();
                            arrayList3.add(c10779ag.f33847h);
                        } else {
                            arrayList3 = null;
                        }
                        miPushCommandMessage = PushMessageHelper.generateCommandMessage(MiPushClient.COMMAND_REGISTER, arrayList3, c10779ag.f33845f, c10779ag.f33846g, null);
                        C10494u.m4943a(this.f32594b).m4921e();
                        break;
                    case 3:
                        if (((C10793an) m4963a).f34078f == 0) {
                            C10469a.m5034a(this.f32594b).m5021h();
                            MiPushClient.clearExtras(this.f32594b);
                        }
                        PushMessageHandler.m5046a();
                        break;
                    case 4:
                        C10789al c10789al = (C10789al) m4963a;
                        if (c10789al.f34007f == 0) {
                            MiPushClient.addTopic(this.f32594b, c10789al.m3544h());
                        }
                        if (!TextUtils.isEmpty(c10789al.m3544h())) {
                            arrayList2 = new ArrayList();
                            arrayList2.add(c10789al.m3544h());
                        } else {
                            arrayList2 = null;
                        }
                        miPushCommandMessage = PushMessageHelper.generateCommandMessage(MiPushClient.COMMAND_SUBSCRIBE_TOPIC, arrayList2, c10789al.f34007f, c10789al.f34008g, c10789al.m3541k());
                        break;
                    case 5:
                        C10797ap c10797ap = (C10797ap) m4963a;
                        if (c10797ap.f34138f == 0) {
                            MiPushClient.removeTopic(this.f32594b, c10797ap.m3479h());
                        }
                        if (!TextUtils.isEmpty(c10797ap.m3479h())) {
                            arrayList = new ArrayList();
                            arrayList.add(c10797ap.m3479h());
                        } else {
                            arrayList = null;
                        }
                        miPushCommandMessage = PushMessageHelper.generateCommandMessage(MiPushClient.COMMAND_UNSUBSCRIBE_TOPIC, arrayList, c10797ap.f34138f, c10797ap.f34139g, c10797ap.m3476k());
                        break;
                    case 6:
                        C10767aa c10767aa = (C10767aa) m4963a;
                        String m3763e = c10767aa.m3763e();
                        List<String> m3757k = c10767aa.m3757k();
                        if (c10767aa.f33635g == 0) {
                            if (TextUtils.equals(m3763e, MiPushClient.COMMAND_SET_ACCEPT_TIME) && m3757k != null && m3757k.size() > 1) {
                                MiPushClient.addAcceptTime(this.f32594b, m3757k.get(0), m3757k.get(1));
                                if (!"00:00".equals(m3757k.get(0)) || !"00:00".equals(m3757k.get(1))) {
                                    C10469a.m5034a(this.f32594b).m5029a(false);
                                } else {
                                    C10469a.m5034a(this.f32594b).m5029a(true);
                                }
                                list = m4947a(TimeZone.getTimeZone("GMT+08"), TimeZone.getDefault(), m3757k);
                            } else if (TextUtils.equals(m3763e, MiPushClient.COMMAND_SET_ALIAS) && m3757k != null && m3757k.size() > 0) {
                                MiPushClient.addAlias(this.f32594b, m3757k.get(0));
                                list = m3757k;
                            } else if (TextUtils.equals(m3763e, MiPushClient.COMMAND_UNSET_ALIAS) && m3757k != null && m3757k.size() > 0) {
                                MiPushClient.removeAlias(this.f32594b, m3757k.get(0));
                                list = m3757k;
                            } else if (TextUtils.equals(m3763e, MiPushClient.COMMAND_SET_ACCOUNT) && m3757k != null && m3757k.size() > 0) {
                                MiPushClient.addAccount(this.f32594b, m3757k.get(0));
                                list = m3757k;
                            } else if (TextUtils.equals(m3763e, MiPushClient.COMMAND_UNSET_ACCOUNT) && m3757k != null && m3757k.size() > 0) {
                                MiPushClient.removeAccount(this.f32594b, m3757k.get(0));
                            }
                            miPushCommandMessage = PushMessageHelper.generateCommandMessage(m3763e, list, c10767aa.f33635g, c10767aa.f33636h, c10767aa.m3755m());
                            break;
                        }
                        list = m3757k;
                        miPushCommandMessage = PushMessageHelper.generateCommandMessage(m3763e, list, c10767aa.f33635g, c10767aa.f33636h, c10767aa.m3755m());
                        break;
                    case 7:
                        if (m4963a instanceof C10837x) {
                            C10837x c10837x = (C10837x) m4963a;
                            String m3192c = c10837x.m3192c();
                            if (!EnumC10821o.DisablePushMessage.f34418N.equalsIgnoreCase(c10837x.f34657e)) {
                                if (EnumC10821o.EnablePushMessage.f34418N.equalsIgnoreCase(c10837x.f34657e)) {
                                    if (c10837x.f34659g != 0) {
                                        if (!"enable_syncing".equals(C10489p.m4970a(this.f32594b).m4971a())) {
                                            C10489p.m4970a(this.f32594b).m4966d(m3192c);
                                            break;
                                        } else {
                                            synchronized (C10489p.class) {
                                                if (C10489p.m4970a(this.f32594b).m4965e(m3192c)) {
                                                    if (C10489p.m4970a(this.f32594b).m4967c(m3192c) < 10) {
                                                        C10489p.m4970a(this.f32594b).m4968b(m3192c);
                                                        C10494u.m4943a(this.f32594b).m4927a(false, m3192c);
                                                    } else {
                                                        C10489p.m4970a(this.f32594b).m4966d(m3192c);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                    } else {
                                        synchronized (C10489p.class) {
                                            if (C10489p.m4970a(this.f32594b).m4965e(m3192c)) {
                                                C10489p.m4970a(this.f32594b).m4966d(m3192c);
                                                if ("enable_syncing".equals(C10489p.m4970a(this.f32594b).m4971a())) {
                                                    C10489p.m4970a(this.f32594b).m4964f("enable_synced");
                                                    C10489p.m4970a(this.f32594b).m4966d(m3192c);
                                                }
                                            }
                                        }
                                        break;
                                    }
                                }
                            } else if (c10837x.f34659g != 0) {
                                if (!"disable_syncing".equals(C10489p.m4970a(this.f32594b).m4971a())) {
                                    C10489p.m4970a(this.f32594b).m4966d(m3192c);
                                    break;
                                } else {
                                    synchronized (C10489p.class) {
                                        if (C10489p.m4970a(this.f32594b).m4965e(m3192c)) {
                                            if (C10489p.m4970a(this.f32594b).m4967c(m3192c) < 10) {
                                                C10489p.m4970a(this.f32594b).m4968b(m3192c);
                                                C10494u.m4943a(this.f32594b).m4927a(true, m3192c);
                                            } else {
                                                C10489p.m4970a(this.f32594b).m4966d(m3192c);
                                            }
                                        }
                                    }
                                    break;
                                }
                            } else {
                                synchronized (C10489p.class) {
                                    if (C10489p.m4970a(this.f32594b).m4965e(m3192c)) {
                                        C10489p.m4970a(this.f32594b).m4966d(m3192c);
                                        if ("disable_syncing".equals(C10489p.m4970a(this.f32594b).m4971a())) {
                                            C10489p.m4970a(this.f32594b).m4964f("disable_synced");
                                            MiPushClient.clearNotification(this.f32594b);
                                            MiPushClient.clearLocalNotificationType(this.f32594b);
                                            PushMessageHandler.m5046a();
                                            C10494u.m4943a(this.f32594b).m4926b();
                                        }
                                    }
                                }
                                break;
                            }
                        } else if (m4963a instanceof C10775ae) {
                            C10775ae c10775ae = (C10775ae) m4963a;
                            if ("registration id expired".equalsIgnoreCase(c10775ae.f33729e)) {
                                MiPushClient.reInitialize(this.f32594b, EnumC10830t.RegIdExpired);
                                break;
                            } else if ("client_info_update_ok".equalsIgnoreCase(c10775ae.f33729e)) {
                                if (c10775ae.m3688i() != null && c10775ae.m3688i().containsKey(Constants.EXTRA_KEY_APP_VERSION)) {
                                    C10469a.m5034a(this.f32594b).m5032a(c10775ae.m3688i().get(Constants.EXTRA_KEY_APP_VERSION));
                                    break;
                                }
                            } else if ("awake_app".equalsIgnoreCase(c10775ae.f33729e)) {
                                if (c10775ae.m3688i() != null && c10775ae.m3688i().containsKey("packages")) {
                                    MiPushClient.awakeApps(this.f32594b, c10775ae.m3688i().get("packages").split(Constants.ACCEPT_TIME_SEPARATOR_SP));
                                    break;
                                }
                            } else if (EnumC10821o.NormalClientConfigUpdate.f34418N.equalsIgnoreCase(c10775ae.f33729e)) {
                                C10773ad c10773ad = new C10773ad();
                                try {
                                    C10799aq.m3470a(c10773ad, c10775ae.m3684m());
                                    C10613ai.m4388a(C10612ah.m4394a(this.f32594b), c10773ad);
                                    break;
                                } catch (C11392f e) {
                                    AbstractC10404b.m5267a(e);
                                    break;
                                }
                            } else if (EnumC10821o.CustomClientConfigUpdate.f34418N.equalsIgnoreCase(c10775ae.f33729e)) {
                                C10771ac c10771ac = new C10771ac();
                                try {
                                    C10799aq.m3470a(c10771ac, c10775ae.m3684m());
                                    C10613ai.m4389a(C10612ah.m4394a(this.f32594b), c10771ac);
                                    break;
                                } catch (C11392f e2) {
                                    AbstractC10404b.m5267a(e2);
                                    break;
                                }
                            } else if (EnumC10821o.SyncInfoResult.f34418N.equalsIgnoreCase(c10775ae.f33729e)) {
                                C10498x.m4911a(this.f32594b, c10775ae);
                                break;
                            } else if (EnumC10821o.ForceSync.f34418N.equalsIgnoreCase(c10775ae.f33729e)) {
                                AbstractC10404b.m5269a("receive force sync notification");
                                C10498x.m4910a(this.f32594b, false);
                                break;
                            } else if (EnumC10821o.GeoRegsiter.f34418N.equalsIgnoreCase(c10775ae.f33729e)) {
                                C10477f.m4992a(this.f32594b).m4991a(c10775ae);
                                break;
                            } else if (EnumC10821o.GeoUnregsiter.f34418N.equalsIgnoreCase(c10775ae.f33729e)) {
                                C10477f.m4992a(this.f32594b).m4988b(c10775ae);
                                break;
                            } else if (EnumC10821o.GeoSync.f34418N.equalsIgnoreCase(c10775ae.f33729e)) {
                                C10477f.m4992a(this.f32594b).m4987c(c10775ae);
                                break;
                            } else if (EnumC10821o.CancelPushMessage.f34418N.equals(c10775ae.f33729e) && c10775ae.m3688i() != null) {
                                if (c10775ae.m3688i().containsKey(AbstractC10621am.f33025H)) {
                                    String str3 = c10775ae.m3688i().get(AbstractC10621am.f33025H);
                                    if (!TextUtils.isEmpty(str3)) {
                                        try {
                                            i = Integer.parseInt(str3);
                                        } catch (NumberFormatException e3) {
                                            e3.printStackTrace();
                                            i = -2;
                                        }
                                        if (i >= -1) {
                                            String str4 = "";
                                            if (c10775ae.m3688i().containsKey(AbstractC10621am.f33023F)) {
                                                str4 = c10775ae.m3688i().get(AbstractC10621am.f33023F);
                                            }
                                            MiPushClient.clearNotification(this.f32594b, str4, c10775ae.m3688i().containsKey(AbstractC10621am.f33024G) ? c10775ae.m3688i().get(AbstractC10621am.f33024G) : "");
                                            break;
                                        } else {
                                            MiPushClient.clearNotification(this.f32594b, i);
                                            break;
                                        }
                                    }
                                }
                                i = -2;
                                if (i >= -1) {
                                }
                            }
                        }
                        break;
                }
            } else {
                AbstractC10404b.m5264d("receiving an un-recognized message. " + c10769ab.f33666a);
            }
        } catch (C10474c e4) {
            AbstractC10404b.m5267a(e4);
            m4951a(c10769ab);
        } catch (C11392f e5) {
            AbstractC10404b.m5267a(e5);
            AbstractC10404b.m5264d("receive a message which action string is not valid. is the reg expired?");
        }
        return miPushCommandMessage;
    }

    /* renamed from: a */
    private PushMessageHandler.AbstractC10468a m4949a(C10769ab c10769ab, byte[] bArr) {
        MiPushMessage miPushMessage = null;
        miPushMessage = null;
        miPushMessage = null;
        r1 = null;
        String str = null;
        miPushMessage = null;
        miPushMessage = null;
        try {
            AbstractC11361a m4963a = C10490q.m4963a(this.f32594b, c10769ab);
            if (m4963a != null) {
                AbstractC10404b.m5265c("message arrived: receive a message." + m4963a);
                EnumC10766a m3751a = c10769ab.m3751a();
                AbstractC10404b.m5269a("message arrived: processing an arrived message, action=" + m3751a);
                switch (C10493t.f32595a[m3751a.ordinal()]) {
                    case 1:
                        C10785aj c10785aj = (C10785aj) m4963a;
                        C10824q m3580l = c10785aj.m3580l();
                        if (m3580l != null) {
                            if (c10769ab.f33673h != null && c10769ab.f33673h.m3271s() != null) {
                                str = c10769ab.f33673h.f34502j.get("jobkey");
                            }
                            MiPushMessage generateMessage = PushMessageHelper.generateMessage(c10785aj, c10769ab.m3727m(), false);
                            generateMessage.setArrivedMessage(true);
                            AbstractC10404b.m5269a("message arrived: receive a message, msgid=" + m3580l.m3320b() + ", jobkey=" + str);
                            miPushMessage = generateMessage;
                            break;
                        } else {
                            AbstractC10404b.m5264d("message arrived: receive an empty message without push content, drop it");
                            break;
                        }
                        break;
                }
            } else {
                AbstractC10404b.m5264d("message arrived: receiving an un-recognized message. " + c10769ab.f33666a);
            }
        } catch (C10474c e) {
            AbstractC10404b.m5267a(e);
            AbstractC10404b.m5264d("message arrived: receive a message but decrypt failed. report when click.");
        } catch (C11392f e2) {
            AbstractC10404b.m5267a(e2);
            AbstractC10404b.m5264d("message arrived: receive a message which action string is not valid. is the reg expired?");
        }
        return miPushMessage;
    }

    /* renamed from: a */
    public static C10492s m4955a(Context context) {
        if (f32591a == null) {
            f32591a = new C10492s(context);
        }
        return f32591a;
    }

    /* renamed from: a */
    private void m4956a() {
        SharedPreferences sharedPreferences = this.f32594b.getSharedPreferences(MiPushClient.PREF_EXTRA, 0);
        long currentTimeMillis = System.currentTimeMillis();
        if (Math.abs(currentTimeMillis - sharedPreferences.getLong(Constants.SP_KEY_LAST_REINITIALIZE, 0L)) > 1800000) {
            MiPushClient.reInitialize(this.f32594b, EnumC10830t.PackageUnregistered);
            sharedPreferences.edit().putLong(Constants.SP_KEY_LAST_REINITIALIZE, currentTimeMillis).commit();
        }
    }

    /* renamed from: a */
    private void m4951a(C10769ab c10769ab) {
        AbstractC10404b.m5269a("receive a message but decrypt failed. report now.");
        C10775ae c10775ae = new C10775ae(c10769ab.m3727m().f34493a, false);
        c10775ae.m3695c(EnumC10821o.DecryptMessageFail.f34418N);
        c10775ae.m3698b(c10769ab.m3732h());
        c10775ae.m3693d(c10769ab.f33671f);
        c10775ae.f33732h = new HashMap();
        c10775ae.f33732h.put("regid", MiPushClient.getRegId(this.f32594b));
        C10494u.m4943a(this.f32594b).m4932a(c10775ae, EnumC10766a.Notification, false, null);
    }

    /* renamed from: a */
    private void m4948a(C10785aj c10785aj, C10769ab c10769ab) {
        C10826r m3727m = c10769ab.m3727m();
        C10835w c10835w = new C10835w();
        c10835w.m3225b(c10785aj.m3587e());
        c10835w.m3230a(c10785aj.m3589c());
        c10835w.m3232a(c10785aj.m3580l().m3312h());
        if (!TextUtils.isEmpty(c10785aj.m3584h())) {
            c10835w.m3221c(c10785aj.m3584h());
        }
        if (!TextUtils.isEmpty(c10785aj.m3582j())) {
            c10835w.m3218d(c10785aj.m3582j());
        }
        c10835w.m3229a(C10799aq.m3472a(this.f32594b, c10769ab));
        C10494u.m4943a(this.f32594b).m4934a((C10494u) c10835w, EnumC10766a.AckMessage, m3727m);
    }

    /* renamed from: a */
    private static boolean m4954a(Context context, String str) {
        boolean z = false;
        synchronized (f32593d) {
            SharedPreferences m5019j = C10469a.m5034a(context).m5019j();
            if (f32592c == null) {
                String[] split = m5019j.getString("pref_msg_ids", "").split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                f32592c = new LinkedList();
                for (String str2 : split) {
                    f32592c.add(str2);
                }
            }
            if (f32592c.contains(str)) {
                z = true;
            } else {
                f32592c.add(str);
                if (f32592c.size() > 25) {
                    f32592c.poll();
                }
                String m5175a = C10433d.m5175a(f32592c, Constants.ACCEPT_TIME_SEPARATOR_SP);
                SharedPreferences.Editor edit = m5019j.edit();
                edit.putString("pref_msg_ids", m5175a);
                edit.commit();
            }
        }
        return z;
    }

    /* renamed from: b */
    private void m4946b(C10769ab c10769ab) {
        C10826r m3727m = c10769ab.m3727m();
        C10835w c10835w = new C10835w();
        c10835w.m3225b(c10769ab.m3732h());
        c10835w.m3230a(m3727m.m3298b());
        c10835w.m3232a(m3727m.m3289d());
        if (!TextUtils.isEmpty(m3727m.m3284f())) {
            c10835w.m3221c(m3727m.m3284f());
        }
        c10835w.m3229a(C10799aq.m3472a(this.f32594b, c10769ab));
        C10494u.m4943a(this.f32594b).m4932a(c10835w, EnumC10766a.AckMessage, false, c10769ab.m3727m());
    }

    /* renamed from: a */
    public PushMessageHandler.AbstractC10468a m4952a(Intent intent) {
        String action = intent.getAction();
        AbstractC10404b.m5269a("receive an intent from server, action=" + action);
        String stringExtra = intent.getStringExtra("mrt");
        if (stringExtra == null) {
            stringExtra = Long.toString(System.currentTimeMillis());
        }
        if ("com.xiaomi.mipush.RECEIVE_MESSAGE".equals(action)) {
            byte[] byteArrayExtra = intent.getByteArrayExtra("mipush_payload");
            boolean booleanExtra = intent.getBooleanExtra("mipush_notified", false);
            if (byteArrayExtra == null) {
                AbstractC10404b.m5264d("receiving an empty message, drop");
                return null;
            }
            C10769ab c10769ab = new C10769ab();
            try {
                C10799aq.m3470a(c10769ab, byteArrayExtra);
                C10469a m5034a = C10469a.m5034a(this.f32594b);
                C10826r m3727m = c10769ab.m3727m();
                if (c10769ab.m3751a() == EnumC10766a.SendMessage && m3727m != null && !m5034a.m5017l() && !booleanExtra) {
                    if (m3727m != null) {
                        c10769ab.m3727m().m3301a("mrt", stringExtra);
                        c10769ab.m3727m().m3301a("mat", Long.toString(System.currentTimeMillis()));
                    }
                    m4946b(c10769ab);
                }
                if (c10769ab.m3751a() == EnumC10766a.SendMessage && !c10769ab.m3739c()) {
                    if (!C10603ac.m4414b(c10769ab)) {
                        Object[] objArr = new Object[2];
                        objArr[0] = c10769ab.m3730j();
                        objArr[1] = m3727m != null ? m3727m.m3298b() : "";
                        AbstractC10404b.m5269a(String.format("drop an un-encrypted messages. %1$s, %2$s", objArr));
                        return null;
                    } else if (!booleanExtra || m3727m.m3271s() == null || !m3727m.m3271s().containsKey("notify_effect")) {
                        AbstractC10404b.m5269a(String.format("drop an un-encrypted messages. %1$s, %2$s", c10769ab.m3730j(), m3727m.m3298b()));
                        return null;
                    }
                }
                if (m5034a.m5020i() || c10769ab.f33666a == EnumC10766a.Registration) {
                    if (!m5034a.m5020i() || !m5034a.m5015n()) {
                        return m4950a(c10769ab, booleanExtra, byteArrayExtra);
                    }
                    if (c10769ab.f33666a == EnumC10766a.UnRegistration) {
                        m5034a.m5021h();
                        MiPushClient.clearExtras(this.f32594b);
                        PushMessageHandler.m5046a();
                    } else {
                        MiPushClient.unregisterPush(this.f32594b);
                    }
                } else if (C10603ac.m4414b(c10769ab)) {
                    return m4950a(c10769ab, booleanExtra, byteArrayExtra);
                } else {
                    AbstractC10404b.m5264d("receive message without registration. need re-register!");
                    m4956a();
                }
            } catch (C11392f e) {
                AbstractC10404b.m5267a(e);
            } catch (Exception e2) {
                AbstractC10404b.m5267a(e2);
            }
        } else if ("com.xiaomi.mipush.ERROR".equals(action)) {
            MiPushCommandMessage miPushCommandMessage = new MiPushCommandMessage();
            C10769ab c10769ab2 = new C10769ab();
            try {
                byte[] byteArrayExtra2 = intent.getByteArrayExtra("mipush_payload");
                if (byteArrayExtra2 != null) {
                    C10799aq.m3470a(c10769ab2, byteArrayExtra2);
                }
            } catch (C11392f e3) {
            }
            miPushCommandMessage.setCommand(String.valueOf(c10769ab2.m3751a()));
            miPushCommandMessage.setResultCode(intent.getIntExtra("mipush_error_code", 0));
            miPushCommandMessage.setReason(intent.getStringExtra("mipush_error_msg"));
            AbstractC10404b.m5264d("receive a error message. code = " + intent.getIntExtra("mipush_error_code", 0) + ", msg= " + intent.getStringExtra("mipush_error_msg"));
            return miPushCommandMessage;
        } else if ("com.xiaomi.mipush.MESSAGE_ARRIVED".equals(action)) {
            byte[] byteArrayExtra3 = intent.getByteArrayExtra("mipush_payload");
            if (byteArrayExtra3 == null) {
                AbstractC10404b.m5264d("message arrived: receiving an empty message, drop");
                return null;
            }
            C10769ab c10769ab3 = new C10769ab();
            try {
                C10799aq.m3470a(c10769ab3, byteArrayExtra3);
                C10469a m5034a2 = C10469a.m5034a(this.f32594b);
                if (C10603ac.m4414b(c10769ab3)) {
                    AbstractC10404b.m5264d("message arrived: receive ignore reg message, ignore!");
                } else if (!m5034a2.m5020i()) {
                    AbstractC10404b.m5264d("message arrived: receive message without registration. need unregister or re-register!");
                } else if (!m5034a2.m5020i() || !m5034a2.m5015n()) {
                    return m4949a(c10769ab3, byteArrayExtra3);
                } else {
                    AbstractC10404b.m5264d("message arrived: app info is invalidated");
                }
            } catch (C11392f e4) {
                AbstractC10404b.m5267a(e4);
            } catch (Exception e5) {
                AbstractC10404b.m5267a(e5);
            }
        }
        return null;
    }

    /* renamed from: a */
    public List<String> m4947a(TimeZone timeZone, TimeZone timeZone2, List<String> list) {
        if (timeZone.equals(timeZone2)) {
            return list;
        }
        long rawOffset = ((timeZone.getRawOffset() - timeZone2.getRawOffset()) / 1000) / 60;
        long parseLong = ((((Long.parseLong(list.get(0).split(":")[0]) * 60) + Long.parseLong(list.get(0).split(":")[1])) - rawOffset) + 1440) % 1440;
        long parseLong2 = (((Long.parseLong(list.get(1).split(":")[1]) + (60 * Long.parseLong(list.get(1).split(":")[0]))) - rawOffset) + 1440) % 1440;
        ArrayList arrayList = new ArrayList();
        arrayList.add(String.format("%1$02d:%2$02d", Long.valueOf(parseLong / 60), Long.valueOf(parseLong % 60)));
        arrayList.add(String.format("%1$02d:%2$02d", Long.valueOf(parseLong2 / 60), Long.valueOf(parseLong2 % 60)));
        return arrayList;
    }
}
