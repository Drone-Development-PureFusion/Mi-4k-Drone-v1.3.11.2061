package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.C4648j;
/* renamed from: com.google.android.gms.analytics.internal.u */
/* loaded from: classes2.dex */
public class C3921u {

    /* renamed from: a */
    public static final String f15153a = String.valueOf(C4648j.f17166c / 1000).replaceAll("(\\d+)(\\d)(\\d\\d)", "$1.$2.$3");

    /* renamed from: b */
    public static final String f15154b;

    static {
        String valueOf = String.valueOf(f15153a);
        f15154b = valueOf.length() != 0 ? "ma".concat(valueOf) : new String("ma");
    }
}
