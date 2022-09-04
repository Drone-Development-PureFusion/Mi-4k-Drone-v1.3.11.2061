package com.fimi.soul.utils;

import android.content.res.AssetManager;
import com.google.firebase.p253b.C9755a;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import p005b.p006a.p007a.p029b.p045i.p046a.C0548a;
/* renamed from: com.fimi.soul.utils.b */
/* loaded from: classes.dex */
public class C3117b {
    /* renamed from: a */
    public static float m29128a(float f, String str) {
        double d = C9755a.f30449c;
        if (str.equalsIgnoreCase(C0548a.f931b)) {
            d = f * 3.2808399d;
        } else if (str.equalsIgnoreCase("ft")) {
            d = f * 0.3048d;
        } else if (str.equalsIgnoreCase("mph")) {
            d = f * 2.236936d;
        }
        return new BigDecimal(d).setScale(1, 4).floatValue();
    }

    /* renamed from: a */
    public static String m29129a(double d, String str) {
        double d2 = C9755a.f30449c;
        if (str.equalsIgnoreCase(C0548a.f931b)) {
            d2 = 3.2808399d * d;
        } else if (str.equalsIgnoreCase("ft")) {
            d2 = 0.3048d * d;
        } else if (str.equalsIgnoreCase("mph")) {
            d2 = 2.236936d * d;
        }
        return new DecimalFormat("###.00").format(d2);
    }

    /* renamed from: a */
    public static boolean m29127a(AssetManager assetManager, String str, String str2) {
        for (String str3 : assetManager.list(str)) {
            if (str3.equals(str2)) {
                return true;
            }
        }
        return false;
    }
}
