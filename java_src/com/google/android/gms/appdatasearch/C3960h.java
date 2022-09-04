package com.google.android.gms.appdatasearch;

import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.android.gms.appdatasearch.h */
/* loaded from: classes2.dex */
public class C3960h {

    /* renamed from: a */
    private static final String[] f15298a = {"text1", "text2", "icon", "intent_action", "intent_data", "intent_data_id", "intent_extra_data", "suggest_large_icon", "intent_activity", "thing_proto"};

    /* renamed from: b */
    private static final Map<String, Integer> f15299b = new HashMap(f15298a.length);

    static {
        for (int i = 0; i < f15298a.length; i++) {
            f15299b.put(f15298a[i], Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    public static int m25910a() {
        return f15298a.length;
    }

    /* renamed from: a */
    public static int m25908a(String str) {
        Integer num = f15299b.get(str);
        if (num == null) {
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 44).append("[").append(str).append("] is not a valid global search section name").toString());
        }
        return num.intValue();
    }

    /* renamed from: a */
    public static String m25909a(int i) {
        if (i < 0 || i >= f15298a.length) {
            return null;
        }
        return f15298a[i];
    }
}
