package com.fimi.soul.view.photodraweeview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.p001v4.view.GestureDetectorCompat;
import android.support.p001v4.view.MotionEventCompat;
import android.support.p001v4.widget.ScrollerCompat;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.view.DraweeView;
import java.lang.ref.WeakReference;
/* renamed from: com.fimi.soul.view.photodraweeview.a */
/* loaded from: classes2.dex */
public class View$OnTouchListenerC3306a implements View.OnTouchListener, AbstractC3311c, AbstractC3314f {

    /* renamed from: e */
    private static final int f13112e = -1;

    /* renamed from: f */
    private static final int f13113f = 0;

    /* renamed from: g */
    private static final int f13114g = 1;

    /* renamed from: h */
    private static final int f13115h = 2;

    /* renamed from: A */
    private AbstractC3315g f13116A;

    /* renamed from: B */
    private View.OnLongClickListener f13117B;

    /* renamed from: C */
    private AbstractC3313e f13118C;

    /* renamed from: p */
    private ScaleGestureDetector$OnScaleGestureListenerC3316h f13126p;

    /* renamed from: q */
    private GestureDetectorCompat f13127q;

    /* renamed from: x */
    private RunnableC3309b f13134x;

    /* renamed from: y */
    private WeakReference<DraweeView<GenericDraweeHierarchy>> f13135y;

    /* renamed from: z */
    private AbstractC3312d f13136z;

    /* renamed from: i */
    private final float[] f13119i = new float[9];

    /* renamed from: j */
    private final RectF f13120j = new RectF();

    /* renamed from: k */
    private final Interpolator f13121k = new AccelerateDecelerateInterpolator();

    /* renamed from: l */
    private float f13122l = 1.0f;

    /* renamed from: m */
    private float f13123m = 1.75f;

    /* renamed from: n */
    private float f13124n = 3.0f;

    /* renamed from: o */
    private long f13125o = 200;

    /* renamed from: r */
    private boolean f13128r = false;

    /* renamed from: s */
    private boolean f13129s = true;

    /* renamed from: t */
    private int f13130t = 2;

    /* renamed from: u */
    private final Matrix f13131u = new Matrix();

    /* renamed from: v */
    private int f13132v = -1;

    /* renamed from: w */
    private int f13133w = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.fimi.soul.view.photodraweeview.a$a */
    /* loaded from: classes2.dex */
    public class RunnableC3308a implements Runnable {

        /* renamed from: b */
        private final float f13139b;

        /* renamed from: c */
        private final float f13140c;

        /* renamed from: d */
        private final long f13141d = System.currentTimeMillis();

        /* renamed from: e */
        private final float f13142e;

        /* renamed from: f */
        private final float f13143f;

        public RunnableC3308a(float f, float f2, float f3, float f4) {
            this.f13139b = f3;
            this.f13140c = f4;
            this.f13142e = f;
            this.f13143f = f2;
        }

        /* renamed from: a */
        private float m28354a() {
            return View$OnTouchListenerC3306a.this.f13121k.getInterpolation(Math.min(1.0f, (((float) (System.currentTimeMillis() - this.f13141d)) * 1.0f) / ((float) View$OnTouchListenerC3306a.this.f13125o)));
        }

        @Override // java.lang.Runnable
        public void run() {
            DraweeView<GenericDraweeHierarchy> m28375a = View$OnTouchListenerC3306a.this.m28375a();
            if (m28375a == null) {
                return;
            }
            float m28354a = m28354a();
            View$OnTouchListenerC3306a.this.mo28344a((this.f13142e + ((this.f13143f - this.f13142e) * m28354a)) / View$OnTouchListenerC3306a.this.getScale(), this.f13139b, this.f13140c);
            if (m28354a >= 1.0f) {
                return;
            }
            View$OnTouchListenerC3306a.this.m28372a(m28375a, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.fimi.soul.view.photodraweeview.a$b */
    /* loaded from: classes2.dex */
    public class RunnableC3309b implements Runnable {

        /* renamed from: b */
        private final ScrollerCompat f13145b;

        /* renamed from: c */
        private int f13146c;

        /* renamed from: d */
        private int f13147d;

        public RunnableC3309b(Context context) {
            this.f13145b = ScrollerCompat.create(context);
        }

        /* renamed from: a */
        public void m28353a() {
            this.f13145b.abortAnimation();
        }

        /* renamed from: a */
        public void m28352a(int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            int i7;
            int i8;
            RectF m28366c = View$OnTouchListenerC3306a.this.m28366c();
            if (m28366c == null) {
                return;
            }
            int round = Math.round(-m28366c.left);
            if (i < m28366c.width()) {
                i5 = Math.round(m28366c.width() - i);
                i6 = 0;
            } else {
                i5 = round;
                i6 = round;
            }
            int round2 = Math.round(-m28366c.top);
            if (i2 < m28366c.height()) {
                i7 = Math.round(m28366c.height() - i2);
                i8 = 0;
            } else {
                i7 = round2;
                i8 = round2;
            }
            this.f13146c = round;
            this.f13147d = round2;
            if (round == i5 && round2 == i7) {
                return;
            }
            this.f13145b.fling(round, round2, i3, i4, i6, i5, i8, i7, 0, 0);
        }

        @Override // java.lang.Runnable
        public void run() {
            DraweeView<GenericDraweeHierarchy> m28375a;
            if (!this.f13145b.isFinished() && (m28375a = View$OnTouchListenerC3306a.this.m28375a()) != null && this.f13145b.computeScrollOffset()) {
                int currX = this.f13145b.getCurrX();
                int currY = this.f13145b.getCurrY();
                View$OnTouchListenerC3306a.this.f13131u.postTranslate(this.f13146c - currX, this.f13147d - currY);
                m28375a.invalidate();
                this.f13146c = currX;
                this.f13147d = currY;
                View$OnTouchListenerC3306a.this.m28372a(m28375a, this);
            }
        }
    }

    public View$OnTouchListenerC3306a(DraweeView<GenericDraweeHierarchy> draweeView) {
        this.f13135y = new WeakReference<>(draweeView);
        draweeView.getHierarchy().setActualImageScaleType(ScalingUtils.ScaleType.FIT_CENTER);
        draweeView.setOnTouchListener(this);
        this.f13126p = new ScaleGestureDetector$OnScaleGestureListenerC3316h(draweeView.getContext(), this);
        this.f13127q = new GestureDetectorCompat(draweeView.getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.fimi.soul.view.photodraweeview.a.1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public void onLongPress(MotionEvent motionEvent) {
                super.onLongPress(motionEvent);
                if (View$OnTouchListenerC3306a.this.f13117B != null) {
                    View$OnTouchListenerC3306a.this.f13117B.onLongClick(View$OnTouchListenerC3306a.this.m28375a());
                }
            }
        });
        this.f13127q.setOnDoubleTapListener(new GestureDetector$OnDoubleTapListenerC3310b(this));
    }

    /* renamed from: a */
    private float m28373a(Matrix matrix, int i) {
        matrix.getValues(this.f13119i);
        return this.f13119i[i];
    }

    /* renamed from: a */
    private RectF m28374a(Matrix matrix) {
        DraweeView<GenericDraweeHierarchy> m28375a = m28375a();
        if (m28375a == null || (this.f13133w == -1 && this.f13132v == -1)) {
            return null;
        }
        this.f13120j.set(0.0f, 0.0f, this.f13133w, this.f13132v);
        m28375a.getHierarchy().getActualImageBounds(this.f13120j);
        matrix.mapRect(this.f13120j);
        return this.f13120j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m28372a(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, 16L);
        }
    }

    /* renamed from: b */
    private static void m28368b(float f, float f2, float f3) {
        if (f >= f2) {
            throw new IllegalArgumentException("MinZoom has to be less than MidZoom");
        }
        if (f2 < f3) {
            return;
        }
        throw new IllegalArgumentException("MidZoom has to be less than MaxZoom");
    }

    /* renamed from: h */
    private int m28360h() {
        DraweeView<GenericDraweeHierarchy> m28375a = m28375a();
        if (m28375a != null) {
            return (m28375a.getWidth() - m28375a.getPaddingLeft()) - m28375a.getPaddingRight();
        }
        return 0;
    }

    /* renamed from: i */
    private int m28359i() {
        DraweeView<GenericDraweeHierarchy> m28375a = m28375a();
        if (m28375a != null) {
            return (m28375a.getHeight() - m28375a.getPaddingTop()) - m28375a.getPaddingBottom();
        }
        return 0;
    }

    /* renamed from: j */
    private void m28358j() {
        if (this.f13133w == -1 && this.f13132v == -1) {
            return;
        }
        m28357k();
    }

    /* renamed from: k */
    private void m28357k() {
        this.f13131u.reset();
        m28362e();
        DraweeView<GenericDraweeHierarchy> m28375a = m28375a();
        if (m28375a != null) {
            m28375a.invalidate();
        }
    }

    /* renamed from: l */
    private void m28356l() {
        RectF m28366c;
        DraweeView<GenericDraweeHierarchy> m28375a = m28375a();
        if (m28375a == null || getScale() >= this.f13122l || (m28366c = m28366c()) == null) {
            return;
        }
        m28375a.post(new RunnableC3308a(getScale(), this.f13122l, m28366c.centerX(), m28366c.centerY()));
    }

    /* renamed from: m */
    private void m28355m() {
        if (this.f13134x != null) {
            this.f13134x.m28353a();
            this.f13134x = null;
        }
    }

    @Nullable
    /* renamed from: a */
    public DraweeView<GenericDraweeHierarchy> m28375a() {
        return this.f13135y.get();
    }

    @Override // com.fimi.soul.view.photodraweeview.AbstractC3314f
    /* renamed from: a */
    public void mo28345a(float f, float f2) {
        DraweeView<GenericDraweeHierarchy> m28375a = m28375a();
        if (m28375a == null || this.f13126p.m28340a()) {
            return;
        }
        this.f13131u.postTranslate(f, f2);
        m28364d();
        ViewParent parent = m28375a.getParent();
        if (parent == null) {
            return;
        }
        if (!this.f13129s || this.f13126p.m28340a() || this.f13128r) {
            parent.requestDisallowInterceptTouchEvent(true);
        } else if (this.f13130t != 2 && ((this.f13130t != 0 || f < 1.0f) && (this.f13130t != 1 || f > -1.0f))) {
        } else {
            parent.requestDisallowInterceptTouchEvent(false);
        }
    }

    @Override // com.fimi.soul.view.photodraweeview.AbstractC3314f
    /* renamed from: a */
    public void mo28344a(float f, float f2, float f3) {
        if (getScale() < this.f13124n || f < 1.0f) {
            if (this.f13118C != null) {
                this.f13118C.m28346a(f, f2, f3);
            }
            this.f13131u.postScale(f, f, f2, f3);
            m28364d();
        }
    }

    @Override // com.fimi.soul.view.photodraweeview.AbstractC3314f
    /* renamed from: a */
    public void mo28343a(float f, float f2, float f3, float f4) {
        DraweeView<GenericDraweeHierarchy> m28375a = m28375a();
        if (m28375a == null) {
            return;
        }
        this.f13134x = new RunnableC3309b(m28375a.getContext());
        this.f13134x.m28352a(m28360h(), m28359i(), (int) f3, (int) f4);
        m28375a.post(this.f13134x);
    }

    @Override // com.fimi.soul.view.photodraweeview.AbstractC3311c
    /* renamed from: a */
    public void mo28350a(float f, float f2, float f3, boolean z) {
        DraweeView<GenericDraweeHierarchy> m28375a = m28375a();
        if (m28375a == null || f < this.f13122l || f > this.f13124n) {
            return;
        }
        if (z) {
            m28375a.post(new RunnableC3308a(getScale(), f, f2, f3));
            return;
        }
        this.f13131u.setScale(f, f, f2, f3);
        m28364d();
    }

    @Override // com.fimi.soul.view.photodraweeview.AbstractC3311c
    /* renamed from: a */
    public void mo28349a(float f, boolean z) {
        DraweeView<GenericDraweeHierarchy> m28375a = m28375a();
        if (m28375a != null) {
            mo28350a(f, m28375a.getRight() / 2, m28375a.getBottom() / 2, false);
        }
    }

    @Override // com.fimi.soul.view.photodraweeview.AbstractC3311c
    /* renamed from: a */
    public void mo28348a(int i, int i2) {
        this.f13133w = i;
        this.f13132v = i2;
        m28358j();
    }

    /* renamed from: b */
    public Matrix m28369b() {
        return this.f13131u;
    }

    /* renamed from: c */
    public RectF m28366c() {
        m28362e();
        return m28374a(m28369b());
    }

    /* renamed from: d */
    public void m28364d() {
        DraweeView<GenericDraweeHierarchy> m28375a = m28375a();
        if (m28375a != null && m28362e()) {
            m28375a.invalidate();
        }
    }

    /* renamed from: e */
    public boolean m28362e() {
        float f = 0.0f;
        RectF m28374a = m28374a(m28369b());
        if (m28374a == null) {
            return false;
        }
        float height = m28374a.height();
        float width = m28374a.width();
        int m28359i = m28359i();
        float f2 = height <= ((float) m28359i) ? ((m28359i - height) / 2.0f) - m28374a.top : m28374a.top > 0.0f ? -m28374a.top : m28374a.bottom < ((float) m28359i) ? m28359i - m28374a.bottom : 0.0f;
        int m28360h = m28360h();
        if (width <= m28360h) {
            f = ((m28360h - width) / 2.0f) - m28374a.left;
            this.f13130t = 2;
        } else if (m28374a.left > 0.0f) {
            f = -m28374a.left;
            this.f13130t = 0;
        } else if (m28374a.right < m28360h) {
            f = m28360h - m28374a.right;
            this.f13130t = 1;
        } else {
            this.f13130t = -1;
        }
        this.f13131u.postTranslate(f, f2);
        return true;
    }

    @Override // com.fimi.soul.view.photodraweeview.AbstractC3314f
    /* renamed from: f */
    public void mo28342f() {
        m28356l();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public void m28361g() {
        m28355m();
    }

    @Override // com.fimi.soul.view.photodraweeview.AbstractC3311c
    public float getMaximumScale() {
        return this.f13124n;
    }

    @Override // com.fimi.soul.view.photodraweeview.AbstractC3311c
    public float getMediumScale() {
        return this.f13123m;
    }

    @Override // com.fimi.soul.view.photodraweeview.AbstractC3311c
    public float getMinimumScale() {
        return this.f13122l;
    }

    @Override // com.fimi.soul.view.photodraweeview.AbstractC3311c
    public AbstractC3312d getOnPhotoTapListener() {
        return this.f13136z;
    }

    @Override // com.fimi.soul.view.photodraweeview.AbstractC3311c
    public AbstractC3315g getOnViewTapListener() {
        return this.f13116A;
    }

    @Override // com.fimi.soul.view.photodraweeview.AbstractC3311c
    public float getScale() {
        return (float) Math.sqrt(((float) Math.pow(m28373a(this.f13131u, 0), 2.0d)) + ((float) Math.pow(m28373a(this.f13131u, 3), 2.0d)));
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z = false;
        switch (MotionEventCompat.getActionMasked(motionEvent)) {
            case 0:
                ViewParent parent = view.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                m28355m();
                break;
            case 1:
            case 3:
                ViewParent parent2 = view.getParent();
                if (parent2 != null) {
                    parent2.requestDisallowInterceptTouchEvent(false);
                    break;
                }
                break;
        }
        boolean m28340a = this.f13126p.m28340a();
        boolean m28337b = this.f13126p.m28337b();
        boolean m28338a = this.f13126p.m28338a(motionEvent);
        boolean z2 = !m28340a && !this.f13126p.m28340a();
        boolean z3 = !m28337b && !this.f13126p.m28337b();
        if (z2 && z3) {
            z = true;
        }
        this.f13128r = z;
        if (this.f13127q.onTouchEvent(motionEvent)) {
            return true;
        }
        return m28338a;
    }

    @Override // com.fimi.soul.view.photodraweeview.AbstractC3311c
    public void setAllowParentInterceptOnEdge(boolean z) {
        this.f13129s = z;
    }

    @Override // com.fimi.soul.view.photodraweeview.AbstractC3311c
    public void setMaximumScale(float f) {
        m28368b(this.f13122l, this.f13123m, f);
        this.f13124n = f;
    }

    @Override // com.fimi.soul.view.photodraweeview.AbstractC3311c
    public void setMediumScale(float f) {
        m28368b(this.f13122l, f, this.f13124n);
        this.f13123m = f;
    }

    @Override // com.fimi.soul.view.photodraweeview.AbstractC3311c
    public void setMinimumScale(float f) {
        m28368b(f, this.f13123m, this.f13124n);
        this.f13122l = f;
    }

    @Override // com.fimi.soul.view.photodraweeview.AbstractC3311c
    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        if (onDoubleTapListener != null) {
            this.f13127q.setOnDoubleTapListener(onDoubleTapListener);
        } else {
            this.f13127q.setOnDoubleTapListener(new GestureDetector$OnDoubleTapListenerC3310b(this));
        }
    }

    @Override // com.fimi.soul.view.photodraweeview.AbstractC3311c
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f13117B = onLongClickListener;
    }

    @Override // com.fimi.soul.view.photodraweeview.AbstractC3311c
    public void setOnPhotoTapListener(AbstractC3312d abstractC3312d) {
        this.f13136z = abstractC3312d;
    }

    @Override // com.fimi.soul.view.photodraweeview.AbstractC3311c
    public void setOnScaleChangeListener(AbstractC3313e abstractC3313e) {
        this.f13118C = abstractC3313e;
    }

    @Override // com.fimi.soul.view.photodraweeview.AbstractC3311c
    public void setOnViewTapListener(AbstractC3315g abstractC3315g) {
        this.f13116A = abstractC3315g;
    }

    @Override // com.fimi.soul.view.photodraweeview.AbstractC3311c
    public void setScale(float f) {
        mo28349a(f, false);
    }

    @Override // com.fimi.soul.view.photodraweeview.AbstractC3311c
    public void setZoomTransitionDuration(long j) {
        if (j < 0) {
            j = 200;
        }
        this.f13125o = j;
    }
}
