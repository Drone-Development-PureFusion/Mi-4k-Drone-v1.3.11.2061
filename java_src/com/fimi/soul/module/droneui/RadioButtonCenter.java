package com.fimi.soul.module.droneui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.fimi.overseas.soul.C1704R;
import p282m.framework.p285ui.widget.asyncview.AsyncImageView;
/* loaded from: classes.dex */
public class RadioButtonCenter extends RadioButton {

    /* renamed from: a */
    private Drawable f9571a;

    public RadioButtonCenter(Context context) {
        super(context);
    }

    public RadioButtonCenter(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RadioButtonCenter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1704R.styleable.RadioButtonCenter, i, 0);
        try {
            this.f9571a = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            setButtonDrawable(AsyncImageView.f35337a);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f9571a != null) {
            this.f9571a.setState(getDrawableState());
            int gravity = getGravity() & 112;
            int intrinsicHeight = this.f9571a.getIntrinsicHeight();
            int i = 0;
            switch (gravity) {
                case 16:
                    i = (getHeight() - intrinsicHeight) / 2;
                    break;
                case 80:
                    i = getHeight() - intrinsicHeight;
                    break;
            }
            int intrinsicWidth = this.f9571a.getIntrinsicWidth();
            int width = (getWidth() - intrinsicWidth) / 2;
            this.f9571a.setBounds(width, i, intrinsicWidth + width, intrinsicHeight + i);
            this.f9571a.draw(canvas);
        }
    }
}
