package com.google.android.gms.internal;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
/* renamed from: com.google.android.gms.internal.do */
/* loaded from: classes2.dex */
public class C6858do {

    /* renamed from: a */
    private String f23065a = "https://www.google-analytics.com";

    /* renamed from: b */
    private String m16103b(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8").replaceAll("\\+", "%20");
        } catch (UnsupportedEncodingException e) {
            String valueOf = String.valueOf(str);
            aph.m16396a(valueOf.length() != 0 ? "Cannot encode the string: ".concat(valueOf) : new String("Cannot encode the string: "));
            return "";
        }
    }

    /* renamed from: a */
    public String m16106a(C6828dd c6828dd) {
        String str = this.f23065a;
        String valueOf = String.valueOf("/gtm/android?");
        String m16170f = c6828dd.m16171e() ? c6828dd.m16170f() : m16104b(c6828dd);
        return new StringBuilder(String.valueOf(str).length() + 0 + String.valueOf(valueOf).length() + String.valueOf(m16170f).length()).append(str).append(valueOf).append(m16170f).toString();
    }

    /* renamed from: a */
    public void m16105a(String str) {
        this.f23065a = str;
        String valueOf = String.valueOf(str);
        aph.m16392c(valueOf.length() != 0 ? "The Ctfe server endpoint was changed to: ".concat(valueOf) : new String("The Ctfe server endpoint was changed to: "));
    }

    /* renamed from: b */
    String m16104b(C6828dd c6828dd) {
        if (c6828dd == null) {
            return "";
        }
        String trim = !c6828dd.m16169g().trim().equals("") ? c6828dd.m16169g().trim() : "-1";
        StringBuilder sb = new StringBuilder();
        if (c6828dd.m16173c() != null) {
            sb.append(c6828dd.m16173c());
        } else {
            sb.append("id");
        }
        sb.append("=").append(m16103b(c6828dd.m16175a())).append("&").append("pv").append("=").append(m16103b(trim)).append("&").append("rv=5.0");
        if (c6828dd.m16171e()) {
            sb.append("&gtm_debug=x");
        }
        return sb.toString();
    }
}
