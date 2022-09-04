package com.google.android.gms.ads;

import android.content.Context;
import android.support.annotation.RequiresPermission;
import android.util.AttributeSet;
import com.google.android.gms.ads.purchase.AbstractC3819b;
import com.google.android.gms.ads.purchase.AbstractC3821d;
import com.google.android.gms.internal.aaa;
@aaa
/* loaded from: classes.dex */
public final class NativeExpressAdView extends BaseAdView {
    public NativeExpressAdView(Context context) {
        super(context, 2);
    }

    public NativeExpressAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2);
    }

    public NativeExpressAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 2);
    }

    @Override // com.google.android.gms.ads.BaseAdView
    @RequiresPermission("android.permission.INTERNET")
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo27879a(C3443c c3443c) {
        super.mo27879a(c3443c);
    }

    @Override // com.google.android.gms.ads.BaseAdView
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo27878a(AbstractC3821d abstractC3821d, String str) {
        super.mo27878a(abstractC3821d, str);
    }

    @Override // com.google.android.gms.ads.BaseAdView
    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo27880a() {
        return super.mo27880a();
    }

    @Override // com.google.android.gms.ads.BaseAdView
    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo27877b() {
        super.mo27877b();
    }

    @Override // com.google.android.gms.ads.BaseAdView
    /* renamed from: c */
    public /* bridge */ /* synthetic */ void mo27876c() {
        super.mo27876c();
    }

    @Override // com.google.android.gms.ads.BaseAdView
    /* renamed from: d */
    public /* bridge */ /* synthetic */ void mo27875d() {
        super.mo27875d();
    }

    @Override // com.google.android.gms.ads.BaseAdView
    public /* bridge */ /* synthetic */ AbstractC3432a getAdListener() {
        return super.getAdListener();
    }

    @Override // com.google.android.gms.ads.BaseAdView
    public /* bridge */ /* synthetic */ C3446d getAdSize() {
        return super.getAdSize();
    }

    @Override // com.google.android.gms.ads.BaseAdView
    public /* bridge */ /* synthetic */ String getAdUnitId() {
        return super.getAdUnitId();
    }

    @Override // com.google.android.gms.ads.BaseAdView
    public /* bridge */ /* synthetic */ AbstractC3819b getInAppPurchaseListener() {
        return super.getInAppPurchaseListener();
    }

    @Override // com.google.android.gms.ads.BaseAdView
    public /* bridge */ /* synthetic */ String getMediationAdapterClassName() {
        return super.getMediationAdapterClassName();
    }

    public C3471h getVideoController() {
        return this.f13704a.m27478n();
    }

    public C3473i getVideoOptions() {
        return this.f13704a.m27476p();
    }

    @Override // com.google.android.gms.ads.BaseAdView
    public /* bridge */ /* synthetic */ void setAdListener(AbstractC3432a abstractC3432a) {
        super.setAdListener(abstractC3432a);
    }

    @Override // com.google.android.gms.ads.BaseAdView
    public /* bridge */ /* synthetic */ void setAdSize(C3446d c3446d) {
        super.setAdSize(c3446d);
    }

    @Override // com.google.android.gms.ads.BaseAdView
    public /* bridge */ /* synthetic */ void setAdUnitId(String str) {
        super.setAdUnitId(str);
    }

    @Override // com.google.android.gms.ads.BaseAdView
    public /* bridge */ /* synthetic */ void setInAppPurchaseListener(AbstractC3819b abstractC3819b) {
        super.setInAppPurchaseListener(abstractC3819b);
    }

    public void setVideoOptions(C3473i c3473i) {
        this.f13704a.m27501a(c3473i);
    }
}
