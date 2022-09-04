package com.google.android.gms.tagmanager;

import android.util.Base64;
import com.google.android.gms.internal.AbstractC7090hj;
import com.google.android.gms.internal.EnumC6890eg;
import com.google.android.gms.internal.EnumC6958fh;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.tagmanager.m */
/* loaded from: classes2.dex */
public class C9222m extends AbstractC9229t {

    /* renamed from: a */
    private static final String f29057a = EnumC6890eg.ENCODE.toString();

    /* renamed from: b */
    private static final String f29058b = EnumC6958fh.ARG0.toString();

    /* renamed from: c */
    private static final String f29059c = EnumC6958fh.NO_PADDING.toString();

    /* renamed from: d */
    private static final String f29060d = EnumC6958fh.INPUT_FORMAT.toString();

    /* renamed from: e */
    private static final String f29061e = EnumC6958fh.OUTPUT_FORMAT.toString();

    public C9222m() {
        super(f29057a, f29058b);
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: a */
    public AbstractC7090hj.C7091a mo8870a(Map<String, AbstractC7090hj.C7091a> map) {
        byte[] decode;
        String encodeToString;
        AbstractC7090hj.C7091a c7091a = map.get(f29058b);
        if (c7091a == null || c7091a == C9147cw.m9110g()) {
            return C9147cw.m9110g();
        }
        String m9132a = C9147cw.m9132a(c7091a);
        AbstractC7090hj.C7091a c7091a2 = map.get(f29060d);
        String m9132a2 = c7091a2 == null ? "text" : C9147cw.m9132a(c7091a2);
        AbstractC7090hj.C7091a c7091a3 = map.get(f29061e);
        String m9132a3 = c7091a3 == null ? "base16" : C9147cw.m9132a(c7091a3);
        AbstractC7090hj.C7091a c7091a4 = map.get(f29059c);
        int i = (c7091a4 == null || !C9147cw.m9116e(c7091a4).booleanValue()) ? 2 : 3;
        try {
            if ("text".equals(m9132a2)) {
                decode = m9132a.getBytes();
            } else if ("base16".equals(m9132a2)) {
                decode = C9161dh.m9075a(m9132a);
            } else if ("base64".equals(m9132a2)) {
                decode = Base64.decode(m9132a, i);
            } else if (!"base64url".equals(m9132a2)) {
                String valueOf = String.valueOf(m9132a2);
                C9065aw.m9301a(valueOf.length() != 0 ? "Encode: unknown input format: ".concat(valueOf) : new String("Encode: unknown input format: "));
                return C9147cw.m9110g();
            } else {
                decode = Base64.decode(m9132a, i | 8);
            }
            if ("base16".equals(m9132a3)) {
                encodeToString = C9161dh.m9074a(decode);
            } else if ("base64".equals(m9132a3)) {
                encodeToString = Base64.encodeToString(decode, i);
            } else if (!"base64url".equals(m9132a3)) {
                String valueOf2 = String.valueOf(m9132a3);
                C9065aw.m9301a(valueOf2.length() != 0 ? "Encode: unknown output format: ".concat(valueOf2) : new String("Encode: unknown output format: "));
                return C9147cw.m9110g();
            } else {
                encodeToString = Base64.encodeToString(decode, i | 8);
            }
            return C9147cw.m9111f(encodeToString);
        } catch (IllegalArgumentException e) {
            C9065aw.m9301a("Encode: invalid input:");
            return C9147cw.m9110g();
        }
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: a */
    public boolean mo8872a() {
        return true;
    }
}
