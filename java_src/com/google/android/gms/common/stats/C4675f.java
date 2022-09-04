package com.google.android.gms.common.stats;

import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import java.util.List;
/* renamed from: com.google.android.gms.common.stats.f */
/* loaded from: classes2.dex */
public class C4675f {
    /* renamed from: a */
    public static String m23185a(PowerManager.WakeLock wakeLock, String str) {
        String valueOf = String.valueOf(String.valueOf((Process.myPid() << 32) | System.identityHashCode(wakeLock)));
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m23184a(String str) {
        if ("com.google.android.gms".equals(str)) {
            return null;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static List<String> m23183a(List<String> list) {
        if (list == null || list.size() != 1 || !"com.google.android.gms".equals(list.get(0))) {
            return list;
        }
        return null;
    }
}
