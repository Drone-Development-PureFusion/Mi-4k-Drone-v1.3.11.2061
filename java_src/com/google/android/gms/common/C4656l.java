package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.C3424R;
import com.google.android.gms.common.C4649k;
import com.google.android.gms.common.internal.C4584b;
import com.google.android.gms.common.internal.C4612q;
import com.google.android.gms.common.util.C4681d;
import com.google.android.gms.common.util.C4686i;
import com.google.android.gms.common.util.C4689l;
import com.google.android.gms.common.util.C4696s;
import com.google.android.gms.common.util.C4702y;
import com.google.android.gms.internal.ajo;
import com.google.android.gms.internal.ajp;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: com.google.android.gms.common.l */
/* loaded from: classes.dex */
public class C4656l {
    @Deprecated

    /* renamed from: f */
    public static final String f17182f = "com.google.android.gms";

    /* renamed from: g */
    public static final String f17183g = "com.android.vending";
    @Deprecated

    /* renamed from: e */
    public static final int f17181e = m23347b();

    /* renamed from: h */
    public static boolean f17184h = false;

    /* renamed from: i */
    public static boolean f17185i = false;

    /* renamed from: j */
    static boolean f17186j = false;

    /* renamed from: a */
    private static String f17177a = null;

    /* renamed from: b */
    private static int f17178b = 0;

    /* renamed from: c */
    private static boolean f17179c = false;

    /* renamed from: k */
    static final AtomicBoolean f17187k = new AtomicBoolean();

    /* renamed from: d */
    private static final AtomicBoolean f17180d = new AtomicBoolean();

    /* renamed from: a */
    private static void m23350a(Context context) {
        if (f17180d.get()) {
            return;
        }
        m23345b(context);
        if (f17178b == 0) {
            throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
        }
        if (f17178b == f17181e) {
            return;
        }
        int i = f17181e;
        int i2 = f17178b;
        String valueOf = String.valueOf("com.google.android.gms.version");
        throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 290).append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ").append(i).append(" but found ").append(i2).append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"").append(valueOf).append("\" android:value=\"@integer/google_play_services_version\" />").toString());
    }

    @Deprecated
    /* renamed from: a */
    public static boolean m23351a() {
        return "user".equals(Build.TYPE);
    }

    @TargetApi(19)
    @Deprecated
    /* renamed from: a */
    public static boolean m23349a(Context context, int i, String str) {
        return C4702y.m23089a(context, i, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(21)
    /* renamed from: a */
    public static boolean m23348a(Context context, String str) {
        boolean equals = str.equals("com.google.android.gms");
        if (!equals || !C4681d.m23157a()) {
            if (C4696s.m23103k()) {
                for (PackageInstaller.SessionInfo sessionInfo : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                    if (str.equals(sessionInfo.getAppPackageName())) {
                        return true;
                    }
                }
            }
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
                if (equals) {
                    return applicationInfo.enabled;
                }
                return applicationInfo.enabled && !m23327n(context);
            } catch (PackageManager.NameNotFoundException e) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: b */
    private static int m23347b() {
        return C4612q.f17087a;
    }

    @Deprecated
    /* renamed from: b */
    public static PendingIntent m23346b(int i, Context context, int i2) {
        return C4648j.m23370b().mo23374a(context, i, i2);
    }

    /* renamed from: b */
    private static void m23345b(Context context) {
        if (!f17179c) {
            m23344c(context);
        }
    }

    /* renamed from: c */
    private static void m23344c(Context context) {
        try {
            f17177a = context.getPackageName();
            ajo m17106b = ajp.m17106b(context);
            f17178b = C4584b.m23637b(context);
            PackageInfo m17108b = m17106b.m17108b("com.google.android.gms", 64);
            if (m17108b == null || C4657m.m23326a(context).m23324a(m17108b, C4649k.C4653d.f17176a[1]) == null) {
                f17186j = false;
            } else {
                f17186j = true;
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
        } finally {
            f17179c = true;
        }
    }

    @Deprecated
    /* renamed from: c */
    public static boolean m23343c(Context context, int i) {
        return C4702y.m23090a(context, i);
    }

    @Deprecated
    /* renamed from: d */
    public static String m23342d(int i) {
        return ConnectionResult.m24049a(i);
    }

    @Deprecated
    /* renamed from: d */
    public static boolean m23341d(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        return m23348a(context, "com.google.android.gms");
    }

    @Deprecated
    /* renamed from: e */
    public static int m23339e(Context context) {
        PackageManager packageManager = context.getPackageManager();
        try {
            context.getResources().getString(C3424R.C3427string.common_google_play_services_unknown_issue);
        } catch (Throwable th) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            m23350a(context);
        }
        boolean z = !C4686i.m23137a(context);
        PackageInfo packageInfo = null;
        if (z) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("GooglePlayServicesUtil", "Google Play Store is missing.");
                return 9;
            }
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            C4657m m23326a = C4657m.m23326a(context);
            if (z) {
                C4649k.AbstractBinderC4650a m23324a = m23326a.m23324a(packageInfo, C4649k.C4653d.f17176a);
                if (m23324a == null) {
                    Log.w("GooglePlayServicesUtil", "Google Play Store signature invalid.");
                    return 9;
                } else if (m23326a.m23324a(packageInfo2, m23324a) == null) {
                    Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                    return 9;
                }
            } else if (m23326a.m23324a(packageInfo2, C4649k.C4653d.f17176a) == null) {
                Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                return 9;
            }
            if (C4689l.m23129a(packageInfo2.versionCode) < C4689l.m23129a(f17181e)) {
                Log.w("GooglePlayServicesUtil", new StringBuilder(77).append("Google Play services out of date.  Requires ").append(f17181e).append(" but found ").append(packageInfo2.versionCode).toString());
                return 2;
            }
            ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
            if (applicationInfo == null) {
                try {
                    applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.", e2);
                    return 1;
                }
            }
            return !applicationInfo.enabled ? 3 : 0;
        } catch (PackageManager.NameNotFoundException e3) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 1;
        }
    }

    @Deprecated
    /* renamed from: e */
    public static Intent m23340e(int i) {
        return C4648j.m23370b().mo23372a((Context) null, i, (String) null);
    }

    @Deprecated
    /* renamed from: e */
    public static boolean m23338e(Context context, int i) {
        if (i == 9) {
            return m23348a(context, "com.android.vending");
        }
        return false;
    }

    @Deprecated
    /* renamed from: f */
    public static void m23336f(Context context) {
        int mo23375a = C4648j.m23370b().mo23375a(context);
        if (mo23375a != 0) {
            Intent mo23372a = C4648j.m23370b().mo23372a(context, mo23375a, "e");
            Log.e("GooglePlayServicesUtil", new StringBuilder(57).append("GooglePlayServices not available due to error ").append(mo23375a).toString());
            if (mo23372a != null) {
                throw new C4517d(mo23375a, "Google Play Services not available", mo23372a);
            }
            throw new C4516c(mo23375a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static boolean m23337f(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 18:
            case 42:
                return true;
            default:
                return false;
        }
    }

    @Deprecated
    /* renamed from: g */
    public static boolean m23335g(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 9:
                return true;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            default:
                return false;
        }
    }

    /* renamed from: g */
    public static boolean m23334g(Context context) {
        m23345b(context);
        return f17186j;
    }

    /* renamed from: h */
    public static boolean m23333h(Context context) {
        return m23334g(context) || !m23351a();
    }

    @Deprecated
    /* renamed from: i */
    public static void m23332i(Context context) {
        if (f17187k.getAndSet(true)) {
            return;
        }
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager == null) {
                return;
            }
            notificationManager.cancel(10436);
        } catch (SecurityException e) {
        }
    }

    @Deprecated
    /* renamed from: j */
    public static String m23331j(Context context) {
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(new Uri.Builder().scheme("android.resource").authority("com.google.android.gms").appendPath("raw").appendPath("oss_notice").build());
            try {
                String next = new Scanner(openInputStream).useDelimiter("\\A").next();
                if (openInputStream == null) {
                    return next;
                }
                openInputStream.close();
                return next;
            } catch (NoSuchElementException e) {
                if (openInputStream != null) {
                    openInputStream.close();
                }
                return null;
            } catch (Throwable th) {
                if (openInputStream != null) {
                    openInputStream.close();
                }
                throw th;
            }
        } catch (Exception e2) {
            return null;
        }
    }

    /* renamed from: k */
    public static Resources m23330k(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    /* renamed from: l */
    public static Context m23329l(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    @Deprecated
    /* renamed from: m */
    public static int m23328m(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @TargetApi(18)
    /* renamed from: n */
    public static boolean m23327n(Context context) {
        Bundle applicationRestrictions;
        return C4696s.m23107g() && (applicationRestrictions = ((UserManager) context.getSystemService("user")).getApplicationRestrictions(context.getPackageName())) != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }
}
