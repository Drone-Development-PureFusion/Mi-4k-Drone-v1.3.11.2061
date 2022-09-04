package com.fimi.soul.view.photodraweeview;

import android.content.Context;
import android.support.p001v4.view.MotionEventCompat;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
/* renamed from: com.fimi.soul.view.photodraweeview.h */
/* loaded from: classes2.dex */
public class ScaleGestureDetector$OnScaleGestureListenerC3316h implements ScaleGestureDetector.OnScaleGestureListener {

    /* renamed from: c */
    private static final int f13153c = -1;

    /* renamed from: a */
    float f13154a;

    /* renamed from: b */
    float f13155b;

    /* renamed from: d */
    private final float f13156d;

    /* renamed from: e */
    private final float f13157e;

    /* renamed from: f */
    private final ScaleGestureDetector f13158f;

    /* renamed from: g */
    private final AbstractC3314f f13159g;

    /* renamed from: h */
    private VelocityTracker f13160h;

    /* renamed from: i */
    private boolean f13161i;

    /* renamed from: j */
    private int f13162j = -1;

    /* renamed from: k */
    private int f13163k = 0;

    public ScaleGestureDetector$OnScaleGestureListenerC3316h(Context context, AbstractC3314f abstractC3314f) {
        this.f13158f = new ScaleGestureDetector(context, this);
        this.f13159g = abstractC3314f;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f13157e = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f13156d = viewConfiguration.getScaledTouchSlop();
    }

    /* renamed from: a */
    private void m28339a(int i, MotionEvent motionEvent) {
        int i2 = 0;
        switch (i) {
            case 0:
                this.f13162j = motionEvent.getPointerId(0);
                break;
            case 1:
            case 3:
                this.f13162j = -1;
                break;
            case 6:
                int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
                if (MotionEventCompat.getPointerId(motionEvent, actionIndex) == this.f13162j) {
                    int i3 = actionIndex == 0 ? 1 : 0;
                    this.f13162j = MotionEventCompat.getPointerId(motionEvent, i3);
                    this.f13154a = MotionEventCompat.getX(motionEvent, i3);
                    this.f13155b = MotionEventCompat.getY(motionEvent, i3);
                    break;
                }
                break;
        }
        if (this.f13162j != -1) {
            i2 = this.f13162j;
        }
        this.f13163k = MotionEventCompat.findPointerIndex(motionEvent, i2);
    }

    /* renamed from: b */
    private float m28335b(MotionEvent motionEvent) {
        try {
            return MotionEventCompat.getX(motionEvent, this.f13163k);
        } catch (Exception e) {
            return motionEvent.getX();
        }
    }

    /* renamed from: b */
    private void m28336b(int i, MotionEvent motionEvent) {
        boolean z = false;
        switch (i) {
            case 0:
                this.f13160h = VelocityTracker.obtain();
                if (this.f13160h != null) {
                    this.f13160h.addMovement(motionEvent);
                }
                this.f13154a = m28335b(motionEvent);
                this.f13155b = m28334c(motionEvent);
                this.f13161i = false;
                return;
            case 1:
                if (this.f13161i && this.f13160h != null) {
                    this.f13154a = m28335b(motionEvent);
                    this.f13155b = m28334c(motionEvent);
                    this.f13160h.addMovement(motionEvent);
                    this.f13160h.computeCurrentVelocity(1000);
                    float xVelocity = this.f13160h.getXVelocity();
                    float yVelocity = this.f13160h.getYVelocity();
                    if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f13157e) {
                        this.f13159g.mo28343a(this.f13154a, this.f13155b, -xVelocity, -yVelocity);
                    }
                }
                if (this.f13160h == null) {
                    return;
                }
                this.f13160h.recycle();
                this.f13160h = null;
                return;
            case 2:
                float m28335b = m28335b(motionEvent);
                float m28334c = m28334c(motionEvent);
                float f = m28335b - this.f13154a;
                float f2 = m28334c - this.f13155b;
                if (!this.f13161i) {
                    if (Math.sqrt((f * f) + (f2 * f2)) >= this.f13156d) {
                        z = true;
                    }
                    this.f13161i = z;
                }
                if (!this.f13161i) {
                    return;
                }
                this.f13159g.mo28345a(f, f2);
                this.f13154a = m28335b;
                this.f13155b = m28334c;
                if (this.f13160h == null) {
                    return;
                }
                this.f13160h.addMovement(motionEvent);
                return;
            case 3:
                if (this.f13160h == null) {
                    return;
                }
                this.f13160h.recycle();
                this.f13160h = null;
                return;
            default:
                return;
        }
    }

    /* renamed from: c */
    private float m28334c(MotionEvent motionEvent) {
        try {
            return MotionEventCompat.getY(motionEvent, this.f13163k);
        } catch (Exception e) {
            return motionEvent.getY();
        }
    }

    /* renamed from: a */
    public boolean m28340a() {
        return this.f13158f.isInProgress();
    }

    /* renamed from: a */
    public boolean m28338a(MotionEvent motionEvent) {
        this.f13158f.onTouchEvent(motionEvent);
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        m28339a(actionMasked, motionEvent);
        m28336b(actionMasked, motionEvent);
        return true;
    }

    /* renamed from: b */
    public boolean m28337b() {
        return this.f13161i;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
            return false;
        }
        this.f13159g.mo28344a(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.f13159g.mo28342f();
    }
}
