package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.AbstractC7090hj;
import com.google.android.gms.internal.EnumC6890eg;
import java.util.Map;
/* renamed from: com.google.android.gms.tagmanager.cq */
/* loaded from: classes2.dex */
class C9140cq extends AbstractC9141cr {

    /* renamed from: a */
    private static final String f28870a = EnumC6890eg.STARTS_WITH.toString();

    public C9140cq() {
        super(f28870a);
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9141cr
    /* renamed from: a */
    protected boolean mo8890a(String str, String str2, Map<String, AbstractC7090hj.C7091a> map) {
        return str.startsWith(str2);
    }
}
