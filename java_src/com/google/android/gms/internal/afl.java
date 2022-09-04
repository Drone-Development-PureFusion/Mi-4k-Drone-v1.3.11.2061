package com.google.android.gms.internal;

import android.os.RemoteException;
import android.support.p004v7.media.MediaRouter;
import com.google.android.gms.cast.internal.C4440m;
import com.google.android.gms.common.internal.C4588d;
/* loaded from: classes2.dex */
public class afl extends MediaRouter.Callback {

    /* renamed from: a */
    private static final C4440m f21467a = new C4440m("MediaRouterCallback");

    /* renamed from: b */
    private final afi f21468b;

    public afl(afi afiVar) {
        this.f21468b = (afi) C4588d.m23627a(afiVar);
    }

    @Override // android.support.p004v7.media.MediaRouter.Callback
    public void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        try {
            this.f21468b.mo17793a(routeInfo.getId(), routeInfo.getExtras());
        } catch (RemoteException e) {
            f21467a.m24163a(e, "Unable to call %s on %s.", "onRouteAdded", afi.class.getSimpleName());
        }
    }

    @Override // android.support.p004v7.media.MediaRouter.Callback
    public void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        try {
            this.f21468b.mo17792b(routeInfo.getId(), routeInfo.getExtras());
        } catch (RemoteException e) {
            f21467a.m24163a(e, "Unable to call %s on %s.", "onRouteChanged", afi.class.getSimpleName());
        }
    }

    @Override // android.support.p004v7.media.MediaRouter.Callback
    public void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        try {
            this.f21468b.mo17791c(routeInfo.getId(), routeInfo.getExtras());
        } catch (RemoteException e) {
            f21467a.m24163a(e, "Unable to call %s on %s.", "onRouteRemoved", afi.class.getSimpleName());
        }
    }

    @Override // android.support.p004v7.media.MediaRouter.Callback
    public void onRouteSelected(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        try {
            this.f21468b.mo17790d(routeInfo.getId(), routeInfo.getExtras());
        } catch (RemoteException e) {
            f21467a.m24163a(e, "Unable to call %s on %s.", "onRouteSelected", afi.class.getSimpleName());
        }
    }

    @Override // android.support.p004v7.media.MediaRouter.Callback
    public void onRouteUnselected(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        try {
            this.f21468b.mo17789e(routeInfo.getId(), routeInfo.getExtras());
        } catch (RemoteException e) {
            f21467a.m24163a(e, "Unable to call %s on %s.", "onRouteUnselected", afi.class.getSimpleName());
        }
    }
}
