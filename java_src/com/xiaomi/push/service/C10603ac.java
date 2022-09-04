package com.xiaomi.push.service;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.RemoteViews;
import com.facebook.common.util.UriUtil;
import com.fimi.soul.utils.p219a.C3070c;
import com.google.android.gms.drive.AbstractC4808e;
import com.xiaomi.channel.commonutils.android.C10390b;
import com.xiaomi.channel.commonutils.android.C10396g;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.channel.commonutils.reflect.C10426a;
import com.xiaomi.push.service.C10609ag;
import com.xiaomi.xmpush.thrift.C10769ab;
import com.xiaomi.xmpush.thrift.C10826r;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.xiaomi.push.service.ac */
/* loaded from: classes.dex */
public class C10603ac {

    /* renamed from: a */
    public static long f32972a = 0;

    /* renamed from: b */
    private static final LinkedList<Pair<Integer, C10769ab>> f32973b = new LinkedList<>();

    /* renamed from: com.xiaomi.push.service.ac$a */
    /* loaded from: classes2.dex */
    public static class C10604a {

        /* renamed from: a */
        Notification f32974a;

        /* renamed from: b */
        long f32975b = 0;
    }

    /* renamed from: com.xiaomi.push.service.ac$b */
    /* loaded from: classes2.dex */
    public static class C10605b {

        /* renamed from: a */
        public String f32976a;

        /* renamed from: b */
        public long f32977b = 0;
    }

    /* renamed from: a */
    private static int m4424a(Context context, String str, String str2) {
        if (str.equals(context.getPackageName())) {
            return context.getResources().getIdentifier(str2, "drawable", str);
        }
        return 0;
    }

    /* renamed from: a */
    private static Notification m4434a(Notification notification) {
        Object m5201a = C10426a.m5201a(notification, "extraNotification");
        if (m5201a != null) {
            C10426a.m5200a(m5201a, "setCustomizedIcon", true);
        }
        return notification;
    }

    /* renamed from: a */
    private static Notification m4432a(Notification notification, String str) {
        try {
            Field declaredField = Notification.class.getDeclaredField("extraNotification");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(notification);
            Method declaredMethod = obj.getClass().getDeclaredMethod("setTargetPkg", CharSequence.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(obj, str);
        } catch (Exception e) {
            AbstractC10404b.m5267a(e);
        }
        return notification;
    }

    /* renamed from: a */
    private static PendingIntent m4430a(Context context, C10769ab c10769ab, C10826r c10826r, byte[] bArr) {
        if (c10826r != null && !TextUtils.isEmpty(c10826r.f34499g)) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(c10826r.f34499g));
            intent.addFlags(AbstractC4808e.f17570a_);
            return PendingIntent.getActivity(context, 0, intent, 134217728);
        } else if (m4414b(c10769ab)) {
            Intent intent2 = new Intent();
            intent2.setComponent(new ComponentName("com.xiaomi.xmsf", "com.xiaomi.mipush.sdk.PushMessageHandler"));
            intent2.putExtra("mipush_payload", bArr);
            intent2.putExtra("mipush_notified", true);
            intent2.addCategory(String.valueOf(c10826r.m3273q()));
            return PendingIntent.getService(context, 0, intent2, 134217728);
        } else {
            Intent intent3 = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
            intent3.setComponent(new ComponentName(c10769ab.f33671f, "com.xiaomi.mipush.sdk.PushMessageHandler"));
            intent3.putExtra("mipush_payload", bArr);
            intent3.putExtra("mipush_notified", true);
            intent3.addCategory(String.valueOf(c10826r.m3273q()));
            return PendingIntent.getService(context, 0, intent3, 134217728);
        }
    }

    /* renamed from: a */
    private static Bitmap m4431a(Context context, int i) {
        return m4422a(context.getResources().getDrawable(i));
    }

    /* renamed from: a */
    public static Bitmap m4422a(Drawable drawable) {
        int i = 1;
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (intrinsicWidth <= 0) {
            intrinsicWidth = 1;
        }
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicHeight > 0) {
            i = intrinsicHeight;
        }
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0102  */
    @SuppressLint({"NewApi"})
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static C10604a m4428a(Context context, C10769ab c10769ab, byte[] bArr, RemoteViews remoteViews, PendingIntent pendingIntent) {
        boolean z;
        long currentTimeMillis;
        Notification notification;
        C10604a c10604a = new C10604a();
        C10826r m3727m = c10769ab.m3727m();
        String m4421a = m4421a(c10769ab);
        Map<String, String> m3271s = m3727m.m3271s();
        Notification.Builder builder = new Notification.Builder(context);
        String[] m4427a = m4427a(context, m3727m);
        builder.setContentTitle(m4427a[0]);
        builder.setContentText(m4427a[1]);
        if (remoteViews != null) {
            builder.setContent(remoteViews);
        } else if (Build.VERSION.SDK_INT >= 16) {
            builder.setStyle(new Notification.BigTextStyle().bigText(m4427a[1]));
        }
        builder.setWhen(System.currentTimeMillis());
        String str = m3271s == null ? null : m3271s.get("notification_show_when");
        if (!TextUtils.isEmpty(str)) {
            builder.setShowWhen(Boolean.parseBoolean(str));
        } else if (Build.VERSION.SDK_INT >= 24) {
            builder.setShowWhen(true);
        }
        builder.setContentIntent(pendingIntent);
        int m4424a = m4424a(context, m4421a, "mipush_notification");
        int m4424a2 = m4424a(context, m4421a, "mipush_small_notification");
        if (m4424a <= 0 || m4424a2 <= 0) {
            builder.setSmallIcon(m4410f(context, m4421a));
        } else {
            builder.setLargeIcon(m4431a(context, m4424a));
            builder.setSmallIcon(m4424a2);
        }
        String str2 = m3271s == null ? null : m3271s.get("__dynamic_icon_uri");
        boolean z2 = (m3271s != null && Boolean.parseBoolean(m3271s.get("__adiom"))) || C10396g.m5302b();
        if (str2 != null && z2) {
            Bitmap bitmap = null;
            if (str2.startsWith(UriUtil.HTTP_SCHEME)) {
                C10609ag.C10611b m4401a = C10609ag.m4401a(context, str2);
                if (m4401a != null) {
                    bitmap = m4401a.f32987a;
                    c10604a.f32975b = m4401a.f32988b;
                }
            } else {
                bitmap = C10609ag.m4399b(context, str2);
            }
            if (bitmap != null) {
                builder.setLargeIcon(bitmap);
                z = true;
                if (m3271s != null && Build.VERSION.SDK_INT >= 24) {
                    boolean parseBoolean = Boolean.parseBoolean(m3271s.get("notification_is_summary"));
                    C10426a.m5200a(builder, "setGroup", m3271s.get("notification_group"));
                    C10426a.m5200a(builder, "setGroupSummary", Boolean.valueOf(parseBoolean));
                }
                builder.setAutoCancel(true);
                currentTimeMillis = System.currentTimeMillis();
                if (m3271s != null && m3271s.containsKey("ticker")) {
                    builder.setTicker(m3271s.get("ticker"));
                }
                if (currentTimeMillis - f32972a > 10000) {
                    f32972a = currentTimeMillis;
                    int m4413c = m4411e(context, m4421a) ? m4413c(context, m4421a) : m3727m.f34498f;
                    builder.setDefaults(m4413c);
                    if (m3271s != null && (m4413c & 1) != 0) {
                        String str3 = m3271s.get("sound_uri");
                        if (!TextUtils.isEmpty(str3) && str3.startsWith("android.resource://" + m4421a)) {
                            builder.setDefaults(m4413c ^ 1);
                            builder.setSound(Uri.parse(str3));
                        }
                    }
                }
                notification = builder.getNotification();
                if (z && C10396g.m5303a()) {
                    m4434a(notification);
                }
                c10604a.f32974a = notification;
                return c10604a;
            }
        }
        z = false;
        if (m3271s != null) {
            boolean parseBoolean2 = Boolean.parseBoolean(m3271s.get("notification_is_summary"));
            C10426a.m5200a(builder, "setGroup", m3271s.get("notification_group"));
            C10426a.m5200a(builder, "setGroupSummary", Boolean.valueOf(parseBoolean2));
        }
        builder.setAutoCancel(true);
        currentTimeMillis = System.currentTimeMillis();
        if (m3271s != null) {
            builder.setTicker(m3271s.get("ticker"));
        }
        if (currentTimeMillis - f32972a > 10000) {
        }
        notification = builder.getNotification();
        if (z) {
            m4434a(notification);
        }
        c10604a.f32974a = notification;
        return c10604a;
    }

    /* renamed from: a */
    public static C10605b m4429a(Context context, C10769ab c10769ab, byte[] bArr) {
        Notification notification;
        C10605b c10605b = new C10605b();
        if (C10390b.m5321d(context, m4421a(c10769ab)) == C10390b.EnumC10391a.NOT_ALLOWED) {
            AbstractC10404b.m5269a("Do not notify because user block " + m4421a(c10769ab) + "‘s notification");
            return c10605b;
        } else if (C10644ay.m4298a(context, c10769ab)) {
            AbstractC10404b.m5269a("Do not notify because user block " + C10644ay.m4295a(c10769ab) + "‘s notification");
            return c10605b;
        } else {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            C10826r m3727m = c10769ab.m3727m();
            RemoteViews m4417b = m4417b(context, c10769ab, bArr);
            PendingIntent m4430a = m4430a(context, c10769ab, m3727m, bArr);
            if (m4430a == null) {
                AbstractC10404b.m5269a("The click PendingIntent is null. ");
                return c10605b;
            }
            if (Build.VERSION.SDK_INT >= 11) {
                C10604a m4428a = m4428a(context, c10769ab, bArr, m4417b, m4430a);
                c10605b.f32977b = m4428a.f32975b;
                c10605b.f32976a = m4421a(c10769ab);
                notification = m4428a.f32974a;
            } else {
                Notification notification2 = new Notification(m4410f(context, m4421a(c10769ab)), null, System.currentTimeMillis());
                String[] m4427a = m4427a(context, m3727m);
                try {
                    notification2.getClass().getMethod("setLatestEventInfo", Context.class, CharSequence.class, CharSequence.class, PendingIntent.class).invoke(notification2, context, m4427a[0], m4427a[1], m4430a);
                } catch (IllegalAccessException e) {
                    AbstractC10404b.m5267a(e);
                } catch (IllegalArgumentException e2) {
                    AbstractC10404b.m5267a(e2);
                } catch (NoSuchMethodException e3) {
                    AbstractC10404b.m5267a(e3);
                } catch (InvocationTargetException e4) {
                    AbstractC10404b.m5267a(e4);
                }
                Map<String, String> m3271s = m3727m.m3271s();
                if (m3271s != null && m3271s.containsKey("ticker")) {
                    notification2.tickerText = m3271s.get("ticker");
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - f32972a > 10000) {
                    f32972a = currentTimeMillis;
                    int m4413c = m4411e(context, m4421a(c10769ab)) ? m4413c(context, m4421a(c10769ab)) : m3727m.f34498f;
                    notification2.defaults = m4413c;
                    if (m3271s != null && (m4413c & 1) != 0) {
                        String str = m3271s.get("sound_uri");
                        if (!TextUtils.isEmpty(str) && str.startsWith("android.resource://" + m4421a(c10769ab))) {
                            notification2.defaults = m4413c ^ 1;
                            notification2.sound = Uri.parse(str);
                        }
                    }
                }
                notification2.flags |= 16;
                if (m4417b != null) {
                    notification2.contentView = m4417b;
                }
                notification = notification2;
            }
            if (C10396g.m5303a() && Build.VERSION.SDK_INT >= 19 && !TextUtils.isEmpty(m3727m.m3298b())) {
                notification.extras.putString("message_id", m3727m.m3298b());
            }
            String str2 = m3727m.m3271s() == null ? null : m3727m.m3271s().get("message_count");
            if (C10396g.m5303a() && str2 != null) {
                try {
                    m4433a(notification, Integer.parseInt(str2));
                } catch (NumberFormatException e5) {
                    AbstractC10404b.m5267a(e5);
                }
            }
            if ("com.xiaomi.xmsf".equals(context.getPackageName())) {
                m4432a(notification, m4421a(c10769ab));
            }
            if ("com.xiaomi.xmsf".equals(m4421a(c10769ab))) {
                C10644ay.m4297a(context, c10769ab, notification);
            }
            int m3273q = m3727m.m3273q() + ((m4421a(c10769ab).hashCode() / 10) * 10);
            notificationManager.notify(m3273q, notification);
            Pair<Integer, C10769ab> pair = new Pair<>(Integer.valueOf(m3273q), c10769ab);
            synchronized (f32973b) {
                f32973b.add(pair);
                if (f32973b.size() > 100) {
                    f32973b.remove();
                }
            }
            return c10605b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m4421a(C10769ab c10769ab) {
        C10826r m3727m;
        if ("com.xiaomi.xmsf".equals(c10769ab.f33671f) && (m3727m = c10769ab.m3727m()) != null && m3727m.m3271s() != null) {
            String str = m3727m.m3271s().get("miui_package_name");
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return c10769ab.f33671f;
    }

    /* renamed from: a */
    private static void m4433a(Notification notification, int i) {
        Object m5201a = C10426a.m5201a(notification, "extraNotification");
        if (m5201a != null) {
            C10426a.m5200a(m5201a, "setMessageCount", Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    public static void m4425a(Context context, String str, int i) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        int hashCode = ((str.hashCode() / 10) * 10) + i;
        LinkedList linkedList = new LinkedList();
        if (i >= 0) {
            notificationManager.cancel(hashCode);
        }
        synchronized (f32973b) {
            Iterator<Pair<Integer, C10769ab>> it2 = f32973b.iterator();
            while (it2.hasNext()) {
                Pair<Integer, C10769ab> next = it2.next();
                C10769ab c10769ab = (C10769ab) next.second;
                if (c10769ab != null) {
                    String m4421a = m4421a(c10769ab);
                    if (i >= 0) {
                        if (hashCode == ((Integer) next.first).intValue() && TextUtils.equals(m4421a, str)) {
                            linkedList.add(next);
                        }
                    } else if (i == -1 && TextUtils.equals(m4421a, str)) {
                        notificationManager.cancel(((Integer) next.first).intValue());
                        linkedList.add(next);
                    }
                }
            }
            if (f32973b != null) {
                f32973b.removeAll(linkedList);
                m4419a(linkedList);
            }
        }
    }

    /* renamed from: a */
    public static void m4423a(Context context, String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            LinkedList linkedList = new LinkedList();
            synchronized (f32973b) {
                Iterator<Pair<Integer, C10769ab>> it2 = f32973b.iterator();
                while (it2.hasNext()) {
                    Pair<Integer, C10769ab> next = it2.next();
                    C10769ab c10769ab = (C10769ab) next.second;
                    if (c10769ab != null) {
                        String m4421a = m4421a(c10769ab);
                        C10826r m3727m = c10769ab.m3727m();
                        if (m3727m != null && TextUtils.equals(m4421a, str)) {
                            String m3282h = m3727m.m3282h();
                            String m3280j = m3727m.m3280j();
                            if (!TextUtils.isEmpty(m3282h) && !TextUtils.isEmpty(m3280j) && m4420a(str2, m3282h) && m4420a(str3, m3280j)) {
                                notificationManager.cancel(((Integer) next.first).intValue());
                                linkedList.add(next);
                            }
                        }
                    }
                }
                if (f32973b != null) {
                    f32973b.removeAll(linkedList);
                    m4419a(linkedList);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m4419a(LinkedList<Pair<Integer, C10769ab>> linkedList) {
        if (linkedList == null || linkedList.size() <= 0) {
            return;
        }
        C10636aw.m4319a().m4309a("category_clear_notification", "clear_notification", linkedList.size(), "");
    }

    /* renamed from: a */
    public static boolean m4426a(Context context, String str) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.importance == 100 && Arrays.asList(runningAppProcessInfo.pkgList).contains(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m4420a(String str, String str2) {
        return TextUtils.isEmpty(str) || str2.contains(str);
    }

    /* renamed from: a */
    public static boolean m4418a(Map<String, String> map) {
        if (map == null || !map.containsKey("notify_foreground")) {
            return true;
        }
        return "1".equals(map.get("notify_foreground"));
    }

    /* renamed from: a */
    private static String[] m4427a(Context context, C10826r c10826r) {
        String m3282h = c10826r.m3282h();
        String m3280j = c10826r.m3280j();
        Map<String, String> m3271s = c10826r.m3271s();
        if (m3271s != null) {
            int intValue = Float.valueOf((context.getResources().getDisplayMetrics().widthPixels / context.getResources().getDisplayMetrics().density) + 0.5f).intValue();
            if (intValue <= 320) {
                String str = m3271s.get("title_short");
                if (!TextUtils.isEmpty(str)) {
                    m3282h = str;
                }
                String str2 = m3271s.get("description_short");
                if (TextUtils.isEmpty(str2)) {
                    str2 = m3280j;
                }
                m3280j = str2;
            } else if (intValue > 360) {
                String str3 = m3271s.get("title_long");
                if (!TextUtils.isEmpty(str3)) {
                    m3282h = str3;
                }
                String str4 = m3271s.get("description_long");
                if (!TextUtils.isEmpty(str4)) {
                    m3280j = str4;
                }
            }
        }
        return new String[]{m3282h, m3280j};
    }

    /* renamed from: b */
    private static RemoteViews m4417b(Context context, C10769ab c10769ab, byte[] bArr) {
        C10826r m3727m = c10769ab.m3727m();
        String m4421a = m4421a(c10769ab);
        Map<String, String> m3271s = m3727m.m3271s();
        if (m3271s == null) {
            return null;
        }
        String str = m3271s.get("layout_name");
        String str2 = m3271s.get("layout_value");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(m4421a);
            int identifier = resourcesForApplication.getIdentifier(str, "layout", m4421a);
            if (identifier == 0) {
                return null;
            }
            RemoteViews remoteViews = new RemoteViews(m4421a, identifier);
            try {
                JSONObject jSONObject = new JSONObject(str2);
                if (jSONObject.has("text")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("text");
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String string = jSONObject2.getString(next);
                        int identifier2 = resourcesForApplication.getIdentifier(next, "id", m4421a);
                        if (identifier2 > 0) {
                            remoteViews.setTextViewText(identifier2, string);
                        }
                    }
                }
                if (jSONObject.has("image")) {
                    JSONObject jSONObject3 = jSONObject.getJSONObject("image");
                    Iterator<String> keys2 = jSONObject3.keys();
                    while (keys2.hasNext()) {
                        String next2 = keys2.next();
                        String string2 = jSONObject3.getString(next2);
                        int identifier3 = resourcesForApplication.getIdentifier(next2, "id", m4421a);
                        int identifier4 = resourcesForApplication.getIdentifier(string2, "drawable", m4421a);
                        if (identifier3 > 0) {
                            remoteViews.setImageViewResource(identifier3, identifier4);
                        }
                    }
                }
                if (jSONObject.has(C3070c.C3071a.f11505i)) {
                    JSONObject jSONObject4 = jSONObject.getJSONObject(C3070c.C3071a.f11505i);
                    Iterator<String> keys3 = jSONObject4.keys();
                    while (keys3.hasNext()) {
                        String next3 = keys3.next();
                        String string3 = jSONObject4.getString(next3);
                        if (string3.length() == 0) {
                            string3 = "yy-MM-dd hh:mm";
                        }
                        int identifier5 = resourcesForApplication.getIdentifier(next3, "id", m4421a);
                        if (identifier5 > 0) {
                            remoteViews.setTextViewText(identifier5, new SimpleDateFormat(string3).format(new Date(System.currentTimeMillis())));
                        }
                    }
                }
                return remoteViews;
            } catch (JSONException e) {
                AbstractC10404b.m5267a(e);
                return null;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            AbstractC10404b.m5267a(e2);
            return null;
        }
    }

    /* renamed from: b */
    public static void m4416b(Context context, String str) {
        m4425a(context, str, -1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m4415b(Context context, String str, int i) {
        context.getSharedPreferences("pref_notify_type", 0).edit().putInt(str, i).commit();
    }

    /* renamed from: b */
    public static boolean m4414b(C10769ab c10769ab) {
        C10826r m3727m = c10769ab.m3727m();
        return m3727m != null && m3727m.m3268v();
    }

    /* renamed from: c */
    static int m4413c(Context context, String str) {
        return context.getSharedPreferences("pref_notify_type", 0).getInt(str, Integer.MAX_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static void m4412d(Context context, String str) {
        context.getSharedPreferences("pref_notify_type", 0).edit().remove(str).commit();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static boolean m4411e(Context context, String str) {
        return context.getSharedPreferences("pref_notify_type", 0).contains(str);
    }

    /* renamed from: f */
    private static int m4410f(Context context, String str) {
        int m4424a = m4424a(context, str, "mipush_notification");
        int m4424a2 = m4424a(context, str, "mipush_small_notification");
        if (m4424a <= 0) {
            m4424a = m4424a2 > 0 ? m4424a2 : context.getApplicationInfo().icon;
        }
        return (m4424a != 0 || Build.VERSION.SDK_INT < 9) ? m4424a : context.getApplicationInfo().logo;
    }
}
