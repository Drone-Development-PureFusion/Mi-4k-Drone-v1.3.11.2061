package android.support.p004v7.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.p001v4.graphics.drawable.DrawableCompat;
import android.support.p001v4.view.ViewCompat;
import android.support.p004v7.appcompat.C0176R;
import android.util.AttributeSet;
import android.widget.SeekBar;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.AppCompatSeekBarHelper */
/* loaded from: classes.dex */
public class AppCompatSeekBarHelper extends AppCompatProgressBarHelper {
    private Drawable mTickMark;
    private final SeekBar mView;
    private ColorStateList mTickMarkTintList = null;
    private PorterDuff.Mode mTickMarkTintMode = null;
    private boolean mHasTickMarkTint = false;
    private boolean mHasTickMarkTintMode = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppCompatSeekBarHelper(SeekBar seekBar, AppCompatDrawableManager appCompatDrawableManager) {
        super(seekBar, appCompatDrawableManager);
        this.mView = seekBar;
    }

    private void applyTickMarkTint() {
        if (this.mTickMark != null) {
            if (!this.mHasTickMarkTint && !this.mHasTickMarkTintMode) {
                return;
            }
            this.mTickMark = this.mTickMark.mutate();
            if (this.mHasTickMarkTint) {
                this.mTickMark.setTintList(this.mTickMarkTintList);
            }
            if (this.mHasTickMarkTintMode) {
                this.mTickMark.setTintMode(this.mTickMarkTintMode);
            }
            if (!this.mTickMark.isStateful()) {
                return;
            }
            this.mTickMark.setState(this.mView.getDrawableState());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void drawTickMarks(Canvas canvas) {
        int max;
        int i = 1;
        if (this.mTickMark == null || (max = this.mView.getMax()) <= 1) {
            return;
        }
        int intrinsicWidth = this.mTickMark.getIntrinsicWidth();
        int intrinsicHeight = this.mTickMark.getIntrinsicHeight();
        int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
        if (intrinsicHeight >= 0) {
            i = intrinsicHeight / 2;
        }
        this.mTickMark.setBounds(-i2, -i, i2, i);
        float width = ((this.mView.getWidth() - this.mView.getPaddingLeft()) - this.mView.getPaddingRight()) / max;
        int save = canvas.save();
        canvas.translate(this.mView.getPaddingLeft(), this.mView.getHeight() / 2);
        for (int i3 = 0; i3 <= max; i3++) {
            this.mTickMark.draw(canvas);
            canvas.translate(width, 0.0f);
        }
        canvas.restoreToCount(save);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void drawableStateChanged() {
        Drawable drawable = this.mTickMark;
        if (drawable == null || !drawable.isStateful() || !drawable.setState(this.mView.getDrawableState())) {
            return;
        }
        this.mView.invalidateDrawable(drawable);
    }

    @Nullable
    Drawable getTickMark() {
        return this.mTickMark;
    }

    @Nullable
    ColorStateList getTickMarkTintList() {
        return this.mTickMarkTintList;
    }

    @Nullable
    PorterDuff.Mode getTickMarkTintMode() {
        return this.mTickMarkTintMode;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void jumpDrawablesToCurrentState() {
        if (this.mTickMark != null) {
            this.mTickMark.jumpToCurrentState();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.p004v7.widget.AppCompatProgressBarHelper
    public void loadFromAttributes(AttributeSet attributeSet, int i) {
        super.loadFromAttributes(attributeSet, i);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(this.mView.getContext(), attributeSet, C0176R.styleable.AppCompatSeekBar, i, 0);
        Drawable drawableIfKnown = obtainStyledAttributes.getDrawableIfKnown(C0176R.styleable.AppCompatSeekBar_android_thumb);
        if (drawableIfKnown != null) {
            this.mView.setThumb(drawableIfKnown);
        }
        setTickMark(obtainStyledAttributes.getDrawable(C0176R.styleable.AppCompatSeekBar_tickMark));
        if (obtainStyledAttributes.hasValue(C0176R.styleable.AppCompatSeekBar_tickMarkTintMode)) {
            this.mTickMarkTintMode = DrawableUtils.parseTintMode(obtainStyledAttributes.getInt(C0176R.styleable.AppCompatSeekBar_tickMarkTintMode, -1), this.mTickMarkTintMode);
            this.mHasTickMarkTintMode = true;
        }
        if (obtainStyledAttributes.hasValue(C0176R.styleable.AppCompatSeekBar_tickMarkTint)) {
            this.mTickMarkTintList = obtainStyledAttributes.getColorStateList(C0176R.styleable.AppCompatSeekBar_tickMarkTint);
            this.mHasTickMarkTint = true;
        }
        obtainStyledAttributes.recycle();
        applyTickMarkTint();
    }

    void setTickMark(@Nullable Drawable drawable) {
        if (this.mTickMark != null) {
            this.mTickMark.setCallback(null);
        }
        this.mTickMark = drawable;
        if (drawable != null) {
            drawable.setCallback(this.mView);
            DrawableCompat.setLayoutDirection(drawable, ViewCompat.getLayoutDirection(this.mView));
            if (drawable.isStateful()) {
                drawable.setState(this.mView.getDrawableState());
            }
            applyTickMarkTint();
        }
        this.mView.invalidate();
    }

    void setTickMarkTintList(@Nullable ColorStateList colorStateList) {
        this.mTickMarkTintList = colorStateList;
        this.mHasTickMarkTint = true;
        applyTickMarkTint();
    }

    void setTickMarkTintMode(@Nullable PorterDuff.Mode mode) {
        this.mTickMarkTintMode = mode;
        this.mHasTickMarkTintMode = true;
        applyTickMarkTint();
    }
}
