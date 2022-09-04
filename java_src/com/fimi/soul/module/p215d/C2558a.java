package com.fimi.soul.module.p215d;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
/* renamed from: com.fimi.soul.module.d.a */
/* loaded from: classes.dex */
public class C2558a {
    /* renamed from: a */
    public static boolean m31240a(Context context) {
        if (context != null) {
            for (NetworkInfo networkInfo : ((ConnectivityManager) context.getSystemService("connectivity")).getAllNetworkInfo()) {
                if (networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m31239b(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.getType() == 0;
    }
}
