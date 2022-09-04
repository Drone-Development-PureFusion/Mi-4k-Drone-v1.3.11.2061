package com.tencent.open;

import android.location.Location;
import com.tencent.map.p260a.p261a.C10152b;
import com.tencent.map.p260a.p261a.C10154d;
import com.tencent.open.C10276c;
import com.tencent.open.p264a.C10257f;
/* renamed from: com.tencent.open.d */
/* loaded from: classes2.dex */
public class C10282d extends C10152b {

    /* renamed from: a */
    private C10276c.AbstractC10277a f31972a;

    public C10282d(C10276c.AbstractC10277a abstractC10277a) {
        super(1, 0, 0, 8);
        this.f31972a = abstractC10277a;
    }

    @Override // com.tencent.map.p260a.p261a.C10152b
    /* renamed from: a */
    public void mo5614a(int i) {
        C10257f.m5670c(C10257f.f31917d, "location: onStatusUpdate = " + i);
        super.mo5614a(i);
    }

    @Override // com.tencent.map.p260a.p261a.C10152b
    /* renamed from: a */
    public void mo5613a(C10154d c10154d) {
        C10257f.m5670c(C10257f.f31917d, "location: onLocationUpdate = " + c10154d);
        super.mo5613a(c10154d);
        if (c10154d == null) {
            return;
        }
        Location location = new Location("passive");
        location.setLatitude(c10154d.f31330b);
        location.setLongitude(c10154d.f31331c);
        if (this.f31972a == null) {
            return;
        }
        this.f31972a.onLocationUpdate(location);
    }

    @Override // com.tencent.map.p260a.p261a.C10152b
    /* renamed from: a */
    public void mo5612a(byte[] bArr, int i) {
        super.mo5612a(bArr, i);
    }
}
