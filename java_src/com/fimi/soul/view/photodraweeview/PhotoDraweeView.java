package com.fimi.soul.view.photodraweeview;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;
/* loaded from: classes2.dex */
public class PhotoDraweeView extends SimpleDraweeView implements AbstractC3311c {

    /* renamed from: e */
    private View$OnTouchListenerC3306a f13111e;

    public PhotoDraweeView(Context context) {
        super(context);
        m28376a();
    }

    public PhotoDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m28376a();
    }

    public PhotoDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m28376a();
    }

    public PhotoDraweeView(Context context, GenericDraweeHierarchy genericDraweeHierarchy) {
        super(context, genericDraweeHierarchy);
        m28376a();
    }

    /* renamed from: a */
    protected void m28376a() {
        if (this.f13111e == null || this.f13111e.m28375a() == null) {
            this.f13111e = new View$OnTouchListenerC3306a(this);
        }
    }

    @Override // com.fimi.soul.view.photodraweeview.AbstractC3311c
    /* renamed from: a */
    public void mo28350a(float f, float f2, float f3, boolean z) {
        this.f13111e.mo28350a(f, f2, f3, z);
    }

    @Override // com.fimi.soul.view.photodraweeview.AbstractC3311c
    /* renamed from: a */
    public void mo28349a(float f, boolean z) {
        this.f13111e.mo28349a(f, z);
    }

    @Override // com.fimi.soul.view.photodraweeview.AbstractC3311c
    /* renamed from: a */
    public void mo28348a(int i, int i2) {
        this.f13111e.mo28348a(i, i2);
    }

    @Override // com.fimi.soul.view.photodraweeview.AbstractC3311c
    public float getMaximumScale() {
        return this.f13111e.getMaximumScale();
    }

    @Override // com.fimi.soul.view.photodraweeview.AbstractC3311c
    public float getMediumScale() {
        return this.f13111e.getMediumScale();
    }

    @Override // com.fimi.soul.view.photodraweeview.AbstractC3311c
    public float getMinimumScale() {
        return this.f13111e.getMinimumScale();
    }

    @Override // com.fimi.soul.view.photodraweeview.AbstractC3311c
    public AbstractC3312d getOnPhotoTapListener() {
        return this.f13111e.getOnPhotoTapListener();
    }

    @Override // com.fimi.soul.view.photodraweeview.AbstractC3311c
    public AbstractC3315g getOnViewTapListener() {
        return this.f13111e.getOnViewTapListener();
    }

    @Override // com.fimi.soul.view.photodraweeview.AbstractC3311c
    public float getScale() {
        return this.f13111e.getScale();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.drawee.view.DraweeView, android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        m28376a();
        super.onAttachedToWindow();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.drawee.view.DraweeView, android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        this.f13111e.m28361g();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(@NonNull Canvas canvas) {
        int save = canvas.save();
        canvas.concat(this.f13111e.m28369b());
        super.onDraw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // com.facebook.drawee.view.DraweeView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.fimi.soul.view.photodraweeview.AbstractC3311c
    public void setAllowParentInterceptOnEdge(boolean z) {
        this.f13111e.setAllowParentInterceptOnEdge(z);
    }

    @Override // com.fimi.soul.view.photodraweeview.AbstractC3311c
    public void setMaximumScale(float f) {
        this.f13111e.setMaximumScale(f);
    }

    @Override // com.fimi.soul.view.photodraweeview.AbstractC3311c
    public void setMediumScale(float f) {
        this.f13111e.setMediumScale(f);
    }

    @Override // com.fimi.soul.view.photodraweeview.AbstractC3311c
    public void setMinimumScale(float f) {
        this.f13111e.setMinimumScale(f);
    }

    @Override // com.fimi.soul.view.photodraweeview.AbstractC3311c
    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f13111e.setOnDoubleTapListener(onDoubleTapListener);
    }

    @Override // android.view.View, com.fimi.soul.view.photodraweeview.AbstractC3311c
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f13111e.setOnLongClickListener(onLongClickListener);
    }

    @Override // com.fimi.soul.view.photodraweeview.AbstractC3311c
    public void setOnPhotoTapListener(AbstractC3312d abstractC3312d) {
        this.f13111e.setOnPhotoTapListener(abstractC3312d);
    }

    @Override // com.fimi.soul.view.photodraweeview.AbstractC3311c
    public void setOnScaleChangeListener(AbstractC3313e abstractC3313e) {
        this.f13111e.setOnScaleChangeListener(abstractC3313e);
    }

    @Override // com.fimi.soul.view.photodraweeview.AbstractC3311c
    public void setOnViewTapListener(AbstractC3315g abstractC3315g) {
        this.f13111e.setOnViewTapListener(abstractC3315g);
    }

    @Override // com.fimi.soul.view.photodraweeview.AbstractC3311c
    public void setScale(float f) {
        this.f13111e.setScale(f);
    }

    @Override // com.fimi.soul.view.photodraweeview.AbstractC3311c
    public void setZoomTransitionDuration(long j) {
        this.f13111e.setZoomTransitionDuration(j);
    }
}
