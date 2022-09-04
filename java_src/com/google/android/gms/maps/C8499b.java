package com.google.android.gms.maps;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.maps.model.C8618j;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.p247a.AbstractC8368a;
/* renamed from: com.google.android.gms.maps.b */
/* loaded from: classes2.dex */
public final class C8499b {

    /* renamed from: a */
    private static AbstractC8368a f27356a;

    private C8499b() {
    }

    /* renamed from: a */
    public static C8367a m11626a() {
        try {
            return new C8367a(m11614c().mo11870a());
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public static C8367a m11625a(float f) {
        try {
            return new C8367a(m11614c().mo11869a(f));
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public static C8367a m11624a(float f, float f2) {
        try {
            return new C8367a(m11614c().mo11868a(f, f2));
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public static C8367a m11623a(float f, Point point) {
        try {
            return new C8367a(m11614c().mo11867a(f, point.x, point.y));
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public static C8367a m11621a(CameraPosition cameraPosition) {
        try {
            return new C8367a(m11614c().mo11866a(cameraPosition));
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public static C8367a m11620a(LatLng latLng) {
        try {
            return new C8367a(m11614c().mo11865a(latLng));
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public static C8367a m11619a(LatLng latLng, float f) {
        try {
            return new C8367a(m11614c().mo11864a(latLng, f));
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public static C8367a m11618a(LatLngBounds latLngBounds, int i) {
        try {
            return new C8367a(m11614c().mo11863a(latLngBounds, i));
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public static C8367a m11617a(LatLngBounds latLngBounds, int i, int i2, int i3) {
        try {
            return new C8367a(m11614c().mo11862a(latLngBounds, i, i2, i3));
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public static void m11622a(AbstractC8368a abstractC8368a) {
        f27356a = (AbstractC8368a) C4588d.m23627a(abstractC8368a);
    }

    /* renamed from: b */
    public static C8367a m11616b() {
        try {
            return new C8367a(m11614c().mo11861b());
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: b */
    public static C8367a m11615b(float f) {
        try {
            return new C8367a(m11614c().mo11860b(f));
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: c */
    private static AbstractC8368a m11614c() {
        return (AbstractC8368a) C4588d.m23626a(f27356a, "CameraUpdateFactory is not initialized");
    }
}
