package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.v4.graphics.ColorUtils;
import android.util.TypedValue;
import com.google.android.gms.C3424R;
import com.google.android.gms.common.util.C4696s;
import com.google.android.gms.internal.C6969fl;
import com.google.android.gms.internal.C6971fm;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.cast.framework.internal.featurehighlight.e */
/* loaded from: classes2.dex */
public class C4278e extends Drawable {

    /* renamed from: a */
    private final int f16223a;

    /* renamed from: b */
    private final int f16224b;

    /* renamed from: c */
    private final int f16225c;

    /* renamed from: g */
    private float f16229g;

    /* renamed from: i */
    private float f16231i;

    /* renamed from: j */
    private float f16232j;

    /* renamed from: d */
    private final Rect f16226d = new Rect();

    /* renamed from: e */
    private final Rect f16227e = new Rect();

    /* renamed from: f */
    private final Paint f16228f = new Paint();

    /* renamed from: h */
    private float f16230h = 1.0f;

    /* renamed from: k */
    private float f16233k = 0.0f;

    /* renamed from: l */
    private float f16234l = 0.0f;

    /* renamed from: m */
    private int f16235m = 244;

    public C4278e(Context context) {
        if (C4696s.m23103k()) {
            m24753a(m24752a(context));
        } else {
            m24753a(context.getResources().getColor(C3424R.color.f13678xfbd34f47));
        }
        this.f16228f.setAntiAlias(true);
        this.f16228f.setStyle(Paint.Style.FILL);
        Resources resources = context.getResources();
        this.f16223a = resources.getDimensionPixelSize(C3424R.dimen.cast_libraries_material_featurehighlight_center_threshold);
        this.f16224b = resources.getDimensionPixelSize(C3424R.dimen.f13680xd1678993);
        this.f16225c = resources.getDimensionPixelSize(C3424R.dimen.cast_libraries_material_featurehighlight_outer_padding);
    }

    /* renamed from: a */
    private float m24754a(float f, float f2, Rect rect) {
        return (float) Math.ceil(C6971fm.m15853a(f, f2, rect.left, rect.top, rect.right, rect.bottom));
    }

    @TargetApi(21)
    /* renamed from: a */
    private static int m24752a(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843827, typedValue, true);
        return ColorUtils.setAlphaComponent(typedValue.data, 244);
    }

    @ColorInt
    /* renamed from: a */
    public int m24756a() {
        return this.f16228f.getColor();
    }

    /* renamed from: a */
    public void m24753a(@ColorInt int i) {
        this.f16228f.setColor(i);
        this.f16235m = this.f16228f.getAlpha();
        invalidateSelf();
    }

    /* renamed from: a */
    public void m24751a(Rect rect, Rect rect2) {
        this.f16226d.set(rect);
        this.f16227e.set(rect2);
        float exactCenterX = rect.exactCenterX();
        float exactCenterY = rect.exactCenterY();
        Rect bounds = getBounds();
        if (Math.min(exactCenterY - bounds.top, bounds.bottom - exactCenterY) < this.f16223a) {
            this.f16231i = exactCenterX;
            this.f16232j = exactCenterY;
        } else {
            this.f16231i = (exactCenterX > bounds.exactCenterX() ? 1 : (exactCenterX == bounds.exactCenterX() ? 0 : -1)) <= 0 ? rect2.exactCenterX() + this.f16224b : rect2.exactCenterX() - this.f16224b;
            this.f16232j = rect2.exactCenterY();
        }
        this.f16229g = this.f16225c + Math.max(m24754a(this.f16231i, this.f16232j, rect), m24754a(this.f16231i, this.f16232j, rect2));
        invalidateSelf();
    }

    /* renamed from: a */
    public boolean m24755a(float f, float f2) {
        return C6971fm.m15852b(f, f2, this.f16231i, this.f16232j) < this.f16229g;
    }

    /* renamed from: b */
    public float m24750b() {
        return this.f16231i;
    }

    /* renamed from: b */
    public Animator m24749b(float f, float f2) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("scale", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("translationX", f, 0.0f), PropertyValuesHolder.ofFloat("translationY", f2, 0.0f), PropertyValuesHolder.ofInt("alpha", 0, this.f16235m));
        ofPropertyValuesHolder.setInterpolator(C6969fl.m15860a());
        return ofPropertyValuesHolder.setDuration(350L);
    }

    /* renamed from: c */
    public float m24748c() {
        return this.f16232j;
    }

    /* renamed from: c */
    public Animator m24747c(float f, float f2) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("scale", 0.0f), PropertyValuesHolder.ofFloat("translationX", 0.0f, f), PropertyValuesHolder.ofFloat("translationY", 0.0f, f2), PropertyValuesHolder.ofInt("alpha", 0));
        ofPropertyValuesHolder.setInterpolator(C6969fl.m15859b());
        return ofPropertyValuesHolder.setDuration(200L);
    }

    /* renamed from: d */
    public Animator m24746d() {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("scale", 1.125f), PropertyValuesHolder.ofInt("alpha", 0));
        ofPropertyValuesHolder.setInterpolator(C6969fl.m15859b());
        return ofPropertyValuesHolder.setDuration(200L);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        canvas.drawCircle(this.f16231i + 0.0f, this.f16232j + 0.0f, this.f16229g * this.f16230h, this.f16228f);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f16228f.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f16228f.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f16228f.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
