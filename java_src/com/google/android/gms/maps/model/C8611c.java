package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.maps.model.p248a.AbstractC8582c;
/* renamed from: com.google.android.gms.maps.model.c */
/* loaded from: classes2.dex */
public final class C8611c {

    /* renamed from: a */
    private final AbstractC8582c f27575a;

    public C8611c(AbstractC8582c abstractC8582c) {
        this.f27575a = (AbstractC8582c) C4588d.m23627a(abstractC8582c);
    }

    /* renamed from: a */
    public void m11079a() {
        try {
            this.f27575a.mo11227a();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public void m11078a(double d) {
        try {
            this.f27575a.mo11226a(d);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public void m11077a(float f) {
        try {
            this.f27575a.mo11225a(f);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public void m11076a(int i) {
        try {
            this.f27575a.mo11224a(i);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public void m11075a(LatLng latLng) {
        try {
            this.f27575a.mo11223a(latLng);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public void m11074a(boolean z) {
        try {
            this.f27575a.mo11221a(z);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: b */
    public String m11073b() {
        try {
            return this.f27575a.mo11220b();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: b */
    public void m11072b(float f) {
        try {
            this.f27575a.mo11219b(f);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: b */
    public void m11071b(int i) {
        try {
            this.f27575a.mo11218b(i);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: b */
    public void m11070b(boolean z) {
        try {
            this.f27575a.mo11217b(z);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: c */
    public LatLng m11069c() {
        try {
            return this.f27575a.mo11216c();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: d */
    public double m11068d() {
        try {
            return this.f27575a.mo11215d();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: e */
    public float m11067e() {
        try {
            return this.f27575a.mo11214e();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8611c)) {
            return false;
        }
        try {
            return this.f27575a.mo11222a(((C8611c) obj).f27575a);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: f */
    public int m11066f() {
        try {
            return this.f27575a.mo11213f();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: g */
    public int m11065g() {
        try {
            return this.f27575a.mo11212g();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: h */
    public float m11064h() {
        try {
            return this.f27575a.mo11211h();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    public int hashCode() {
        try {
            return this.f27575a.mo11209j();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: i */
    public boolean m11063i() {
        try {
            return this.f27575a.mo11210i();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: j */
    public boolean m11062j() {
        try {
            return this.f27575a.mo11208k();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }
}
