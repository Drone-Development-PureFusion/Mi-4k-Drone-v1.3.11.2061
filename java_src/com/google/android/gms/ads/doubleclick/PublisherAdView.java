package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import android.support.annotation.RequiresPermission;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AbstractC3432a;
import com.google.android.gms.ads.C3446d;
import com.google.android.gms.ads.C3454e;
import com.google.android.gms.ads.internal.client.C3561f;
import com.google.android.gms.ads.internal.util.client.C3784b;
/* loaded from: classes2.dex */
public final class PublisherAdView extends ViewGroup {

    /* renamed from: a */
    private final C3561f f13749a;

    public PublisherAdView(Context context) {
        super(context);
        this.f13749a = new C3561f(this);
    }

    public PublisherAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13749a = new C3561f(this, attributeSet, true);
    }

    public PublisherAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13749a = new C3561f(this, attributeSet, true);
    }

    /* renamed from: a */
    public void m27810a() {
        this.f13749a.m27508a();
    }

    @RequiresPermission("android.permission.INTERNET")
    /* renamed from: a */
    public void m27809a(C3450d c3450d) {
        this.f13749a.m27498a(c3450d.m27789j());
    }

    /* renamed from: b */
    public void m27808b() {
        this.f13749a.m27483i();
    }

    /* renamed from: c */
    public void m27807c() {
        this.f13749a.m27482j();
    }

    /* renamed from: d */
    public void m27806d() {
        this.f13749a.m27481k();
    }

    /* renamed from: e */
    public boolean m27805e() {
        return this.f13749a.m27479m();
    }

    public AbstractC3432a getAdListener() {
        return this.f13749a.m27491b();
    }

    public C3446d getAdSize() {
        return this.f13749a.m27489c();
    }

    public C3446d[] getAdSizes() {
        return this.f13749a.m27488d();
    }

    public String getAdUnitId() {
        return this.f13749a.m27487e();
    }

    public AbstractC3447a getAppEventListener() {
        return this.f13749a.m27486f();
    }

    public String getMediationAdapterClassName() {
        return this.f13749a.m27480l();
    }

    public AbstractC3449c getOnCustomRenderedAdLoadedListener() {
        return this.f13749a.m27484h();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i5 = ((i3 - i) - measuredWidth) / 2;
        int i6 = ((i4 - i2) - measuredHeight) / 2;
        childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        C3446d c3446d;
        int i3;
        int i4 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                c3446d = getAdSize();
            } catch (NullPointerException e) {
                C3784b.m26843b("Unable to retrieve ad size.", e);
                c3446d = null;
            }
            if (c3446d != null) {
                Context context = getContext();
                i3 = c3446d.m27814b(context);
                i4 = c3446d.m27816a(context);
            } else {
                i3 = 0;
            }
        } else {
            measureChild(childAt, i, i2);
            i3 = childAt.getMeasuredWidth();
            i4 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(i3, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(i4, getSuggestedMinimumHeight()), i2));
    }

    public void setAdListener(AbstractC3432a abstractC3432a) {
        this.f13749a.m27505a(abstractC3432a);
    }

    public void setAdSizes(C3446d... c3446dArr) {
        if (c3446dArr == null || c3446dArr.length < 1) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.f13749a.m27490b(c3446dArr);
    }

    public void setAdUnitId(String str) {
        this.f13749a.m27494a(str);
    }

    public void setAppEventListener(AbstractC3447a abstractC3447a) {
        this.f13749a.m27504a(abstractC3447a);
    }

    public void setCorrelator(C3454e c3454e) {
        this.f13749a.m27502a(c3454e);
    }

    public void setManualImpressionsEnabled(boolean z) {
        this.f13749a.m27493a(z);
    }

    public void setOnCustomRenderedAdLoadedListener(AbstractC3449c abstractC3449c) {
        this.f13749a.m27503a(abstractC3449c);
    }
}
