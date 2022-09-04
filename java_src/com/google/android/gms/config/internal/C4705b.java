package com.google.android.gms.config.internal;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.android.gms.config.internal.b */
/* loaded from: classes2.dex */
public class C4705b {
    /* renamed from: a */
    static AppMeasurement m23051a(Context context) {
        try {
            return AppMeasurement.getInstance(context);
        } catch (NoClassDefFoundError e) {
            return null;
        }
    }

    /* renamed from: b */
    public static List<AnalyticsUserProperty> m23050b(Context context) {
        Map<String, Object> map;
        AppMeasurement m23051a = m23051a(context);
        if (m23051a == null) {
            if (!Log.isLoggable("FRCAnalytics", 3)) {
                return null;
            }
            Log.d("FRCAnalytics", "Unable to get user properties: analytics library is missing.");
            return null;
        }
        try {
            map = m23051a.m10903b(false);
        } catch (NullPointerException e) {
            if (Log.isLoggable("FRCAnalytics", 3)) {
                Log.d("FRCAnalytics", "Unable to get user properties.", e);
            }
            map = null;
        }
        if (map == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (entry.getValue() != null) {
                arrayList.add(new AnalyticsUserProperty(entry.getKey(), entry.getValue().toString()));
            }
        }
        return arrayList;
    }
}
