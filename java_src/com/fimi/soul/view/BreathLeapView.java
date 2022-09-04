package com.fimi.soul.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.fimi.kernel.utils.C1675p;
import com.fimi.overseas.soul.C1704R;
import it.p273a.p274a.AbstractC10866e;
/* loaded from: classes.dex */
public class BreathLeapView extends View {

    /* renamed from: a */
    private float f11961a;

    /* renamed from: b */
    private float f11962b;

    /* renamed from: c */
    private Paint f11963c;

    /* renamed from: d */
    private Paint f11964d;

    /* renamed from: e */
    private Paint f11965e;

    /* renamed from: f */
    private Paint f11966f;

    /* renamed from: g */
    private Paint f11967g;

    /* renamed from: h */
    private Paint f11968h;

    /* renamed from: i */
    private Paint f11969i;

    /* renamed from: j */
    private Paint f11970j;

    /* renamed from: k */
    private Paint f11971k;

    /* renamed from: l */
    private Paint f11972l;

    /* renamed from: m */
    private Bitmap f11973m;

    /* renamed from: n */
    private Bitmap f11974n;

    /* renamed from: o */
    private Bitmap f11975o;

    /* renamed from: p */
    private int f11976p;

    /* renamed from: q */
    private float f11977q;

    public BreathLeapView(Context context) {
        super(context, null);
        this.f11976p = 0;
        this.f11977q = 0.0f;
    }

    public BreathLeapView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.f11963c = new Paint();
        this.f11964d = new Paint();
        this.f11965e = new Paint();
        this.f11966f = new Paint();
        this.f11967g = new Paint();
        this.f11968h = new Paint();
        this.f11969i = new Paint();
        this.f11970j = new Paint();
        this.f11971k = new Paint();
        this.f11972l = new Paint();
        setBackgroundResource(C1704R.C1705drawable.check_connect_bg);
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), C1704R.C1705drawable.connent_on);
        Bitmap decodeResource2 = BitmapFactory.decodeResource(getResources(), C1704R.C1705drawable.round);
        Bitmap decodeResource3 = BitmapFactory.decodeResource(getResources(), C1704R.C1705drawable.connent);
        float m34624b = ((C1675p.m34624b(context) < ((float) C1675p.m34635a(context)) ? C1675p.m34624b(context) : C1675p.m34635a(context)) * 0.4925f) / decodeResource3.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(m34624b, m34624b);
        this.f11973m = Bitmap.createBitmap(decodeResource3, 0, 0, decodeResource3.getWidth(), decodeResource3.getWidth(), matrix, true);
        this.f11974n = Bitmap.createBitmap(decodeResource, 0, 0, decodeResource.getWidth(), decodeResource.getWidth(), matrix, true);
        this.f11975o = Bitmap.createBitmap(decodeResource2, 0, 0, decodeResource2.getWidth(), decodeResource2.getWidth(), matrix, true);
        this.f11977q = context.getResources().getDimension(C1704R.dimen.unit);
        if (decodeResource != null && !decodeResource.isRecycled()) {
            decodeResource.isRecycled();
        }
        if (decodeResource2 != null && !decodeResource2.isRecycled()) {
            decodeResource2.isRecycled();
        }
        if (decodeResource3 == null || decodeResource3.isRecycled()) {
            return;
        }
        decodeResource3.isRecycled();
    }

    public BreathLeapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11976p = 0;
        this.f11977q = 0.0f;
    }

    /* renamed from: b */
    private void m28962b() {
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 255, 0);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.fimi.soul.view.BreathLeapView.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BreathLeapView.this.f11976p = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                BreathLeapView.this.invalidate();
            }
        });
        ofInt.setDuration(400L);
        ofInt.start();
    }

    /* renamed from: c */
    private void m28960c() {
        ValueAnimator ofInt = ValueAnimator.ofInt(255, 255, 50);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.fimi.soul.view.BreathLeapView.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i = 50;
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                BreathLeapView.this.f11967g.setAlpha(intValue + (-155) > 50 ? intValue - 155 : 50);
                BreathLeapView.this.f11968h.setAlpha(intValue + (-105) > 50 ? intValue - 100 : 50);
                BreathLeapView.this.f11969i.setAlpha(intValue + (-55) > 50 ? intValue - 50 : 50);
                Paint paint = BreathLeapView.this.f11970j;
                if (intValue > 50) {
                    i = intValue;
                }
                paint.setAlpha(i);
                BreathLeapView.this.invalidate();
            }
        });
        ofInt.setDuration(300L);
        ofInt.start();
    }

    /* renamed from: a */
    public void m28965a() {
        if (this.f11974n != null && !this.f11974n.isRecycled()) {
            this.f11974n.recycle();
            this.f11974n = null;
        }
        if (this.f11975o != null && !this.f11975o.isRecycled()) {
            this.f11975o.recycle();
            this.f11975o = null;
        }
        if (this.f11973m == null || this.f11973m.isRecycled()) {
            return;
        }
        this.f11973m.recycle();
        this.f11973m = null;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f11972l.setAlpha(this.f11976p);
        canvas.drawBitmap(this.f11974n, (this.f11961a / 2.0f) - (this.f11974n.getWidth() / 2), ((this.f11962b * 0.15f) + (this.f11973m.getHeight() / 2)) - (this.f11974n.getHeight() / 2), this.f11972l);
        canvas.drawBitmap(this.f11973m, (this.f11961a / 2.0f) - (this.f11973m.getWidth() / 2), this.f11962b * 0.15f, this.f11971k);
        canvas.drawBitmap(this.f11975o, ((this.f11961a / 2.0f) - (this.f11974n.getWidth() / 2)) - (this.f11977q * 8.0f), ((this.f11962b * 0.15f) + (this.f11973m.getHeight() / 2)) - (this.f11975o.getHeight() / 2), this.f11970j);
        canvas.drawBitmap(this.f11975o, (((this.f11961a / 2.0f) - (this.f11974n.getWidth() / 2)) - (this.f11977q * 8.0f)) - (this.f11977q * 10.0f), ((this.f11962b * 0.15f) + (this.f11973m.getHeight() / 2)) - (this.f11975o.getHeight() / 2), this.f11969i);
        canvas.drawBitmap(this.f11975o, (((this.f11961a / 2.0f) - (this.f11974n.getWidth() / 2)) - (this.f11977q * 8.0f)) - (this.f11977q * 20.0f), ((this.f11962b * 0.15f) + (this.f11973m.getHeight() / 2)) - (this.f11975o.getHeight() / 2), this.f11968h);
        canvas.drawBitmap(this.f11975o, (((this.f11961a / 2.0f) - (this.f11974n.getWidth() / 2)) - (this.f11977q * 8.0f)) - (this.f11977q * 30.0f), ((this.f11962b * 0.15f) + (this.f11973m.getHeight() / 2)) - (this.f11975o.getHeight() / 2), this.f11967g);
        canvas.drawBitmap(this.f11975o, (((this.f11961a / 2.0f) - (this.f11974n.getWidth() / 2)) - (this.f11977q * 8.0f)) - (this.f11977q * 40.0f), ((this.f11962b * 0.15f) + (this.f11973m.getHeight() / 2)) - (this.f11975o.getHeight() / 2), this.f11966f);
        canvas.drawBitmap(this.f11975o, (((this.f11961a / 2.0f) - (this.f11974n.getWidth() / 2)) - (this.f11977q * 8.0f)) - (this.f11977q * 50.0f), ((this.f11962b * 0.15f) + (this.f11973m.getHeight() / 2)) - (this.f11975o.getHeight() / 2), this.f11965e);
        canvas.drawBitmap(this.f11975o, (((this.f11961a / 2.0f) - (this.f11974n.getWidth() / 2)) - (this.f11977q * 8.0f)) - (this.f11977q * 60.0f), ((this.f11962b * 0.15f) + (this.f11973m.getHeight() / 2)) - (this.f11975o.getHeight() / 2), this.f11964d);
        canvas.drawBitmap(this.f11975o, (((this.f11961a / 2.0f) - (this.f11974n.getWidth() / 2)) - (this.f11977q * 8.0f)) - (this.f11977q * 70.0f), ((this.f11962b * 0.15f) + (this.f11973m.getHeight() / 2)) - (this.f11975o.getHeight() / 2), this.f11963c);
        canvas.drawBitmap(this.f11975o, (this.f11961a / 2.0f) + (this.f11974n.getWidth() / 2) + (this.f11977q * 3.0f), ((this.f11962b * 0.15f) + (this.f11973m.getHeight() / 2)) - (this.f11975o.getHeight() / 2), this.f11970j);
        canvas.drawBitmap(this.f11975o, (this.f11961a / 2.0f) + (this.f11974n.getWidth() / 2) + (this.f11977q * 3.0f) + (this.f11977q * 10.0f), ((this.f11962b * 0.15f) + (this.f11973m.getHeight() / 2)) - (this.f11975o.getHeight() / 2), this.f11969i);
        canvas.drawBitmap(this.f11975o, (this.f11961a / 2.0f) + (this.f11974n.getWidth() / 2) + (this.f11977q * 3.0f) + (this.f11977q * 20.0f), ((this.f11962b * 0.15f) + (this.f11973m.getHeight() / 2)) - (this.f11975o.getHeight() / 2), this.f11968h);
        canvas.drawBitmap(this.f11975o, (this.f11961a / 2.0f) + (this.f11974n.getWidth() / 2) + (this.f11977q * 3.0f) + (this.f11977q * 30.0f), ((this.f11962b * 0.15f) + (this.f11973m.getHeight() / 2)) - (this.f11975o.getHeight() / 2), this.f11967g);
        canvas.drawBitmap(this.f11975o, (this.f11961a / 2.0f) + (this.f11974n.getWidth() / 2) + (this.f11977q * 3.0f) + (this.f11977q * 40.0f), ((this.f11962b * 0.15f) + (this.f11973m.getHeight() / 2)) - (this.f11975o.getHeight() / 2), this.f11966f);
        canvas.drawBitmap(this.f11975o, (this.f11961a / 2.0f) + (this.f11974n.getWidth() / 2) + (this.f11977q * 3.0f) + (this.f11977q * 50.0f), ((this.f11962b * 0.15f) + (this.f11973m.getHeight() / 2.0f)) - (this.f11975o.getHeight() / 2), this.f11965e);
        canvas.drawBitmap(this.f11975o, (this.f11961a / 2.0f) + (this.f11974n.getWidth() / 2) + (this.f11977q * 3.0f) + (this.f11977q * 60.0f), ((this.f11962b * 0.15f) + (this.f11973m.getHeight() / 2.0f)) - (this.f11975o.getHeight() / 2), this.f11964d);
        canvas.drawBitmap(this.f11975o, (this.f11961a / 2.0f) + (this.f11974n.getWidth() / 2) + (this.f11977q * 3.0f) + (this.f11977q * 70.0f), ((this.f11962b * 0.15f) + (this.f11973m.getHeight() / 2)) - (this.f11975o.getHeight() / 2), this.f11963c);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f11961a = getMeasuredWidth();
        this.f11962b = getMeasuredHeight();
    }

    public void setting(int i) {
        switch (i) {
            case 0:
                this.f11963c.setAlpha(255);
                this.f11964d.setAlpha(50);
                this.f11965e.setAlpha(50);
                this.f11966f.setAlpha(50);
                this.f11967g.setAlpha(50);
                this.f11968h.setAlpha(50);
                this.f11969i.setAlpha(50);
                this.f11970j.setAlpha(50);
                break;
            case 1:
                this.f11963c.setAlpha(200);
                this.f11964d.setAlpha(255);
                this.f11965e.setAlpha(50);
                this.f11966f.setAlpha(50);
                this.f11967g.setAlpha(50);
                this.f11968h.setAlpha(50);
                this.f11969i.setAlpha(50);
                this.f11970j.setAlpha(50);
                break;
            case 2:
                this.f11963c.setAlpha(150);
                this.f11964d.setAlpha(200);
                this.f11965e.setAlpha(255);
                this.f11966f.setAlpha(50);
                this.f11967g.setAlpha(50);
                this.f11968h.setAlpha(50);
                this.f11969i.setAlpha(50);
                this.f11970j.setAlpha(50);
                break;
            case 3:
                this.f11963c.setAlpha(100);
                this.f11964d.setAlpha(150);
                this.f11965e.setAlpha(200);
                this.f11966f.setAlpha(255);
                this.f11967g.setAlpha(50);
                this.f11968h.setAlpha(50);
                this.f11969i.setAlpha(50);
                this.f11970j.setAlpha(50);
                break;
            case 4:
                this.f11963c.setAlpha(50);
                this.f11964d.setAlpha(100);
                this.f11965e.setAlpha(150);
                this.f11966f.setAlpha(200);
                this.f11967g.setAlpha(255);
                this.f11968h.setAlpha(50);
                this.f11969i.setAlpha(50);
                this.f11970j.setAlpha(50);
                break;
            case 5:
                this.f11963c.setAlpha(50);
                this.f11964d.setAlpha(50);
                this.f11965e.setAlpha(100);
                this.f11966f.setAlpha(150);
                this.f11967g.setAlpha(200);
                this.f11968h.setAlpha(AbstractC10866e.f34828G);
                this.f11969i.setAlpha(50);
                this.f11970j.setAlpha(50);
                break;
            case 6:
                this.f11963c.setAlpha(50);
                this.f11964d.setAlpha(50);
                this.f11965e.setAlpha(50);
                this.f11966f.setAlpha(100);
                this.f11967g.setAlpha(150);
                this.f11968h.setAlpha(200);
                this.f11969i.setAlpha(255);
                this.f11970j.setAlpha(50);
                break;
            case 7:
                this.f11963c.setAlpha(50);
                this.f11964d.setAlpha(50);
                this.f11965e.setAlpha(50);
                this.f11966f.setAlpha(50);
                this.f11967g.setAlpha(100);
                this.f11968h.setAlpha(150);
                this.f11969i.setAlpha(200);
                this.f11970j.setAlpha(255);
                m28962b();
                m28960c();
                break;
        }
        invalidate();
    }
}
