package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
import java.io.UnsupportedEncodingException;
/* renamed from: com.google.android.gms.internal.ay */
/* loaded from: classes2.dex */
public class C6766ay extends aqg {
    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    protected AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        C4588d.m23619b(abstractC6880eaArr != null);
        try {
            return new C6893ej(C6765ax.m16205a(aqf.m16218d(abstractC6880eaArr.length > 0 ? (AbstractC6880ea) C4588d.m23627a(abstractC6880eaArr[0]) : C6886ee.f23122e), ""));
        } catch (UnsupportedEncodingException e) {
            return C6886ee.f23122e;
        }
    }
}
