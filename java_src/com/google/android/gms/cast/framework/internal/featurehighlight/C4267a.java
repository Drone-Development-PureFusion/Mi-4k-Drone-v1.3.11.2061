package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.annotation.Nullable;
import android.support.p001v4.view.GestureDetectorCompat;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.C3424R;
import com.google.android.gms.internal.C6969fl;
import com.google.android.gms.internal.C6981fq;
/* renamed from: com.google.android.gms.cast.framework.internal.featurehighlight.a */
/* loaded from: classes2.dex */
public final class C4267a extends ViewGroup {

    /* renamed from: d */
    private final C4278e f16185d;

    /* renamed from: e */
    private final C4276c f16186e;

    /* renamed from: f */
    private AbstractC4275b f16187f;

    /* renamed from: g */
    private View f16188g;
    @Nullable

    /* renamed from: h */
    private View f16189h;
    @Nullable

    /* renamed from: i */
    private Animator f16190i;

    /* renamed from: k */
    private final GestureDetectorCompat f16192k;
    @Nullable

    /* renamed from: l */
    private GestureDetectorCompat f16193l;

    /* renamed from: m */
    private AbstractC4274a f16194m;

    /* renamed from: n */
    private boolean f16195n;

    /* renamed from: a */
    private final int[] f16182a = new int[2];

    /* renamed from: b */
    private final Rect f16183b = new Rect();

    /* renamed from: c */
    private final Rect f16184c = new Rect();

    /* renamed from: j */
    private final C4277d f16191j = new C4277d(this);

    /* renamed from: com.google.android.gms.cast.framework.internal.featurehighlight.a$a */
    /* loaded from: classes2.dex */
    public interface AbstractC4274a {
        /* renamed from: a */
        void mo17781a();

        /* renamed from: b */
        void mo17780b();
    }

    public C4267a(Context context) {
        super(context);
        setId(C3424R.C3426id.cast_featurehighlight_view);
        setWillNotDraw(false);
        this.f16186e = new C4276c(context);
        this.f16186e.setCallback(this);
        this.f16185d = new C4278e(context);
        this.f16185d.setCallback(this);
        this.f16192k = new GestureDetectorCompat(context, new GestureDetector.SimpleOnGestureListener() { // from class: com.google.android.gms.cast.framework.internal.featurehighlight.a.1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (!C4267a.this.m24792a(x, y) || !C4267a.this.f16185d.m24755a(x, y)) {
                    C4267a.this.f16194m.mo17780b();
                    return true;
                }
                return true;
            }
        });
        this.f16192k.setIsLongpressEnabled(false);
        setVisibility(8);
    }

    /* renamed from: a */
    private void m24790a(Animator animator) {
        if (this.f16190i != null) {
            this.f16190i.cancel();
        }
        this.f16190i = animator;
        this.f16190i.start();
    }

    /* renamed from: a */
    private void m24783a(int[] iArr, View view) {
        getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        iArr[0] = iArr[0] - i;
        iArr[1] = iArr[1] - i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public boolean m24792a(float f, float f2) {
        return this.f16184c.contains(Math.round(f), Math.round(f2));
    }

    /* renamed from: d */
    private Animator m24774d(@Nullable final Runnable runnable) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f16187f.asView(), "alpha", 0.0f).setDuration(200L);
        duration.setInterpolator(C6969fl.m15859b());
        Animator m24746d = this.f16185d.m24746d();
        Animator m24765c = this.f16186e.m24765c();
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(duration, m24746d, m24765c);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.gms.cast.framework.internal.featurehighlight.a.5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                C4267a.this.setVisibility(8);
                C4267a.this.f16190i = null;
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
        return animatorSet;
    }

    /* renamed from: e */
    private Animator m24772e(@Nullable final Runnable runnable) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f16187f.asView(), "alpha", 0.0f).setDuration(200L);
        duration.setInterpolator(C6969fl.m15859b());
        Animator m24747c = this.f16185d.m24747c(this.f16183b.exactCenterX() - this.f16185d.m24750b(), this.f16183b.exactCenterY() - this.f16185d.m24748c());
        Animator m24764d = this.f16186e.m24764d();
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(duration, m24747c, m24764d);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.gms.cast.framework.internal.featurehighlight.a.6
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                C4267a.this.setVisibility(8);
                C4267a.this.f16190i = null;
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
        return animatorSet;
    }

    /* renamed from: f */
    private Animator m24771f() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f16187f.asView(), "alpha", 0.0f, 1.0f).setDuration(350L);
        duration.setInterpolator(C6969fl.m15860a());
        Animator m24749b = this.f16185d.m24749b(this.f16183b.exactCenterX() - this.f16185d.m24750b(), this.f16183b.exactCenterY() - this.f16185d.m24748c());
        Animator m24769a = this.f16186e.m24769a();
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(duration, m24749b, m24769a);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.gms.cast.framework.internal.featurehighlight.a.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                C4267a.this.f16190i = C4267a.this.m24770g();
                C4267a.this.f16190i.start();
            }
        });
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public Animator m24770g() {
        return this.f16186e.m24766b();
    }

    /* renamed from: a */
    public void m24793a() {
        if (this.f16188g == null) {
            throw new IllegalStateException("Target view must be set before animation");
        }
        setVisibility(0);
        m24790a(m24771f());
    }

    /* renamed from: a */
    public void m24791a(@ColorInt int i) {
        this.f16185d.m24753a(i);
    }

    /* renamed from: a */
    public void m24789a(final View view, @Nullable View view2, final boolean z, final AbstractC4274a abstractC4274a) {
        this.f16188g = (View) C6981fq.m15841a(view);
        this.f16189h = view2;
        this.f16194m = (AbstractC4274a) C6981fq.m15841a(abstractC4274a);
        this.f16193l = new GestureDetectorCompat(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.google.android.gms.cast.framework.internal.featurehighlight.a.2
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                if (view.getParent() != null) {
                    view.performClick();
                }
                if (z) {
                    abstractC4274a.mo17781a();
                    return true;
                }
                return true;
            }
        });
        this.f16193l.setIsLongpressEnabled(false);
        setVisibility(4);
    }

    /* renamed from: a */
    public void m24785a(AbstractC4275b abstractC4275b) {
        this.f16187f = (AbstractC4275b) C6981fq.m15841a(abstractC4275b);
        addView(abstractC4275b.asView(), 0);
    }

    /* renamed from: a */
    public void m24784a(@Nullable final Runnable runnable) {
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.google.android.gms.cast.framework.internal.featurehighlight.a.3
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (runnable != null) {
                    runnable.run();
                }
                C4267a.this.m24793a();
                C4267a.this.removeOnLayoutChangeListener(this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    /* renamed from: b */
    public Drawable m24782b() {
        return null;
    }

    /* renamed from: b */
    public void m24780b(@Nullable Runnable runnable) {
        m24790a(m24772e(runnable));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public View m24779c() {
        return this.f16187f.asView();
    }

    /* renamed from: c */
    public void m24777c(@Nullable Runnable runnable) {
        m24790a(m24774d(runnable));
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public C4278e m24776d() {
        return this.f16185d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public C4276c m24773e() {
        return this.f16186e;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        canvas.save();
        if (this.f16189h != null) {
            canvas.clipRect(this.f16184c);
        }
        this.f16185d.draw(canvas);
        this.f16186e.draw(canvas);
        if (this.f16188g != null) {
            if (this.f16188g.getParent() != null) {
                Bitmap createBitmap = Bitmap.createBitmap(this.f16188g.getWidth(), this.f16188g.getHeight(), Bitmap.Config.ARGB_8888);
                this.f16188g.draw(new Canvas(createBitmap));
                int m24756a = this.f16185d.m24756a();
                int red = Color.red(m24756a);
                int green = Color.green(m24756a);
                int blue = Color.blue(m24756a);
                for (int i = 0; i < createBitmap.getHeight(); i++) {
                    for (int i2 = 0; i2 < createBitmap.getWidth(); i2++) {
                        int pixel = createBitmap.getPixel(i2, i);
                        if (Color.alpha(pixel) != 0) {
                            createBitmap.setPixel(i2, i, Color.argb(Color.alpha(pixel), red, green, blue));
                        }
                    }
                }
                canvas.drawBitmap(createBitmap, this.f16183b.left, this.f16183b.top, (Paint) null);
            }
            canvas.restore();
            return;
        }
        throw new IllegalStateException("Neither target view nor drawable was set");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f16188g == null) {
            throw new IllegalStateException("Target view must be set before layout");
        }
        if (this.f16188g.getParent() != null) {
            m24783a(this.f16182a, this.f16188g);
        }
        this.f16183b.set(this.f16182a[0], this.f16182a[1], this.f16182a[0] + this.f16188g.getWidth(), this.f16182a[1] + this.f16188g.getHeight());
        if (this.f16189h != null) {
            m24783a(this.f16182a, this.f16189h);
            this.f16184c.set(this.f16182a[0], this.f16182a[1], this.f16182a[0] + this.f16189h.getMeasuredWidth(), this.f16182a[1] + this.f16189h.getMeasuredHeight());
        } else {
            this.f16184c.set(i, i2, i3, i4);
        }
        this.f16185d.setBounds(this.f16184c);
        this.f16186e.setBounds(this.f16184c);
        this.f16191j.m24762a(this.f16183b, this.f16184c);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(resolveSize(View.MeasureSpec.getSize(i), i), resolveSize(View.MeasureSpec.getSize(i2), i2));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f16195n = this.f16183b.contains((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (this.f16195n) {
            if (this.f16193l != null) {
                this.f16193l.onTouchEvent(motionEvent);
                if (actionMasked == 1) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.setAction(3);
                }
            }
            if (this.f16188g.getParent() != null) {
                this.f16188g.onTouchEvent(motionEvent);
            }
        } else {
            this.f16192k.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f16185d || drawable == this.f16186e || drawable == null;
    }
}
