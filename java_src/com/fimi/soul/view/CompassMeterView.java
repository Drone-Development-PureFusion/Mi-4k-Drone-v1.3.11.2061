package com.fimi.soul.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import com.fimi.overseas.soul.C1704R;
/* loaded from: classes.dex */
public class CompassMeterView extends View {

    /* renamed from: c */
    private static final float f12010c = 1.8f;

    /* renamed from: b */
    private int f12012b;

    /* renamed from: d */
    private boolean f12013d;

    /* renamed from: e */
    private RectF f12014e;

    /* renamed from: f */
    private Bitmap f12015f;

    /* renamed from: g */
    private Bitmap f12016g;

    /* renamed from: h */
    private Bitmap f12017h;

    /* renamed from: j */
    private Rect f12019j;

    /* renamed from: k */
    private float f12020k;

    /* renamed from: l */
    private float f12021l;

    /* renamed from: m */
    private float f12022m;

    /* renamed from: n */
    private String f12023n;

    /* renamed from: p */
    private int f12025p;

    /* renamed from: q */
    private float f12026q;

    /* renamed from: r */
    private Paint f12027r;

    /* renamed from: s */
    private float f12028s;

    /* renamed from: t */
    private Paint f12029t;

    /* renamed from: u */
    private Paint f12030u;

    /* renamed from: a */
    private float f12011a = 90.0f;

    /* renamed from: i */
    private int f12018i = 18;

    /* renamed from: o */
    private boolean f12024o = false;

    /* renamed from: v */
    private float f12031v = 0.0f;

    public CompassMeterView(Context context) {
        super(context);
        m28952a();
    }

    public CompassMeterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m28952a();
    }

    public CompassMeterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m28952a();
    }

    private void setCurrentAngle(float f) {
        this.f12011a = f;
    }

    /* renamed from: a */
    public float m28951a(float f) {
        return getResources().getDisplayMetrics().density * f;
    }

    /* renamed from: a */
    public float m28950a(float f, float f2, float f3) {
        return (float) (f + (f2 * Math.sin(((180.0f + f3) * 3.141592653589793d) / 180.0d)));
    }

    /* renamed from: a */
    public float m28949a(int i, float f, float f2) {
        return (float) ((i / 2.0d) + (f * Math.cos(((180.0f + f2) * 3.141592653589793d) / 180.0d)));
    }

    /* renamed from: a */
    public void m28952a() {
        this.f12027r = new Paint();
        this.f12027r.setAntiAlias(true);
        this.f12030u = new Paint();
        this.f12030u.setAntiAlias(true);
        this.f12015f = ((BitmapDrawable) getResources().getDrawable(C1704R.C1705drawable.chart_compass_connected)).getBitmap();
        this.f12016g = ((BitmapDrawable) getResources().getDrawable(C1704R.C1705drawable.chart_compass_connected_no)).getBitmap();
        this.f12017h = ((BitmapDrawable) getResources().getDrawable(C1704R.C1705drawable.chart_point)).getBitmap();
        this.f12020k = m28951a(34.0f);
        this.f12022m = m28951a(50.0f);
        this.f12026q = m28951a(47.0f);
        this.f12021l = m28951a(6.0f);
        this.f12025p = getResources().getColor(C1704R.color.meter_text);
        this.f12031v = m28951a(2.0f);
    }

    /* renamed from: a */
    public void m28948a(int i, float f, float f2, int i2, Canvas canvas) {
        float m28949a = m28949a(i, this.f12022m, f2);
        float m28950a = m28950a(f, this.f12022m, f2);
        float m28949a2 = m28949a(i, this.f12020k, f2);
        float m28950a2 = m28950a(f, this.f12020k, f2);
        float m28949a3 = m28949a(i, this.f12026q, f2);
        float m28950a3 = m28950a(f, this.f12026q, f2);
        Rect rect = new Rect();
        String str = "" + i2;
        this.f12021l = m28951a(6.0f);
        this.f12030u.setTextSize(this.f12021l);
        this.f12030u.setColor(this.f12025p);
        this.f12030u.getTextBounds(str, 0, str.length(), rect);
        if (f2 == 0.0f) {
            canvas.drawText(str, m28949a - (rect.width() / 3.0f), m28950a, this.f12030u);
        } else if (f2 <= 90.0f) {
            canvas.drawText(str, m28949a - (rect.width() / 2.0f), m28950a, this.f12030u);
        } else {
            canvas.drawText(str, m28949a - (rect.width() / 3.0f), m28950a, this.f12030u);
        }
        canvas.drawLine(m28949a2, m28950a2, m28949a3, m28950a3, this.f12030u);
    }

    /* renamed from: a */
    public void m28947a(int i, float f, Canvas canvas) {
        Matrix matrix = new Matrix();
        matrix.postRotate(this.f12011a - 90.0f, this.f12017h.getWidth() / 2.0f, this.f12017h.getHeight() / 2.0f);
        matrix.postTranslate((i - this.f12017h.getWidth()) / 2.0f, f - (this.f12017h.getHeight() / 2.0f));
        Log.i("zdy", "" + this.f12017h.getWidth() + " " + this.f12017h.getHeight());
        canvas.drawBitmap(this.f12017h, matrix, this.f12027r);
        matrix.reset();
    }

    /* renamed from: a */
    public void m28946a(int i, int i2, Canvas canvas) {
        float m28949a = m28949a(i, this.f12020k, this.f12011a);
        float m28950a = m28950a(i2, this.f12020k, this.f12011a);
        Matrix matrix = new Matrix();
        float width = m28949a - (this.f12017h.getWidth() / 2.0f);
        float height = m28950a - (this.f12017h.getHeight() / 2.0f);
        matrix.postRotate(this.f12011a - 90.0f, this.f12017h.getWidth() / 2.0f, this.f12017h.getHeight() / 2.0f);
        matrix.postTranslate(width, height);
        canvas.drawBitmap(this.f12017h, matrix, this.f12027r);
        matrix.reset();
    }

    public float getCurrentAngle() {
        return this.f12011a;
    }

    public int getCurrentProgress() {
        return this.f12012b;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int width = getWidth();
        float height = getHeight() - this.f12031v;
        int height2 = this.f12015f.getHeight();
        int width2 = (width - this.f12015f.getWidth()) / 2;
        m28948a(width, height, 36.0f, 20, canvas);
        m28948a(width, height, 72.0f, 40, canvas);
        m28948a(width, height, 0.0f, 0, canvas);
        m28948a(width, height, 180.0f, 100, canvas);
        if (this.f12024o) {
            canvas.drawBitmap(this.f12015f, width2, height - height2, this.f12027r);
        } else {
            canvas.drawBitmap(this.f12016g, width2, height - height2, this.f12027r);
            this.f12011a = 90.0f;
        }
        m28947a(width, height, canvas);
        Rect rect = new Rect();
        this.f12021l = m28951a(9.0f);
        this.f12030u.setTextSize(this.f12021l);
        this.f12030u.setColor(this.f12025p);
        this.f12030u.getTextBounds(this.f12023n, 0, this.f12023n.length(), rect);
        canvas.drawText(this.f12023n, (width - rect.width()) / 2, height, this.f12030u);
    }

    public void setCurrentProgress(int i) {
        if (this.f12012b == i) {
            return;
        }
        this.f12012b = i;
        setCurrentAngle(i * f12010c);
        postInvalidate();
    }

    public void setEngine(boolean z) {
        if (this.f12024o == z) {
            return;
        }
        this.f12024o = z;
        postInvalidate();
    }

    public void setTitle(String str) {
        this.f12023n = str;
    }
}
