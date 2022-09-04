package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.AbstractC7090hj;
import com.google.android.gms.internal.EnumC6958fh;
import java.util.Map;
import java.util.Set;
/* renamed from: com.google.android.gms.tagmanager.br */
/* loaded from: classes2.dex */
public abstract class AbstractC9091br extends AbstractC9229t {

    /* renamed from: a */
    private static final String f28755a = EnumC6958fh.ARG0.toString();

    /* renamed from: b */
    private static final String f28756b = EnumC6958fh.ARG1.toString();

    public AbstractC9091br(String str) {
        super(str, f28755a, f28756b);
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: a */
    public AbstractC7090hj.C7091a mo8870a(Map<String, AbstractC7090hj.C7091a> map) {
        for (AbstractC7090hj.C7091a c7091a : map.values()) {
            if (c7091a == C9147cw.m9110g()) {
                return C9147cw.m9111f((Object) false);
            }
        }
        AbstractC7090hj.C7091a c7091a2 = map.get(f28755a);
        AbstractC7090hj.C7091a c7091a3 = map.get(f28756b);
        return C9147cw.m9111f(Boolean.valueOf((c7091a2 == null || c7091a3 == null) ? false : mo9153a(c7091a2, c7091a3, map)));
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: a */
    public boolean mo8872a() {
        return true;
    }

    /* renamed from: a */
    protected abstract boolean mo9153a(AbstractC7090hj.C7091a c7091a, AbstractC7090hj.C7091a c7091a2, Map<String, AbstractC7090hj.C7091a> map);

    @Override // com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: b */
    public /* bridge */ /* synthetic */ String mo8877b() {
        return super.mo8877b();
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: c */
    public /* bridge */ /* synthetic */ Set mo8876c() {
        return super.mo8876c();
    }
}
