package com.tencent.connect.avatar;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.FloatMath;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
/* renamed from: com.tencent.connect.avatar.c */
/* loaded from: classes2.dex */
public class C10136c extends ImageView {

    /* renamed from: h */
    private Bitmap f31267h;

    /* renamed from: j */
    private float f31269j;

    /* renamed from: k */
    private float f31270k;

    /* renamed from: c */
    private Matrix f31262c = new Matrix();

    /* renamed from: d */
    private Matrix f31263d = new Matrix();

    /* renamed from: e */
    private int f31264e = 0;

    /* renamed from: f */
    private float f31265f = 1.0f;

    /* renamed from: g */
    private float f31266g = 1.0f;

    /* renamed from: i */
    private boolean f31268i = false;

    /* renamed from: a */
    final String f31260a = "TouchView";

    /* renamed from: l */
    private PointF f31271l = new PointF();

    /* renamed from: m */
    private PointF f31272m = new PointF();

    /* renamed from: n */
    private float f31273n = 1.0f;

    /* renamed from: o */
    private float f31274o = 0.0f;

    /* renamed from: b */
    public boolean f31261b = false;

    /* renamed from: p */
    private Rect f31275p = new Rect();

    public C10136c(Context context) {
        super(context);
        getDrawingRect(this.f31275p);
        m6083a();
    }

    /* renamed from: a */
    private float m6080a(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() < 2) {
            return 0.0f;
        }
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return FloatMath.sqrt((x * x) + (y * y));
    }

    /* renamed from: a */
    private void m6083a() {
    }

    /* renamed from: a */
    private void m6082a(PointF pointF) {
        float f = 1.0f;
        if (this.f31267h == null) {
            return;
        }
        float[] fArr = new float[9];
        this.f31262c.getValues(fArr);
        float f2 = fArr[2];
        float f3 = fArr[5];
        float f4 = fArr[0];
        float width = this.f31267h.getWidth() * f4;
        float height = this.f31267h.getHeight() * f4;
        float f5 = this.f31275p.left - f2;
        if (f5 <= 1.0f) {
            f5 = 1.0f;
        }
        float f6 = (f2 + width) - this.f31275p.right;
        if (f6 <= 1.0f) {
            f6 = 1.0f;
        }
        float width2 = ((f5 * this.f31275p.width()) / (f6 + f5)) + this.f31275p.left;
        float f7 = this.f31275p.top - f3;
        float f8 = (f3 + height) - this.f31275p.bottom;
        if (f7 <= 1.0f) {
            f7 = 1.0f;
        }
        if (f8 > 1.0f) {
            f = f8;
        }
        pointF.set(width2, ((this.f31275p.height() * f7) / (f7 + f)) + this.f31275p.top);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m6077b() {
        if (this.f31267h == null) {
            return;
        }
        float width = this.f31275p.width();
        float height = this.f31275p.height();
        float[] fArr = new float[9];
        this.f31262c.getValues(fArr);
        float f = fArr[2];
        float f2 = fArr[5];
        float f3 = fArr[0];
        Animation animation = null;
        if (f3 > this.f31265f) {
            this.f31274o = this.f31265f / f3;
            this.f31262c.postScale(this.f31274o, this.f31274o, this.f31272m.x, this.f31272m.y);
            setImageMatrix(this.f31262c);
            animation = new ScaleAnimation(1.0f / this.f31274o, 1.0f, 1.0f / this.f31274o, 1.0f, this.f31272m.x, this.f31272m.y);
        } else if (f3 < this.f31266g) {
            this.f31274o = this.f31266g / f3;
            this.f31262c.postScale(this.f31274o, this.f31274o, this.f31272m.x, this.f31272m.y);
            animation = new ScaleAnimation(1.0f, this.f31274o, 1.0f, this.f31274o, this.f31272m.x, this.f31272m.y);
        } else {
            boolean z = false;
            float width2 = this.f31267h.getWidth() * f3;
            float height2 = f3 * this.f31267h.getHeight();
            float f4 = this.f31275p.left - f;
            float f5 = this.f31275p.top - f2;
            if (f4 < 0.0f) {
                f = this.f31275p.left;
                z = true;
            }
            if (f5 < 0.0f) {
                f2 = this.f31275p.top;
                z = true;
            }
            float f6 = height2 - f5;
            if (width2 - f4 < width) {
                f = this.f31275p.left - (width2 - width);
                z = true;
            }
            if (f6 < height) {
                f2 = this.f31275p.top - (height2 - height);
                z = true;
            }
            if (z) {
                float f7 = fArr[2] - f;
                float f8 = fArr[5] - f2;
                fArr[2] = f;
                fArr[5] = f2;
                this.f31262c.setValues(fArr);
                setImageMatrix(this.f31262c);
                animation = new TranslateAnimation(f7, 0.0f, f8, 0.0f);
            } else {
                setImageMatrix(this.f31262c);
            }
        }
        if (animation == null) {
            return;
        }
        this.f31268i = true;
        animation.setDuration(300L);
        startAnimation(animation);
        new Thread(new Runnable() { // from class: com.tencent.connect.avatar.c.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Thread.sleep(300L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                C10136c.this.post(new Runnable() { // from class: com.tencent.connect.avatar.c.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C10136c.this.clearAnimation();
                        C10136c.this.m6077b();
                    }
                });
                C10136c.this.f31268i = false;
            }
        }).start();
    }

    /* renamed from: c */
    private void m6076c() {
        if (this.f31267h == null) {
            return;
        }
        this.f31262c.getValues(r0);
        float max = Math.max(this.f31275p.width() / this.f31267h.getWidth(), this.f31275p.height() / this.f31267h.getHeight());
        this.f31269j = this.f31275p.left - (((this.f31267h.getWidth() * max) - this.f31275p.width()) / 2.0f);
        this.f31270k = this.f31275p.top - (((this.f31267h.getHeight() * max) - this.f31275p.height()) / 2.0f);
        float[] fArr = {max, 0.0f, this.f31269j, 0.0f, max, this.f31270k};
        this.f31262c.setValues(fArr);
        this.f31265f = Math.min(2048.0f / this.f31267h.getWidth(), 2048.0f / this.f31267h.getHeight());
        this.f31266g = max;
        if (this.f31265f < this.f31266g) {
            this.f31265f = this.f31266g;
        }
        setImageMatrix(this.f31262c);
    }

    /* renamed from: a */
    public void m6081a(Rect rect) {
        this.f31275p = rect;
        if (this.f31267h != null) {
            m6076c();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f31268i) {
            switch (motionEvent.getAction() & 255) {
                case 0:
                    this.f31262c.set(getImageMatrix());
                    this.f31263d.set(this.f31262c);
                    this.f31271l.set(motionEvent.getX(), motionEvent.getY());
                    this.f31264e = 1;
                    break;
                case 1:
                case 6:
                    m6077b();
                    this.f31264e = 0;
                    break;
                case 2:
                    if (this.f31264e != 1) {
                        if (this.f31264e == 2) {
                            this.f31262c.set(this.f31262c);
                            float m6080a = m6080a(motionEvent);
                            if (m6080a > 10.0f) {
                                this.f31262c.set(this.f31263d);
                                float f = m6080a / this.f31273n;
                                this.f31262c.postScale(f, f, this.f31272m.x, this.f31272m.y);
                            }
                            setImageMatrix(this.f31262c);
                            break;
                        }
                    } else {
                        this.f31262c.set(this.f31263d);
                        this.f31262c.postTranslate(motionEvent.getX() - this.f31271l.x, motionEvent.getY() - this.f31271l.y);
                        setImageMatrix(this.f31262c);
                        break;
                    }
                    break;
                case 5:
                    this.f31273n = m6080a(motionEvent);
                    if (this.f31273n > 10.0f) {
                        this.f31263d.set(this.f31262c);
                        m6082a(this.f31272m);
                        this.f31264e = 2;
                        break;
                    }
                    break;
            }
            this.f31261b = true;
        }
        return true;
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        this.f31267h = bitmap;
        if (bitmap != null) {
            this.f31267h = bitmap;
        }
    }
}
