package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
/* renamed from: com.google.android.gms.internal.ax */
/* loaded from: classes2.dex */
public class C6765ax extends aqg {
    /* renamed from: a */
    private static byte m16206a(String str, int i) {
        if (i + 3 > str.length() || str.charAt(i) != '%') {
            throw new UnsupportedEncodingException();
        }
        String substring = str.substring(i + 1, i + 3);
        if (substring.charAt(0) == '+' || substring.charAt(0) == '-') {
            throw new UnsupportedEncodingException();
        }
        try {
            return (byte) Integer.parseInt(substring, 16);
        } catch (NumberFormatException e) {
            throw new UnsupportedEncodingException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m16205a(String str, String str2) {
        Charset forName = Charset.forName("UTF-8");
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt != '%') {
                sb.append(charAt);
                i++;
            } else {
                byte m16206a = m16206a(str, i);
                int i2 = i + 3;
                if ((m16206a & 128) != 0) {
                    int i3 = 0;
                    while (((m16206a << i3) & 128) != 0) {
                        i3++;
                    }
                    if (i3 < 2 || i3 > 4) {
                        throw new UnsupportedEncodingException();
                    }
                    byte[] bArr = new byte[i3];
                    bArr[0] = m16206a;
                    int i4 = 1;
                    while (i4 < i3) {
                        byte m16206a2 = m16206a(str, i2);
                        int i5 = i2 + 3;
                        if ((m16206a2 & 192) != 128) {
                            throw new UnsupportedEncodingException();
                        }
                        bArr[i4] = m16206a2;
                        i4++;
                        i2 = i5;
                    }
                    CharBuffer decode = forName.decode(ByteBuffer.wrap(bArr));
                    if (decode.length() != 1 || str2.indexOf(decode.charAt(0)) == -1) {
                        sb.append((CharSequence) decode);
                        i = i2;
                    } else {
                        sb.append(str.substring(i, i2));
                        i = i2;
                    }
                } else if (str2.indexOf(m16206a) == -1) {
                    sb.append((char) m16206a);
                    i = i2;
                } else {
                    sb.append(str.substring(i2 - 3, i2));
                    i = i2;
                }
            }
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    protected AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        C4588d.m23619b(abstractC6880eaArr != null);
        try {
            return new C6893ej(m16205a(aqf.m16218d(abstractC6880eaArr.length > 0 ? (AbstractC6880ea) C4588d.m23627a(abstractC6880eaArr[0]) : C6886ee.f23122e), "#;/?:@&=+$,"));
        } catch (UnsupportedEncodingException e) {
            return C6886ee.f23122e;
        }
    }
}
