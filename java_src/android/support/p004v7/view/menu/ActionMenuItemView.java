package android.support.p004v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.support.p001v4.view.ViewCompat;
import android.support.p004v7.appcompat.C0176R;
import android.support.p004v7.view.menu.MenuBuilder;
import android.support.p004v7.view.menu.MenuView;
import android.support.p004v7.widget.ActionMenuView;
import android.support.p004v7.widget.AppCompatTextView;
import android.support.p004v7.widget.ForwardingListener;
import android.support.v4.content.res.ConfigurationHelper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;
/* renamed from: android.support.v7.view.menu.ActionMenuItemView */
/* loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements MenuView.ItemView, ActionMenuView.ActionMenuChildView, View.OnClickListener, View.OnLongClickListener {
    private static final int MAX_ICON_SIZE = 32;
    private static final String TAG = "ActionMenuItemView";
    private boolean mAllowTextWithIcon;
    private boolean mExpandedFormat;
    private ForwardingListener mForwardingListener;
    private Drawable mIcon;
    private MenuItemImpl mItemData;
    private MenuBuilder.ItemInvoker mItemInvoker;
    private int mMaxIconSize;
    private int mMinWidth;
    private PopupCallback mPopupCallback;
    private int mSavedPaddingLeft;
    private CharSequence mTitle;

    /* renamed from: android.support.v7.view.menu.ActionMenuItemView$ActionMenuItemForwardingListener */
    /* loaded from: classes.dex */
    private class ActionMenuItemForwardingListener extends ForwardingListener {
        public ActionMenuItemForwardingListener() {
            super(ActionMenuItemView.this);
        }

        @Override // android.support.p004v7.widget.ForwardingListener
        /* renamed from: getPopup */
        public ShowableListMenu mo40037getPopup() {
            if (ActionMenuItemView.this.mPopupCallback != null) {
                return ActionMenuItemView.this.mPopupCallback.getPopup();
            }
            return null;
        }

        @Override // android.support.p004v7.widget.ForwardingListener
        protected boolean onForwardingStarted() {
            ShowableListMenu mo40037getPopup;
            return ActionMenuItemView.this.mItemInvoker != null && ActionMenuItemView.this.mItemInvoker.invokeItem(ActionMenuItemView.this.mItemData) && (mo40037getPopup = mo40037getPopup()) != null && mo40037getPopup.isShowing();
        }
    }

    /* renamed from: android.support.v7.view.menu.ActionMenuItemView$PopupCallback */
    /* loaded from: classes.dex */
    public static abstract class PopupCallback {
        public abstract ShowableListMenu getPopup();
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.mAllowTextWithIcon = shouldAllowTextWithIcon();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0176R.styleable.ActionMenuItemView, i, 0);
        this.mMinWidth = obtainStyledAttributes.getDimensionPixelSize(C0176R.styleable.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.mMaxIconSize = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        setOnLongClickListener(this);
        this.mSavedPaddingLeft = -1;
        setSaveEnabled(false);
    }

    private boolean shouldAllowTextWithIcon() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int screenWidthDp = ConfigurationHelper.getScreenWidthDp(getResources());
        return screenWidthDp >= 480 || (screenWidthDp >= 640 && ConfigurationHelper.getScreenHeightDp(getResources()) >= 480) || configuration.orientation == 2;
    }

    private void updateTextButtonVisibility() {
        boolean z = false;
        boolean z2 = !TextUtils.isEmpty(this.mTitle);
        if (this.mIcon == null || (this.mItemData.showsTextAsAction() && (this.mAllowTextWithIcon || this.mExpandedFormat))) {
            z = true;
        }
        setText(z2 & z ? this.mTitle : null);
    }

    @Override // android.support.p004v7.view.menu.MenuView.ItemView
    public MenuItemImpl getItemData() {
        return this.mItemData;
    }

    public boolean hasText() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // android.support.p004v7.view.menu.MenuView.ItemView
    public void initialize(MenuItemImpl menuItemImpl, int i) {
        this.mItemData = menuItemImpl;
        setIcon(menuItemImpl.getIcon());
        setTitle(menuItemImpl.getTitleForItemView(this));
        setId(menuItemImpl.getItemId());
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
        setEnabled(menuItemImpl.isEnabled());
        if (!menuItemImpl.hasSubMenu() || this.mForwardingListener != null) {
            return;
        }
        this.mForwardingListener = new ActionMenuItemForwardingListener();
    }

    @Override // android.support.p004v7.widget.ActionMenuView.ActionMenuChildView
    public boolean needsDividerAfter() {
        return hasText();
    }

    @Override // android.support.p004v7.widget.ActionMenuView.ActionMenuChildView
    public boolean needsDividerBefore() {
        return hasText() && this.mItemData.getIcon() == null;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.mItemInvoker != null) {
            this.mItemInvoker.invokeItem(this.mItemData);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 8) {
            super.onConfigurationChanged(configuration);
        }
        this.mAllowTextWithIcon = shouldAllowTextWithIcon();
        updateTextButtonVisibility();
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        if (hasText()) {
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
        int i2 = (width / 2) + iArr[0];
        if (ViewCompat.getLayoutDirection(view) == 0) {
            i2 = context.getResources().getDisplayMetrics().widthPixels - i2;
        }
        Toast makeText = Toast.makeText(context, this.mItemData.getTitle(), 0);
        if (i < rect.height()) {
            makeText.setGravity(8388661, i2, (iArr[1] + height) - rect.top);
        } else {
            makeText.setGravity(81, 0, height);
        }
        makeText.show();
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        boolean hasText = hasText();
        if (hasText && this.mSavedPaddingLeft >= 0) {
            super.setPadding(this.mSavedPaddingLeft, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.mMinWidth) : this.mMinWidth;
        if (mode != 1073741824 && this.mMinWidth > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (hasText || this.mIcon == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.mIcon.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.mItemData.hasSubMenu() || this.mForwardingListener == null || !this.mForwardingListener.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.support.p004v7.view.menu.MenuView.ItemView
    public boolean prefersCondensedTitle() {
        return true;
    }

    @Override // android.support.p004v7.view.menu.MenuView.ItemView
    public void setCheckable(boolean z) {
    }

    @Override // android.support.p004v7.view.menu.MenuView.ItemView
    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.mExpandedFormat != z) {
            this.mExpandedFormat = z;
            if (this.mItemData == null) {
                return;
            }
            this.mItemData.actionFormatChanged();
        }
    }

    @Override // android.support.p004v7.view.menu.MenuView.ItemView
    public void setIcon(Drawable drawable) {
        this.mIcon = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > this.mMaxIconSize) {
                float f = this.mMaxIconSize / intrinsicWidth;
                intrinsicWidth = this.mMaxIconSize;
                intrinsicHeight = (int) (intrinsicHeight * f);
            }
            if (intrinsicHeight > this.mMaxIconSize) {
                float f2 = this.mMaxIconSize / intrinsicHeight;
                intrinsicHeight = this.mMaxIconSize;
                intrinsicWidth = (int) (intrinsicWidth * f2);
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, null, null, null);
        updateTextButtonVisibility();
    }

    public void setItemInvoker(MenuBuilder.ItemInvoker itemInvoker) {
        this.mItemInvoker = itemInvoker;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.mSavedPaddingLeft = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(PopupCallback popupCallback) {
        this.mPopupCallback = popupCallback;
    }

    @Override // android.support.p004v7.view.menu.MenuView.ItemView
    public void setShortcut(boolean z, char c) {
    }

    @Override // android.support.p004v7.view.menu.MenuView.ItemView
    public void setTitle(CharSequence charSequence) {
        this.mTitle = charSequence;
        setContentDescription(this.mTitle);
        updateTextButtonVisibility();
    }

    @Override // android.support.p004v7.view.menu.MenuView.ItemView
    public boolean showsIcon() {
        return true;
    }
}
