package com.fimi.soul.view;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.fimi.kernel.utils.C1675p;
import com.fimi.overseas.soul.C1704R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class TranslationView extends View {

    /* renamed from: q */
    private static final float f12261q = 0.25f;

    /* renamed from: a */
    private Camera f12262a;

    /* renamed from: b */
    private Matrix f12263b;

    /* renamed from: c */
    private float f12264c;

    /* renamed from: d */
    private float f12265d;

    /* renamed from: e */
    private float f12266e;

    /* renamed from: f */
    private int f12267f;

    /* renamed from: g */
    private Paint f12268g;

    /* renamed from: h */
    private Paint f12269h;

    /* renamed from: i */
    private Paint f12270i;

    /* renamed from: j */
    private Bitmap f12271j;

    /* renamed from: k */
    private int f12272k;

    /* renamed from: l */
    private AnimatorSet f12273l;

    /* renamed from: m */
    private Bitmap f12274m;

    /* renamed from: n */
    private Bitmap f12275n;

    /* renamed from: o */
    private float f12276o;

    /* renamed from: p */
    private float f12277p;

    /* renamed from: r */
    private HashMap<String, WeakReference<Bitmap>> f12278r;

    public TranslationView(Context context) {
        this(context, null);
    }

    public TranslationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.f12262a = new Camera();
        this.f12263b = new Matrix();
        new BitmapFactory.Options();
        float m34624b = C1675p.m34624b(context) < ((float) C1675p.m34635a(context)) ? C1675p.m34624b(context) : C1675p.m34635a(context);
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), C1704R.C1705drawable.usb_plane_start);
        Bitmap decodeResource2 = BitmapFactory.decodeResource(getResources(), C1704R.C1705drawable.usb_plane_end);
        float width = ((m34624b * 1004.0f) / 1080.0f) / decodeResource2.getWidth();
        Matrix matrix = new Matrix();
        matrix.postScale(width, width);
        if (this.f12274m == null) {
            this.f12278r.put("bitmapstart", new WeakReference<>(Bitmap.createBitmap(decodeResource, 0, 0, decodeResource.getWidth(), decodeResource.getHeight(), matrix, true)));
            this.f12274m = this.f12278r.get("bitmapstart").get();
        }
        if (this.f12275n == null) {
            this.f12278r.put("bitmapend", new WeakReference<>(Bitmap.createBitmap(decodeResource2, 0, 0, decodeResource2.getWidth(), decodeResource2.getHeight(), matrix, true)));
            this.f12275n = this.f12278r.get("bitmapend").get();
        }
        if (this.f12271j == null) {
            this.f12278r.put("tranBackBitmap", new WeakReference<>(BitmapFactory.decodeResource(getResources(), C1704R.C1705drawable.check_connect_bg)));
            this.f12271j = this.f12278r.get("tranBackBitmap").get();
        }
        this.f12262a.save();
        this.f12262a.translate(0.0f, 0.0f, 500.0f);
        this.f12262a.getMatrix(this.f12263b);
        this.f12262a.restore();
        if (this.f12274m != null) {
            Bitmap createBitmap = Bitmap.createBitmap(this.f12274m, 0, 0, this.f12274m.getWidth(), this.f12274m.getHeight(), this.f12263b, true);
            this.f12276o = createBitmap.getWidth();
            this.f12277p = this.f12274m.getWidth() / createBitmap.getWidth();
        }
        this.f12268g = new Paint();
        this.f12270i = new Paint();
        this.f12270i.setAlpha(255);
        this.f12269h = new Paint();
        if (decodeResource.isRecycled()) {
            decodeResource.recycle();
        }
        if (decodeResource2.isRecycled()) {
            decodeResource2.recycle();
        }
    }

    public TranslationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12266e = 0.0f;
        this.f12267f = 0;
        this.f12272k = 500;
        this.f12278r = new HashMap<>();
    }

    /* renamed from: a */
    public void m28854a() {
        this.f12264c = (-getMeasuredHeight()) * f12261q;
        this.f12265d = 0.0f;
        this.f12266e = 0.0f;
        this.f12267f = 0;
        this.f12270i.setAlpha(0);
        this.f12268g.setAlpha(255);
        invalidate();
    }

    /* renamed from: a */
    public void m28853a(int i) {
        this.f12272k = i;
        ValueAnimator ofFloat = ValueAnimator.ofFloat((-getMeasuredHeight()) * f12261q, ((getMeasuredWidth() / 2) - (this.f12276o / 2.0f)) * this.f12277p);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.fimi.soul.view.TranslationView.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                TranslationView.this.f12264c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TranslationView.this.invalidate();
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, (-getHeight()) * 0.2444f);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.fimi.soul.view.TranslationView.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                TranslationView.this.f12265d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
        });
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 500.0f);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.fimi.soul.view.TranslationView.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                TranslationView.this.f12266e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
        });
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.fimi.soul.view.TranslationView.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                TranslationView.this.f12267f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                TranslationView.this.f12270i.setAlpha(TranslationView.this.f12267f / 2);
                TranslationView.this.f12268g.setAlpha(255 - TranslationView.this.f12267f);
            }
        });
        this.f12273l = new AnimatorSet();
        this.f12273l.setDuration(this.f12272k);
        this.f12273l.play(ofFloat).with(ofFloat2).with(ofFloat3).with(ofInt);
        this.f12273l.start();
    }

    /* renamed from: b */
    public void m28849b() {
        if (this.f12273l.isStarted()) {
            this.f12273l.cancel();
            m28854a();
        }
    }

    /* renamed from: c */
    public void m28846c() {
        for (Map.Entry<String, WeakReference<Bitmap>> entry : this.f12278r.entrySet()) {
            Bitmap bitmap = entry.getValue().get();
            if (bitmap != null && !bitmap.isRecycled()) {
                bitmap.recycle();
            }
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f12262a.save();
        this.f12262a.translate(this.f12264c, this.f12265d, this.f12266e);
        this.f12262a.getMatrix(this.f12263b);
        this.f12262a.restore();
        this.f12269h.setAlpha(this.f12267f);
        Rect rect = new Rect(0, 0, getWidth(), getHeight());
        if (this.f12271j != null) {
            canvas.drawBitmap(this.f12271j, (Rect) null, rect, this.f12269h);
        }
        if (this.f12274m != null) {
            canvas.drawBitmap(this.f12274m, this.f12263b, this.f12268g);
        }
        if (this.f12275n != null) {
            canvas.drawBitmap(this.f12275n, this.f12263b, this.f12270i);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f12264c = (-getMeasuredHeight()) * f12261q;
        this.f12265d = 0.0f;
        this.f12266e = 0.0f;
    }

    public void setDuration(int i) {
        this.f12272k = i;
    }
}
