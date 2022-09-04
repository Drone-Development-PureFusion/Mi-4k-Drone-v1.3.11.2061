package com.tencent.open.p265b;

import com.tencent.open.utils.Global;
import com.tencent.open.utils.OpenConfig;
/* renamed from: com.tencent.open.b.e */
/* loaded from: classes2.dex */
public class C10267e {
    /* renamed from: a */
    public static int m5636a() {
        int i = OpenConfig.getInstance(Global.getContext(), null).getInt("Common_HttpRetryCount");
        if (i == 0) {
            return 2;
        }
        return i;
    }

    /* renamed from: a */
    public static int m5635a(String str) {
        int i = OpenConfig.getInstance(Global.getContext(), str).getInt("Common_BusinessReportFrequency");
        if (i == 0) {
            return 100;
        }
        return i;
    }
}
