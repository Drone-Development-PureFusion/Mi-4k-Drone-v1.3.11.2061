package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.ads.internal.util.client.C3785c;
@aaa
/* loaded from: classes.dex */
public final class acg extends abq {

    /* renamed from: a */
    private final C3785c f21124a;

    /* renamed from: b */
    private final String f21125b;

    public acg(Context context, String str, String str2) {
        this(str2, C3779u.m26890e().m18372a(context, str));
    }

    public acg(String str, String str2) {
        this.f21124a = new C3785c(str2);
        this.f21125b = str;
    }

    @Override // com.google.android.gms.internal.abq
    /* renamed from: a */
    public void mo12782a() {
        this.f21124a.mo18306a(this.f21125b);
    }

    @Override // com.google.android.gms.internal.abq
    /* renamed from: b */
    public void mo12779b() {
    }
}
