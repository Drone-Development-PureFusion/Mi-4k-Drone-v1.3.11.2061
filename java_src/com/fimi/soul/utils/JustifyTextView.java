package com.fimi.soul.utils;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.TextView;
/* loaded from: classes.dex */
public class JustifyTextView extends TextView {

    /* renamed from: a */
    private int f11474a;

    /* renamed from: b */
    private int f11475b;

    /* renamed from: c */
    private Context f11476c;

    public JustifyTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11476c = context;
    }

    /* renamed from: a */
    private void m29416a(Canvas canvas, int i, String str, float f) {
        float f2 = 0.0f;
        if (m29417a(i, str)) {
            canvas.drawText("  ", 0.0f, this.f11474a - 5.0f, getPaint());
            f2 = 0.0f + StaticLayout.getDesiredWidth("  ", getPaint());
            str = str.substring(3);
        }
        float length = ((this.f11475b - f) / str.length()) - 1.0f;
        float f3 = f2;
        for (int i2 = 0; i2 < str.length(); i2++) {
            String valueOf = String.valueOf(str.charAt(i2));
            float desiredWidth = StaticLayout.getDesiredWidth(valueOf, getPaint());
            canvas.drawText(valueOf, f3, this.f11474a, getPaint());
            f3 += desiredWidth + length;
        }
    }

    /* renamed from: a */
    private boolean m29417a(int i, String str) {
        return str.length() > 3 && str.charAt(0) == ' ' && str.charAt(1) == ' ';
    }

    /* renamed from: a */
    private boolean m29415a(String str) {
        return (str.length() == 0 || str.charAt(str.length() + (-1)) == '\n') ? false : true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        TextPaint paint = getPaint();
        paint.setColor(getCurrentTextColor());
        paint.drawableState = getDrawableState();
        paint.setTypeface(C3103au.m29235a(this.f11476c.getAssets()));
        this.f11475b = getMeasuredWidth();
        String str = (String) getText();
        this.f11474a = 0;
        this.f11474a = (int) (this.f11474a + getTextSize());
        Layout layout = getLayout();
        for (int i = 0; i < layout.getLineCount(); i++) {
            int lineStart = layout.getLineStart(i);
            int lineEnd = layout.getLineEnd(i);
            String substring = str.substring(lineStart, lineEnd);
            float desiredWidth = StaticLayout.getDesiredWidth(str, lineStart, lineEnd, getPaint());
            if (!m29415a(substring) || i == layout.getLineCount() - 1) {
                canvas.drawText(substring, 0.0f, this.f11474a - 5.0f, paint);
            } else {
                m29416a(canvas, lineStart, substring, desiredWidth);
            }
            this.f11474a += getLineHeight();
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }
}
