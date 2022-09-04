package com.fimi.soul.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import com.fimi.overseas.soul.C1704R;
/* loaded from: classes.dex */
public class EVview extends View {

    /* renamed from: a */
    private Paint f12032a;

    /* renamed from: b */
    private Paint f12033b;

    /* renamed from: c */
    private Paint f12034c;

    /* renamed from: d */
    private int f12035d = 6;

    /* renamed from: e */
    private float f12036e = 0.0f;

    /* renamed from: f */
    private Context f12037f;

    /* renamed from: g */
    private Typeface f12038g;

    public EVview(Context context) {
        super(context);
        this.f12037f = context;
        m28945a();
    }

    public EVview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12037f = context;
        m28945a();
    }

    /* renamed from: b */
    private void m28943b(float f) {
        if (f == -2.0f) {
            this.f12035d = 0;
        } else if (f == -1.7f) {
            this.f12035d = 1;
        } else if (f == -1.3f) {
            this.f12035d = 2;
        } else if (f == -1.0f) {
            this.f12035d = 3;
        } else if (f == -0.7f) {
            this.f12035d = 4;
        } else if (f == -0.3f) {
            this.f12035d = 5;
        } else if (f == 0.0f) {
            this.f12035d = 6;
        } else if (f == 0.3f) {
            this.f12035d = 7;
        } else if (f == 0.7f) {
            this.f12035d = 8;
        } else if (f == 1.0f) {
            this.f12035d = 9;
        } else if (f == 1.3f) {
            this.f12035d = 10;
        } else if (f == 1.7f) {
            this.f12035d = 11;
        } else if (f != 2.0f) {
        } else {
            this.f12035d = 12;
        }
    }

    /* renamed from: c */
    private void m28942c(float f) {
        if (f == -2.0f) {
            this.f12035d = 0;
        } else if (f == -1.3f) {
            this.f12035d = 2;
        } else if (f == -0.7f) {
            this.f12035d = 4;
        } else if (f == 0.0f) {
            this.f12035d = 6;
        } else if (f == 0.7f) {
            this.f12035d = 8;
        } else if (f == 1.3f) {
            this.f12035d = 10;
        } else if (f != 2.0f) {
        } else {
            this.f12035d = 12;
        }
    }

    /* renamed from: a */
    void m28945a() {
        this.f12032a = new Paint();
        this.f12032a.setColor(-1);
        this.f12032a.setAlpha(80);
        this.f12032a.setStrokeWidth(3.0f);
        this.f12032a.setStyle(Paint.Style.FILL);
        this.f12032a.setAntiAlias(true);
        this.f12032a.setTextSize(25.0f);
        this.f12033b = new Paint();
        this.f12033b.setColor(getResources().getColor(C1704R.color.changebetery));
        this.f12033b.setStrokeWidth(3.0f);
        this.f12033b.setAntiAlias(true);
        this.f12033b.setStyle(Paint.Style.FILL);
        if (this.f12038g == null) {
            this.f12038g = Typeface.createFromAsset(this.f12037f.getAssets(), "DIN Alternate Bold.ttf");
        }
        this.f12033b.setTypeface(this.f12038g);
        this.f12032a.setTypeface(this.f12038g);
    }

    /* renamed from: a */
    public void m28944a(float f) {
        this.f12036e = f;
        m28943b(f);
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f12032a.setColor(-1);
        canvas.drawLine(this.f12037f.getResources().getDimension(C1704R.dimen.dp50), this.f12037f.getResources().getDimension(C1704R.dimen.dp28) + getY(), getWidth() - this.f12037f.getResources().getDimension(C1704R.dimen.dp50), this.f12037f.getResources().getDimension(C1704R.dimen.dp28) + getY(), this.f12032a);
        float dimension = this.f12037f.getResources().getDimension(C1704R.dimen.dp50);
        float width = (getWidth() - this.f12037f.getResources().getDimension(C1704R.dimen.dp100)) / 12.0f;
        for (int i = 0; i <= 12; i++) {
            this.f12032a.setColor(-1);
            if (i % 2 != 0) {
                canvas.drawLine(dimension + (i * width), this.f12037f.getResources().getDimension(C1704R.dimen.dp23) + getY(), dimension + (i * width), this.f12037f.getResources().getDimension(C1704R.dimen.dp33) + getY(), this.f12032a);
            } else {
                canvas.drawLine(dimension + (i * width), 13.0f + getY(), dimension + (i * width), this.f12037f.getResources().getDimension(C1704R.dimen.dp43) + getY(), this.f12032a);
            }
            if (i == 0) {
                if (this.f12035d != 0) {
                    canvas.drawText("-2", ((i * width) + dimension) - (this.f12032a.getTextSize() / 3.0f), getY() + this.f12037f.getResources().getDimension(C1704R.dimen.dp70), this.f12032a);
                }
            } else if (i == 6) {
                if (this.f12035d != 6) {
                    canvas.drawText("0", ((i * width) + dimension) - (this.f12032a.getTextSize() / 3.0f), getY() + this.f12037f.getResources().getDimension(C1704R.dimen.dp70), this.f12032a);
                }
            } else if (i == 12 && this.f12035d != 12) {
                canvas.drawText("2", ((i * width) + dimension) - (this.f12032a.getTextSize() / 3.0f), getY() + this.f12037f.getResources().getDimension(C1704R.dimen.dp70), this.f12032a);
            }
        }
        canvas.drawCircle((this.f12035d * width) + dimension, getY() + this.f12037f.getResources().getDimension(C1704R.dimen.dp28), this.f12037f.getResources().getDimension(C1704R.dimen.dp_ev_20), this.f12033b);
        this.f12032a.setColor(this.f12037f.getResources().getColor(C1704R.color.ev_color));
        canvas.drawText(String.valueOf(this.f12036e), ((this.f12035d * width) + dimension) - (this.f12032a.getTextSize() / 2.0f), getY() + this.f12037f.getResources().getDimension(C1704R.dimen.dp70), this.f12032a);
    }
}
