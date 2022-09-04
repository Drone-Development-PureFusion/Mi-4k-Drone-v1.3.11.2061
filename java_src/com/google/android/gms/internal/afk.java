package com.google.android.gms.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.C3424R;
import com.google.android.gms.cast.framework.AbstractC4262h;
/* loaded from: classes2.dex */
public class afk extends RelativeLayout implements AbstractC4262h {

    /* renamed from: a */
    private final boolean f21455a;

    /* renamed from: b */
    private Activity f21456b;

    /* renamed from: c */
    private int f21457c;

    /* renamed from: d */
    private boolean f21458d;

    /* renamed from: e */
    private AbstractC4262h.AbstractC4264b f21459e;

    /* renamed from: f */
    private final C6270a f21460f;

    /* renamed from: com.google.android.gms.internal.afk$a */
    /* loaded from: classes2.dex */
    private static class C6270a {

        /* renamed from: a */
        public int f21463a;

        /* renamed from: b */
        public int f21464b;

        /* renamed from: c */
        public Paint f21465c;

        /* renamed from: d */
        public float f21466d;

        private C6270a() {
        }
    }

    public afk(AbstractC4262h.C4263a c4263a) {
        this(c4263a, null, C3424R.attr.castIntroOverlayStyle);
    }

    @TargetApi(14)
    public afk(AbstractC4262h.C4263a c4263a, AttributeSet attributeSet, int i) {
        super(c4263a.m24811b(), attributeSet, i);
        this.f21456b = c4263a.m24811b();
        this.f21455a = c4263a.m24803f();
        this.f21459e = c4263a.m24806d();
        TypedArray obtainStyledAttributes = this.f21456b.getTheme().obtainStyledAttributes(attributeSet, C3424R.styleable.CastIntroOverlay, i, C3424R.style.CastIntroOverlay);
        if (c4263a.m24808c() != null) {
            Rect rect = new Rect();
            c4263a.m24808c().getGlobalVisibleRect(rect);
            this.f21460f = new C6270a();
            this.f21460f.f21463a = rect.centerX();
            this.f21460f.f21464b = rect.centerY();
            this.f21460f.f21465c = m17775c();
            this.f21460f.f21466d = c4263a.m24800i();
            if (this.f21460f.f21466d == 0.0f) {
                this.f21460f.f21466d = obtainStyledAttributes.getDimension(C3424R.styleable.CastIntroOverlay_castFocusRadius, 0.0f);
            }
        } else {
            this.f21460f = null;
        }
        LayoutInflater.from(this.f21456b).inflate(C3424R.layout.cast_intro_overlay, this);
        this.f21457c = c4263a.m24804e();
        if (this.f21457c == 0) {
            this.f21457c = obtainStyledAttributes.getColor(C3424R.styleable.CastIntroOverlay_castBackgroundColor, Color.argb(0, 0, 0, 0));
        }
        TextView textView = (TextView) findViewById(C3424R.C3426id.textTitle);
        if (!TextUtils.isEmpty(c4263a.m24802g())) {
            textView.setText(c4263a.m24802g());
            int resourceId = obtainStyledAttributes.getResourceId(C3424R.styleable.CastIntroOverlay_castTitleTextAppearance, 0);
            if (resourceId != 0) {
                textView.setTextAppearance(this.f21456b, resourceId);
            }
        }
        m17777a(c4263a.m24801h(), obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        if (Build.VERSION.SDK_INT >= 14) {
            setFitsSystemWindows(true);
        }
    }

    @TargetApi(11)
    /* renamed from: a */
    private void m17777a(String str, TypedArray typedArray) {
        if (TextUtils.isEmpty(str)) {
            str = typedArray.getString(C3424R.styleable.CastIntroOverlay_castButtonText);
        }
        int color = typedArray.getColor(C3424R.styleable.CastIntroOverlay_castButtonBackgroundColor, Color.argb(0, 0, 0, 0));
        Button button = (Button) findViewById(C3424R.C3426id.button);
        button.setText(str);
        button.getBackground().setColorFilter(color, PorterDuff.Mode.MULTIPLY);
        int resourceId = typedArray.getResourceId(C3424R.styleable.CastIntroOverlay_castButtonTextAppearance, 0);
        if (resourceId != 0) {
            button.setTextAppearance(this.f21456b, resourceId);
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.gms.internal.afk.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (Build.VERSION.SDK_INT < 16) {
                    afk.this.m17774d();
                    return;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", 0.0f);
                ofFloat.setDuration(400L).addListener(new AnimatorListenerAdapter() { // from class: com.google.android.gms.internal.afk.1.1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        afk.this.m17774d();
                    }
                });
                ofFloat.start();
            }
        });
    }

    /* renamed from: c */
    private Paint m17775c() {
        PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.MULTIPLY);
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setAlpha(0);
        paint.setXfermode(porterDuffXfermode);
        paint.setAntiAlias(true);
        return paint;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m17774d() {
        AbstractC4262h.C4265c.m24797a(this.f21456b);
        if (this.f21459e != null) {
            this.f21459e.m24798a();
            this.f21459e = null;
        }
        mo17776b();
    }

    @Override // com.google.android.gms.cast.framework.AbstractC4262h
    /* renamed from: a */
    public void mo17779a() {
        if (this.f21456b != null && !afj.m17788a(this.f21456b)) {
            if (this.f21455a && AbstractC4262h.C4265c.m24796b(this.f21456b)) {
                this.f21456b = null;
                this.f21459e = null;
            } else if (this.f21458d) {
            } else {
                this.f21458d = true;
                ((ViewGroup) this.f21456b.getWindow().getDecorView()).addView(this);
            }
        }
    }

    @Override // com.google.android.gms.cast.framework.AbstractC4262h
    /* renamed from: b */
    public void mo17776b() {
        if (this.f21456b != null) {
            ((ViewGroup) this.f21456b.getWindow().getDecorView()).removeView(this);
            this.f21456b = null;
        }
        this.f21459e = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(createBitmap);
        canvas2.drawColor(this.f21457c);
        if (this.f21460f != null) {
            canvas2.drawCircle(this.f21460f.f21463a, this.f21460f.f21464b, this.f21460f.f21466d, this.f21460f.f21465c);
        }
        canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
        createBitmap.recycle();
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        if (this.f21456b != null) {
            this.f21456b = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }
}
