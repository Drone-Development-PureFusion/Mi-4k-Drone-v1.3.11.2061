package android.support.p004v7.app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.app.OverlayListView */
/* loaded from: classes.dex */
public final class OverlayListView extends ListView {
    private final List<OverlayObject> mOverlayObjects = new ArrayList();

    /* renamed from: android.support.v7.app.OverlayListView$OverlayObject */
    /* loaded from: classes.dex */
    public static class OverlayObject {
        private BitmapDrawable mBitmap;
        private Rect mCurrentBounds;
        private int mDeltaY;
        private long mDuration;
        private Interpolator mInterpolator;
        private boolean mIsAnimationEnded;
        private boolean mIsAnimationStarted;
        private OnAnimationEndListener mListener;
        private Rect mStartRect;
        private long mStartTime;
        private float mCurrentAlpha = 1.0f;
        private float mStartAlpha = 1.0f;
        private float mEndAlpha = 1.0f;

        /* renamed from: android.support.v7.app.OverlayListView$OverlayObject$OnAnimationEndListener */
        /* loaded from: classes.dex */
        public interface OnAnimationEndListener {
            void onAnimationEnd();
        }

        public OverlayObject(BitmapDrawable bitmapDrawable, Rect rect) {
            this.mBitmap = bitmapDrawable;
            this.mStartRect = rect;
            this.mCurrentBounds = new Rect(rect);
            if (this.mBitmap == null || this.mCurrentBounds == null) {
                return;
            }
            this.mBitmap.setAlpha((int) (this.mCurrentAlpha * 255.0f));
            this.mBitmap.setBounds(this.mCurrentBounds);
        }

        public BitmapDrawable getBitmapDrawable() {
            return this.mBitmap;
        }

        public boolean isAnimationStarted() {
            return this.mIsAnimationStarted;
        }

        public OverlayObject setAlphaAnimation(float f, float f2) {
            this.mStartAlpha = f;
            this.mEndAlpha = f2;
            return this;
        }

        public OverlayObject setAnimationEndListener(OnAnimationEndListener onAnimationEndListener) {
            this.mListener = onAnimationEndListener;
            return this;
        }

        public OverlayObject setDuration(long j) {
            this.mDuration = j;
            return this;
        }

        public OverlayObject setInterpolator(Interpolator interpolator) {
            this.mInterpolator = interpolator;
            return this;
        }

        public OverlayObject setTranslateYAnimation(int i) {
            this.mDeltaY = i;
            return this;
        }

        public void startAnimation(long j) {
            this.mStartTime = j;
            this.mIsAnimationStarted = true;
        }

        public void stopAnimation() {
            this.mIsAnimationStarted = true;
            this.mIsAnimationEnded = true;
            if (this.mListener != null) {
                this.mListener.onAnimationEnd();
            }
        }

        public boolean update(long j) {
            float f = 0.0f;
            if (this.mIsAnimationEnded) {
                return false;
            }
            float max = Math.max(0.0f, Math.min(1.0f, ((float) (j - this.mStartTime)) / ((float) this.mDuration)));
            if (this.mIsAnimationStarted) {
                f = max;
            }
            float interpolation = this.mInterpolator == null ? f : this.mInterpolator.getInterpolation(f);
            int i = (int) (this.mDeltaY * interpolation);
            this.mCurrentBounds.top = this.mStartRect.top + i;
            this.mCurrentBounds.bottom = i + this.mStartRect.bottom;
            this.mCurrentAlpha = (interpolation * (this.mEndAlpha - this.mStartAlpha)) + this.mStartAlpha;
            if (this.mBitmap != null && this.mCurrentBounds != null) {
                this.mBitmap.setAlpha((int) (this.mCurrentAlpha * 255.0f));
                this.mBitmap.setBounds(this.mCurrentBounds);
            }
            if (this.mIsAnimationStarted && f >= 1.0f) {
                this.mIsAnimationEnded = true;
                if (this.mListener != null) {
                    this.mListener.onAnimationEnd();
                }
            }
            return !this.mIsAnimationEnded;
        }
    }

    public OverlayListView(Context context) {
        super(context);
    }

    public OverlayListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OverlayListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void addOverlayObject(OverlayObject overlayObject) {
        this.mOverlayObjects.add(overlayObject);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.mOverlayObjects.size() > 0) {
            Iterator<OverlayObject> it2 = this.mOverlayObjects.iterator();
            while (it2.hasNext()) {
                OverlayObject next = it2.next();
                BitmapDrawable bitmapDrawable = next.getBitmapDrawable();
                if (bitmapDrawable != null) {
                    bitmapDrawable.draw(canvas);
                }
                if (!next.update(getDrawingTime())) {
                    it2.remove();
                }
            }
        }
    }

    public void startAnimationAll() {
        for (OverlayObject overlayObject : this.mOverlayObjects) {
            if (!overlayObject.isAnimationStarted()) {
                overlayObject.startAnimation(getDrawingTime());
            }
        }
    }

    public void stopAnimationAll() {
        for (OverlayObject overlayObject : this.mOverlayObjects) {
            overlayObject.stopAnimation();
        }
    }
}
