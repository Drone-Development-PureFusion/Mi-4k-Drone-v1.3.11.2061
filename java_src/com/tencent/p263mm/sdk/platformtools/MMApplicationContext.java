package com.tencent.p263mm.sdk.platformtools;

import android.content.Context;
import com.tencent.p263mm.sdk.plugin.MMPluginProviderConstants;
/* renamed from: com.tencent.mm.sdk.platformtools.MMApplicationContext */
/* loaded from: classes2.dex */
public final class MMApplicationContext {

    /* renamed from: R */
    private static Context f31630R = null;

    /* renamed from: aE */
    private static String f31631aE = MMPluginProviderConstants.PluginIntent.APP_PACKAGE_PATTERN;

    private MMApplicationContext() {
    }

    public static Context getContext() {
        return f31630R;
    }

    public static String getDefaultPreferencePath() {
        return f31631aE + "_preferences";
    }

    public static String getPackageName() {
        return f31631aE;
    }

    public static void setContext(Context context) {
        f31630R = context;
        f31631aE = context.getPackageName();
        Log.m5877d("MicroMsg.MMApplicationContext", "setup application context for package: " + f31631aE);
    }
}
