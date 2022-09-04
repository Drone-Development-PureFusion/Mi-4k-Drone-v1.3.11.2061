package com.fimi.soul.module.droneFragment;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.utils.C3125i;
import java.util.Iterator;
/* loaded from: classes.dex */
public class SectorProgressBar extends View {

    /* renamed from: d */
    private static int f8397d = 944;

    /* renamed from: e */
    private static final int f8398e = 10;

    /* renamed from: c */
    ObjectAnimator f8401c;

    /* renamed from: k */
    private Paint f8407k;

    /* renamed from: m */
    private int f8409m;

    /* renamed from: n */
    private int f8410n;

    /* renamed from: p */
    private Context f8412p;

    /* renamed from: s */
    private AnimatorSet f8415s;

    /* renamed from: f */
    private Bitmap f8402f = null;

    /* renamed from: g */
    private float f8403g = 0.0f;

    /* renamed from: h */
    private float f8404h = 40.0f;

    /* renamed from: i */
    private RectF f8405i = null;

    /* renamed from: j */
    private PorterDuffXfermode f8406j = null;

    /* renamed from: l */
    private EnumC2567a f8408l = EnumC2567a.LeftBottom;

    /* renamed from: o */
    private boolean f8411o = false;

    /* renamed from: q */
    private float f8413q = 0.0f;

    /* renamed from: r */
    private float f8414r = 0.0f;

    /* renamed from: a */
    boolean f8399a = true;

    /* renamed from: b */
    float f8400b = 0.0f;

    /* renamed from: com.fimi.soul.module.droneFragment.SectorProgressBar$a */
    /* loaded from: classes.dex */
    public enum EnumC2567a {
        LeftTop,
        LeftBottom,
        RightTop,
        RightBottom,
        RightToplow,
        RightBottomSatt
    }

    public SectorProgressBar(Context context) {
        super(context);
        this.f8412p = context;
        m31211c();
    }

    public SectorProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8412p = context;
        m31211c();
    }

    public SectorProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8412p = context;
        m31211c();
    }

    /* renamed from: c */
    private void m31211c() {
        this.f8414r = getResources().getDisplayMetrics().density;
        this.f8407k = new Paint();
        this.f8407k.setAntiAlias(true);
        setLayerType(2, this.f8407k);
        f8397d = (getResources().getDisplayMetrics().widthPixels / 2) - C3125i.m29081b(this.f8412p, 16.0f);
        setSectorProgressBarType(this.f8408l);
    }

    /* renamed from: a */
    public void m31216a() {
        if (this.f8415s != null) {
            Iterator<Animator> it2 = this.f8415s.getChildAnimations().iterator();
            while (it2.hasNext()) {
                it2.next().cancel();
            }
            this.f8415s.cancel();
            this.f8415s = null;
        }
    }

    /* renamed from: a */
    public void m31215a(float f) {
        if (this.f8401c == null) {
            this.f8401c = new ObjectAnimator();
            this.f8401c.setTarget(this);
            this.f8401c.setPropertyName("float");
            this.f8401c.setEvaluator(new FloatEvaluator());
            this.f8401c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.fimi.soul.module.droneFragment.SectorProgressBar.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    SectorProgressBar.this.f8413q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    SectorProgressBar.this.postInvalidate();
                }
            });
        }
        if (!this.f8401c.isRunning()) {
            this.f8401c.setObjectValues(Float.valueOf(this.f8400b), Float.valueOf(f));
            this.f8400b = f;
            this.f8401c.setDuration(200L);
            this.f8401c.start();
        }
    }

    /* renamed from: a */
    public void m31214a(int i, int i2) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this, "float", new FloatEvaluator(), Integer.valueOf(i2), 100);
        this.f8400b = this.f8413q;
        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.fimi.soul.module.droneFragment.SectorProgressBar.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                SectorProgressBar.this.f8413q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                SectorProgressBar.this.invalidate();
            }
        });
        ObjectAnimator ofObject2 = ObjectAnimator.ofObject(this, "float", new FloatEvaluator(), 100, Integer.valueOf(i2));
        ofObject2.setInterpolator(new OvershootInterpolator());
        ofObject2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.fimi.soul.module.droneFragment.SectorProgressBar.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                SectorProgressBar.this.f8413q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                SectorProgressBar.this.invalidate();
            }
        });
        this.f8415s = new AnimatorSet();
        this.f8415s.play(ofObject2).after(ofObject);
        this.f8415s.setDuration(i);
        this.f8415s.start();
    }

    /* renamed from: b */
    public void m31212b() {
        if (this.f8401c != null) {
            this.f8401c.cancel();
            this.f8401c = null;
        }
    }

    public float getProgress() {
        return this.f8413q;
    }

    public EnumC2567a getSectorProgressBarType() {
        return this.f8408l;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float f;
        this.f8409m = canvas.getWidth();
        this.f8410n = canvas.getHeight();
        if (!this.f8411o) {
            m31211c();
            this.f8411o = true;
        }
        switch (this.f8408l) {
            case RightToplow:
                this.f8406j = new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT);
                f = (((-this.f8413q) / 100.0f) * 50.0f) + 50.0f;
                break;
            case LeftBottom:
                this.f8406j = new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT);
                f = (((-this.f8413q) / 100.0f) * 50.0f) + 50.0f;
                break;
            case RightBottomSatt:
                this.f8406j = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
                f = (this.f8413q / 100.0f) * 50.0f;
                break;
            case RightBottom:
                this.f8406j = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
                f = (this.f8413q / 100.0f) * 50.0f;
                break;
            case RightTop:
                this.f8406j = new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT);
                f = (((-this.f8413q) / 100.0f) * 50.0f) + 50.0f;
                break;
            case LeftTop:
                this.f8406j = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
                f = (this.f8413q / 500.0f) * 50.0f;
                break;
            default:
                f = 0.0f;
                break;
        }
        RectF rectF = new RectF(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        canvas.drawArc(this.f8405i, this.f8403g, this.f8404h + f, true, this.f8407k);
        this.f8407k.setXfermode(this.f8406j);
        canvas.drawBitmap(this.f8402f, (Rect) null, rectF, this.f8407k);
        if (this.f8402f != null && this.f8402f.isRecycled()) {
            this.f8402f.recycle();
        }
        this.f8407k.setXfermode(null);
        if (this.f8399a) {
            this.f8399a = false;
            m31215a(100.0f);
        }
    }

    public void setProgress(float f) {
        this.f8413q = f;
    }

    public void setSectorProgressBarType(EnumC2567a enumC2567a) {
        switch (enumC2567a) {
            case RightToplow:
                this.f8405i = new RectF((this.f8409m - 10) - (f8397d * 2), (-f8397d) + this.f8410n, this.f8409m - 10, f8397d + this.f8410n);
                this.f8402f = BitmapFactory.decodeResource(getResources(), C1704R.C1705drawable.lowpower);
                this.f8403g = -90.0f;
                this.f8404h = 40.0f;
                break;
            case LeftBottom:
                this.f8405i = new RectF(10.0f, -f8397d, (f8397d * 2) + 10, f8397d);
                this.f8402f = BitmapFactory.decodeResource(getResources(), C1704R.C1705drawable.distance);
                this.f8403g = 90.0f;
                this.f8404h = 40.0f;
                break;
            case RightBottomSatt:
                this.f8405i = new RectF((this.f8409m - 10) - (f8397d * 2), -f8397d, this.f8409m - 10, f8397d);
                this.f8402f = BitmapFactory.decodeResource(getResources(), C1704R.C1705drawable.gpssign);
                this.f8403g = 0.0f;
                this.f8404h = 0.0f;
                break;
            case RightBottom:
                this.f8405i = new RectF((this.f8409m - 10) - (f8397d * 2), -f8397d, this.f8409m - 10, f8397d);
                this.f8402f = BitmapFactory.decodeResource(getResources(), C1704R.C1705drawable.sign);
                this.f8403g = 0.0f;
                this.f8404h = 0.0f;
                break;
            case RightTop:
                this.f8405i = new RectF((this.f8409m - 10) - (f8397d * 2), (-f8397d) + this.f8410n, this.f8409m - 10, f8397d + this.f8410n);
                this.f8402f = BitmapFactory.decodeResource(getResources(), C1704R.C1705drawable.fullpower);
                this.f8403g = -90.0f;
                this.f8404h = 40.0f;
                break;
            case LeftTop:
                this.f8405i = new RectF(10.0f, (-f8397d) + this.f8410n, (f8397d * 2) + 10, this.f8410n + f8397d);
                this.f8402f = BitmapFactory.decodeResource(getResources(), C1704R.C1705drawable.hight);
                this.f8403g = 180.0f;
                this.f8404h = 0.0f;
                break;
        }
        this.f8408l = enumC2567a;
    }
}
