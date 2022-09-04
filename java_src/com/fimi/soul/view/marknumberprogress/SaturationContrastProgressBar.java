package com.fimi.soul.view.marknumberprogress;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.fimi.overseas.soul.C1704R;
import java.util.Timer;
import java.util.TimerTask;
/* loaded from: classes2.dex */
public class SaturationContrastProgressBar extends View {

    /* renamed from: A */
    private static final String f12920A = "progress";

    /* renamed from: B */
    private static final String f12921B = "suffix";

    /* renamed from: C */
    private static final String f12922C = "prefix";

    /* renamed from: D */
    private static final String f12923D = "text_visibility";

    /* renamed from: E */
    private static final int f12924E = 0;

    /* renamed from: aa */
    private static final float f12925aa = -1.0f;

    /* renamed from: ab */
    private static final int f12926ab = -1;

    /* renamed from: ac */
    private static final int f12927ac = -1;

    /* renamed from: ad */
    private static final int f12928ad = 2130838559;

    /* renamed from: ae */
    private static final int f12929ae = 2130838560;

    /* renamed from: s */
    private static final String f12930s = "saved_instance";

    /* renamed from: t */
    private static final String f12931t = "text_color";

    /* renamed from: u */
    private static final String f12932u = "text_size";

    /* renamed from: v */
    private static final String f12933v = "reached_bar_height";

    /* renamed from: w */
    private static final String f12934w = "reached_bar_color";

    /* renamed from: x */
    private static final String f12935x = "unreached_bar_height";

    /* renamed from: y */
    private static final String f12936y = "unreached_bar_color";

    /* renamed from: z */
    private static final String f12937z = "max";

    /* renamed from: F */
    private float f12938F;

    /* renamed from: G */
    private float f12939G;

    /* renamed from: H */
    private float f12940H;

    /* renamed from: I */
    private String f12941I;

    /* renamed from: J */
    private Paint f12942J;

    /* renamed from: K */
    private Paint f12943K;

    /* renamed from: L */
    private Paint f12944L;

    /* renamed from: M */
    private Paint f12945M;

    /* renamed from: N */
    private Paint f12946N;

    /* renamed from: O */
    private RectF f12947O;

    /* renamed from: P */
    private RectF f12948P;

    /* renamed from: Q */
    private float f12949Q;

    /* renamed from: R */
    private boolean f12950R;

    /* renamed from: S */
    private boolean f12951S;

    /* renamed from: T */
    private boolean f12952T;

    /* renamed from: U */
    private AbstractC3290b f12953U;

    /* renamed from: V */
    private int f12954V;

    /* renamed from: W */
    private Rect f12955W;

    /* renamed from: a */
    private int f12956a;

    /* renamed from: af */
    private int f12957af;

    /* renamed from: ag */
    private int f12958ag;

    /* renamed from: ah */
    private float f12959ah;

    /* renamed from: ai */
    private int f12960ai;

    /* renamed from: aj */
    private int f12961aj;

    /* renamed from: ak */
    private C3292d f12962ak;

    /* renamed from: al */
    private int f12963al;

    /* renamed from: am */
    private float f12964am;

    /* renamed from: an */
    private boolean f12965an;

    /* renamed from: ao */
    private float f12966ao;

    /* renamed from: ap */
    private int f12967ap;

    /* renamed from: aq */
    private Timer f12968aq;

    /* renamed from: ar */
    private final int f12969ar;

    /* renamed from: as */
    private Handler f12970as;

    /* renamed from: b */
    private int f12971b;

    /* renamed from: c */
    private int f12972c;

    /* renamed from: d */
    private int f12973d;

    /* renamed from: e */
    private int f12974e;

    /* renamed from: f */
    private float f12975f;

    /* renamed from: g */
    private float f12976g;

    /* renamed from: h */
    private float f12977h;

    /* renamed from: i */
    private String f12978i;

    /* renamed from: j */
    private String f12979j;

    /* renamed from: k */
    private String f12980k;

    /* renamed from: l */
    private final int f12981l;

    /* renamed from: m */
    private final int f12982m;

    /* renamed from: n */
    private final int f12983n;

    /* renamed from: o */
    private final float f12984o;

    /* renamed from: p */
    private final float f12985p;

    /* renamed from: q */
    private final float f12986q;

    /* renamed from: r */
    private final float f12987r;

    /* renamed from: com.fimi.soul.view.marknumberprogress.SaturationContrastProgressBar$a */
    /* loaded from: classes2.dex */
    public enum EnumC3287a {
        Visible,
        Invisible
    }

    public SaturationContrastProgressBar(Context context) {
        this(context, null);
    }

    public SaturationContrastProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SaturationContrastProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12956a = 256;
        this.f12971b = 0;
        this.f12978i = "%";
        this.f12979j = "";
        this.f12980k = "";
        this.f12981l = Color.rgb(66, 145, 241);
        this.f12982m = Color.rgb(66, 145, 241);
        this.f12983n = Color.rgb(204, 204, 204);
        this.f12941I = "";
        this.f12947O = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f12948P = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f12950R = true;
        this.f12951S = true;
        this.f12952T = false;
        this.f12957af = C1704R.C1705drawable.seek_thumb_normal;
        this.f12958ag = C1704R.C1705drawable.seek_thumb_pressed;
        this.f12959ah = -1.0f;
        this.f12960ai = -1;
        this.f12961aj = -1;
        this.f12964am = 10.0f;
        this.f12965an = true;
        this.f12969ar = 0;
        this.f12970as = new Handler() { // from class: com.fimi.soul.view.marknumberprogress.SaturationContrastProgressBar.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                super.handleMessage(message);
                switch (message.what) {
                    case 0:
                        if (SaturationContrastProgressBar.this.f12953U == null) {
                            return;
                        }
                        SaturationContrastProgressBar.this.f12953U.mo28461b(SaturationContrastProgressBar.this.getProgress(), SaturationContrastProgressBar.this.f12956a);
                        return;
                    default:
                        return;
                }
            }
        };
        this.f12966ao = m28487a(6.0f);
        this.f12986q = m28487a(2.0f);
        this.f12987r = m28487a(2.0f);
        this.f12985p = m28478b(10.0f);
        this.f12984o = m28487a(3.0f);
        Resources resources = context.getResources();
        this.f12972c = resources.getColor(C1704R.color.progress_reached_color);
        this.f12973d = resources.getColor(C1704R.color.progress_unreached_color);
        this.f12974e = resources.getColor(C1704R.color.progress_text_color);
        this.f12975f = resources.getDimensionPixelSize(C1704R.dimen.progress_text_tile_size);
        this.f12976g = resources.getDimensionPixelSize(C1704R.dimen.progress_reached_bar_height);
        this.f12977h = resources.getDimensionPixelSize(C1704R.dimen.progress_unreached_bar_height);
        this.f12949Q = this.f12984o;
        setProgress(0);
        setMax(this.f12956a);
        int color = resources.getColor(C1704R.color.progress_reached_color);
        this.f12960ai = color;
        this.f12961aj = color;
        this.f12954V = resources.getDimensionPixelSize(C1704R.dimen.progress_circle_diameter);
        if (this.f12962ak == null) {
            this.f12962ak = new C3292d(getContext(), getHeight() / 2, this.f12960ai, this.f12961aj, this.f12959ah, this.f12954V);
            this.f12963al = (int) this.f12962ak.m28434e();
            this.f12962ak.m28443a(this.f12963al);
            this.f12962ak.m28438b(this.f12963al);
        }
        m28479b();
    }

    /* renamed from: a */
    private int m28484a(int i, boolean z) {
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
    private void m28486a(float f, float f2) {
        if (this.f12962ak.m28431h()) {
            this.f12962ak.m28429j();
            invalidate();
        }
    }

    /* renamed from: a */
    private void m28481a(C3292d c3292d) {
        c3292d.m28430i();
        invalidate();
    }

    /* renamed from: a */
    private void m28480a(C3292d c3292d, float f) {
        int width = ((((int) f) - this.f12963al) * this.f12956a) / (getWidth() - (this.f12963al * 2));
        if (width > this.f12956a) {
            width = this.f12956a;
        }
        if (width < 0) {
            width = 0;
        }
        this.f12971b = width;
        m28481a(this.f12962ak);
        invalidate();
    }

    /* renamed from: b */
    private void m28479b() {
        this.f12942J = new Paint(1);
        this.f12942J.setColor(this.f12972c);
        this.f12943K = new Paint(1);
        this.f12943K.setColor(this.f12973d);
        this.f12944L = new Paint(1);
        this.f12944L.setColor(this.f12974e);
        this.f12944L.setTextSize(this.f12975f);
        this.f12945M = new Paint(1);
        this.f12945M.setColor(this.f12972c);
        this.f12945M.setStrokeWidth(this.f12987r);
        this.f12946N = new Paint(1);
        this.f12946N.setColor(this.f12973d);
        this.f12946N.setStrokeWidth(this.f12987r);
    }

    /* renamed from: b */
    private void m28477b(float f, float f2) {
        int width = ((((int) f) - this.f12963al) * this.f12956a) / (getWidth() - (this.f12963al * 2));
        if (width > this.f12956a) {
            width = this.f12956a;
        }
        if (width < 0) {
            width = 0;
        }
        if (this.f12962ak.m28431h() || !this.f12962ak.m28442a(f, f2)) {
            return;
        }
        this.f12971b = width;
        m28481a(this.f12962ak);
    }

    /* renamed from: c */
    private void m28474c() {
        this.f12948P.left = this.f12963al;
        this.f12948P.top = (getHeight() / 2.0f) - (this.f12976g / 2.0f);
        this.f12948P.right = ((((getWidth() - this.f12963al) - this.f12963al) / (getMax() * 1.0f)) * getProgress()) + this.f12963al;
        this.f12948P.bottom = (getHeight() / 2.0f) + (this.f12976g / 2.0f);
        this.f12947O.left = this.f12948P.right;
        this.f12947O.right = getWidth() - this.f12963al;
        this.f12947O.top = (getHeight() / 2.0f) + ((-this.f12977h) / 2.0f);
        this.f12947O.bottom = (getHeight() / 2.0f) + (this.f12977h / 2.0f);
    }

    /* renamed from: c */
    private void m28473c(float f) {
        if (this.f12962ak.m28431h()) {
            m28480a(this.f12962ak, f);
        }
    }

    /* renamed from: d */
    private void m28470d() {
        this.f12941I = String.format("%d", Integer.valueOf((getProgress() * this.f12956a) / getMax()));
        this.f12941I = this.f12979j + this.f12941I + this.f12978i;
        this.f12938F = this.f12944L.measureText(this.f12941I);
        if (getProgress() == 0) {
            this.f12951S = false;
            this.f12939G = this.f12963al;
        } else {
            this.f12951S = true;
            this.f12948P.left = this.f12963al;
            this.f12948P.top = (getHeight() / 2.0f) - (this.f12976g / 2.0f);
            this.f12948P.right = (((((getWidth() - this.f12963al) - this.f12963al) / (getMax() * 1.0f)) * getProgress()) - this.f12949Q) + this.f12963al;
            this.f12948P.bottom = (getHeight() / 2.0f) + (this.f12976g / 2.0f);
            this.f12939G = this.f12948P.right + this.f12949Q;
        }
        this.f12940H = (int) ((getHeight() / 2.0f) - ((this.f12944L.descent() + this.f12944L.ascent()) / 2.0f));
        if (this.f12939G + this.f12938F >= getWidth() - this.f12963al) {
            this.f12939G = (getWidth() - this.f12963al) - this.f12938F;
            this.f12948P.right = this.f12939G - this.f12949Q;
        }
        float f = this.f12939G + this.f12938F + this.f12949Q;
        if (f >= getWidth() - this.f12963al) {
            this.f12950R = false;
            return;
        }
        this.f12950R = true;
        this.f12947O.left = f;
        this.f12947O.right = getWidth() - this.f12963al;
        this.f12947O.top = (getHeight() / 2.0f) + ((-this.f12977h) / 2.0f);
        this.f12947O.bottom = (getHeight() / 2.0f) + (this.f12977h / 2.0f);
    }

    /* renamed from: a */
    public float m28487a(float f) {
        return (getResources().getDisplayMetrics().density * f) + 0.5f;
    }

    /* renamed from: a */
    public void m28488a() {
        this.f12970as.removeMessages(0);
        if (this.f12968aq != null) {
            this.f12968aq.cancel();
            this.f12968aq = null;
        }
        if (this.f12968aq == null) {
            this.f12968aq = new Timer();
        }
        this.f12968aq.schedule(new TimerTask() { // from class: com.fimi.soul.view.marknumberprogress.SaturationContrastProgressBar.2
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                SaturationContrastProgressBar.this.f12970as.sendEmptyMessage(0);
            }
        }, 200L);
    }

    /* renamed from: a */
    public void m28485a(int i) {
        if (i > 0) {
            setProgress(getProgress() + i);
        }
        if (this.f12953U != null) {
            this.f12953U.mo28462a(getProgress(), getMax());
        }
    }

    /* renamed from: a */
    public void m28483a(Canvas canvas) {
        this.f12962ak.m28443a(this.f12947O.left);
        this.f12962ak.m28441a(getHeight() / 2);
        this.f12962ak.m28436c(getWidth() - this.f12963al);
        this.f12962ak.m28440a(canvas);
    }

    /* renamed from: b */
    public float m28478b(float f) {
        return getResources().getDisplayMetrics().scaledDensity * f;
    }

    /* renamed from: b */
    public void m28476b(Canvas canvas) {
        this.f12941I = String.format("%d", Integer.valueOf((getProgress() * this.f12956a) / getMax()));
        this.f12941I = this.f12979j + this.f12941I + this.f12978i;
        if (this.f12955W == null) {
            this.f12955W = new Rect();
        }
        this.f12944L.getTextBounds(this.f12980k + this.f12941I, 0, (this.f12980k + this.f12941I).length(), this.f12955W);
        canvas.drawText(this.f12980k + this.f12941I, (getWidth() / 2) - (this.f12955W.width() / 2), getHeight() / 4, this.f12944L);
    }

    /* renamed from: c */
    public void m28472c(Canvas canvas) {
        canvas.drawLine(this.f12963al, (getHeight() / 2) - this.f12966ao, this.f12963al, this.f12966ao + (getHeight() / 2), this.f12943K);
        canvas.drawLine(getWidth() - this.f12963al, (getHeight() / 2) - this.f12966ao, getWidth() - this.f12963al, this.f12966ao + (getHeight() / 2), this.f12943K);
    }

    /* renamed from: d */
    public void m28469d(Canvas canvas) {
        float width = (getWidth() - (this.f12963al * 2)) / this.f12964am;
        for (float f = this.f12948P.left; f < getWidth(); f += width) {
            if (f <= this.f12948P.right) {
                canvas.drawLine(f, (getHeight() / 2) - this.f12985p, f, (getHeight() / 2) + (this.f12976g / 2.0f), this.f12945M);
            } else {
                canvas.drawLine(f, (getHeight() / 2) - this.f12985p, f, (getHeight() / 2) + (this.f12977h / 2.0f), this.f12946N);
            }
        }
    }

    public int getMax() {
        return this.f12956a;
    }

    public String getPrefix() {
        return this.f12979j;
    }

    public int getProgress() {
        return this.f12971b;
    }

    public float getProgressTextSize() {
        return this.f12975f;
    }

    public boolean getProgressTextVisibility() {
        return this.f12952T;
    }

    public int getReachedBarColor() {
        return this.f12972c;
    }

    public float getReachedBarHeight() {
        return this.f12976g;
    }

    public String getSuffix() {
        return this.f12978i;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max((int) this.f12975f, Math.max((int) this.f12976g, (int) this.f12977h));
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return (int) this.f12975f;
    }

    public int getTextColor() {
        return this.f12974e;
    }

    public int getUnreachedBarColor() {
        return this.f12973d;
    }

    public float getUnreachedBarHeight() {
        return this.f12977h;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f12952T) {
            m28470d();
        } else {
            m28474c();
        }
        if (this.f12951S) {
            canvas.drawRect(this.f12948P, this.f12942J);
        }
        if (this.f12950R) {
            canvas.drawRect(this.f12947O, this.f12943K);
        }
        if (this.f12952T) {
            canvas.drawText(this.f12941I, this.f12939G, this.f12940H, this.f12944L);
        }
        m28472c(canvas);
        m28483a(canvas);
        if (this.f12953U == null || this.f12967ap == this.f12971b) {
            return;
        }
        this.f12967ap = this.f12971b;
        this.f12953U.mo28462a(getProgress(), this.f12956a);
        this.f12970as.removeMessages(0);
        m28488a();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(m28484a(i, true), m28484a(i2, false));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        this.f12974e = bundle.getInt(f12931t);
        this.f12975f = bundle.getFloat(f12932u);
        this.f12976g = bundle.getFloat(f12933v);
        this.f12977h = bundle.getFloat(f12935x);
        this.f12972c = bundle.getInt(f12934w);
        this.f12973d = bundle.getInt(f12936y);
        m28479b();
        setMax(bundle.getInt(f12937z));
        setProgress(bundle.getInt("progress"));
        setPrefix(bundle.getString(f12922C));
        setSuffix(bundle.getString(f12921B));
        super.onRestoreInstanceState(bundle.getParcelable(f12930s));
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(f12930s, super.onSaveInstanceState());
        bundle.putInt(f12931t, getTextColor());
        bundle.putFloat(f12932u, getProgressTextSize());
        bundle.putFloat(f12933v, getReachedBarHeight());
        bundle.putFloat(f12935x, getUnreachedBarHeight());
        bundle.putInt(f12934w, getReachedBarColor());
        bundle.putInt(f12936y, getUnreachedBarColor());
        bundle.putInt(f12937z, getMax());
        bundle.putInt("progress", getProgress());
        bundle.putString(f12921B, getSuffix());
        bundle.putString(f12922C, getPrefix());
        bundle.putBoolean(f12923D, getProgressTextVisibility());
        return bundle;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        switch (motionEvent.getAction()) {
            case 0:
                m28477b(motionEvent.getX(), motionEvent.getY());
                if (this.f12953U != null) {
                    this.f12953U.mo28463a(0);
                }
                return true;
            case 1:
                if (this.f12953U != null) {
                    this.f12953U.mo28463a(1);
                    break;
                }
                break;
            case 2:
                m28473c(motionEvent.getX());
                getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            case 3:
                break;
            default:
                return false;
        }
        getParent().requestDisallowInterceptTouchEvent(false);
        m28486a(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    public void setMax(int i) {
        if (i > 0) {
            this.f12956a = i;
            invalidate();
        }
    }

    public void setOnProgressBarListener(AbstractC3290b abstractC3290b) {
        this.f12953U = abstractC3290b;
    }

    public void setPrefix(String str) {
        if (str == null) {
            this.f12979j = "";
        } else {
            this.f12979j = str;
        }
    }

    public void setProgress(int i) {
        if (i > getMax() || i < 0) {
            return;
        }
        this.f12971b = i;
        this.f12967ap = this.f12971b;
        invalidate();
    }

    public void setProgressTextColor(int i) {
        this.f12974e = i;
        this.f12944L.setColor(this.f12974e);
        invalidate();
    }

    public void setProgressTextSize(float f) {
        this.f12975f = f;
        this.f12944L.setTextSize(this.f12975f);
        invalidate();
    }

    public void setProgressTextVisibility(EnumC3287a enumC3287a) {
        invalidate();
    }

    public void setReachedBarColor(int i) {
        this.f12972c = i;
        this.f12942J.setColor(this.f12972c);
        invalidate();
    }

    public void setReachedBarHeight(float f) {
        this.f12976g = f;
    }

    public void setSuffix(String str) {
        if (str == null) {
            this.f12978i = "";
        } else {
            this.f12978i = str;
        }
    }

    public void setTitle(String str) {
        this.f12980k = str;
        invalidate();
    }

    public void setUnreachedBarColor(int i) {
        this.f12973d = i;
        this.f12943K.setColor(this.f12973d);
        invalidate();
    }

    public void setUnreachedBarHeight(float f) {
        this.f12977h = f;
    }
}
