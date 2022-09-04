package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import com.fimi.soul.media.player.IMediaPlayer;
import com.google.android.gms.nearby.messages.Strategy;
import com.tencent.p263mm.sdk.platformtools.Util;
import com.xiaomi.channel.commonutils.android.AbstractC10397h;
import com.xiaomi.channel.commonutils.android.C10390b;
import com.xiaomi.channel.commonutils.android.C10394e;
import com.xiaomi.channel.commonutils.android.C10396g;
import com.xiaomi.channel.commonutils.android.C10399j;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.channel.commonutils.misc.C10410f;
import com.xiaomi.channel.commonutils.string.C10433d;
import com.xiaomi.mistatistic.sdk.MiStatInterface;
import com.xiaomi.push.service.C10612ah;
import com.xiaomi.push.service.C10636aw;
import com.xiaomi.push.service.C10665h;
import com.xiaomi.push.service.C10673k;
import com.xiaomi.push.service.receivers.NetworkStatusReceiver;
import com.xiaomi.xmpush.thrift.C10775ae;
import com.xiaomi.xmpush.thrift.C10777af;
import com.xiaomi.xmpush.thrift.C10787ak;
import com.xiaomi.xmpush.thrift.C10791am;
import com.xiaomi.xmpush.thrift.C10795ao;
import com.xiaomi.xmpush.thrift.C10826r;
import com.xiaomi.xmpush.thrift.C10841z;
import com.xiaomi.xmpush.thrift.EnumC10766a;
import com.xiaomi.xmpush.thrift.EnumC10806e;
import com.xiaomi.xmpush.thrift.EnumC10830t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import p005b.p006a.p007a.p029b.C0494h;
/* loaded from: classes.dex */
public abstract class MiPushClient {
    public static final String COMMAND_REGISTER = "register";
    public static final String COMMAND_SET_ACCEPT_TIME = "accept-time";
    public static final String COMMAND_SET_ACCOUNT = "set-account";
    public static final String COMMAND_SET_ALIAS = "set-alias";
    public static final String COMMAND_SUBSCRIBE_TOPIC = "subscribe-topic";
    public static final String COMMAND_UNSET_ACCOUNT = "unset-account";
    public static final String COMMAND_UNSET_ALIAS = "unset-alias";
    public static final String COMMAND_UNSUBSCRIBE_TOPIC = "unsubscibe-topic";
    public static final String PREF_EXTRA = "mipush_extra";
    private static C10500z mSyncMIIDHelper;
    private static Context sContext;
    private static long sCurMsgId = System.currentTimeMillis();

    @Deprecated
    /* loaded from: classes.dex */
    public static abstract class MiPushClientCallback {
        private String category;

        /* JADX INFO: Access modifiers changed from: protected */
        public String getCategory() {
            return this.category;
        }

        public void onCommandResult(String str, long j, String str2, List<String> list) {
        }

        public void onInitializeResult(long j, String str, String str2) {
        }

        public void onReceiveMessage(MiPushMessage miPushMessage) {
        }

        public void onReceiveMessage(String str, String str2, String str3, boolean z) {
        }

        public void onSubscribeResult(long j, String str, String str2) {
        }

        public void onUnsubscribeResult(long j, String str, String str2) {
        }

        protected void setCategory(String str) {
            this.category = str;
        }
    }

    private static boolean acceptTimeSet(Context context, String str, String str2) {
        return TextUtils.equals(getAcceptTime(context), str + Constants.ACCEPT_TIME_SEPARATOR_SP + str2);
    }

    public static long accountSetTime(Context context, String str) {
        return context.getSharedPreferences(PREF_EXTRA, 0).getLong("account_" + str, -1L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void addAcceptTime(Context context, String str, String str2) {
        synchronized (MiPushClient.class) {
            context.getSharedPreferences(PREF_EXTRA, 0).edit().putString(Constants.EXTRA_KEY_ACCEPT_TIME, str + Constants.ACCEPT_TIME_SEPARATOR_SP + str2).commit();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void addAccount(Context context, String str) {
        synchronized (MiPushClient.class) {
            context.getSharedPreferences(PREF_EXTRA, 0).edit().putLong("account_" + str, System.currentTimeMillis()).commit();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void addAlias(Context context, String str) {
        synchronized (MiPushClient.class) {
            context.getSharedPreferences(PREF_EXTRA, 0).edit().putLong("alias_" + str, System.currentTimeMillis()).commit();
        }
    }

    private static void addPullNotificationTime(Context context) {
        context.getSharedPreferences(PREF_EXTRA, 0).edit().putLong("last_pull_notification", System.currentTimeMillis()).commit();
    }

    private static void addRegRequestTime(Context context) {
        context.getSharedPreferences(PREF_EXTRA, 0).edit().putLong("last_reg_request", System.currentTimeMillis()).commit();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void addTopic(Context context, String str) {
        synchronized (MiPushClient.class) {
            context.getSharedPreferences(PREF_EXTRA, 0).edit().putLong("topic_" + str, System.currentTimeMillis()).commit();
        }
    }

    public static long aliasSetTime(Context context, String str) {
        return context.getSharedPreferences(PREF_EXTRA, 0).getLong("alias_" + str, -1L);
    }

    public static void awakeApps(Context context, String[] strArr) {
        new Thread(new RunnableC10487n(strArr, context)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void awakePushServiceByPackageInfo(Context context, PackageInfo packageInfo) {
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                if (serviceInfo.exported && serviceInfo.enabled && "com.xiaomi.mipush.sdk.PushMessageHandler".equals(serviceInfo.name) && !context.getPackageName().equals(serviceInfo.packageName)) {
                    try {
                        Thread.sleep(((long) ((Math.random() * 2.0d) + 1.0d)) * 1000);
                        Intent intent = new Intent();
                        intent.setClassName(serviceInfo.packageName, serviceInfo.name);
                        intent.setAction("com.xiaomi.mipush.sdk.WAKEUP");
                        intent.putExtra("waker_pkgname", context.getPackageName());
                        context.startService(intent);
                        return;
                    } catch (Throwable th) {
                        return;
                    }
                }
            }
        }
    }

    private static void checkNotNull(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException("param " + str + " is not nullable");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void clearExtras(Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences(PREF_EXTRA, 0).edit();
        edit.clear();
        edit.commit();
    }

    public static void clearLocalNotificationType(Context context) {
        C10494u.m4943a(context).m4920f();
    }

    public static void clearNotification(Context context) {
        C10494u.m4943a(context).m4944a(-1);
    }

    public static void clearNotification(Context context, int i) {
        C10494u.m4943a(context).m4944a(i);
    }

    public static void clearNotification(Context context, String str, String str2) {
        C10494u.m4943a(context).m4936a(str, str2);
    }

    public static void disablePush(Context context) {
        C10494u.m4943a(context).m4928a(true);
    }

    public static void enablePush(Context context) {
        C10494u.m4943a(context).m4928a(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static synchronized String generatePacketID() {
        String str;
        synchronized (MiPushClient.class) {
            str = C10433d.m5177a(4) + sCurMsgId;
            sCurMsgId++;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String getAcceptTime(Context context) {
        return context.getSharedPreferences(PREF_EXTRA, 0).getString(Constants.EXTRA_KEY_ACCEPT_TIME, "00:00-23:59");
    }

    public static List<String> getAllAlias(Context context) {
        ArrayList arrayList = new ArrayList();
        for (String str : context.getSharedPreferences(PREF_EXTRA, 0).getAll().keySet()) {
            if (str.startsWith("alias_")) {
                arrayList.add(str.substring("alias_".length()));
            }
        }
        return arrayList;
    }

    public static List<String> getAllTopic(Context context) {
        ArrayList arrayList = new ArrayList();
        for (String str : context.getSharedPreferences(PREF_EXTRA, 0).getAll().keySet()) {
            if (str.startsWith("topic_") && !str.contains("**ALL**")) {
                arrayList.add(str.substring("topic_".length()));
            }
        }
        return arrayList;
    }

    public static List<String> getAllUserAccount(Context context) {
        ArrayList arrayList = new ArrayList();
        for (String str : context.getSharedPreferences(PREF_EXTRA, 0).getAll().keySet()) {
            if (str.startsWith("account_")) {
                arrayList.add(str.substring("account_".length()));
            }
        }
        return arrayList;
    }

    private static boolean getDefaultSwitch() {
        return C10396g.m5302b();
    }

    public static String getRegId(Context context) {
        if (C10469a.m5034a(context).m5020i()) {
            return C10469a.m5034a(context).m5024e();
        }
        return null;
    }

    @Deprecated
    public static void initialize(Context context, String str, String str2, MiPushClientCallback miPushClientCallback) {
        boolean z = false;
        checkNotNull(context, C0494h.f709ac);
        checkNotNull(str, "appID");
        checkNotNull(str2, "appToken");
        try {
            if (C10636aw.m4319a().m4308b()) {
                C10636aw.m4319a().m4316a(context);
            }
            C10636aw.m4319a().m4314a(new C10472ab(context), "UPLOADER_FROM_MIPUSHCLIENT");
            sContext = context.getApplicationContext();
            if (sContext == null) {
                sContext = context;
            }
            if (miPushClientCallback != null) {
                PushMessageHandler.m5040a(miPushClientCallback);
            }
            if (C10399j.m5292b(context)) {
                C10479h.m4982a(context);
            }
            if (C10469a.m5034a(sContext).m5016m() != Constants.m5049a()) {
                z = true;
            }
            if (!z && !shouldSendRegRequest(sContext)) {
                C10494u.m4943a(context).m4945a();
                AbstractC10404b.m5269a("Could not send  register message within 5s repeatly .");
                return;
            }
            if (z || !C10469a.m5034a(sContext).m5031a(str, str2) || C10469a.m5034a(sContext).m5015n()) {
                String m5177a = C10433d.m5177a(6);
                C10469a.m5034a(sContext).m5021h();
                C10469a.m5034a(sContext).m5035a(Constants.m5049a());
                C10469a.m5034a(sContext).m5030a(str, str2, m5177a);
                clearExtras(sContext);
                C10777af c10777af = new C10777af();
                c10777af.m3676a(generatePacketID());
                c10777af.m3671b(str);
                c10777af.m3661e(str2);
                c10777af.m3664d(context.getPackageName());
                c10777af.m3659f(m5177a);
                c10777af.m3667c(C10390b.m5327a(context, context.getPackageName()));
                c10777af.m3673b(C10390b.m5325b(context, context.getPackageName()));
                c10777af.m3657g("3_2_1");
                c10777af.m3679a(30201);
                c10777af.m3655h(C10394e.m5311b(sContext));
                c10777af.m3677a(EnumC10830t.Init);
                String m5309d = C10394e.m5309d(sContext);
                if (!TextUtils.isEmpty(m5309d)) {
                    if (C10396g.m5302b()) {
                        c10777af.m3653i(m5309d);
                    }
                    c10777af.m3649k(C10433d.m5176a(m5309d));
                }
                c10777af.m3651j(C10394e.m5314a());
                int m5312b = C10394e.m5312b();
                if (m5312b >= 0) {
                    c10777af.m3668c(m5312b);
                }
                C10494u.m4943a(sContext).m4938a(c10777af, z);
            } else {
                if (1 == PushMessageHelper.getPushMode(context)) {
                    checkNotNull(miPushClientCallback, "callback");
                    miPushClientCallback.onInitializeResult(0L, null, C10469a.m5034a(context).m5024e());
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(C10469a.m5034a(context).m5024e());
                    PushMessageHelper.sendCommandMessageBroadcast(sContext, PushMessageHelper.generateCommandMessage(COMMAND_REGISTER, arrayList, 0L, null, null));
                }
                C10494u.m4943a(context).m4945a();
                if (C10469a.m5034a(sContext).m5036a()) {
                    C10775ae c10775ae = new C10775ae();
                    c10775ae.m3698b(C10469a.m5034a(context).m5026c());
                    c10775ae.m3695c("client_info_update");
                    c10775ae.m3706a(generatePacketID());
                    c10775ae.f33732h = new HashMap();
                    c10775ae.f33732h.put(Constants.EXTRA_KEY_APP_VERSION, C10390b.m5327a(sContext, sContext.getPackageName()));
                    c10775ae.f33732h.put(Constants.EXTRA_KEY_APP_VERSION_CODE, Integer.toString(C10390b.m5325b(sContext, sContext.getPackageName())));
                    c10775ae.f33732h.put("push_sdk_vn", "3_2_1");
                    c10775ae.f33732h.put("push_sdk_vc", Integer.toString(30201));
                    String m5022g = C10469a.m5034a(sContext).m5022g();
                    if (!TextUtils.isEmpty(m5022g)) {
                        c10775ae.f33732h.put("deviceid", m5022g);
                    }
                    C10494u.m4943a(context).m4932a(c10775ae, EnumC10766a.Notification, false, null);
                }
                if (!AbstractC10397h.m5299a(sContext, "update_devId", false)) {
                    updateIMEI();
                    AbstractC10397h.m5297b(sContext, "update_devId", true);
                }
                if (shouldUseMIUIPush(sContext) && shouldPullNotification(sContext)) {
                    C10775ae c10775ae2 = new C10775ae();
                    c10775ae2.m3698b(C10469a.m5034a(sContext).m5026c());
                    c10775ae2.m3695c("pull");
                    c10775ae2.m3706a(generatePacketID());
                    c10775ae2.m3702a(false);
                    C10494u.m4943a(sContext).m4931a(c10775ae2, EnumC10766a.Notification, false, null, false);
                    addPullNotificationTime(sContext);
                }
            }
            addRegRequestTime(sContext);
            scheduleOcVersionCheckJob();
            scheduleGeoFenceRepeatJobs();
            loadPlugin();
            C10498x.m4912a(sContext);
            try {
                if (mSyncMIIDHelper == null) {
                    mSyncMIIDHelper = new C10500z(sContext);
                }
                mSyncMIIDHelper.m4905a(sContext);
            } catch (Exception e) {
                AbstractC10404b.m5264d(e.toString());
            }
            if ("disable_syncing".equals(C10489p.m4970a(sContext).m4971a())) {
                disablePush(sContext);
            }
            if (!"enable_syncing".equals(C10489p.m4970a(sContext).m4971a())) {
                return;
            }
            enablePush(sContext);
        } catch (Throwable th) {
            AbstractC10404b.m5267a(th);
        }
    }

    private static void loadPlugin() {
        if (C10612ah.m4394a(sContext).m4395a(EnumC10806e.DataCollectionSwitch.m3437a(), getDefaultSwitch())) {
            C10410f.m5253a(sContext).m5247a(new RunnableC10485l(), 10);
        }
    }

    public static void pausePush(Context context, String str) {
        setAcceptTime(context, 0, 0, 0, 0, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void reInitialize(Context context, EnumC10830t enumC10830t) {
        if (!C10469a.m5034a(context).m5020i()) {
            return;
        }
        String m5177a = C10433d.m5177a(6);
        String m5026c = C10469a.m5034a(context).m5026c();
        String m5025d = C10469a.m5034a(context).m5025d();
        C10469a.m5034a(context).m5021h();
        C10469a.m5034a(context).m5030a(m5026c, m5025d, m5177a);
        C10777af c10777af = new C10777af();
        c10777af.m3676a(generatePacketID());
        c10777af.m3671b(m5026c);
        c10777af.m3661e(m5025d);
        c10777af.m3659f(m5177a);
        c10777af.m3664d(context.getPackageName());
        c10777af.m3667c(C10390b.m5327a(context, context.getPackageName()));
        c10777af.m3677a(enumC10830t);
        C10494u.m4943a(context).m4938a(c10777af, false);
    }

    private static void registerNetworkReceiver(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        intentFilter.addCategory("android.intent.category.DEFAULT");
        context.registerReceiver(new NetworkStatusReceiver(null), intentFilter);
    }

    public static void registerPush(Context context, String str, String str2) {
        if (!NetworkStatusReceiver.m4114a()) {
            registerNetworkReceiver(context);
        }
        new Thread(new RunnableC10484k(context, str, str2)).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void removeAcceptTime(Context context) {
        synchronized (MiPushClient.class) {
            context.getSharedPreferences(PREF_EXTRA, 0).edit().remove(Constants.EXTRA_KEY_ACCEPT_TIME).commit();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void removeAccount(Context context, String str) {
        synchronized (MiPushClient.class) {
            context.getSharedPreferences(PREF_EXTRA, 0).edit().remove("account_" + str).commit();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void removeAlias(Context context, String str) {
        synchronized (MiPushClient.class) {
            context.getSharedPreferences(PREF_EXTRA, 0).edit().remove("alias_" + str).commit();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void removeAllAccounts(Context context) {
        synchronized (MiPushClient.class) {
            for (String str : getAllUserAccount(context)) {
                removeAccount(context, str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void removeAllAliases(Context context) {
        synchronized (MiPushClient.class) {
            for (String str : getAllAlias(context)) {
                removeAlias(context, str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void removeAllTopics(Context context) {
        synchronized (MiPushClient.class) {
            for (String str : getAllTopic(context)) {
                removeTopic(context, str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void removeTopic(Context context, String str) {
        synchronized (MiPushClient.class) {
            context.getSharedPreferences(PREF_EXTRA, 0).edit().remove("topic_" + str).commit();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void reportIgnoreRegMessageClicked(Context context, String str, C10826r c10826r, String str2, String str3) {
        C10775ae c10775ae = new C10775ae();
        if (TextUtils.isEmpty(str3)) {
            AbstractC10404b.m5264d("do not report clicked message");
            return;
        }
        c10775ae.m3698b(str3);
        c10775ae.m3695c("bar:click");
        c10775ae.m3706a(str);
        c10775ae.m3702a(false);
        C10494u.m4943a(context).m4929a(c10775ae, EnumC10766a.Notification, false, true, c10826r, true, str2, str3);
    }

    public static void reportMessageClicked(Context context, MiPushMessage miPushMessage) {
        C10826r c10826r = new C10826r();
        c10826r.m3302a(miPushMessage.getMessageId());
        c10826r.m3295b(miPushMessage.getTopic());
        c10826r.m3288d(miPushMessage.getDescription());
        c10826r.m3291c(miPushMessage.getTitle());
        c10826r.m3292c(miPushMessage.getNotifyId());
        c10826r.m3304a(miPushMessage.getNotifyType());
        c10826r.m3297b(miPushMessage.getPassThrough());
        c10826r.m3300a(miPushMessage.getExtra());
        reportMessageClicked(context, miPushMessage.getMessageId(), c10826r, null);
    }

    @Deprecated
    public static void reportMessageClicked(Context context, String str) {
        reportMessageClicked(context, str, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void reportMessageClicked(Context context, String str, C10826r c10826r, String str2) {
        C10775ae c10775ae = new C10775ae();
        if (!TextUtils.isEmpty(str2)) {
            c10775ae.m3698b(str2);
        } else if (!C10469a.m5034a(context).m5028b()) {
            AbstractC10404b.m5264d("do not report clicked message");
            return;
        } else {
            c10775ae.m3698b(C10469a.m5034a(context).m5026c());
        }
        c10775ae.m3695c("bar:click");
        c10775ae.m3706a(str);
        c10775ae.m3702a(false);
        C10494u.m4943a(context).m4932a(c10775ae, EnumC10766a.Notification, false, c10826r);
    }

    public static void resumePush(Context context, String str) {
        setAcceptTime(context, 0, 0, 23, 59, str);
    }

    private static void scheduleGeoFenceRepeatJobs() {
        if (!C10665h.m4248b(sContext)) {
            return;
        }
        C10410f.m5253a(sContext).m5251a((C10410f.AbstractRunnableC10411a) new C10475d(sContext), C10612ah.m4394a(sContext).m4397a(EnumC10806e.UploadWIFIGeoLocFrequency.m3437a(), IMediaPlayer.MEDIA_INFO_TIMED_TEXT_ERROR));
    }

    private static void scheduleOcVersionCheckJob() {
        C10410f.m5253a(sContext).m5250a(new C10488o(sContext), C10612ah.m4394a(sContext).m4397a(EnumC10806e.OcVersionCheckFrequency.m3437a(), Strategy.f28191g), 5);
    }

    public static void setAcceptTime(Context context, int i, int i2, int i3, int i4, String str) {
        if (i < 0 || i >= 24 || i3 < 0 || i3 >= 24 || i2 < 0 || i2 >= 60 || i4 < 0 || i4 >= 60) {
            throw new IllegalArgumentException("the input parameter is not valid.");
        }
        long rawOffset = ((TimeZone.getTimeZone("GMT+08").getRawOffset() - TimeZone.getDefault().getRawOffset()) / 1000) / 60;
        long j = ((((i * 60) + i2) + rawOffset) + 1440) % 1440;
        long j2 = ((rawOffset + ((i3 * 60) + i4)) + 1440) % 1440;
        ArrayList arrayList = new ArrayList();
        arrayList.add(String.format("%1$02d:%2$02d", Long.valueOf(j / 60), Long.valueOf(j % 60)));
        arrayList.add(String.format("%1$02d:%2$02d", Long.valueOf(j2 / 60), Long.valueOf(j2 % 60)));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(String.format("%1$02d:%2$02d", Integer.valueOf(i), Integer.valueOf(i2)));
        arrayList2.add(String.format("%1$02d:%2$02d", Integer.valueOf(i3), Integer.valueOf(i4)));
        if (!acceptTimeSet(context, (String) arrayList.get(0), (String) arrayList.get(1))) {
            setCommand(context, COMMAND_SET_ACCEPT_TIME, arrayList, str);
        } else if (1 == PushMessageHelper.getPushMode(context)) {
            PushMessageHandler.m5041a(context, str, COMMAND_SET_ACCEPT_TIME, 0L, null, arrayList2);
        } else {
            PushMessageHelper.sendCommandMessageBroadcast(context, PushMessageHelper.generateCommandMessage(COMMAND_SET_ACCEPT_TIME, arrayList2, 0L, null, null));
        }
    }

    public static void setAlias(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            setCommand(context, COMMAND_SET_ALIAS, str, str2);
        }
    }

    protected static void setCommand(Context context, String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
        }
        if (COMMAND_SET_ALIAS.equalsIgnoreCase(str) && Math.abs(System.currentTimeMillis() - aliasSetTime(context, str2)) < Util.MILLSECONDS_OF_HOUR) {
            if (1 == PushMessageHelper.getPushMode(context)) {
                PushMessageHandler.m5041a(context, str3, str, 0L, null, arrayList);
            } else {
                PushMessageHelper.sendCommandMessageBroadcast(context, PushMessageHelper.generateCommandMessage(COMMAND_SET_ALIAS, arrayList, 0L, null, null));
            }
        } else if (COMMAND_UNSET_ALIAS.equalsIgnoreCase(str) && aliasSetTime(context, str2) < 0) {
            AbstractC10404b.m5269a("Don't cancel alias for " + arrayList + " is unseted");
        } else if (COMMAND_SET_ACCOUNT.equalsIgnoreCase(str) && Math.abs(System.currentTimeMillis() - accountSetTime(context, str2)) < Util.MILLSECONDS_OF_HOUR) {
            if (1 == PushMessageHelper.getPushMode(context)) {
                PushMessageHandler.m5041a(context, str3, str, 0L, null, arrayList);
            } else {
                PushMessageHelper.sendCommandMessageBroadcast(context, PushMessageHelper.generateCommandMessage(COMMAND_SET_ACCOUNT, arrayList, 0L, null, null));
            }
        } else if (!COMMAND_UNSET_ACCOUNT.equalsIgnoreCase(str) || accountSetTime(context, str2) >= 0) {
            setCommand(context, str, arrayList, str3);
        } else {
            AbstractC10404b.m5269a("Don't cancel account for " + arrayList + " is unseted");
        }
    }

    protected static void setCommand(Context context, String str, ArrayList<String> arrayList, String str2) {
        if (TextUtils.isEmpty(C10469a.m5034a(context).m5026c())) {
            return;
        }
        C10841z c10841z = new C10841z();
        c10841z.m3168a(generatePacketID());
        c10841z.m3165b(C10469a.m5034a(context).m5026c());
        c10841z.m3163c(str);
        Iterator<String> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            c10841z.m3161d(it2.next());
        }
        c10841z.m3157f(str2);
        c10841z.m3159e(context.getPackageName());
        C10494u.m4943a(context).m4934a((C10494u) c10841z, EnumC10766a.Command, (C10826r) null);
    }

    public static void setLocalNotificationType(Context context, int i) {
        C10494u.m4943a(context).m4925b(i & (-1));
    }

    public static void setUserAccount(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            setCommand(context, COMMAND_SET_ACCOUNT, str, str2);
        }
    }

    private static boolean shouldPullNotification(Context context) {
        return Math.abs(System.currentTimeMillis() - context.getSharedPreferences(PREF_EXTRA, 0).getLong("last_pull_notification", -1L)) > MiStatInterface.MIN_UPLOAD_INTERVAL;
    }

    private static boolean shouldSendRegRequest(Context context) {
        return Math.abs(System.currentTimeMillis() - context.getSharedPreferences(PREF_EXTRA, 0).getLong("last_reg_request", -1L)) > 5000;
    }

    public static boolean shouldUseMIUIPush(Context context) {
        return C10494u.m4943a(context).m4923c();
    }

    public static void subscribe(Context context, String str, String str2) {
        if (TextUtils.isEmpty(C10469a.m5034a(context).m5026c()) || TextUtils.isEmpty(str)) {
            return;
        }
        if (Math.abs(System.currentTimeMillis() - topicSubscribedTime(context, str)) <= 86400000) {
            if (1 == PushMessageHelper.getPushMode(context)) {
                PushMessageHandler.m5042a(context, str2, 0L, null, str);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            PushMessageHelper.sendCommandMessageBroadcast(context, PushMessageHelper.generateCommandMessage(COMMAND_SUBSCRIBE_TOPIC, arrayList, 0L, null, null));
            return;
        }
        C10787ak c10787ak = new C10787ak();
        c10787ak.m3568a(generatePacketID());
        c10787ak.m3565b(C10469a.m5034a(context).m5026c());
        c10787ak.m3563c(str);
        c10787ak.m3561d(context.getPackageName());
        c10787ak.m3559e(str2);
        C10494u.m4943a(context).m4934a((C10494u) c10787ak, EnumC10766a.Subscription, (C10826r) null);
    }

    public static long topicSubscribedTime(Context context, String str) {
        return context.getSharedPreferences(PREF_EXTRA, 0).getLong("topic_" + str, -1L);
    }

    public static void unregisterPush(Context context) {
        if (!C10469a.m5034a(context).m5028b()) {
            return;
        }
        C10791am c10791am = new C10791am();
        c10791am.m3535a(generatePacketID());
        c10791am.m3532b(C10469a.m5034a(context).m5026c());
        c10791am.m3530c(C10469a.m5034a(context).m5024e());
        c10791am.m3526e(C10469a.m5034a(context).m5025d());
        c10791am.m3528d(context.getPackageName());
        C10494u.m4943a(context).m4937a(c10791am);
        PushMessageHandler.m5046a();
        C10469a.m5034a(context).m5018k();
        clearExtras(context);
        clearLocalNotificationType(context);
        clearNotification(context);
        if (mSyncMIIDHelper == null) {
            return;
        }
        C10673k.m4213a(context).m4207b(mSyncMIIDHelper);
    }

    public static void unsetAlias(Context context, String str, String str2) {
        setCommand(context, COMMAND_UNSET_ALIAS, str, str2);
    }

    public static void unsetUserAccount(Context context, String str, String str2) {
        setCommand(context, COMMAND_UNSET_ACCOUNT, str, str2);
    }

    public static void unsubscribe(Context context, String str, String str2) {
        if (!C10469a.m5034a(context).m5028b()) {
            return;
        }
        if (topicSubscribedTime(context, str) < 0) {
            AbstractC10404b.m5269a("Don't cancel subscribe for " + str + " is unsubscribed");
            return;
        }
        C10795ao c10795ao = new C10795ao();
        c10795ao.m3503a(generatePacketID());
        c10795ao.m3500b(C10469a.m5034a(context).m5026c());
        c10795ao.m3498c(str);
        c10795ao.m3496d(context.getPackageName());
        c10795ao.m3494e(str2);
        C10494u.m4943a(context).m4934a((C10494u) c10795ao, EnumC10766a.UnSubscription, (C10826r) null);
    }

    private static void updateIMEI() {
        new Thread(new RunnableC10486m()).start();
    }
}
