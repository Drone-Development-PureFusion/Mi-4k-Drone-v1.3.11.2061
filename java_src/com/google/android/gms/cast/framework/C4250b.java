package com.google.android.gms.cast.framework;

import android.content.Context;
import android.support.p001v4.view.MenuItemCompat;
import android.support.p004v7.app.MediaRouteActionProvider;
import android.support.p004v7.app.MediaRouteButton;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.gms.common.internal.C4588d;
import java.util.Locale;
/* renamed from: com.google.android.gms.cast.framework.b */
/* loaded from: classes2.dex */
public final class C4250b {
    private C4250b() {
    }

    /* renamed from: a */
    public static MenuItem m24871a(Context context, Menu menu, int i) {
        C4588d.m23627a(menu);
        C4251c m24868a = C4251c.m24868a(context);
        MenuItem findItem = menu.findItem(i);
        if (findItem == null) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "menu doesn't contain a menu item whose ID is %d.", Integer.valueOf(i)));
        }
        MediaRouteActionProvider mediaRouteActionProvider = (MediaRouteActionProvider) MenuItemCompat.getActionProvider(findItem);
        if (mediaRouteActionProvider == null) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "menu item with ID %d doesn't have a MediaRouteActionProvider.", Integer.valueOf(i)));
        }
        mediaRouteActionProvider.setRouteSelector(m24868a.m24857c());
        return findItem;
    }

    /* renamed from: a */
    public static void m24872a(Context context, MediaRouteButton mediaRouteButton) {
        mediaRouteButton.setRouteSelector(C4251c.m24868a(context).m24857c());
    }
}
