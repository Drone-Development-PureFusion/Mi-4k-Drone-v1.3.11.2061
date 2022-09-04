package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.AbstractC7090hj;
import com.google.android.gms.internal.EnumC6890eg;
import com.google.android.gms.internal.EnumC6958fh;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
/* renamed from: com.google.android.gms.tagmanager.bv */
/* loaded from: classes2.dex */
class C9096bv extends AbstractC9229t {

    /* renamed from: a */
    private static final String f28769a = EnumC6890eg.REGEX_GROUP.toString();

    /* renamed from: b */
    private static final String f28770b = EnumC6958fh.ARG0.toString();

    /* renamed from: c */
    private static final String f28771c = EnumC6958fh.ARG1.toString();

    /* renamed from: d */
    private static final String f28772d = EnumC6958fh.IGNORE_CASE.toString();

    /* renamed from: e */
    private static final String f28773e = EnumC6958fh.GROUP.toString();

    public C9096bv() {
        super(f28769a, f28770b, f28771c);
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: a */
    public AbstractC7090hj.C7091a mo8870a(Map<String, AbstractC7090hj.C7091a> map) {
        int i;
        AbstractC7090hj.C7091a c7091a = map.get(f28770b);
        AbstractC7090hj.C7091a c7091a2 = map.get(f28771c);
        if (c7091a == null || c7091a == C9147cw.m9110g() || c7091a2 == null || c7091a2 == C9147cw.m9110g()) {
            return C9147cw.m9110g();
        }
        int i2 = 64;
        if (C9147cw.m9116e(map.get(f28772d)).booleanValue()) {
            i2 = 66;
        }
        AbstractC7090hj.C7091a c7091a3 = map.get(f28773e);
        if (c7091a3 != null) {
            Long m9124c = C9147cw.m9124c(c7091a3);
            if (m9124c == C9147cw.m9129b()) {
                return C9147cw.m9110g();
            }
            i = m9124c.intValue();
            if (i < 0) {
                return C9147cw.m9110g();
            }
        } else {
            i = 1;
        }
        try {
            String m9132a = C9147cw.m9132a(c7091a);
            String str = null;
            Matcher matcher = Pattern.compile(C9147cw.m9132a(c7091a2), i2).matcher(m9132a);
            if (matcher.find() && matcher.groupCount() >= i) {
                str = matcher.group(i);
            }
            return str == null ? C9147cw.m9110g() : C9147cw.m9111f(str);
        } catch (PatternSyntaxException e) {
            return C9147cw.m9110g();
        }
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: a */
    public boolean mo8872a() {
        return true;
    }
}
