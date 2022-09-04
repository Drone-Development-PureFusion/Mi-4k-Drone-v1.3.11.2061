package android.support.p004v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p004v7.appcompat.C0176R;
import android.support.p004v7.text.AllCapsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.AppCompatTextHelper */
/* loaded from: classes.dex */
public class AppCompatTextHelper {
    private static final int[] VIEW_ATTRS = {16842804, 16843119, 16843117, 16843120, 16843118};
    private TintInfo mDrawableBottomTint;
    private TintInfo mDrawableLeftTint;
    private TintInfo mDrawableRightTint;
    private TintInfo mDrawableTopTint;
    final TextView mView;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppCompatTextHelper(TextView textView) {
        this.mView = textView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AppCompatTextHelper create(TextView textView) {
        return Build.VERSION.SDK_INT >= 17 ? new AppCompatTextHelperV17(textView) : new AppCompatTextHelper(textView);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static TintInfo createTintInfo(Context context, AppCompatDrawableManager appCompatDrawableManager, int i) {
        ColorStateList tintList = appCompatDrawableManager.getTintList(context, i);
        if (tintList != null) {
            TintInfo tintInfo = new TintInfo();
            tintInfo.mHasTintList = true;
            tintInfo.mTintList = tintList;
            return tintInfo;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void applyCompoundDrawableTint(Drawable drawable, TintInfo tintInfo) {
        if (drawable == null || tintInfo == null) {
            return;
        }
        AppCompatDrawableManager.tintDrawable(drawable, tintInfo, this.mView.getDrawableState());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void applyCompoundDrawablesTints() {
        if (this.mDrawableLeftTint == null && this.mDrawableTopTint == null && this.mDrawableRightTint == null && this.mDrawableBottomTint == null) {
            return;
        }
        Drawable[] compoundDrawables = this.mView.getCompoundDrawables();
        applyCompoundDrawableTint(compoundDrawables[0], this.mDrawableLeftTint);
        applyCompoundDrawableTint(compoundDrawables[1], this.mDrawableTopTint);
        applyCompoundDrawableTint(compoundDrawables[2], this.mDrawableRightTint);
        applyCompoundDrawableTint(compoundDrawables[3], this.mDrawableBottomTint);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void loadFromAttributes(AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        Context context = this.mView.getContext();
        AppCompatDrawableManager appCompatDrawableManager = AppCompatDrawableManager.get();
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, VIEW_ATTRS, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        if (obtainStyledAttributes.hasValue(1)) {
            this.mDrawableLeftTint = createTintInfo(context, appCompatDrawableManager, obtainStyledAttributes.getResourceId(1, 0));
        }
        if (obtainStyledAttributes.hasValue(2)) {
            this.mDrawableTopTint = createTintInfo(context, appCompatDrawableManager, obtainStyledAttributes.getResourceId(2, 0));
        }
        if (obtainStyledAttributes.hasValue(3)) {
            this.mDrawableRightTint = createTintInfo(context, appCompatDrawableManager, obtainStyledAttributes.getResourceId(3, 0));
        }
        if (obtainStyledAttributes.hasValue(4)) {
            this.mDrawableBottomTint = createTintInfo(context, appCompatDrawableManager, obtainStyledAttributes.getResourceId(4, 0));
        }
        obtainStyledAttributes.recycle();
        boolean z3 = this.mView.getTransformationMethod() instanceof PasswordTransformationMethod;
        ColorStateList colorStateList = null;
        if (resourceId != -1) {
            TintTypedArray obtainStyledAttributes2 = TintTypedArray.obtainStyledAttributes(context, resourceId, C0176R.styleable.TextAppearance);
            if (z3 || !obtainStyledAttributes2.hasValue(C0176R.styleable.TextAppearance_textAllCaps)) {
                z = false;
                z2 = false;
            } else {
                z2 = obtainStyledAttributes2.getBoolean(C0176R.styleable.TextAppearance_textAllCaps, false);
                z = true;
            }
            if (Build.VERSION.SDK_INT < 23 && obtainStyledAttributes2.hasValue(C0176R.styleable.TextAppearance_android_textColor)) {
                colorStateList = obtainStyledAttributes2.getColorStateList(C0176R.styleable.TextAppearance_android_textColor);
            }
            obtainStyledAttributes2.recycle();
        } else {
            z = false;
            z2 = false;
        }
        TintTypedArray obtainStyledAttributes3 = TintTypedArray.obtainStyledAttributes(context, attributeSet, C0176R.styleable.TextAppearance, i, 0);
        if (!z3 && obtainStyledAttributes3.hasValue(C0176R.styleable.TextAppearance_textAllCaps)) {
            z2 = obtainStyledAttributes3.getBoolean(C0176R.styleable.TextAppearance_textAllCaps, false);
            z = true;
        }
        if (Build.VERSION.SDK_INT < 23 && obtainStyledAttributes3.hasValue(C0176R.styleable.TextAppearance_android_textColor)) {
            colorStateList = obtainStyledAttributes3.getColorStateList(C0176R.styleable.TextAppearance_android_textColor);
        }
        obtainStyledAttributes3.recycle();
        if (colorStateList != null) {
            this.mView.setTextColor(colorStateList);
        }
        if (z3 || !z) {
            return;
        }
        setAllCaps(z2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onSetTextAppearance(Context context, int i) {
        ColorStateList colorStateList;
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, i, C0176R.styleable.TextAppearance);
        if (obtainStyledAttributes.hasValue(C0176R.styleable.TextAppearance_textAllCaps)) {
            setAllCaps(obtainStyledAttributes.getBoolean(C0176R.styleable.TextAppearance_textAllCaps, false));
        }
        if (Build.VERSION.SDK_INT < 23 && obtainStyledAttributes.hasValue(C0176R.styleable.TextAppearance_android_textColor) && (colorStateList = obtainStyledAttributes.getColorStateList(C0176R.styleable.TextAppearance_android_textColor)) != null) {
            this.mView.setTextColor(colorStateList);
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setAllCaps(boolean z) {
        this.mView.setTransformationMethod(z ? new AllCapsTransformationMethod(this.mView.getContext()) : null);
    }
}
