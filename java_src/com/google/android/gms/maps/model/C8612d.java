package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.maps.model.p248a.AbstractC8585d;
/* renamed from: com.google.android.gms.maps.model.d */
/* loaded from: classes2.dex */
public final class C8612d {

    /* renamed from: a */
    private final AbstractC8585d f27576a;

    public C8612d(AbstractC8585d abstractC8585d) {
        this.f27576a = (AbstractC8585d) C4588d.m23627a(abstractC8585d);
    }

    /* renamed from: a */
    public void m11061a() {
        try {
            this.f27576a.mo11206a();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public void m11060a(float f) {
        try {
            this.f27576a.mo11205a(f);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public void m11059a(float f, float f2) {
        try {
            this.f27576a.mo11204a(f, f2);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public void m11058a(LatLng latLng) {
        try {
            this.f27576a.mo11202a(latLng);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public void m11057a(LatLngBounds latLngBounds) {
        try {
            this.f27576a.mo11201a(latLngBounds);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public void m11056a(C8575a c8575a) {
        try {
            this.f27576a.mo11203a(c8575a.m11256a());
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public void m11055a(boolean z) {
        try {
            this.f27576a.mo11199a(z);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: b */
    public String m11054b() {
        try {
            return this.f27576a.mo11198b();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: b */
    public void m11053b(float f) {
        try {
            this.f27576a.mo11197b(f);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: b */
    public void m11052b(boolean z) {
        try {
            this.f27576a.mo11196b(z);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: c */
    public LatLng m11051c() {
        try {
            return this.f27576a.mo11195c();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: c */
    public void m11050c(float f) {
        try {
            this.f27576a.mo11194c(f);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: d */
    public float m11049d() {
        try {
            return this.f27576a.mo11193d();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: d */
    public void m11048d(float f) {
        try {
            this.f27576a.mo11192d(f);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: e */
    public float m11047e() {
        try {
            return this.f27576a.mo11191e();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8612d)) {
            return false;
        }
        try {
            return this.f27576a.mo11200a(((C8612d) obj).f27576a);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: f */
    public LatLngBounds m11046f() {
        try {
            return this.f27576a.mo11190f();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: g */
    public float m11045g() {
        try {
            return this.f27576a.mo11189g();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: h */
    public float m11044h() {
        try {
            return this.f27576a.mo11188h();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    public int hashCode() {
        try {
            return this.f27576a.mo11185k();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: i */
    public boolean m11043i() {
        try {
            return this.f27576a.mo11187i();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: j */
    public boolean m11042j() {
        try {
            return this.f27576a.mo11184l();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: k */
    public float m11041k() {
        try {
            return this.f27576a.mo11186j();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }
}
