package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.AbstractC7090hj;
import com.google.android.gms.internal.EnumC6890eg;
import com.google.android.gms.internal.EnumC6958fh;
import java.util.Map;
/* renamed from: com.google.android.gms.tagmanager.dk */
/* loaded from: classes2.dex */
class C9166dk extends AbstractC9229t {

    /* renamed from: a */
    private static final String f28930a = EnumC6890eg.CONSTANT.toString();

    /* renamed from: b */
    private static final String f28931b = EnumC6958fh.VALUE.toString();

    public C9166dk() {
        super(f28930a, f28931b);
    }

    /* renamed from: d */
    public static String m9068d() {
        return f28930a;
    }

    /* renamed from: e */
    public static String m9067e() {
        return f28931b;
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: a */
    public AbstractC7090hj.C7091a mo8870a(Map<String, AbstractC7090hj.C7091a> map) {
        return map.get(f28931b);
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: a */
    public boolean mo8872a() {
        return true;
    }
}
