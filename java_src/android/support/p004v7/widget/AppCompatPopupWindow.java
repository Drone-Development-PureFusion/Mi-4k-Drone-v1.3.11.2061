package android.support.p004v7.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;
import android.support.p004v7.appcompat.C0176R;
import android.support.v4.widget.PopupWindowCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
/* renamed from: android.support.v7.widget.AppCompatPopupWindow */
/* loaded from: classes.dex */
class AppCompatPopupWindow extends PopupWindow {
    private static final boolean COMPAT_OVERLAP_ANCHOR;
    private static final String TAG = "AppCompatPopupWindow";
    private boolean mOverlapAnchor;

    static {
        COMPAT_OVERLAP_ANCHOR = Build.VERSION.SDK_INT < 21;
    }

    public AppCompatPopupWindow(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i);
        init(context, attributeSet, i, 0);
    }

    @TargetApi(11)
    public AppCompatPopupWindow(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        super(context, attributeSet, i, i2);
        init(context, attributeSet, i, i2);
    }

    private void init(Context context, AttributeSet attributeSet, int i, int i2) {
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, C0176R.styleable.PopupWindow, i, i2);
        if (obtainStyledAttributes.hasValue(C0176R.styleable.PopupWindow_overlapAnchor)) {
            setSupportOverlapAnchor(obtainStyledAttributes.getBoolean(C0176R.styleable.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(obtainStyledAttributes.getDrawable(C0176R.styleable.PopupWindow_android_popupBackground));
        int i3 = Build.VERSION.SDK_INT;
        if (i2 != 0 && i3 < 11 && i3 >= 9 && obtainStyledAttributes.hasValue(C0176R.styleable.PopupWindow_android_popupAnimationStyle)) {
            setAnimationStyle(obtainStyledAttributes.getResourceId(C0176R.styleable.PopupWindow_android_popupAnimationStyle, -1));
        }
        obtainStyledAttributes.recycle();
        if (Build.VERSION.SDK_INT < 14) {
            wrapOnScrollChangedListener(this);
        }
    }

    private static void wrapOnScrollChangedListener(final PopupWindow popupWindow) {
        try {
            final Field declaredField = PopupWindow.class.getDeclaredField("mAnchor");
            declaredField.setAccessible(true);
            Field declaredField2 = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
            declaredField2.setAccessible(true);
            final ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = (ViewTreeObserver.OnScrollChangedListener) declaredField2.get(popupWindow);
            declaredField2.set(popupWindow, new ViewTreeObserver.OnScrollChangedListener() { // from class: android.support.v7.widget.AppCompatPopupWindow.1
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public void onScrollChanged() {
                    try {
                        WeakReference weakReference = (WeakReference) declaredField.get(popupWindow);
                        if (weakReference == null || weakReference.get() == null) {
                            return;
                        }
                        onScrollChangedListener.onScrollChanged();
                    } catch (IllegalAccessException e) {
                    }
                }
            });
        } catch (Exception e) {
            Log.d(TAG, "Exception while installing workaround OnScrollChangedListener", e);
        }
    }

    public boolean getSupportOverlapAnchor() {
        return COMPAT_OVERLAP_ANCHOR ? this.mOverlapAnchor : PopupWindowCompat.getOverlapAnchor(this);
    }

    public void setSupportOverlapAnchor(boolean z) {
        if (COMPAT_OVERLAP_ANCHOR) {
            this.mOverlapAnchor = z;
        } else {
            PopupWindowCompat.setOverlapAnchor(this, z);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2) {
        if (COMPAT_OVERLAP_ANCHOR && this.mOverlapAnchor) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    @TargetApi(19)
    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (COMPAT_OVERLAP_ANCHOR && this.mOverlapAnchor) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2, int i3, int i4) {
        super.update(view, i, (!COMPAT_OVERLAP_ANCHOR || !this.mOverlapAnchor) ? i2 : i2 - view.getHeight(), i3, i4);
    }
}
