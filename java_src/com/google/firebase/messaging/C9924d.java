package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.measurement.AppMeasurement;
/* renamed from: com.google.firebase.messaging.d */
/* loaded from: classes.dex */
class C9924d {

    /* renamed from: a */
    static AppMeasurement f30875a;

    /* renamed from: a */
    private static AppMeasurement m6453a(Context context) {
        AppMeasurement appMeasurement = null;
        try {
            appMeasurement = 0 == 0 ? AppMeasurement.getInstance(context) : f30875a;
        } catch (NoClassDefFoundError e) {
        }
        return appMeasurement;
    }

    /* renamed from: a */
    public static void m6452a(Context context, Intent intent) {
        m6451a(context, "_nr", intent);
    }

    /* renamed from: a */
    private static void m6451a(Context context, String str, Intent intent) {
        Bundle bundle = new Bundle();
        String stringExtra = intent.getStringExtra("google.c.a.c_id");
        if (stringExtra != null) {
            bundle.putString("_nmid", stringExtra);
        }
        String stringExtra2 = intent.getStringExtra("google.c.a.c_l");
        if (stringExtra2 != null) {
            bundle.putString("_nmn", stringExtra2);
        }
        String stringExtra3 = intent.getStringExtra("from");
        if (stringExtra3 == null || !stringExtra3.startsWith("/topics/")) {
            stringExtra3 = null;
        }
        if (stringExtra3 != null) {
            bundle.putString("_nt", stringExtra3);
        }
        try {
            bundle.putInt("_nmt", Integer.valueOf(intent.getStringExtra("google.c.a.ts")).intValue());
        } catch (NumberFormatException e) {
            Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e);
        }
        if (intent.hasExtra("google.c.a.udt")) {
            try {
                bundle.putInt("_ndt", Integer.valueOf(intent.getStringExtra("google.c.a.udt")).intValue());
            } catch (NumberFormatException e2) {
                Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e2);
            }
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            String valueOf = String.valueOf(bundle);
            Log.d("FirebaseMessaging", new StringBuilder(String.valueOf(str).length() + 22 + String.valueOf(valueOf).length()).append("Sending event=").append(str).append(" params=").append(valueOf).toString());
        }
        AppMeasurement m6453a = m6453a(context);
        if (m6453a != null) {
            m6453a.m10909a("fcm", str, bundle);
        } else {
            Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
        }
    }

    /* renamed from: b */
    public static void m6450b(Context context, Intent intent) {
        m6447e(context, intent);
        m6451a(context, "_no", intent);
    }

    /* renamed from: c */
    public static void m6449c(Context context, Intent intent) {
        m6451a(context, "_nd", intent);
    }

    /* renamed from: d */
    public static void m6448d(Context context, Intent intent) {
        m6451a(context, "_nf", intent);
    }

    /* renamed from: e */
    private static void m6447e(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        if (!"1".equals(intent.getStringExtra("google.c.a.tc"))) {
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return;
            }
            Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
            return;
        }
        AppMeasurement m6453a = m6453a(context);
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
        }
        if (m6453a == null) {
            Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
            return;
        }
        String stringExtra = intent.getStringExtra("google.c.a.c_id");
        m6453a.m10907a("fcm", "_ln", stringExtra);
        Bundle bundle = new Bundle();
        bundle.putString("source", "Firebase");
        bundle.putString("medium", "notification");
        bundle.putString("campaign", stringExtra);
        m6453a.m10909a("fcm", "_cmp", bundle);
    }
}
