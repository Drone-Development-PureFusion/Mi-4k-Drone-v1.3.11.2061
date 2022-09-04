package com.fimi.soul.view.marknumberprogress;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.fimi.overseas.soul.C1704R;
/* loaded from: classes2.dex */
public class NumberMarkProgressBar extends View {

    /* renamed from: A */
    private static final String f12851A = "progress";

    /* renamed from: B */
    private static final String f12852B = "suffix";

    /* renamed from: C */
    private static final String f12853C = "prefix";

    /* renamed from: D */
    private static final String f12854D = "text_visibility";

    /* renamed from: E */
    private static final int f12855E = 0;

    /* renamed from: ac */
    private static final float f12856ac = -1.0f;

    /* renamed from: ad */
    private static final int f12857ad = -1;

    /* renamed from: ae */
    private static final int f12858ae = -1;

    /* renamed from: af */
    private static final int f12859af = 2130838559;

    /* renamed from: ag */
    private static final int f12860ag = 2130838560;

    /* renamed from: s */
    private static final String f12861s = "saved_instance";

    /* renamed from: t */
    private static final String f12862t = "text_color";

    /* renamed from: u */
    private static final String f12863u = "text_size";

    /* renamed from: v */
    private static final String f12864v = "reached_bar_height";

    /* renamed from: w */
    private static final String f12865w = "reached_bar_color";

    /* renamed from: x */
    private static final String f12866x = "unreached_bar_height";

    /* renamed from: y */
    private static final String f12867y = "unreached_bar_color";

    /* renamed from: z */
    private static final String f12868z = "max";

    /* renamed from: F */
    private float f12869F;

    /* renamed from: G */
    private float f12870G;

    /* renamed from: H */
    private float f12871H;

    /* renamed from: I */
    private String f12872I;

    /* renamed from: J */
    private Paint f12873J;

    /* renamed from: K */
    private Paint f12874K;

    /* renamed from: L */
    private Paint f12875L;

    /* renamed from: M */
    private Paint f12876M;

    /* renamed from: N */
    private Paint f12877N;

    /* renamed from: O */
    private Paint f12878O;

    /* renamed from: P */
    private Paint f12879P;

    /* renamed from: Q */
    private RectF f12880Q;

    /* renamed from: R */
    private RectF f12881R;

    /* renamed from: S */
    private float f12882S;

    /* renamed from: T */
    private boolean f12883T;

    /* renamed from: U */
    private boolean f12884U;

    /* renamed from: V */
    private boolean f12885V;

    /* renamed from: W */
    private AbstractC3290b f12886W;

    /* renamed from: a */
    private int f12887a;

    /* renamed from: aa */
    private int f12888aa;

    /* renamed from: ab */
    private Rect f12889ab;

    /* renamed from: ah */
    private int f12890ah;

    /* renamed from: ai */
    private int f12891ai;

    /* renamed from: aj */
    private float f12892aj;

    /* renamed from: ak */
    private int f12893ak;

    /* renamed from: al */
    private int f12894al;

    /* renamed from: am */
    private C3291c f12895am;

    /* renamed from: an */
    private int f12896an;

    /* renamed from: ao */
    private float f12897ao;

    /* renamed from: ap */
    private float f12898ap;

    /* renamed from: aq */
    private boolean f12899aq;

    /* renamed from: b */
    private int f12900b;

    /* renamed from: c */
    private int f12901c;

    /* renamed from: d */
    private int f12902d;

    /* renamed from: e */
    private int f12903e;

    /* renamed from: f */
    private float f12904f;

    /* renamed from: g */
    private float f12905g;

    /* renamed from: h */
    private float f12906h;

    /* renamed from: i */
    private String f12907i;

    /* renamed from: j */
    private String f12908j;

    /* renamed from: k */
    private String f12909k;

    /* renamed from: l */
    private final int f12910l;

    /* renamed from: m */
    private final int f12911m;

    /* renamed from: n */
    private final int f12912n;

    /* renamed from: o */
    private final float f12913o;

    /* renamed from: p */
    private final float f12914p;

    /* renamed from: q */
    private final float f12915q;

    /* renamed from: r */
    private final float f12916r;

    /* renamed from: com.fimi.soul.view.marknumberprogress.NumberMarkProgressBar$a */
    /* loaded from: classes2.dex */
    public enum EnumC3284a {
        Visible,
        Invisible
    }

    public NumberMarkProgressBar(Context context) {
        this(context, null);
    }

    public NumberMarkProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NumberMarkProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12887a = 100;
        this.f12900b = 0;
        this.f12907i = "%";
        this.f12908j = "";
        this.f12909k = "";
        this.f12910l = Color.rgb(66, 145, 241);
        this.f12911m = Color.rgb(66, 145, 241);
        this.f12912n = Color.rgb(204, 204, 204);
        this.f12872I = "";
        this.f12880Q = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f12881R = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f12883T = true;
        this.f12884U = true;
        this.f12885V = false;
        this.f12890ah = C1704R.C1705drawable.seek_thumb_normal;
        this.f12891ai = C1704R.C1705drawable.seek_thumb_pressed;
        this.f12892aj = -1.0f;
        this.f12893ak = -1;
        this.f12894al = -1;
        this.f12897ao = 10.0f;
        this.f12899aq = true;
        this.f12898ap = m28503a(6.0f);
        this.f12915q = m28503a(1.5f);
        this.f12916r = m28503a(1.0f);
        this.f12914p = m28495b(10.0f);
        this.f12913o = m28503a(3.0f);
        Resources resources = context.getResources();
        this.f12901c = resources.getColor(C1704R.color.progress_reached_color);
        this.f12902d = resources.getColor(C1704R.color.progress_unreached_color);
        this.f12903e = resources.getColor(C1704R.color.progress_text_color);
        this.f12904f = resources.getDimensionPixelSize(C1704R.dimen.progress_text_tile_size);
        this.f12905g = resources.getDimensionPixelSize(C1704R.dimen.progress_reached_bar_height);
        this.f12906h = resources.getDimensionPixelSize(C1704R.dimen.progress_unreached_bar_height);
        this.f12882S = this.f12913o;
        setMax(this.f12887a);
        int color = resources.getColor(C1704R.color.progress_reached_color);
        this.f12893ak = color;
        this.f12894al = color;
        this.f12888aa = resources.getDimensionPixelSize(C1704R.dimen.progress_circle_diameter);
        if (this.f12895am == null) {
            this.f12895am = new C3291c(getContext(), getHeight() / 2, this.f12893ak, this.f12894al, this.f12892aj, this.f12888aa);
            this.f12896an = (int) this.f12895am.m28450e();
            this.f12895am.m28459a(this.f12896an);
            this.f12895am.m28454b(this.f12896an);
        }
        m28504a();
    }

    /* renamed from: a */
    private int m28500a(int i, boolean z) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int paddingLeft = z ? getPaddingLeft() + getPaddingRight() : getPaddingTop() + getPaddingBottom();
        if (mode == 1073741824) {
            return size;
        }
        int suggestedMinimumWidth = (z ? getSuggestedMinimumWidth() : getSuggestedMinimumHeight()) + paddingLeft;
        return mode == Integer.MIN_VALUE ? z ? Math.max(suggestedMinimumWidth, size) : Math.min(suggestedMinimumWidth, size) : suggestedMinimumWidth;
    }

    /* renamed from: a */
    private void m28504a() {
        float m28503a = m28503a(1.3333334f);
        float m28503a2 = m28503a(0.6666667f);
        this.f12873J = new Paint(1);
        this.f12873J.setColor(this.f12901c);
        this.f12874K = new Paint(1);
        this.f12874K.setColor(this.f12902d);
        this.f12875L = new Paint(1);
        this.f12875L.setColor(this.f12901c);
        this.f12876M = new Paint(1);
        this.f12876M.setColor(this.f12902d);
        this.f12875L.setStrokeWidth(m28503a);
        this.f12876M.setStrokeWidth(m28503a);
        this.f12877N = new Paint(1);
        this.f12877N.setColor(this.f12903e);
        this.f12877N.setTextSize(this.f12904f);
        this.f12878O = new Paint(1);
        this.f12878O.setColor(this.f12901c);
        this.f12878O.setStrokeWidth(m28503a2);
        this.f12879P = new Paint(1);
        this.f12879P.setColor(this.f12902d);
        this.f12879P.setStrokeWidth(m28503a2);
    }

    /* renamed from: a */
    private void m28502a(float f, float f2) {
        if (this.f12895am.m28447h()) {
            this.f12895am.m28445j();
            invalidate();
        }
    }

    /* renamed from: a */
    private void m28498a(C3291c c3291c) {
        c3291c.m28446i();
        invalidate();
    }

    /* renamed from: a */
    private void m28497a(C3291c c3291c, float f) {
        int width = ((((int) f) - this.f12896an) * this.f12887a) / (getWidth() - (this.f12896an * 2));
        if (width > this.f12887a) {
            width = this.f12887a;
        }
        if (width < 0) {
            width = 0;
        }
        this.f12900b = width;
        m28498a(this.f12895am);
        invalidate();
    }

    /* renamed from: b */
    private void m28496b() {
        this.f12881R.left = this.f12896an;
        this.f12881R.top = (getHeight() / 2.0f) - (this.f12905g / 2.0f);
        this.f12881R.right = ((((getWidth() - this.f12896an) - this.f12896an) / (getMax() * 1.0f)) * getProgress()) + this.f12896an;
        this.f12881R.bottom = (getHeight() / 2.0f) + (this.f12905g / 2.0f);
        this.f12880Q.left = this.f12881R.right;
        this.f12880Q.right = getWidth() - this.f12896an;
        this.f12880Q.top = (getHeight() / 2.0f) + ((-this.f12906h) / 2.0f);
        this.f12880Q.bottom = (getHeight() / 2.0f) + (this.f12906h / 2.0f);
    }

    /* renamed from: b */
    private void m28494b(float f, float f2) {
        int width = ((((int) f) - this.f12896an) * this.f12887a) / (getWidth() - (this.f12896an * 2));
        if (width > this.f12887a) {
            width = this.f12887a;
        }
        if (width < 0) {
            width = 0;
        }
        if (this.f12895am.m28447h() || !this.f12895am.m28458a(f, f2)) {
            return;
        }
        this.f12900b = width;
        m28498a(this.f12895am);
    }

    /* renamed from: c */
    private void m28492c() {
        this.f12872I = String.format("%d", Integer.valueOf((getProgress() * this.f12887a) / getMax()));
        this.f12872I = this.f12908j + this.f12872I + this.f12907i;
        this.f12869F = this.f12877N.measureText(this.f12872I);
        if (getProgress() == 0) {
            this.f12884U = false;
            this.f12870G = this.f12896an;
        } else {
            this.f12884U = true;
            this.f12881R.left = this.f12896an;
            this.f12881R.top = (getHeight() / 2.0f) - (this.f12905g / 2.0f);
            this.f12881R.right = (((((getWidth() - this.f12896an) - this.f12896an) / (getMax() * 1.0f)) * getProgress()) - this.f12882S) + this.f12896an;
            this.f12881R.bottom = (getHeight() / 2.0f) + (this.f12905g / 2.0f);
            this.f12870G = this.f12881R.right + this.f12882S;
        }
        this.f12871H = (int) ((getHeight() / 2.0f) - ((this.f12877N.descent() + this.f12877N.ascent()) / 2.0f));
        if (this.f12870G + this.f12869F >= getWidth() - this.f12896an) {
            this.f12870G = (getWidth() - this.f12896an) - this.f12869F;
            this.f12881R.right = this.f12870G - this.f12882S;
        }
        float f = this.f12870G + this.f12869F + this.f12882S;
        if (f >= getWidth() - this.f12896an) {
            this.f12883T = false;
            return;
        }
        this.f12883T = true;
        this.f12880Q.left = f;
        this.f12880Q.right = getWidth() - this.f12896an;
        this.f12880Q.top = (getHeight() / 2.0f) + ((-this.f12906h) / 2.0f);
        this.f12880Q.bottom = (getHeight() / 2.0f) + (this.f12906h / 2.0f);
    }

    /* renamed from: c */
    private void m28491c(float f) {
        if (this.f12895am.m28447h()) {
            m28497a(this.f12895am, f);
        }
    }

    /* renamed from: a */
    public float m28503a(float f) {
        return (getResources().getDisplayMetrics().density * f) + 0.5f;
    }

    /* renamed from: a */
    public void m28501a(int i) {
        if (i > 0) {
            setProgress(getProgress() + i);
        }
        if (this.f12886W != null) {
            this.f12886W.mo28462a(getProgress(), getMax());
        }
    }

    /* renamed from: a */
    public void m28499a(Canvas canvas) {
        this.f12895am.m28459a(this.f12880Q.left);
        this.f12895am.m28457a(getHeight() / 2);
        this.f12895am.m28452c(getWidth() - this.f12896an);
        this.f12895am.m28456a(canvas);
    }

    /* renamed from: b */
    public float m28495b(float f) {
        return getResources().getDisplayMetrics().scaledDensity * f;
    }

    /* renamed from: b */
    public void m28493b(Canvas canvas) {
        this.f12872I = String.format("%d", Integer.valueOf((getProgress() * this.f12887a) / getMax()));
        this.f12872I = this.f12908j + this.f12872I + this.f12907i;
        if (this.f12889ab == null) {
            this.f12889ab = new Rect();
        }
        this.f12877N.getTextBounds(this.f12909k + this.f12872I, 0, (this.f12909k + this.f12872I).length(), this.f12889ab);
        canvas.drawText(this.f12909k + this.f12872I, (getWidth() / 2) - (this.f12889ab.width() / 2), getHeight() / 4, this.f12877N);
    }

    /* renamed from: c */
    public void m28490c(Canvas canvas) {
        canvas.drawLine(this.f12896an, (getHeight() / 2) - this.f12898ap, this.f12896an, this.f12898ap + (getHeight() / 2), this.f12874K);
        canvas.drawLine(getWidth() - this.f12896an, (getHeight() / 2) - this.f12898ap, getWidth() - this.f12896an, this.f12898ap + (getHeight() / 2), this.f12874K);
    }

    /* renamed from: d */
    public void m28489d(Canvas canvas) {
        float width = (getWidth() - (this.f12896an * 2)) / this.f12897ao;
        for (float f = this.f12881R.left; f < getWidth(); f += width) {
            if (f <= this.f12881R.right) {
                canvas.drawLine(f, (getHeight() / 2) - this.f12914p, f, (getHeight() / 2) + (this.f12905g / 2.0f), this.f12878O);
            } else {
                canvas.drawLine(f, (getHeight() / 2) - this.f12914p, f, (getHeight() / 2) + (this.f12906h / 2.0f), this.f12879P);
            }
        }
    }

    public int getMax() {
        return this.f12887a;
    }

    public String getPrefix() {
        return this.f12908j;
    }

    public int getProgress() {
        return this.f12900b;
    }

    public float getProgressTextSize() {
        return this.f12904f;
    }

    public boolean getProgressTextVisibility() {
        return this.f12885V;
    }

    public int getReachedBarColor() {
        return this.f12901c;
    }

    public float getReachedBarHeight() {
        return this.f12905g;
    }

    public String getSuffix() {
        return this.f12907i;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max((int) this.f12904f, Math.max((int) this.f12905g, (int) this.f12906h));
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return (int) this.f12904f;
    }

    public int getTextColor() {
        return this.f12903e;
    }

    public int getUnreachedBarColor() {
        return this.f12902d;
    }

    public float getUnreachedBarHeight() {
        return this.f12906h;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f12885V) {
            m28492c();
        } else {
            m28496b();
        }
        if (this.f12883T) {
            canvas.drawLine(this.f12896an, getHeight() / 2.0f, getWidth() - this.f12896an, getHeight() / 2.0f, this.f12876M);
        }
        if (this.f12884U) {
            canvas.drawLine(this.f12896an, getHeight() / 2.0f, this.f12881R.right, getHeight() / 2.0f, this.f12875L);
        }
        if (this.f12885V) {
            canvas.drawText(this.f12872I, this.f12870G, this.f12871H, this.f12877N);
        }
        m28490c(canvas);
        m28499a(canvas);
        if (this.f12886W != null && !this.f12899aq) {
            this.f12886W.mo28462a(getProgress(), this.f12887a);
        }
        this.f12899aq = false;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(m28500a(i, true), m28500a(i2, false));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        this.f12903e = bundle.getInt(f12862t);
        this.f12904f = bundle.getFloat(f12863u);
        this.f12905g = bundle.getFloat(f12864v);
        this.f12906h = bundle.getFloat(f12866x);
        this.f12901c = bundle.getInt(f12865w);
        this.f12902d = bundle.getInt(f12867y);
        m28504a();
        setMax(bundle.getInt(f12868z));
        setProgress(bundle.getInt("progress"));
        setPrefix(bundle.getString(f12853C));
        setSuffix(bundle.getString(f12852B));
        super.onRestoreInstanceState(bundle.getParcelable(f12861s));
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(f12861s, super.onSaveInstanceState());
        bundle.putInt(f12862t, getTextColor());
        bundle.putFloat(f12863u, getProgressTextSize());
        bundle.putFloat(f12864v, getReachedBarHeight());
        bundle.putFloat(f12866x, getUnreachedBarHeight());
        bundle.putInt(f12865w, getReachedBarColor());
        bundle.putInt(f12867y, getUnreachedBarColor());
        bundle.putInt(f12868z, getMax());
        bundle.putInt("progress", getProgress());
        bundle.putString(f12852B, getSuffix());
        bundle.putString(f12853C, getPrefix());
        bundle.putBoolean(f12854D, getProgressTextVisibility());
        return bundle;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        switch (motionEvent.getAction()) {
            case 0:
                m28494b(motionEvent.getX(), motionEvent.getY());
                return true;
            case 1:
            case 3:
                getParent().requestDisallowInterceptTouchEvent(false);
                m28502a(motionEvent.getX(), motionEvent.getY());
                return true;
            case 2:
                m28491c(motionEvent.getX());
                getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            default:
                return false;
        }
    }

    public void setMax(int i) {
        if (i > 0) {
            this.f12887a = i;
        }
    }

    public void setOnProgressBarListener(AbstractC3290b abstractC3290b) {
        this.f12886W = abstractC3290b;
    }

    public void setPrefix(String str) {
        if (str == null) {
            this.f12908j = "";
        } else {
            this.f12908j = str;
        }
    }

    public void setProgress(int i) {
        if (i > getMax() || i < 0) {
            return;
        }
        this.f12900b = i;
    }

    public void setProgressAndInvalidate(int i) {
        if (i > getMax() || i < 0) {
            return;
        }
        this.f12900b = i;
        invalidate();
    }

    public void setProgressTextColor(int i) {
        this.f12903e = i;
        this.f12877N.setColor(this.f12903e);
        invalidate();
    }

    public void setProgressTextSize(float f) {
        this.f12904f = f;
        this.f12877N.setTextSize(this.f12904f);
        invalidate();
    }

    public void setProgressTextVisibility(EnumC3284a enumC3284a) {
        invalidate();
    }

    public void setReachedBarColor(int i) {
        this.f12901c = i;
        this.f12873J.setColor(this.f12901c);
        invalidate();
    }

    public void setReachedBarHeight(float f) {
        this.f12905g = f;
    }

    public void setSuffix(String str) {
        if (str == null) {
            this.f12907i = "";
        } else {
            this.f12907i = str;
        }
    }

    public void setTitle(String str) {
        this.f12909k = str;
        invalidate();
    }

    public void setUnreachedBarColor(int i) {
        this.f12902d = i;
        this.f12874K.setColor(this.f12902d);
        invalidate();
    }

    public void setUnreachedBarHeight(float f) {
        this.f12906h = f;
    }
}
