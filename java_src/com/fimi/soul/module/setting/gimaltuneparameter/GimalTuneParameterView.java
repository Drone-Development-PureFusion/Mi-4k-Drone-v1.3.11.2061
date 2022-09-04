package com.fimi.soul.module.setting.gimaltuneparameter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.utils.C3103au;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;
/* loaded from: classes.dex */
public class GimalTuneParameterView extends View {

    /* renamed from: A */
    private AbstractC2928a f10483A;

    /* renamed from: B */
    private boolean f10484B;

    /* renamed from: C */
    private EnumC2929b f10485C;

    /* renamed from: D */
    private boolean f10486D;

    /* renamed from: E */
    private int f10487E;

    /* renamed from: F */
    private int f10488F;

    /* renamed from: G */
    private float f10489G;

    /* renamed from: H */
    private float f10490H;

    /* renamed from: a */
    int f10491a;

    /* renamed from: b */
    int f10492b;

    /* renamed from: c */
    int f10493c;

    /* renamed from: d */
    int f10494d;

    /* renamed from: e */
    int f10495e;

    /* renamed from: f */
    int f10496f;

    /* renamed from: g */
    float f10497g;

    /* renamed from: h */
    float f10498h;

    /* renamed from: i */
    float f10499i;

    /* renamed from: j */
    boolean f10500j;

    /* renamed from: k */
    private Paint f10501k;

    /* renamed from: l */
    private Paint f10502l;

    /* renamed from: m */
    private Paint f10503m;

    /* renamed from: n */
    private Paint f10504n;

    /* renamed from: o */
    private Paint f10505o;

    /* renamed from: p */
    private String f10506p;

    /* renamed from: q */
    private Bitmap f10507q;

    /* renamed from: r */
    private Bitmap f10508r;

    /* renamed from: s */
    private float f10509s;

    /* renamed from: t */
    private boolean f10510t;

    /* renamed from: u */
    private int f10511u;

    /* renamed from: v */
    private boolean f10512v;

    /* renamed from: w */
    private int f10513w;

    /* renamed from: x */
    private int f10514x;

    /* renamed from: y */
    private float f10515y;

    /* renamed from: z */
    private float f10516z;

    /* renamed from: com.fimi.soul.module.setting.gimaltuneparameter.GimalTuneParameterView$a */
    /* loaded from: classes.dex */
    public interface AbstractC2928a {
        /* renamed from: a */
        void mo29899a();

        /* renamed from: a */
        void mo29898a(int i, boolean z);
    }

    /* renamed from: com.fimi.soul.module.setting.gimaltuneparameter.GimalTuneParameterView$b */
    /* loaded from: classes.dex */
    public enum EnumC2929b {
        NOMAL,
        ALL_NO_OPERABLE,
        AUTO_TUNE
    }

    public GimalTuneParameterView(Context context) {
        super(context);
        this.f10501k = new Paint(1);
        this.f10502l = new Paint(1);
        this.f10503m = new Paint(1);
        this.f10504n = new Paint(1);
        this.f10505o = new Paint(1);
        this.f10510t = false;
        this.f10484B = true;
        this.f10485C = EnumC2929b.NOMAL;
        this.f10486D = false;
        this.f10487E = 80;
        this.f10488F = 120;
        this.f10500j = true;
    }

    public GimalTuneParameterView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GimalTuneParameterView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10501k = new Paint(1);
        this.f10502l = new Paint(1);
        this.f10503m = new Paint(1);
        this.f10504n = new Paint(1);
        this.f10505o = new Paint(1);
        this.f10510t = false;
        this.f10484B = true;
        this.f10485C = EnumC2929b.NOMAL;
        this.f10486D = false;
        this.f10487E = 80;
        this.f10488F = 120;
        this.f10500j = true;
        m29909a();
    }

    /* renamed from: a */
    private void m29909a() {
        this.f10507q = BitmapFactory.decodeResource(getResources(), C1704R.C1705drawable.button_setup_parameter_adjust_automatic);
        this.f10503m.setTextAlign(Paint.Align.CENTER);
        this.f10503m.setColor(getResources().getColor(C1704R.color.gimal_tune_para_tune_text));
        this.f10503m.setTypeface(C3103au.m29235a(getResources().getAssets()));
        this.f10503m.setFakeBoldText(true);
        this.f10503m.setTextSize(getResources().getDimension(C1704R.dimen.gimal_tune_para_text_size));
        this.f10501k.setColor(getResources().getColor(C1704R.color.gimal_tune_para_outer_circle));
        this.f10501k.setStyle(Paint.Style.STROKE);
        this.f10515y = getResources().getDimension(C1704R.dimen.gimal_tune_para_arc);
        this.f10501k.setStrokeWidth(getResources().getDimension(C1704R.dimen.gimal_tune_para_arc));
        this.f10502l.setColor(getResources().getColor(C1704R.color.gimal_tune_para_text));
        this.f10502l.setStyle(Paint.Style.STROKE);
        this.f10502l.setStrokeWidth(getResources().getDimension(C1704R.dimen.gimal_tune_para_arc));
        this.f10504n.setColor(getResources().getColor(C1704R.color.gimal_tune_para_outer_circle));
        this.f10504n.setStyle(Paint.Style.STROKE);
        this.f10504n.setTextSize(getResources().getDimension(C1704R.dimen.gimal_tune_para_scale_text_size));
        this.f10504n.setTypeface(C3103au.m29235a(getResources().getAssets()));
        this.f10505o.setTextAlign(Paint.Align.CENTER);
        this.f10505o.setColor(getResources().getColor(C1704R.color.gimal_tune_para_tune_text));
        this.f10505o.setTypeface(C3103au.m29235a(getResources().getAssets()));
        this.f10505o.setTextSize(getResources().getDimension(C1704R.dimen.gimal_tune_para_text_progress_size));
        this.f10506p = getResources().getText(C1704R.C1707string.gimal_tune_para_auto_tune).toString();
        this.f10499i = getResources().getDimension(C1704R.dimen.gimal_tune_para_arc_radius);
        this.f10509s = getResources().getDimension(C1704R.dimen.gimal_tune_para_inner_circle_radius);
        this.f10516z = getResources().getDimension(C1704R.dimen.gimal_tune_para_arc_text_distance);
        this.f10508r = BitmapFactory.decodeResource(getResources(), C1704R.C1705drawable.icon_setup_parameter_adjust_slider);
        this.f10511u = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    /* renamed from: a */
    private void m29907a(float f, float f2, boolean z) {
        float sqrt = (float) Math.sqrt(Math.pow(f - (this.f10495e / 2), 2.0d) + Math.pow(f2 - (this.f10496f / 2), 2.0d));
        if (this.f10490H > (this.f10496f / 2) + this.f10493c + (this.f10508r.getHeight() / 2)) {
            return;
        }
        if (f2 > (this.f10496f / 2) + this.f10493c + (this.f10508r.getHeight() / 2)) {
            if (f < (this.f10495e / 2) + this.f10491a) {
                this.f10513w = getMinValue();
            } else {
                this.f10513w = getMaxValue();
            }
            this.f10497g = (float) (this.f10491a + (this.f10495e / 2) + (this.f10499i * Math.cos(3.141592653589793d - ((this.f10513w * 3.141592653589793d) / (this.f10488F - this.f10487E)))));
            this.f10498h = (float) (this.f10493c + (this.f10496f / 2) + (this.f10499i * Math.sin((-3.141592653589793d) + ((this.f10513w * 3.141592653589793d) / (this.f10488F - this.f10487E)))));
            invalidate();
        } else if (sqrt >= this.f10499i + 100.0f || sqrt <= this.f10499i - 100.0f || z) {
            invalidate();
        } else {
            this.f10498h = (float) ((this.f10496f / 2) + (this.f10499i * Math.sin(Math.atan2(f - (this.f10495e / 2), (this.f10496f / 2) - f2) - 1.5707963267948966d)));
            if (this.f10498h > this.f10493c + (this.f10496f / 2)) {
                this.f10498h = this.f10493c + (this.f10496f / 2);
                if (f < this.f10491a + (this.f10495e / 2)) {
                    this.f10497g = (this.f10491a + (this.f10495e / 2)) - this.f10499i;
                } else {
                    this.f10497g = this.f10491a + (this.f10495e / 2) + this.f10499i;
                }
            } else {
                this.f10497g = (float) ((this.f10495e / 2) + (this.f10499i * Math.cos(Math.atan2(f - (this.f10495e / 2), (this.f10496f / 2) - f2) - 1.5707963267948966d)));
            }
            invalidate();
        }
    }

    /* renamed from: a */
    private void m29906a(Canvas canvas) {
        canvas.drawText(String.valueOf(this.f10487E), ((((this.f10495e / 2) - this.f10499i) - this.f10515y) - this.f10516z) - this.f10504n.measureText(String.valueOf(this.f10487E)), this.f10493c + (this.f10496f / 2), this.f10504n);
        canvas.drawText(String.valueOf(this.f10488F), this.f10491a + (this.f10495e / 2) + this.f10499i + this.f10515y + this.f10516z, this.f10493c + (this.f10496f / 2), this.f10504n);
    }

    /* renamed from: b */
    private void m29905b() {
        this.f10491a = getPaddingLeft();
        this.f10492b = getPaddingRight();
        this.f10493c = getPaddingTop();
        this.f10494d = getPaddingBottom();
        this.f10495e = (getWidth() - this.f10491a) - this.f10492b;
        this.f10496f = (getWidth() - this.f10493c) - this.f10494d;
        if (this.f10500j) {
            this.f10500j = false;
            this.f10497g = (float) (this.f10491a + (this.f10495e / 2) + (this.f10499i * Math.cos(3.141592653589793d - ((this.f10513w * 3.141592653589793d) / (this.f10488F - this.f10487E)))));
            this.f10498h = (float) (this.f10493c + (this.f10496f / 2) + (this.f10499i * Math.sin((-3.141592653589793d) + ((this.f10513w * 3.141592653589793d) / (this.f10488F - this.f10487E)))));
        }
    }

    /* renamed from: b */
    private void m29904b(Canvas canvas) {
        canvas.drawBitmap(this.f10507q, (this.f10491a + (this.f10495e / 2)) - (this.f10507q.getWidth() / 2), (this.f10493c + (this.f10496f / 2)) - (this.f10507q.getHeight() / 2), (Paint) null);
    }

    /* renamed from: c */
    private void m29903c() {
        this.f10512v = false;
    }

    /* renamed from: c */
    private void m29902c(Canvas canvas) {
        Paint.FontMetrics fontMetrics = this.f10503m.getFontMetrics();
        float f = fontMetrics.top;
        float f2 = fontMetrics.bottom;
        if (this.f10485C != EnumC2929b.AUTO_TUNE) {
            this.f10503m.setColor(getResources().getColor(C1704R.color.gimal_tune_para_text));
            canvas.drawText(this.f10506p, this.f10491a + (this.f10495e / 2), ((this.f10493c + (this.f10496f / 2)) - (f / 2.0f)) - (f2 / 2.0f), this.f10503m);
            return;
        }
        this.f10503m.setColor(getResources().getColor(C1704R.color.gimal_tune_para_tune_text));
        canvas.drawText(this.f10506p, this.f10491a + (this.f10495e / 2), ((this.f10493c + (this.f10496f / 2)) - (f * 3.0f)) - (f2 * 3.0f), this.f10503m);
        canvas.drawText(String.valueOf(this.f10514x) + "%", this.f10491a + (this.f10495e / 2), this.f10493c + (this.f10496f / 2), this.f10505o);
    }

    /* renamed from: d */
    private void m29901d(Canvas canvas) {
        RectF rectF = new RectF();
        rectF.left = (this.f10491a + (this.f10495e / 2)) - this.f10499i;
        rectF.top = (this.f10493c + (this.f10496f / 2)) - this.f10499i;
        rectF.right = this.f10491a + (this.f10495e / 2) + this.f10499i;
        rectF.bottom = this.f10493c + (this.f10496f / 2) + this.f10499i;
        canvas.drawArc(rectF, 180.0f, 180.0f, false, this.f10501k);
        if (this.f10513w > getMaxValue()) {
            this.f10513w = getMinValue();
        }
        int minValue = ((this.f10513w - getMinValue()) * Opcodes.GETFIELD) / (getMaxValue() - getMinValue());
        if (this.f10485C == EnumC2929b.NOMAL) {
            canvas.drawArc(rectF, 180.0f, minValue, false, this.f10502l);
        }
    }

    /* renamed from: e */
    private void m29900e(Canvas canvas) {
        canvas.drawBitmap(this.f10508r, this.f10497g - (this.f10508r.getWidth() / 2), this.f10498h - (this.f10508r.getHeight() / 2), (Paint) null);
        this.f10513w = (int) Math.round(this.f10488F + (((this.f10488F - this.f10487E) * Math.atan2(this.f10498h - (this.f10496f / 2), this.f10497g - (this.f10495e / 2))) / 3.141592653589793d));
        if (this.f10513w == 160) {
            this.f10513w = 80;
        }
        if (this.f10483A != null) {
            this.f10483A.mo29898a(this.f10513w, this.f10486D);
            this.f10486D = false;
        }
    }

    /* renamed from: a */
    public boolean m29908a(float f, float f2, float f3) {
        return f >= (((float) (this.f10491a + (this.f10495e / 2))) - this.f10509s) - f3 && f2 >= (((float) (this.f10493c + (this.f10496f / 2))) - this.f10509s) - f3 && f < (((float) (this.f10491a + (this.f10495e / 2))) + this.f10509s) + f3 && f2 < (((float) (this.f10493c + (this.f10496f / 2))) + this.f10509s) + f3;
    }

    public int getMaxValue() {
        return this.f10488F;
    }

    public int getMinValue() {
        return this.f10487E;
    }

    public int getProgress() {
        return this.f10513w;
    }

    public EnumC2929b getState() {
        return this.f10485C;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m29905b();
        m29904b(canvas);
        m29902c(canvas);
        m29901d(canvas);
        m29900e(canvas);
        m29906a(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
            setMeasuredDimension(200, 200);
        } else if (mode == Integer.MIN_VALUE) {
            setMeasuredDimension(200, size2);
        } else if (mode2 != Integer.MIN_VALUE) {
        } else {
            setMeasuredDimension(size, 200);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f10484B) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            switch (motionEvent.getAction()) {
                case 0:
                    if (Math.pow((x - (this.f10495e / 2)) - this.f10491a, 2.0d) + Math.pow((y - (this.f10496f / 2)) - this.f10493c, 2.0d) >= Math.pow(this.f10509s - this.f10516z, 2.0d)) {
                        this.f10489G = x;
                        this.f10490H = y;
                        m29907a(x, y, false);
                        break;
                    } else {
                        this.f10510t = true;
                        this.f10512v = true;
                        setIsCenterBtnState(true);
                        break;
                    }
                case 1:
                    if (!this.f10510t) {
                        this.f10486D = true;
                        m29907a(x, y, true);
                        break;
                    } else {
                        if (this.f10512v && this.f10483A != null) {
                            this.f10483A.mo29899a();
                        }
                        this.f10510t = false;
                        setIsCenterBtnState(false);
                        break;
                    }
                    break;
                case 2:
                    if (!this.f10510t) {
                        m29907a(x, y, false);
                        break;
                    } else if (!m29908a(x, y, this.f10511u)) {
                        m29903c();
                        break;
                    }
                    break;
            }
        }
        return true;
    }

    public void setCenterBtnText(String str) {
        this.f10506p = str;
    }

    public void setGimalTuneParameterListerner(AbstractC2928a abstractC2928a) {
        this.f10483A = abstractC2928a;
    }

    public void setIsCenterBtnState(boolean z) {
        if (z) {
            this.f10507q = BitmapFactory.decodeResource(getResources(), C1704R.C1705drawable.button_setup_parameter_adjust_automatic_click);
        } else {
            this.f10507q = BitmapFactory.decodeResource(getResources(), C1704R.C1705drawable.button_setup_parameter_adjust_automatic);
        }
        invalidate();
    }

    public void setMaxValue(int i) {
        if (i != this.f10487E) {
            this.f10488F = i;
            invalidate();
        }
    }

    public void setMinValue(int i) {
        if (i != this.f10487E) {
            this.f10487E = i;
            invalidate();
        }
    }

    public void setProgress(int i) {
        this.f10513w = i;
        if (this.f10495e == 0 || this.f10496f == 0) {
            return;
        }
        this.f10497g = (float) (this.f10491a + (this.f10495e / 2) + (this.f10499i * Math.cos(3.141592653589793d - ((this.f10513w * 3.141592653589793d) / (this.f10488F - this.f10487E)))));
        this.f10498h = (float) (this.f10493c + (this.f10496f / 2) + (this.f10499i * Math.sin((-3.141592653589793d) + ((this.f10513w * 3.141592653589793d) / (this.f10488F - this.f10487E)))));
        invalidate();
    }

    public void setState(EnumC2929b enumC2929b) {
        this.f10485C = enumC2929b;
        if (enumC2929b == EnumC2929b.NOMAL) {
            this.f10507q = BitmapFactory.decodeResource(getResources(), C1704R.C1705drawable.button_setup_parameter_adjust_automatic);
            this.f10501k.setColor(getResources().getColor(C1704R.color.gimal_tune_para_outer_circle));
            this.f10502l.setColor(getResources().getColor(C1704R.color.gimal_tune_para_text));
            this.f10504n.setColor(getResources().getColor(C1704R.color.gimal_tune_para_outer_circle));
            this.f10484B = true;
        } else if (enumC2929b == EnumC2929b.ALL_NO_OPERABLE) {
            this.f10507q = BitmapFactory.decodeResource(getResources(), C1704R.C1705drawable.button_setup_parameter_adjust_automatic_no);
            this.f10501k.setColor(getResources().getColor(C1704R.color.gimal_tune_para_outer_circle_gray));
            this.f10502l.setColor(getResources().getColor(C1704R.color.gimal_tune_para_outer_circle_gray));
            this.f10504n.setColor(getResources().getColor(C1704R.color.gimal_tune_para_outer_circle_gray));
            this.f10484B = false;
        } else if (enumC2929b == EnumC2929b.AUTO_TUNE) {
            this.f10507q = BitmapFactory.decodeResource(getResources(), C1704R.C1705drawable.button_setup_parameter_adjust_automatic_no);
            this.f10501k.setColor(getResources().getColor(C1704R.color.gimal_tune_para_outer_circle_gray));
            this.f10502l.setColor(getResources().getColor(C1704R.color.gimal_tune_para_outer_circle_gray));
            this.f10504n.setColor(getResources().getColor(C1704R.color.gimal_tune_para_outer_circle_gray));
            this.f10484B = false;
        }
        invalidate();
    }

    public void setTuneProgress(int i) {
        this.f10514x = i;
        invalidate();
    }
}
