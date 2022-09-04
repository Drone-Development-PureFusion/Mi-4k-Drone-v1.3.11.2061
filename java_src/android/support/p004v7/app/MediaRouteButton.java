package android.support.p004v7.app;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.p001v4.app.FragmentActivity;
import android.support.p001v4.app.FragmentManager;
import android.support.p001v4.graphics.drawable.DrawableCompat;
import android.support.p004v7.media.MediaRouteSelector;
import android.support.p004v7.media.MediaRouter;
import android.support.p004v7.mediarouter.C0203R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
/* renamed from: android.support.v7.app.MediaRouteButton */
/* loaded from: classes.dex */
public class MediaRouteButton extends View {
    private static final String CHOOSER_FRAGMENT_TAG = "android.support.v7.mediarouter:MediaRouteChooserDialogFragment";
    private static final String CONTROLLER_FRAGMENT_TAG = "android.support.v7.mediarouter:MediaRouteControllerDialogFragment";
    private static final String TAG = "MediaRouteButton";
    private boolean mAttachedToWindow;
    private final MediaRouterCallback mCallback;
    private boolean mCheatSheetEnabled;
    private MediaRouteDialogFactory mDialogFactory;
    private boolean mIsConnecting;
    private int mMinHeight;
    private int mMinWidth;
    private boolean mRemoteActive;
    private Drawable mRemoteIndicator;
    private final MediaRouter mRouter;
    private MediaRouteSelector mSelector;
    private static final int[] CHECKED_STATE_SET = {16842912};
    private static final int[] CHECKABLE_STATE_SET = {16842911};

    /* renamed from: android.support.v7.app.MediaRouteButton$MediaRouterCallback */
    /* loaded from: classes.dex */
    private final class MediaRouterCallback extends MediaRouter.Callback {
        private MediaRouterCallback() {
        }

        @Override // android.support.p004v7.media.MediaRouter.Callback
        public void onProviderAdded(MediaRouter mediaRouter, MediaRouter.ProviderInfo providerInfo) {
            MediaRouteButton.this.refreshRoute();
        }

        @Override // android.support.p004v7.media.MediaRouter.Callback
        public void onProviderChanged(MediaRouter mediaRouter, MediaRouter.ProviderInfo providerInfo) {
            MediaRouteButton.this.refreshRoute();
        }

        @Override // android.support.p004v7.media.MediaRouter.Callback
        public void onProviderRemoved(MediaRouter mediaRouter, MediaRouter.ProviderInfo providerInfo) {
            MediaRouteButton.this.refreshRoute();
        }

        @Override // android.support.p004v7.media.MediaRouter.Callback
        public void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            MediaRouteButton.this.refreshRoute();
        }

        @Override // android.support.p004v7.media.MediaRouter.Callback
        public void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            MediaRouteButton.this.refreshRoute();
        }

        @Override // android.support.p004v7.media.MediaRouter.Callback
        public void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            MediaRouteButton.this.refreshRoute();
        }

        @Override // android.support.p004v7.media.MediaRouter.Callback
        public void onRouteSelected(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            MediaRouteButton.this.refreshRoute();
        }

        @Override // android.support.p004v7.media.MediaRouter.Callback
        public void onRouteUnselected(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            MediaRouteButton.this.refreshRoute();
        }
    }

    public MediaRouteButton(Context context) {
        this(context, null);
    }

    public MediaRouteButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0203R.attr.mediaRouteButtonStyle);
    }

    public MediaRouteButton(Context context, AttributeSet attributeSet, int i) {
        super(MediaRouterThemeHelper.createThemedContext(context, i), attributeSet, i);
        this.mSelector = MediaRouteSelector.EMPTY;
        this.mDialogFactory = MediaRouteDialogFactory.getDefault();
        Context context2 = getContext();
        this.mRouter = MediaRouter.getInstance(context2);
        this.mCallback = new MediaRouterCallback();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C0203R.styleable.MediaRouteButton, i, 0);
        setRemoteIndicatorDrawable(obtainStyledAttributes.getDrawable(C0203R.styleable.MediaRouteButton_externalRouteEnabledDrawable));
        this.mMinWidth = obtainStyledAttributes.getDimensionPixelSize(C0203R.styleable.MediaRouteButton_android_minWidth, 0);
        this.mMinHeight = obtainStyledAttributes.getDimensionPixelSize(C0203R.styleable.MediaRouteButton_android_minHeight, 0);
        obtainStyledAttributes.recycle();
        setClickable(true);
        setLongClickable(true);
    }

    private Activity getActivity() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    private FragmentManager getFragmentManager() {
        Activity activity = getActivity();
        if (activity instanceof FragmentActivity) {
            return ((FragmentActivity) activity).getSupportFragmentManager();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshRoute() {
        boolean z = false;
        boolean z2 = true;
        if (this.mAttachedToWindow) {
            MediaRouter.RouteInfo selectedRoute = this.mRouter.getSelectedRoute();
            boolean z3 = !selectedRoute.isDefaultOrBluetooth() && selectedRoute.matchesSelector(this.mSelector);
            boolean z4 = z3 && selectedRoute.isConnecting();
            if (this.mRemoteActive != z3) {
                this.mRemoteActive = z3;
                z = true;
            }
            if (this.mIsConnecting != z4) {
                this.mIsConnecting = z4;
            } else {
                z2 = z;
            }
            if (!z2) {
                return;
            }
            refreshDrawableState();
            if (!(this.mRemoteIndicator.getCurrent() instanceof AnimationDrawable)) {
                return;
            }
            AnimationDrawable animationDrawable = (AnimationDrawable) this.mRemoteIndicator.getCurrent();
            if (animationDrawable.isRunning()) {
                return;
            }
            animationDrawable.start();
        }
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.mRemoteIndicator != null) {
            this.mRemoteIndicator.setState(getDrawableState());
            invalidate();
        }
    }

    @NonNull
    public MediaRouteDialogFactory getDialogFactory() {
        return this.mDialogFactory;
    }

    @NonNull
    public MediaRouteSelector getRouteSelector() {
        return this.mSelector;
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        if (getBackground() != null) {
            DrawableCompat.jumpToCurrentState(getBackground());
        }
        if (this.mRemoteIndicator != null) {
            DrawableCompat.jumpToCurrentState(this.mRemoteIndicator);
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mAttachedToWindow = true;
        if (!this.mSelector.isEmpty()) {
            this.mRouter.addCallback(this.mSelector, this.mCallback);
        }
        refreshRoute();
    }

    @Override // android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.mIsConnecting) {
            mergeDrawableStates(onCreateDrawableState, CHECKABLE_STATE_SET);
        } else if (this.mRemoteActive) {
            mergeDrawableStates(onCreateDrawableState, CHECKED_STATE_SET);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        this.mAttachedToWindow = false;
        if (!this.mSelector.isEmpty()) {
            this.mRouter.removeCallback(this.mCallback);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.mRemoteIndicator != null) {
            int paddingLeft = getPaddingLeft();
            int width = getWidth() - getPaddingRight();
            int paddingTop = getPaddingTop();
            int height = getHeight() - getPaddingBottom();
            int intrinsicWidth = this.mRemoteIndicator.getIntrinsicWidth();
            int intrinsicHeight = this.mRemoteIndicator.getIntrinsicHeight();
            int i = paddingLeft + (((width - paddingLeft) - intrinsicWidth) / 2);
            int i2 = (((height - paddingTop) - intrinsicHeight) / 2) + paddingTop;
            this.mRemoteIndicator.setBounds(i, i2, i + intrinsicWidth, i2 + intrinsicHeight);
            this.mRemoteIndicator.draw(canvas);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int min;
        int i3 = 0;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int max = Math.max(this.mMinWidth, this.mRemoteIndicator != null ? this.mRemoteIndicator.getIntrinsicWidth() + getPaddingLeft() + getPaddingRight() : 0);
        int i4 = this.mMinHeight;
        if (this.mRemoteIndicator != null) {
            i3 = this.mRemoteIndicator.getIntrinsicHeight() + getPaddingTop() + getPaddingBottom();
        }
        int max2 = Math.max(i4, i3);
        switch (mode) {
            case Integer.MIN_VALUE:
                min = Math.min(size, max);
                break;
            case 1073741824:
                min = size;
                break;
            default:
                min = max;
                break;
        }
        switch (mode2) {
            case Integer.MIN_VALUE:
                max2 = Math.min(size2, max2);
                break;
            case 1073741824:
                max2 = size2;
                break;
        }
        setMeasuredDimension(min, max2);
    }

    @Override // android.view.View
    public boolean performClick() {
        boolean performClick = super.performClick();
        if (!performClick) {
            playSoundEffect(0);
        }
        return showDialog() || performClick;
    }

    @Override // android.view.View
    public boolean performLongClick() {
        if (super.performLongClick()) {
            return true;
        }
        if (!this.mCheatSheetEnabled) {
            return false;
        }
        CharSequence contentDescription = getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            return false;
        }
        int[] iArr = new int[2];
        Rect rect = new Rect();
        getLocationOnScreen(iArr);
        getWindowVisibleDisplayFrame(rect);
        Context context = getContext();
        int width = getWidth();
        int height = getHeight();
        int i = iArr[1] + (height / 2);
        int i2 = context.getResources().getDisplayMetrics().widthPixels;
        Toast makeText = Toast.makeText(context, contentDescription, 0);
        if (i < rect.height()) {
            makeText.setGravity(8388661, (i2 - iArr[0]) - (width / 2), height);
        } else {
            makeText.setGravity(81, 0, height);
        }
        makeText.show();
        performHapticFeedback(0);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setCheatSheetEnabled(boolean z) {
        this.mCheatSheetEnabled = z;
    }

    public void setDialogFactory(@NonNull MediaRouteDialogFactory mediaRouteDialogFactory) {
        if (mediaRouteDialogFactory == null) {
            throw new IllegalArgumentException("factory must not be null");
        }
        this.mDialogFactory = mediaRouteDialogFactory;
    }

    public void setRemoteIndicatorDrawable(Drawable drawable) {
        if (this.mRemoteIndicator != null) {
            this.mRemoteIndicator.setCallback(null);
            unscheduleDrawable(this.mRemoteIndicator);
        }
        this.mRemoteIndicator = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            drawable.setState(getDrawableState());
            drawable.setVisible(getVisibility() == 0, false);
        }
        refreshDrawableState();
    }

    public void setRouteSelector(MediaRouteSelector mediaRouteSelector) {
        if (mediaRouteSelector == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.mSelector.equals(mediaRouteSelector)) {
            return;
        }
        if (this.mAttachedToWindow) {
            if (!this.mSelector.isEmpty()) {
                this.mRouter.removeCallback(this.mCallback);
            }
            if (!mediaRouteSelector.isEmpty()) {
                this.mRouter.addCallback(mediaRouteSelector, this.mCallback);
            }
        }
        this.mSelector = mediaRouteSelector;
        refreshRoute();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (this.mRemoteIndicator != null) {
            this.mRemoteIndicator.setVisible(getVisibility() == 0, false);
        }
    }

    public boolean showDialog() {
        if (!this.mAttachedToWindow) {
            return false;
        }
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager == null) {
            throw new IllegalStateException("The activity must be a subclass of FragmentActivity");
        }
        MediaRouter.RouteInfo selectedRoute = this.mRouter.getSelectedRoute();
        if (selectedRoute.isDefaultOrBluetooth() || !selectedRoute.matchesSelector(this.mSelector)) {
            if (fragmentManager.findFragmentByTag(CHOOSER_FRAGMENT_TAG) != null) {
                Log.w(TAG, "showDialog(): Route chooser dialog already showing!");
                return false;
            }
            MediaRouteChooserDialogFragment onCreateChooserDialogFragment = this.mDialogFactory.onCreateChooserDialogFragment();
            onCreateChooserDialogFragment.setRouteSelector(this.mSelector);
            onCreateChooserDialogFragment.show(fragmentManager, CHOOSER_FRAGMENT_TAG);
        } else if (fragmentManager.findFragmentByTag(CONTROLLER_FRAGMENT_TAG) != null) {
            Log.w(TAG, "showDialog(): Route controller dialog already showing!");
            return false;
        } else {
            this.mDialogFactory.onCreateControllerDialogFragment().show(fragmentManager, CONTROLLER_FRAGMENT_TAG);
        }
        return true;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mRemoteIndicator;
    }
}
