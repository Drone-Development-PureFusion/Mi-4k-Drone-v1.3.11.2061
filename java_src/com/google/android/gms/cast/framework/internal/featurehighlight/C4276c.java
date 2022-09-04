package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import com.google.android.gms.C3424R;
import com.google.android.gms.internal.C6960fj;
import com.google.android.gms.internal.C6969fl;
/* renamed from: com.google.android.gms.cast.framework.internal.featurehighlight.c */
/* loaded from: classes2.dex */
class C4276c extends Drawable {

    /* renamed from: d */
    private final int f16211d;

    /* renamed from: e */
    private final int f16212e;

    /* renamed from: f */
    private float f16213f;

    /* renamed from: h */
    private float f16215h;

    /* renamed from: i */
    private float f16216i;

    /* renamed from: a */
    private final Paint f16208a = new Paint();

    /* renamed from: b */
    private final Paint f16209b = new Paint();

    /* renamed from: c */
    private final Rect f16210c = new Rect();

    /* renamed from: g */
    private float f16214g = 1.0f;

    public C4276c(Context context) {
        Resources resources = context.getResources();
        this.f16211d = resources.getDimensionPixelSize(C3424R.dimen.cast_libraries_material_featurehighlight_inner_radius);
        this.f16212e = resources.getInteger(C3424R.integer.cast_libraries_material_featurehighlight_pulse_base_alpha);
        this.f16208a.setAntiAlias(true);
        this.f16208a.setStyle(Paint.Style.FILL);
        this.f16209b.setAntiAlias(true);
        this.f16209b.setStyle(Paint.Style.FILL);
        m24768a(-1);
    }

    /* renamed from: a */
    public Animator m24769a() {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("scale", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f));
        ofPropertyValuesHolder.setInterpolator(C6969fl.m15860a());
        return ofPropertyValuesHolder.setDuration(350L);
    }

    /* renamed from: a */
    public void m24768a(@ColorInt int i) {
        this.f16208a.setColor(i);
        this.f16209b.setColor(i);
        invalidateSelf();
    }

    /* renamed from: a */
    public void m24767a(Rect rect) {
        this.f16210c.set(rect);
        this.f16215h = this.f16210c.exactCenterX();
        this.f16216i = this.f16210c.exactCenterY();
        this.f16213f = Math.max(this.f16211d, Math.max(this.f16210c.width() / 2.0f, this.f16210c.height() / 2.0f));
        invalidateSelf();
    }

    /* renamed from: b */
    public Animator m24766b() {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "scale", 1.0f, 1.1f).setDuration(500L);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this, "scale", 1.1f, 1.0f).setDuration(500L);
        ObjectAnimator duration3 = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("pulseScale", 1.1f, 2.0f), PropertyValuesHolder.ofFloat("pulseAlpha", 1.0f, 0.0f)).setDuration(500L);
        animatorSet.play(duration);
        animatorSet.play(duration2).with(duration3).after(duration);
        animatorSet.setInterpolator(C6969fl.m15858c());
        animatorSet.setStartDelay(500L);
        animatorSet.addListener(C6960fj.m15867b(animatorSet));
        return animatorSet;
    }

    /* renamed from: c */
    public Animator m24765c() {
        return m24764d();
    }

    /* renamed from: d */
    public Animator m24764d() {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("scale", 0.0f), PropertyValuesHolder.ofFloat("alpha", 0.0f), PropertyValuesHolder.ofFloat("pulseScale", 0.0f), PropertyValuesHolder.ofFloat("pulseAlpha", 0.0f));
        ofPropertyValuesHolder.setInterpolator(C6969fl.m15859b());
        return ofPropertyValuesHolder.setDuration(200L);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i = (0.0f > 0.0f ? 1 : (0.0f == 0.0f ? 0 : -1));
        canvas.drawCircle(this.f16215h, this.f16216i, this.f16213f * this.f16214g, this.f16208a);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f16208a.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f16208a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
