package com.fimi.soul.view;

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
public class BatteryVoltageView extends View {

    /* renamed from: m */
    private static final int f11942m = Color.parseColor("#19ffffff");

    /* renamed from: n */
    private static final int f11943n = Color.parseColor("#222225");

    /* renamed from: o */
    private static final int f11944o = Color.parseColor("#30b0e5");

    /* renamed from: a */
    private Context f11945a;

    /* renamed from: b */
    private Paint f11946b;

    /* renamed from: c */
    private RectF f11947c;

    /* renamed from: d */
    private Paint f11948d;

    /* renamed from: e */
    private RectF f11949e;

    /* renamed from: f */
    private Bitmap f11950f;

    /* renamed from: g */
    private Bitmap f11951g;

    /* renamed from: h */
    private Bitmap f11952h;

    /* renamed from: i */
    private Bitmap f11953i;

    /* renamed from: j */
    private int f11954j = 0;

    /* renamed from: k */
    private boolean f11955k = false;

    /* renamed from: l */
    private EnumC3157a f11956l = EnumC3157a.NOMAL;

    /* renamed from: com.fimi.soul.view.BatteryVoltageView$a */
    /* loaded from: classes.dex */
    public enum EnumC3157a {
        NOMAL,
        EXCEPT,
        DAMAGE
    }

    public BatteryVoltageView(Context context) {
        super(context);
        m28967a(context);
    }

    public BatteryVoltageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m28967a(context);
    }

    public BatteryVoltageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m28967a(context);
    }

    /* renamed from: a */
    private Bitmap m28968a() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Bitmap createBitmap = Bitmap.createBitmap(this.f11951g.getWidth(), this.f11951g.getHeight(), Bitmap.Config.ARGB_8888);
        int height = (int) (8.0f + ((this.f11951g.getHeight() - 10) - ((this.f11954j / 100.0f) * (this.f11951g.getHeight() - 10))));
        Canvas canvas = new Canvas(createBitmap);
        if (this.f11956l == EnumC3157a.NOMAL) {
            canvas.drawBitmap(this.f11951g, 0.0f, 0.0f, paint);
        } else if (this.f11956l == EnumC3157a.EXCEPT) {
            canvas.drawBitmap(this.f11952h, 0.0f, 0.0f, paint);
        } else {
            canvas.drawBitmap(this.f11953i, 0.0f, 0.0f, paint);
        }
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        paint.setColor(f11943n);
        canvas.drawRect(0.0f, 0.0f, getWidth(), height, paint);
        return createBitmap;
    }

    /* renamed from: a */
    public void m28967a(Context context) {
        this.f11945a = context;
        this.f11946b = new Paint();
        this.f11946b.setAntiAlias(true);
        this.f11947c = new RectF();
        this.f11948d = new Paint();
        this.f11950f = BitmapFactory.decodeResource(getResources(), C1704R.C1705drawable.img_battery_frame);
        this.f11951g = BitmapFactory.decodeResource(getResources(), C1704R.C1705drawable.img_battery_blue);
        this.f11952h = BitmapFactory.decodeResource(getResources(), C1704R.C1705drawable.img_battery_orange);
        this.f11953i = BitmapFactory.decodeResource(getResources(), C1704R.C1705drawable.img_battery_red);
    }

    /* renamed from: a */
    public void m28966a(EnumC3157a enumC3157a) {
        this.f11956l = enumC3157a;
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(this.f11950f, 0.0f, 0.0f, this.f11946b);
        canvas.drawBitmap(m28968a(), 0.0f, 0.0f, this.f11946b);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(this.f11951g.getWidth(), this.f11951g.getHeight());
    }

    public void setPercent(int i) {
        this.f11954j = i;
        invalidate();
    }
}
