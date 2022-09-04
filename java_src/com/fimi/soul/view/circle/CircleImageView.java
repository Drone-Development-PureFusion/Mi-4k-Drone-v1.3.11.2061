package com.fimi.soul.view.circle;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.C1756a;
/* loaded from: classes2.dex */
public class CircleImageView extends ImageView {

    /* renamed from: a */
    private static final ImageView.ScaleType f12551a = ImageView.ScaleType.CENTER_CROP;

    /* renamed from: b */
    private static final Bitmap.Config f12552b = Bitmap.Config.ARGB_8888;

    /* renamed from: c */
    private static final int f12553c = 2;

    /* renamed from: d */
    private static final int f12554d = 0;

    /* renamed from: e */
    private static final int f12555e = -16777216;

    /* renamed from: f */
    private final RectF f12556f;

    /* renamed from: g */
    private final RectF f12557g;

    /* renamed from: h */
    private final Matrix f12558h;

    /* renamed from: i */
    private final Paint f12559i;

    /* renamed from: j */
    private final Paint f12560j;

    /* renamed from: k */
    private int f12561k;

    /* renamed from: l */
    private int f12562l;

    /* renamed from: m */
    private Bitmap f12563m;

    /* renamed from: n */
    private BitmapShader f12564n;

    /* renamed from: o */
    private int f12565o;

    /* renamed from: p */
    private int f12566p;

    /* renamed from: q */
    private float f12567q;

    /* renamed from: r */
    private float f12568r;

    /* renamed from: s */
    private boolean f12569s;

    /* renamed from: t */
    private boolean f12570t;

    public CircleImageView(Context context) {
        super(context);
        this.f12556f = new RectF();
        this.f12557g = new RectF();
        this.f12558h = new Matrix();
        this.f12559i = new Paint();
        this.f12560j = new Paint();
        this.f12561k = -16777216;
        this.f12562l = 0;
        m28698a();
    }

    public CircleImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircleImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12556f = new RectF();
        this.f12557g = new RectF();
        this.f12558h = new Matrix();
        this.f12559i = new Paint();
        this.f12560j = new Paint();
        this.f12561k = -16777216;
        this.f12562l = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1704R.styleable.CircleImageView, i, 0);
        this.f12562l = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f12561k = obtainStyledAttributes.getColor(1, -16777216);
        obtainStyledAttributes.recycle();
        m28698a();
    }

    /* renamed from: a */
    private Bitmap m28697a(Drawable drawable) {
        C1756a.m34261a((drawable instanceof BitmapDrawable) + "|drawable=" + drawable, CircleImageView.class);
        if (drawable == null) {
            return BitmapFactory.decodeResource(getResources(), C1704R.C1705drawable.defaultavatar);
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap createBitmap = drawable instanceof ColorDrawable ? Bitmap.createBitmap(2, 2, f12552b) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), f12552b);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return createBitmap;
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    private void m28698a() {
        super.setScaleType(f12551a);
        this.f12569s = true;
        if (this.f12570t) {
            m28696b();
            this.f12570t = false;
        }
    }

    /* renamed from: b */
    private void m28696b() {
        if (!this.f12569s) {
            this.f12570t = true;
        } else if (this.f12563m == null) {
        } else {
            this.f12564n = new BitmapShader(this.f12563m, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
            this.f12559i.setAntiAlias(true);
            this.f12559i.setShader(this.f12564n);
            this.f12560j.setStyle(Paint.Style.STROKE);
            this.f12560j.setAntiAlias(true);
            this.f12560j.setColor(this.f12561k);
            this.f12560j.setStrokeWidth(this.f12562l);
            this.f12566p = this.f12563m.getHeight();
            this.f12565o = this.f12563m.getWidth();
            this.f12557g.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f12568r = Math.min((this.f12557g.height() - this.f12562l) / 2.0f, (this.f12557g.width() - this.f12562l) / 2.0f);
            this.f12556f.set(this.f12562l, this.f12562l, this.f12557g.width() - this.f12562l, this.f12557g.height() - this.f12562l);
            this.f12567q = Math.min(this.f12556f.height() / 2.0f, this.f12556f.width() / 2.0f);
            m28695c();
            invalidate();
        }
    }

    /* renamed from: c */
    private void m28695c() {
        float width;
        float f;
        float f2 = 0.0f;
        this.f12558h.set(null);
        if (this.f12565o * this.f12556f.height() > this.f12556f.width() * this.f12566p) {
            width = this.f12556f.height() / this.f12566p;
            f = (this.f12556f.width() - (this.f12565o * width)) * 0.5f;
        } else {
            width = this.f12556f.width() / this.f12565o;
            f = 0.0f;
            f2 = (this.f12556f.height() - (this.f12566p * width)) * 0.5f;
        }
        this.f12558h.setScale(width, width);
        this.f12558h.postTranslate(((int) (f + 0.5f)) + this.f12562l, ((int) (f2 + 0.5f)) + this.f12562l);
        this.f12564n.setLocalMatrix(this.f12558h);
    }

    public int getBorderColor() {
        return this.f12561k;
    }

    public int getBorderWidth() {
        return this.f12562l;
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return f12551a;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (getDrawable() == null) {
            return;
        }
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, this.f12567q, this.f12559i);
        if (this.f12562l == 0) {
            return;
        }
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, this.f12568r, this.f12560j);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m28696b();
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean z) {
        if (z) {
            throw new IllegalArgumentException("adjustViewBounds not supported.");
        }
    }

    public void setBorderColor(int i) {
        if (i == this.f12561k) {
            return;
        }
        this.f12561k = i;
        this.f12560j.setColor(this.f12561k);
        invalidate();
    }

    public void setBorderWidth(int i) {
        if (i == this.f12562l) {
            return;
        }
        this.f12562l = i;
        m28696b();
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        this.f12563m = bitmap;
        m28696b();
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        this.f12563m = m28697a(drawable);
        m28696b();
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        this.f12563m = m28697a(getDrawable());
        m28696b();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        this.f12563m = m28697a(getDrawable());
        m28696b();
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType != f12551a) {
            throw new IllegalArgumentException(String.format("ScaleType %s not supported.", scaleType));
        }
    }
}
