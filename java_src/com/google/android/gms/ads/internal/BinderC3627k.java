package com.google.android.gms.ads.internal;

import android.content.Context;
import android.support.p001v4.util.SimpleArrayMap;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.AbstractC3520ag;
import com.google.android.gms.ads.internal.client.AbstractC3523ah;
import com.google.android.gms.ads.internal.client.AbstractC3526ai;
import com.google.android.gms.ads.internal.client.AbstractC3544ao;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.AbstractC7839vf;
import com.google.android.gms.internal.AbstractC7842vg;
import com.google.android.gms.internal.AbstractC7845vh;
import com.google.android.gms.internal.AbstractC7848vi;
import com.google.android.gms.internal.AbstractC8005xq;
import com.google.android.gms.internal.aaa;
@aaa
/* renamed from: com.google.android.gms.ads.internal.k */
/* loaded from: classes.dex */
public class BinderC3627k extends AbstractC3526ai.AbstractBinderC3527a {

    /* renamed from: a */
    private AbstractC3520ag f14205a;

    /* renamed from: b */
    private AbstractC7839vf f14206b;

    /* renamed from: c */
    private AbstractC7842vg f14207c;

    /* renamed from: f */
    private NativeAdOptionsParcel f14210f;

    /* renamed from: g */
    private AbstractC3544ao f14211g;

    /* renamed from: h */
    private final Context f14212h;

    /* renamed from: i */
    private final AbstractC8005xq f14213i;

    /* renamed from: j */
    private final String f14214j;

    /* renamed from: k */
    private final VersionInfoParcel f14215k;

    /* renamed from: l */
    private final C3588d f14216l;

    /* renamed from: e */
    private SimpleArrayMap<String, AbstractC7848vi> f14209e = new SimpleArrayMap<>();

    /* renamed from: d */
    private SimpleArrayMap<String, AbstractC7845vh> f14208d = new SimpleArrayMap<>();

    public BinderC3627k(Context context, String str, AbstractC8005xq abstractC8005xq, VersionInfoParcel versionInfoParcel, C3588d c3588d) {
        this.f14212h = context;
        this.f14214j = str;
        this.f14213i = abstractC8005xq;
        this.f14215k = versionInfoParcel;
        this.f14216l = c3588d;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3526ai
    /* renamed from: a */
    public AbstractC3523ah mo27313a() {
        return new BinderC3625j(this.f14212h, this.f14214j, this.f14213i, this.f14215k, this.f14205a, this.f14206b, this.f14207c, this.f14209e, this.f14208d, this.f14210f, this.f14211g, this.f14216l);
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3526ai
    /* renamed from: a */
    public void mo27312a(AbstractC3520ag abstractC3520ag) {
        this.f14205a = abstractC3520ag;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3526ai
    /* renamed from: a */
    public void mo27311a(AbstractC3544ao abstractC3544ao) {
        this.f14211g = abstractC3544ao;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3526ai
    /* renamed from: a */
    public void mo27310a(NativeAdOptionsParcel nativeAdOptionsParcel) {
        this.f14210f = nativeAdOptionsParcel;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3526ai
    /* renamed from: a */
    public void mo27309a(AbstractC7839vf abstractC7839vf) {
        this.f14206b = abstractC7839vf;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3526ai
    /* renamed from: a */
    public void mo27308a(AbstractC7842vg abstractC7842vg) {
        this.f14207c = abstractC7842vg;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3526ai
    /* renamed from: a */
    public void mo27307a(String str, AbstractC7848vi abstractC7848vi, AbstractC7845vh abstractC7845vh) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Custom template ID for native custom template ad is empty. Please provide a valid template id.");
        }
        this.f14209e.put(str, abstractC7848vi);
        this.f14208d.put(str, abstractC7845vh);
    }
}
