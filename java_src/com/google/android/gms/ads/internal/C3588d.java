package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.overlay.AbstractC3662j;
import com.google.android.gms.ads.internal.overlay.AbstractC3667m;
import com.google.android.gms.ads.internal.overlay.C3668n;
import com.google.android.gms.ads.internal.overlay.C3674t;
import com.google.android.gms.ads.internal.safebrowsing.AbstractC3772d;
import com.google.android.gms.ads.internal.safebrowsing.C3769a;
import com.google.android.gms.internal.AbstractC7908wk;
import com.google.android.gms.internal.C7858vq;
import com.google.android.gms.internal.aaa;
@aaa
/* renamed from: com.google.android.gms.ads.internal.d */
/* loaded from: classes.dex */
public class C3588d {

    /* renamed from: a */
    public final AbstractC7908wk f14059a;

    /* renamed from: b */
    public final AbstractC3662j f14060b;

    /* renamed from: c */
    public final AbstractC3667m f14061c;

    /* renamed from: d */
    public final AbstractC3772d f14062d;

    public C3588d(AbstractC7908wk abstractC7908wk, AbstractC3662j abstractC3662j, AbstractC3667m abstractC3667m, AbstractC3772d abstractC3772d) {
        this.f14059a = abstractC7908wk;
        this.f14060b = abstractC3662j;
        this.f14061c = abstractC3667m;
        this.f14062d = abstractC3772d;
    }

    /* renamed from: a */
    public static C3588d m27405a() {
        return new C3588d(new C7858vq(), new C3668n(), new C3674t(), new C3769a());
    }
}
