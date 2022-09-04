package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.AbstractC7090hj;
import com.google.android.gms.internal.EnumC6890eg;
import com.google.android.gms.internal.EnumC6958fh;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.tagmanager.y */
/* loaded from: classes2.dex */
public class C9234y extends AbstractC9229t {

    /* renamed from: a */
    private static final String f29071a = EnumC6890eg.HASH.toString();

    /* renamed from: b */
    private static final String f29072b = EnumC6958fh.ARG0.toString();

    /* renamed from: c */
    private static final String f29073c = EnumC6958fh.ALGORITHM.toString();

    /* renamed from: d */
    private static final String f29074d = EnumC6958fh.INPUT_FORMAT.toString();

    public C9234y() {
        super(f29071a, f29072b);
    }

    /* renamed from: a */
    private byte[] m8871a(String str, byte[] bArr) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(bArr);
        return messageDigest.digest();
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: a */
    public AbstractC7090hj.C7091a mo8870a(Map<String, AbstractC7090hj.C7091a> map) {
        byte[] m9075a;
        AbstractC7090hj.C7091a c7091a = map.get(f29072b);
        if (c7091a == null || c7091a == C9147cw.m9110g()) {
            return C9147cw.m9110g();
        }
        String m9132a = C9147cw.m9132a(c7091a);
        AbstractC7090hj.C7091a c7091a2 = map.get(f29073c);
        String m9132a2 = c7091a2 == null ? "MD5" : C9147cw.m9132a(c7091a2);
        AbstractC7090hj.C7091a c7091a3 = map.get(f29074d);
        String m9132a3 = c7091a3 == null ? "text" : C9147cw.m9132a(c7091a3);
        if ("text".equals(m9132a3)) {
            m9075a = m9132a.getBytes();
        } else if (!"base16".equals(m9132a3)) {
            String valueOf = String.valueOf(m9132a3);
            C9065aw.m9301a(valueOf.length() != 0 ? "Hash: unknown input format: ".concat(valueOf) : new String("Hash: unknown input format: "));
            return C9147cw.m9110g();
        } else {
            m9075a = C9161dh.m9075a(m9132a);
        }
        try {
            return C9147cw.m9111f(C9161dh.m9074a(m8871a(m9132a2, m9075a)));
        } catch (NoSuchAlgorithmException e) {
            String valueOf2 = String.valueOf(m9132a2);
            C9065aw.m9301a(valueOf2.length() != 0 ? "Hash: unknown algorithm: ".concat(valueOf2) : new String("Hash: unknown algorithm: "));
            return C9147cw.m9110g();
        }
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: a */
    public boolean mo8872a() {
        return true;
    }
}
