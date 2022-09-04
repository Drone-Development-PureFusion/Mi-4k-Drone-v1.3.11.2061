package android.support.p004v7.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.p001v4.view.ViewConfigurationCompat;
import android.support.p004v7.appcompat.C0176R;
import android.support.v4.content.res.ConfigurationHelper;
import android.view.ViewConfiguration;
/* renamed from: android.support.v7.view.ActionBarPolicy */
/* loaded from: classes.dex */
public class ActionBarPolicy {
    private Context mContext;

    private ActionBarPolicy(Context context) {
        this.mContext = context;
    }

    public static ActionBarPolicy get(Context context) {
        return new ActionBarPolicy(context);
    }

    public boolean enableHomeButtonByDefault() {
        return this.mContext.getApplicationInfo().targetSdkVersion < 14;
    }

    public int getEmbeddedMenuWidthLimit() {
        return this.mContext.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int getMaxActionButtons() {
        Resources resources = this.mContext.getResources();
        int screenWidthDp = ConfigurationHelper.getScreenWidthDp(resources);
        int screenHeightDp = ConfigurationHelper.getScreenHeightDp(resources);
        if (ConfigurationHelper.getSmallestScreenWidthDp(resources) > 600 || screenWidthDp > 600 || ((screenWidthDp > 960 && screenHeightDp > 720) || (screenWidthDp > 720 && screenHeightDp > 960))) {
            return 5;
        }
        if (screenWidthDp >= 500 || ((screenWidthDp > 640 && screenHeightDp > 480) || (screenWidthDp > 480 && screenHeightDp > 640))) {
            return 4;
        }
        return screenWidthDp >= 360 ? 3 : 2;
    }

    public int getStackedTabMaxWidth() {
        return this.mContext.getResources().getDimensionPixelSize(C0176R.dimen.abc_action_bar_stacked_tab_max_width);
    }

    public int getTabContainerHeight() {
        TypedArray obtainStyledAttributes = this.mContext.obtainStyledAttributes(null, C0176R.styleable.ActionBar, C0176R.attr.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C0176R.styleable.ActionBar_height, 0);
        Resources resources = this.mContext.getResources();
        if (!hasEmbeddedTabs()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C0176R.dimen.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean hasEmbeddedTabs() {
        return this.mContext.getResources().getBoolean(C0176R.bool.abc_action_bar_embed_tabs);
    }

    public boolean showsOverflowMenuButton() {
        return Build.VERSION.SDK_INT >= 19 || !ViewConfigurationCompat.hasPermanentMenuKey(ViewConfiguration.get(this.mContext));
    }
}
