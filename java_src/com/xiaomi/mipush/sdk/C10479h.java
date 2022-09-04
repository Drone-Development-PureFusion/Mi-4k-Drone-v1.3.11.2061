package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.push.service.AbstractC10621am;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/* renamed from: com.xiaomi.mipush.sdk.h */
/* loaded from: classes2.dex */
public class C10479h {

    /* renamed from: com.xiaomi.mipush.sdk.h$a */
    /* loaded from: classes2.dex */
    public static class C10480a extends RuntimeException {
        public C10480a(String str) {
            super(str);
        }
    }

    /* renamed from: com.xiaomi.mipush.sdk.h$b */
    /* loaded from: classes2.dex */
    public static class C10481b {

        /* renamed from: a */
        public String f32573a;

        /* renamed from: b */
        public boolean f32574b;

        /* renamed from: c */
        public boolean f32575c;

        /* renamed from: d */
        public String f32576d;

        public C10481b(String str, boolean z, boolean z2, String str2) {
            this.f32573a = str;
            this.f32574b = z;
            this.f32575c = z2;
            this.f32576d = str2;
        }
    }

    /* renamed from: a */
    private static ActivityInfo m4978a(PackageManager packageManager, Intent intent, Class<?> cls) {
        for (ResolveInfo resolveInfo : packageManager.queryBroadcastReceivers(intent, 16384)) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (activityInfo != null && cls.getCanonicalName().equals(activityInfo.name)) {
                return activityInfo;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m4982a(Context context) {
        new Thread(new RunnableC10482i(context)).start();
    }

    /* renamed from: a */
    private static void m4980a(ActivityInfo activityInfo, Boolean[] boolArr) {
        if (boolArr[0].booleanValue() != activityInfo.enabled) {
            throw new C10480a(String.format("<receiver android:name=\"%1$s\" .../> in AndroidManifest had the wrong enabled attribute, which should be android:enabled=%2$b.", activityInfo.name, boolArr[0]));
        }
        if (boolArr[1].booleanValue() == activityInfo.exported) {
            return;
        }
        throw new C10480a(String.format("<receiver android:name=\"%1$s\" .../> in AndroidManifest had the wrong exported attribute, which should be android:exported=%2$b.", activityInfo.name, boolArr[1]));
    }

    /* renamed from: a */
    private static boolean m4979a(PackageInfo packageInfo, String[] strArr) {
        for (ServiceInfo serviceInfo : packageInfo.services) {
            if (m4977a(strArr, serviceInfo.name)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m4977a(String[] strArr, String str) {
        if (strArr == null || str == null) {
            return false;
        }
        for (String str2 : strArr) {
            if (TextUtils.equals(str2, str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080 A[EDGE_INSN: B:18:0x0080->B:19:0x0080 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c1 A[SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m4974c(Context context) {
        boolean z;
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        Intent intent = new Intent(AbstractC10621am.f33040o);
        intent.setPackage(packageName);
        try {
            ActivityInfo m4978a = m4978a(packageManager, intent, Class.forName("com.xiaomi.push.service.receivers.PingReceiver"));
            if (!MiPushClient.shouldUseMIUIPush(context)) {
                if (m4978a == null) {
                    throw new C10480a(String.format("<receiver android:name=\"%1$s\" .../> is missing or disabled in AndroidManifest.", "com.xiaomi.push.service.receivers.PingReceiver"));
                }
                m4980a(m4978a, new Boolean[]{true, false});
            } else if (m4978a != null) {
                m4980a(m4978a, new Boolean[]{true, false});
            }
        } catch (ClassNotFoundException e) {
            AbstractC10404b.m5267a(e);
        }
        Intent intent2 = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent2.setPackage(packageName);
        Iterator<ResolveInfo> it2 = packageManager.queryBroadcastReceivers(intent2, 16384).iterator();
        boolean z2 = false;
        while (true) {
            if (!it2.hasNext()) {
                z = z2;
                break;
            }
            ActivityInfo activityInfo = it2.next().activityInfo;
            if (activityInfo != null) {
                try {
                } catch (ClassNotFoundException e2) {
                    AbstractC10404b.m5267a(e2);
                    z = z2;
                }
                if (!TextUtils.isEmpty(activityInfo.name) && PushMessageReceiver.class.isAssignableFrom(Class.forName(activityInfo.name)) && activityInfo.enabled) {
                    z = true;
                    if (!z) {
                        break;
                    }
                    z2 = z;
                }
            }
            z = false;
            if (!z) {
            }
        }
        if (!z) {
            throw new C10480a("Receiver: none of the subclasses of PushMessageReceiver is enabled or defined.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static void m4973c(Context context, PackageInfo packageInfo) {
        boolean z;
        String[] strArr;
        HashSet hashSet = new HashSet();
        String str = context.getPackageName() + ".permission.MIPUSH_RECEIVE";
        hashSet.addAll(Arrays.asList("android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", str, "android.permission.ACCESS_WIFI_STATE", "android.permission.READ_PHONE_STATE", "android.permission.GET_TASKS", "android.permission.VIBRATE"));
        if (packageInfo.permissions != null) {
            for (PermissionInfo permissionInfo : packageInfo.permissions) {
                if (str.equals(permissionInfo.name)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (!z) {
            throw new C10480a(String.format("<permission android:name=\"%1$s\" .../> is undefined in AndroidManifest.", str));
        }
        if (packageInfo.requestedPermissions != null) {
            for (String str2 : packageInfo.requestedPermissions) {
                if (!TextUtils.isEmpty(str2) && hashSet.contains(str2)) {
                    hashSet.remove(str2);
                    if (hashSet.isEmpty()) {
                        break;
                    }
                }
            }
        }
        if (hashSet.isEmpty()) {
            return;
        }
        throw new C10480a(String.format("<uses-permission android:name=\"%1$s\"/> is missing in AndroidManifest.", hashSet.iterator().next()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static void m4972d(Context context, PackageInfo packageInfo) {
        ServiceInfo[] serviceInfoArr;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put(PushMessageHandler.class.getCanonicalName(), new C10481b(PushMessageHandler.class.getCanonicalName(), true, true, ""));
        hashMap2.put(MessageHandleService.class.getCanonicalName(), new C10481b(MessageHandleService.class.getCanonicalName(), true, false, ""));
        if (!MiPushClient.shouldUseMIUIPush(context) || m4979a(packageInfo, new String[]{"com.xiaomi.push.service.XMJobService", "com.xiaomi.push.service.XMPushService"})) {
            hashMap2.put("com.xiaomi.push.service.XMJobService", new C10481b("com.xiaomi.push.service.XMJobService", true, false, "android.permission.BIND_JOB_SERVICE"));
            hashMap2.put("com.xiaomi.push.service.XMPushService", new C10481b("com.xiaomi.push.service.XMPushService", true, false, ""));
        }
        if (packageInfo.services != null) {
            for (ServiceInfo serviceInfo : packageInfo.services) {
                if (!TextUtils.isEmpty(serviceInfo.name) && hashMap2.containsKey(serviceInfo.name)) {
                    C10481b c10481b = (C10481b) hashMap2.remove(serviceInfo.name);
                    boolean z = c10481b.f32574b;
                    boolean z2 = c10481b.f32575c;
                    String str = c10481b.f32576d;
                    if (z != serviceInfo.enabled) {
                        throw new C10480a(String.format("<service android:name=\"%1$s\" .../> in AndroidManifest had the wrong enabled attribute, which should be android:enabled=%2$b.", serviceInfo.name, Boolean.valueOf(z)));
                    }
                    if (z2 != serviceInfo.exported) {
                        throw new C10480a(String.format("<service android:name=\"%1$s\" .../> in AndroidManifest had the wrong exported attribute, which should be android:exported=%2$b.", serviceInfo.name, Boolean.valueOf(z2)));
                    }
                    if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, serviceInfo.permission)) {
                        throw new C10480a(String.format("<service android:name=\"%1$s\" .../> in AndroidManifest had the wrong permission attribute, which should be android:permission=\"%2$s\".", serviceInfo.name, str));
                    }
                    hashMap.put(serviceInfo.name, serviceInfo.processName);
                    if (hashMap2.isEmpty()) {
                        break;
                    }
                }
            }
        }
        if (!hashMap2.isEmpty()) {
            throw new C10480a(String.format("<service android:name=\"%1$s\" .../> is missing or disabled in AndroidManifest.", hashMap2.keySet().iterator().next()));
        }
        if (!TextUtils.equals((CharSequence) hashMap.get(PushMessageHandler.class.getCanonicalName()), (CharSequence) hashMap.get(MessageHandleService.class.getCanonicalName()))) {
            throw new C10480a(String.format("\"%1$s\" and \"%2$s\" must be running in the same process.", PushMessageHandler.class.getCanonicalName(), MessageHandleService.class.getCanonicalName()));
        }
        if (hashMap.containsKey("com.xiaomi.push.service.XMJobService") && hashMap.containsKey("com.xiaomi.push.service.XMPushService") && !TextUtils.equals((CharSequence) hashMap.get("com.xiaomi.push.service.XMJobService"), (CharSequence) hashMap.get("com.xiaomi.push.service.XMPushService"))) {
            throw new C10480a(String.format("\"%1$s\" and \"%2$s\" must be running in the same process.", "com.xiaomi.push.service.XMJobService", "com.xiaomi.push.service.XMPushService"));
        }
    }
}
