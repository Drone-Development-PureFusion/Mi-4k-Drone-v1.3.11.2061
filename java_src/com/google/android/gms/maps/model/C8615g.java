package com.google.android.gms.maps.model;

import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.maps.model.p248a.AbstractC8594g;
import com.google.android.gms.p232c.AbstractC4170e;
import com.google.android.gms.p232c.BinderC4173f;
/* renamed from: com.google.android.gms.maps.model.g */
/* loaded from: classes2.dex */
public final class C8615g {

    /* renamed from: a */
    private final AbstractC8594g f27579a;

    public C8615g(AbstractC8594g abstractC8594g) {
        this.f27579a = (AbstractC8594g) C4588d.m23627a(abstractC8594g);
    }

    /* renamed from: a */
    public void m11033a() {
        try {
            this.f27579a.mo11169a();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public void m11032a(float f) {
        try {
            this.f27579a.mo11154c(f);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public void m11031a(float f, float f2) {
        try {
            this.f27579a.mo11167a(f, f2);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public void m11030a(@NonNull LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("latlng cannot be null - a position is required.");
        }
        try {
            this.f27579a.mo11165a(latLng);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public void m11029a(@Nullable C8575a c8575a) {
        try {
            if (c8575a == null) {
                this.f27579a.mo11166a((AbstractC4170e) null);
            } else {
                this.f27579a.mo11166a(c8575a.m11256a());
            }
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public void m11028a(Object obj) {
        try {
            this.f27579a.mo11158b(BinderC4173f.m25293a(obj));
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public void m11027a(@Nullable String str) {
        try {
            this.f27579a.mo11163a(str);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public void m11026a(boolean z) {
        try {
            this.f27579a.mo11162a(z);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: b */
    public String m11025b() {
        try {
            return this.f27579a.mo11161b();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: b */
    public void m11024b(float f) {
        try {
            this.f27579a.mo11168a(f);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: b */
    public void m11023b(float f, float f2) {
        try {
            this.f27579a.mo11159b(f, f2);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: b */
    public void m11022b(@Nullable String str) {
        try {
            this.f27579a.mo11157b(str);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: b */
    public void m11021b(boolean z) {
        try {
            this.f27579a.mo11156b(z);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: c */
    public LatLng m11020c() {
        try {
            return this.f27579a.mo11155c();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: c */
    public void m11019c(float f) {
        try {
            this.f27579a.mo11160b(f);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: c */
    public void m11018c(boolean z) {
        try {
            this.f27579a.mo11153c(z);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: d */
    public float m11017d() {
        try {
            return this.f27579a.mo11141o();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: e */
    public String m11016e() {
        try {
            return this.f27579a.mo11152d();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8615g)) {
            return false;
        }
        try {
            return this.f27579a.mo11164a(((C8615g) obj).f27579a);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: f */
    public String m11015f() {
        try {
            return this.f27579a.mo11151e();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: g */
    public boolean m11014g() {
        try {
            return this.f27579a.mo11150f();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: h */
    public void m11013h() {
        try {
            this.f27579a.mo11149g();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    public int hashCode() {
        try {
            return this.f27579a.mo11145k();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: i */
    public void m11012i() {
        try {
            this.f27579a.mo11148h();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: j */
    public boolean m11011j() {
        try {
            return this.f27579a.mo11147i();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: k */
    public boolean m11010k() {
        try {
            return this.f27579a.mo11146j();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: l */
    public boolean m11009l() {
        try {
            return this.f27579a.mo11144l();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: m */
    public float m11008m() {
        try {
            return this.f27579a.mo11143m();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: n */
    public float m11007n() {
        try {
            return this.f27579a.mo11142n();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: o */
    public Object m11006o() {
        try {
            return BinderC4173f.m25294a(this.f27579a.mo11140p());
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }
}
