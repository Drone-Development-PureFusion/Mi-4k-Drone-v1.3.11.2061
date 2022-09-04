package com.mining.app.zxing.p258b;

import android.content.Intent;
import android.net.Uri;
import com.google.zxing.BarcodeFormat;
import com.mining.app.zxing.p258b.C10047g;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import java.util.regex.Pattern;
/* renamed from: com.mining.app.zxing.b.b */
/* loaded from: classes2.dex */
final class C10040b {

    /* renamed from: e */
    private static final Pattern f30994e = Pattern.compile(Constants.ACCEPT_TIME_SEPARATOR_SP);

    /* renamed from: a */
    static final Vector<BarcodeFormat> f30990a = new Vector<>(5);

    /* renamed from: b */
    static final Vector<BarcodeFormat> f30991b = new Vector<>(1);

    /* renamed from: c */
    static final Vector<BarcodeFormat> f30992c = new Vector<>(1);

    /* renamed from: d */
    static final Vector<BarcodeFormat> f30993d = new Vector<>(1);

    static {
        f30990a.add(BarcodeFormat.UPC_A);
        f30990a.add(BarcodeFormat.UPC_E);
        f30990a.add(BarcodeFormat.EAN_13);
        f30990a.add(BarcodeFormat.EAN_8);
        f30990a.add(BarcodeFormat.RSS14);
        f30991b.add(BarcodeFormat.CODE_128);
        f30992c.add(BarcodeFormat.QR_CODE);
        f30993d.add(BarcodeFormat.DATA_MATRIX);
    }

    private C10040b() {
    }

    /* renamed from: a */
    static Vector<BarcodeFormat> m6383a(Intent intent) {
        List list = null;
        String stringExtra = intent.getStringExtra(C10047g.C10049b.f31014c);
        if (stringExtra != null) {
            list = Arrays.asList(f30994e.split(stringExtra));
        }
        return m6381a(list, intent.getStringExtra(C10047g.C10049b.f31013b));
    }

    /* renamed from: a */
    static Vector<BarcodeFormat> m6382a(Uri uri) {
        List<String> queryParameters = uri.getQueryParameters(C10047g.C10049b.f31014c);
        if (queryParameters != null && queryParameters.size() == 1 && queryParameters.get(0) != null) {
            queryParameters = Arrays.asList(f30994e.split(queryParameters.get(0)));
        }
        return m6381a(queryParameters, uri.getQueryParameter(C10047g.C10049b.f31013b));
    }

    /* renamed from: a */
    private static Vector<BarcodeFormat> m6381a(Iterable<String> iterable, String str) {
        if (iterable != null) {
            Vector<BarcodeFormat> vector = new Vector<>();
            try {
                for (String str2 : iterable) {
                    vector.add(BarcodeFormat.valueOf(str2));
                }
                return vector;
            } catch (IllegalArgumentException e) {
            }
        }
        if (str != null) {
            if (C10047g.C10049b.f31016e.equals(str)) {
                return f30990a;
            }
            if (C10047g.C10049b.f31018g.equals(str)) {
                return f30992c;
            }
            if (C10047g.C10049b.f31019h.equals(str)) {
                return f30993d;
            }
            if (C10047g.C10049b.f31017f.equals(str)) {
                return f30991b;
            }
        }
        return null;
    }
}
