package com.fimi.kernel.view.percent;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.fimi.kernel.view.percent.C1700a;
/* loaded from: classes.dex */
public class PercentLinearLayout extends LinearLayout {

    /* renamed from: a */
    private static final String f4239a = "PercentLinearLayout";

    /* renamed from: b */
    private C1700a f4240b = new C1700a(this);

    /* loaded from: classes.dex */
    public static class LayoutParams extends LinearLayout.LayoutParams implements C1700a.AbstractC1703b {

        /* renamed from: a */
        private C1700a.C1701a f4241a;

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4241a = C1700a.m34399a(context, attributeSet);
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
            return this.f4241a;
        }

        @Override // android.view.ViewGroup.LayoutParams
        protected void setBaseAttributes(TypedArray typedArray, int i, int i2) {
            C1700a.m34395a(this, typedArray, i, i2);
        }
    }

    public PercentLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private int getScreenHeight() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: a */
    public LayoutParams mo40105generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f4240b.m34402a();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int screenHeight;
        int size = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, mode);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), View.MeasureSpec.getMode(i));
        Log.d(f4239a, View.MeasureSpec.toString(i2));
        if (mode == 0 && getParent() != null && (getParent() instanceof ScrollView)) {
            Context context = getContext();
            if (context instanceof Activity) {
                screenHeight = ((Activity) context).findViewById(16908290).getMeasuredHeight();
                Log.d(f4239a, "measuredHeight = " + screenHeight);
            } else {
                screenHeight = getScreenHeight();
                Log.d(f4239a, "scHeight = " + screenHeight);
            }
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(screenHeight, mode);
        }
        this.f4240b.m34401a(makeMeasureSpec2, makeMeasureSpec);
        super.onMeasure(i, i2);
        if (this.f4240b.m34391b()) {
            super.onMeasure(i, i2);
        }
    }
}
