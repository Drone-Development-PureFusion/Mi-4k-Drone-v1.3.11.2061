package com.fimi.p140a.p146f;

import java.util.ArrayList;
import org.codehaus.jackson.smile.SmileConstants;
/* renamed from: com.fimi.a.f.a */
/* loaded from: classes.dex */
public class C1515a {
    /* renamed from: a */
    public static int[] m35428a(byte[] bArr) {
        int length = bArr.length;
        ArrayList arrayList = new ArrayList();
        byte[] bArr2 = new byte[4];
        for (int i = 0; i < bArr.length; i += 4) {
            if (bArr.length - i < 4 && bArr.length % 4 == 1) {
                bArr2[0] = bArr[i];
                bArr2[1] = 0;
                bArr2[2] = 0;
                bArr2[3] = 0;
            } else if (bArr.length - i < 4 && bArr.length % 4 == 2) {
                bArr2[0] = bArr[i];
                bArr2[1] = bArr[i + 1];
                bArr2[2] = 0;
                bArr2[3] = 0;
            } else if (bArr.length - i >= 4 || bArr.length % 4 != 3) {
                bArr2[0] = bArr[i];
                bArr2[1] = bArr[i + 1];
                bArr2[2] = bArr[i + 2];
                bArr2[3] = bArr[i + 3];
            } else {
                bArr2[0] = bArr[i];
                bArr2[1] = bArr[i + 1];
                bArr2[2] = bArr[i + 2];
                bArr2[3] = 0;
            }
            arrayList.add(m35427b(bArr2));
            bArr2 = new byte[4];
        }
        int[] iArr = new int[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            iArr[i2] = m35426c((byte[]) arrayList.get(i2));
        }
        return iArr;
    }

    /* renamed from: b */
    public static byte[] m35427b(byte[] bArr) {
        byte[] bArr2 = new byte[4];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = bArr[(bArr.length - i) - 1];
        }
        return bArr2;
    }

    /* renamed from: c */
    public static int m35426c(byte[] bArr) {
        return (bArr[3] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) | ((bArr[2] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 8) | ((bArr[1] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 16) | ((bArr[0] & SmileConstants.BYTE_MARKER_END_OF_CONTENT) << 24);
    }
}
