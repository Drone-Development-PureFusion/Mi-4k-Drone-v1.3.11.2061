package com.fimi.soul.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
/* loaded from: classes2.dex */
public class KeyboardRelativeLayout extends RelativeLayout {

    /* renamed from: a */
    public static final byte f12105a = -4;

    /* renamed from: b */
    private static final String f12106b = KeyboardRelativeLayout.class.getSimpleName();

    /* renamed from: c */
    private AbstractC3169a f12107c;

    /* renamed from: com.fimi.soul.view.KeyboardRelativeLayout$a */
    /* loaded from: classes2.dex */
    public interface AbstractC3169a {
        /* renamed from: a */
        void m28884a(int i);
    }

    public KeyboardRelativeLayout(Context context) {
        super(context);
    }

    public KeyboardRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public KeyboardRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        rect.top = 0;
        return super.fitSystemWindows(rect);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f12107c != null) {
            this.f12107c.m28884a(-4);
        }
    }

    public void setOnKeyboardStateChangedListener(AbstractC3169a abstractC3169a) {
        this.f12107c = abstractC3169a;
    }
}
