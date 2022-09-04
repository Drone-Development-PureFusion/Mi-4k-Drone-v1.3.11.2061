package com.google.android.gms.ads;

import android.content.Context;
import android.support.annotation.RequiresPermission;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.AbstractC3501a;
import com.google.android.gms.ads.internal.client.C3561f;
import com.google.android.gms.ads.internal.util.client.C3784b;
import com.google.android.gms.ads.purchase.AbstractC3819b;
import com.google.android.gms.ads.purchase.AbstractC3821d;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class BaseAdView extends ViewGroup {

    /* renamed from: a */
    protected final C3561f f13704a;

    public BaseAdView(Context context, int i) {
        super(context);
        this.f13704a = new C3561f(this, m27881a(i));
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f13704a = new C3561f(this, attributeSet, false, m27881a(i));
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.f13704a = new C3561f(this, attributeSet, false, m27881a(i2));
    }

    /* renamed from: a */
    private static boolean m27881a(int i) {
        return i == 2;
    }

    @RequiresPermission("android.permission.INTERNET")
    /* renamed from: a */
    public void mo27879a(C3443c c3443c) {
        this.f13704a.m27498a(c3443c.m27832f());
    }

    /* renamed from: a */
    public void mo27878a(AbstractC3821d abstractC3821d, String str) {
        this.f13704a.m27495a(abstractC3821d, str);
    }

    /* renamed from: a */
    public boolean mo27880a() {
        return this.f13704a.m27479m();
    }

    /* renamed from: b */
    public void mo27877b() {
        this.f13704a.m27481k();
    }

    /* renamed from: c */
    public void mo27876c() {
        this.f13704a.m27483i();
    }

    /* renamed from: d */
    public void mo27875d() {
        this.f13704a.m27508a();
    }

    public AbstractC3432a getAdListener() {
        return this.f13704a.m27491b();
    }

    public C3446d getAdSize() {
        return this.f13704a.m27489c();
    }

    public String getAdUnitId() {
        return this.f13704a.m27487e();
    }

    public AbstractC3819b getInAppPurchaseListener() {
        return this.f13704a.m27485g();
    }

    public String getMediationAdapterClassName() {
        return this.f13704a.m27480l();
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
        this.f13704a.m27505a(abstractC3432a);
        if (abstractC3432a != null && (abstractC3432a instanceof AbstractC3501a)) {
            this.f13704a.m27499a((AbstractC3501a) abstractC3432a);
        } else if (abstractC3432a != null) {
        } else {
            this.f13704a.m27499a((AbstractC3501a) null);
        }
    }

    public void setAdSize(C3446d c3446d) {
        this.f13704a.m27492a(c3446d);
    }

    public void setAdUnitId(String str) {
        this.f13704a.m27494a(str);
    }

    public void setInAppPurchaseListener(AbstractC3819b abstractC3819b) {
        this.f13704a.m27496a(abstractC3819b);
    }
}
