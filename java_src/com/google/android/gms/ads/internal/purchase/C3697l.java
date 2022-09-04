package com.google.android.gms.ads.internal.purchase;

import android.text.TextUtils;
import android.util.Base64;
import com.baidu.android.common.security.RSAUtil;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abr;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
@aaa
/* renamed from: com.google.android.gms.ads.internal.purchase.l */
/* loaded from: classes.dex */
public class C3697l {
    /* renamed from: a */
    public static PublicKey m27072a(String str) {
        try {
            return KeyFactory.getInstance(RSAUtil.ALGORITHM_RSA).generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        } catch (InvalidKeySpecException e2) {
            abr.b("Invalid key specification.");
            throw new IllegalArgumentException(e2);
        }
    }

    /* renamed from: a */
    public static boolean m27071a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
            abr.b("Purchase verification failed: missing data.");
            return false;
        }
        return m27070a(m27072a(str), str2, str3);
    }

    /* renamed from: a */
    public static boolean m27070a(PublicKey publicKey, String str, String str2) {
        try {
            Signature signature = Signature.getInstance("SHA1withRSA");
            signature.initVerify(publicKey);
            signature.update(str.getBytes());
            if (signature.verify(Base64.decode(str2, 0))) {
                return true;
            }
            abr.b("Signature verification failed.");
            return false;
        } catch (InvalidKeyException e) {
            abr.b("Invalid key specification.");
            return false;
        } catch (NoSuchAlgorithmException e2) {
            abr.b("NoSuchAlgorithmException.");
            return false;
        } catch (SignatureException e3) {
            abr.b("Signature exception.");
            return false;
        }
    }
}
