package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import com.xiaomi.channel.commonutils.string.C10430a;
/* renamed from: com.xiaomi.push.service.aq */
/* loaded from: classes.dex */
public class C10627aq {

    /* renamed from: a */
    private static int f33058a = 8;

    /* renamed from: e */
    private int f33062e = -666;

    /* renamed from: b */
    private byte[] f33059b = new byte[256];

    /* renamed from: d */
    private int f33061d = 0;

    /* renamed from: c */
    private int f33060c = 0;

    /* renamed from: a */
    public static int m4352a(byte b) {
        return b >= 0 ? b : b + 256;
    }

    /* renamed from: a */
    public static String m4347a(byte[] bArr, String str) {
        return String.valueOf(C10430a.m5186a(m4346a(bArr, str.getBytes())));
    }

    /* renamed from: a */
    private void m4351a(int i, byte[] bArr, boolean z) {
        int length = bArr.length;
        for (int i2 = 0; i2 < 256; i2++) {
            this.f33059b[i2] = (byte) i2;
        }
        this.f33061d = 0;
        this.f33060c = 0;
        while (this.f33060c < i) {
            this.f33061d = ((this.f33061d + m4352a(this.f33059b[this.f33060c])) + m4352a(bArr[this.f33060c % length])) % 256;
            m4348a(this.f33059b, this.f33060c, this.f33061d);
            this.f33060c++;
        }
        if (i != 256) {
            this.f33062e = ((this.f33061d + m4352a(this.f33059b[i])) + m4352a(bArr[i % length])) % 256;
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append("S_").append(i - 1).append(":");
            for (int i3 = 0; i3 <= i; i3++) {
                sb.append(" ").append(m4352a(this.f33059b[i3]));
            }
            sb.append("   j_").append(i - 1).append("=").append(this.f33061d);
            sb.append("   j_").append(i).append("=").append(this.f33062e);
            sb.append("   S_").append(i - 1).append("[j_").append(i - 1).append("]=").append(m4352a(this.f33059b[this.f33061d]));
            sb.append("   S_").append(i - 1).append("[j_").append(i).append("]=").append(m4352a(this.f33059b[this.f33062e]));
            if (this.f33059b[1] != 0) {
                sb.append("   S[1]!=0");
            }
            AbstractC10404b.m5269a(sb.toString());
        }
    }

    /* renamed from: a */
    private void m4349a(byte[] bArr) {
        m4351a(256, bArr, false);
    }

    /* renamed from: a */
    private static void m4348a(byte[] bArr, int i, int i2) {
        byte b = bArr[i];
        bArr[i] = bArr[i2];
        bArr[i2] = b;
    }

    /* renamed from: a */
    public static byte[] m4350a(String str, String str2) {
        byte[] m5187a = C10430a.m5187a(str);
        byte[] bytes = str2.getBytes();
        byte[] bArr = new byte[m5187a.length + 1 + bytes.length];
        for (int i = 0; i < m5187a.length; i++) {
            bArr[i] = m5187a[i];
        }
        bArr[m5187a.length] = 95;
        for (int i2 = 0; i2 < bytes.length; i2++) {
            bArr[m5187a.length + 1 + i2] = bytes[i2];
        }
        return bArr;
    }

    /* renamed from: a */
    public static byte[] m4346a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr2.length];
        C10627aq c10627aq = new C10627aq();
        c10627aq.m4349a(bArr);
        c10627aq.m4345b();
        for (int i = 0; i < bArr2.length; i++) {
            bArr3[i] = (byte) (bArr2[i] ^ c10627aq.m4353a());
        }
        return bArr3;
    }

    /* renamed from: b */
    private void m4345b() {
        this.f33061d = 0;
        this.f33060c = 0;
    }

    /* renamed from: b */
    public static byte[] m4344b(byte[] bArr, String str) {
        return m4346a(bArr, C10430a.m5187a(str));
    }

    /* renamed from: a */
    byte m4353a() {
        this.f33060c = (this.f33060c + 1) % 256;
        this.f33061d = (this.f33061d + m4352a(this.f33059b[this.f33060c])) % 256;
        m4348a(this.f33059b, this.f33060c, this.f33061d);
        return this.f33059b[(m4352a(this.f33059b[this.f33060c]) + m4352a(this.f33059b[this.f33061d])) % 256];
    }
}
