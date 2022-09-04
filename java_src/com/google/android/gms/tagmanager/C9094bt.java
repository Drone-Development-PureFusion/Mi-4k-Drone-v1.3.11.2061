package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.AbstractC7090hj;
import com.google.android.gms.internal.EnumC6890eg;
import com.google.android.gms.internal.EnumC6958fh;
import java.util.Map;
/* renamed from: com.google.android.gms.tagmanager.bt */
/* loaded from: classes2.dex */
class C9094bt extends AbstractC9229t {

    /* renamed from: a */
    private static final String f28766a = EnumC6890eg.RANDOM.toString();

    /* renamed from: b */
    private static final String f28767b = EnumC6958fh.MIN.toString();

    /* renamed from: c */
    private static final String f28768c = EnumC6958fh.MAX.toString();

    public C9094bt() {
        super(f28766a, new String[0]);
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: a */
    public AbstractC7090hj.C7091a mo8870a(Map<String, AbstractC7090hj.C7091a> map) {
        double d;
        double d2;
        AbstractC7090hj.C7091a c7091a = map.get(f28767b);
        AbstractC7090hj.C7091a c7091a2 = map.get(f28768c);
        if (c7091a != null && c7091a != C9147cw.m9110g() && c7091a2 != null && c7091a2 != C9147cw.m9110g()) {
            C9146cv m9128b = C9147cw.m9128b(c7091a);
            C9146cv m9128b2 = C9147cw.m9128b(c7091a2);
            if (m9128b != C9147cw.m9117e() && m9128b2 != C9147cw.m9117e()) {
                double doubleValue = m9128b.doubleValue();
                d = m9128b2.doubleValue();
                if (doubleValue <= d) {
                    d2 = doubleValue;
                    return C9147cw.m9111f(Long.valueOf(Math.round(((d - d2) * Math.random()) + d2)));
                }
            }
        }
        d = 2.147483647E9d;
        d2 = 0.0d;
        return C9147cw.m9111f(Long.valueOf(Math.round(((d - d2) * Math.random()) + d2)));
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: a */
    public boolean mo8872a() {
        return false;
    }
}
