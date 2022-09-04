package com.p120c.p121a.p122a.p123a.p126b;

import com.p120c.p121a.p138c.C1356d;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* renamed from: com.c.a.a.a.b.c */
/* loaded from: classes.dex */
public class C1272c implements AbstractC1270a {

    /* renamed from: a */
    private static final String f3199a = "MD5";

    /* renamed from: b */
    private static final int f3200b = 36;

    /* renamed from: a */
    private byte[] m35972a(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(f3199a);
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            C1356d.m35611a(e);
            return null;
        }
    }

    @Override // com.p120c.p121a.p122a.p123a.p126b.AbstractC1270a
    /* renamed from: a */
    public String mo35973a(String str) {
        return new BigInteger(m35972a(str.getBytes())).abs().toString(36);
    }
}
