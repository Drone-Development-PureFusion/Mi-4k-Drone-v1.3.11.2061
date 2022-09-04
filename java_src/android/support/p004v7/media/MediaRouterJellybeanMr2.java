package android.support.p004v7.media;

import android.media.MediaRouter;
/* renamed from: android.support.v7.media.MediaRouterJellybeanMr2 */
/* loaded from: classes.dex */
final class MediaRouterJellybeanMr2 {

    /* renamed from: android.support.v7.media.MediaRouterJellybeanMr2$RouteInfo */
    /* loaded from: classes.dex */
    public static final class RouteInfo {
        public static CharSequence getDescription(Object obj) {
            return ((MediaRouter.RouteInfo) obj).getDescription();
        }

        public static boolean isConnecting(Object obj) {
            return ((MediaRouter.RouteInfo) obj).isConnecting();
        }
    }

    /* renamed from: android.support.v7.media.MediaRouterJellybeanMr2$UserRouteInfo */
    /* loaded from: classes.dex */
    public static final class UserRouteInfo {
        public static void setDescription(Object obj, CharSequence charSequence) {
            ((MediaRouter.UserRouteInfo) obj).setDescription(charSequence);
        }
    }

    MediaRouterJellybeanMr2() {
    }

    public static void addCallback(Object obj, int i, Object obj2, int i2) {
        ((MediaRouter) obj).addCallback(i, (MediaRouter.Callback) obj2, i2);
    }

    public static Object getDefaultRoute(Object obj) {
        return ((MediaRouter) obj).getDefaultRoute();
    }
}
