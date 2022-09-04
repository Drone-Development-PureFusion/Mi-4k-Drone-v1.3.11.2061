package com.tencent.p263mm.sdk.openapi;

import android.content.Context;
/* renamed from: com.tencent.mm.sdk.openapi.WXAPIFactory */
/* loaded from: classes2.dex */
public class WXAPIFactory {

    /* renamed from: Q */
    private static WXAPIFactory f31587Q = null;

    private WXAPIFactory() {
    }

    public static IWXAPI createWXAPI(Context context, String str) {
        if (f31587Q == null) {
            f31587Q = new WXAPIFactory();
        }
        return new WXApiImplV10(context, str);
    }

    public static IWXAPI createWXAPI(Context context, String str, boolean z) {
        if (f31587Q == null) {
            f31587Q = new WXAPIFactory();
        }
        return new WXApiImplV10(context, str, z);
    }
}
