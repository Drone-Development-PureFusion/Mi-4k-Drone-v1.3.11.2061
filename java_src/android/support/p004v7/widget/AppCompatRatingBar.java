package android.support.p004v7.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.p001v4.view.ViewCompat;
import android.support.p004v7.appcompat.C0176R;
import android.util.AttributeSet;
import android.widget.RatingBar;
/* renamed from: android.support.v7.widget.AppCompatRatingBar */
/* loaded from: classes.dex */
public class AppCompatRatingBar extends RatingBar {
    private AppCompatProgressBarHelper mAppCompatProgressBarHelper;
    private AppCompatDrawableManager mDrawableManager;

    public AppCompatRatingBar(Context context) {
        this(context, null);
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0176R.attr.ratingBarStyle);
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mDrawableManager = AppCompatDrawableManager.get();
        this.mAppCompatProgressBarHelper = new AppCompatProgressBarHelper(this, this.mDrawableManager);
        this.mAppCompatProgressBarHelper.loadFromAttributes(attributeSet, i);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap sampleTime = this.mAppCompatProgressBarHelper.getSampleTime();
        if (sampleTime != null) {
            setMeasuredDimension(ViewCompat.resolveSizeAndState(sampleTime.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
