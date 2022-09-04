package com.fimi.soul.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import com.fimi.overseas.soul.C1704R;
/* loaded from: classes2.dex */
public class LightView extends View {

    /* renamed from: b */
    private Paint f12109b;

    /* renamed from: c */
    private Paint f12110c;

    /* renamed from: f */
    private Context f12113f;

    /* renamed from: g */
    private Bitmap f12114g;

    /* renamed from: d */
    private int f12111d = 0;

    /* renamed from: e */
    private int f12112e = 0;

    /* renamed from: a */
    Typeface f12108a = null;

    public LightView(Context context) {
        super(context);
        this.f12113f = context;
        m28883a();
    }

    public LightView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12113f = context;
        m28883a();
    }

    /* renamed from: a */
    void m28883a() {
        this.f12109b = new Paint();
        this.f12109b.setColor(-1);
        this.f12109b.setAlpha(80);
        this.f12109b.setStrokeWidth(3.0f);
        this.f12109b.setStyle(Paint.Style.FILL);
        this.f12109b.setAntiAlias(true);
        this.f12109b.setTextSize(25.0f);
        this.f12110c = new Paint();
        this.f12110c.setColor(getResources().getColor(C1704R.color.changebetery));
        this.f12110c.setStrokeWidth(3.0f);
        this.f12110c.setTextSize(25.0f);
        this.f12110c.setAntiAlias(true);
        this.f12110c.setStyle(Paint.Style.FILL);
        if (this.f12108a == null) {
            this.f12108a = Typeface.createFromAsset(this.f12113f.getAssets(), "DIN Alternate Bold.ttf");
        }
        this.f12110c.setTypeface(this.f12108a);
        this.f12109b.setTypeface(this.f12108a);
        this.f12114g = BitmapFactory.decodeResource(getResources(), C1704R.C1705drawable.icon_brightness_circle);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float dimension = this.f12113f.getResources().getDimension(C1704R.dimen.dp50);
        float width = (getWidth() - this.f12113f.getResources().getDimension(C1704R.dimen.dp100)) / 100.0f;
        canvas.drawLine(this.f12113f.getResources().getDimension(C1704R.dimen.dp50), this.f12113f.getResources().getDimension(C1704R.dimen.dp28) + getY(), getWidth() - this.f12113f.getResources().getDimension(C1704R.dimen.dp50), this.f12113f.getResources().getDimension(C1704R.dimen.dp28) + getY(), this.f12109b);
        canvas.drawLine(dimension + (0.0f * width), 8.0f + getY(), dimension + (0.0f * width), this.f12113f.getResources().getDimension(C1704R.dimen.dp20) + getY(), this.f12109b);
        canvas.drawLine(dimension + (100.0f * width), 8.0f + getY(), dimension + (100.0f * width), this.f12113f.getResources().getDimension(C1704R.dimen.dp20) + getY(), this.f12109b);
        if (this.f12112e != 0) {
            canvas.drawText(String.valueOf(1) + "%", dimension - (this.f12109b.getTextSize() / 2.0f), getY() + this.f12113f.getResources().getDimension(C1704R.dimen.dp70), this.f12109b);
        }
        if (this.f12112e != 100) {
            canvas.drawText("100%", ((100.0f * width) + dimension) - this.f12109b.getTextSize(), getY() + this.f12113f.getResources().getDimension(C1704R.dimen.dp70), this.f12109b);
        }
        canvas.drawBitmap(this.f12114g, ((this.f12111d * width) + dimension) - (this.f12110c.getTextSize() / 2.0f), getY() + this.f12113f.getResources().getDimension(C1704R.dimen.dp12_v), this.f12110c);
        this.f12110c.setColor(this.f12113f.getResources().getColor(C1704R.color.ev_color));
        canvas.drawText(String.valueOf(this.f12112e + "%"), ((this.f12111d * width) + dimension) - (this.f12109b.getTextSize() / 2.0f), getY() + this.f12113f.getResources().getDimension(C1704R.dimen.dp70), this.f12110c);
    }

    public void setLightPercent(int i) {
        this.f12112e = Math.abs(i) <= 0 ? 1 : Math.abs(i);
        this.f12111d = Math.abs(i);
        invalidate();
    }
}
