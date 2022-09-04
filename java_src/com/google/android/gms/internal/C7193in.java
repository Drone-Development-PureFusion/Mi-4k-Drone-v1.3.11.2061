package com.google.android.gms.internal;

import com.facebook.common.util.UriUtil;
/* renamed from: com.google.android.gms.internal.in */
/* loaded from: classes2.dex */
public class C7193in {

    /* renamed from: a */
    public String f24193a;

    /* renamed from: b */
    public boolean f24194b;

    /* renamed from: c */
    public String f24195c;

    /* renamed from: d */
    public String f24196d;

    public String toString() {
        String str = this.f24194b ? "s" : "";
        String str2 = this.f24193a;
        return new StringBuilder(String.valueOf(str).length() + 7 + String.valueOf(str2).length()).append(UriUtil.HTTP_SCHEME).append(str).append("://").append(str2).toString();
    }
}
