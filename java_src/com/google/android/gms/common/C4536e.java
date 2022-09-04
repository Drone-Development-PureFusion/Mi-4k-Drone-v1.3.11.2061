package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.p001v4.app.Fragment;
import android.support.p001v4.app.NotificationCompat;
import android.support.p001v4.app.NotificationCompatExtras;
import android.util.Log;
import com.google.android.gms.C3424R;
import com.google.android.gms.common.internal.AbstractDialogInterface$OnClickListenerC4633u;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.C4632t;
import com.google.android.gms.common.util.C4686i;
import com.google.android.gms.common.util.C4696s;
import p005b.p006a.p007a.p029b.p052m.p053a.C0612f;
/* renamed from: com.google.android.gms.common.e */
/* loaded from: classes.dex */
public final class C4536e extends C4656l {

    /* renamed from: a */
    public static final String f16916a = "GooglePlayServicesErrorDialog";
    @Deprecated

    /* renamed from: b */
    public static final int f16917b = C4656l.f17181e;
    @Deprecated

    /* renamed from: c */
    public static final String f16918c = "com.google.android.gms";

    /* renamed from: d */
    public static final String f16919d = "com.android.vending";

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.common.e$a */
    /* loaded from: classes2.dex */
    public static class HandlerC4537a extends Handler {

        /* renamed from: a */
        private final Context f16920a;

        HandlerC4537a(Context context) {
            super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
            this.f16920a = context.getApplicationContext();
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    int m23815a = C4536e.m23815a(this.f16920a);
                    if (!C4536e.m23807c(m23815a)) {
                        return;
                    }
                    C4536e.m23806c(m23815a, this.f16920a);
                    return;
                default:
                    Log.w("GooglePlayServicesUtil", new StringBuilder(50).append("Don't know how to handle this message: ").append(message.what).toString());
                    return;
            }
        }
    }

    private C4536e() {
    }

    @Deprecated
    /* renamed from: a */
    public static int m23815a(Context context) {
        return C4656l.m23339e(context);
    }

    @Deprecated
    /* renamed from: a */
    public static Dialog m23823a(int i, Activity activity, int i2) {
        return m23822a(i, activity, i2, (DialogInterface.OnCancelListener) null);
    }

    @Deprecated
    /* renamed from: a */
    public static Dialog m23822a(int i, Activity activity, int i2, DialogInterface.OnCancelListener onCancelListener) {
        if (m23814a(activity, i)) {
            i = 18;
        }
        return C4515b.m23920a().m23917a(activity, i, i2, onCancelListener);
    }

    @Deprecated
    /* renamed from: a */
    public static PendingIntent m23819a(int i, Context context, int i2) {
        return C4656l.m23346b(i, context, i2);
    }

    @Deprecated
    /* renamed from: a */
    public static String m23824a(int i) {
        return C4656l.m23342d(i);
    }

    @Deprecated
    /* renamed from: a */
    public static void m23820a(int i, Context context) {
        if (C4686i.m23137a(context) && i == 2) {
            i = 42;
        }
        if (m23814a(context, i) || m23808b(context, i)) {
            m23803o(context);
        } else {
            m23806c(i, context);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m23818a(int i, Context context, PendingIntent pendingIntent) {
        m23816a(i, context, (String) null, pendingIntent);
    }

    /* renamed from: a */
    private static void m23817a(int i, Context context, String str) {
        m23816a(i, context, str, C4515b.m23920a().mo23373a(context, i, 0, "n"));
    }

    @TargetApi(20)
    /* renamed from: a */
    private static void m23816a(int i, Context context, String str, PendingIntent pendingIntent) {
        Notification build;
        Notification notification;
        int i2;
        Resources resources = context.getResources();
        String m23436b = C4632t.m23436b(context, i);
        String m23434d = C4632t.m23434d(context, i);
        if (C4686i.m23137a(context)) {
            C4588d.m23623a(C4696s.m23109e());
            build = new Notification.Builder(context).setSmallIcon(C3424R.C3425drawable.common_ic_googleplayservices).setPriority(2).setAutoCancel(true).setStyle(new Notification.BigTextStyle().bigText(new StringBuilder(String.valueOf(m23436b).length() + 1 + String.valueOf(m23434d).length()).append(m23436b).append(" ").append(m23434d).toString())).addAction(C3424R.C3425drawable.common_full_open_on_phone, resources.getString(C3424R.C3427string.common_open_on_phone), pendingIntent).build();
        } else {
            String string = resources.getString(C3424R.C3427string.common_google_play_services_notification_ticker);
            if (C4696s.m23114a()) {
                Notification.Builder autoCancel = new Notification.Builder(context).setSmallIcon(17301642).setContentTitle(m23436b).setContentText(m23434d).setContentIntent(pendingIntent).setTicker(string).setAutoCancel(true);
                if (C4696s.m23105i()) {
                    autoCancel.setLocalOnly(true);
                }
                if (C4696s.m23109e()) {
                    autoCancel.setStyle(new Notification.BigTextStyle().bigText(m23434d));
                    notification = autoCancel.build();
                } else {
                    notification = autoCancel.getNotification();
                }
                if (Build.VERSION.SDK_INT == 19) {
                    notification.extras.putBoolean(NotificationCompatExtras.EXTRA_LOCAL_ONLY, true);
                }
                build = notification;
            } else {
                build = new NotificationCompat.Builder(context).setSmallIcon(17301642).setTicker(string).setWhen(System.currentTimeMillis()).setAutoCancel(true).setContentIntent(pendingIntent).setContentTitle(m23436b).setContentText(m23434d).build();
            }
        }
        if (f(i)) {
            f17187k.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (str != null) {
            notificationManager.notify(str, i2, build);
        } else {
            notificationManager.notify(i2, build);
        }
    }

    /* renamed from: a */
    public static boolean m23821a(int i, Activity activity, Fragment fragment, int i2, DialogInterface.OnCancelListener onCancelListener) {
        if (m23814a(activity, i)) {
            i = 18;
        }
        C4515b m23920a = C4515b.m23920a();
        if (fragment == null) {
            return m23920a.m23907b(activity, i, i2, onCancelListener);
        }
        Dialog m23912a = m23920a.m23912a(activity, i, AbstractDialogInterface$OnClickListenerC4633u.m23431a(fragment, C4515b.m23920a().mo23372a(activity, i, C0612f.f1063a), i2), onCancelListener);
        if (m23912a == null) {
            return false;
        }
        m23920a.m23916a(activity, m23912a, f16916a, onCancelListener);
        return true;
    }

    @Deprecated
    /* renamed from: a */
    public static boolean m23814a(Context context, int i) {
        return C4656l.m23341d(context, i);
    }

    @Deprecated
    /* renamed from: b */
    public static Intent m23813b(int i) {
        return C4656l.m23340e(i);
    }

    @Deprecated
    /* renamed from: b */
    public static String m23809b(Context context) {
        return C4656l.m23331j(context);
    }

    @Deprecated
    /* renamed from: b */
    public static boolean m23812b(int i, Activity activity, int i2) {
        return m23811b(i, activity, i2, null);
    }

    @Deprecated
    /* renamed from: b */
    public static boolean m23811b(int i, Activity activity, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return m23821a(i, activity, null, i2, onCancelListener);
    }

    @Deprecated
    /* renamed from: b */
    public static boolean m23808b(Context context, int i) {
        return C4656l.m23338e(context, i);
    }

    /* renamed from: c */
    public static Resources m23805c(Context context) {
        return C4656l.m23330k(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static void m23806c(int i, Context context) {
        m23817a(i, context, (String) null);
    }

    @Deprecated
    /* renamed from: c */
    public static boolean m23807c(int i) {
        return C4656l.m23335g(i);
    }

    /* renamed from: d */
    public static Context m23804d(Context context) {
        return C4656l.m23329l(context);
    }

    /* renamed from: o */
    private static void m23803o(Context context) {
        HandlerC4537a handlerC4537a = new HandlerC4537a(context);
        handlerC4537a.sendMessageDelayed(handlerC4537a.obtainMessage(1), 120000L);
    }
}
