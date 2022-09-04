package com.google.android.gms.ads.search;

import android.content.Context;
import android.support.annotation.RequiresPermission;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AbstractC3432a;
import com.google.android.gms.ads.C3446d;
import com.google.android.gms.ads.internal.client.C3561f;
import com.google.android.gms.ads.internal.util.client.C3784b;
import com.google.android.gms.internal.aaa;
@aaa
/* loaded from: classes.dex */
public final class SearchAdView extends ViewGroup {

    /* renamed from: a */
    private final C3561f f14832a;

    public SearchAdView(Context context) {
        super(context);
        this.f14832a = new C3561f(this);
    }

    public SearchAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14832a = new C3561f(this, attributeSet, false);
    }

    public SearchAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f14832a = new C3561f(this, attributeSet, false);
    }

    /* renamed from: a */
    public void m26749a() {
        this.f14832a.m27508a();
    }

    @RequiresPermission("android.permission.INTERNET")
    /* renamed from: a */
    public void m26748a(C3822a c3822a) {
        if (!C3446d.f13745k.equals(getAdSize())) {
            throw new IllegalStateException("You must use AdSize.SEARCH for a DynamicHeightSearchAdRequest");
        }
        this.f14832a.m27498a(c3822a.m26741b());
    }

    @RequiresPermission("android.permission.INTERNET")
    /* renamed from: a */
    public void m26747a(C3825b c3825b) {
        this.f14832a.m27498a(c3825b.m26673p());
    }

    /* renamed from: b */
    public void m26746b() {
        this.f14832a.m27483i();
    }

    /* renamed from: c */
    public void m26745c() {
        this.f14832a.m27481k();
    }

    public AbstractC3432a getAdListener() {
        return this.f14832a.m27491b();
    }

    public C3446d getAdSize() {
        return this.f14832a.m27489c();
    }

    public String getAdUnitId() {
        return this.f14832a.m27487e();
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
        this.f14832a.m27505a(abstractC3432a);
    }

    public void setAdSize(C3446d c3446d) {
        this.f14832a.m27492a(c3446d);
    }

    public void setAdUnitId(String str) {
        this.f14832a.m27494a(str);
    }
}
