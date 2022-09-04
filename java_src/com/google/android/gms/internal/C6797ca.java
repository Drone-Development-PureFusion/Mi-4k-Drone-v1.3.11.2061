package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* renamed from: com.google.android.gms.internal.ca */
/* loaded from: classes2.dex */
public class C6797ca extends aqg {
    /* renamed from: a */
    private byte[] m16196a(String str, byte[] bArr) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(bArr);
        return messageDigest.digest();
    }

    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    protected AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        byte[] m16468a;
        C4588d.m23619b(abstractC6880eaArr != null);
        C4588d.m23619b(abstractC6880eaArr.length >= 1);
        if (abstractC6880eaArr[0] == C6886ee.f23122e) {
            return C6886ee.f23122e;
        }
        String m16218d = aqf.m16218d(abstractC6880eaArr[0]);
        String str = "MD5";
        if (abstractC6880eaArr.length > 1) {
            str = abstractC6880eaArr[1] == C6886ee.f23122e ? "MD5" : aqf.m16218d(abstractC6880eaArr[1]);
        }
        String str2 = "text";
        if (abstractC6880eaArr.length > 2) {
            str2 = abstractC6880eaArr[2] == C6886ee.f23122e ? "text" : aqf.m16218d(abstractC6880eaArr[2]);
        }
        if ("text".equals(str2)) {
            m16468a = m16218d.getBytes();
        } else if (!"base16".equals(str2)) {
            String valueOf = String.valueOf(str2);
            throw new RuntimeException(valueOf.length() != 0 ? "Hash: Unknown input format: ".concat(valueOf) : new String("Hash: Unknown input format: "));
        } else {
            m16468a = C6697aop.m16468a(m16218d);
        }
        try {
            return new C6893ej(C6697aop.m16467a(m16196a(str, m16468a)));
        } catch (NoSuchAlgorithmException e) {
            String valueOf2 = String.valueOf(str);
            throw new RuntimeException(valueOf2.length() != 0 ? "Hash: Unknown algorithm: ".concat(valueOf2) : new String("Hash: Unknown algorithm: "), e);
        }
    }
}
