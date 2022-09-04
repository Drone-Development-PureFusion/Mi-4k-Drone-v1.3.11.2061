package com.google.android.gms.ads.internal.formats;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.internal.AbstractC7813uu;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.p232c.AbstractC4170e;
import com.google.android.gms.p232c.BinderC4173f;
@aaa
/* renamed from: com.google.android.gms.ads.internal.formats.c */
/* loaded from: classes.dex */
public class BinderC3597c extends AbstractC7813uu.AbstractBinderC7814a {

    /* renamed from: a */
    private final Drawable f14094a;

    /* renamed from: b */
    private final Uri f14095b;

    /* renamed from: c */
    private final double f14096c;

    public BinderC3597c(Drawable drawable, Uri uri, double d) {
        this.f14094a = drawable;
        this.f14095b = uri;
        this.f14096c = d;
    }

    @Override // com.google.android.gms.internal.AbstractC7813uu
    /* renamed from: a */
    public AbstractC4170e mo13407a() {
        return BinderC4173f.m25293a(this.f14094a);
    }

    @Override // com.google.android.gms.internal.AbstractC7813uu
    /* renamed from: b */
    public Uri mo13406b() {
        return this.f14095b;
    }

    @Override // com.google.android.gms.internal.AbstractC7813uu
    /* renamed from: c */
    public double mo13405c() {
        return this.f14096c;
    }
}
