package com.fimi.kernel.view.button;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.facebook.rebound.SimpleSpringListener;
import com.facebook.rebound.Spring;
import com.facebook.rebound.SpringConfig;
import com.facebook.rebound.SpringSystem;
import com.facebook.rebound.SpringUtil;
import com.fimi.kernel.C1572R;
import com.fimi.kernel.utils.C1675p;
import com.google.firebase.p253b.C9755a;
/* loaded from: classes.dex */
public class SwitchButton extends View {

    /* renamed from: b */
    private SpringSystem f4202b;

    /* renamed from: c */
    private Spring f4203c;

    /* renamed from: d */
    private float f4204d;

    /* renamed from: j */
    private Paint f4210j;

    /* renamed from: m */
    private float f4213m;

    /* renamed from: n */
    private float f4214n;

    /* renamed from: o */
    private float f4215o;

    /* renamed from: p */
    private float f4216p;

    /* renamed from: q */
    private float f4217q;

    /* renamed from: r */
    private int f4218r;

    /* renamed from: s */
    private float f4219s;

    /* renamed from: v */
    private AbstractC1695a f4222v;

    /* renamed from: e */
    private int f4205e = 0;

    /* renamed from: f */
    private int f4206f = Color.parseColor("#ffffff");

    /* renamed from: g */
    private int f4207g = Color.parseColor("#bcbcbd");

    /* renamed from: h */
    private int f4208h = Color.parseColor("#bcbcbd");

    /* renamed from: i */
    private int f4209i = Color.parseColor("#ff5400");

    /* renamed from: k */
    private boolean f4211k = false;

    /* renamed from: l */
    private int f4212l = 1;

    /* renamed from: t */
    private RectF f4220t = new RectF();

    /* renamed from: u */
    private boolean f4221u = true;

    /* renamed from: a */
    SimpleSpringListener f4201a = new SimpleSpringListener() { // from class: com.fimi.kernel.view.button.SwitchButton.2
        @Override // com.facebook.rebound.SimpleSpringListener, com.facebook.rebound.SpringListener
        public void onSpringUpdate(Spring spring) {
            SwitchButton.this.m34425a(spring.getCurrentValue());
        }
    };

    /* renamed from: com.fimi.kernel.view.button.SwitchButton$a */
    /* loaded from: classes.dex */
    public interface AbstractC1695a {
        /* renamed from: a */
        void mo28184a(View view, boolean z);
    }

    private SwitchButton(Context context) {
        super(context);
    }

    public SwitchButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setup(attributeSet);
    }

    public SwitchButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setup(attributeSet);
    }

    /* renamed from: a */
    private int m34424a(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m34425a(double d) {
        this.f4219s = (float) SpringUtil.mapValueFromRangeToRange(d, C9755a.f30449c, 1.0d, this.f4216p, this.f4217q);
        float mapValueFromRangeToRange = (float) SpringUtil.mapValueFromRangeToRange(1.0d - d, C9755a.f30449c, 1.0d, 10.0d, this.f4218r);
        int blue = Color.blue(this.f4209i);
        int red = Color.red(this.f4209i);
        int green = Color.green(this.f4209i);
        int blue2 = Color.blue(this.f4208h);
        int red2 = Color.red(this.f4208h);
        int green2 = Color.green(this.f4208h);
        int mapValueFromRangeToRange2 = (int) SpringUtil.mapValueFromRangeToRange(1.0d - d, C9755a.f30449c, 1.0d, blue, blue2);
        int mapValueFromRangeToRange3 = (int) SpringUtil.mapValueFromRangeToRange(1.0d - d, C9755a.f30449c, 1.0d, red, red2);
        this.f4207g = Color.rgb(m34424a(mapValueFromRangeToRange3, 0, 255), m34424a((int) SpringUtil.mapValueFromRangeToRange(1.0d - d, C9755a.f30449c, 1.0d, green, green2), 0, 255), m34424a(mapValueFromRangeToRange2, 0, 255));
        postInvalidate();
    }

    /* renamed from: a */
    private void m34421a(boolean z) {
        double d = 1.0d;
        if (z) {
            Spring spring = this.f4203c;
            if (!this.f4211k) {
                d = 0.0d;
            }
            spring.setEndValue(d);
            return;
        }
        this.f4203c.setCurrentValue(this.f4211k ? 1.0d : 0.0d);
        if (!this.f4211k) {
            d = 0.0d;
        }
        m34425a(d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m34419b() {
        this.f4211k = !this.f4211k;
        m34421a(true);
        setSwitchState(this.f4211k);
        if (this.f4222v != null) {
            this.f4222v.mo28184a(this, this.f4211k);
        }
    }

    /* renamed from: a */
    public void m34420a(boolean z, boolean z2) {
        this.f4211k = z;
        m34421a(z2);
    }

    /* renamed from: a */
    public boolean m34426a() {
        return this.f4221u;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        this.f4210j.setStyle(Paint.Style.STROKE);
        this.f4210j.setAntiAlias(true);
        float m34634a = C1675p.m34634a(getContext(), 0.5f);
        this.f4220t.set(m34634a, m34634a, getWidth() - m34634a, getHeight() - m34634a);
        this.f4210j.setColor(603979775);
        this.f4210j.setStrokeWidth(C1675p.m34634a(getContext(), 0.7f));
        canvas.drawRoundRect(this.f4220t, this.f4204d, this.f4204d, this.f4210j);
        this.f4210j.setStyle(Paint.Style.FILL);
        this.f4210j.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        this.f4220t.set((this.f4219s - 1.0f) - this.f4204d, this.f4213m - this.f4204d, this.f4219s + 1.1f + this.f4204d, this.f4213m + this.f4204d);
        this.f4210j.setColor(0);
        canvas.drawRoundRect(this.f4220t, this.f4204d, this.f4204d, this.f4210j);
        float f = this.f4218r * 0.45f;
        this.f4220t.set(this.f4219s - f, this.f4213m - f, this.f4219s + f, this.f4213m + f);
        this.f4210j.setColor(this.f4207g);
        canvas.drawRoundRect(this.f4220t, f, f, this.f4210j);
    }

    public boolean getToggleOn() {
        return this.f4211k;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4203c.addListener(this.f4201a);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f4203c.removeListener(this.f4201a);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int width = getWidth();
        int height = getHeight();
        this.f4204d = Math.min(width, height) * 0.5f;
        this.f4213m = this.f4204d;
        this.f4214n = this.f4204d;
        this.f4215o = width - this.f4204d;
        this.f4216p = this.f4214n + this.f4212l;
        this.f4217q = this.f4215o - this.f4212l;
        this.f4218r = height - (this.f4212l * 4);
        this.f4219s = this.f4211k ? this.f4217q : this.f4216p;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        View.MeasureSpec.getMode(i2);
        View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i2);
        Resources system = Resources.getSystem();
        if (mode == 0 || mode == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec((int) TypedValue.applyDimension(1, 50.0f, system.getDisplayMetrics()), 1073741824);
        }
        if (size == 0 || size == Integer.MIN_VALUE) {
            i2 = View.MeasureSpec.makeMeasureSpec((int) TypedValue.applyDimension(1, 30.0f, system.getDisplayMetrics()), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public void setAnimate(boolean z) {
        this.f4221u = z;
    }

    public void setOnSwitchListener(AbstractC1695a abstractC1695a) {
        this.f4222v = abstractC1695a;
    }

    public void setSwitchState(boolean z) {
        m34420a(z, true);
    }

    public void setup(AttributeSet attributeSet) {
        this.f4210j = new Paint(1);
        this.f4210j.setStyle(Paint.Style.STROKE);
        this.f4210j.setStrokeCap(Paint.Cap.ROUND);
        this.f4202b = SpringSystem.create();
        this.f4203c = this.f4202b.createSpring();
        this.f4203c.setSpringConfig(SpringConfig.fromOrigamiTensionAndFriction(50.0d, 7.0d));
        setOnClickListener(new View.OnClickListener() { // from class: com.fimi.kernel.view.button.SwitchButton.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SwitchButton.this.m34419b();
            }
        });
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1572R.styleable.SwitchButton);
        this.f4205e = obtainStyledAttributes.getColor(C1572R.styleable.SwitchButton_onColor, this.f4205e);
        this.f4208h = obtainStyledAttributes.getColor(C1572R.styleable.SwitchButton_spotColor, this.f4208h);
        this.f4212l = obtainStyledAttributes.getDimensionPixelSize(C1572R.styleable.SwitchButton_borderWidth, (int) C1675p.m34634a(getContext(), this.f4212l));
        this.f4221u = obtainStyledAttributes.getBoolean(C1572R.styleable.SwitchButton_animate, this.f4221u);
        obtainStyledAttributes.recycle();
    }
}
