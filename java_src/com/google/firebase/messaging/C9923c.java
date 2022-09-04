package com.google.firebase.messaging;

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
import com.google.firebase.iid.FirebaseInstanceIdInternalReceiver;
import java.util.Arrays;
import java.util.List;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
/* renamed from: com.google.firebase.messaging.c */
/* loaded from: classes.dex */
class C9923c {

    /* renamed from: a */
    static C9923c f30872a;

    /* renamed from: b */
    private final Context f30873b;

    /* renamed from: c */
    private final AtomicInteger f30874c = new AtomicInteger((int) SystemClock.elapsedRealtime());

    private C9923c(Context context) {
        this.f30873b = context.getApplicationContext();
    }

    /* renamed from: a */
    private int m6472a() {
        return this.f30874c.incrementAndGet();
    }

    /* renamed from: a */
    private PendingIntent m6468a(Bundle bundle, PendingIntent pendingIntent) {
        Intent intent = new Intent("com.google.firebase.messaging.NOTIFICATION_OPEN");
        m6470a(intent, bundle);
        intent.putExtra("pending_intent", pendingIntent);
        return PendingIntent.getBroadcast(this.f30873b, m6472a(), FirebaseInstanceIdInternalReceiver.m6597b(this.f30873b, intent), 1073741824);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static synchronized C9923c m6471a(Context context) {
        C9923c c9923c;
        synchronized (C9923c.class) {
            if (f30872a == null) {
                f30872a = new C9923c(context);
            }
            c9923c = f30872a;
        }
        return c9923c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m6467a(Bundle bundle, String str) {
        String string = bundle.getString(str);
        return string == null ? bundle.getString(str.replace("gcm.n.", "gcm.notification.")) : string;
    }

    /* renamed from: a */
    private static String m6466a(String str) {
        return str.substring("gcm.n.".length());
    }

    /* renamed from: a */
    private void m6470a(Intent intent, Bundle bundle) {
        for (String str : bundle.keySet()) {
            if (str.startsWith("google.c.a.") || str.equals("from")) {
                intent.putExtra(str, bundle.getString(str));
            }
        }
    }

    /* renamed from: a */
    private void m6465a(String str, Notification notification) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        NotificationManager notificationManager = (NotificationManager) this.f30873b.getSystemService("notification");
        if (TextUtils.isEmpty(str)) {
            str = new StringBuilder(37).append("GCM-Notification:").append(SystemClock.uptimeMillis()).toString();
        }
        notificationManager.notify(str, 0, notification);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m6469a(Bundle bundle) {
        return "1".equals(m6467a(bundle, "gcm.n.e")) || m6467a(bundle, "gcm.n.icon") != null;
    }

    /* renamed from: b */
    private int m6461b(String str) {
        if (!TextUtils.isEmpty(str)) {
            Resources resources = this.f30873b.getResources();
            int identifier = resources.getIdentifier(str, "drawable", this.f30873b.getPackageName());
            if (identifier != 0) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str, "mipmap", this.f30873b.getPackageName());
            if (identifier2 != 0) {
                return identifier2;
            }
            Log.w("FirebaseMessaging", new StringBuilder(String.valueOf(str).length() + 57).append("Icon resource ").append(str).append(" not found. Notification will use app icon.").toString());
        }
        int i = this.f30873b.getApplicationInfo().icon;
        if (i == 0) {
            return 17301651;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m6462b(Bundle bundle, String str) {
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf("_loc_key");
        return m6467a(bundle, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m6464b(Context context) {
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
    private Uri m6458c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if ("default".equals(str) || this.f30873b.getResources().getIdentifier(str, "raw", this.f30873b.getPackageName()) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        String valueOf = String.valueOf("android.resource://");
        String valueOf2 = String.valueOf(this.f30873b.getPackageName());
        return Uri.parse(new StringBuilder(String.valueOf(valueOf).length() + 5 + String.valueOf(valueOf2).length() + String.valueOf(str).length()).append(valueOf).append(valueOf2).append("/raw/").append(str).toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static String m6460c(Bundle bundle) {
        String m6467a = m6467a(bundle, "gcm.n.sound2");
        return TextUtils.isEmpty(m6467a) ? m6467a(bundle, "gcm.n.sound") : m6467a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static Object[] m6459c(Bundle bundle, String str) {
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf("_loc_args");
        String m6467a = m6467a(bundle, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        if (TextUtils.isEmpty(m6467a)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(m6467a);
            String[] strArr = new String[jSONArray.length()];
            for (int i = 0; i < strArr.length; i++) {
                strArr[i] = jSONArray.opt(i);
            }
            return strArr;
        } catch (JSONException e) {
            String valueOf3 = String.valueOf(str);
            String valueOf4 = String.valueOf("_loc_args");
            String valueOf5 = String.valueOf(m6466a(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3)));
            Log.w("FirebaseMessaging", new StringBuilder(String.valueOf(valueOf5).length() + 41 + String.valueOf(m6467a).length()).append("Malformed ").append(valueOf5).append(": ").append(m6467a).append("  Default value will be used.").toString());
            return null;
        }
    }

    /* renamed from: d */
    private Notification m6457d(Bundle bundle) {
        String m6456d = m6456d(bundle, "gcm.n.title");
        String m6456d2 = m6456d(bundle, "gcm.n.body");
        int m6461b = m6461b(m6467a(bundle, "gcm.n.icon"));
        String m6467a = m6467a(bundle, "gcm.n.color");
        Uri m6458c = m6458c(m6460c(bundle));
        PendingIntent m6455e = m6455e(bundle);
        PendingIntent pendingIntent = null;
        if (FirebaseMessagingService.m6515b(bundle)) {
            m6455e = m6468a(bundle, m6455e);
            pendingIntent = m6454f(bundle);
        }
        NotificationCompat.Builder smallIcon = new NotificationCompat.Builder(this.f30873b).setAutoCancel(true).setSmallIcon(m6461b);
        if (!TextUtils.isEmpty(m6456d)) {
            smallIcon.setContentTitle(m6456d);
        } else {
            smallIcon.setContentTitle(this.f30873b.getApplicationInfo().loadLabel(this.f30873b.getPackageManager()));
        }
        if (!TextUtils.isEmpty(m6456d2)) {
            smallIcon.setContentText(m6456d2);
            smallIcon.setStyle(new NotificationCompat.BigTextStyle().bigText(m6456d2));
        }
        if (!TextUtils.isEmpty(m6467a)) {
            smallIcon.setColor(Color.parseColor(m6467a));
        }
        if (m6458c != null) {
            smallIcon.setSound(m6458c);
        }
        if (m6455e != null) {
            smallIcon.setContentIntent(m6455e);
        }
        if (pendingIntent != null) {
            smallIcon.setDeleteIntent(pendingIntent);
        }
        return smallIcon.build();
    }

    /* renamed from: d */
    private String m6456d(Bundle bundle, String str) {
        String m6467a = m6467a(bundle, str);
        if (!TextUtils.isEmpty(m6467a)) {
            return m6467a;
        }
        String m6462b = m6462b(bundle, str);
        if (TextUtils.isEmpty(m6462b)) {
            return null;
        }
        Resources resources = this.f30873b.getResources();
        int identifier = resources.getIdentifier(m6462b, "string", this.f30873b.getPackageName());
        if (identifier == 0) {
            String valueOf = String.valueOf(str);
            String valueOf2 = String.valueOf("_loc_key");
            String valueOf3 = String.valueOf(m6466a(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)));
            Log.w("FirebaseMessaging", new StringBuilder(String.valueOf(valueOf3).length() + 49 + String.valueOf(m6462b).length()).append(valueOf3).append(" resource not found: ").append(m6462b).append(" Default value will be used.").toString());
            return null;
        }
        Object[] m6459c = m6459c(bundle, str);
        if (m6459c == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, m6459c);
        } catch (MissingFormatArgumentException e) {
            String valueOf4 = String.valueOf(Arrays.toString(m6459c));
            Log.w("FirebaseMessaging", new StringBuilder(String.valueOf(m6462b).length() + 58 + String.valueOf(valueOf4).length()).append("Missing format argument for ").append(m6462b).append(": ").append(valueOf4).append(" Default value will be used.").toString(), e);
            return null;
        }
    }

    /* renamed from: e */
    private PendingIntent m6455e(Bundle bundle) {
        Intent intent;
        String m6467a = m6467a(bundle, "gcm.n.click_action");
        if (!TextUtils.isEmpty(m6467a)) {
            Intent intent2 = new Intent(m6467a);
            intent2.setPackage(this.f30873b.getPackageName());
            intent2.setFlags(AbstractC4808e.f17570a_);
            intent = intent2;
        } else {
            Intent launchIntentForPackage = this.f30873b.getPackageManager().getLaunchIntentForPackage(this.f30873b.getPackageName());
            if (launchIntentForPackage == null) {
                Log.w("FirebaseMessaging", "No activity found to launch app");
                return null;
            }
            intent = launchIntentForPackage;
        }
        Bundle bundle2 = new Bundle(bundle);
        FirebaseMessagingService.m6520a(bundle2);
        intent.putExtras(bundle2);
        for (String str : bundle2.keySet()) {
            if (str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                intent.removeExtra(str);
            }
        }
        return PendingIntent.getActivity(this.f30873b, m6472a(), intent, 1073741824);
    }

    /* renamed from: f */
    private PendingIntent m6454f(Bundle bundle) {
        Intent intent = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS");
        m6470a(intent, bundle);
        return PendingIntent.getBroadcast(this.f30873b, m6472a(), FirebaseInstanceIdInternalReceiver.m6597b(this.f30873b, intent), 1073741824);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m6463b(Bundle bundle) {
        m6465a(m6467a(bundle, "gcm.n.tag"), m6457d(bundle));
    }
}
