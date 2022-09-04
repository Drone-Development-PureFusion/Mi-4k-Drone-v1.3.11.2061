package android.support.p004v7.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.p001v4.graphics.drawable.DrawableCompat;
import android.support.p004v7.appcompat.C0176R;
import android.support.v4.widget.CompoundButtonCompat;
import android.util.AttributeSet;
import android.widget.CompoundButton;
/* renamed from: android.support.v7.widget.AppCompatCompoundButtonHelper */
/* loaded from: classes.dex */
class AppCompatCompoundButtonHelper {
    private final AppCompatDrawableManager mDrawableManager;
    private boolean mSkipNextApply;
    private final CompoundButton mView;
    private ColorStateList mButtonTintList = null;
    private PorterDuff.Mode mButtonTintMode = null;
    private boolean mHasButtonTint = false;
    private boolean mHasButtonTintMode = false;

    /* renamed from: android.support.v7.widget.AppCompatCompoundButtonHelper$DirectSetButtonDrawableInterface */
    /* loaded from: classes.dex */
    interface DirectSetButtonDrawableInterface {
        void setButtonDrawable(Drawable drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppCompatCompoundButtonHelper(CompoundButton compoundButton, AppCompatDrawableManager appCompatDrawableManager) {
        this.mView = compoundButton;
        this.mDrawableManager = appCompatDrawableManager;
    }

    void applyButtonTint() {
        Drawable buttonDrawable = CompoundButtonCompat.getButtonDrawable(this.mView);
        if (buttonDrawable != null) {
            if (!this.mHasButtonTint && !this.mHasButtonTintMode) {
                return;
            }
            Drawable mutate = DrawableCompat.wrap(buttonDrawable).mutate();
            if (this.mHasButtonTint) {
                DrawableCompat.setTintList(mutate, this.mButtonTintList);
            }
            if (this.mHasButtonTintMode) {
                DrawableCompat.setTintMode(mutate, this.mButtonTintMode);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.mView.getDrawableState());
            }
            this.mView.setButtonDrawable(mutate);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getCompoundPaddingLeft(int i) {
        Drawable buttonDrawable;
        return (Build.VERSION.SDK_INT >= 17 || (buttonDrawable = CompoundButtonCompat.getButtonDrawable(this.mView)) == null) ? i : i + buttonDrawable.getIntrinsicWidth();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList getSupportButtonTintList() {
        return this.mButtonTintList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode getSupportButtonTintMode() {
        return this.mButtonTintMode;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void loadFromAttributes(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.mView.getContext().obtainStyledAttributes(attributeSet, C0176R.styleable.CompoundButton, i, 0);
        try {
            if (obtainStyledAttributes.hasValue(C0176R.styleable.CompoundButton_android_button) && (resourceId = obtainStyledAttributes.getResourceId(C0176R.styleable.CompoundButton_android_button, 0)) != 0) {
                this.mView.setButtonDrawable(this.mDrawableManager.getDrawable(this.mView.getContext(), resourceId));
            }
            if (obtainStyledAttributes.hasValue(C0176R.styleable.CompoundButton_buttonTint)) {
                CompoundButtonCompat.setButtonTintList(this.mView, obtainStyledAttributes.getColorStateList(C0176R.styleable.CompoundButton_buttonTint));
            }
            if (obtainStyledAttributes.hasValue(C0176R.styleable.CompoundButton_buttonTintMode)) {
                CompoundButtonCompat.setButtonTintMode(this.mView, DrawableUtils.parseTintMode(obtainStyledAttributes.getInt(C0176R.styleable.CompoundButton_buttonTintMode, -1), null));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onSetButtonDrawable() {
        if (this.mSkipNextApply) {
            this.mSkipNextApply = false;
            return;
        }
        this.mSkipNextApply = true;
        applyButtonTint();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        this.mButtonTintList = colorStateList;
        this.mHasButtonTint = true;
        applyButtonTint();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setSupportButtonTintMode(@Nullable PorterDuff.Mode mode) {
        this.mButtonTintMode = mode;
        this.mHasButtonTintMode = true;
        applyButtonTint();
    }
}
