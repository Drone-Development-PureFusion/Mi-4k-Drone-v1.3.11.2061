package com.tencent.p263mm.sdk.platformtools;

import java.util.HashMap;
/* renamed from: com.tencent.mm.sdk.platformtools.SystemProperty */
/* loaded from: classes.dex */
public final class SystemProperty {

    /* renamed from: bf */
    private static final HashMap<String, String> f31664bf = new HashMap<>();

    private SystemProperty() {
    }

    public static String getProperty(String str) {
        return f31664bf.get(str);
    }

    public static void setProperty(String str, String str2) {
        f31664bf.put(str, str2);
    }
}
