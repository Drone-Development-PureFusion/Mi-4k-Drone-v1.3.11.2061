package com.fimi.soul.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.utils.C3103au;
/* loaded from: classes.dex */
public class BatteryCapacityView extends View {

    /* renamed from: i */
    private static final int f11914i = -90;

    /* renamed from: j */
    private static final int f11915j = Color.parseColor("#19ffffff");

    /* renamed from: k */
    private static final int f11916k = Color.parseColor("#30b0e5");

    /* renamed from: l */
    private static final int f11917l = Color.parseColor("#fe5400");

    /* renamed from: m */
    private static final int f11918m = Color.parseColor("#f62f14");

    /* renamed from: n */
    private static final int f11919n = Color.parseColor("#FFFFFFFF");

    /* renamed from: o */
    private static final int f11920o = Color.parseColor("#7fFFFFFF");

    /* renamed from: a */
    float f11921a;

    /* renamed from: b */
    private Paint f11922b;

    /* renamed from: c */
    private Paint f11923c;

    /* renamed from: d */
    private int f11924d;

    /* renamed from: e */
    private int f11925e;

    /* renamed from: f */
    private Context f11926f;

    /* renamed from: g */
    private int f11927g = -1;

    /* renamed from: h */
    private Rect f11928h;

    public BatteryCapacityView(Context context) {
        super(context);
        m28970a(context);
    }

    public BatteryCapacityView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m28970a(context);
    }

    public BatteryCapacityView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m28970a(context);
    }

    /* renamed from: a */
    private void m28970a(Context context) {
        this.f11926f = context;
        this.f11921a = this.f11926f.getResources().getDimension(C1704R.dimen.battery_capacity);
        this.f11922b = new Paint();
        this.f11922b.setAntiAlias(true);
        this.f11922b.setColor(f11915j);
        this.f11922b.setStyle(Paint.Style.STROKE);
        this.f11922b.setStrokeWidth(this.f11921a);
        this.f11922b.setStrokeCap(Paint.Cap.ROUND);
        this.f11928h = new Rect();
        this.f11923c = new Paint();
        this.f11923c.setStrokeWidth(this.f11921a);
        this.f11923c.setAntiAlias(true);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f11922b.setColor(f11915j);
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, (getWidth() / 2) - this.f11921a, this.f11922b);
        if (this.f11927g == -1) {
            this.f11922b.setColor(f11916k);
            this.f11923c.setColor(f11919n);
        } else if (this.f11927g < 15) {
            this.f11922b.setColor(f11918m);
            this.f11923c.setColor(f11918m);
        } else if (this.f11927g < 30) {
            this.f11922b.setColor(f11917l);
            this.f11923c.setColor(f11917l);
        } else {
            this.f11922b.setColor(f11916k);
            this.f11923c.setColor(f11919n);
        }
        RectF rectF = new RectF();
        rectF.left = this.f11921a;
        rectF.top = this.f11921a;
        rectF.right = getWidth() - this.f11921a;
        rectF.bottom = getHeight() - this.f11921a;
        canvas.drawArc(rectF, -90.0f, this.f11927g == -1 ? 0.0f : (this.f11927g * 360) / 100, false, this.f11922b);
        String string = this.f11927g == -1 ? this.f11926f.getResources().getString(C1704R.C1707string.no_use) : String.valueOf(this.f11927g + "%");
        this.f11923c.setTextSize(this.f11926f.getResources().getDimension(C1704R.dimen.battery_capacity_font));
        this.f11923c.setTypeface(C3103au.m29219b(this.f11926f.getAssets()));
        this.f11923c.getTextBounds(string, 0, string.length(), this.f11928h);
        float height = this.f11928h.height();
        canvas.drawText(string, (getWidth() / 2) - (this.f11928h.width() / 2.0f), (getHeight() * 0.32f) + height, this.f11923c);
        String string2 = this.f11926f.getString(C1704R.C1707string.battery_remaining);
        this.f11923c.setTypeface(C3103au.m29235a(this.f11926f.getAssets()));
        this.f11923c.setColor(f11920o);
        this.f11923c.setTextSize(this.f11926f.getResources().getDimension(C1704R.dimen.battery_capacity_font_child));
        this.f11923c.getTextBounds(string2, 0, string2.length(), this.f11928h);
        canvas.drawText(string2, (getWidth() / 2) - (this.f11928h.width() / 2.0f), height + (getHeight() * 0.32f) + this.f11928h.height() + (getHeight() * 0.06f), this.f11923c);
    }

    public void setPercent(int i) {
        this.f11927g = i;
        invalidate();
    }
}
