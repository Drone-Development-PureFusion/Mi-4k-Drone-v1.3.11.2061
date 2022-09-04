package com.fimi.soul.view.myhorizontalseebar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.fimi.overseas.soul.C1704R;
/* loaded from: classes2.dex */
public abstract class AbsSeekBar extends ProgressBar {

    /* renamed from: q */
    private static final int f13045q = 255;

    /* renamed from: a */
    float f13046a;

    /* renamed from: n */
    private Drawable f13048n;

    /* renamed from: o */
    private int f13049o;

    /* renamed from: r */
    private float f13051r;

    /* renamed from: s */
    private int f13052s;

    /* renamed from: t */
    private float f13053t;

    /* renamed from: u */
    private boolean f13054u;

    /* renamed from: b */
    boolean f13047b = true;

    /* renamed from: p */
    private int f13050p = 1;

    public AbsSeekBar(Context context) {
        super(context);
    }

    public AbsSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AbsSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1704R.styleable.SeekBar, i, 0);
        setThumb(obtainStyledAttributes.getDrawable(0));
        setThumbOffset(obtainStyledAttributes.getDimensionPixelOffset(1, getThumbOffset()));
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C1704R.styleable.Theme, 0, 0);
        this.f13051r = obtainStyledAttributes2.getFloat(0, 0.5f);
        obtainStyledAttributes2.recycle();
        this.f13052s = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    /* renamed from: a */
    private void m28428a(int i, int i2) {
        Drawable currentDrawable = getCurrentDrawable();
        Drawable drawable = this.f13048n;
        int intrinsicHeight = drawable == null ? 0 : drawable.getIntrinsicHeight();
        int min = Math.min(this.f13070f, (i2 - this.f13076l) - this.f13077m);
        int max = getMax();
        float progress = max > 0 ? getProgress() / max : 0.0f;
        if (intrinsicHeight > min) {
            if (drawable != null) {
                m28427a(i, drawable, progress, 0);
            }
            int i3 = (intrinsicHeight - min) / 2;
            if (currentDrawable == null) {
                return;
            }
            currentDrawable.setBounds(0, i3, (i - this.f13075k) - this.f13074j, ((i2 - this.f13077m) - i3) - this.f13076l);
            return;
        }
        if (currentDrawable != null) {
            currentDrawable.setBounds(0, 0, (i - this.f13075k) - this.f13074j, (i2 - this.f13077m) - this.f13076l);
        }
        int i4 = (min - intrinsicHeight) / 2;
        if (drawable == null) {
            return;
        }
        m28427a(i, drawable, progress, i4);
    }

    /* renamed from: a */
    private void m28427a(int i, Drawable drawable, float f, int i2) {
        int i3;
        int i4 = (i - this.f13074j) - this.f13075k;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int i5 = (int) (((i4 - intrinsicWidth) + (this.f13049o * 2)) * f);
        if (i2 == Integer.MIN_VALUE) {
            Rect bounds = drawable.getBounds();
            i2 = bounds.top;
            i3 = bounds.bottom;
        } else {
            i3 = i2 + intrinsicHeight;
        }
        drawable.setBounds(i5, i2, intrinsicWidth + i5, i3);
    }

    /* renamed from: a */
    private void m28426a(MotionEvent motionEvent) {
        float f;
        float f2 = 0.0f;
        int width = getWidth();
        int i = (width - this.f13074j) - this.f13075k;
        int x = (int) motionEvent.getX();
        if (x < this.f13074j) {
            f = 0.0f;
        } else if (x > width - this.f13075k) {
            f = 1.0f;
        } else {
            f = (x - this.f13074j) / i;
            f2 = this.f13046a;
        }
        a((int) (f2 + (f * getMax())), true);
    }

    /* renamed from: g */
    private void m28424g() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo28395a() {
        this.f13054u = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.fimi.soul.view.myhorizontalseebar.ProgressBar
    /* renamed from: a */
    public void mo28394a(float f, boolean z) {
        super.mo28394a(f, z);
        Drawable drawable = this.f13048n;
        if (drawable != null) {
            m28427a(getWidth(), drawable, f, Integer.MIN_VALUE);
            invalidate();
        }
    }

    @Override // com.fimi.soul.view.myhorizontalseebar.ProgressBar
    /* renamed from: a */
    public void mo28422a(int i) {
        super.mo28422a(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo28393b() {
        this.f13054u = false;
    }

    /* renamed from: c */
    void m28425c() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.view.myhorizontalseebar.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setAlpha(isEnabled() ? 255 : (int) (255.0f * this.f13051r));
        }
        if (this.f13048n == null || !this.f13048n.isStateful()) {
            return;
        }
        this.f13048n.setState(getDrawableState());
    }

    public int getKeyProgressIncrement() {
        return this.f13050p;
    }

    public Drawable getThumb() {
        return this.f13048n;
    }

    public int getThumbOffset() {
        return this.f13049o;
    }

    @Override // com.fimi.soul.view.myhorizontalseebar.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.f13048n != null) {
            this.f13048n.jumpToCurrentState();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.view.myhorizontalseebar.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f13048n != null) {
            canvas.save();
            canvas.translate(this.f13074j - this.f13049o, this.f13076l);
            this.f13048n.draw(canvas);
            canvas.restore();
        }
    }

    @Override // com.fimi.soul.view.myhorizontalseebar.ProgressBar, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(AbsSeekBar.class.getName());
    }

    @Override // com.fimi.soul.view.myhorizontalseebar.ProgressBar, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(AbsSeekBar.class.getName());
        if (isEnabled()) {
            int progress = getProgress();
            if (progress > 0) {
                accessibilityNodeInfo.addAction(8192);
            }
            if (progress >= getMax()) {
                return;
            }
            accessibilityNodeInfo.addAction(4096);
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (isEnabled()) {
            int progress = getProgress();
            switch (i) {
                case 21:
                    if (progress > 0) {
                        a(progress - this.f13050p, true);
                        m28425c();
                        return true;
                    }
                    break;
                case 22:
                    if (progress < getMax()) {
                        a(progress + this.f13050p, true);
                        m28425c();
                        return true;
                    }
                    break;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.fimi.soul.view.myhorizontalseebar.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i, int i2) {
        int i3;
        int i4 = 0;
        synchronized (this) {
            Drawable currentDrawable = getCurrentDrawable();
            int intrinsicHeight = this.f13048n == null ? 0 : this.f13048n.getIntrinsicHeight();
            if (currentDrawable != null) {
                i3 = Math.max(this.f13067c, Math.min(this.f13068d, currentDrawable.getIntrinsicWidth()));
                i4 = Math.max(intrinsicHeight, Math.max(this.f13069e, Math.min(this.f13070f, currentDrawable.getIntrinsicHeight())));
            } else {
                i3 = 0;
            }
            setMeasuredDimension(resolveSizeAndState(i3 + this.f13074j + this.f13075k, i, 0), resolveSizeAndState(i4 + this.f13076l + this.f13077m, i2, 0));
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        int max = getMax();
        float progress = max > 0 ? getProgress() / max : 0.0f;
        Drawable drawable = this.f13048n;
        if (drawable != null) {
            m28427a(getWidth(), drawable, progress, Integer.MIN_VALUE);
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.view.myhorizontalseebar.ProgressBar, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m28428a(i, i2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f13047b || !isEnabled()) {
            return false;
        }
        switch (motionEvent.getAction()) {
            case 0:
                setPressed(true);
                if (this.f13048n != null) {
                    invalidate(this.f13048n.getBounds());
                }
                mo28395a();
                m28426a(motionEvent);
                m28424g();
                return true;
            case 1:
                if (this.f13054u) {
                    m28426a(motionEvent);
                    mo28393b();
                    setPressed(false);
                } else {
                    mo28395a();
                    m28426a(motionEvent);
                    mo28393b();
                }
                invalidate();
                return true;
            case 2:
                if (this.f13054u) {
                    m28426a(motionEvent);
                    return true;
                } else if (Math.abs(motionEvent.getX() - this.f13053t) <= this.f13052s) {
                    return true;
                } else {
                    setPressed(true);
                    if (this.f13048n != null) {
                        invalidate(this.f13048n.getBounds());
                    }
                    mo28395a();
                    m28426a(motionEvent);
                    m28424g();
                    return true;
                }
            case 3:
                if (this.f13054u) {
                    mo28393b();
                    setPressed(false);
                }
                invalidate();
                return true;
            default:
                return true;
        }
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (!isEnabled()) {
            return false;
        }
        int progress = getProgress();
        int max = Math.max(1, Math.round(getMax() / 5.0f));
        switch (i) {
            case 4096:
                if (progress >= getMax()) {
                    return false;
                }
                a(progress + max, true);
                m28425c();
                return true;
            case 8192:
                if (progress <= 0) {
                    return false;
                }
                a(progress - max, true);
                m28425c();
                return true;
            default:
                return false;
        }
    }

    public void setKeyProgressIncrement(int i) {
        if (i < 0) {
            i = -i;
        }
        this.f13050p = i;
    }

    @Override // com.fimi.soul.view.myhorizontalseebar.ProgressBar
    public synchronized void setMax(int i) {
        super.setMax(i);
        if (this.f13050p == 0 || getMax() / this.f13050p > 20) {
            setKeyProgressIncrement(Math.max(1, Math.round(getMax() / 20.0f)));
        }
    }

    public void setThumb(Drawable drawable) {
        boolean z;
        if (this.f13048n == null || drawable == this.f13048n) {
            z = false;
        } else {
            this.f13048n.setCallback(null);
            z = true;
        }
        if (drawable != null) {
            drawable.setCallback(this);
            this.f13049o = drawable.getIntrinsicWidth() / 2;
            if (z && (drawable.getIntrinsicWidth() != this.f13048n.getIntrinsicWidth() || drawable.getIntrinsicHeight() != this.f13048n.getIntrinsicHeight())) {
                requestLayout();
            }
        }
        this.f13048n = drawable;
        invalidate();
        if (z) {
            m28428a(getWidth(), getHeight());
            if (drawable == null || !drawable.isStateful()) {
                return;
            }
            drawable.setState(getDrawableState());
        }
    }

    public void setThumbOffset(int i) {
        this.f13049o = i;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fimi.soul.view.myhorizontalseebar.ProgressBar, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return drawable == this.f13048n || super.verifyDrawable(drawable);
    }
}
