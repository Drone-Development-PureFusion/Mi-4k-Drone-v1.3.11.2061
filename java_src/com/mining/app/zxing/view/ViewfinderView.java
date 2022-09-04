package com.mining.app.zxing.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.fimi.overseas.soul.C1704R;
import com.google.zxing.ResultPoint;
import com.mining.app.zxing.p257a.C10032c;
import java.util.Collection;
import java.util.HashSet;
/* loaded from: classes.dex */
public final class ViewfinderView extends View {

    /* renamed from: b */
    private static final int[] f31031b = {0, 64, 128, 192, 255, 192, 128, 64};

    /* renamed from: c */
    private static final String f31032c = "log";

    /* renamed from: d */
    private static final long f31033d = 10;

    /* renamed from: e */
    private static final int f31034e = 255;

    /* renamed from: g */
    private static final int f31035g = 10;

    /* renamed from: h */
    private static final int f31036h = 6;

    /* renamed from: i */
    private static final int f31037i = 2;

    /* renamed from: j */
    private static final int f31038j = 2;

    /* renamed from: k */
    private static float f31039k = 0.0f;

    /* renamed from: l */
    private static final int f31040l = 16;

    /* renamed from: m */
    private static final int f31041m = 30;

    /* renamed from: a */
    boolean f31042a;

    /* renamed from: o */
    private int f31045o;

    /* renamed from: p */
    private int f31046p;

    /* renamed from: q */
    private Bitmap f31047q;

    /* renamed from: r */
    private final int f31048r;

    /* renamed from: s */
    private final int f31049s;

    /* renamed from: t */
    private final int f31050t;

    /* renamed from: v */
    private Collection<ResultPoint> f31052v;

    /* renamed from: w */
    private int f31053w;

    /* renamed from: x */
    private int f31054x;

    /* renamed from: z */
    private int f31056z;

    /* renamed from: f */
    private int f31043f = (int) (20.0f * f31039k);

    /* renamed from: n */
    private Paint f31044n = new Paint();

    /* renamed from: u */
    private Collection<ResultPoint> f31051u = new HashSet(5);

    /* renamed from: y */
    private Paint f31055y = new Paint();

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        f31039k = context.getResources().getDisplayMetrics().density;
        Resources resources = getResources();
        this.f31048r = resources.getColor(C1704R.color.viewfinder_mask);
        this.f31049s = resources.getColor(C1704R.color.result_view);
        this.f31053w = resources.getColor(C1704R.color.viewfinder_laser);
        this.f31056z = resources.getColor(C1704R.color.kuang);
        this.f31050t = resources.getColor(C1704R.color.possible_result_points);
        this.f31055y.setStyle(Paint.Style.STROKE);
        this.f31055y.setColor(this.f31056z);
        int i = (int) ((4.0f * f31039k) / 3.0f);
        this.f31055y.setStrokeWidth(i);
        this.f31044n.setStrokeWidth(i);
    }

    /* renamed from: a */
    public void m6375a() {
        this.f31047q = null;
        invalidate();
    }

    /* renamed from: a */
    public void m6374a(Bitmap bitmap) {
        this.f31047q = bitmap;
        invalidate();
    }

    /* renamed from: a */
    public void m6373a(ResultPoint resultPoint) {
        this.f31051u.add(resultPoint);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Rect m6405e = C10032c.m6416a().m6405e();
        if (m6405e == null) {
            return;
        }
        if (!this.f31042a) {
            this.f31042a = true;
            this.f31045o = m6405e.top;
            this.f31046p = m6405e.bottom;
        }
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        this.f31044n.setColor(this.f31047q != null ? this.f31049s : this.f31048r);
        canvas.drawRect(0.0f, 0.0f, width, m6405e.top, this.f31044n);
        canvas.drawRect(0.0f, m6405e.top, m6405e.left, m6405e.bottom + 1, this.f31044n);
        canvas.drawRect(m6405e.right + 1, m6405e.top, width, m6405e.bottom + 1, this.f31044n);
        canvas.drawRect(0.0f, m6405e.bottom + 1, width, height, this.f31044n);
        canvas.drawRect(m6405e.left, m6405e.top, m6405e.right, m6405e.bottom, this.f31055y);
        if (this.f31047q != null) {
            this.f31044n.setAlpha(255);
            canvas.drawBitmap(this.f31047q, m6405e.left, m6405e.top, this.f31044n);
            return;
        }
        this.f31045o += 2;
        if (this.f31045o >= m6405e.bottom) {
            this.f31045o = m6405e.top;
        }
        this.f31044n.setColor(this.f31053w);
        canvas.drawRect(m6405e.left + 2, this.f31045o - 3, m6405e.right - 2, this.f31045o + 3, this.f31044n);
        postInvalidateDelayed(f31033d, m6405e.left, m6405e.top, m6405e.right, m6405e.bottom);
    }
}
