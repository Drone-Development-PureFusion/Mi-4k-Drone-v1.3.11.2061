package com.fimi.soul.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.fimi.overseas.soul.C1704R;
import p282m.framework.p285ui.widget.asyncview.AsyncImageView;
/* loaded from: classes2.dex */
public class RadioButtonCenter extends RadioButton {

    /* renamed from: a */
    private Drawable f12157a;

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
            this.f12157a = obtainStyledAttributes.getDrawable(0);
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
        if (this.f12157a != null) {
            this.f12157a.setState(getDrawableState());
            int gravity = getGravity() & 112;
            int intrinsicHeight = this.f12157a.getIntrinsicHeight();
            int i = 0;
            switch (gravity) {
                case 16:
                    i = (getHeight() - intrinsicHeight) / 2;
                    break;
                case 80:
                    i = getHeight() - intrinsicHeight;
                    break;
            }
            int intrinsicWidth = this.f12157a.getIntrinsicWidth();
            int width = (getWidth() - intrinsicWidth) / 2;
            this.f12157a.setBounds(width, i, intrinsicWidth + width, intrinsicHeight + i);
            this.f12157a.draw(canvas);
        }
    }
}
