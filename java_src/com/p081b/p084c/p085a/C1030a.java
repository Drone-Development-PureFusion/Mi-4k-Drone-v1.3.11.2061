package com.p081b.p084c.p085a;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
/* renamed from: com.b.c.a.a */
/* loaded from: classes.dex */
public final class C1030a extends Animation {

    /* renamed from: a */
    public static final boolean f2333a;

    /* renamed from: b */
    private static final WeakHashMap<View, C1030a> f2334b;

    /* renamed from: c */
    private final WeakReference<View> f2335c;

    /* renamed from: e */
    private boolean f2337e;

    /* renamed from: g */
    private float f2339g;

    /* renamed from: h */
    private float f2340h;

    /* renamed from: i */
    private float f2341i;

    /* renamed from: j */
    private float f2342j;

    /* renamed from: k */
    private float f2343k;

    /* renamed from: n */
    private float f2346n;

    /* renamed from: o */
    private float f2347o;

    /* renamed from: d */
    private final Camera f2336d = new Camera();

    /* renamed from: f */
    private float f2338f = 1.0f;

    /* renamed from: l */
    private float f2344l = 1.0f;

    /* renamed from: m */
    private float f2345m = 1.0f;

    /* renamed from: p */
    private final RectF f2348p = new RectF();

    /* renamed from: q */
    private final RectF f2349q = new RectF();

    /* renamed from: r */
    private final Matrix f2350r = new Matrix();

    static {
        f2333a = Integer.valueOf(Build.VERSION.SDK).intValue() < 11;
        f2334b = new WeakHashMap<>();
    }

    private C1030a(View view) {
        setDuration(0L);
        setFillAfter(true);
        view.setAnimation(this);
        this.f2335c = new WeakReference<>(view);
    }

    /* renamed from: a */
    public static C1030a m37001a(View view) {
        C1030a c1030a = f2334b.get(view);
        if (c1030a == null || c1030a != view.getAnimation()) {
            C1030a c1030a2 = new C1030a(view);
            f2334b.put(view, c1030a2);
            return c1030a2;
        }
        return c1030a;
    }

    /* renamed from: a */
    private void m37004a(Matrix matrix, View view) {
        float width = view.getWidth();
        float height = view.getHeight();
        boolean z = this.f2337e;
        float f = z ? this.f2339g : width / 2.0f;
        float f2 = z ? this.f2340h : height / 2.0f;
        float f3 = this.f2341i;
        float f4 = this.f2342j;
        float f5 = this.f2343k;
        if (f3 != 0.0f || f4 != 0.0f || f5 != 0.0f) {
            Camera camera = this.f2336d;
            camera.save();
            camera.rotateX(f3);
            camera.rotateY(f4);
            camera.rotateZ(-f5);
            camera.getMatrix(matrix);
            camera.restore();
            matrix.preTranslate(-f, -f2);
            matrix.postTranslate(f, f2);
        }
        float f6 = this.f2344l;
        float f7 = this.f2345m;
        if (f6 != 1.0f || f7 != 1.0f) {
            matrix.postScale(f6, f7);
            matrix.postTranslate((-(f / width)) * ((f6 * width) - width), (-(f2 / height)) * ((f7 * height) - height));
        }
        matrix.postTranslate(this.f2346n, this.f2347o);
    }

    /* renamed from: a */
    private void m37003a(RectF rectF, View view) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        Matrix matrix = this.f2350r;
        matrix.reset();
        m37004a(matrix, view);
        this.f2350r.mapRect(rectF);
        rectF.offset(view.getLeft(), view.getTop());
        if (rectF.right < rectF.left) {
            float f = rectF.right;
            rectF.right = rectF.left;
            rectF.left = f;
        }
        if (rectF.bottom < rectF.top) {
            float f2 = rectF.top;
            rectF.top = rectF.bottom;
            rectF.bottom = f2;
        }
    }

    /* renamed from: o */
    private void m36948o() {
        View view = this.f2335c.get();
        if (view != null) {
            m37003a(this.f2348p, view);
        }
    }

    /* renamed from: p */
    private void m36947p() {
        View view = this.f2335c.get();
        if (view == null || view.getParent() == null) {
            return;
        }
        RectF rectF = this.f2349q;
        m37003a(rectF, view);
        rectF.union(this.f2348p);
        ((View) view.getParent()).invalidate((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    /* renamed from: a */
    public float m37007a() {
        return this.f2338f;
    }

    /* renamed from: a */
    public void m37006a(float f) {
        if (this.f2338f != f) {
            this.f2338f = f;
            View view = this.f2335c.get();
            if (view == null) {
                return;
            }
            view.invalidate();
        }
    }

    /* renamed from: a */
    public void m37005a(int i) {
        View view = this.f2335c.get();
        if (view != null) {
            view.scrollTo(i, view.getScrollY());
        }
    }

    @Override // android.view.animation.Animation
    protected void applyTransformation(float f, Transformation transformation) {
        View view = this.f2335c.get();
        if (view != null) {
            transformation.setAlpha(this.f2338f);
            m37004a(transformation.getMatrix(), view);
        }
    }

    /* renamed from: b */
    public float m36998b() {
        return this.f2339g;
    }

    /* renamed from: b */
    public void m36997b(float f) {
        if (!this.f2337e || this.f2339g != f) {
            m36948o();
            this.f2337e = true;
            this.f2339g = f;
            m36947p();
        }
    }

    /* renamed from: b */
    public void m36996b(int i) {
        View view = this.f2335c.get();
        if (view != null) {
            view.scrollTo(view.getScrollX(), i);
        }
    }

    /* renamed from: c */
    public float m36992c() {
        return this.f2340h;
    }

    /* renamed from: c */
    public void m36991c(float f) {
        if (!this.f2337e || this.f2340h != f) {
            m36948o();
            this.f2337e = true;
            this.f2340h = f;
            m36947p();
        }
    }

    /* renamed from: d */
    public float m36988d() {
        return this.f2343k;
    }

    /* renamed from: d */
    public void m36987d(float f) {
        if (this.f2343k != f) {
            m36948o();
            this.f2343k = f;
            m36947p();
        }
    }

    /* renamed from: e */
    public float m36984e() {
        return this.f2341i;
    }

    /* renamed from: e */
    public void m36983e(float f) {
        if (this.f2341i != f) {
            m36948o();
            this.f2341i = f;
            m36947p();
        }
    }

    /* renamed from: f */
    public float m36980f() {
        return this.f2342j;
    }

    /* renamed from: f */
    public void m36979f(float f) {
        if (this.f2342j != f) {
            m36948o();
            this.f2342j = f;
            m36947p();
        }
    }

    /* renamed from: g */
    public float m36976g() {
        return this.f2344l;
    }

    /* renamed from: g */
    public void m36975g(float f) {
        if (this.f2344l != f) {
            m36948o();
            this.f2344l = f;
            m36947p();
        }
    }

    /* renamed from: h */
    public float m36972h() {
        return this.f2345m;
    }

    /* renamed from: h */
    public void m36971h(float f) {
        if (this.f2345m != f) {
            m36948o();
            this.f2345m = f;
            m36947p();
        }
    }

    /* renamed from: i */
    public int m36968i() {
        View view = this.f2335c.get();
        if (view == null) {
            return 0;
        }
        return view.getScrollX();
    }

    /* renamed from: i */
    public void m36967i(float f) {
        if (this.f2346n != f) {
            m36948o();
            this.f2346n = f;
            m36947p();
        }
    }

    /* renamed from: j */
    public int m36964j() {
        View view = this.f2335c.get();
        if (view == null) {
            return 0;
        }
        return view.getScrollY();
    }

    /* renamed from: j */
    public void m36963j(float f) {
        if (this.f2347o != f) {
            m36948o();
            this.f2347o = f;
            m36947p();
        }
    }

    /* renamed from: k */
    public float m36960k() {
        return this.f2346n;
    }

    /* renamed from: k */
    public void m36959k(float f) {
        View view = this.f2335c.get();
        if (view != null) {
            m36967i(f - view.getLeft());
        }
    }

    /* renamed from: l */
    public float m36956l() {
        return this.f2347o;
    }

    /* renamed from: l */
    public void m36955l(float f) {
        View view = this.f2335c.get();
        if (view != null) {
            m36963j(f - view.getTop());
        }
    }

    /* renamed from: m */
    public float m36952m() {
        View view = this.f2335c.get();
        if (view == null) {
            return 0.0f;
        }
        return view.getLeft() + this.f2346n;
    }

    /* renamed from: n */
    public float m36950n() {
        View view = this.f2335c.get();
        if (view == null) {
            return 0.0f;
        }
        return view.getTop() + this.f2347o;
    }
}
