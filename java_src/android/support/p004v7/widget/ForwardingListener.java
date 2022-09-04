package android.support.p004v7.widget;

import android.os.SystemClock;
import android.support.p001v4.view.MotionEventCompat;
import android.support.p004v7.view.menu.ShowableListMenu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
/* renamed from: android.support.v7.widget.ForwardingListener */
/* loaded from: classes.dex */
public abstract class ForwardingListener implements View.OnTouchListener {
    private int mActivePointerId;
    private Runnable mDisallowIntercept;
    private boolean mForwarding;
    private final float mScaledTouchSlop;
    private final View mSrc;
    private Runnable mTriggerLongPress;
    private final int[] mTmpLocation = new int[2];
    private final int mTapTimeout = ViewConfiguration.getTapTimeout();
    private final int mLongPressTimeout = (this.mTapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.ForwardingListener$DisallowIntercept */
    /* loaded from: classes.dex */
    public class DisallowIntercept implements Runnable {
        private DisallowIntercept() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForwardingListener.this.mSrc.getParent().requestDisallowInterceptTouchEvent(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.ForwardingListener$TriggerLongPress */
    /* loaded from: classes.dex */
    public class TriggerLongPress implements Runnable {
        private TriggerLongPress() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForwardingListener.this.onLongPress();
        }
    }

    public ForwardingListener(View view) {
        this.mSrc = view;
        this.mScaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
    }

    private void clearCallbacks() {
        if (this.mTriggerLongPress != null) {
            this.mSrc.removeCallbacks(this.mTriggerLongPress);
        }
        if (this.mDisallowIntercept != null) {
            this.mSrc.removeCallbacks(this.mDisallowIntercept);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onLongPress() {
        clearCallbacks();
        View view = this.mSrc;
        if (!view.isEnabled() || view.isLongClickable() || !onForwardingStarted()) {
            return;
        }
        view.getParent().requestDisallowInterceptTouchEvent(true);
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        view.onTouchEvent(obtain);
        obtain.recycle();
        this.mForwarding = true;
    }

    private boolean onTouchForwarded(MotionEvent motionEvent) {
        DropDownListView dropDownListView;
        View view = this.mSrc;
        ShowableListMenu mo40037getPopup = mo40037getPopup();
        if (mo40037getPopup == null || !mo40037getPopup.isShowing() || (dropDownListView = (DropDownListView) mo40037getPopup.getListView()) == null || !dropDownListView.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        toGlobalMotionEvent(view, obtainNoHistory);
        toLocalMotionEvent(dropDownListView, obtainNoHistory);
        boolean onForwardedEvent = dropDownListView.onForwardedEvent(obtainNoHistory, this.mActivePointerId);
        obtainNoHistory.recycle();
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        return onForwardedEvent && (actionMasked != 1 && actionMasked != 3);
    }

    private boolean onTouchObserved(MotionEvent motionEvent) {
        View view = this.mSrc;
        if (!view.isEnabled()) {
            return false;
        }
        switch (MotionEventCompat.getActionMasked(motionEvent)) {
            case 0:
                this.mActivePointerId = motionEvent.getPointerId(0);
                if (this.mDisallowIntercept == null) {
                    this.mDisallowIntercept = new DisallowIntercept();
                }
                view.postDelayed(this.mDisallowIntercept, this.mTapTimeout);
                if (this.mTriggerLongPress == null) {
                    this.mTriggerLongPress = new TriggerLongPress();
                }
                view.postDelayed(this.mTriggerLongPress, this.mLongPressTimeout);
                return false;
            case 1:
            case 3:
                clearCallbacks();
                return false;
            case 2:
                int findPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
                if (findPointerIndex < 0 || pointInView(view, motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex), this.mScaledTouchSlop)) {
                    return false;
                }
                clearCallbacks();
                view.getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            default:
                return false;
        }
    }

    private static boolean pointInView(View view, float f, float f2, float f3) {
        return f >= (-f3) && f2 >= (-f3) && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    private boolean toGlobalMotionEvent(View view, MotionEvent motionEvent) {
        int[] iArr = this.mTmpLocation;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(iArr[0], iArr[1]);
        return true;
    }

    private boolean toLocalMotionEvent(View view, MotionEvent motionEvent) {
        int[] iArr = this.mTmpLocation;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(-iArr[0], -iArr[1]);
        return true;
    }

    /* renamed from: getPopup */
    public abstract ShowableListMenu mo40037getPopup();

    protected boolean onForwardingStarted() {
        ShowableListMenu mo40037getPopup = mo40037getPopup();
        if (mo40037getPopup == null || mo40037getPopup.isShowing()) {
            return true;
        }
        mo40037getPopup.show();
        return true;
    }

    protected boolean onForwardingStopped() {
        ShowableListMenu mo40037getPopup = mo40037getPopup();
        if (mo40037getPopup == null || !mo40037getPopup.isShowing()) {
            return true;
        }
        mo40037getPopup.dismiss();
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.mForwarding;
        if (z2) {
            z = onTouchForwarded(motionEvent) || !onForwardingStopped();
        } else {
            boolean z3 = onTouchObserved(motionEvent) && onForwardingStarted();
            if (z3) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.mSrc.onTouchEvent(obtain);
                obtain.recycle();
            }
            z = z3;
        }
        this.mForwarding = z;
        return z || z2;
    }
}
