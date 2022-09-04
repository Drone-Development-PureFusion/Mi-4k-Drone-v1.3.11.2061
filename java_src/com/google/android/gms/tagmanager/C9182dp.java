package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.AbstractC7090hj;
import com.google.android.gms.internal.EnumC6890eg;
import java.util.Map;
/* renamed from: com.google.android.gms.tagmanager.dp */
/* loaded from: classes2.dex */
class C9182dp extends AbstractC9141cr {

    /* renamed from: a */
    private static final String f28972a = EnumC6890eg.CONTAINS.toString();

    public C9182dp() {
        super(f28972a);
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9141cr
    /* renamed from: a */
    protected boolean mo8890a(String str, String str2, Map<String, AbstractC7090hj.C7091a> map) {
        return str.contains(str2);
    }
}
