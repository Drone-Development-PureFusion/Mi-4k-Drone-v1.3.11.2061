package com.xiaomi.mistatistic.sdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.mistatistic.sdk.controller.AbstractC10508a;
import com.xiaomi.mistatistic.sdk.controller.AbstractC10532m;
import com.xiaomi.mistatistic.sdk.controller.C10515ab;
import com.xiaomi.mistatistic.sdk.controller.C10521b;
import com.xiaomi.mistatistic.sdk.controller.C10526g;
import com.xiaomi.mistatistic.sdk.controller.C10528i;
import com.xiaomi.mistatistic.sdk.controller.C10534o;
import com.xiaomi.mistatistic.sdk.controller.C10538s;
import com.xiaomi.mistatistic.sdk.controller.C10539t;
import com.xiaomi.mistatistic.sdk.controller.C10543x;
import com.xiaomi.mistatistic.sdk.controller.p270a.C10509a;
import com.xiaomi.mistatistic.sdk.data.C10548b;
import com.xiaomi.mistatistic.sdk.data.C10549c;
import com.xiaomi.mistatistic.sdk.data.C10550d;
import com.xiaomi.mistatistic.sdk.data.C10551e;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class MiStatInterface {
    public static final long MAX_UPLOAD_INTERVAL = 86400000;
    public static final long MIN_UPLOAD_INTERVAL = 300000;
    public static final int UPLOAD_POLICY_BATCH = 2;
    public static final int UPLOAD_POLICY_DEVELOPMENT = 5;
    public static final int UPLOAD_POLICY_INTERVAL = 4;
    public static final int UPLOAD_POLICY_REALTIME = 0;
    public static final int UPLOAD_POLICY_WHILE_INITIALIZE = 3;
    public static final int UPLOAD_POLICY_WIFI_ONLY = 1;
    private static boolean sInitialized = false;

    private static void checkCategoryAndKey(String str, String str2) {
        if (TextUtils.isEmpty(str) || !str.startsWith("mistat_")) {
            if (!TextUtils.isEmpty(str2) && str2.startsWith("mistat_")) {
                throw new IllegalArgumentException("key cannot start with mistat_");
            }
            return;
        }
        throw new IllegalArgumentException("category cannot start with mistat_");
    }

    private static void checkInitialized() {
        if (!sInitialized) {
            throw new IllegalStateException("not initialized, do you forget to call initialize when application started?");
        }
    }

    public static void enableExceptionCatcher(boolean z) {
        C10501a.m4898a(false);
        C10501a.m4900a(z ? 2 : 3);
    }

    public static final void enableLog() {
        C10534o.m4824a();
    }

    public static final String getDeviceID(Context context) {
        return C10526g.m4852a(context);
    }

    public static final void initialize(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("appID or appKey is empty.");
        }
        Context applicationContext = context.getApplicationContext();
        if (str3 == null) {
            str3 = "";
        }
        AbstractC10508a.m4879a(applicationContext, str, str2, str3);
        C10528i.m4846a();
        new C10526g().m4853a();
        C10515ab.m4869a().m4864b();
        sInitialized = true;
    }

    public static boolean isExceptionCatcherEnabled() {
        return C10501a.m4894d() != 1;
    }

    public static final void recordCalculateEvent(String str, String str2, long j) {
        recordCalculateEvent(str, str2, j, null);
    }

    public static final void recordCalculateEvent(String str, String str2, long j, Map map) {
        checkInitialized();
        checkCategoryAndKey(str, str2);
        if (!C10538s.m4813a(AbstractC10508a.m4880a(), "basic_info_reported")) {
            return;
        }
        AbstractC10532m.m4825a(new C10548b(TextUtils.isEmpty(str) ? "mistat_default" : str, str2, j, map));
    }

    public static final void recordCountEvent(String str, String str2) {
        recordCountEvent(str, str2, null);
    }

    public static final void recordCountEvent(String str, String str2, Map map) {
        checkInitialized();
        checkCategoryAndKey(str, str2);
        if (!C10538s.m4813a(AbstractC10508a.m4880a(), "basic_info_reported")) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "mistat_default";
        }
        AbstractC10532m.m4825a(new C10549c(str, str2, map));
    }

    public static final void recordNumericPropertyEvent(String str, String str2, long j) {
        checkInitialized();
        checkCategoryAndKey(str, str2);
        if (!C10538s.m4813a(AbstractC10508a.m4880a(), "basic_info_reported")) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "mistat_default";
        }
        AbstractC10532m.m4825a(new C10550d(str, str2, j));
    }

    public static final void recordPageEnd() {
        checkInitialized();
        C10543x.m4794a().m4786b();
    }

    public static final void recordPageStart(Activity activity, String str) {
        checkInitialized();
        C10543x.m4794a().m4793a(activity, str);
        C10521b.m4859a().m4856a(new C10509a());
    }

    public static final void recordStringPropertyEvent(String str, String str2, String str3) {
        checkInitialized();
        checkCategoryAndKey(str, str2);
        if (!C10538s.m4813a(AbstractC10508a.m4880a(), "basic_info_reported")) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "mistat_default";
        }
        AbstractC10532m.m4825a(new C10551e(str, str2, str3));
    }

    public static final void setUploadPolicy(int i, long j) {
        checkInitialized();
        if (i != 4 || (j >= MIN_UPLOAD_INTERVAL && j <= 86400000)) {
            C10515ab.m4869a().m4868a(i, j);
            return;
        }
        throw new IllegalArgumentException("interval should be set between 5 minutes and 1 day");
    }

    public static boolean shouldExceptionUploadImmediately() {
        return C10501a.m4894d() == 2;
    }

    public static final void triggerUploadManually() {
        checkInitialized();
        new C10539t().m4806a();
    }
}
