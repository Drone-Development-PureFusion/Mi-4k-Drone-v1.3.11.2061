package android.support.p004v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p001v4.view.ViewCompat;
import android.support.p001v4.view.ViewPropertyAnimatorCompat;
import android.support.p001v4.view.ViewPropertyAnimatorListener;
import android.support.p004v7.app.ActionBar;
import android.support.p004v7.appcompat.C0176R;
import android.support.p004v7.view.ActionBarPolicy;
import android.support.p004v7.widget.LinearLayoutCompat;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
/* renamed from: android.support.v7.widget.ScrollingTabContainerView */
/* loaded from: classes.dex */
public class ScrollingTabContainerView extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {
    private static final int FADE_DURATION = 200;
    private static final String TAG = "ScrollingTabContainerView";
    private static final Interpolator sAlphaInterpolator = new DecelerateInterpolator();
    private boolean mAllowCollapse;
    private int mContentHeight;
    int mMaxTabWidth;
    private int mSelectedTabIndex;
    int mStackedTabMaxWidth;
    private TabClickListener mTabClickListener;
    Runnable mTabSelector;
    private Spinner mTabSpinner;
    protected ViewPropertyAnimatorCompat mVisibilityAnim;
    protected final VisibilityAnimListener mVisAnimListener = new VisibilityAnimListener();
    private LinearLayoutCompat mTabLayout = createTabLayout();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.ScrollingTabContainerView$TabAdapter */
    /* loaded from: classes.dex */
    public class TabAdapter extends BaseAdapter {
        private TabAdapter() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return ScrollingTabContainerView.this.mTabLayout.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return ((TabView) ScrollingTabContainerView.this.mTabLayout.getChildAt(i)).getTab();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return ScrollingTabContainerView.this.createTabView((ActionBar.Tab) getItem(i), true);
            }
            ((TabView) view).bindTab((ActionBar.Tab) getItem(i));
            return view;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.ScrollingTabContainerView$TabClickListener */
    /* loaded from: classes.dex */
    public class TabClickListener implements View.OnClickListener {
        private TabClickListener() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((TabView) view).getTab().select();
            int childCount = ScrollingTabContainerView.this.mTabLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = ScrollingTabContainerView.this.mTabLayout.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.ScrollingTabContainerView$TabView */
    /* loaded from: classes.dex */
    public class TabView extends LinearLayoutCompat implements View.OnLongClickListener {
        private final int[] BG_ATTRS = {16842964};
        private View mCustomView;
        private ImageView mIconView;
        private ActionBar.Tab mTab;
        private TextView mTextView;

        public TabView(Context context, ActionBar.Tab tab, boolean z) {
            super(context, null, C0176R.attr.actionBarTabStyle);
            this.mTab = tab;
            TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, null, this.BG_ATTRS, C0176R.attr.actionBarTabStyle, 0);
            if (obtainStyledAttributes.hasValue(0)) {
                setBackgroundDrawable(obtainStyledAttributes.getDrawable(0));
            }
            obtainStyledAttributes.recycle();
            if (z) {
                setGravity(8388627);
            }
            update();
        }

        public void bindTab(ActionBar.Tab tab) {
            this.mTab = tab;
            update();
        }

        public ActionBar.Tab getTab() {
            return this.mTab;
        }

        @Override // android.support.p004v7.widget.LinearLayoutCompat, android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(ActionBar.Tab.class.getName());
        }

        @Override // android.support.p004v7.widget.LinearLayoutCompat, android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            if (Build.VERSION.SDK_INT >= 14) {
                accessibilityNodeInfo.setClassName(ActionBar.Tab.class.getName());
            }
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            Context context = getContext();
            int width = getWidth();
            int height = getHeight();
            int i = context.getResources().getDisplayMetrics().widthPixels;
            Toast makeText = Toast.makeText(context, this.mTab.getContentDescription(), 0);
            makeText.setGravity(49, (iArr[0] + (width / 2)) - (i / 2), height);
            makeText.show();
            return true;
        }

        @Override // android.support.p004v7.widget.LinearLayoutCompat, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (ScrollingTabContainerView.this.mMaxTabWidth <= 0 || getMeasuredWidth() <= ScrollingTabContainerView.this.mMaxTabWidth) {
                return;
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(ScrollingTabContainerView.this.mMaxTabWidth, 1073741824), i2);
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (!z2 || !z) {
                return;
            }
            sendAccessibilityEvent(4);
        }

        public void update() {
            ActionBar.Tab tab = this.mTab;
            View customView = tab.getCustomView();
            if (customView != null) {
                ViewParent parent = customView.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(customView);
                    }
                    addView(customView);
                }
                this.mCustomView = customView;
                if (this.mTextView != null) {
                    this.mTextView.setVisibility(8);
                }
                if (this.mIconView == null) {
                    return;
                }
                this.mIconView.setVisibility(8);
                this.mIconView.setImageDrawable(null);
                return;
            }
            if (this.mCustomView != null) {
                removeView(this.mCustomView);
                this.mCustomView = null;
            }
            Drawable icon = tab.getIcon();
            CharSequence text = tab.getText();
            if (icon != null) {
                if (this.mIconView == null) {
                    ImageView imageView = new ImageView(getContext());
                    LinearLayoutCompat.LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    imageView.setLayoutParams(layoutParams);
                    addView(imageView, 0);
                    this.mIconView = imageView;
                }
                this.mIconView.setImageDrawable(icon);
                this.mIconView.setVisibility(0);
            } else if (this.mIconView != null) {
                this.mIconView.setVisibility(8);
                this.mIconView.setImageDrawable(null);
            }
            boolean z = !TextUtils.isEmpty(text);
            if (z) {
                if (this.mTextView == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, C0176R.attr.actionBarTabTextStyle);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayoutCompat.LayoutParams layoutParams2 = new LinearLayoutCompat.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.mTextView = appCompatTextView;
                }
                this.mTextView.setText(text);
                this.mTextView.setVisibility(0);
            } else if (this.mTextView != null) {
                this.mTextView.setVisibility(8);
                this.mTextView.setText((CharSequence) null);
            }
            if (this.mIconView != null) {
                this.mIconView.setContentDescription(tab.getContentDescription());
            }
            if (!z && !TextUtils.isEmpty(tab.getContentDescription())) {
                setOnLongClickListener(this);
                return;
            }
            setOnLongClickListener(null);
            setLongClickable(false);
        }
    }

    /* renamed from: android.support.v7.widget.ScrollingTabContainerView$VisibilityAnimListener */
    /* loaded from: classes.dex */
    protected class VisibilityAnimListener implements ViewPropertyAnimatorListener {
        private boolean mCanceled = false;
        private int mFinalVisibility;

        protected VisibilityAnimListener() {
        }

        @Override // android.support.p001v4.view.ViewPropertyAnimatorListener
        public void onAnimationCancel(View view) {
            this.mCanceled = true;
        }

        @Override // android.support.p001v4.view.ViewPropertyAnimatorListener
        public void onAnimationEnd(View view) {
            if (this.mCanceled) {
                return;
            }
            ScrollingTabContainerView.this.mVisibilityAnim = null;
            ScrollingTabContainerView.this.setVisibility(this.mFinalVisibility);
        }

        @Override // android.support.p001v4.view.ViewPropertyAnimatorListener
        public void onAnimationStart(View view) {
            ScrollingTabContainerView.this.setVisibility(0);
            this.mCanceled = false;
        }

        public VisibilityAnimListener withFinalVisibility(ViewPropertyAnimatorCompat viewPropertyAnimatorCompat, int i) {
            this.mFinalVisibility = i;
            ScrollingTabContainerView.this.mVisibilityAnim = viewPropertyAnimatorCompat;
            return this;
        }
    }

    public ScrollingTabContainerView(Context context) {
        super(context);
        setHorizontalScrollBarEnabled(false);
        ActionBarPolicy actionBarPolicy = ActionBarPolicy.get(context);
        setContentHeight(actionBarPolicy.getTabContainerHeight());
        this.mStackedTabMaxWidth = actionBarPolicy.getStackedTabMaxWidth();
        addView(this.mTabLayout, new ViewGroup.LayoutParams(-2, -1));
    }

    private Spinner createSpinner() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), null, C0176R.attr.actionDropDownStyle);
        appCompatSpinner.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    private LinearLayoutCompat createTabLayout() {
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext(), null, C0176R.attr.actionBarTabBarStyle);
        linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat.setGravity(17);
        linearLayoutCompat.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        return linearLayoutCompat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TabView createTabView(ActionBar.Tab tab, boolean z) {
        TabView tabView = new TabView(getContext(), tab, z);
        if (z) {
            tabView.setBackgroundDrawable(null);
            tabView.setLayoutParams(new AbsListView.LayoutParams(-1, this.mContentHeight));
        } else {
            tabView.setFocusable(true);
            if (this.mTabClickListener == null) {
                this.mTabClickListener = new TabClickListener();
            }
            tabView.setOnClickListener(this.mTabClickListener);
        }
        return tabView;
    }

    private boolean isCollapsed() {
        return this.mTabSpinner != null && this.mTabSpinner.getParent() == this;
    }

    private void performCollapse() {
        if (isCollapsed()) {
            return;
        }
        if (this.mTabSpinner == null) {
            this.mTabSpinner = createSpinner();
        }
        removeView(this.mTabLayout);
        addView(this.mTabSpinner, new ViewGroup.LayoutParams(-2, -1));
        if (this.mTabSpinner.getAdapter() == null) {
            this.mTabSpinner.setAdapter((SpinnerAdapter) new TabAdapter());
        }
        if (this.mTabSelector != null) {
            removeCallbacks(this.mTabSelector);
            this.mTabSelector = null;
        }
        this.mTabSpinner.setSelection(this.mSelectedTabIndex);
    }

    private boolean performExpand() {
        if (isCollapsed()) {
            removeView(this.mTabSpinner);
            addView(this.mTabLayout, new ViewGroup.LayoutParams(-2, -1));
            setTabSelected(this.mTabSpinner.getSelectedItemPosition());
        }
        return false;
    }

    public void addTab(ActionBar.Tab tab, int i, boolean z) {
        TabView createTabView = createTabView(tab, false);
        this.mTabLayout.addView(createTabView, i, new LinearLayoutCompat.LayoutParams(0, -1, 1.0f));
        if (this.mTabSpinner != null) {
            ((TabAdapter) this.mTabSpinner.getAdapter()).notifyDataSetChanged();
        }
        if (z) {
            createTabView.setSelected(true);
        }
        if (this.mAllowCollapse) {
            requestLayout();
        }
    }

    public void addTab(ActionBar.Tab tab, boolean z) {
        TabView createTabView = createTabView(tab, false);
        this.mTabLayout.addView(createTabView, new LinearLayoutCompat.LayoutParams(0, -1, 1.0f));
        if (this.mTabSpinner != null) {
            ((TabAdapter) this.mTabSpinner.getAdapter()).notifyDataSetChanged();
        }
        if (z) {
            createTabView.setSelected(true);
        }
        if (this.mAllowCollapse) {
            requestLayout();
        }
    }

    public void animateToTab(int i) {
        final View childAt = this.mTabLayout.getChildAt(i);
        if (this.mTabSelector != null) {
            removeCallbacks(this.mTabSelector);
        }
        this.mTabSelector = new Runnable() { // from class: android.support.v7.widget.ScrollingTabContainerView.1
            @Override // java.lang.Runnable
            public void run() {
                ScrollingTabContainerView.this.smoothScrollTo(childAt.getLeft() - ((ScrollingTabContainerView.this.getWidth() - childAt.getWidth()) / 2), 0);
                ScrollingTabContainerView.this.mTabSelector = null;
            }
        };
        post(this.mTabSelector);
    }

    public void animateToVisibility(int i) {
        if (this.mVisibilityAnim != null) {
            this.mVisibilityAnim.cancel();
        }
        if (i != 0) {
            ViewPropertyAnimatorCompat alpha = ViewCompat.animate(this).alpha(0.0f);
            alpha.setDuration(200L);
            alpha.setInterpolator(sAlphaInterpolator);
            alpha.setListener(this.mVisAnimListener.withFinalVisibility(alpha, i));
            alpha.start();
            return;
        }
        if (getVisibility() != 0) {
            ViewCompat.setAlpha(this, 0.0f);
        }
        ViewPropertyAnimatorCompat alpha2 = ViewCompat.animate(this).alpha(1.0f);
        alpha2.setDuration(200L);
        alpha2.setInterpolator(sAlphaInterpolator);
        alpha2.setListener(this.mVisAnimListener.withFinalVisibility(alpha2, i));
        alpha2.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mTabSelector != null) {
            post(this.mTabSelector);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 8) {
            super.onConfigurationChanged(configuration);
        }
        ActionBarPolicy actionBarPolicy = ActionBarPolicy.get(getContext());
        setContentHeight(actionBarPolicy.getTabContainerHeight());
        this.mStackedTabMaxWidth = actionBarPolicy.getStackedTabMaxWidth();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.mTabSelector != null) {
            removeCallbacks(this.mTabSelector);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((TabView) view).getTab().select();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        boolean z = true;
        int mode = View.MeasureSpec.getMode(i);
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.mTabLayout.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.mMaxTabWidth = -1;
        } else {
            if (childCount > 2) {
                this.mMaxTabWidth = (int) (View.MeasureSpec.getSize(i) * 0.4f);
            } else {
                this.mMaxTabWidth = View.MeasureSpec.getSize(i) / 2;
            }
            this.mMaxTabWidth = Math.min(this.mMaxTabWidth, this.mStackedTabMaxWidth);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.mContentHeight, 1073741824);
        if (z2 || !this.mAllowCollapse) {
            z = false;
        }
        if (z) {
            this.mTabLayout.measure(0, makeMeasureSpec);
            if (this.mTabLayout.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                performCollapse();
            } else {
                performExpand();
            }
        } else {
            performExpand();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z2 || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.mSelectedTabIndex);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void removeAllTabs() {
        this.mTabLayout.removeAllViews();
        if (this.mTabSpinner != null) {
            ((TabAdapter) this.mTabSpinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.mAllowCollapse) {
            requestLayout();
        }
    }

    public void removeTabAt(int i) {
        this.mTabLayout.removeViewAt(i);
        if (this.mTabSpinner != null) {
            ((TabAdapter) this.mTabSpinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.mAllowCollapse) {
            requestLayout();
        }
    }

    public void setAllowCollapse(boolean z) {
        this.mAllowCollapse = z;
    }

    public void setContentHeight(int i) {
        this.mContentHeight = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.mSelectedTabIndex = i;
        int childCount = this.mTabLayout.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.mTabLayout.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                animateToTab(i);
            }
            i2++;
        }
        if (this.mTabSpinner == null || i < 0) {
            return;
        }
        this.mTabSpinner.setSelection(i);
    }

    public void updateTab(int i) {
        ((TabView) this.mTabLayout.getChildAt(i)).update();
        if (this.mTabSpinner != null) {
            ((TabAdapter) this.mTabSpinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.mAllowCollapse) {
            requestLayout();
        }
    }
}
