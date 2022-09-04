package com.fimi.soul.view.photodraweeview;

import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.view.DraweeView;
/* renamed from: com.fimi.soul.view.photodraweeview.b */
/* loaded from: classes2.dex */
public class GestureDetector$OnDoubleTapListenerC3310b implements GestureDetector.OnDoubleTapListener {

    /* renamed from: a */
    private View$OnTouchListenerC3306a f13148a;

    public GestureDetector$OnDoubleTapListenerC3310b(View$OnTouchListenerC3306a view$OnTouchListenerC3306a) {
        m28351a(view$OnTouchListenerC3306a);
    }

    /* renamed from: a */
    public void m28351a(View$OnTouchListenerC3306a view$OnTouchListenerC3306a) {
        this.f13148a = view$OnTouchListenerC3306a;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        if (this.f13148a == null) {
            return false;
        }
        try {
            float scale = this.f13148a.getScale();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (scale < this.f13148a.getMediumScale()) {
                this.f13148a.mo28350a(this.f13148a.getMediumScale(), x, y, true);
            } else if (scale < this.f13148a.getMediumScale() || scale >= this.f13148a.getMaximumScale()) {
                this.f13148a.mo28350a(this.f13148a.getMinimumScale(), x, y, true);
            } else {
                this.f13148a.mo28350a(this.f13148a.getMaximumScale(), x, y, true);
            }
            return true;
        } catch (Exception e) {
            return true;
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        DraweeView<GenericDraweeHierarchy> m28375a;
        RectF m28366c;
        if (this.f13148a == null || (m28375a = this.f13148a.m28375a()) == null) {
            return false;
        }
        if (this.f13148a.getOnPhotoTapListener() != null && (m28366c = this.f13148a.m28366c()) != null) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (m28366c.contains(x, y)) {
                this.f13148a.getOnPhotoTapListener().mo28347a(m28375a, (x - m28366c.left) / m28366c.width(), (y - m28366c.top) / m28366c.height());
                return true;
            }
        }
        if (this.f13148a.getOnViewTapListener() == null) {
            return false;
        }
        this.f13148a.getOnViewTapListener().m28341a(m28375a, motionEvent.getX(), motionEvent.getY());
        return true;
    }
}
