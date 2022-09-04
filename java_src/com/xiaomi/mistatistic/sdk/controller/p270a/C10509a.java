package com.xiaomi.mistatistic.sdk.controller.p270a;

import android.content.Context;
import android.os.Build;
import android.support.p004v7.media.SystemMediaRouteProvider;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.xiaomi.market.sdk.C10445j;
import com.xiaomi.mistatistic.sdk.controller.AbstractC10508a;
import com.xiaomi.mistatistic.sdk.controller.AbstractC10524e;
import com.xiaomi.mistatistic.sdk.controller.AbstractC10532m;
import com.xiaomi.mistatistic.sdk.controller.C10526g;
import com.xiaomi.mistatistic.sdk.controller.C10538s;
import com.xiaomi.mistatistic.sdk.controller.C10539t;
import com.xiaomi.mistatistic.sdk.data.C10549c;
import com.xiaomi.mistatistic.sdk.data.C10551e;
import java.util.Locale;
/* renamed from: com.xiaomi.mistatistic.sdk.controller.a.a */
/* loaded from: classes2.dex */
public class C10509a implements AbstractC10524e {
    @Override // com.xiaomi.mistatistic.sdk.controller.AbstractC10524e
    /* renamed from: a */
    public void mo4784a() {
        Context m4880a = AbstractC10508a.m4880a();
        if (!C10538s.m4813a(m4880a, "basic_info_reported")) {
            m4874a(m4880a);
            C10538s.m4809b(m4880a, "basic_info_reported", 1);
            new C10539t().m4806a();
        }
        String m4875e = AbstractC10508a.m4875e();
        String m4810a = C10538s.m4810a(m4880a, "basic_info_version", "");
        if (!TextUtils.isEmpty(m4810a) && !m4810a.equals(m4875e)) {
            AbstractC10532m.m4825a(new C10549c("mistat_basic", "upgrade"));
        }
        C10538s.m4807b(m4880a, "basic_info_version", m4875e);
    }

    /* renamed from: a */
    public void m4874a(Context context) {
        AbstractC10532m.m4825a(new C10549c("mistat_basic", "new"));
        AbstractC10532m.m4825a(new C10551e("mistat_basic", "model", Build.MODEL));
        AbstractC10532m.m4825a(new C10551e("mistat_basic", "OS", SystemMediaRouteProvider.PACKAGE_NAME + Build.VERSION.SDK_INT));
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (!TextUtils.isEmpty(telephonyManager.getNetworkOperatorName())) {
            AbstractC10532m.m4825a(new C10551e("mistat_basic", "operator", telephonyManager.getSimOperator()));
        }
        String m4849b = C10526g.m4849b(context);
        if (!TextUtils.isEmpty(m4849b)) {
            AbstractC10532m.m4825a(new C10551e("mistat_basic", "IMEI", m4849b));
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            AbstractC10532m.m4825a(new C10551e("mistat_basic", C10445j.f32463ai, i < i2 ? i + "x" + i2 : i2 + "x" + i));
        }
        AbstractC10532m.m4825a(new C10551e("mistat_basic", "locale", Locale.getDefault().toString()));
    }
}
