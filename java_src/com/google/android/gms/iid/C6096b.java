package com.google.android.gms.iid;

import com.baidu.android.common.security.RSAUtil;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
/* renamed from: com.google.android.gms.iid.b */
/* loaded from: classes2.dex */
public class C6096b {
    /* renamed from: a */
    public static KeyPair m18738a() {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(RSAUtil.ALGORITHM_RSA);
            keyPairGenerator.initialize(2048);
            return keyPairGenerator.generateKeyPair();
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }
}
