package com.fimi.soul.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.utils.C3125i;
import com.google.firebase.p253b.C9755a;
/* loaded from: classes.dex */
public class RemotesimulatorView extends View {

    /* renamed from: a */
    private Bitmap f12208a;

    /* renamed from: b */
    private Bitmap f12209b;

    /* renamed from: c */
    private Bitmap f12210c;

    /* renamed from: d */
    private float f12211d;

    /* renamed from: e */
    private float f12212e;

    /* renamed from: f */
    private float f12213f;

    /* renamed from: g */
    private float f12214g;

    /* renamed from: h */
    private float f12215h;

    /* renamed from: i */
    private float f12216i;

    /* renamed from: j */
    private float f12217j;

    /* renamed from: k */
    private int f12218k;

    /* renamed from: l */
    private RectF f12219l;

    /* renamed from: m */
    private int f12220m;

    /* renamed from: n */
    private int f12221n;

    /* renamed from: o */
    private float f12222o;

    /* renamed from: p */
    private float f12223p;

    /* renamed from: q */
    private int f12224q;

    /* renamed from: r */
    private Context f12225r;

    /* renamed from: s */
    private int[] f12226s;

    /* renamed from: t */
    private Paint f12227t;

    /* renamed from: u */
    private int f12228u;

    /* renamed from: v */
    private int f12229v;

    public RemotesimulatorView(Context context) {
        super(context);
        this.f12218k = 512;
        this.f12224q = 8;
        this.f12226s = new int[]{Color.parseColor("#00FE5400"), Color.parseColor("#FE5400")};
    }

    public RemotesimulatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12218k = 512;
        this.f12224q = 8;
        this.f12226s = new int[]{Color.parseColor("#00FE5400"), Color.parseColor("#FE5400")};
        this.f12225r = context;
        this.f12208a = BitmapFactory.decodeResource(getResources(), C1704R.C1705drawable.img_playback_rc_bg);
        this.f12209b = BitmapFactory.decodeResource(getResources(), C1704R.C1705drawable.img_playback_rc_scale);
        this.f12210c = BitmapFactory.decodeResource(getResources(), C1704R.C1705drawable.img_palyback_rc_focus);
        this.f12224q = C3125i.m29082a(context, this.f12224q);
        this.f12211d = this.f12224q;
        this.f12214g = (this.f12211d + (this.f12209b.getWidth() / 2)) - (this.f12210c.getWidth() / 2);
        this.f12212e = (this.f12208a.getHeight() / 2) - (this.f12209b.getWidth() / 2);
        this.f12213f = (this.f12208a.getWidth() - this.f12209b.getWidth()) - this.f12211d;
        this.f12216i = (this.f12208a.getHeight() / 2) - (this.f12210c.getWidth() / 2);
        this.f12215h = ((this.f12208a.getWidth() - (this.f12209b.getWidth() / 2)) - this.f12211d) - (this.f12210c.getWidth() / 2);
        this.f12227t = new Paint();
        this.f12227t.setAntiAlias(true);
        this.f12227t.setColor(-1);
    }

    public RemotesimulatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12218k = 512;
        this.f12224q = 8;
        this.f12226s = new int[]{Color.parseColor("#00FE5400"), Color.parseColor("#FE5400")};
    }

    /* renamed from: a */
    public static double m28870a(float f, float f2, int i, int i2) {
        int abs = Math.abs((int) (f - i));
        int abs2 = Math.abs((int) (f2 - i2));
        return Math.round((float) ((Math.acos(abs2 / Math.sqrt((abs * abs) + (abs2 * abs2))) / 3.141592653589793d) * 180.0d));
    }

    /* renamed from: a */
    private void m28868a(Bitmap... bitmapArr) {
        for (Bitmap bitmap : bitmapArr) {
            if (bitmap != null && !bitmap.isRecycled()) {
                bitmap.recycle();
            }
        }
    }

    /* renamed from: a */
    public void m28869a(int i, int i2, int i3, int i4) {
        int sqrt;
        int sqrt2;
        double d = C9755a.f30449c;
        if (i2 <= this.f12218k && i4 >= this.f12218k) {
            sqrt = (int) Math.sqrt(Math.pow(i4 - this.f12218k, 2.0d) + Math.pow(this.f12218k - i2, 2.0d));
            if (sqrt != 0) {
                d = m28870a(0.0f, 0.0f, i4 - this.f12218k, this.f12218k - i2);
            }
        } else if (i2 <= this.f12218k && i4 < this.f12218k) {
            sqrt = (int) Math.sqrt(Math.pow(this.f12218k - i4, 2.0d) + Math.pow(this.f12218k - i2, 2.0d));
            if (sqrt != 0) {
                d = 360.0d - m28870a(0.0f, 0.0f, this.f12218k - i4, this.f12218k - i2);
            }
        } else if (i2 <= this.f12218k || i4 < this.f12218k) {
            sqrt = (int) Math.sqrt(Math.pow(this.f12218k - i4, 2.0d) + Math.pow(i2 - this.f12218k, 2.0d));
            if (sqrt != 0) {
                d = 180.0d + m28870a(0.0f, 0.0f, this.f12218k - i4, i2 - this.f12218k);
            }
        } else {
            sqrt = (int) Math.sqrt(Math.pow(i4 - this.f12218k, 2.0d) + Math.pow(i2 - this.f12218k, 2.0d));
            if (sqrt != 0) {
                d = 180.0d - m28870a(0.0f, 0.0f, i4 - this.f12218k, i2 - this.f12218k);
            }
        }
        if (sqrt > this.f12218k) {
            sqrt = this.f12218k;
        }
        this.f12220m = sqrt;
        this.f12222o = (float) d;
        double d2 = C9755a.f30449c;
        if (i3 <= this.f12218k && i >= this.f12218k) {
            sqrt2 = (int) Math.sqrt(Math.pow(i - this.f12218k, 2.0d) + Math.pow(this.f12218k - i3, 2.0d));
            if (sqrt2 != 0) {
                d2 = -m28870a(0.0f, 0.0f, i - this.f12218k, this.f12218k - i3);
            }
        } else if (i3 <= this.f12218k && i < this.f12218k) {
            sqrt2 = (int) Math.sqrt(Math.pow(this.f12218k - i, 2.0d) + Math.pow(this.f12218k - i3, 2.0d));
            if (sqrt2 != 0) {
                d2 = m28870a(0.0f, 0.0f, this.f12218k - i, this.f12218k - i3);
            }
        } else if (i3 <= this.f12218k || i < this.f12218k) {
            sqrt2 = (int) Math.sqrt(Math.pow(this.f12218k - i, 2.0d) + Math.pow(i3 - this.f12218k, 2.0d));
            if (sqrt2 != 0) {
                d2 = 180.0d + m28870a(0.0f, 0.0f, this.f12218k - i, i3 - this.f12218k);
            }
        } else {
            sqrt2 = (int) Math.sqrt(Math.pow(i - this.f12218k, 2.0d) + Math.pow(i3 - this.f12218k, 2.0d));
            if (sqrt2 != 0) {
                d2 = 180.0d + m28870a(0.0f, 0.0f, i - this.f12218k, i3 - this.f12218k);
            }
        }
        if (sqrt2 > this.f12218k) {
            sqrt2 = this.f12218k;
        }
        this.f12221n = sqrt2;
        this.f12223p = (float) d2;
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f12217j = (float) ((getHeight() * 0.06111d) / this.f12218k);
        this.f12228u = (int) (getHeight() * 0.74074d);
        this.f12229v = (int) (getWidth() * 0.73229d);
        canvas.drawBitmap(this.f12208a, this.f12229v, this.f12228u, this.f12227t);
        canvas.drawBitmap(this.f12209b, this.f12211d + this.f12229v, this.f12212e + this.f12228u, this.f12227t);
        canvas.drawBitmap(this.f12209b, this.f12213f + this.f12229v, this.f12212e + this.f12228u, this.f12227t);
        this.f12227t.setColor(Color.parseColor("#FE5400"));
        this.f12227t.setShader(new LinearGradient(this.f12214g + this.f12229v, (this.f12208a.getHeight() / 2) + this.f12228u, this.f12214g + this.f12210c.getWidth() + this.f12229v, ((this.f12208a.getHeight() / 2) - (this.f12220m * this.f12217j)) + this.f12228u, this.f12226s, (float[]) null, Shader.TileMode.MIRROR));
        this.f12219l = new RectF(this.f12214g + this.f12229v, ((this.f12208a.getHeight() / 2) - (this.f12220m * this.f12217j)) + this.f12228u, this.f12214g + this.f12210c.getWidth() + this.f12229v, (this.f12208a.getHeight() / 2) + this.f12228u);
        Matrix matrix = new Matrix();
        matrix.postRotate(this.f12222o, this.f12214g + (this.f12210c.getWidth() / 2) + this.f12229v, this.f12216i + (this.f12210c.getWidth() / 2) + this.f12228u);
        canvas.setMatrix(matrix);
        canvas.drawRoundRect(this.f12219l, this.f12210c.getWidth() / 2, this.f12210c.getWidth() / 2, this.f12227t);
        matrix.setRotate(0.0f);
        canvas.setMatrix(matrix);
        this.f12227t.setShader(new LinearGradient(this.f12215h + this.f12229v, (this.f12208a.getHeight() / 2) + this.f12228u, this.f12215h + this.f12210c.getWidth() + this.f12229v, ((this.f12208a.getHeight() / 2) - (this.f12221n * this.f12217j)) + this.f12228u, this.f12226s, (float[]) null, Shader.TileMode.MIRROR));
        this.f12219l = new RectF(this.f12215h + this.f12229v, ((this.f12208a.getHeight() / 2) - (this.f12221n * this.f12217j)) + this.f12228u, this.f12215h + this.f12210c.getWidth() + this.f12229v, (this.f12208a.getHeight() / 2) + this.f12228u);
        matrix.postRotate(this.f12223p, this.f12215h + (this.f12210c.getWidth() / 2) + this.f12229v, this.f12216i + (this.f12210c.getWidth() / 2) + this.f12228u);
        canvas.setMatrix(matrix);
        canvas.drawRoundRect(this.f12219l, this.f12210c.getWidth() / 2, this.f12210c.getWidth() / 2, this.f12227t);
        matrix.setRotate(0.0f);
        canvas.setMatrix(matrix);
        canvas.drawBitmap(this.f12210c, this.f12214g + this.f12229v, this.f12216i + this.f12228u, this.f12227t);
        canvas.drawBitmap(this.f12210c, this.f12215h + this.f12229v, this.f12216i + this.f12228u, this.f12227t);
    }
}
