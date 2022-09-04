package com.google.android.gms.internal;

import java.security.MessageDigest;
@aaa
/* renamed from: com.google.android.gms.internal.tu */
/* loaded from: classes.dex */
public class C7770tu extends AbstractC7765tr {

    /* renamed from: b */
    private MessageDigest f25695b;

    /* renamed from: a */
    byte m13517a(int i) {
        return (byte) ((((i & 255) ^ ((65280 & i) >> 8)) ^ ((16711680 & i) >> 16)) ^ (((-16777216) & i) >> 24));
    }

    @Override // com.google.android.gms.internal.AbstractC7765tr
    /* renamed from: a */
    public byte[] mo13516a(String str) {
        byte[] bArr;
        int i = 4;
        byte[] m13515a = m13515a(str.split(" "));
        this.f25695b = a();
        synchronized (this.f25687a) {
            if (this.f25695b == null) {
                bArr = new byte[0];
            } else {
                this.f25695b.reset();
                this.f25695b.update(m13515a);
                byte[] digest = this.f25695b.digest();
                if (digest.length <= 4) {
                    i = digest.length;
                }
                bArr = new byte[i];
                System.arraycopy(digest, 0, bArr, 0, bArr.length);
            }
        }
        return bArr;
    }

    /* renamed from: a */
    byte[] m13515a(String[] strArr) {
        if (strArr.length == 1) {
            return C7769tt.m13520b(C7769tt.m13521a(strArr[0]));
        }
        if (strArr.length >= 5) {
            byte[] bArr = new byte[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                bArr[i] = m13517a(C7769tt.m13521a(strArr[i]));
            }
            return bArr;
        }
        byte[] bArr2 = new byte[strArr.length * 2];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            byte[] m13514b = m13514b(C7769tt.m13521a(strArr[i2]));
            bArr2[i2 * 2] = m13514b[0];
            bArr2[(i2 * 2) + 1] = m13514b[1];
        }
        return bArr2;
    }

    /* renamed from: b */
    byte[] m13514b(int i) {
        int i2 = (65535 & i) ^ (((-65536) & i) >> 16);
        return new byte[]{(byte) i2, (byte) (i2 >> 8)};
    }
}
