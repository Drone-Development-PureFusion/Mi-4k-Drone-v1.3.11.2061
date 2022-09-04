package com.fimi.soul.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.fimi.overseas.soul.C1704R;
/* loaded from: classes2.dex */
public class RemoteRocker extends View {

    /* renamed from: h */
    private static final float f12158h = 0.2373f;

    /* renamed from: i */
    private static final float f12159i = 0.228f;

    /* renamed from: a */
    private Paint f12160a;

    /* renamed from: b */
    private Bitmap f12161b;

    /* renamed from: c */
    private Paint f12162c;

    /* renamed from: d */
    private RectF f12163d;

    /* renamed from: e */
    private RectF f12164e;

    /* renamed from: f */
    private RectF f12165f;

    /* renamed from: g */
    private RectF f12166g;

    /* renamed from: k */
    private EnumC3173a f12168k;

    /* renamed from: j */
    private float f12167j = -90.0f;

    /* renamed from: l */
    private float f12169l = 0.0f;

    /* renamed from: m */
    private float f12170m = 0.0f;

    /* renamed from: n */
    private float f12171n = 0.0f;

    /* renamed from: o */
    private float f12172o = 0.0f;

    /* renamed from: com.fimi.soul.view.RemoteRocker$a */
    /* loaded from: classes2.dex */
    public enum EnumC3173a {
        LEFT,
        RIGHT
    }

    public RemoteRocker(Context context) {
        super(context);
        m28872b();
    }

    public RemoteRocker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m28872b();
    }

    public RemoteRocker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m28872b();
    }

    /* renamed from: b */
    private void m28872b() {
        this.f12160a = new Paint();
        this.f12162c = new Paint();
    }

    /* renamed from: a */
    public void m28873a() {
        if (this.f12161b != null) {
            this.f12161b.recycle();
            this.f12161b = null;
            System.gc();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        if (this.f12161b == null) {
            setRemoteRocker(this.f12168k);
        }
        canvas.drawBitmap(this.f12161b, (Rect) null, rectF, this.f12160a);
        canvas.drawArc(this.f12163d, this.f12167j, this.f12169l, false, this.f12162c);
        canvas.drawArc(this.f12164e, this.f12167j, this.f12170m, false, this.f12162c);
        canvas.drawArc(this.f12165f, this.f12167j, this.f12172o, false, this.f12162c);
        canvas.drawArc(this.f12166g, this.f12167j, this.f12171n, false, this.f12162c);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f12162c.setStrokeWidth(getWidth() * 0.0046499968f);
        this.f12162c.setColor(-14172853);
        this.f12162c.setAntiAlias(true);
        this.f12162c.setStyle(Paint.Style.STROKE);
        this.f12163d = new RectF((getWidth() / 2) - ((getWidth() * f12159i) / 2.0f), (getWidth() * 0.0092999935f) / 2.0f, (getWidth() / 2) + ((getWidth() * f12159i) / 2.0f), getWidth() * 0.23265f);
        this.f12164e = new RectF((getWidth() * 0.0092999935f) / 2.0f, (getWidth() / 2) - ((getWidth() * f12159i) / 2.0f), getWidth() * 0.23265f, (getWidth() / 2.0f) + ((getWidth() * f12159i) / 2.0f));
        this.f12165f = new RectF(getWidth() - (getWidth() * 0.23265f), (getWidth() / 2) - ((getWidth() * f12159i) / 2.0f), getWidth() - (getWidth() * 0.0046499968f), (getWidth() / 2.0f) + ((getWidth() * f12159i) / 2.0f));
        this.f12166g = new RectF((getWidth() / 2) - ((getWidth() * f12159i) / 2.0f), getWidth() - (getWidth() * 0.23265f), (getWidth() / 2) + ((getWidth() * f12159i) / 2.0f), getWidth() - ((getWidth() * 0.0092999935f) / 2.0f));
    }

    public void setBottomSweepAngle(float f) {
        this.f12172o = f;
        if (this.f12170m < 360.0f) {
            this.f12170m = 0.0f;
        }
        if (this.f12171n < 360.0f) {
            this.f12171n = 0.0f;
        }
        if (this.f12169l < 360.0f) {
            this.f12169l = 0.0f;
        }
        invalidate();
    }

    public void setLeftSweepAngle(float f) {
        this.f12170m = f;
        if (this.f12169l < 360.0f) {
            this.f12169l = 0.0f;
        }
        if (this.f12171n < 360.0f) {
            this.f12171n = 0.0f;
        }
        if (this.f12172o < 360.0f) {
            this.f12172o = 0.0f;
        }
        invalidate();
    }

    public void setRemoteRocker(EnumC3173a enumC3173a) {
        this.f12168k = enumC3173a;
        switch (enumC3173a) {
            case LEFT:
                this.f12161b = BitmapFactory.decodeResource(getResources(), C1704R.C1705drawable.newbie_left_rocker_bg);
                return;
            case RIGHT:
                this.f12161b = BitmapFactory.decodeResource(getResources(), C1704R.C1705drawable.newbie_right_rocker_bg);
                return;
            default:
                return;
        }
    }

    public void setRightSweepAngle(float f) {
        this.f12171n = f;
        if (this.f12170m < 360.0f) {
            this.f12170m = 0.0f;
        }
        if (this.f12169l < 360.0f) {
            this.f12169l = 0.0f;
        }
        if (this.f12172o < 360.0f) {
            this.f12172o = 0.0f;
        }
        invalidate();
    }

    public void setTopSweepAngle(float f) {
        this.f12169l = f;
        if (this.f12170m < 360.0f) {
            this.f12170m = 0.0f;
        }
        if (this.f12171n < 360.0f) {
            this.f12171n = 0.0f;
        }
        if (this.f12172o < 360.0f) {
            this.f12172o = 0.0f;
        }
        invalidate();
    }
}
