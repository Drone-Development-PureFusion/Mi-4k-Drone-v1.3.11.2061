package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.AbstractC7090hj;
import com.google.android.gms.internal.EnumC6890eg;
import java.util.Map;
/* renamed from: com.google.android.gms.tagmanager.n */
/* loaded from: classes2.dex */
class C9223n extends AbstractC9141cr {

    /* renamed from: a */
    private static final String f29062a = EnumC6890eg.ENDS_WITH.toString();

    public C9223n() {
        super(f29062a);
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9141cr
    /* renamed from: a */
    protected boolean mo8890a(String str, String str2, Map<String, AbstractC7090hj.C7091a> map) {
        return str.endsWith(str2);
    }
}
