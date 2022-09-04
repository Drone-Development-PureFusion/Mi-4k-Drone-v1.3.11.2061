package com.google.android.gms.gcm;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.support.p001v4.app.NotificationCompat;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.drive.AbstractC4808e;
import java.util.Iterator;
import java.util.List;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.gcm.e */
/* loaded from: classes2.dex */
public class C6070e {

    /* renamed from: a */
    static C6070e f20558a;

    /* renamed from: b */
    private final Context f20559b;

    /* renamed from: com.google.android.gms.gcm.e$a */
    /* loaded from: classes2.dex */
    private class C6071a extends IllegalArgumentException {
    }

    private C6070e(Context context) {
        this.f20559b = context.getApplicationContext();
    }

    /* renamed from: a */
    private int m18829a() {
        return (int) SystemClock.uptimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static synchronized C6070e m18828a(Context context) {
        C6070e c6070e;
        synchronized (C6070e.class) {
            if (f20558a == null) {
                f20558a = new C6070e(context);
            }
            c6070e = f20558a;
        }
        return c6070e;
    }

    /* renamed from: a */
    static String m18826a(Bundle bundle, String str) {
        String string = bundle.getString(str);
        return string == null ? bundle.getString(str.replace("gcm.n.", "gcm.notification.")) : string;
    }

    /* renamed from: a */
    private String m18825a(String str) {
        return str.substring("gcm.n.".length());
    }

    /* renamed from: a */
    private void m18824a(String str, Notification notification) {
        if (Log.isLoggable("GcmNotification", 3)) {
            Log.d("GcmNotification", "Showing notification");
        }
        NotificationManager notificationManager = (NotificationManager) this.f20559b.getSystemService("notification");
        if (TextUtils.isEmpty(str)) {
            str = new StringBuilder(37).append("GCM-Notification:").append(SystemClock.uptimeMillis()).toString();
        }
        notificationManager.notify(str, 0, notification);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m18827a(Bundle bundle) {
        return "1".equals(m18826a(bundle, "gcm.n.e")) || m18826a(bundle, "gcm.n.icon") != null;
    }

    /* renamed from: b */
    private int m18820b(String str) {
        if (!TextUtils.isEmpty(str)) {
            Resources resources = this.f20559b.getResources();
            int identifier = resources.getIdentifier(str, "drawable", this.f20559b.getPackageName());
            if (identifier != 0) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str, "mipmap", this.f20559b.getPackageName());
            if (identifier2 != 0) {
                return identifier2;
            }
            Log.w("GcmNotification", new StringBuilder(String.valueOf(str).length() + 57).append("Icon resource ").append(str).append(" not found. Notification will use app icon.").toString());
        }
        int i = this.f20559b.getApplicationInfo().icon;
        if (i == 0) {
            return 17301651;
        }
        return i;
    }

    /* renamed from: b */
    private String m18821b(Bundle bundle, String str) {
        String m18826a = m18826a(bundle, str);
        if (!TextUtils.isEmpty(m18826a)) {
            return m18826a;
        }
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf("_loc_key");
        String m18826a2 = m18826a(bundle, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        if (TextUtils.isEmpty(m18826a2)) {
            return null;
        }
        Resources resources = this.f20559b.getResources();
        int identifier = resources.getIdentifier(m18826a2, "string", this.f20559b.getPackageName());
        if (identifier == 0) {
            String valueOf3 = String.valueOf(str);
            String valueOf4 = String.valueOf("_loc_key");
            String valueOf5 = String.valueOf(m18825a(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3)));
            Log.w("GcmNotification", new StringBuilder(String.valueOf(valueOf5).length() + 49 + String.valueOf(m18826a2).length()).append(valueOf5).append(" resource not found: ").append(m18826a2).append(" Default value will be used.").toString());
            return null;
        }
        String valueOf6 = String.valueOf(str);
        String valueOf7 = String.valueOf("_loc_args");
        String m18826a3 = m18826a(bundle, valueOf7.length() != 0 ? valueOf6.concat(valueOf7) : new String(valueOf6));
        if (TextUtils.isEmpty(m18826a3)) {
            return resources.getString(identifier);
        }
        try {
            JSONArray jSONArray = new JSONArray(m18826a3);
            Object[] objArr = new String[jSONArray.length()];
            for (int i = 0; i < objArr.length; i++) {
                objArr[i] = jSONArray.opt(i);
            }
            return resources.getString(identifier, objArr);
        } catch (MissingFormatArgumentException e) {
            Log.w("GcmNotification", new StringBuilder(String.valueOf(m18826a2).length() + 58 + String.valueOf(m18826a3).length()).append("Missing format argument for ").append(m18826a2).append(": ").append(m18826a3).append(" Default value will be used.").toString(), e);
            return null;
        } catch (JSONException e2) {
            String valueOf8 = String.valueOf(str);
            String valueOf9 = String.valueOf("_loc_args");
            String valueOf10 = String.valueOf(m18825a(valueOf9.length() != 0 ? valueOf8.concat(valueOf9) : new String(valueOf8)));
            Log.w("GcmNotification", new StringBuilder(String.valueOf(valueOf10).length() + 41 + String.valueOf(m18826a3).length()).append("Malformed ").append(valueOf10).append(": ").append(m18826a3).append("  Default value will be used.").toString());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m18822b(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Iterator<String> it2 = bundle.keySet().iterator();
        while (it2.hasNext()) {
            String next = it2.next();
            String string = bundle.getString(next);
            if (next.startsWith("gcm.notification.")) {
                next = next.replace("gcm.notification.", "gcm.n.");
            }
            if (next.startsWith("gcm.n.")) {
                if (!"gcm.n.e".equals(next)) {
                    bundle2.putString(next.substring("gcm.n.".length()), string);
                }
                it2.remove();
            }
        }
        String string2 = bundle2.getString("sound2");
        if (string2 != null) {
            bundle2.remove("sound2");
            bundle2.putString("sound", string2);
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("notification", bundle2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m18823b(Context context) {
        if (((KeyguardManager) context.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == myPid) {
                return runningAppProcessInfo.importance == 100;
            }
        }
        return false;
    }

    /* renamed from: c */
    private Uri m18818c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if ("default".equals(str) || this.f20559b.getResources().getIdentifier(str, "raw", this.f20559b.getPackageName()) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        String valueOf = String.valueOf("android.resource://");
        String valueOf2 = String.valueOf(this.f20559b.getPackageName());
        return Uri.parse(new StringBuilder(String.valueOf(valueOf).length() + 5 + String.valueOf(valueOf2).length() + String.valueOf(str).length()).append(valueOf).append(valueOf2).append("/raw/").append(str).toString());
    }

    /* renamed from: d */
    private Notification m18817d(Bundle bundle) {
        String m18821b = m18821b(bundle, "gcm.n.title");
        String m18821b2 = m18821b(bundle, "gcm.n.body");
        int m18820b = m18820b(m18826a(bundle, "gcm.n.icon"));
        String m18826a = m18826a(bundle, "gcm.n.color");
        Uri m18818c = m18818c(m18826a(bundle, "gcm.n.sound2"));
        PendingIntent m18816e = m18816e(bundle);
        NotificationCompat.Builder smallIcon = new NotificationCompat.Builder(this.f20559b).setAutoCancel(true).setSmallIcon(m18820b);
        if (!TextUtils.isEmpty(m18821b)) {
            smallIcon.setContentTitle(m18821b);
        } else {
            smallIcon.setContentTitle(this.f20559b.getApplicationInfo().loadLabel(this.f20559b.getPackageManager()));
        }
        if (!TextUtils.isEmpty(m18821b2)) {
            smallIcon.setContentText(m18821b2);
        }
        if (!TextUtils.isEmpty(m18826a)) {
            smallIcon.setColor(Color.parseColor(m18826a));
        }
        if (m18818c != null) {
            smallIcon.setSound(m18818c);
        }
        if (m18816e != null) {
            smallIcon.setContentIntent(m18816e);
        }
        return smallIcon.build();
    }

    /* renamed from: e */
    private PendingIntent m18816e(Bundle bundle) {
        Intent intent;
        String m18826a = m18826a(bundle, "gcm.n.click_action");
        if (!TextUtils.isEmpty(m18826a)) {
            Intent intent2 = new Intent(m18826a);
            intent2.setPackage(this.f20559b.getPackageName());
            intent2.setFlags(AbstractC4808e.f17570a_);
            intent = intent2;
        } else {
            Intent launchIntentForPackage = this.f20559b.getPackageManager().getLaunchIntentForPackage(this.f20559b.getPackageName());
            if (launchIntentForPackage == null) {
                Log.w("GcmNotification", "No activity found to launch app");
                return null;
            }
            intent = launchIntentForPackage;
        }
        Bundle bundle2 = new Bundle(bundle);
        GcmListenerService.m18939a(bundle2);
        intent.putExtras(bundle2);
        for (String str : bundle2.keySet()) {
            if (str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                intent.removeExtra(str);
            }
        }
        return PendingIntent.getActivity(this.f20559b, m18829a(), intent, 1073741824);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m18819c(Bundle bundle) {
        try {
            m18824a(m18826a(bundle, "gcm.n.tag"), m18817d(bundle));
            return true;
        } catch (C6071a e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.e("GcmNotification", valueOf.length() != 0 ? "Failed to show notification: ".concat(valueOf) : new String("Failed to show notification: "));
            return false;
        }
    }
}
