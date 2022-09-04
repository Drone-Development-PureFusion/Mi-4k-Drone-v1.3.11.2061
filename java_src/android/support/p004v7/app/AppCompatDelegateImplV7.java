package android.support.p004v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.p001v4.app.NavUtils;
import android.support.p001v4.p003os.ParcelableCompat;
import android.support.p001v4.p003os.ParcelableCompatCreatorCallbacks;
import android.support.p001v4.view.ViewCompat;
import android.support.p001v4.view.ViewConfigurationCompat;
import android.support.p001v4.view.ViewPropertyAnimatorCompat;
import android.support.p004v7.appcompat.C0176R;
import android.support.p004v7.view.ActionMode;
import android.support.p004v7.view.ContextThemeWrapper;
import android.support.p004v7.view.StandaloneActionMode;
import android.support.p004v7.view.menu.ListMenuPresenter;
import android.support.p004v7.view.menu.MenuBuilder;
import android.support.p004v7.view.menu.MenuPresenter;
import android.support.p004v7.view.menu.MenuView;
import android.support.p004v7.widget.ActionBarContextView;
import android.support.p004v7.widget.AppCompatDrawableManager;
import android.support.p004v7.widget.ContentFrameLayout;
import android.support.p004v7.widget.DecorContentParent;
import android.support.p004v7.widget.FitWindowsViewGroup;
import android.support.p004v7.widget.Toolbar;
import android.support.p004v7.widget.VectorEnabledTintResources;
import android.support.p004v7.widget.ViewStubCompat;
import android.support.p004v7.widget.ViewUtils;
import android.support.v4.view.LayoutInflaterCompat;
import android.support.v4.view.LayoutInflaterFactory;
import android.support.v4.view.OnApplyWindowInsetsListener;
import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;
import android.support.v4.view.WindowInsetsCompat;
import android.support.v4.widget.PopupWindowCompat;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.app.AppCompatDelegateImplV7 */
/* loaded from: classes.dex */
public class AppCompatDelegateImplV7 extends AppCompatDelegateImplBase implements LayoutInflaterFactory, MenuBuilder.Callback {
    private ActionMenuPresenterCallback mActionMenuPresenterCallback;
    ActionMode mActionMode;
    PopupWindow mActionModePopup;
    ActionBarContextView mActionModeView;
    private AppCompatViewInflater mAppCompatViewInflater;
    private boolean mClosingActionMenu;
    private DecorContentParent mDecorContentParent;
    private boolean mEnableDefaultActionBarUp;
    private boolean mFeatureIndeterminateProgress;
    private boolean mFeatureProgress;
    private int mInvalidatePanelMenuFeatures;
    private boolean mInvalidatePanelMenuPosted;
    private boolean mLongPressBackDown;
    private PanelMenuPresenterCallback mPanelMenuPresenterCallback;
    private PanelFeatureState[] mPanels;
    private PanelFeatureState mPreparedPanel;
    Runnable mShowActionModePopup;
    private View mStatusGuard;
    private ViewGroup mSubDecor;
    private boolean mSubDecorInstalled;
    private Rect mTempRect1;
    private Rect mTempRect2;
    private TextView mTitleView;
    ViewPropertyAnimatorCompat mFadeAnim = null;
    private final Runnable mInvalidatePanelMenuRunnable = new Runnable() { // from class: android.support.v7.app.AppCompatDelegateImplV7.1
        @Override // java.lang.Runnable
        public void run() {
            if ((AppCompatDelegateImplV7.this.mInvalidatePanelMenuFeatures & 1) != 0) {
                AppCompatDelegateImplV7.this.doInvalidatePanelMenu(0);
            }
            if ((AppCompatDelegateImplV7.this.mInvalidatePanelMenuFeatures & 4096) != 0) {
                AppCompatDelegateImplV7.this.doInvalidatePanelMenu(108);
            }
            AppCompatDelegateImplV7.this.mInvalidatePanelMenuPosted = false;
            AppCompatDelegateImplV7.this.mInvalidatePanelMenuFeatures = 0;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.app.AppCompatDelegateImplV7$ActionMenuPresenterCallback */
    /* loaded from: classes.dex */
    public final class ActionMenuPresenterCallback implements MenuPresenter.Callback {
        private ActionMenuPresenterCallback() {
        }

        @Override // android.support.p004v7.view.menu.MenuPresenter.Callback
        public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
            AppCompatDelegateImplV7.this.checkCloseActionMenu(menuBuilder);
        }

        @Override // android.support.p004v7.view.menu.MenuPresenter.Callback
        public boolean onOpenSubMenu(MenuBuilder menuBuilder) {
            Window.Callback windowCallback = AppCompatDelegateImplV7.this.getWindowCallback();
            if (windowCallback != null) {
                windowCallback.onMenuOpened(108, menuBuilder);
                return true;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v7.app.AppCompatDelegateImplV7$ActionModeCallbackWrapperV7 */
    /* loaded from: classes.dex */
    public class ActionModeCallbackWrapperV7 implements ActionMode.Callback {
        private ActionMode.Callback mWrapped;

        public ActionModeCallbackWrapperV7(ActionMode.Callback callback) {
            this.mWrapped = callback;
        }

        @Override // android.support.p004v7.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.mWrapped.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.support.p004v7.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.mWrapped.onCreateActionMode(actionMode, menu);
        }

        @Override // android.support.p004v7.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.mWrapped.onDestroyActionMode(actionMode);
            if (AppCompatDelegateImplV7.this.mActionModePopup != null) {
                AppCompatDelegateImplV7.this.mWindow.getDecorView().removeCallbacks(AppCompatDelegateImplV7.this.mShowActionModePopup);
            }
            if (AppCompatDelegateImplV7.this.mActionModeView != null) {
                AppCompatDelegateImplV7.this.endOnGoingFadeAnimation();
                AppCompatDelegateImplV7.this.mFadeAnim = ViewCompat.animate(AppCompatDelegateImplV7.this.mActionModeView).alpha(0.0f);
                AppCompatDelegateImplV7.this.mFadeAnim.setListener(new ViewPropertyAnimatorListenerAdapter() { // from class: android.support.v7.app.AppCompatDelegateImplV7.ActionModeCallbackWrapperV7.1
                    public void onAnimationEnd(View view) {
                        AppCompatDelegateImplV7.this.mActionModeView.setVisibility(8);
                        if (AppCompatDelegateImplV7.this.mActionModePopup != null) {
                            AppCompatDelegateImplV7.this.mActionModePopup.dismiss();
                        } else if (AppCompatDelegateImplV7.this.mActionModeView.getParent() instanceof View) {
                            ViewCompat.requestApplyInsets((View) AppCompatDelegateImplV7.this.mActionModeView.getParent());
                        }
                        AppCompatDelegateImplV7.this.mActionModeView.removeAllViews();
                        AppCompatDelegateImplV7.this.mFadeAnim.setListener(null);
                        AppCompatDelegateImplV7.this.mFadeAnim = null;
                    }
                });
            }
            if (AppCompatDelegateImplV7.this.mAppCompatCallback != null) {
                AppCompatDelegateImplV7.this.mAppCompatCallback.onSupportActionModeFinished(AppCompatDelegateImplV7.this.mActionMode);
            }
            AppCompatDelegateImplV7.this.mActionMode = null;
        }

        @Override // android.support.p004v7.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return this.mWrapped.onPrepareActionMode(actionMode, menu);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.app.AppCompatDelegateImplV7$ListMenuDecorView */
    /* loaded from: classes.dex */
    public class ListMenuDecorView extends ContentFrameLayout {
        public ListMenuDecorView(Context context) {
            super(context);
        }

        private boolean isOutOfBounds(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImplV7.this.dispatchKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !isOutOfBounds((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            AppCompatDelegateImplV7.this.closePanel(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(AppCompatDrawableManager.get().getDrawable(getContext(), i));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: android.support.v7.app.AppCompatDelegateImplV7$PanelFeatureState */
    /* loaded from: classes.dex */
    public static final class PanelFeatureState {
        int background;
        View createdPanelView;
        ViewGroup decorView;
        int featureId;
        Bundle frozenActionViewState;
        Bundle frozenMenuState;
        int gravity;
        boolean isHandled;
        boolean isOpen;
        boolean isPrepared;
        ListMenuPresenter listMenuPresenter;
        Context listPresenterContext;
        MenuBuilder menu;
        public boolean qwertyMode;
        boolean refreshDecorView = false;
        boolean refreshMenuContent;
        View shownPanelView;
        boolean wasLastOpen;
        int windowAnimations;

        /* renamed from: x */
        int f124x;

        /* renamed from: y */
        int f125y;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: android.support.v7.app.AppCompatDelegateImplV7$PanelFeatureState$SavedState */
        /* loaded from: classes.dex */
        public static class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = ParcelableCompat.newCreator(new ParcelableCompatCreatorCallbacks<SavedState>() { // from class: android.support.v7.app.AppCompatDelegateImplV7.PanelFeatureState.SavedState.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.support.p001v4.p003os.ParcelableCompatCreatorCallbacks
                /* renamed from: createFromParcel */
                public SavedState mo40043createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.readFromParcel(parcel, classLoader);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.support.p001v4.p003os.ParcelableCompatCreatorCallbacks
                /* renamed from: newArray */
                public SavedState[] mo40044newArray(int i) {
                    return new SavedState[i];
                }
            });
            int featureId;
            boolean isOpen;
            Bundle menuState;

            private SavedState() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static SavedState readFromParcel(Parcel parcel, ClassLoader classLoader) {
                boolean z = true;
                SavedState savedState = new SavedState();
                savedState.featureId = parcel.readInt();
                if (parcel.readInt() != 1) {
                    z = false;
                }
                savedState.isOpen = z;
                if (savedState.isOpen) {
                    savedState.menuState = parcel.readBundle(classLoader);
                }
                return savedState;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.featureId);
                parcel.writeInt(this.isOpen ? 1 : 0);
                if (this.isOpen) {
                    parcel.writeBundle(this.menuState);
                }
            }
        }

        PanelFeatureState(int i) {
            this.featureId = i;
        }

        void applyFrozenState() {
            if (this.menu == null || this.frozenMenuState == null) {
                return;
            }
            this.menu.restorePresenterStates(this.frozenMenuState);
            this.frozenMenuState = null;
        }

        public void clearMenuPresenters() {
            if (this.menu != null) {
                this.menu.removeMenuPresenter(this.listMenuPresenter);
            }
            this.listMenuPresenter = null;
        }

        MenuView getListMenuView(MenuPresenter.Callback callback) {
            if (this.menu == null) {
                return null;
            }
            if (this.listMenuPresenter == null) {
                this.listMenuPresenter = new ListMenuPresenter(this.listPresenterContext, C0176R.layout.abc_list_menu_item_layout);
                this.listMenuPresenter.setCallback(callback);
                this.menu.addMenuPresenter(this.listMenuPresenter);
            }
            return this.listMenuPresenter.getMenuView(this.decorView);
        }

        public boolean hasPanelItems() {
            if (this.shownPanelView == null) {
                return false;
            }
            return this.createdPanelView != null || this.listMenuPresenter.getAdapter().getCount() > 0;
        }

        void onRestoreInstanceState(Parcelable parcelable) {
            SavedState savedState = (SavedState) parcelable;
            this.featureId = savedState.featureId;
            this.wasLastOpen = savedState.isOpen;
            this.frozenMenuState = savedState.menuState;
            this.shownPanelView = null;
            this.decorView = null;
        }

        Parcelable onSaveInstanceState() {
            SavedState savedState = new SavedState();
            savedState.featureId = this.featureId;
            savedState.isOpen = this.isOpen;
            if (this.menu != null) {
                savedState.menuState = new Bundle();
                this.menu.savePresenterStates(savedState.menuState);
            }
            return savedState;
        }

        void setMenu(MenuBuilder menuBuilder) {
            if (menuBuilder == this.menu) {
                return;
            }
            if (this.menu != null) {
                this.menu.removeMenuPresenter(this.listMenuPresenter);
            }
            this.menu = menuBuilder;
            if (menuBuilder == null || this.listMenuPresenter == null) {
                return;
            }
            menuBuilder.addMenuPresenter(this.listMenuPresenter);
        }

        void setStyle(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(C0176R.attr.actionBarPopupTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                newTheme.applyStyle(typedValue.resourceId, true);
            }
            newTheme.resolveAttribute(C0176R.attr.panelMenuListTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                newTheme.applyStyle(typedValue.resourceId, true);
            } else {
                newTheme.applyStyle(C0176R.style.Theme_AppCompat_CompactMenu, true);
            }
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, 0);
            contextThemeWrapper.getTheme().setTo(newTheme);
            this.listPresenterContext = contextThemeWrapper;
            TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(C0176R.styleable.AppCompatTheme);
            this.background = obtainStyledAttributes.getResourceId(C0176R.styleable.AppCompatTheme_panelBackground, 0);
            this.windowAnimations = obtainStyledAttributes.getResourceId(C0176R.styleable.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.app.AppCompatDelegateImplV7$PanelMenuPresenterCallback */
    /* loaded from: classes.dex */
    public final class PanelMenuPresenterCallback implements MenuPresenter.Callback {
        private PanelMenuPresenterCallback() {
        }

        @Override // android.support.p004v7.view.menu.MenuPresenter.Callback
        public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
            MenuBuilder rootMenu = menuBuilder.getRootMenu();
            boolean z2 = rootMenu != menuBuilder;
            AppCompatDelegateImplV7 appCompatDelegateImplV7 = AppCompatDelegateImplV7.this;
            if (z2) {
                menuBuilder = rootMenu;
            }
            PanelFeatureState findMenuPanel = appCompatDelegateImplV7.findMenuPanel(menuBuilder);
            if (findMenuPanel != null) {
                if (!z2) {
                    AppCompatDelegateImplV7.this.closePanel(findMenuPanel, z);
                    return;
                }
                AppCompatDelegateImplV7.this.callOnPanelClosed(findMenuPanel.featureId, findMenuPanel, rootMenu);
                AppCompatDelegateImplV7.this.closePanel(findMenuPanel, true);
            }
        }

        @Override // android.support.p004v7.view.menu.MenuPresenter.Callback
        public boolean onOpenSubMenu(MenuBuilder menuBuilder) {
            Window.Callback windowCallback;
            if (menuBuilder != null || !AppCompatDelegateImplV7.this.mHasActionBar || (windowCallback = AppCompatDelegateImplV7.this.getWindowCallback()) == null || AppCompatDelegateImplV7.this.isDestroyed()) {
                return true;
            }
            windowCallback.onMenuOpened(108, menuBuilder);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppCompatDelegateImplV7(Context context, Window window, AppCompatCallback appCompatCallback) {
        super(context, window, appCompatCallback);
    }

    private void applyFixedSizeWindow() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.mSubDecor.findViewById(16908290);
        View decorView = this.mWindow.getDecorView();
        contentFrameLayout.setDecorPadding(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.mContext.obtainStyledAttributes(C0176R.styleable.AppCompatTheme);
        obtainStyledAttributes.getValue(C0176R.styleable.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(C0176R.styleable.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(C0176R.styleable.AppCompatTheme_windowFixedWidthMajor)) {
            obtainStyledAttributes.getValue(C0176R.styleable.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(C0176R.styleable.AppCompatTheme_windowFixedWidthMinor)) {
            obtainStyledAttributes.getValue(C0176R.styleable.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(C0176R.styleable.AppCompatTheme_windowFixedHeightMajor)) {
            obtainStyledAttributes.getValue(C0176R.styleable.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(C0176R.styleable.AppCompatTheme_windowFixedHeightMinor)) {
            obtainStyledAttributes.getValue(C0176R.styleable.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callOnPanelClosed(int i, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null) {
            if (panelFeatureState == null && i >= 0 && i < this.mPanels.length) {
                panelFeatureState = this.mPanels[i];
            }
            if (panelFeatureState != null) {
                menu = panelFeatureState.menu;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.isOpen) && !isDestroyed()) {
            this.mOriginalWindowCallback.onPanelClosed(i, menu);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkCloseActionMenu(MenuBuilder menuBuilder) {
        if (this.mClosingActionMenu) {
            return;
        }
        this.mClosingActionMenu = true;
        this.mDecorContentParent.dismissPopups();
        Window.Callback windowCallback = getWindowCallback();
        if (windowCallback != null && !isDestroyed()) {
            windowCallback.onPanelClosed(108, menuBuilder);
        }
        this.mClosingActionMenu = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closePanel(int i) {
        closePanel(getPanelState(i, true), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closePanel(PanelFeatureState panelFeatureState, boolean z) {
        if (z && panelFeatureState.featureId == 0 && this.mDecorContentParent != null && this.mDecorContentParent.isOverflowMenuShowing()) {
            checkCloseActionMenu(panelFeatureState.menu);
            return;
        }
        WindowManager windowManager = (WindowManager) this.mContext.getSystemService("window");
        if (windowManager != null && panelFeatureState.isOpen && panelFeatureState.decorView != null) {
            windowManager.removeView(panelFeatureState.decorView);
            if (z) {
                callOnPanelClosed(panelFeatureState.featureId, panelFeatureState, null);
            }
        }
        panelFeatureState.isPrepared = false;
        panelFeatureState.isHandled = false;
        panelFeatureState.isOpen = false;
        panelFeatureState.shownPanelView = null;
        panelFeatureState.refreshDecorView = true;
        if (this.mPreparedPanel != panelFeatureState) {
            return;
        }
        this.mPreparedPanel = null;
    }

    private ViewGroup createSubDecor() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.mContext.obtainStyledAttributes(C0176R.styleable.AppCompatTheme);
        if (!obtainStyledAttributes.hasValue(C0176R.styleable.AppCompatTheme_windowActionBar)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(C0176R.styleable.AppCompatTheme_windowNoTitle, false)) {
            requestWindowFeature(1);
        } else if (obtainStyledAttributes.getBoolean(C0176R.styleable.AppCompatTheme_windowActionBar, false)) {
            requestWindowFeature(108);
        }
        if (obtainStyledAttributes.getBoolean(C0176R.styleable.AppCompatTheme_windowActionBarOverlay, false)) {
            requestWindowFeature(109);
        }
        if (obtainStyledAttributes.getBoolean(C0176R.styleable.AppCompatTheme_windowActionModeOverlay, false)) {
            requestWindowFeature(10);
        }
        this.mIsFloating = obtainStyledAttributes.getBoolean(C0176R.styleable.AppCompatTheme_android_windowIsFloating, false);
        obtainStyledAttributes.recycle();
        this.mWindow.getDecorView();
        LayoutInflater from = LayoutInflater.from(this.mContext);
        if (this.mWindowNoTitle) {
            ViewGroup viewGroup2 = this.mOverlayActionMode ? (ViewGroup) from.inflate(C0176R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(C0176R.layout.abc_screen_simple, (ViewGroup) null);
            if (Build.VERSION.SDK_INT >= 21) {
                ViewCompat.setOnApplyWindowInsetsListener(viewGroup2, new OnApplyWindowInsetsListener() { // from class: android.support.v7.app.AppCompatDelegateImplV7.2
                    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                        int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
                        int updateStatusGuard = AppCompatDelegateImplV7.this.updateStatusGuard(systemWindowInsetTop);
                        if (systemWindowInsetTop != updateStatusGuard) {
                            windowInsetsCompat = windowInsetsCompat.replaceSystemWindowInsets(windowInsetsCompat.getSystemWindowInsetLeft(), updateStatusGuard, windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom());
                        }
                        return ViewCompat.onApplyWindowInsets(view, windowInsetsCompat);
                    }
                });
                viewGroup = viewGroup2;
            } else {
                ((FitWindowsViewGroup) viewGroup2).setOnFitSystemWindowsListener(new FitWindowsViewGroup.OnFitSystemWindowsListener() { // from class: android.support.v7.app.AppCompatDelegateImplV7.3
                    @Override // android.support.p004v7.widget.FitWindowsViewGroup.OnFitSystemWindowsListener
                    public void onFitSystemWindows(Rect rect) {
                        rect.top = AppCompatDelegateImplV7.this.updateStatusGuard(rect.top);
                    }
                });
                viewGroup = viewGroup2;
            }
        } else if (this.mIsFloating) {
            this.mOverlayActionBar = false;
            this.mHasActionBar = false;
            viewGroup = (ViewGroup) from.inflate(C0176R.layout.abc_dialog_title_material, (ViewGroup) null);
        } else if (this.mHasActionBar) {
            TypedValue typedValue = new TypedValue();
            this.mContext.getTheme().resolveAttribute(C0176R.attr.actionBarTheme, typedValue, true);
            ViewGroup viewGroup3 = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new ContextThemeWrapper(this.mContext, typedValue.resourceId) : this.mContext).inflate(C0176R.layout.abc_screen_toolbar, (ViewGroup) null);
            this.mDecorContentParent = (DecorContentParent) viewGroup3.findViewById(C0176R.C0178id.decor_content_parent);
            this.mDecorContentParent.setWindowCallback(getWindowCallback());
            if (this.mOverlayActionBar) {
                this.mDecorContentParent.initFeature(109);
            }
            if (this.mFeatureProgress) {
                this.mDecorContentParent.initFeature(2);
            }
            if (this.mFeatureIndeterminateProgress) {
                this.mDecorContentParent.initFeature(5);
            }
            viewGroup = viewGroup3;
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.mHasActionBar + ", windowActionBarOverlay: " + this.mOverlayActionBar + ", android:windowIsFloating: " + this.mIsFloating + ", windowActionModeOverlay: " + this.mOverlayActionMode + ", windowNoTitle: " + this.mWindowNoTitle + " }");
        }
        if (this.mDecorContentParent == null) {
            this.mTitleView = (TextView) viewGroup.findViewById(C0176R.C0178id.title);
        }
        ViewUtils.makeOptionalFitsSystemWindows(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C0176R.C0178id.action_bar_activity_content);
        ViewGroup viewGroup4 = (ViewGroup) this.mWindow.findViewById(16908290);
        if (viewGroup4 != null) {
            while (viewGroup4.getChildCount() > 0) {
                View childAt = viewGroup4.getChildAt(0);
                viewGroup4.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup4.setId(-1);
            contentFrameLayout.setId(16908290);
            if (viewGroup4 instanceof FrameLayout) {
                ((FrameLayout) viewGroup4).setForeground(null);
            }
        }
        this.mWindow.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new ContentFrameLayout.OnAttachListener() { // from class: android.support.v7.app.AppCompatDelegateImplV7.4
            @Override // android.support.p004v7.widget.ContentFrameLayout.OnAttachListener
            public void onAttachedFromWindow() {
            }

            @Override // android.support.p004v7.widget.ContentFrameLayout.OnAttachListener
            public void onDetachedFromWindow() {
                AppCompatDelegateImplV7.this.dismissPopups();
            }
        });
        return viewGroup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dismissPopups() {
        if (this.mDecorContentParent != null) {
            this.mDecorContentParent.dismissPopups();
        }
        if (this.mActionModePopup != null) {
            this.mWindow.getDecorView().removeCallbacks(this.mShowActionModePopup);
            if (this.mActionModePopup.isShowing()) {
                try {
                    this.mActionModePopup.dismiss();
                } catch (IllegalArgumentException e) {
                }
            }
            this.mActionModePopup = null;
        }
        endOnGoingFadeAnimation();
        PanelFeatureState panelState = getPanelState(0, false);
        if (panelState == null || panelState.menu == null) {
            return;
        }
        panelState.menu.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doInvalidatePanelMenu(int i) {
        PanelFeatureState panelState;
        PanelFeatureState panelState2 = getPanelState(i, true);
        if (panelState2.menu != null) {
            Bundle bundle = new Bundle();
            panelState2.menu.saveActionViewStates(bundle);
            if (bundle.size() > 0) {
                panelState2.frozenActionViewState = bundle;
            }
            panelState2.menu.stopDispatchingItemsChanged();
            panelState2.menu.clear();
        }
        panelState2.refreshMenuContent = true;
        panelState2.refreshDecorView = true;
        if ((i != 108 && i != 0) || this.mDecorContentParent == null || (panelState = getPanelState(0, false)) == null) {
            return;
        }
        panelState.isPrepared = false;
        preparePanel(panelState, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void endOnGoingFadeAnimation() {
        if (this.mFadeAnim != null) {
            this.mFadeAnim.cancel();
        }
    }

    private void ensureSubDecor() {
        if (!this.mSubDecorInstalled) {
            this.mSubDecor = createSubDecor();
            CharSequence title = getTitle();
            if (!TextUtils.isEmpty(title)) {
                onTitleChanged(title);
            }
            applyFixedSizeWindow();
            onSubDecorInstalled(this.mSubDecor);
            this.mSubDecorInstalled = true;
            PanelFeatureState panelState = getPanelState(0, false);
            if (isDestroyed()) {
                return;
            }
            if (panelState != null && panelState.menu != null) {
                return;
            }
            invalidatePanelMenu(108);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public PanelFeatureState findMenuPanel(Menu menu) {
        PanelFeatureState[] panelFeatureStateArr = this.mPanels;
        int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
        for (int i = 0; i < length; i++) {
            PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
            if (panelFeatureState != null && panelFeatureState.menu == menu) {
                return panelFeatureState;
            }
        }
        return null;
    }

    private boolean initializePanelContent(PanelFeatureState panelFeatureState) {
        if (panelFeatureState.createdPanelView != null) {
            panelFeatureState.shownPanelView = panelFeatureState.createdPanelView;
            return true;
        } else if (panelFeatureState.menu == null) {
            return false;
        } else {
            if (this.mPanelMenuPresenterCallback == null) {
                this.mPanelMenuPresenterCallback = new PanelMenuPresenterCallback();
            }
            panelFeatureState.shownPanelView = (View) panelFeatureState.getListMenuView(this.mPanelMenuPresenterCallback);
            return panelFeatureState.shownPanelView != null;
        }
    }

    private boolean initializePanelDecor(PanelFeatureState panelFeatureState) {
        panelFeatureState.setStyle(getActionBarThemedContext());
        panelFeatureState.decorView = new ListMenuDecorView(panelFeatureState.listPresenterContext);
        panelFeatureState.gravity = 81;
        return true;
    }

    private boolean initializePanelMenu(PanelFeatureState panelFeatureState) {
        Context contextThemeWrapper;
        Context context = this.mContext;
        if ((panelFeatureState.featureId == 0 || panelFeatureState.featureId == 108) && this.mDecorContentParent != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(C0176R.attr.actionBarTheme, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(C0176R.attr.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(C0176R.attr.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            Resources.Theme theme3 = theme2;
            if (theme3 != null) {
                contextThemeWrapper = new ContextThemeWrapper(context, 0);
                contextThemeWrapper.getTheme().setTo(theme3);
                MenuBuilder menuBuilder = new MenuBuilder(contextThemeWrapper);
                menuBuilder.setCallback(this);
                panelFeatureState.setMenu(menuBuilder);
                return true;
            }
        }
        contextThemeWrapper = context;
        MenuBuilder menuBuilder2 = new MenuBuilder(contextThemeWrapper);
        menuBuilder2.setCallback(this);
        panelFeatureState.setMenu(menuBuilder2);
        return true;
    }

    private void invalidatePanelMenu(int i) {
        this.mInvalidatePanelMenuFeatures |= 1 << i;
        if (!this.mInvalidatePanelMenuPosted) {
            ViewCompat.postOnAnimation(this.mWindow.getDecorView(), this.mInvalidatePanelMenuRunnable);
            this.mInvalidatePanelMenuPosted = true;
        }
    }

    private boolean onKeyDownPanel(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            PanelFeatureState panelState = getPanelState(i, true);
            if (!panelState.isOpen) {
                return preparePanel(panelState, keyEvent);
            }
        }
        return false;
    }

    private boolean onKeyUpPanel(int i, KeyEvent keyEvent) {
        boolean z;
        boolean z2 = true;
        if (this.mActionMode != null) {
            return false;
        }
        PanelFeatureState panelState = getPanelState(i, true);
        if (i != 0 || this.mDecorContentParent == null || !this.mDecorContentParent.canShowOverflowMenu() || ViewConfigurationCompat.hasPermanentMenuKey(ViewConfiguration.get(this.mContext))) {
            if (panelState.isOpen || panelState.isHandled) {
                boolean z3 = panelState.isOpen;
                closePanel(panelState, true);
                z2 = z3;
            } else {
                if (panelState.isPrepared) {
                    if (panelState.refreshMenuContent) {
                        panelState.isPrepared = false;
                        z = preparePanel(panelState, keyEvent);
                    } else {
                        z = true;
                    }
                    if (z) {
                        openPanel(panelState, keyEvent);
                    }
                }
                z2 = false;
            }
        } else if (!this.mDecorContentParent.isOverflowMenuShowing()) {
            if (!isDestroyed() && preparePanel(panelState, keyEvent)) {
                z2 = this.mDecorContentParent.showOverflowMenu();
            }
            z2 = false;
        } else {
            z2 = this.mDecorContentParent.hideOverflowMenu();
        }
        if (z2) {
            AudioManager audioManager = (AudioManager) this.mContext.getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return z2;
    }

    private void openPanel(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        ViewGroup.LayoutParams layoutParams;
        int i = -1;
        if (panelFeatureState.isOpen || isDestroyed()) {
            return;
        }
        if (panelFeatureState.featureId == 0) {
            Context context = this.mContext;
            boolean z = (context.getResources().getConfiguration().screenLayout & 15) == 4;
            boolean z2 = context.getApplicationInfo().targetSdkVersion >= 11;
            if (z && z2) {
                return;
            }
        }
        Window.Callback windowCallback = getWindowCallback();
        if (windowCallback != null && !windowCallback.onMenuOpened(panelFeatureState.featureId, panelFeatureState.menu)) {
            closePanel(panelFeatureState, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.mContext.getSystemService("window");
        if (windowManager == null || !preparePanel(panelFeatureState, keyEvent)) {
            return;
        }
        if (panelFeatureState.decorView == null || panelFeatureState.refreshDecorView) {
            if (panelFeatureState.decorView == null) {
                if (!initializePanelDecor(panelFeatureState) || panelFeatureState.decorView == null) {
                    return;
                }
            } else if (panelFeatureState.refreshDecorView && panelFeatureState.decorView.getChildCount() > 0) {
                panelFeatureState.decorView.removeAllViews();
            }
            if (!initializePanelContent(panelFeatureState) || !panelFeatureState.hasPanelItems()) {
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = panelFeatureState.shownPanelView.getLayoutParams();
            ViewGroup.LayoutParams layoutParams3 = layoutParams2 == null ? new ViewGroup.LayoutParams(-2, -2) : layoutParams2;
            panelFeatureState.decorView.setBackgroundResource(panelFeatureState.background);
            ViewParent parent = panelFeatureState.shownPanelView.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(panelFeatureState.shownPanelView);
            }
            panelFeatureState.decorView.addView(panelFeatureState.shownPanelView, layoutParams3);
            if (!panelFeatureState.shownPanelView.hasFocus()) {
                panelFeatureState.shownPanelView.requestFocus();
            }
            i = -2;
        } else if (panelFeatureState.createdPanelView == null || (layoutParams = panelFeatureState.createdPanelView.getLayoutParams()) == null || layoutParams.width != -1) {
            i = -2;
        }
        panelFeatureState.isHandled = false;
        WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(i, -2, panelFeatureState.f124x, panelFeatureState.f125y, 1002, 8519680, -3);
        layoutParams4.gravity = panelFeatureState.gravity;
        layoutParams4.windowAnimations = panelFeatureState.windowAnimations;
        windowManager.addView(panelFeatureState.decorView, layoutParams4);
        panelFeatureState.isOpen = true;
    }

    private boolean performPanelShortcut(PanelFeatureState panelFeatureState, int i, KeyEvent keyEvent, int i2) {
        boolean z = false;
        if (!keyEvent.isSystem()) {
            if ((panelFeatureState.isPrepared || preparePanel(panelFeatureState, keyEvent)) && panelFeatureState.menu != null) {
                z = panelFeatureState.menu.performShortcut(i, keyEvent, i2);
            }
            if (z && (i2 & 1) == 0 && this.mDecorContentParent == null) {
                closePanel(panelFeatureState, true);
            }
        }
        return z;
    }

    private boolean preparePanel(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        if (isDestroyed()) {
            return false;
        }
        if (panelFeatureState.isPrepared) {
            return true;
        }
        if (this.mPreparedPanel != null && this.mPreparedPanel != panelFeatureState) {
            closePanel(this.mPreparedPanel, false);
        }
        Window.Callback windowCallback = getWindowCallback();
        if (windowCallback != null) {
            panelFeatureState.createdPanelView = windowCallback.onCreatePanelView(panelFeatureState.featureId);
        }
        boolean z = panelFeatureState.featureId == 0 || panelFeatureState.featureId == 108;
        if (z && this.mDecorContentParent != null) {
            this.mDecorContentParent.setMenuPrepared();
        }
        if (panelFeatureState.createdPanelView == null && (!z || !(peekSupportActionBar() instanceof ToolbarActionBar))) {
            if (panelFeatureState.menu == null || panelFeatureState.refreshMenuContent) {
                if (panelFeatureState.menu == null && (!initializePanelMenu(panelFeatureState) || panelFeatureState.menu == null)) {
                    return false;
                }
                if (z && this.mDecorContentParent != null) {
                    if (this.mActionMenuPresenterCallback == null) {
                        this.mActionMenuPresenterCallback = new ActionMenuPresenterCallback();
                    }
                    this.mDecorContentParent.setMenu(panelFeatureState.menu, this.mActionMenuPresenterCallback);
                }
                panelFeatureState.menu.stopDispatchingItemsChanged();
                if (!windowCallback.onCreatePanelMenu(panelFeatureState.featureId, panelFeatureState.menu)) {
                    panelFeatureState.setMenu(null);
                    if (!z || this.mDecorContentParent == null) {
                        return false;
                    }
                    this.mDecorContentParent.setMenu(null, this.mActionMenuPresenterCallback);
                    return false;
                }
                panelFeatureState.refreshMenuContent = false;
            }
            panelFeatureState.menu.stopDispatchingItemsChanged();
            if (panelFeatureState.frozenActionViewState != null) {
                panelFeatureState.menu.restoreActionViewStates(panelFeatureState.frozenActionViewState);
                panelFeatureState.frozenActionViewState = null;
            }
            if (!windowCallback.onPreparePanel(0, panelFeatureState.createdPanelView, panelFeatureState.menu)) {
                if (z && this.mDecorContentParent != null) {
                    this.mDecorContentParent.setMenu(null, this.mActionMenuPresenterCallback);
                }
                panelFeatureState.menu.startDispatchingItemsChanged();
                return false;
            }
            panelFeatureState.qwertyMode = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            panelFeatureState.menu.setQwertyMode(panelFeatureState.qwertyMode);
            panelFeatureState.menu.startDispatchingItemsChanged();
        }
        panelFeatureState.isPrepared = true;
        panelFeatureState.isHandled = false;
        this.mPreparedPanel = panelFeatureState;
        return true;
    }

    private void reopenMenu(MenuBuilder menuBuilder, boolean z) {
        if (this.mDecorContentParent == null || !this.mDecorContentParent.canShowOverflowMenu() || (ViewConfigurationCompat.hasPermanentMenuKey(ViewConfiguration.get(this.mContext)) && !this.mDecorContentParent.isOverflowMenuShowPending())) {
            PanelFeatureState panelState = getPanelState(0, true);
            panelState.refreshDecorView = true;
            closePanel(panelState, false);
            openPanel(panelState, null);
            return;
        }
        Window.Callback windowCallback = getWindowCallback();
        if (this.mDecorContentParent.isOverflowMenuShowing() && z) {
            this.mDecorContentParent.hideOverflowMenu();
            if (isDestroyed()) {
                return;
            }
            windowCallback.onPanelClosed(108, getPanelState(0, true).menu);
        } else if (windowCallback == null || isDestroyed()) {
        } else {
            if (this.mInvalidatePanelMenuPosted && (this.mInvalidatePanelMenuFeatures & 1) != 0) {
                this.mWindow.getDecorView().removeCallbacks(this.mInvalidatePanelMenuRunnable);
                this.mInvalidatePanelMenuRunnable.run();
            }
            PanelFeatureState panelState2 = getPanelState(0, true);
            if (panelState2.menu == null || panelState2.refreshMenuContent || !windowCallback.onPreparePanel(0, panelState2.createdPanelView, panelState2.menu)) {
                return;
            }
            windowCallback.onMenuOpened(108, panelState2.menu);
            this.mDecorContentParent.showOverflowMenu();
        }
    }

    private int sanitizeWindowFeatureId(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i != 9) {
            return i;
        } else {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        }
    }

    private boolean shouldInheritContext(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.mWindow.getDecorView();
        for (ViewParent viewParent2 = viewParent; viewParent2 != null; viewParent2 = viewParent2.getParent()) {
            if (viewParent2 == decorView || !(viewParent2 instanceof View) || ViewCompat.isAttachedToWindow((View) viewParent2)) {
                return false;
            }
        }
        return true;
    }

    private void throwFeatureRequestIfSubDecorInstalled() {
        if (this.mSubDecorInstalled) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int updateStatusGuard(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        int i2 = 0;
        if (this.mActionModeView == null || !(this.mActionModeView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mActionModeView.getLayoutParams();
            if (this.mActionModeView.isShown()) {
                if (this.mTempRect1 == null) {
                    this.mTempRect1 = new Rect();
                    this.mTempRect2 = new Rect();
                }
                Rect rect = this.mTempRect1;
                Rect rect2 = this.mTempRect2;
                rect.set(0, i, 0, 0);
                ViewUtils.computeFitSystemWindows(this.mSubDecor, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i : 0)) {
                    marginLayoutParams.topMargin = i;
                    if (this.mStatusGuard == null) {
                        this.mStatusGuard = new View(this.mContext);
                        this.mStatusGuard.setBackgroundColor(this.mContext.getResources().getColor(C0176R.color.abc_input_method_navigation_guard));
                        this.mSubDecor.addView(this.mStatusGuard, -1, new ViewGroup.LayoutParams(-1, i));
                        z3 = true;
                    } else {
                        ViewGroup.LayoutParams layoutParams = this.mStatusGuard.getLayoutParams();
                        if (layoutParams.height != i) {
                            layoutParams.height = i;
                            this.mStatusGuard.setLayoutParams(layoutParams);
                        }
                        z3 = true;
                    }
                } else {
                    z3 = false;
                }
                if (this.mStatusGuard == null) {
                    z4 = false;
                }
                if (!this.mOverlayActionMode && z4) {
                    i = 0;
                }
                boolean z5 = z3;
                z2 = z4;
                z4 = z5;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z2 = false;
            } else {
                z4 = false;
                z2 = false;
            }
            if (z4) {
                this.mActionModeView.setLayoutParams(marginLayoutParams);
            }
            z = z2;
        }
        if (this.mStatusGuard != null) {
            View view = this.mStatusGuard;
            if (!z) {
                i2 = 8;
            }
            view.setVisibility(i2);
        }
        return i;
    }

    @Override // android.support.p004v7.app.AppCompatDelegate
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        ensureSubDecor();
        ((ViewGroup) this.mSubDecor.findViewById(16908290)).addView(view, layoutParams);
        this.mOriginalWindowCallback.onContentChanged();
    }

    View callActivityOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView;
        if (!(this.mOriginalWindowCallback instanceof LayoutInflater.Factory) || (onCreateView = ((LayoutInflater.Factory) this.mOriginalWindowCallback).onCreateView(str, context, attributeSet)) == null) {
            return null;
        }
        return onCreateView;
    }

    @Override // android.support.p004v7.app.AppCompatDelegate
    public View createView(View view, String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        boolean z = Build.VERSION.SDK_INT < 21;
        if (this.mAppCompatViewInflater == null) {
            this.mAppCompatViewInflater = new AppCompatViewInflater();
        }
        return this.mAppCompatViewInflater.createView(view, str, context, attributeSet, z && shouldInheritContext((ViewParent) view), z, true, VectorEnabledTintResources.shouldBeUsed());
    }

    @Override // android.support.p004v7.app.AppCompatDelegateImplBase
    boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = true;
        if (keyEvent.getKeyCode() != 82 || !this.mOriginalWindowCallback.dispatchKeyEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            if (keyEvent.getAction() != 0) {
                z = false;
            }
            return z ? onKeyDown(keyCode, keyEvent) : onKeyUp(keyCode, keyEvent);
        }
        return true;
    }

    @Override // android.support.p004v7.app.AppCompatDelegate
    @Nullable
    public View findViewById(@IdRes int i) {
        ensureSubDecor();
        return this.mWindow.findViewById(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public PanelFeatureState getPanelState(int i, boolean z) {
        PanelFeatureState[] panelFeatureStateArr = this.mPanels;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[i + 1];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.mPanels = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
        if (panelFeatureState == null) {
            PanelFeatureState panelFeatureState2 = new PanelFeatureState(i);
            panelFeatureStateArr[i] = panelFeatureState2;
            return panelFeatureState2;
        }
        return panelFeatureState;
    }

    ViewGroup getSubDecor() {
        return this.mSubDecor;
    }

    @Override // android.support.p004v7.app.AppCompatDelegate
    public boolean hasWindowFeature(int i) {
        int sanitizeWindowFeatureId = sanitizeWindowFeatureId(i);
        switch (sanitizeWindowFeatureId) {
            case 1:
                return this.mWindowNoTitle;
            case 2:
                return this.mFeatureProgress;
            case 5:
                return this.mFeatureIndeterminateProgress;
            case 10:
                return this.mOverlayActionMode;
            case 108:
                return this.mHasActionBar;
            case 109:
                return this.mOverlayActionBar;
            default:
                return this.mWindow.hasFeature(sanitizeWindowFeatureId);
        }
    }

    @Override // android.support.p004v7.app.AppCompatDelegateImplBase
    public void initWindowDecorActionBar() {
        ensureSubDecor();
        if (!this.mHasActionBar || this.mActionBar != null) {
            return;
        }
        if (this.mOriginalWindowCallback instanceof Activity) {
            this.mActionBar = new WindowDecorActionBar((Activity) this.mOriginalWindowCallback, this.mOverlayActionBar);
        } else if (this.mOriginalWindowCallback instanceof Dialog) {
            this.mActionBar = new WindowDecorActionBar((Dialog) this.mOriginalWindowCallback);
        }
        if (this.mActionBar == null) {
            return;
        }
        this.mActionBar.setDefaultDisplayHomeAsUpEnabled(this.mEnableDefaultActionBarUp);
    }

    @Override // android.support.p004v7.app.AppCompatDelegate
    public void installViewFactory() {
        LayoutInflater from = LayoutInflater.from(this.mContext);
        if (from.getFactory() == null) {
            LayoutInflaterCompat.setFactory(from, this);
        } else if (LayoutInflaterCompat.getFactory(from) instanceof AppCompatDelegateImplV7) {
        } else {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // android.support.p004v7.app.AppCompatDelegate
    public void invalidateOptionsMenu() {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar == null || !supportActionBar.invalidateOptionsMenu()) {
            invalidatePanelMenu(0);
        }
    }

    boolean onBackPressed() {
        if (this.mActionMode != null) {
            this.mActionMode.finish();
            return true;
        }
        ActionBar supportActionBar = getSupportActionBar();
        return supportActionBar != null && supportActionBar.collapseActionView();
    }

    @Override // android.support.p004v7.app.AppCompatDelegate
    public void onConfigurationChanged(Configuration configuration) {
        ActionBar supportActionBar;
        if (this.mHasActionBar && this.mSubDecorInstalled && (supportActionBar = getSupportActionBar()) != null) {
            supportActionBar.onConfigurationChanged(configuration);
        }
        applyDayNight();
    }

    @Override // android.support.p004v7.app.AppCompatDelegate
    public void onCreate(Bundle bundle) {
        if (!(this.mOriginalWindowCallback instanceof Activity) || NavUtils.getParentActivityName((Activity) this.mOriginalWindowCallback) == null) {
            return;
        }
        ActionBar peekSupportActionBar = peekSupportActionBar();
        if (peekSupportActionBar == null) {
            this.mEnableDefaultActionBarUp = true;
        } else {
            peekSupportActionBar.setDefaultDisplayHomeAsUpEnabled(true);
        }
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View callActivityOnCreateView = callActivityOnCreateView(view, str, context, attributeSet);
        return callActivityOnCreateView != null ? callActivityOnCreateView : createView(view, str, context, attributeSet);
    }

    @Override // android.support.p004v7.app.AppCompatDelegateImplBase, android.support.p004v7.app.AppCompatDelegate
    public void onDestroy() {
        super.onDestroy();
        if (this.mActionBar != null) {
            this.mActionBar.onDestroy();
        }
    }

    boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z = true;
        switch (i) {
            case 82:
                onKeyDownPanel(0, keyEvent);
                return true;
            case 4:
                if ((keyEvent.getFlags() & 128) == 0) {
                    z = false;
                }
                this.mLongPressBackDown = z;
                break;
        }
        if (Build.VERSION.SDK_INT < 11) {
            onKeyShortcut(i, keyEvent);
        }
        return false;
    }

    @Override // android.support.p004v7.app.AppCompatDelegateImplBase
    boolean onKeyShortcut(int i, KeyEvent keyEvent) {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar == null || !supportActionBar.onKeyShortcut(i, keyEvent)) {
            if (this.mPreparedPanel != null && performPanelShortcut(this.mPreparedPanel, keyEvent.getKeyCode(), keyEvent, 1)) {
                if (this.mPreparedPanel == null) {
                    return true;
                }
                this.mPreparedPanel.isHandled = true;
                return true;
            }
            if (this.mPreparedPanel == null) {
                PanelFeatureState panelState = getPanelState(0, true);
                preparePanel(panelState, keyEvent);
                boolean performPanelShortcut = performPanelShortcut(panelState, keyEvent.getKeyCode(), keyEvent, 1);
                panelState.isPrepared = false;
                if (performPanelShortcut) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    boolean onKeyUp(int i, KeyEvent keyEvent) {
        switch (i) {
            case 82:
                onKeyUpPanel(0, keyEvent);
                return true;
            case 4:
                boolean z = this.mLongPressBackDown;
                this.mLongPressBackDown = false;
                PanelFeatureState panelState = getPanelState(0, false);
                if (panelState != null && panelState.isOpen) {
                    if (z) {
                        return true;
                    }
                    closePanel(panelState, true);
                    return true;
                } else if (onBackPressed()) {
                    return true;
                }
                break;
        }
        return false;
    }

    @Override // android.support.p004v7.view.menu.MenuBuilder.Callback
    public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
        PanelFeatureState findMenuPanel;
        Window.Callback windowCallback = getWindowCallback();
        if (windowCallback == null || isDestroyed() || (findMenuPanel = findMenuPanel(menuBuilder.getRootMenu())) == null) {
            return false;
        }
        return windowCallback.onMenuItemSelected(findMenuPanel.featureId, menuItem);
    }

    @Override // android.support.p004v7.view.menu.MenuBuilder.Callback
    public void onMenuModeChange(MenuBuilder menuBuilder) {
        reopenMenu(menuBuilder, true);
    }

    @Override // android.support.p004v7.app.AppCompatDelegateImplBase
    boolean onMenuOpened(int i, Menu menu) {
        if (i == 108) {
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar == null) {
                return true;
            }
            supportActionBar.dispatchMenuVisibilityChanged(true);
            return true;
        }
        return false;
    }

    @Override // android.support.p004v7.app.AppCompatDelegateImplBase
    void onPanelClosed(int i, Menu menu) {
        if (i == 108) {
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar == null) {
                return;
            }
            supportActionBar.dispatchMenuVisibilityChanged(false);
        } else if (i != 0) {
        } else {
            PanelFeatureState panelState = getPanelState(i, true);
            if (!panelState.isOpen) {
                return;
            }
            closePanel(panelState, false);
        }
    }

    @Override // android.support.p004v7.app.AppCompatDelegate
    public void onPostCreate(Bundle bundle) {
        ensureSubDecor();
    }

    @Override // android.support.p004v7.app.AppCompatDelegate
    public void onPostResume() {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setShowHideAnimationEnabled(true);
        }
    }

    @Override // android.support.p004v7.app.AppCompatDelegate
    public void onStop() {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setShowHideAnimationEnabled(false);
        }
    }

    void onSubDecorInstalled(ViewGroup viewGroup) {
    }

    @Override // android.support.p004v7.app.AppCompatDelegateImplBase
    void onTitleChanged(CharSequence charSequence) {
        if (this.mDecorContentParent != null) {
            this.mDecorContentParent.setWindowTitle(charSequence);
        } else if (peekSupportActionBar() != null) {
            peekSupportActionBar().setWindowTitle(charSequence);
        } else if (this.mTitleView == null) {
        } else {
            this.mTitleView.setText(charSequence);
        }
    }

    @Override // android.support.p004v7.app.AppCompatDelegate
    public boolean requestWindowFeature(int i) {
        int sanitizeWindowFeatureId = sanitizeWindowFeatureId(i);
        if (!this.mWindowNoTitle || sanitizeWindowFeatureId != 108) {
            if (this.mHasActionBar && sanitizeWindowFeatureId == 1) {
                this.mHasActionBar = false;
            }
            switch (sanitizeWindowFeatureId) {
                case 1:
                    throwFeatureRequestIfSubDecorInstalled();
                    this.mWindowNoTitle = true;
                    return true;
                case 2:
                    throwFeatureRequestIfSubDecorInstalled();
                    this.mFeatureProgress = true;
                    return true;
                case 5:
                    throwFeatureRequestIfSubDecorInstalled();
                    this.mFeatureIndeterminateProgress = true;
                    return true;
                case 10:
                    throwFeatureRequestIfSubDecorInstalled();
                    this.mOverlayActionMode = true;
                    return true;
                case 108:
                    throwFeatureRequestIfSubDecorInstalled();
                    this.mHasActionBar = true;
                    return true;
                case 109:
                    throwFeatureRequestIfSubDecorInstalled();
                    this.mOverlayActionBar = true;
                    return true;
                default:
                    return this.mWindow.requestFeature(sanitizeWindowFeatureId);
            }
        }
        return false;
    }

    @Override // android.support.p004v7.app.AppCompatDelegate
    public void setContentView(int i) {
        ensureSubDecor();
        ViewGroup viewGroup = (ViewGroup) this.mSubDecor.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.mContext).inflate(i, viewGroup);
        this.mOriginalWindowCallback.onContentChanged();
    }

    @Override // android.support.p004v7.app.AppCompatDelegate
    public void setContentView(View view) {
        ensureSubDecor();
        ViewGroup viewGroup = (ViewGroup) this.mSubDecor.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.mOriginalWindowCallback.onContentChanged();
    }

    @Override // android.support.p004v7.app.AppCompatDelegate
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        ensureSubDecor();
        ViewGroup viewGroup = (ViewGroup) this.mSubDecor.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.mOriginalWindowCallback.onContentChanged();
    }

    @Override // android.support.p004v7.app.AppCompatDelegate
    public void setSupportActionBar(Toolbar toolbar) {
        if (!(this.mOriginalWindowCallback instanceof Activity)) {
            return;
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar instanceof WindowDecorActionBar) {
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
        this.mMenuInflater = null;
        if (supportActionBar != null) {
            supportActionBar.onDestroy();
        }
        if (toolbar != null) {
            ToolbarActionBar toolbarActionBar = new ToolbarActionBar(toolbar, ((Activity) this.mContext).getTitle(), this.mAppCompatWindowCallback);
            this.mActionBar = toolbarActionBar;
            this.mWindow.setCallback(toolbarActionBar.getWrappedWindowCallback());
        } else {
            this.mActionBar = null;
            this.mWindow.setCallback(this.mAppCompatWindowCallback);
        }
        invalidateOptionsMenu();
    }

    final boolean shouldAnimateActionModeView() {
        return this.mSubDecorInstalled && this.mSubDecor != null && ViewCompat.isLaidOut(this.mSubDecor);
    }

    @Override // android.support.p004v7.app.AppCompatDelegate
    public ActionMode startSupportActionMode(@NonNull ActionMode.Callback callback) {
        if (callback == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        if (this.mActionMode != null) {
            this.mActionMode.finish();
        }
        ActionModeCallbackWrapperV7 actionModeCallbackWrapperV7 = new ActionModeCallbackWrapperV7(callback);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            this.mActionMode = supportActionBar.startActionMode(actionModeCallbackWrapperV7);
            if (this.mActionMode != null && this.mAppCompatCallback != null) {
                this.mAppCompatCallback.onSupportActionModeStarted(this.mActionMode);
            }
        }
        if (this.mActionMode == null) {
            this.mActionMode = startSupportActionModeFromWindow(actionModeCallbackWrapperV7);
        }
        return this.mActionMode;
    }

    @Override // android.support.p004v7.app.AppCompatDelegateImplBase
    ActionMode startSupportActionModeFromWindow(@NonNull ActionMode.Callback callback) {
        ActionMode actionMode;
        Context context;
        endOnGoingFadeAnimation();
        if (this.mActionMode != null) {
            this.mActionMode.finish();
        }
        if (!(callback instanceof ActionModeCallbackWrapperV7)) {
            callback = new ActionModeCallbackWrapperV7(callback);
        }
        if (this.mAppCompatCallback == null || isDestroyed()) {
            actionMode = null;
        } else {
            try {
                actionMode = this.mAppCompatCallback.onWindowStartingSupportActionMode(callback);
            } catch (AbstractMethodError e) {
                actionMode = null;
            }
        }
        if (actionMode != null) {
            this.mActionMode = actionMode;
        } else {
            if (this.mActionModeView == null) {
                if (this.mIsFloating) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.mContext.getTheme();
                    theme.resolveAttribute(C0176R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = this.mContext.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        context = new ContextThemeWrapper(this.mContext, 0);
                        context.getTheme().setTo(newTheme);
                    } else {
                        context = this.mContext;
                    }
                    this.mActionModeView = new ActionBarContextView(context);
                    this.mActionModePopup = new PopupWindow(context, (AttributeSet) null, C0176R.attr.actionModePopupWindowStyle);
                    PopupWindowCompat.setWindowLayoutType(this.mActionModePopup, 2);
                    this.mActionModePopup.setContentView(this.mActionModeView);
                    this.mActionModePopup.setWidth(-1);
                    context.getTheme().resolveAttribute(C0176R.attr.actionBarSize, typedValue, true);
                    this.mActionModeView.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    this.mActionModePopup.setHeight(-2);
                    this.mShowActionModePopup = new Runnable() { // from class: android.support.v7.app.AppCompatDelegateImplV7.5
                        @Override // java.lang.Runnable
                        public void run() {
                            AppCompatDelegateImplV7.this.mActionModePopup.showAtLocation(AppCompatDelegateImplV7.this.mActionModeView, 55, 0, 0);
                            AppCompatDelegateImplV7.this.endOnGoingFadeAnimation();
                            if (!AppCompatDelegateImplV7.this.shouldAnimateActionModeView()) {
                                ViewCompat.setAlpha(AppCompatDelegateImplV7.this.mActionModeView, 1.0f);
                                AppCompatDelegateImplV7.this.mActionModeView.setVisibility(0);
                                return;
                            }
                            ViewCompat.setAlpha(AppCompatDelegateImplV7.this.mActionModeView, 0.0f);
                            AppCompatDelegateImplV7.this.mFadeAnim = ViewCompat.animate(AppCompatDelegateImplV7.this.mActionModeView).alpha(1.0f);
                            AppCompatDelegateImplV7.this.mFadeAnim.setListener(new ViewPropertyAnimatorListenerAdapter() { // from class: android.support.v7.app.AppCompatDelegateImplV7.5.1
                                public void onAnimationEnd(View view) {
                                    ViewCompat.setAlpha(AppCompatDelegateImplV7.this.mActionModeView, 1.0f);
                                    AppCompatDelegateImplV7.this.mFadeAnim.setListener(null);
                                    AppCompatDelegateImplV7.this.mFadeAnim = null;
                                }

                                public void onAnimationStart(View view) {
                                    AppCompatDelegateImplV7.this.mActionModeView.setVisibility(0);
                                }
                            });
                        }
                    };
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.mSubDecor.findViewById(C0176R.C0178id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(getActionBarThemedContext()));
                        this.mActionModeView = (ActionBarContextView) viewStubCompat.inflate();
                    }
                }
            }
            if (this.mActionModeView != null) {
                endOnGoingFadeAnimation();
                this.mActionModeView.killMode();
                StandaloneActionMode standaloneActionMode = new StandaloneActionMode(this.mActionModeView.getContext(), this.mActionModeView, callback, this.mActionModePopup == null);
                if (callback.onCreateActionMode(standaloneActionMode, standaloneActionMode.getMenu())) {
                    standaloneActionMode.invalidate();
                    this.mActionModeView.initForMode(standaloneActionMode);
                    this.mActionMode = standaloneActionMode;
                    if (shouldAnimateActionModeView()) {
                        ViewCompat.setAlpha(this.mActionModeView, 0.0f);
                        this.mFadeAnim = ViewCompat.animate(this.mActionModeView).alpha(1.0f);
                        this.mFadeAnim.setListener(new ViewPropertyAnimatorListenerAdapter() { // from class: android.support.v7.app.AppCompatDelegateImplV7.6
                            public void onAnimationEnd(View view) {
                                ViewCompat.setAlpha(AppCompatDelegateImplV7.this.mActionModeView, 1.0f);
                                AppCompatDelegateImplV7.this.mFadeAnim.setListener(null);
                                AppCompatDelegateImplV7.this.mFadeAnim = null;
                            }

                            public void onAnimationStart(View view) {
                                AppCompatDelegateImplV7.this.mActionModeView.setVisibility(0);
                                AppCompatDelegateImplV7.this.mActionModeView.sendAccessibilityEvent(32);
                                if (AppCompatDelegateImplV7.this.mActionModeView.getParent() != null) {
                                    ViewCompat.requestApplyInsets((View) AppCompatDelegateImplV7.this.mActionModeView.getParent());
                                }
                            }
                        });
                    } else {
                        ViewCompat.setAlpha(this.mActionModeView, 1.0f);
                        this.mActionModeView.setVisibility(0);
                        this.mActionModeView.sendAccessibilityEvent(32);
                        if (this.mActionModeView.getParent() != null) {
                            ViewCompat.requestApplyInsets((View) this.mActionModeView.getParent());
                        }
                    }
                    if (this.mActionModePopup != null) {
                        this.mWindow.getDecorView().post(this.mShowActionModePopup);
                    }
                } else {
                    this.mActionMode = null;
                }
            }
        }
        if (this.mActionMode != null && this.mAppCompatCallback != null) {
            this.mAppCompatCallback.onSupportActionModeStarted(this.mActionMode);
        }
        return this.mActionMode;
    }
}
