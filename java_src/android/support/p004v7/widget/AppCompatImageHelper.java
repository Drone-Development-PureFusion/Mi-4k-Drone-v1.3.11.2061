package android.support.p004v7.widget;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.support.p001v4.content.ContextCompat;
import android.support.p004v7.appcompat.C0176R;
import android.util.AttributeSet;
import android.widget.ImageView;
/* renamed from: android.support.v7.widget.AppCompatImageHelper */
/* loaded from: classes.dex */
public class AppCompatImageHelper {
    private final AppCompatDrawableManager mDrawableManager;
    private final ImageView mView;

    public AppCompatImageHelper(ImageView imageView, AppCompatDrawableManager appCompatDrawableManager) {
        this.mView = imageView;
        this.mDrawableManager = appCompatDrawableManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean hasOverlappingRendering() {
        return Build.VERSION.SDK_INT < 21 || !(this.mView.getBackground() instanceof RippleDrawable);
    }

    public void loadFromAttributes(AttributeSet attributeSet, int i) {
        int resourceId;
        TintTypedArray tintTypedArray = null;
        try {
            Drawable drawable = this.mView.getDrawable();
            if (drawable == null && (resourceId = (tintTypedArray = TintTypedArray.obtainStyledAttributes(this.mView.getContext(), attributeSet, C0176R.styleable.AppCompatImageView, i, 0)).getResourceId(C0176R.styleable.AppCompatImageView_srcCompat, -1)) != -1 && (drawable = this.mDrawableManager.getDrawable(this.mView.getContext(), resourceId)) != null) {
                this.mView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                DrawableUtils.fixDrawable(drawable);
            }
        } finally {
            if (tintTypedArray != null) {
                tintTypedArray.recycle();
            }
        }
    }

    public void setImageResource(int i) {
        if (i == 0) {
            this.mView.setImageDrawable(null);
            return;
        }
        Drawable drawable = this.mDrawableManager != null ? this.mDrawableManager.getDrawable(this.mView.getContext(), i) : ContextCompat.getDrawable(this.mView.getContext(), i);
        if (drawable != null) {
            DrawableUtils.fixDrawable(drawable);
        }
        this.mView.setImageDrawable(drawable);
    }
}
