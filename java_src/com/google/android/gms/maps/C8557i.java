package com.google.android.gms.maps;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.maps.model.C8618j;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import com.google.android.gms.maps.p247a.AbstractC8449g;
import com.google.android.gms.maps.p247a.AbstractC8467o;
import com.google.android.gms.maps.p247a.AbstractC8470p;
import com.google.android.gms.maps.p247a.AbstractC8473q;
import com.google.android.gms.maps.p247a.AbstractC8476r;
import com.google.android.gms.p232c.AbstractC4170e;
import com.google.android.gms.p232c.BinderC4173f;
/* renamed from: com.google.android.gms.maps.i */
/* loaded from: classes2.dex */
public class C8557i {

    /* renamed from: a */
    private final AbstractC8449g f27420a;

    /* renamed from: com.google.android.gms.maps.i$a */
    /* loaded from: classes2.dex */
    public interface AbstractC8562a {
        /* renamed from: a */
        void m11456a(StreetViewPanoramaCamera streetViewPanoramaCamera);
    }

    /* renamed from: com.google.android.gms.maps.i$b */
    /* loaded from: classes2.dex */
    public interface AbstractC8563b {
        /* renamed from: a */
        void m11455a(StreetViewPanoramaLocation streetViewPanoramaLocation);
    }

    /* renamed from: com.google.android.gms.maps.i$c */
    /* loaded from: classes2.dex */
    public interface AbstractC8564c {
        /* renamed from: a */
        void m11454a(StreetViewPanoramaOrientation streetViewPanoramaOrientation);
    }

    /* renamed from: com.google.android.gms.maps.i$d */
    /* loaded from: classes2.dex */
    public interface AbstractC8565d {
        /* renamed from: a */
        void m11453a(StreetViewPanoramaOrientation streetViewPanoramaOrientation);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C8557i(AbstractC8449g abstractC8449g) {
        this.f27420a = (AbstractC8449g) C4588d.m23627a(abstractC8449g);
    }

    /* renamed from: a */
    public Point m11472a(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        try {
            AbstractC4170e mo11713a = this.f27420a.mo11713a(streetViewPanoramaOrientation);
            if (mo11713a != null) {
                return (Point) BinderC4173f.m25294a(mo11713a);
            }
            return null;
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public AbstractC8449g m11481a() {
        return this.f27420a;
    }

    /* renamed from: a */
    public StreetViewPanoramaOrientation m11480a(Point point) {
        try {
            return this.f27420a.mo11721a(BinderC4173f.m25293a(point));
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public final void m11479a(final AbstractC8562a abstractC8562a) {
        try {
            if (abstractC8562a == null) {
                this.f27420a.mo11720a((AbstractC8467o) null);
            } else {
                this.f27420a.mo11720a(new AbstractC8467o.AbstractBinderC8468a() { // from class: com.google.android.gms.maps.i.2
                    @Override // com.google.android.gms.maps.p247a.AbstractC8467o
                    /* renamed from: a */
                    public void mo11459a(StreetViewPanoramaCamera streetViewPanoramaCamera) {
                        abstractC8562a.m11456a(streetViewPanoramaCamera);
                    }
                });
            }
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public final void m11478a(final AbstractC8563b abstractC8563b) {
        try {
            if (abstractC8563b == null) {
                this.f27420a.mo11719a((AbstractC8470p) null);
            } else {
                this.f27420a.mo11719a(new AbstractC8470p.AbstractBinderC8471a() { // from class: com.google.android.gms.maps.i.1
                    @Override // com.google.android.gms.maps.p247a.AbstractC8470p
                    /* renamed from: a */
                    public void mo11460a(StreetViewPanoramaLocation streetViewPanoramaLocation) {
                        abstractC8563b.m11455a(streetViewPanoramaLocation);
                    }
                });
            }
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public final void m11477a(final AbstractC8564c abstractC8564c) {
        try {
            if (abstractC8564c == null) {
                this.f27420a.mo11718a((AbstractC8473q) null);
            } else {
                this.f27420a.mo11718a(new AbstractC8473q.AbstractBinderC8474a() { // from class: com.google.android.gms.maps.i.3
                    @Override // com.google.android.gms.maps.p247a.AbstractC8473q
                    /* renamed from: a */
                    public void mo11458a(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
                        abstractC8564c.m11454a(streetViewPanoramaOrientation);
                    }
                });
            }
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public final void m11476a(final AbstractC8565d abstractC8565d) {
        try {
            if (abstractC8565d == null) {
                this.f27420a.mo11717a((AbstractC8476r) null);
            } else {
                this.f27420a.mo11717a(new AbstractC8476r.AbstractBinderC8477a() { // from class: com.google.android.gms.maps.i.4
                    @Override // com.google.android.gms.maps.p247a.AbstractC8476r
                    /* renamed from: a */
                    public void mo11457a(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
                        abstractC8565d.m11453a(streetViewPanoramaOrientation);
                    }
                });
            }
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public void m11475a(LatLng latLng) {
        try {
            this.f27420a.mo11716a(latLng);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public void m11474a(LatLng latLng, int i) {
        try {
            this.f27420a.mo11715a(latLng, i);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public void m11473a(StreetViewPanoramaCamera streetViewPanoramaCamera, long j) {
        try {
            this.f27420a.mo11714a(streetViewPanoramaCamera, j);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public void m11471a(String str) {
        try {
            this.f27420a.mo11712a(str);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public void m11470a(boolean z) {
        try {
            this.f27420a.mo11711a(z);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: b */
    public void m11468b(boolean z) {
        try {
            this.f27420a.mo11709b(z);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: b */
    public boolean m11469b() {
        try {
            return this.f27420a.mo11722a();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: c */
    public void m11466c(boolean z) {
        try {
            this.f27420a.mo11707c(z);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: c */
    public boolean m11467c() {
        try {
            return this.f27420a.mo11710b();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: d */
    public void m11464d(boolean z) {
        try {
            this.f27420a.mo11705d(z);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: d */
    public boolean m11465d() {
        try {
            return this.f27420a.mo11708c();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: e */
    public boolean m11463e() {
        try {
            return this.f27420a.mo11706d();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: f */
    public StreetViewPanoramaCamera m11462f() {
        try {
            return this.f27420a.mo11704e();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: g */
    public StreetViewPanoramaLocation m11461g() {
        try {
            return this.f27420a.mo11703f();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }
}
