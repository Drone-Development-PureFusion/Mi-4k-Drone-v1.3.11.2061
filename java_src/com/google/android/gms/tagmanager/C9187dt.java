package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.AbstractC7090hj;
import com.google.android.gms.internal.EnumC6890eg;
import com.google.android.gms.internal.EnumC6958fh;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.tagmanager.dt */
/* loaded from: classes2.dex */
public class C9187dt extends AbstractC9229t {

    /* renamed from: a */
    private static final String f28978a = EnumC6890eg.CUSTOM_VAR.toString();

    /* renamed from: b */
    private static final String f28979b = EnumC6958fh.NAME.toString();

    /* renamed from: c */
    private static final String f28980c = EnumC6958fh.DEFAULT_VALUE.toString();

    /* renamed from: d */
    private final C9196e f28981d;

    public C9187dt(C9196e c9196e) {
        super(f28978a, f28979b);
        this.f28981d = c9196e;
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: a */
    public AbstractC7090hj.C7091a mo8870a(Map<String, AbstractC7090hj.C7091a> map) {
        Object m8955c = this.f28981d.m8955c(C9147cw.m9132a(map.get(f28979b)));
        if (m8955c == null) {
            AbstractC7090hj.C7091a c7091a = map.get(f28980c);
            return c7091a != null ? c7091a : C9147cw.m9110g();
        }
        return C9147cw.m9111f(m8955c);
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: a */
    public boolean mo8872a() {
        return false;
    }
}
