package com.google.android.gms.internal;

import com.google.android.gms.internal.adf;
import java.io.UnsupportedEncodingException;
/* renamed from: com.google.android.gms.internal.ac */
/* loaded from: classes2.dex */
public class C6175ac extends abd<String> {

    /* renamed from: a */
    private final adf.AbstractC6209b<String> f21078a;

    public C6175ac(int i, String str, adf.AbstractC6209b<String> abstractC6209b, adf.AbstractC6208a abstractC6208a) {
        super(i, str, abstractC6208a);
        this.f21078a = abstractC6209b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.abd
    /* renamed from: a */
    public adf<String> mo18238a(C8092zb c8092zb) {
        String str;
        try {
            str = new String(c8092zb.f26443b, aol.m16501a(c8092zb.f26444c));
        } catch (UnsupportedEncodingException e) {
            str = new String(c8092zb.f26443b);
        }
        return adf.m18046a(str, aol.m16503a(c8092zb));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.abd
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo18236a(String str) {
        this.f21078a.mo18044a(str);
    }
}
