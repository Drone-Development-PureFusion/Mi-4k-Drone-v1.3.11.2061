package com.fimi.soul.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.fimi.overseas.soul.C1704R;
import p005b.p006a.p007a.p029b.p045i.p046a.C0548a;
/* loaded from: classes2.dex */
public class TunWheel extends View {

    /* renamed from: e */
    private static final int f12283e = 5;

    /* renamed from: h */
    private static final int f12284h = 7;

    /* renamed from: j */
    private static final int f12285j = 8;

    /* renamed from: k */
    private static final int f12286k = 5;

    /* renamed from: l */
    private static int f12287l = 20;

    /* renamed from: a */
    int f12288a;

    /* renamed from: b */
    Context f12289b;

    /* renamed from: d */
    private int f12291d;

    /* renamed from: m */
    private AbstractC3182a f12295m;

    /* renamed from: o */
    private Bitmap f12297o;

    /* renamed from: f */
    private int f12292f = 0;

    /* renamed from: g */
    private int f12293g = 5;

    /* renamed from: i */
    private int f12294i = 0;

    /* renamed from: n */
    private Boolean f12296n = true;

    /* renamed from: c */
    private float f12290c = getContext().getResources().getDisplayMetrics().density;

    /* renamed from: com.fimi.soul.view.TunWheel$a */
    /* loaded from: classes2.dex */
    public interface AbstractC3182a {
        /* renamed from: a */
        void m28838a(float f);
    }

    public TunWheel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12289b = context;
        if (this.f12290c == 1.5d) {
            this.f12288a = (int) (180.0f * this.f12290c);
        } else if (this.f12290c == 2.0f) {
            this.f12288a = (int) (this.f12290c * 220.0f);
        } else if (this.f12290c == 3.0f) {
            this.f12288a = (int) (this.f12290c * 220.0f);
        }
        setBackgroundDrawable(getResources().getDrawable(C1704R.C1705drawable.speedbg));
        this.f12297o = BitmapFactory.decodeResource(getResources(), C1704R.C1705drawable.speedbg);
        if (this.f12297o == null || this.f12297o.isRecycled()) {
            return;
        }
        this.f12297o.recycle();
    }

    /* renamed from: a */
    private void m28843a() {
        if (this.f12295m != null) {
            this.f12295m.m28838a(this.f12292f);
        }
    }

    /* renamed from: a */
    private void m28840a(Canvas canvas) {
        canvas.save();
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(11.0f * this.f12290c);
        float desiredWidth = Layout.getDesiredWidth("0", textPaint);
        Paint paint = new Paint();
        paint.setColor(getResources().getColor(C1704R.color.black));
        canvas.drawRect(4.0f * this.f12290c, ((getHeight() / 2) - desiredWidth) - (this.f12290c * 4.0f), getWidth() - (this.f12290c * 1.0f), (this.f12290c * 2.0f) + (getHeight() / 2) + desiredWidth, paint);
        Paint paint2 = new Paint();
        paint2.setColor(getResources().getColor(C1704R.color.linetun));
        paint2.setStyle(Paint.Style.STROKE);
        if (this.f12296n.booleanValue()) {
            canvas.drawRect(4.0f * this.f12290c, ((getHeight() / 2) - desiredWidth) - (this.f12290c * 4.0f), getWidth() - (this.f12290c * 1.0f), (this.f12290c * 2.0f) + (getHeight() / 2) + desiredWidth, paint2);
        } else {
            canvas.drawRect((this.f12290c * 4.0f) - this.f12290c, ((getHeight() / 2) - desiredWidth) - (this.f12290c * 4.0f), (getWidth() - (this.f12290c * 1.0f)) - this.f12290c, (this.f12290c * 2.0f) + (getHeight() / 2) + desiredWidth, paint2);
        }
        textPaint.setColor(getResources().getColor(C1704R.color.red));
        float desiredWidth2 = Layout.getDesiredWidth("0", textPaint);
        if (this.f12292f >= 100 && this.f12292f < 1000) {
            canvas.drawText(String.valueOf(this.f12292f / 10.0d), f12287l + (3.0f * this.f12290c), (desiredWidth2 / 2.0f) + (getHeight() / 2), textPaint);
        } else if (this.f12292f >= 1000) {
            canvas.drawText(String.valueOf(this.f12292f / 10.0d), f12287l, (desiredWidth2 / 2.0f) + (getHeight() / 2), textPaint);
        } else if (this.f12292f < 0 && this.f12292f > -100) {
            canvas.drawText(String.valueOf(this.f12292f / 10.0d), f12287l + (this.f12290c * 4.0f), (desiredWidth2 / 2.0f) + (getHeight() / 2), textPaint);
        } else if (this.f12292f < -100 && this.f12292f > -999) {
            canvas.drawText(String.valueOf(this.f12292f / 10.0d), f12287l + (this.f12290c * 2.0f), (desiredWidth2 / 2.0f) + (getHeight() / 2), textPaint);
        } else if (this.f12292f <= -1000) {
            canvas.drawText(String.valueOf(this.f12292f / 10.0d), f12287l - this.f12290c, (desiredWidth2 / 2.0f) + (getHeight() / 2), textPaint);
        } else {
            canvas.drawText(String.valueOf(this.f12292f / 10.0d), f12287l + (6.0f * this.f12290c), (desiredWidth2 / 2.0f) + (getHeight() / 2), textPaint);
        }
        canvas.restore();
    }

    /* renamed from: b */
    private void m28839b(Canvas canvas) {
        canvas.save();
        Paint paint = new Paint();
        paint.setStrokeWidth(2.0f);
        paint.setColor(getResources().getColor(C1704R.color.linetun));
        paint.setStrokeWidth(1.0f);
        paint.setAntiAlias(true);
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(7.0f * this.f12290c);
        textPaint.setColor(getResources().getColor(C1704R.color.linetun));
        int i = this.f12291d;
        float desiredWidth = Layout.getDesiredWidth("0", textPaint);
        f12287l = (int) (7.0f * this.f12290c);
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.setTextSize(11.0f * this.f12290c);
        textPaint2.setColor(getResources().getColor(C1704R.color.linetun));
        if (this.f12296n.booleanValue()) {
            canvas.drawLine((getPaddingLeft() + f12287l) - this.f12290c, (10.0f * this.f12290c) + getPaddingTop(), (getPaddingLeft() + f12287l) - this.f12290c, getHeight() - (10.0f * this.f12290c), paint);
            int i2 = 0;
            float f = 0.0f;
            int i3 = 0;
            while (i2 <= i - (20.0f * this.f12290c)) {
                float f2 = ((i / 2) + this.f12294i) - ((this.f12293g * i3) * this.f12290c);
                if ((this.f12292f + i3) % 5 == 0) {
                    canvas.drawLine(f12287l + getPaddingLeft(), f2, (this.f12290c * 8.0f) + f12287l, f2, paint);
                    canvas.drawText(String.valueOf((this.f12292f + i3) / 10.0d), f12287l + (this.f12290c * 8.0f) + (3.0f * this.f12290c), f2 + (desiredWidth / 2.0f), textPaint);
                } else {
                    canvas.drawLine(f12287l + getPaddingLeft(), f2, (this.f12290c * 5.0f) + f12287l, f2, paint);
                }
                float f3 = (i / 2) + this.f12294i + (this.f12293g * i3 * this.f12290c);
                if (i2 != i - (20.0f * this.f12290c)) {
                    if ((this.f12292f - i3) % 5 == 0) {
                        canvas.drawLine(f12287l + getPaddingLeft(), f3, (this.f12290c * 8.0f) + f12287l, f3, paint);
                        if (f3 < i - (23.0f * this.f12290c)) {
                            canvas.drawText(String.valueOf((this.f12292f - i3) / 10.0d), f12287l + (this.f12290c * 8.0f) + (3.0f * this.f12290c), (desiredWidth / 2.0f) + f3, textPaint);
                        }
                    } else {
                        canvas.drawLine(f12287l + getPaddingLeft(), f3, (this.f12290c * 5.0f) + f12287l, f3, paint);
                    }
                }
                i3++;
                f = f3;
                i2 = (int) (i2 + (this.f12293g * 2 * this.f12290c));
            }
            canvas.drawLine(f12287l + getPaddingLeft(), f - this.f12294i, 2.0f * (f12287l + (this.f12290c * 8.0f)), f - this.f12294i, paint);
            canvas.drawText(C0548a.f931b, f12287l + (this.f12290c * 8.0f), (((desiredWidth / 2.0f) + f) - (4.0f * this.f12290c)) - this.f12294i, textPaint2);
        } else {
            canvas.drawLine((2.0f * this.f12290c) + (getWidth() - f12287l), (10.0f * this.f12290c) + getPaddingTop(), (2.0f * this.f12290c) + (getWidth() - f12287l), getHeight() - (10.0f * this.f12290c), paint);
            int i4 = 0;
            float f4 = 0.0f;
            int i5 = 0;
            while (i4 <= i - (20.0f * this.f12290c)) {
                float f5 = ((i / 2) + this.f12294i) - ((this.f12293g * i5) * this.f12290c);
                if ((this.f12292f + i5) % 5 == 0) {
                    canvas.drawLine(this.f12290c + (getWidth() - f12287l), f5, this.f12290c + ((getWidth() - f12287l) - (this.f12290c * 8.0f)), f5, paint);
                    if (this.f12292f + i5 >= 100 && this.f12292f + i5 < 1000) {
                        canvas.drawText(String.valueOf((this.f12292f + i5) / 10.0d), f12287l + (5.0f * this.f12290c), f5 + (desiredWidth / 2.0f), textPaint);
                    } else if (this.f12292f + i5 >= 1000) {
                        canvas.drawText(String.valueOf((this.f12292f + i5) / 10.0d), f12287l + this.f12290c, f5 + (desiredWidth / 2.0f), textPaint);
                    } else if (this.f12292f + i5 < 0 && this.f12292f + i5 > -100) {
                        canvas.drawText(String.valueOf((this.f12292f + i5) / 10.0d), f12287l + (7.0f * this.f12290c), f5 + (desiredWidth / 2.0f), textPaint);
                    } else if (this.f12292f + i5 < -100 && this.f12292f + i5 > -999) {
                        canvas.drawText(String.valueOf((this.f12292f + i5) / 10.0d), f12287l + (3.0f * this.f12290c), f5 + (desiredWidth / 2.0f), textPaint);
                    } else if (this.f12292f + i5 <= -1000) {
                        canvas.drawText(String.valueOf((this.f12292f + i5) / 10.0d), f12287l - (2.0f * this.f12290c), f5 + (desiredWidth / 2.0f), textPaint);
                    } else {
                        canvas.drawText(String.valueOf((this.f12292f + i5) / 10.0d), (f12287l * 2) + (2.0f * this.f12290c), f5 + (desiredWidth / 2.0f), textPaint);
                    }
                } else {
                    canvas.drawLine(this.f12290c + (getWidth() - f12287l), f5, this.f12290c + ((getWidth() - f12287l) - (this.f12290c * 5.0f)), f5, paint);
                }
                float f6 = (i / 2) + this.f12294i + (this.f12293g * i5 * this.f12290c);
                if (i4 != i - (20.0f * this.f12290c)) {
                    if ((this.f12292f - i5) % 5 == 0) {
                        canvas.drawLine(this.f12290c + (getWidth() - f12287l), f6, this.f12290c + ((getWidth() - f12287l) - (this.f12290c * 8.0f)), f6, paint);
                        if (f6 < i - (23.0f * this.f12290c)) {
                            if (this.f12292f - i5 >= 100 && this.f12292f - i5 < 1000) {
                                canvas.drawText(String.valueOf((this.f12292f - i5) / 10.0d), f12287l + (5.0f * this.f12290c), (desiredWidth / 2.0f) + f6, textPaint);
                            } else if (this.f12292f - i5 >= 1000) {
                                canvas.drawText(String.valueOf((this.f12292f - i5) / 10.0d), f12287l + this.f12290c, (desiredWidth / 2.0f) + f6, textPaint);
                            } else if (this.f12292f - i5 < 0 && this.f12292f - i5 > -100) {
                                canvas.drawText(String.valueOf((this.f12292f - i5) / 10.0d), f12287l + (this.f12290c * 7.0f), (desiredWidth / 2.0f) + f6, textPaint);
                            } else if (this.f12292f - i5 <= -100 && this.f12292f - i5 > -999) {
                                canvas.drawText(String.valueOf((this.f12292f - i5) / 10.0d), f12287l + (3.0f * this.f12290c), (desiredWidth / 2.0f) + f6, textPaint);
                            } else if (this.f12292f - i5 <= -1000) {
                                canvas.drawText(String.valueOf((this.f12292f - i5) / 10.0d), f12287l - (2.0f * this.f12290c), (desiredWidth / 2.0f) + f6, textPaint);
                            } else {
                                canvas.drawText(String.valueOf((this.f12292f - i5) / 10.0d), (f12287l * 2) + (2.0f * this.f12290c), (desiredWidth / 2.0f) + f6, textPaint);
                            }
                        }
                    } else {
                        canvas.drawLine(this.f12290c + (getWidth() - f12287l), f6, this.f12290c + ((getWidth() - f12287l) - (this.f12290c * 5.0f)), f6, paint);
                    }
                }
                i5++;
                i4 = (int) (i4 + (this.f12293g * 2 * this.f12290c));
                f4 = f6;
            }
            canvas.drawLine(this.f12290c + (getWidth() / 4), f4 - this.f12294i, this.f12290c + (getWidth() - f12287l), f4 - this.f12294i, paint);
            canvas.drawText("m/s", (8.0f * this.f12290c) + this.f12290c, (((desiredWidth / 2.0f) + f4) - (4.0f * this.f12290c)) - this.f12294i, textPaint2);
        }
        canvas.restore();
    }

    /* renamed from: a */
    public void m28842a(float f) {
        this.f12292f = (int) (10.0f * f);
        m28843a();
        postInvalidate();
    }

    /* renamed from: a */
    public void m28841a(int i, int i2) {
        this.f12292f = i;
        this.f12294i = (int) ((i2 * this.f12290c) / 2.0f);
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m28839b(canvas);
        m28840a(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f12291d = getHeight();
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(this.f12297o.getWidth(), this.f12288a);
    }

    public void setDirection(Boolean bool) {
        this.f12296n = bool;
    }
}
