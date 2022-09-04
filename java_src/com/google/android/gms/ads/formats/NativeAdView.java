package com.google.android.gms.ads.formats;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.C3514ac;
import com.google.android.gms.ads.internal.util.client.C3784b;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.AbstractC7817uw;
import com.google.android.gms.p232c.AbstractC4170e;
import com.google.android.gms.p232c.BinderC4173f;
/* loaded from: classes2.dex */
public abstract class NativeAdView extends FrameLayout {

    /* renamed from: a */
    private final FrameLayout f13763a;

    /* renamed from: b */
    private final AbstractC7817uw f13764b = m27735b();

    public NativeAdView(Context context) {
        super(context);
        this.f13763a = m27734b(context);
    }

    public NativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13763a = m27734b(context);
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13763a = m27734b(context);
    }

    @TargetApi(21)
    public NativeAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f13763a = m27734b(context);
    }

    /* renamed from: b */
    private FrameLayout m27734b(Context context) {
        FrameLayout m27738a = m27738a(context);
        m27738a.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(m27738a);
        return m27738a;
    }

    /* renamed from: b */
    private AbstractC7817uw m27735b() {
        C4588d.m23626a(this.f13763a, "createDelegate must be called after mOverlayFrame has been created");
        return C3514ac.m27584b().m27627a(this.f13763a.getContext(), this, this.f13763a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public View m27737a(String str) {
        try {
            AbstractC4170e mo13398a = this.f13764b.mo13398a(str);
            if (mo13398a != null) {
                return (View) BinderC4173f.m25294a(mo13398a);
            }
        } catch (RemoteException e) {
            C3784b.m26843b("Unable to call getAssetView on delegate", e);
        }
        return null;
    }

    /* renamed from: a */
    FrameLayout m27738a(Context context) {
        return new FrameLayout(context);
    }

    /* renamed from: a */
    public void m27739a() {
        try {
            this.f13764b.mo13400a();
        } catch (RemoteException e) {
            C3784b.m26843b("Unable to destroy native ad view", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m27736a(String str, View view) {
        try {
            this.f13764b.mo13397a(str, BinderC4173f.m25293a(view));
        } catch (RemoteException e) {
            C3784b.m26843b("Unable to call setAssetView on delegate", e);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.f13763a);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void bringChildToFront(View view) {
        super.bringChildToFront(view);
        if (this.f13763a != view) {
            super.bringChildToFront(this.f13763a);
        }
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        super.removeAllViews();
        super.addView(this.f13763a);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f13763a == view) {
            return;
        }
        super.removeView(view);
    }

    public void setNativeAd(AbstractC3456a abstractC3456a) {
        try {
            this.f13764b.mo13399a((AbstractC4170e) abstractC3456a.mo13355a());
        } catch (RemoteException e) {
            C3784b.m26843b("Unable to call setNativeAd on delegate", e);
        }
    }
}
