package com.fimi.x1bh.module.main;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.fimi.overseas.soul.C1704R;
/* loaded from: classes.dex */
public class CloudBatteryVoltageView extends View {

    /* renamed from: m */
    private static final int f13394m = Color.parseColor("#19ffffff");

    /* renamed from: n */
    private static final int f13395n = Color.parseColor("#00000000");

    /* renamed from: o */
    private static final int f13396o = Color.parseColor("#30b0e5");

    /* renamed from: a */
    private Context f13397a;

    /* renamed from: b */
    private Paint f13398b;

    /* renamed from: c */
    private RectF f13399c;

    /* renamed from: d */
    private Paint f13400d;

    /* renamed from: e */
    private RectF f13401e;

    /* renamed from: f */
    private Bitmap f13402f;

    /* renamed from: g */
    private Bitmap f13403g;

    /* renamed from: h */
    private Bitmap f13404h;

    /* renamed from: i */
    private Bitmap f13405i;

    /* renamed from: j */
    private int f13406j = 0;

    /* renamed from: k */
    private boolean f13407k = false;

    /* renamed from: l */
    private EnumC3358a f13408l = EnumC3358a.NOMAL;

    /* renamed from: com.fimi.x1bh.module.main.CloudBatteryVoltageView$a */
    /* loaded from: classes.dex */
    public enum EnumC3358a {
        NOMAL,
        LOW,
        SERIOUS_LOW
    }

    public CloudBatteryVoltageView(Context context) {
        super(context);
        m28179a(context);
    }

    public CloudBatteryVoltageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m28179a(context);
    }

    public CloudBatteryVoltageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m28179a(context);
    }

    /* renamed from: a */
    private Bitmap m28180a() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Bitmap createBitmap = Bitmap.createBitmap(this.f13403g.getWidth(), this.f13403g.getHeight(), Bitmap.Config.ARGB_8888);
        int width = (int) (8.0f + ((this.f13403g.getWidth() - 10) - ((this.f13406j / 100.0f) * (this.f13403g.getWidth() - 10))));
        Canvas canvas = new Canvas(createBitmap);
        if (this.f13408l == EnumC3358a.NOMAL) {
            canvas.drawBitmap(this.f13403g, 0.0f, 0.0f, paint);
        } else if (this.f13408l == EnumC3358a.LOW) {
            canvas.drawBitmap(this.f13404h, 0.0f, 0.0f, paint);
        } else {
            canvas.drawBitmap(this.f13405i, 0.0f, 0.0f, paint);
        }
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        paint.setColor(f13395n);
        canvas.drawRect(getWidth() - width, 0.0f, getWidth(), getHeight(), paint);
        return createBitmap;
    }

    /* renamed from: a */
    public void m28179a(Context context) {
        this.f13397a = context;
        this.f13398b = new Paint();
        this.f13398b.setAntiAlias(true);
        this.f13399c = new RectF();
        this.f13400d = new Paint();
        this.f13402f = BitmapFactory.decodeResource(getResources(), C1704R.C1705drawable.cloud_battery_bg);
        this.f13403g = BitmapFactory.decodeResource(getResources(), C1704R.C1705drawable.cloud_battery_normal);
        this.f13404h = BitmapFactory.decodeResource(getResources(), C1704R.C1705drawable.cloud_battery_low);
        this.f13405i = BitmapFactory.decodeResource(getResources(), C1704R.C1705drawable.cloud_battery_serious_low);
    }

    /* renamed from: a */
    public void m28178a(EnumC3358a enumC3358a) {
        this.f13408l = enumC3358a;
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(this.f13402f, 0.0f, 0.0f, this.f13398b);
        canvas.drawBitmap(m28180a(), 0.0f, 0.0f, this.f13398b);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(this.f13403g.getWidth(), this.f13403g.getHeight());
    }

    public void setPercent(int i) {
        this.f13406j = i;
        invalidate();
    }
}
