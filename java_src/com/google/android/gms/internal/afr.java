package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.view.View;
import com.google.android.gms.cast.AdBreakInfo;
import java.util.List;
/* loaded from: classes2.dex */
public class afr extends View {

    /* renamed from: c */
    private List<AdBreakInfo> f21490c;

    /* renamed from: d */
    private Paint f21491d;

    /* renamed from: b */
    private int f21489b = 1;

    /* renamed from: a */
    private final int f21488a = m17723a(getContext(), 3.0d);

    public afr(Context context) {
        super(context);
    }

    /* renamed from: a */
    private static int m17723a(Context context, double d) {
        return context == null ? (int) Math.round(d) : (int) Math.round(context.getResources().getDisplayMetrics().density * d);
    }

    /* renamed from: a */
    public synchronized void m17724a(int i) {
        this.f21489b = i;
    }

    /* renamed from: a */
    public synchronized void m17722a(List<AdBreakInfo> list, @ColorInt int i) {
        this.f21490c = list;
        this.f21491d = new Paint(1);
        this.f21491d.setColor(i);
        this.f21491d.setStyle(Paint.Style.FILL);
        invalidate();
    }

    @Override // android.view.View
    protected synchronized void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        if (this.f21490c != null && !this.f21490c.isEmpty()) {
            int round = Math.round(getMeasuredHeight() / 2.0f);
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (AdBreakInfo adBreakInfo : this.f21490c) {
                if (adBreakInfo != null) {
                    long m25262b = adBreakInfo.m25262b();
                    if (m25262b >= 0 && m25262b <= this.f21489b) {
                        canvas.drawCircle(((int) ((m25262b * measuredWidth) / this.f21489b)) + getPaddingLeft(), round, this.f21488a, this.f21491d);
                    }
                }
            }
        }
    }
}
