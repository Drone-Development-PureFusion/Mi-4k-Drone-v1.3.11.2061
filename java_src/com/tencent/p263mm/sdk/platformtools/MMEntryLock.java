package com.tencent.p263mm.sdk.platformtools;

import java.util.HashSet;
import java.util.Set;
/* renamed from: com.tencent.mm.sdk.platformtools.MMEntryLock */
/* loaded from: classes2.dex */
public final class MMEntryLock {

    /* renamed from: aF */
    private static Set<String> f31632aF = new HashSet();

    private MMEntryLock() {
    }

    public static boolean isLocked(String str) {
        return f31632aF.contains(str);
    }

    public static boolean lock(String str) {
        if (isLocked(str)) {
            Log.m5877d("MicroMsg.MMEntryLock", "locked-" + str);
            return false;
        }
        Log.m5877d("MicroMsg.MMEntryLock", "lock-" + str);
        return f31632aF.add(str);
    }

    public static void unlock(String str) {
        f31632aF.remove(str);
        Log.m5877d("MicroMsg.MMEntryLock", "unlock-" + str);
    }
}
