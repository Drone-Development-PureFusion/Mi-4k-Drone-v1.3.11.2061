package com.fimi.soul.view;

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
/* loaded from: classes.dex */
public class CircleImageView extends ImageView {

    /* renamed from: a */
    private static final ImageView.ScaleType f11990a = ImageView.ScaleType.CENTER_CROP;

    /* renamed from: b */
    private static final Bitmap.Config f11991b = Bitmap.Config.ARGB_8888;

    /* renamed from: c */
    private static final int f11992c = 2;

    /* renamed from: d */
    private static final int f11993d = 0;

    /* renamed from: e */
    private static final int f11994e = -16777216;

    /* renamed from: f */
    private final RectF f11995f;

    /* renamed from: g */
    private final RectF f11996g;

    /* renamed from: h */
    private final Matrix f11997h;

    /* renamed from: i */
    private final Paint f11998i;

    /* renamed from: j */
    private final Paint f11999j;

    /* renamed from: k */
    private int f12000k;

    /* renamed from: l */
    private int f12001l;

    /* renamed from: m */
    private Bitmap f12002m;

    /* renamed from: n */
    private BitmapShader f12003n;

    /* renamed from: o */
    private int f12004o;

    /* renamed from: p */
    private int f12005p;

    /* renamed from: q */
    private float f12006q;

    /* renamed from: r */
    private float f12007r;

    /* renamed from: s */
    private boolean f12008s;

    /* renamed from: t */
    private boolean f12009t;

    public CircleImageView(Context context) {
        super(context);
        this.f11995f = new RectF();
        this.f11996g = new RectF();
        this.f11997h = new Matrix();
        this.f11998i = new Paint();
        this.f11999j = new Paint();
        this.f12000k = -16777216;
        this.f12001l = 0;
        m28956a();
    }

    public CircleImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircleImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11995f = new RectF();
        this.f11996g = new RectF();
        this.f11997h = new Matrix();
        this.f11998i = new Paint();
        this.f11999j = new Paint();
        this.f12000k = -16777216;
        this.f12001l = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1704R.styleable.CircleImageView, i, 0);
        this.f12001l = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f12000k = obtainStyledAttributes.getColor(1, -16777216);
        obtainStyledAttributes.recycle();
        m28956a();
    }

    /* renamed from: a */
    private Bitmap m28955a(Drawable drawable) {
        if (drawable == null) {
            return BitmapFactory.decodeResource(getResources(), C1704R.C1705drawable.defaultavatar);
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap createBitmap = drawable instanceof ColorDrawable ? Bitmap.createBitmap(2, 2, f11991b) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), f11991b);
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
    private void m28956a() {
        super.setScaleType(f11990a);
        this.f12008s = true;
        if (this.f12009t) {
            m28954b();
            this.f12009t = false;
        }
    }

    /* renamed from: b */
    private void m28954b() {
        if (!this.f12008s) {
            this.f12009t = true;
        } else if (this.f12002m == null) {
        } else {
            this.f12003n = new BitmapShader(this.f12002m, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
            this.f11998i.setAntiAlias(true);
            this.f11998i.setShader(this.f12003n);
            this.f11999j.setStyle(Paint.Style.STROKE);
            this.f11999j.setAntiAlias(true);
            this.f11999j.setColor(this.f12000k);
            this.f11999j.setStrokeWidth(this.f12001l);
            this.f12005p = this.f12002m.getHeight();
            this.f12004o = this.f12002m.getWidth();
            this.f11996g.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f12007r = Math.min((this.f11996g.height() - this.f12001l) / 2.0f, (this.f11996g.width() - this.f12001l) / 2.0f);
            this.f11995f.set(this.f12001l, this.f12001l, this.f11996g.width() - this.f12001l, this.f11996g.height() - this.f12001l);
            this.f12006q = Math.min(this.f11995f.height() / 2.0f, this.f11995f.width() / 2.0f);
            m28953c();
            invalidate();
        }
    }

    /* renamed from: c */
    private void m28953c() {
        float width;
        float f;
        float f2 = 0.0f;
        this.f11997h.set(null);
        if (this.f12004o * this.f11995f.height() > this.f11995f.width() * this.f12005p) {
            width = this.f11995f.height() / this.f12005p;
            f = (this.f11995f.width() - (this.f12004o * width)) * 0.5f;
        } else {
            width = this.f11995f.width() / this.f12004o;
            f = 0.0f;
            f2 = (this.f11995f.height() - (this.f12005p * width)) * 0.5f;
        }
        this.f11997h.setScale(width, width);
        this.f11997h.postTranslate(((int) (f + 0.5f)) + this.f12001l, ((int) (f2 + 0.5f)) + this.f12001l);
        this.f12003n.setLocalMatrix(this.f11997h);
    }

    public int getBorderColor() {
        return this.f12000k;
    }

    public int getBorderWidth() {
        return this.f12001l;
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return f11990a;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (getDrawable() == null) {
            return;
        }
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, this.f12006q, this.f11998i);
        if (this.f12001l == 0) {
            return;
        }
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, this.f12007r, this.f11999j);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m28954b();
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean z) {
        if (z) {
            throw new IllegalArgumentException("adjustViewBounds not supported.");
        }
    }

    public void setBorderColor(int i) {
        if (i == this.f12000k) {
            return;
        }
        this.f12000k = i;
        this.f11999j.setColor(this.f12000k);
        invalidate();
    }

    public void setBorderWidth(int i) {
        if (i == this.f12001l) {
            return;
        }
        this.f12001l = i;
        m28954b();
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        this.f12002m = bitmap;
        m28954b();
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        this.f12002m = m28955a(drawable);
        m28954b();
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        this.f12002m = m28955a(getDrawable());
        m28954b();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        this.f12002m = m28955a(getDrawable());
        m28954b();
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType != f11990a) {
            throw new IllegalArgumentException(String.format("ScaleType %s not supported.", scaleType));
        }
    }
}
