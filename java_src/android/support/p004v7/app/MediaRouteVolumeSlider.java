package android.support.p004v7.app;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p004v7.appcompat.C0176R;
import android.support.p004v7.widget.AppCompatSeekBar;
import android.util.AttributeSet;
import android.util.Log;
/* renamed from: android.support.v7.app.MediaRouteVolumeSlider */
/* loaded from: classes.dex */
class MediaRouteVolumeSlider extends AppCompatSeekBar {
    private static final String TAG = "MediaRouteVolumeSlider";
    private int mColor;
    private final float mDisabledAlpha;
    private boolean mHideThumb;
    private Drawable mThumb;

    public MediaRouteVolumeSlider(Context context) {
        this(context, null);
    }

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0176R.attr.seekBarStyle);
    }

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mDisabledAlpha = MediaRouterThemeHelper.getDisabledAlpha(context);
    }

    @Override // android.support.p004v7.widget.AppCompatSeekBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int i = isEnabled() ? 255 : (int) (255.0f * this.mDisabledAlpha);
        this.mThumb.setColorFilter(this.mColor, PorterDuff.Mode.SRC_IN);
        this.mThumb.setAlpha(i);
        getProgressDrawable().setColorFilter(this.mColor, PorterDuff.Mode.SRC_IN);
        getProgressDrawable().setAlpha(i);
    }

    public void setColor(int i) {
        if (this.mColor == i) {
            return;
        }
        if (Color.alpha(i) != 255) {
            Log.e(TAG, "Volume slider color cannot be translucent: #" + Integer.toHexString(i));
        }
        this.mColor = i;
    }

    public void setHideThumb(boolean z) {
        if (this.mHideThumb == z) {
            return;
        }
        this.mHideThumb = z;
        super.setThumb(this.mHideThumb ? null : this.mThumb);
    }

    @Override // android.widget.AbsSeekBar
    public void setThumb(Drawable drawable) {
        this.mThumb = drawable;
        super.setThumb(this.mHideThumb ? null : this.mThumb);
    }
}
