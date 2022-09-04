package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.AbstractC7090hj;
import com.google.android.gms.internal.EnumC6890eg;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.tagmanager.r */
/* loaded from: classes2.dex */
public class C9227r extends AbstractC9229t {

    /* renamed from: a */
    private static final String f29064a = EnumC6890eg.EVENT.toString();

    /* renamed from: b */
    private final C9114cg f29065b;

    public C9227r(C9114cg c9114cg) {
        super(f29064a, new String[0]);
        this.f29065b = c9114cg;
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: a */
    public AbstractC7090hj.C7091a mo8870a(Map<String, AbstractC7090hj.C7091a> map) {
        String m9225a = this.f29065b.m9225a();
        return m9225a == null ? C9147cw.m9110g() : C9147cw.m9111f(m9225a);
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: a */
    public boolean mo8872a() {
        return false;
    }
}
