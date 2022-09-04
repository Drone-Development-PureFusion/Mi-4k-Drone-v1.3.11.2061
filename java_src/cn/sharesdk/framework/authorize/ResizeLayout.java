package cn.sharesdk.framework.authorize;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
/* loaded from: classes.dex */
public class ResizeLayout extends LinearLayout {

    /* renamed from: a */
    private OnResizeListener f1509a;

    /* loaded from: classes.dex */
    public interface OnResizeListener {
        void OnResize(int i, int i2, int i3, int i4);
    }

    public ResizeLayout(Context context) {
        super(context);
    }

    public ResizeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void m37984a(OnResizeListener onResizeListener) {
        this.f1509a = onResizeListener;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f1509a != null) {
            this.f1509a.OnResize(i, i2, i3, i4);
        }
    }
}
