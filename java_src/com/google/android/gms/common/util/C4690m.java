package com.google.android.gms.common.util;

import org.codehaus.jackson.smile.SmileConstants;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.google.android.gms.common.util.m */
/* loaded from: classes2.dex */
public final class C4690m {
    /* renamed from: a */
    public static String m23128a(byte[] bArr, int i, int i2, boolean z) {
        int i3;
        if (bArr == null || bArr.length == 0 || i < 0 || i2 <= 0 || i + i2 > bArr.length) {
            return null;
        }
        int i4 = 57;
        if (z) {
            i4 = 75;
        }
        StringBuilder sb = new StringBuilder(i4 * (((i2 + 16) - 1) / 16));
        int i5 = i;
        int i6 = i2;
        int i7 = 0;
        int i8 = 0;
        while (i6 > 0) {
            if (i8 == 0) {
                if (i2 < 65536) {
                    sb.append(String.format("%04X:", Integer.valueOf(i5)));
                    i7 = i5;
                } else {
                    sb.append(String.format("%08X:", Integer.valueOf(i5)));
                    i7 = i5;
                }
            } else if (i8 == 8) {
                sb.append(" -");
            }
            sb.append(String.format(" %02X", Integer.valueOf(bArr[i5] & SmileConstants.BYTE_MARKER_END_OF_CONTENT)));
            int i9 = i6 - 1;
            int i10 = i8 + 1;
            if (z && (i10 == 16 || i9 == 0)) {
                int i11 = 16 - i10;
                if (i11 > 0) {
                    for (int i12 = 0; i12 < i11; i12++) {
                        sb.append("   ");
                    }
                }
                if (i11 >= 8) {
                    sb.append("  ");
                }
                sb.append("  ");
                for (int i13 = 0; i13 < i10; i13++) {
                    char c = (char) bArr[i7 + i13];
                    if (c < ' ' || c > '~') {
                        c = C0494h.f686G;
                    }
                    sb.append(c);
                }
            }
            if (i10 == 16 || i9 == 0) {
                sb.append('\n');
                i3 = 0;
            } else {
                i3 = i10;
            }
            i5++;
            i8 = i3;
            i6 = i9;
        }
        return sb.toString();
    }
}
