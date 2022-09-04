package com.google.android.gms.common.util;

import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;
/* renamed from: com.google.android.gms.common.util.q */
/* loaded from: classes2.dex */
public class C4694q {
    /* renamed from: a */
    public static void m23116a(StringBuilder sb, HashMap<String, String> hashMap) {
        boolean z;
        sb.append("{");
        boolean z2 = true;
        for (String str : hashMap.keySet()) {
            if (!z2) {
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                z = z2;
            } else {
                z = false;
            }
            String str2 = hashMap.get(str);
            sb.append("\"").append(str).append("\":");
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append("\"").append(str2).append("\"");
            }
            z2 = z;
        }
        sb.append("}");
    }
}
