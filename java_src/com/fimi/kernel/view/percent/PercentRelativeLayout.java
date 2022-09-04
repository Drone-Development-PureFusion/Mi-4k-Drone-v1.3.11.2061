package com.fimi.kernel.view.percent;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.fimi.kernel.view.percent.C1700a;
/* loaded from: classes.dex */
public class PercentRelativeLayout extends RelativeLayout {

    /* renamed from: a */
    private final C1700a f4242a = new C1700a(this);

    /* loaded from: classes.dex */
    public static class LayoutParams extends RelativeLayout.LayoutParams implements C1700a.AbstractC1703b {

        /* renamed from: a */
        private C1700a.C1701a f4243a;

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4243a = C1700a.m34399a(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        @Override // com.fimi.kernel.view.percent.C1700a.AbstractC1703b
        /* renamed from: a */
        public C1700a.C1701a mo34379a() {
            return this.f4243a;
        }

        @Override // android.view.ViewGroup.LayoutParams
        protected void setBaseAttributes(TypedArray typedArray, int i, int i2) {
            C1700a.m34395a(this, typedArray, i, i2);
        }
    }

    public PercentRelativeLayout(Context context) {
        super(context);
    }

    public PercentRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PercentRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    /* renamed from: a */
    public LayoutParams mo40106generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f4242a.m34402a();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        this.f4242a.m34401a(i, i2);
        super.onMeasure(i, i2);
        if (this.f4242a.m34391b()) {
            super.onMeasure(i, i2);
        }
    }
}
