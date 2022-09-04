package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;
/* renamed from: com.google.android.gms.internal.ho */
/* loaded from: classes2.dex */
public class C7100ho {
    /* renamed from: a */
    public static Long m15578a(Object obj) {
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (!(obj instanceof Long)) {
            return null;
        }
        return (Long) obj;
    }

    /* renamed from: a */
    public static String m15576a(List<String> list) {
        if (list.isEmpty()) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (String str : list) {
            if (!z) {
                sb.append("/");
            }
            z = false;
            sb.append(str);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static List<String> m15577a(String str) {
        ArrayList arrayList = new ArrayList();
        String[] split = str.split("/");
        for (int i = 0; i < split.length; i++) {
            if (!split[i].isEmpty()) {
                arrayList.add(split[i]);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m15575a(boolean z) {
        m15574a(z, "", new Object[0]);
    }

    /* renamed from: a */
    public static void m15574a(boolean z, String str, Object... objArr) {
        if (!z) {
            String valueOf = String.valueOf(String.format(str, objArr));
            throw new AssertionError(valueOf.length() != 0 ? "hardAssert failed: ".concat(valueOf) : new String("hardAssert failed: "));
        }
    }
}
