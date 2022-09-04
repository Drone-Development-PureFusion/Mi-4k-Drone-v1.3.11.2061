package com.fimi.soul.view.photodraweeview;

import android.view.GestureDetector;
import android.view.View;
/* renamed from: com.fimi.soul.view.photodraweeview.c */
/* loaded from: classes2.dex */
public interface AbstractC3311c {

    /* renamed from: a */
    public static final float f13149a = 3.0f;

    /* renamed from: b */
    public static final float f13150b = 1.75f;

    /* renamed from: c */
    public static final float f13151c = 1.0f;

    /* renamed from: d */
    public static final long f13152d = 200;

    /* renamed from: a */
    void mo28350a(float f, float f2, float f3, boolean z);

    /* renamed from: a */
    void mo28349a(float f, boolean z);

    /* renamed from: a */
    void mo28348a(int i, int i2);

    float getMaximumScale();

    float getMediumScale();

    float getMinimumScale();

    AbstractC3312d getOnPhotoTapListener();

    AbstractC3315g getOnViewTapListener();

    float getScale();

    void setAllowParentInterceptOnEdge(boolean z);

    void setMaximumScale(float f);

    void setMediumScale(float f);

    void setMinimumScale(float f);

    void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener);

    void setOnLongClickListener(View.OnLongClickListener onLongClickListener);

    void setOnPhotoTapListener(AbstractC3312d abstractC3312d);

    void setOnScaleChangeListener(AbstractC3313e abstractC3313e);

    void setOnViewTapListener(AbstractC3315g abstractC3315g);

    void setScale(float f);

    void setZoomTransitionDuration(long j);
}
