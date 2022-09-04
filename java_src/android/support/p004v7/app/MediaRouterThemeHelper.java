package android.support.p004v7.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.p004v7.appcompat.C0176R;
import android.support.p004v7.mediarouter.C0203R;
import android.support.v4.graphics.ColorUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.app.MediaRouterThemeHelper */
/* loaded from: classes.dex */
public final class MediaRouterThemeHelper {
    private static final int COLOR_DARK_ON_LIGHT_BACKGROUND = -570425344;
    private static final int COLOR_WHITE_ON_DARK_BACKGROUND = -1;
    private static final float MIN_CONTRAST = 3.0f;

    private MediaRouterThemeHelper() {
    }

    public static Context createThemedContext(Context context, int i) {
        return new ContextThemeWrapper(context, isLightTheme(context) ? getControllerColor(context, i) == COLOR_DARK_ON_LIGHT_BACKGROUND ? C0203R.style.Theme_MediaRouter_Light : C0203R.style.Theme_MediaRouter_Light_DarkControlPanel : getControllerColor(context, i) == COLOR_DARK_ON_LIGHT_BACKGROUND ? C0203R.style.Theme_MediaRouter_LightControlPanel : C0203R.style.Theme_MediaRouter);
    }

    public static int getButtonTextColor(Context context) {
        int themeColor = getThemeColor(context, 0, C0176R.attr.colorPrimary);
        return ColorUtils.calculateContrast(themeColor, getThemeColor(context, 0, 16842801)) < 3.0d ? getThemeColor(context, 0, C0176R.attr.colorAccent) : themeColor;
    }

    public static int getControllerColor(Context context, int i) {
        if (ColorUtils.calculateContrast(-1, getThemeColor(context, i, C0176R.attr.colorPrimary)) >= 3.0d) {
            return -1;
        }
        return COLOR_DARK_ON_LIGHT_BACKGROUND;
    }

    public static float getDisabledAlpha(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16842803, typedValue, true)) {
            return typedValue.getFloat();
        }
        return 0.5f;
    }

    private static int getThemeColor(Context context, int i, int i2) {
        if (i != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{i2});
            int color = obtainStyledAttributes.getColor(0, 0);
            obtainStyledAttributes.recycle();
            if (color != 0) {
                return color;
            }
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i2, typedValue, true);
        return typedValue.resourceId != 0 ? context.getResources().getColor(typedValue.resourceId) : typedValue.data;
    }

    public static int getThemeResource(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue.resourceId;
        }
        return 0;
    }

    private static boolean isLightTheme(Context context) {
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(C0176R.attr.isLightTheme, typedValue, true) && typedValue.data != 0;
    }

    public static void setMediaControlsBackgroundColor(Context context, View view, View view2, boolean z) {
        int i;
        int themeColor = getThemeColor(context, 0, C0176R.attr.colorPrimary);
        int themeColor2 = getThemeColor(context, 0, C0176R.attr.colorPrimaryDark);
        if (!z || getControllerColor(context, 0) != COLOR_DARK_ON_LIGHT_BACKGROUND) {
            i = themeColor;
            themeColor = themeColor2;
        } else {
            i = -1;
        }
        view.setBackgroundColor(i);
        view2.setBackgroundColor(themeColor);
        view.setTag(Integer.valueOf(i));
        view2.setTag(Integer.valueOf(themeColor));
    }

    public static void setVolumeSliderColor(Context context, MediaRouteVolumeSlider mediaRouteVolumeSlider, View view) {
        int controllerColor = getControllerColor(context, 0);
        mediaRouteVolumeSlider.setColor(Color.alpha(controllerColor) != 255 ? ColorUtils.compositeColors(controllerColor, ((Integer) view.getTag()).intValue()) : controllerColor);
    }
}
