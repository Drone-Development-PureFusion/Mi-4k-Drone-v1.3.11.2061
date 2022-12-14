package org.p286a.p287a.p290c.p296f;

import java.util.StringTokenizer;
import org.p286a.p287a.p288a.AbstractC11008b;
import p005b.p006a.p007a.p029b.C0494h;
@AbstractC11008b
/* renamed from: org.a.a.c.f.g */
/* loaded from: classes2.dex */
public class C11078g implements AbstractC11075d {

    /* renamed from: a */
    private static final int f35637a = 36;

    /* renamed from: b */
    private static final int f35638b = 1;

    /* renamed from: c */
    private static final int f35639c = 26;

    /* renamed from: d */
    private static final int f35640d = 38;

    /* renamed from: e */
    private static final int f35641e = 700;

    /* renamed from: f */
    private static final int f35642f = 72;

    /* renamed from: g */
    private static final int f35643g = 128;

    /* renamed from: h */
    private static final char f35644h = '-';

    /* renamed from: i */
    private static final String f35645i = "xn--";

    /* renamed from: a */
    private int m2142a(char c) {
        if (c < 'A' || c > 'Z') {
            if (c >= 'a' && c <= 'z') {
                return c - 'a';
            }
            if (c >= '0' && c <= '9') {
                return (c - '0') + 26;
            }
            throw new IllegalArgumentException("illegal digit: " + c);
        }
        return c - 'A';
    }

    /* renamed from: a */
    private int m2141a(int i, int i2, boolean z) {
        int i3 = z ? i / 700 : i / 2;
        int i4 = (i3 / i2) + i3;
        int i5 = 0;
        while (i4 > 455) {
            i4 /= 35;
            i5 += 36;
        }
        return i5 + ((i4 * 36) / (i4 + 38));
    }

    @Override // org.p286a.p287a.p290c.p296f.AbstractC11075d
    /* renamed from: a */
    public String mo2140a(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (sb.length() > 0) {
                sb.append(C0494h.f686G);
            }
            if (nextToken.startsWith(f35645i)) {
                nextToken = m2139b(nextToken.substring(4));
            }
            sb.append(nextToken);
        }
        return sb.toString();
    }

    /* renamed from: b */
    protected String m2139b(String str) {
        int i;
        int i2;
        int i3 = 72;
        StringBuilder sb = new StringBuilder(str.length());
        int lastIndexOf = str.lastIndexOf(45);
        if (lastIndexOf != -1) {
            sb.append(str.subSequence(0, lastIndexOf));
            str = str.substring(lastIndexOf + 1);
            i = 128;
            i2 = 0;
        } else {
            i = 128;
            i2 = 0;
        }
        while (str.length() > 0) {
            int i4 = 36;
            int i5 = 1;
            int i6 = i2;
            while (str.length() != 0) {
                char charAt = str.charAt(0);
                str = str.substring(1);
                int m2142a = m2142a(charAt);
                i6 += m2142a * i5;
                int i7 = i4 <= i3 + 1 ? 1 : i4 >= i3 + 26 ? 26 : i4 - i3;
                if (m2142a < i7) {
                    break;
                }
                i5 *= 36 - i7;
                i4 += 36;
            }
            i3 = m2141a(i6 - i2, sb.length() + 1, i2 == 0);
            i += i6 / (sb.length() + 1);
            int length = i6 % (sb.length() + 1);
            sb.insert(length, (char) i);
            i2 = length + 1;
        }
        return sb.toString();
    }
}
