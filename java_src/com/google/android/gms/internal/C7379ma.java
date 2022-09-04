package com.google.android.gms.internal;

import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.ma */
/* loaded from: classes2.dex */
public class C7379ma {

    /* renamed from: a */
    private final String f24602a;

    /* renamed from: b */
    private final Map<String, Object> f24603b;

    public C7379ma(String str, Map<String, Object> map) {
        this.f24602a = str;
        this.f24603b = map;
    }

    /* renamed from: a */
    public static C7379ma m14639a(String str) {
        if (!str.startsWith("gauth|")) {
            return null;
        }
        try {
            Map<String, Object> m14635a = C7380mb.m14635a(str.substring("gauth|".length()));
            return new C7379ma((String) m14635a.get(Constants.EXTRA_KEY_TOKEN), (Map) m14635a.get("auth"));
        } catch (IOException e) {
            throw new RuntimeException("Failed to parse gauth token", e);
        }
    }

    /* renamed from: a */
    public String m14640a() {
        return this.f24602a;
    }

    /* renamed from: b */
    public Map<String, Object> m14638b() {
        return this.f24603b;
    }
}
