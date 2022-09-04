package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
/* renamed from: com.google.android.gms.internal.az */
/* loaded from: classes2.dex */
public class C6767az extends aqg {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m16204a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        Charset forName = Charset.forName("UTF-8");
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (str2.indexOf(charAt) != -1) {
                sb.append(charAt);
                i++;
            } else {
                int i2 = 1;
                if (Character.isHighSurrogate(charAt)) {
                    if (i + 1 >= str.length()) {
                        throw new UnsupportedEncodingException();
                    }
                    if (!Character.isLowSurrogate(str.charAt(i + 1))) {
                        throw new UnsupportedEncodingException();
                    }
                    i2 = 2;
                }
                byte[] bytes = str.substring(i, i + i2).getBytes(forName);
                for (int i3 = 0; i3 < bytes.length; i3++) {
                    sb.append("%");
                    sb.append(Character.toUpperCase(Character.forDigit((bytes[i3] >> 4) & 15, 16)));
                    sb.append(Character.toUpperCase(Character.forDigit(bytes[i3] & 15, 16)));
                }
                i += i2;
            }
        }
        return sb.toString().replaceAll(" ", "%20");
    }

    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    protected AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        C4588d.m23619b(abstractC6880eaArr != null);
        try {
            return new C6893ej(m16204a(aqf.m16218d(abstractC6880eaArr.length > 0 ? (AbstractC6880ea) C4588d.m23627a(abstractC6880eaArr[0]) : C6886ee.f23122e), "#;/?:@&=+$,abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_.!~*'()0123456789"));
        } catch (UnsupportedEncodingException e) {
            return C6886ee.f23122e;
        }
    }
}
