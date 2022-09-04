package com.google.android.gms.internal;

import android.os.Bundle;
import android.support.p004v7.media.MediaRouteSelector;
import android.support.p004v7.media.MediaRouter;
import android.support.v4.media.session.MediaSessionCompat;
import com.google.android.gms.internal.afh;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* loaded from: classes2.dex */
public class afm extends afh.AbstractBinderC6261a {

    /* renamed from: a */
    private final MediaRouter f21469a;

    /* renamed from: b */
    private final Map<MediaRouteSelector, Set<MediaRouter.Callback>> f21470b = new HashMap();

    public afm(MediaRouter mediaRouter) {
        this.f21469a = mediaRouter;
    }

    @Override // com.google.android.gms.internal.afh
    /* renamed from: a */
    public int mo17773a() {
        return 9683208;
    }

    @Override // com.google.android.gms.internal.afh
    /* renamed from: a */
    public void mo17772a(Bundle bundle) {
        for (MediaRouter.Callback callback : this.f21470b.get(MediaRouteSelector.fromBundle(bundle))) {
            this.f21469a.removeCallback(callback);
        }
    }

    @Override // com.google.android.gms.internal.afh
    /* renamed from: a */
    public void mo17771a(Bundle bundle, int i) {
        MediaRouteSelector fromBundle = MediaRouteSelector.fromBundle(bundle);
        for (MediaRouter.Callback callback : this.f21470b.get(fromBundle)) {
            this.f21469a.addCallback(fromBundle, callback, i);
        }
    }

    @Override // com.google.android.gms.internal.afh
    /* renamed from: a */
    public void mo17770a(Bundle bundle, afi afiVar) {
        MediaRouteSelector fromBundle = MediaRouteSelector.fromBundle(bundle);
        if (!this.f21470b.containsKey(fromBundle)) {
            this.f21470b.put(fromBundle, new HashSet());
        }
        this.f21470b.get(fromBundle).add(new afl(afiVar));
    }

    /* renamed from: a */
    public void m17769a(MediaSessionCompat mediaSessionCompat) {
        this.f21469a.setMediaSessionCompat(mediaSessionCompat);
    }

    @Override // com.google.android.gms.internal.afh
    /* renamed from: a */
    public void mo17768a(String str) {
        for (MediaRouter.RouteInfo routeInfo : this.f21469a.getRoutes()) {
            if (routeInfo.getId().equals(str)) {
                this.f21469a.selectRoute(routeInfo);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.afh
    /* renamed from: b */
    public Bundle mo17765b(String str) {
        for (MediaRouter.RouteInfo routeInfo : this.f21469a.getRoutes()) {
            if (routeInfo.getId().equals(str)) {
                return routeInfo.getExtras();
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.afh
    /* renamed from: b */
    public void mo17767b() {
        this.f21469a.selectRoute(this.f21469a.getDefaultRoute());
    }

    @Override // com.google.android.gms.internal.afh
    /* renamed from: b */
    public boolean mo17766b(Bundle bundle, int i) {
        return this.f21469a.isRouteAvailable(MediaRouteSelector.fromBundle(bundle), i);
    }

    @Override // com.google.android.gms.internal.afh
    /* renamed from: c */
    public boolean mo17764c() {
        return this.f21469a.getSelectedRoute().getId().equals(this.f21469a.getDefaultRoute().getId());
    }

    @Override // com.google.android.gms.internal.afh
    /* renamed from: d */
    public String mo17763d() {
        return this.f21469a.getSelectedRoute().getId();
    }
}
