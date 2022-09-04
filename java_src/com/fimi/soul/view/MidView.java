package com.fimi.soul.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;
import com.fimi.overseas.soul.C1704R;
/* loaded from: classes2.dex */
public class MidView extends View {

    /* renamed from: c */
    public static final int f12121c = 1;

    /* renamed from: d */
    public static final int f12122d = 2;

    /* renamed from: A */
    private int f12123A;

    /* renamed from: a */
    float f12124a = 50.0f;

    /* renamed from: b */
    float f12125b = 50.0f;

    /* renamed from: e */
    private Bitmap f12126e;

    /* renamed from: f */
    private Bitmap f12127f;

    /* renamed from: g */
    private Bitmap f12128g;

    /* renamed from: h */
    private Bitmap f12129h;

    /* renamed from: i */
    private int f12130i;

    /* renamed from: j */
    private int f12131j;

    /* renamed from: k */
    private int f12132k;

    /* renamed from: l */
    private int f12133l;

    /* renamed from: m */
    private int f12134m;

    /* renamed from: n */
    private int f12135n;

    /* renamed from: o */
    private float f12136o;

    /* renamed from: p */
    private float f12137p;

    /* renamed from: q */
    private float f12138q;

    /* renamed from: r */
    private Point f12139r;

    /* renamed from: s */
    private Point f12140s;

    /* renamed from: t */
    private Point f12141t;

    /* renamed from: u */
    private int f12142u;

    /* renamed from: v */
    private int f12143v;

    /* renamed from: w */
    private int f12144w;

    /* renamed from: x */
    private int f12145x;

    /* renamed from: y */
    private int f12146y;

    /* renamed from: z */
    private int f12147z;

    public MidView(Context context) {
        super(context);
    }

    public MidView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1704R.styleable.mycircleView);
        this.f12142u = obtainStyledAttributes.getInteger(0, 0);
        setType(this.f12142u);
        obtainStyledAttributes.recycle();
    }

    public MidView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public void m28877a(float f, float f2) {
        if (this.f12124a == f && this.f12125b == f2) {
            return;
        }
        this.f12136o = ((this.f12130i / 2) - (this.f12132k / 2)) / 50.0f;
        this.f12124a = f;
        this.f12125b = f2;
        invalidate();
    }

    /* renamed from: a */
    public void m28876a(Bitmap... bitmapArr) {
        for (Bitmap bitmap : bitmapArr) {
            if (bitmap != null && bitmap.isRecycled()) {
                bitmap.recycle();
            }
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(-1);
        canvas.drawBitmap(this.f12126e, 0.0f, 0.0f, paint);
        canvas.drawBitmap(this.f12128g, (this.f12130i / 2) - (this.f12134m / 2), (this.f12131j / 2) - (this.f12135n / 2), paint);
        this.f12145x = C3264g.m28562a(this.f12130i / 2, this.f12130i / 2, (this.f12124a * this.f12137p) + this.f12132k, (this.f12125b * this.f12138q) + this.f12132k);
        if (this.f12145x <= this.f12146y) {
            canvas.drawBitmap(this.f12127f, ((this.f12124a * this.f12137p) + (this.f12130i / 2)) - (this.f12129h.getWidth() / 2), ((this.f12125b * this.f12138q) + (this.f12130i / 2)) - (this.f12129h.getHeight() / 2), paint);
            return;
        }
        this.f12140s = C3264g.m28559a(this.f12139r, new Point((int) ((this.f12124a * this.f12137p) + this.f12132k), (int) ((this.f12125b * this.f12138q) + this.f12132k)), this.f12146y);
        if (this.f12140s.x < (this.f12130i / 2) - (this.f12129h.getWidth() / 2)) {
            this.f12140s.x = (this.f12130i / 2) - (this.f12129h.getWidth() / 2);
        }
        if (this.f12142u == 1 && this.f12140s.x > this.f12129h.getWidth() - (this.f12132k / 2)) {
            this.f12140s.x = this.f12129h.getWidth() - (this.f12132k / 2);
        }
        if (this.f12140s.y < (this.f12130i / 2) - (this.f12129h.getHeight() / 2)) {
            this.f12140s.y = (this.f12130i / 2) - (this.f12129h.getHeight() / 2);
        }
        canvas.drawBitmap(this.f12127f, this.f12140s.x, this.f12140s.y, paint);
        m28876a(this.f12126e, this.f12127f, this.f12128g, this.f12129h);
    }

    public void setType(int i) {
        if (i == 1) {
            this.f12126e = BitmapFactory.decodeResource(getResources(), C1704R.C1705drawable.icon_calibration_remote_control_samll);
            this.f12127f = BitmapFactory.decodeResource(getResources(), C1704R.C1705drawable.icon_calibration_annulus_samll);
            this.f12128g = BitmapFactory.decodeResource(getResources(), C1704R.C1705drawable.icon_calibration_circle_samll);
            this.f12129h = BitmapFactory.decodeResource(getResources(), C1704R.C1705drawable.bg_calibration_remote_control_square_samll);
        } else if (i == 2) {
            this.f12126e = BitmapFactory.decodeResource(getResources(), C1704R.C1705drawable.bg_calibration_remote_control_square_line);
            this.f12127f = BitmapFactory.decodeResource(getResources(), C1704R.C1705drawable.calibration_annulus);
            this.f12128g = BitmapFactory.decodeResource(getResources(), C1704R.C1705drawable.calibration_circle);
            this.f12129h = BitmapFactory.decodeResource(getResources(), C1704R.C1705drawable.remoterocefbg);
        }
        this.f12134m = this.f12128g.getWidth();
        this.f12135n = this.f12128g.getHeight();
        this.f12130i = this.f12126e.getWidth();
        this.f12131j = this.f12126e.getHeight();
        this.f12132k = this.f12127f.getWidth();
        this.f12133l = this.f12127f.getHeight();
        this.f12146y = ((int) Math.sqrt(Math.pow(this.f12129h.getWidth() / 2, 2.0d) + Math.pow(this.f12129h.getHeight() / 2, 2.0d))) - (this.f12132k / 2);
        this.f12139r = new Point((this.f12130i / 2) - (this.f12132k / 2), (this.f12131j / 2) - (this.f12132k / 2));
        this.f12147z = C3264g.m28562a(this.f12132k / 2, this.f12133l / 2, this.f12130i / 2, this.f12131j / 2);
        this.f12137p = ((this.f12129h.getWidth() / 2) - (this.f12132k / 2)) / 50.0f;
        this.f12138q = ((this.f12129h.getHeight() / 2) - (this.f12132k / 2)) / 50.0f;
    }
}
