package com.fimi.kernel.view.percent;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.fimi.kernel.view.percent.C1700a;
/* loaded from: classes.dex */
public class PercentFrameLayout extends FrameLayout {

    /* renamed from: a */
    private final C1700a f4237a = new C1700a(this);

    /* loaded from: classes.dex */
    public static class LayoutParams extends FrameLayout.LayoutParams implements C1700a.AbstractC1703b {

        /* renamed from: a */
        private C1700a.C1701a f4238a;

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(int i, int i2, int i3) {
            super(i, i2, i3);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4238a = C1700a.m34399a(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(FrameLayout.LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.gravity = layoutParams.gravity;
        }

        public LayoutParams(LayoutParams layoutParams) {
            this((FrameLayout.LayoutParams) layoutParams);
            this.f4238a = layoutParams.f4238a;
        }

        @Override // com.fimi.kernel.view.percent.C1700a.AbstractC1703b
        /* renamed from: a */
        public C1700a.C1701a mo34379a() {
            return this.f4238a;
        }

        @Override // android.view.ViewGroup.LayoutParams
        protected void setBaseAttributes(TypedArray typedArray, int i, int i2) {
            C1700a.m34395a(this, typedArray, i, i2);
        }
    }

    public PercentFrameLayout(Context context) {
        super(context);
    }

    public PercentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PercentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* renamed from: a */
    public LayoutParams mo40104generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f4237a.m34402a();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        this.f4237a.m34401a(i, i2);
        super.onMeasure(i, i2);
        if (this.f4237a.m34391b()) {
            super.onMeasure(i, i2);
        }
    }
}
