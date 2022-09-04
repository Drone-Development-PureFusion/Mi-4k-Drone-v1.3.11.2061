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
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.fimi.overseas.soul.C1704R;
import java.util.Timer;
import java.util.TimerTask;
/* loaded from: classes2.dex */
public class EvProgressBar extends View {

    /* renamed from: A */
    private static final String f12771A = "reached_bar_color";

    /* renamed from: B */
    private static final String f12772B = "unreached_bar_height";

    /* renamed from: C */
    private static final String f12773C = "unreached_bar_color";

    /* renamed from: D */
    private static final String f12774D = "max";

    /* renamed from: E */
    private static final String f12775E = "progress";

    /* renamed from: F */
    private static final String f12776F = "suffix";

    /* renamed from: G */
    private static final String f12777G = "prefix";

    /* renamed from: H */
    private static final String f12778H = "text_visibility";

    /* renamed from: I */
    private static final int f12779I = 0;

    /* renamed from: ac */
    private static final float f12780ac = -1.0f;

    /* renamed from: ad */
    private static final int f12781ad = -1;

    /* renamed from: ae */
    private static final int f12782ae = -1;

    /* renamed from: af */
    private static final int f12783af = 2130838559;

    /* renamed from: ag */
    private static final int f12784ag = 2130838560;

    /* renamed from: w */
    private static final String f12785w = "saved_instance";

    /* renamed from: x */
    private static final String f12786x = "text_color";

    /* renamed from: y */
    private static final String f12787y = "text_size";

    /* renamed from: z */
    private static final String f12788z = "reached_bar_height";

    /* renamed from: J */
    private float f12789J;

    /* renamed from: K */
    private float f12790K;

    /* renamed from: L */
    private float f12791L;

    /* renamed from: M */
    private String f12792M;

    /* renamed from: N */
    private Paint f12793N;

    /* renamed from: O */
    private Paint f12794O;

    /* renamed from: P */
    private Paint f12795P;

    /* renamed from: Q */
    private Paint f12796Q;

    /* renamed from: R */
    private Paint f12797R;

    /* renamed from: S */
    private RectF f12798S;

    /* renamed from: T */
    private RectF f12799T;

    /* renamed from: U */
    private float f12800U;

    /* renamed from: V */
    private boolean f12801V;

    /* renamed from: W */
    private boolean f12802W;

    /* renamed from: a */
    private int f12803a;

    /* renamed from: aa */
    private AbstractC3290b f12804aa;

    /* renamed from: ab */
    private Rect f12805ab;

    /* renamed from: ah */
    private int f12806ah;

    /* renamed from: ai */
    private int f12807ai;

    /* renamed from: aj */
    private float f12808aj;

    /* renamed from: ak */
    private int f12809ak;

    /* renamed from: al */
    private int f12810al;

    /* renamed from: am */
    private C3292d f12811am;

    /* renamed from: an */
    private int f12812an;

    /* renamed from: ao */
    private float f12813ao;

    /* renamed from: ap */
    private Paint f12814ap;

    /* renamed from: aq */
    private int f12815aq;

    /* renamed from: ar */
    private float f12816ar;

    /* renamed from: as */
    private Paint f12817as;

    /* renamed from: at */
    private Paint f12818at;

    /* renamed from: au */
    private Paint f12819au;

    /* renamed from: av */
    private Paint f12820av;

    /* renamed from: aw */
    private int f12821aw;

    /* renamed from: ax */
    private Timer f12822ax;

    /* renamed from: ay */
    private final int f12823ay;

    /* renamed from: az */
    private Handler f12824az;

    /* renamed from: b */
    private float f12825b;

    /* renamed from: c */
    private int f12826c;

    /* renamed from: d */
    private int f12827d;

    /* renamed from: e */
    private int f12828e;

    /* renamed from: f */
    private int f12829f;

    /* renamed from: g */
    private int f12830g;

    /* renamed from: h */
    private float f12831h;

    /* renamed from: i */
    private float f12832i;

    /* renamed from: j */
    private float f12833j;

    /* renamed from: k */
    private String f12834k;

    /* renamed from: l */
    private String f12835l;

    /* renamed from: m */
    private String f12836m;

    /* renamed from: n */
    private final int f12837n;

    /* renamed from: o */
    private final int f12838o;

    /* renamed from: p */
    private final int f12839p;

    /* renamed from: q */
    private final float f12840q;

    /* renamed from: r */
    private final float f12841r;

    /* renamed from: s */
    private final float f12842s;

    /* renamed from: t */
    private final float f12843t;

    /* renamed from: u */
    private final float f12844u;

    /* renamed from: v */
    private final float f12845v;

    /* renamed from: com.fimi.soul.view.marknumberprogress.EvProgressBar$a */
    /* loaded from: classes2.dex */
    public enum EnumC3283a {
        Visible,
        Invisible
    }

    public EvProgressBar(Context context) {
        this(context, null);
    }

    public EvProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EvProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12803a = 12;
        this.f12825b = 12.0f;
        this.f12826c = 6;
        this.f12827d = 0;
        this.f12834k = "";
        this.f12835l = "";
        this.f12836m = "";
        this.f12837n = Color.rgb(66, 145, 241);
        this.f12838o = Color.rgb(66, 145, 241);
        this.f12839p = Color.rgb(204, 204, 204);
        this.f12792M = "";
        this.f12798S = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f12799T = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f12801V = true;
        this.f12802W = true;
        this.f12806ah = C1704R.C1705drawable.seek_thumb_normal;
        this.f12807ai = C1704R.C1705drawable.seek_thumb_pressed;
        this.f12808aj = -1.0f;
        this.f12809ak = -1;
        this.f12810al = -1;
        this.f12823ay = 0;
        this.f12824az = new Handler() { // from class: com.fimi.soul.view.marknumberprogress.EvProgressBar.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                super.handleMessage(message);
                switch (message.what) {
                    case 0:
                        if (EvProgressBar.this.f12804aa == null) {
                            return;
                        }
                        EvProgressBar.this.f12804aa.mo28461b(EvProgressBar.this.getProgress(), EvProgressBar.this.f12803a);
                        return;
                    default:
                        return;
                }
            }
        };
        this.f12842s = m28520a(1.5f);
        this.f12843t = m28520a(1.0f);
        this.f12841r = m28511b(10.0f);
        this.f12840q = m28520a(3.0f);
        this.f12816ar = m28520a(0.75f);
        this.f12845v = m28520a(6.0f);
        this.f12844u = m28520a(0.75f);
        Resources resources = context.getResources();
        this.f12828e = resources.getColor(C1704R.color.progress_reached_color);
        this.f12829f = resources.getColor(C1704R.color.progress_unreached_color);
        this.f12830g = resources.getColor(C1704R.color.progress_text_color);
        this.f12831h = resources.getDimensionPixelSize(C1704R.dimen.progress_text_tile_size);
        this.f12832i = resources.getDimensionPixelSize(C1704R.dimen.progress_reached_bar_height);
        this.f12833j = resources.getDimensionPixelSize(C1704R.dimen.progress_unreached_bar_height);
        this.f12800U = this.f12840q;
        setProgress(0);
        setMax(this.f12803a);
        int color = resources.getColor(C1704R.color.progress_reached_color);
        this.f12809ak = color;
        this.f12810al = color;
        this.f12815aq = resources.getDimensionPixelSize(C1704R.dimen.progress_circle_diameter);
        if (this.f12811am == null) {
            this.f12811am = new C3292d(getContext(), getHeight() / 2, this.f12809ak, this.f12810al, this.f12808aj, this.f12815aq);
            this.f12812an = (int) this.f12811am.m28434e();
            this.f12811am.m28443a(this.f12812an);
            this.f12811am.m28438b(this.f12812an);
        }
        m28512b();
    }

    /* renamed from: a */
    private int m28517a(int i, boolean z) {
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
    private void m28519a(float f, float f2) {
        if (this.f12811am.m28431h()) {
            this.f12811am.m28429j();
            invalidate();
        }
    }

    /* renamed from: a */
    private void m28514a(C3292d c3292d) {
        c3292d.m28430i();
        invalidate();
    }

    /* renamed from: a */
    private void m28513a(C3292d c3292d, float f) {
        int width = ((((int) f) - this.f12812an) * this.f12803a) / (getWidth() - (this.f12812an * 2));
        if (width > this.f12803a) {
            width = this.f12803a;
        }
        if (width < 0) {
            width = 0;
        }
        this.f12827d = width;
        Log.i("zdy", "" + width);
        m28514a(this.f12811am);
        invalidate();
    }

    /* renamed from: b */
    private void m28512b() {
        this.f12793N = new Paint(1);
        this.f12793N.setColor(this.f12828e);
        this.f12794O = new Paint(1);
        this.f12794O.setColor(this.f12829f);
        this.f12795P = new Paint(1);
        this.f12795P.setColor(this.f12830g);
        this.f12795P.setTextSize(this.f12831h);
        this.f12796Q = new Paint(1);
        this.f12796Q.setColor(this.f12828e);
        this.f12796Q.setStrokeWidth(this.f12816ar);
        this.f12797R = new Paint(1);
        this.f12797R.setColor(this.f12829f);
        this.f12797R.setStrokeWidth(this.f12816ar);
        this.f12814ap = new Paint(1);
        this.f12814ap.setColor(this.f12829f);
        this.f12814ap.setStrokeWidth(this.f12844u);
        this.f12817as = new Paint(1);
        this.f12817as.setColor(this.f12829f);
        this.f12817as.setStrokeWidth(this.f12816ar);
        this.f12818at = new Paint(1);
        this.f12818at.setColor(this.f12829f);
        this.f12818at.setStrokeWidth(1.0f);
        this.f12819au = new Paint(1);
        this.f12819au.setColor(this.f12828e);
        this.f12819au.setStrokeWidth(1.0f);
    }

    /* renamed from: b */
    private void m28510b(float f, float f2) {
        int width = ((((int) f) - this.f12812an) * this.f12803a) / (getWidth() - (this.f12812an * 2));
        if (width > this.f12803a) {
            width = this.f12803a;
        }
        if (width < 0) {
            width = 0;
        }
        if (this.f12811am.m28431h() || !this.f12811am.m28442a(f, f2)) {
            return;
        }
        this.f12827d = width;
        m28514a(this.f12811am);
    }

    /* renamed from: c */
    private void m28507c() {
        this.f12813ao = (getWidth() - (this.f12812an * 2)) / this.f12825b;
        if (getProgress() - this.f12826c >= 0) {
            float f = this.f12813ao * this.f12826c;
            this.f12799T.left = f + this.f12812an;
            this.f12799T.right = (getProgress() * this.f12813ao) + this.f12812an;
        } else {
            float f2 = this.f12813ao * this.f12826c;
            this.f12799T.left = (getProgress() * this.f12813ao) + this.f12812an;
            this.f12799T.right = f2 + this.f12812an;
        }
        this.f12799T.top = (getHeight() / 2.0f) - (this.f12832i / 2.0f);
        this.f12799T.bottom = (getHeight() / 2.0f) + (this.f12832i / 2.0f);
        this.f12798S.left = this.f12812an;
        this.f12798S.right = getWidth() - this.f12812an;
        this.f12798S.top = (getHeight() / 2.0f) + ((-this.f12833j) / 2.0f);
        this.f12798S.bottom = (getHeight() / 2.0f) + (this.f12833j / 2.0f);
    }

    /* renamed from: c */
    private void m28506c(float f) {
        if (this.f12811am.m28431h()) {
            m28513a(this.f12811am, f);
        }
    }

    /* renamed from: a */
    public float m28520a(float f) {
        return (getResources().getDisplayMetrics().density * f) + 0.5f;
    }

    /* renamed from: a */
    public void m28521a() {
        this.f12824az.removeMessages(0);
        if (this.f12822ax != null) {
            this.f12822ax.cancel();
            this.f12822ax = null;
        }
        if (this.f12822ax == null) {
            this.f12822ax = new Timer();
        }
        this.f12822ax.schedule(new TimerTask() { // from class: com.fimi.soul.view.marknumberprogress.EvProgressBar.2
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                EvProgressBar.this.f12824az.sendEmptyMessage(0);
            }
        }, 200L);
    }

    /* renamed from: a */
    public void m28518a(int i) {
        if (i > 0) {
            setProgress(getProgress() + i);
        }
        if (this.f12804aa != null) {
            this.f12804aa.mo28462a(getProgress(), getMax());
        }
    }

    /* renamed from: a */
    public void m28516a(Canvas canvas) {
        if (getProgress() - this.f12826c >= 0) {
            this.f12811am.m28443a(this.f12799T.right);
        } else {
            this.f12811am.m28443a(this.f12799T.left);
        }
        this.f12811am.m28441a(getHeight() / 2);
        this.f12811am.m28436c(getWidth() - this.f12812an);
        this.f12811am.m28440a(canvas);
    }

    /* renamed from: b */
    public float m28511b(float f) {
        return getResources().getDisplayMetrics().scaledDensity * f;
    }

    /* renamed from: b */
    public void m28509b(Canvas canvas) {
        this.f12820av = this.f12818at;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.f12803a + 1) {
                float f = this.f12812an + (this.f12813ao * i2);
                float f2 = (this.f12799T.bottom - this.f12799T.top) / 2.0f;
                if (i2 == this.f12826c) {
                    this.f12820av = this.f12796Q;
                } else if (i2 > this.f12826c) {
                    if (getProgress() - i2 >= 0) {
                        if (i2 % 3 == 0) {
                            this.f12820av = this.f12796Q;
                        } else {
                            this.f12820av = this.f12819au;
                        }
                    } else if (i2 % 3 == 0) {
                        this.f12820av = this.f12817as;
                    } else {
                        this.f12820av = this.f12818at;
                    }
                } else if (i2 - getProgress() >= 0) {
                    if (i2 % 3 == 0) {
                        this.f12820av = this.f12796Q;
                    } else {
                        this.f12820av = this.f12819au;
                    }
                } else if (i2 % 3 == 0) {
                    this.f12820av = this.f12817as;
                } else {
                    this.f12820av = this.f12818at;
                }
                canvas.drawLine(f, (getHeight() / 2) - this.f12845v, f, (getHeight() / 2) + f2, this.f12820av);
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    public int getMax() {
        return this.f12803a;
    }

    public String getPrefix() {
        return this.f12835l;
    }

    public int getProgress() {
        return this.f12827d;
    }

    public float getProgressTextSize() {
        return this.f12831h;
    }

    public int getReachedBarColor() {
        return this.f12828e;
    }

    public float getReachedBarHeight() {
        return this.f12832i;
    }

    public String getSuffix() {
        return this.f12834k;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max((int) this.f12831h, Math.max((int) this.f12832i, (int) this.f12833j));
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return (int) this.f12831h;
    }

    public int getTextColor() {
        return this.f12830g;
    }

    public int getUnreachedBarColor() {
        return this.f12829f;
    }

    public float getUnreachedBarHeight() {
        return this.f12833j;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        m28507c();
        if (this.f12801V) {
            canvas.drawRect(this.f12798S, this.f12794O);
        }
        if (this.f12802W) {
            canvas.drawRect(this.f12799T, this.f12793N);
        }
        m28509b(canvas);
        m28516a(canvas);
        if (this.f12804aa == null || this.f12821aw == this.f12827d) {
            return;
        }
        this.f12821aw = this.f12827d;
        this.f12804aa.mo28462a(getProgress(), this.f12803a);
        this.f12824az.removeMessages(0);
        m28521a();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(m28517a(i, true), m28517a(i2, false));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        this.f12830g = bundle.getInt(f12786x);
        this.f12831h = bundle.getFloat(f12787y);
        this.f12832i = bundle.getFloat(f12788z);
        this.f12833j = bundle.getFloat(f12772B);
        this.f12828e = bundle.getInt(f12771A);
        this.f12829f = bundle.getInt(f12773C);
        m28512b();
        setMax(bundle.getInt(f12774D));
        setProgress(bundle.getInt("progress"));
        setPrefix(bundle.getString(f12777G));
        setSuffix(bundle.getString(f12776F));
        super.onRestoreInstanceState(bundle.getParcelable(f12785w));
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(f12785w, super.onSaveInstanceState());
        bundle.putInt(f12786x, getTextColor());
        bundle.putFloat(f12787y, getProgressTextSize());
        bundle.putFloat(f12788z, getReachedBarHeight());
        bundle.putFloat(f12772B, getUnreachedBarHeight());
        bundle.putInt(f12771A, getReachedBarColor());
        bundle.putInt(f12773C, getUnreachedBarColor());
        bundle.putInt(f12774D, getMax());
        bundle.putInt("progress", getProgress());
        bundle.putString(f12776F, getSuffix());
        bundle.putString(f12777G, getPrefix());
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
                m28510b(motionEvent.getX(), motionEvent.getY());
                if (this.f12804aa != null) {
                    this.f12804aa.mo28463a(0);
                }
                return true;
            case 1:
                if (this.f12804aa != null) {
                    this.f12804aa.mo28463a(1);
                }
                if (this.f12804aa != null && this.f12821aw != this.f12827d) {
                    this.f12821aw = this.f12827d;
                    this.f12804aa.mo28462a(getProgress(), getMax());
                    break;
                }
                break;
            case 2:
                m28506c(motionEvent.getX());
                getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            case 3:
                break;
            default:
                return false;
        }
        getParent().requestDisallowInterceptTouchEvent(false);
        m28519a(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    public void setMax(int i) {
        if (i > 0) {
            this.f12803a = i;
            invalidate();
        }
    }

    public void setOnProgressBarListener(AbstractC3290b abstractC3290b) {
        this.f12804aa = abstractC3290b;
    }

    public void setPrefix(String str) {
        if (str == null) {
            this.f12835l = "";
        } else {
            this.f12835l = str;
        }
    }

    public void setProgress(int i) {
        if (i > getMax() || i < 0) {
            return;
        }
        this.f12827d = i;
        this.f12821aw = i;
        invalidate();
    }

    public void setProgressTextColor(int i) {
        this.f12830g = i;
        this.f12795P.setColor(this.f12830g);
        invalidate();
    }

    public void setProgressTextSize(float f) {
        this.f12831h = f;
        this.f12795P.setTextSize(this.f12831h);
        invalidate();
    }

    public void setProgressTextVisibility(EnumC3283a enumC3283a) {
        invalidate();
    }

    public void setReachedBarColor(int i) {
        this.f12828e = i;
        this.f12793N.setColor(this.f12828e);
        invalidate();
    }

    public void setReachedBarHeight(float f) {
        this.f12832i = f;
    }

    public void setSuffix(String str) {
        if (str == null) {
            this.f12834k = "";
        } else {
            this.f12834k = str;
        }
    }

    public void setTitle(String str) {
        this.f12836m = str;
        invalidate();
    }

    public void setUnreachedBarColor(int i) {
        this.f12829f = i;
        this.f12794O.setColor(this.f12829f);
        invalidate();
    }

    public void setUnreachedBarHeight(float f) {
        this.f12833j = f;
    }
}
