package android.support.p004v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.p004v7.widget.FitWindowsViewGroup;
import android.util.AttributeSet;
import android.widget.LinearLayout;
/* renamed from: android.support.v7.widget.FitWindowsLinearLayout */
/* loaded from: classes.dex */
public class FitWindowsLinearLayout extends LinearLayout implements FitWindowsViewGroup {
    private FitWindowsViewGroup.OnFitSystemWindowsListener mListener;

    public FitWindowsLinearLayout(Context context) {
        super(context);
    }

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        if (this.mListener != null) {
            this.mListener.onFitSystemWindows(rect);
        }
        return super.fitSystemWindows(rect);
    }

    @Override // android.support.p004v7.widget.FitWindowsViewGroup
    public void setOnFitSystemWindowsListener(FitWindowsViewGroup.OnFitSystemWindowsListener onFitSystemWindowsListener) {
        this.mListener = onFitSystemWindowsListener;
    }
}
