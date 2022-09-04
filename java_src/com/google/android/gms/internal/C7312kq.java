package com.google.android.gms.internal;

import android.util.Log;
import com.google.android.gms.internal.AbstractC7316kt;
import java.util.List;
/* renamed from: com.google.android.gms.internal.kq */
/* loaded from: classes2.dex */
public class C7312kq extends C7313kr {
    public C7312kq(AbstractC7316kt.EnumC7317a enumC7317a, List<String> list) {
        super(enumC7317a, list);
    }

    @Override // com.google.android.gms.internal.C7313kr
    /* renamed from: a */
    protected String mo14849a(AbstractC7316kt.EnumC7317a enumC7317a, String str, String str2, long j) {
        return str2;
    }

    @Override // com.google.android.gms.internal.C7313kr
    /* renamed from: a */
    protected void mo14848a(String str, String str2) {
        Log.e(str, str2);
    }

    @Override // com.google.android.gms.internal.C7313kr
    /* renamed from: b */
    protected void mo14847b(String str, String str2) {
        Log.w(str, str2);
    }

    @Override // com.google.android.gms.internal.C7313kr
    /* renamed from: c */
    protected void mo14846c(String str, String str2) {
        Log.i(str, str2);
    }

    @Override // com.google.android.gms.internal.C7313kr
    /* renamed from: d */
    protected void mo14845d(String str, String str2) {
        Log.d(str, str2);
    }
}
