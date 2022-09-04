package com.fimi.soul.view.myhorizontalseebar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewDebug;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.biz.camera.C1831e;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class ProgressBar extends View {

    /* renamed from: a */
    private static final int f13055a = 10000;

    /* renamed from: b */
    private static final int f13056b = 200;

    /* renamed from: A */
    private boolean f13057A;

    /* renamed from: B */
    private Interpolator f13058B;

    /* renamed from: C */
    private RunnableC3298c f13059C;

    /* renamed from: D */
    private long f13060D;

    /* renamed from: E */
    private boolean f13061E;

    /* renamed from: F */
    private boolean f13062F;

    /* renamed from: G */
    private boolean f13063G;

    /* renamed from: H */
    private boolean f13064H;

    /* renamed from: I */
    private final ArrayList<C3296b> f13065I;

    /* renamed from: J */
    private RunnableC3295a f13066J;

    /* renamed from: c */
    int f13067c;

    /* renamed from: d */
    int f13068d;

    /* renamed from: e */
    int f13069e;

    /* renamed from: f */
    int f13070f;

    /* renamed from: g */
    Bitmap f13071g;

    /* renamed from: h */
    protected int f13072h;

    /* renamed from: i */
    protected int f13073i;

    /* renamed from: j */
    protected int f13074j;

    /* renamed from: k */
    protected int f13075k;

    /* renamed from: l */
    protected int f13076l;

    /* renamed from: m */
    protected int f13077m;

    /* renamed from: n */
    private int f13078n;

    /* renamed from: o */
    private int f13079o;

    /* renamed from: p */
    private int f13080p;

    /* renamed from: q */
    private int f13081q;

    /* renamed from: r */
    private int f13082r;

    /* renamed from: s */
    private boolean f13083s;

    /* renamed from: t */
    private boolean f13084t;

    /* renamed from: u */
    private Transformation f13085u;

    /* renamed from: v */
    private AlphaAnimation f13086v;

    /* renamed from: w */
    private boolean f13087w;

    /* renamed from: x */
    private Drawable f13088x;

    /* renamed from: y */
    private Drawable f13089y;

    /* renamed from: z */
    private Drawable f13090z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.fimi.soul.view.myhorizontalseebar.ProgressBar.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };

        /* renamed from: a */
        int f13091a;

        /* renamed from: b */
        int f13092b;

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f13091a = parcel.readInt();
            this.f13092b = parcel.readInt();
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f13091a);
            parcel.writeInt(this.f13092b);
        }
    }

    /* renamed from: com.fimi.soul.view.myhorizontalseebar.ProgressBar$a */
    /* loaded from: classes2.dex */
    private class RunnableC3295a implements Runnable {
        private RunnableC3295a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ProgressBar.this.sendAccessibilityEvent(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.fimi.soul.view.myhorizontalseebar.ProgressBar$b */
    /* loaded from: classes2.dex */
    public static class C3296b implements AbstractC3302c<C3296b> {

        /* renamed from: f */
        private static final int f13094f = 24;

        /* renamed from: g */
        private static final AbstractC3301b<C3296b> f13095g = C3304e.m28382a(C3304e.m28379a(new AbstractC3303d<C3296b>() { // from class: com.fimi.soul.view.myhorizontalseebar.ProgressBar.b.1
            @Override // com.fimi.soul.view.myhorizontalseebar.AbstractC3303d
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo28384a(C3296b c3296b) {
            }

            @Override // com.fimi.soul.view.myhorizontalseebar.AbstractC3303d
            /* renamed from: b */
            public C3296b mo28385a() {
                return new C3296b();
            }

            @Override // com.fimi.soul.view.myhorizontalseebar.AbstractC3303d
            /* renamed from: b  reason: avoid collision after fix types in other method */
            public void mo28383b(C3296b c3296b) {
            }
        }, 24));

        /* renamed from: a */
        public int f13096a;

        /* renamed from: b */
        public int f13097b;

        /* renamed from: c */
        public boolean f13098c;

        /* renamed from: d */
        private C3296b f13099d;

        /* renamed from: e */
        private boolean f13100e;

        private C3296b() {
        }

        /* renamed from: a */
        public static C3296b m28402a(int i, int i2, boolean z) {
            C3296b mo28378a = f13095g.mo28378a();
            mo28378a.f13096a = i;
            mo28378a.f13097b = i2;
            mo28378a.f13098c = z;
            return mo28378a;
        }

        @Override // com.fimi.soul.view.myhorizontalseebar.AbstractC3302c
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo28388a(C3296b c3296b) {
            this.f13099d = c3296b;
        }

        @Override // com.fimi.soul.view.myhorizontalseebar.AbstractC3302c
        /* renamed from: a */
        public void mo28387a(boolean z) {
            this.f13100e = z;
        }

        @Override // com.fimi.soul.view.myhorizontalseebar.AbstractC3302c
        /* renamed from: b */
        public boolean mo28386b() {
            return this.f13100e;
        }

        /* renamed from: c */
        public void m28400c() {
            f13095g.mo28377a(this);
        }

        @Override // com.fimi.soul.view.myhorizontalseebar.AbstractC3302c
        /* renamed from: d */
        public C3296b mo28389a() {
            return this.f13099d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.fimi.soul.view.myhorizontalseebar.ProgressBar$c */
    /* loaded from: classes2.dex */
    public class RunnableC3298c implements Runnable {
        private RunnableC3298c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (ProgressBar.this) {
                int size = ProgressBar.this.f13065I.size();
                for (int i = 0; i < size; i++) {
                    C3296b c3296b = (C3296b) ProgressBar.this.f13065I.get(i);
                    ProgressBar.this.m28419a(c3296b.f13096a, c3296b.f13097b, c3296b.f13098c, true);
                    c3296b.m28400c();
                }
                ProgressBar.this.f13065I.clear();
                ProgressBar.this.f13064H = false;
            }
        }
    }

    public ProgressBar(Context context) {
        this(context, null);
    }

    public ProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842871);
    }

    public ProgressBar(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        boolean z = false;
        this.f13065I = new ArrayList<>();
        this.f13060D = Thread.currentThread().getId();
        m28423a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1704R.styleable.ProgressBar, i, i2);
        this.f13057A = true;
        Drawable drawable = obtainStyledAttributes.getDrawable(6);
        if (drawable != null) {
            setProgressDrawable(m28415a(drawable, false));
        }
        this.f13082r = obtainStyledAttributes.getInt(7, this.f13082r);
        this.f13067c = obtainStyledAttributes.getDimensionPixelSize(4, this.f13067c);
        this.f13068d = obtainStyledAttributes.getDimensionPixelSize(0, this.f13068d);
        this.f13069e = obtainStyledAttributes.getDimensionPixelSize(5, this.f13069e);
        this.f13070f = obtainStyledAttributes.getDimensionPixelSize(1, this.f13070f);
        this.f13081q = obtainStyledAttributes.getInt(8, this.f13081q);
        setMax(obtainStyledAttributes.getInt(2, this.f13080p));
        setProgress(obtainStyledAttributes.getInt(3, this.f13078n));
        setSecondaryProgress(obtainStyledAttributes.getInt(9, this.f13079o));
        Drawable drawable2 = obtainStyledAttributes.getDrawable(10);
        if (drawable2 != null) {
            setIndeterminateDrawable(m28416a(drawable2));
        }
        this.f13084t = obtainStyledAttributes.getBoolean(11, this.f13084t);
        this.f13057A = false;
        setIndeterminate((this.f13084t || obtainStyledAttributes.getBoolean(12, this.f13083s)) ? true : z);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private Drawable m28416a(Drawable drawable) {
        if (drawable instanceof AnimationDrawable) {
            AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            AnimationDrawable animationDrawable2 = new AnimationDrawable();
            animationDrawable2.setOneShot(animationDrawable.isOneShot());
            for (int i = 0; i < numberOfFrames; i++) {
                Drawable m28415a = m28415a(animationDrawable.getFrame(i), true);
                m28415a.setLevel(10000);
                animationDrawable2.addFrame(m28415a, animationDrawable.getDuration(i));
            }
            animationDrawable2.setLevel(10000);
            return animationDrawable2;
        }
        return drawable;
    }

    /* renamed from: a */
    private Drawable m28415a(Drawable drawable, boolean z) {
        if (!(drawable instanceof LayerDrawable)) {
            if (drawable instanceof StateListDrawable) {
                StateListDrawable stateListDrawable = (StateListDrawable) drawable;
                return new StateListDrawable();
            } else if (!(drawable instanceof BitmapDrawable)) {
                return drawable;
            } else {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                if (this.f13071g == null) {
                    this.f13071g = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(getDrawableShape());
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        Drawable[] drawableArr = new Drawable[numberOfLayers];
        for (int i = 0; i < numberOfLayers; i++) {
            int id = layerDrawable.getId(i);
            drawableArr[i] = m28415a(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
        for (int i2 = 0; i2 < numberOfLayers; i2++) {
            layerDrawable2.setId(i2, layerDrawable.getId(i2));
        }
        return layerDrawable2;
    }

    /* renamed from: a */
    private void m28423a() {
        this.f13080p = 100;
        this.f13078n = 0;
        this.f13079o = 0;
        this.f13083s = false;
        this.f13084t = false;
        this.f13082r = 4000;
        this.f13081q = 1;
        this.f13067c = 24;
        this.f13068d = 48;
        this.f13069e = 24;
        this.f13070f = 48;
    }

    /* renamed from: a */
    private void m28421a(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i - (this.f13075k + this.f13074j);
        int i8 = i2 - (this.f13076l + this.f13077m);
        if (this.f13088x != null) {
            if (this.f13084t && !(this.f13088x instanceof AnimationDrawable)) {
                float intrinsicWidth = this.f13088x.getIntrinsicWidth() / this.f13088x.getIntrinsicHeight();
                float f = i7 / i8;
                if (intrinsicWidth != f) {
                    if (f > intrinsicWidth) {
                        int i9 = (int) (intrinsicWidth * i8);
                        i5 = (i7 - i9) / 2;
                        i3 = i5 + i9;
                        i4 = i8;
                        i6 = 0;
                    } else {
                        int i10 = (int) ((1.0f / intrinsicWidth) * i7);
                        int i11 = (i8 - i10) / 2;
                        int i12 = i11 + i10;
                        i3 = i7;
                        i4 = i12;
                        i6 = i11;
                        i5 = 0;
                    }
                    this.f13088x.setBounds(i5, i6, i3, i4);
                }
            }
            i5 = 0;
            i3 = i7;
            i4 = i8;
            i6 = 0;
            this.f13088x.setBounds(i5, i6, i3, i4);
        } else {
            i3 = i7;
            i4 = i8;
        }
        if (this.f13089y != null) {
            this.f13089y.setBounds(0, 0, i3, i4);
        }
    }

    /* renamed from: a */
    private synchronized void m28420a(int i, int i2, boolean z) {
        if (this.f13060D == Thread.currentThread().getId()) {
            m28419a(i, i2, z, true);
        } else {
            if (this.f13059C == null) {
                this.f13059C = new RunnableC3298c();
            }
            this.f13065I.add(C3296b.m28402a(i, i2, z));
            if (this.f13063G && !this.f13064H) {
                post(this.f13059C);
                this.f13064H = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m28419a(int i, int i2, boolean z, boolean z2) {
        float f = this.f13080p > 0 ? i2 / this.f13080p : 0.0f;
        Drawable drawable = this.f13090z;
        if (drawable != null) {
            Drawable drawable2 = null;
            if (drawable instanceof LayerDrawable) {
                drawable2 = ((LayerDrawable) drawable).findDrawableByLayerId(i);
            }
            int i3 = (int) (10000.0f * f);
            if (drawable2 != null) {
                drawable = drawable2;
            }
            drawable.setLevel(i3);
        } else {
            invalidate();
        }
        if (z2 && i == 16908301) {
            mo28394a(f, z);
        }
    }

    /* renamed from: b */
    private void m28411b() {
        int[] drawableState = getDrawableState();
        if (this.f13089y != null && this.f13089y.isStateful()) {
            this.f13089y.setState(drawableState);
        }
        if (this.f13088x == null || !this.f13088x.isStateful()) {
            return;
        }
        this.f13088x.setState(drawableState);
    }

    /* renamed from: c */
    private void m28409c() {
        if (this.f13066J == null) {
            this.f13066J = new RunnableC3295a();
        } else {
            removeCallbacks(this.f13066J);
        }
        postDelayed(this.f13066J, 200L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo28394a(float f, boolean z) {
    }

    /* renamed from: a */
    public void mo28422a(int i) {
        Drawable drawable = this.f13090z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void m28418a(int i, boolean z) {
        if (!this.f13083s) {
            int i2 = i < 0 ? 0 : i;
            if (i2 > this.f13080p) {
                i2 = this.f13080p;
            }
            if (i2 != this.f13078n) {
                this.f13078n = i2;
                m28420a(16908301, this.f13078n, z);
            }
        }
    }

    /* renamed from: a */
    public void m28417a(Context context, int i) {
        setInterpolator(AnimationUtils.loadInterpolator(context, i));
    }

    /* renamed from: b */
    public final synchronized void m28410b(int i) {
        setProgress(this.f13078n + i);
    }

    /* renamed from: c */
    public final synchronized void m28408c(int i) {
        setSecondaryProgress(this.f13079o + i);
    }

    @ViewDebug.ExportedProperty(category = C1831e.f4884be)
    /* renamed from: d */
    public synchronized boolean m28407d() {
        return this.f13083s;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        m28411b();
    }

    /* renamed from: e */
    void m28406e() {
        if (getVisibility() != 0) {
            return;
        }
        if (this.f13088x instanceof Animatable) {
            this.f13061E = true;
            this.f13087w = false;
        } else {
            this.f13087w = true;
            if (this.f13058B == null) {
                this.f13058B = new LinearInterpolator();
            }
            if (this.f13085u == null) {
                this.f13085u = new Transformation();
            } else {
                this.f13085u.clear();
            }
            if (this.f13086v == null) {
                this.f13086v = new AlphaAnimation(0.0f, 1.0f);
            } else {
                this.f13086v.reset();
            }
            this.f13086v.setRepeatMode(this.f13081q);
            this.f13086v.setRepeatCount(-1);
            this.f13086v.setDuration(this.f13082r);
            this.f13086v.setInterpolator(this.f13058B);
            this.f13086v.setStartTime(-1L);
        }
        postInvalidate();
    }

    /* renamed from: f */
    void m28405f() {
        this.f13087w = false;
        if (this.f13088x instanceof Animatable) {
            ((Animatable) this.f13088x).stop();
            this.f13061E = false;
        }
        postInvalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Drawable getCurrentDrawable() {
        return this.f13090z;
    }

    Shape getDrawableShape() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    public Drawable getIndeterminateDrawable() {
        return this.f13088x;
    }

    public Interpolator getInterpolator() {
        return this.f13058B;
    }

    @ViewDebug.ExportedProperty(category = C1831e.f4884be)
    public synchronized int getMax() {
        return this.f13080p;
    }

    @ViewDebug.ExportedProperty(category = C1831e.f4884be)
    public synchronized int getProgress() {
        return this.f13083s ? 0 : this.f13078n;
    }

    public Drawable getProgressDrawable() {
        return this.f13089y;
    }

    @ViewDebug.ExportedProperty(category = C1831e.f4884be)
    public synchronized int getSecondaryProgress() {
        return this.f13083s ? 0 : this.f13079o;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        if (!this.f13062F) {
            if (!verifyDrawable(drawable)) {
                super.invalidateDrawable(drawable);
                return;
            }
            Rect bounds = drawable.getBounds();
            int i = this.f13072h + this.f13074j;
            int i2 = this.f13073i + this.f13076l;
            invalidate(bounds.left + i, bounds.top + i2, i + bounds.right, bounds.bottom + i2);
        }
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.f13089y != null) {
            this.f13089y.jumpToCurrentState();
        }
        if (this.f13088x != null) {
            this.f13088x.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f13083s) {
            m28406e();
        }
        if (this.f13065I != null) {
            synchronized (this) {
                int size = this.f13065I.size();
                for (int i = 0; i < size; i++) {
                    C3296b c3296b = this.f13065I.get(i);
                    m28419a(c3296b.f13096a, c3296b.f13097b, c3296b.f13098c, true);
                    c3296b.m28400c();
                }
                this.f13065I.clear();
            }
        }
        this.f13063G = true;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        if (this.f13083s) {
            m28405f();
        }
        if (this.f13059C != null) {
            removeCallbacks(this.f13059C);
        }
        if (this.f13059C != null && this.f13064H) {
            removeCallbacks(this.f13059C);
        }
        if (this.f13066J != null) {
            removeCallbacks(this.f13066J);
        }
        super.onDetachedFromWindow();
        this.f13063G = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable = this.f13090z;
        if (drawable != null) {
            canvas.save();
            canvas.translate(this.f13074j, this.f13076l);
            long drawingTime = getDrawingTime();
            if (this.f13087w) {
                this.f13086v.getTransformation(drawingTime, this.f13085u);
                float alpha = this.f13085u.getAlpha();
                this.f13062F = true;
                drawable.setLevel((int) (alpha * 10000.0f));
                this.f13062F = false;
                postInvalidateOnAnimation();
            }
            drawable.draw(canvas);
            canvas.restore();
            if (this.f13061E && (drawable instanceof Animatable)) {
                ((Animatable) drawable).start();
                this.f13061E = false;
            }
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ProgressBar.class.getName());
        accessibilityEvent.setItemCount(this.f13080p);
        accessibilityEvent.setCurrentItemIndex(this.f13078n);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ProgressBar.class.getName());
    }

    @Override // android.view.View
    protected synchronized void onMeasure(int i, int i2) {
        int i3;
        int i4 = 0;
        synchronized (this) {
            Drawable drawable = this.f13090z;
            if (drawable != null) {
                i3 = Math.max(this.f13067c, Math.min(this.f13068d, drawable.getIntrinsicWidth()));
                i4 = Math.max(this.f13069e, Math.min(this.f13070f, drawable.getIntrinsicHeight()));
            } else {
                i3 = 0;
            }
            m28411b();
            setMeasuredDimension(resolveSizeAndState(i3 + this.f13074j + this.f13075k, i, 0), resolveSizeAndState(i4 + this.f13076l + this.f13077m, i2, 0));
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setProgress(savedState.f13091a);
        setSecondaryProgress(savedState.f13092b);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f13091a = this.f13078n;
        savedState.f13092b = this.f13079o;
        return savedState;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        m28421a(i, i2);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (this.f13083s) {
            if (i == 8 || i == 4) {
                m28405f();
            } else {
                m28406e();
            }
        }
    }

    @Override // android.view.View
    public void postInvalidate() {
        if (!this.f13057A) {
            super.postInvalidate();
        }
    }

    public synchronized void setIndeterminate(boolean z) {
        if ((!this.f13084t || !this.f13083s) && z != this.f13083s) {
            this.f13083s = z;
            if (z) {
                this.f13090z = this.f13088x;
                m28406e();
            } else {
                this.f13090z = this.f13089y;
                m28405f();
            }
        }
    }

    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
        }
        if (this.f13083s) {
            this.f13090z = drawable;
            postInvalidate();
        }
    }

    public void setInterpolator(Interpolator interpolator) {
        this.f13058B = interpolator;
    }

    public synchronized void setMax(int i) {
        if (i < 0) {
            i = 0;
        }
        if (i != this.f13080p) {
            this.f13080p = i;
            postInvalidate();
            if (this.f13078n > i) {
                this.f13078n = i;
            }
            m28420a(16908301, this.f13078n, false);
        }
    }

    public synchronized void setProgress(int i) {
        m28418a(i, false);
    }

    public void setProgressDrawable(Drawable drawable) {
        boolean z;
        if (this.f13089y == null || drawable == this.f13089y) {
            z = false;
        } else {
            this.f13089y.setCallback(null);
            z = true;
        }
        if (drawable != null) {
            drawable.setCallback(this);
            int minimumHeight = drawable.getMinimumHeight();
            if (this.f13070f < minimumHeight) {
                this.f13070f = minimumHeight;
                requestLayout();
            }
        }
        this.f13089y = drawable;
        if (!this.f13083s) {
            this.f13090z = drawable;
            postInvalidate();
        }
        if (z) {
            m28421a(getWidth(), getHeight());
            m28411b();
            m28419a(16908301, this.f13078n, false, false);
            m28419a(16908303, this.f13079o, false, false);
        }
    }

    public synchronized void setSecondaryProgress(int i) {
        int i2 = 0;
        synchronized (this) {
            if (!this.f13083s) {
                if (i >= 0) {
                    i2 = i;
                }
                if (i2 > this.f13080p) {
                    i2 = this.f13080p;
                }
                if (i2 != this.f13079o) {
                    this.f13079o = i2;
                    m28420a(16908303, this.f13079o, false);
                }
            }
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (getVisibility() != i) {
            super.setVisibility(i);
            if (!this.f13083s) {
                return;
            }
            if (i == 8 || i == 4) {
                m28405f();
            } else {
                m28406e();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return drawable == this.f13089y || drawable == this.f13088x || super.verifyDrawable(drawable);
    }
}
