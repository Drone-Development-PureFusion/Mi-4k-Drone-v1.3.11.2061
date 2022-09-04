package com.fimi.soul.view;

import android.content.Context;
import android.content.res.Resources;
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
import com.fimi.kernel.utils.C1675p;
import com.google.firebase.p253b.C9755a;
/* loaded from: classes2.dex */
public class SwitchButtonStoke extends View {

    /* renamed from: b */
    private SpringSystem f12234b;

    /* renamed from: c */
    private Spring f12235c;

    /* renamed from: d */
    private float f12236d;

    /* renamed from: k */
    private Paint f12243k;

    /* renamed from: n */
    private float f12246n;

    /* renamed from: o */
    private float f12247o;

    /* renamed from: p */
    private float f12248p;

    /* renamed from: q */
    private float f12249q;

    /* renamed from: r */
    private float f12250r;

    /* renamed from: s */
    private int f12251s;

    /* renamed from: t */
    private float f12252t;

    /* renamed from: w */
    private AbstractC3176a f12255w;

    /* renamed from: e */
    private int f12237e = 0;

    /* renamed from: f */
    private int f12238f = Color.parseColor("#63000000");

    /* renamed from: g */
    private int f12239g = Color.parseColor("#51000000");

    /* renamed from: h */
    private int f12240h = Color.parseColor("#ededed");

    /* renamed from: i */
    private int f12241i = Color.parseColor("#ededed");

    /* renamed from: j */
    private int f12242j = Color.parseColor("#ff4f00");

    /* renamed from: l */
    private boolean f12244l = false;

    /* renamed from: m */
    private int f12245m = 1;

    /* renamed from: u */
    private RectF f12253u = new RectF();

    /* renamed from: v */
    private boolean f12254v = true;

    /* renamed from: a */
    SimpleSpringListener f12233a = new SimpleSpringListener() { // from class: com.fimi.soul.view.SwitchButtonStoke.2
        @Override // com.facebook.rebound.SimpleSpringListener, com.facebook.rebound.SpringListener
        public void onSpringUpdate(Spring spring) {
            SwitchButtonStoke.this.m28863a(spring.getCurrentValue());
        }
    };

    /* renamed from: com.fimi.soul.view.SwitchButtonStoke$a */
    /* loaded from: classes2.dex */
    public interface AbstractC3176a {
        /* renamed from: a */
        void mo28856a(View view, boolean z);
    }

    private SwitchButtonStoke(Context context) {
        super(context);
    }

    public SwitchButtonStoke(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setup(attributeSet);
    }

    public SwitchButtonStoke(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setup(attributeSet);
    }

    /* renamed from: a */
    private int m28862a(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m28863a(double d) {
        this.f12252t = (float) SpringUtil.mapValueFromRangeToRange(d, C9755a.f30449c, 1.0d, this.f12249q, this.f12250r);
        float mapValueFromRangeToRange = (float) SpringUtil.mapValueFromRangeToRange(1.0d - d, C9755a.f30449c, 1.0d, 10.0d, this.f12251s);
        int blue = Color.blue(this.f12242j);
        int red = Color.red(this.f12242j);
        int green = Color.green(this.f12242j);
        int blue2 = Color.blue(this.f12241i);
        int red2 = Color.red(this.f12241i);
        int green2 = Color.green(this.f12241i);
        int mapValueFromRangeToRange2 = (int) SpringUtil.mapValueFromRangeToRange(1.0d - d, C9755a.f30449c, 1.0d, blue, blue2);
        int mapValueFromRangeToRange3 = (int) SpringUtil.mapValueFromRangeToRange(1.0d - d, C9755a.f30449c, 1.0d, red, red2);
        this.f12240h = Color.rgb(m28862a(mapValueFromRangeToRange3, 0, 255), m28862a((int) SpringUtil.mapValueFromRangeToRange(1.0d - d, C9755a.f30449c, 1.0d, green, green2), 0, 255), m28862a(mapValueFromRangeToRange2, 0, 255));
        postInvalidate();
    }

    /* renamed from: a */
    private void m28859a(boolean z) {
        double d = 1.0d;
        if (z) {
            Spring spring = this.f12235c;
            if (!this.f12244l) {
                d = 0.0d;
            }
            spring.setEndValue(d);
            return;
        }
        this.f12235c.setCurrentValue(this.f12244l ? 1.0d : 0.0d);
        if (!this.f12244l) {
            d = 0.0d;
        }
        m28863a(d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m28857b() {
        this.f12244l = !this.f12244l;
        m28859a(true);
        setSwitchState(this.f12244l);
        if (this.f12255w != null) {
            this.f12255w.mo28856a(this, this.f12244l);
        }
    }

    /* renamed from: a */
    public void m28858a(boolean z, boolean z2) {
        this.f12244l = z;
        m28859a(z2);
    }

    /* renamed from: a */
    public boolean m28864a() {
        return this.f12254v;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        this.f12243k.setStyle(Paint.Style.STROKE);
        this.f12243k.setAntiAlias(true);
        float m34634a = C1675p.m34634a(getContext(), 0.5f);
        this.f12253u.set(m34634a, m34634a, getWidth() - m34634a, getHeight() - m34634a);
        this.f12243k.setColor(this.f12238f);
        this.f12243k.setStrokeWidth(C1675p.m34634a(getContext(), 0.7f));
        canvas.drawRoundRect(this.f12253u, this.f12236d, this.f12236d, this.f12243k);
        this.f12243k.setStyle(Paint.Style.FILL);
        this.f12243k.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        this.f12253u.set((this.f12252t - this.f12236d) + 4.0f, (this.f12246n - this.f12236d) + 4.0f, (this.f12252t - 4.0f) + this.f12236d, (this.f12246n + this.f12236d) - 4.0f);
        if (this.f12244l) {
            this.f12243k.setColor(this.f12242j);
        } else {
            this.f12243k.setColor(this.f12239g);
        }
        canvas.drawRoundRect(this.f12253u, this.f12236d, this.f12236d, this.f12243k);
        float f = this.f12251s * 0.45f;
        this.f12253u.set(this.f12252t - f, this.f12246n - f, this.f12252t + f, this.f12246n + f);
        this.f12243k.setColor(this.f12240h);
        canvas.drawRoundRect(this.f12253u, f, f, this.f12243k);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f12235c.addListener(this.f12233a);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f12235c.removeListener(this.f12233a);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int width = getWidth();
        int height = getHeight();
        this.f12236d = Math.min(width, height) * 0.5f;
        this.f12246n = this.f12236d;
        this.f12247o = this.f12236d;
        this.f12248p = width - this.f12236d;
        this.f12249q = this.f12247o + this.f12245m;
        this.f12250r = this.f12248p - this.f12245m;
        this.f12251s = height - (this.f12245m * 4);
        this.f12252t = this.f12244l ? this.f12250r : this.f12249q;
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
        this.f12254v = z;
    }

    public void setOnSwitchListener(AbstractC3176a abstractC3176a) {
        this.f12255w = abstractC3176a;
    }

    public void setSwitchState(boolean z) {
        m28858a(z, true);
    }

    public void setup(AttributeSet attributeSet) {
        this.f12243k = new Paint(1);
        this.f12243k.setStyle(Paint.Style.STROKE);
        this.f12243k.setStrokeCap(Paint.Cap.ROUND);
        this.f12234b = SpringSystem.create();
        this.f12235c = this.f12234b.createSpring();
        this.f12235c.setSpringConfig(SpringConfig.fromOrigamiTensionAndFriction(50.0d, 7.0d));
        setOnClickListener(new View.OnClickListener() { // from class: com.fimi.soul.view.SwitchButtonStoke.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SwitchButtonStoke.this.m28857b();
            }
        });
    }
}
