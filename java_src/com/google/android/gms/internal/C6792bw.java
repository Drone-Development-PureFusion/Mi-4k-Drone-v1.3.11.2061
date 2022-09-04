package com.google.android.gms.internal;

import android.util.Base64;
import com.google.android.gms.common.internal.C4588d;
/* renamed from: com.google.android.gms.internal.bw */
/* loaded from: classes2.dex */
public class C6792bw extends aqg {
    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    protected AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        byte[] decode;
        String encodeToString;
        boolean z = true;
        C4588d.m23619b(abstractC6880eaArr != null);
        C4588d.m23619b(abstractC6880eaArr.length >= 1);
        String m16218d = aqf.m16218d(abstractC6880eaArr[0]);
        String str = "text";
        if (abstractC6880eaArr.length > 1) {
            str = aqf.m16218d(abstractC6880eaArr[1]);
        }
        String str2 = "base16";
        if (abstractC6880eaArr.length > 2) {
            str2 = aqf.m16218d(abstractC6880eaArr[2]);
        }
        if (abstractC6880eaArr.length <= 3 || !aqf.m16224a(abstractC6880eaArr[3])) {
            z = false;
        }
        int i = z ? 3 : 2;
        try {
            if ("text".equals(str)) {
                decode = m16218d.getBytes();
            } else if ("base16".equals(str)) {
                decode = C6697aop.m16468a(m16218d);
            } else if ("base64".equals(str)) {
                decode = Base64.decode(m16218d, i);
            } else if (!"base64url".equals(str)) {
                String valueOf = String.valueOf(str);
                throw new UnsupportedOperationException(valueOf.length() != 0 ? "Encode: unknown input format: ".concat(valueOf) : new String("Encode: unknown input format: "));
            } else {
                decode = Base64.decode(m16218d, i | 8);
            }
            if ("base16".equals(str2)) {
                encodeToString = C6697aop.m16467a(decode);
            } else if ("base64".equals(str2)) {
                encodeToString = Base64.encodeToString(decode, i);
            } else if (!"base64url".equals(str2)) {
                String valueOf2 = String.valueOf(str2);
                throw new RuntimeException(valueOf2.length() != 0 ? "Encode: unknown output format: ".concat(valueOf2) : new String("Encode: unknown output format: "));
            } else {
                encodeToString = Base64.encodeToString(decode, i | 8);
            }
            return new C6893ej(encodeToString);
        } catch (IllegalArgumentException e) {
            String valueOf3 = String.valueOf(str);
            throw new RuntimeException(valueOf3.length() != 0 ? "Encode: invalid input:".concat(valueOf3) : new String("Encode: invalid input:"));
        }
    }
}
