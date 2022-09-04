package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: com.google.android.gms.internal.bx */
/* loaded from: classes2.dex */
public class C6793bx extends aqg {

    /* renamed from: a */
    private static final Pattern f22889a = Pattern.compile("(.+)/(.+)/(.+)");

    /* renamed from: a */
    private static String m16197a(Cipher cipher, String str, SecretKeySpec secretKeySpec, IvParameterSpec ivParameterSpec) {
        if (str == null || str.length() == 0) {
            throw new RuntimeException("Encrypt: empty input string");
        }
        try {
            cipher.init(1, secretKeySpec, ivParameterSpec);
            return C6697aop.m16467a(cipher.doFinal(str.getBytes()));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            throw new RuntimeException(valueOf.length() != 0 ? "Encrypt: ".concat(valueOf) : new String("Encrypt: "));
        }
    }

    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    protected AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        C4588d.m23619b(abstractC6880eaArr != null);
        C4588d.m23619b(abstractC6880eaArr.length >= 3);
        String m16218d = aqf.m16218d(abstractC6880eaArr[0]);
        String m16218d2 = aqf.m16218d(abstractC6880eaArr[1]);
        String m16218d3 = aqf.m16218d(abstractC6880eaArr[2]);
        String m16218d4 = abstractC6880eaArr.length < 4 ? "AES/CBC/NoPadding" : aqf.m16218d(abstractC6880eaArr[3]);
        Matcher matcher = f22889a.matcher(m16218d4);
        if (!matcher.matches()) {
            String valueOf = String.valueOf(m16218d4);
            throw new RuntimeException(valueOf.length() != 0 ? "Encrypt: invalid transformation:".concat(valueOf) : new String("Encrypt: invalid transformation:"));
        }
        try {
            return new C6893ej(m16197a(Cipher.getInstance(m16218d4), m16218d, new SecretKeySpec(m16218d2.getBytes(), matcher.group(1)), new IvParameterSpec(m16218d3.getBytes())));
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
            String valueOf2 = String.valueOf(m16218d4);
            throw new RuntimeException(valueOf2.length() != 0 ? "Encrypt: invalid transformation:".concat(valueOf2) : new String("Encrypt: invalid transformation:"));
        }
    }
}
