package com.google.android.gms.maps;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.maps.model.C8618j;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;
import com.google.android.gms.maps.p247a.AbstractC8446f;
import com.google.android.gms.p232c.BinderC4173f;
/* renamed from: com.google.android.gms.maps.h */
/* loaded from: classes2.dex */
public final class C8556h {

    /* renamed from: a */
    private final AbstractC8446f f27419a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8556h(AbstractC8446f abstractC8446f) {
        this.f27419a = abstractC8446f;
    }

    /* renamed from: a */
    public Point m11482a(LatLng latLng) {
        try {
            return (Point) BinderC4173f.m25294a(this.f27419a.mo11724a(latLng));
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public LatLng m11483a(Point point) {
        try {
            return this.f27419a.mo11725a(BinderC4173f.m25293a(point));
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public VisibleRegion m11484a() {
        try {
            return this.f27419a.mo11726a();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }
}
