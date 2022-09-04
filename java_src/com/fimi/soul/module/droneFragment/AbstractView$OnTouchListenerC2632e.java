package com.fimi.soul.module.droneFragment;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.maps.model.C8615g;
/* renamed from: com.fimi.soul.module.droneFragment.e */
/* loaded from: classes.dex */
public abstract class AbstractView$OnTouchListenerC2632e implements View.OnTouchListener {

    /* renamed from: a */
    private final View f8823a;

    /* renamed from: b */
    private final Drawable f8824b;

    /* renamed from: c */
    private final Drawable f8825c;

    /* renamed from: e */
    private C8615g f8827e;

    /* renamed from: d */
    private final Handler f8826d = new Handler();

    /* renamed from: f */
    private boolean f8828f = false;

    /* renamed from: g */
    private final Runnable f8829g = new Runnable() { // from class: com.fimi.soul.module.droneFragment.e.1
        @Override // java.lang.Runnable
        public void run() {
            if (AbstractView$OnTouchListenerC2632e.this.m30940b()) {
                AbstractView$OnTouchListenerC2632e.this.mo30589a(AbstractView$OnTouchListenerC2632e.this.f8823a, AbstractView$OnTouchListenerC2632e.this.f8827e);
            }
        }
    };

    public AbstractView$OnTouchListenerC2632e(View view, Drawable drawable, Drawable drawable2) {
        this.f8823a = view;
        this.f8824b = drawable;
        this.f8825c = drawable2;
    }

    /* renamed from: a */
    private void m30943a() {
        if (!this.f8828f) {
            this.f8828f = true;
            this.f8826d.removeCallbacks(this.f8829g);
            this.f8823a.setBackgroundDrawable(this.f8825c);
            if (this.f8827e == null) {
                return;
            }
            this.f8827e.m11013h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public boolean m30940b() {
        if (this.f8828f) {
            this.f8828f = false;
            this.f8826d.removeCallbacks(this.f8829g);
            this.f8823a.setBackgroundDrawable(this.f8824b);
            if (this.f8827e != null) {
                this.f8827e.m11013h();
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    protected abstract void mo30589a(View view, C8615g c8615g);

    /* renamed from: a */
    public void m30941a(C8615g c8615g) {
        this.f8827e = c8615g;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (0.0f > motionEvent.getX() || motionEvent.getX() > this.f8823a.getWidth() || 0.0f > motionEvent.getY() || motionEvent.getY() > this.f8823a.getHeight()) {
            m30940b();
            return false;
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                m30943a();
                return false;
            case 1:
                this.f8826d.postDelayed(this.f8829g, 150L);
                return false;
            case 2:
            default:
                return false;
            case 3:
                m30940b();
                return false;
        }
    }
}
