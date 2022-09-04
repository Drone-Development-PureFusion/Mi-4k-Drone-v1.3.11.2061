package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.cast.C4201a;
import com.google.android.gms.cast.C4225b;
import com.google.android.gms.cast.framework.AbstractC4279j;
import com.google.android.gms.cast.framework.AbstractC4284m;
import com.google.android.gms.cast.framework.C4253d;
import com.google.android.gms.cast.framework.CastOptions;
/* loaded from: classes2.dex */
public class afd extends AbstractC4284m {

    /* renamed from: a */
    private final CastOptions f21439a;

    /* renamed from: b */
    private final afm f21440b;

    public afd(Context context, CastOptions castOptions, afm afmVar) {
        super(context, m17806a(castOptions));
        this.f21439a = castOptions;
        this.f21440b = afmVar;
    }

    /* renamed from: a */
    private static String m17806a(CastOptions castOptions) {
        return castOptions.m24911c().isEmpty() ? C4225b.m24921b(castOptions.m24912b()) : C4225b.m24924a(castOptions.m24912b(), castOptions.m24911c());
    }

    @Override // com.google.android.gms.cast.framework.AbstractC4284m
    /* renamed from: a */
    public AbstractC4279j mo17805a(String str) {
        return new C4253d(a(), b(), str, this.f21439a, C4201a.f16032l, new afe(), new afq(a(), this.f21439a, this.f21440b));
    }

    @Override // com.google.android.gms.cast.framework.AbstractC4284m
    /* renamed from: c */
    public boolean mo17804c() {
        return this.f21439a.m24908f();
    }
}
