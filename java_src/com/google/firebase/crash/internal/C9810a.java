package com.google.firebase.crash.internal;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.measurement.AppMeasurement;
/* renamed from: com.google.firebase.crash.internal.a */
/* loaded from: classes2.dex */
public class C9810a {

    /* renamed from: a */
    static AppMeasurement f30633a;

    /* renamed from: b */
    private final Context f30634b;

    public C9810a(Context context) {
        this.f30634b = context;
    }

    /* renamed from: a */
    private void m6903a(Bundle bundle) {
        try {
            (0 == 0 ? AppMeasurement.getInstance(this.f30634b) : f30633a).m10909a("crash", "_ae", bundle);
        } catch (NoClassDefFoundError e) {
            String valueOf = String.valueOf(e);
            Log.w("FirebaseCrashAnalytics", new StringBuilder(String.valueOf(valueOf).length() + 50).append("Unable to log event, missing measurement library: ").append(valueOf).toString());
        }
    }

    /* renamed from: a */
    public void m6902a(boolean z, long j) {
        Bundle bundle = new Bundle();
        if (z) {
            bundle.putInt("fatal", 1);
        } else {
            bundle.putInt("fatal", 0);
        }
        bundle.putLong("timestamp", j);
        m6903a(bundle);
    }
}
