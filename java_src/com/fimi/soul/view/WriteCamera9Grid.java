package com.fimi.soul.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import com.fimi.overseas.soul.C1704R;
/* loaded from: classes2.dex */
public class WriteCamera9Grid extends View {

    /* renamed from: a */
    private Paint f12433a;

    /* renamed from: b */
    private float f12434b;

    /* renamed from: c */
    private float f12435c;

    /* renamed from: d */
    private int f12436d;

    /* renamed from: e */
    private int f12437e;

    public WriteCamera9Grid(Context context) {
        super(context);
    }

    public WriteCamera9Grid(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m28767a();
    }

    public WriteCamera9Grid(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m28767a();
    }

    /* renamed from: a */
    private void m28767a() {
        this.f12433a = new Paint();
        this.f12433a.setColor(getResources().getColor(C1704R.color.white));
        this.f12433a.setAlpha(153);
        this.f12433a.setStrokeWidth(1.0f);
        this.f12433a.setAntiAlias(true);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f12434b = displayMetrics.widthPixels;
        this.f12435c = displayMetrics.heightPixels;
        this.f12436d = (int) (this.f12434b / 3.0f);
        this.f12437e = (int) (this.f12435c / 3.0f);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawLine(0.0f, this.f12437e, this.f12434b, this.f12437e, this.f12433a);
        canvas.drawLine(0.0f, this.f12437e * 2, this.f12434b, this.f12437e * 2, this.f12433a);
        canvas.drawLine(this.f12436d, 0.0f, this.f12436d, this.f12435c, this.f12433a);
        canvas.drawLine(this.f12436d * 2, 0.0f, this.f12436d * 2, this.f12435c, this.f12433a);
    }
}
