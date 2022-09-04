package com.google.firebase.database;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.firebase.database.o */
/* loaded from: classes2.dex */
public class C9895o {

    /* renamed from: a */
    public static final Map<String, String> f30775a = m6652a("timestamp");

    /* renamed from: a */
    private static Map<String, String> m6652a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(".sv", str);
        return Collections.unmodifiableMap(hashMap);
    }
}
