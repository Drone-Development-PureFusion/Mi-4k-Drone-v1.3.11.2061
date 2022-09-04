package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.maps.model.p248a.AbstractC8576a;
import java.util.List;
/* renamed from: com.google.android.gms.maps.model.i */
/* loaded from: classes2.dex */
public final class C8617i {

    /* renamed from: a */
    private final AbstractC8576a f27581a;

    public C8617i(AbstractC8576a abstractC8576a) {
        this.f27581a = (AbstractC8576a) C4588d.m23627a(abstractC8576a);
    }

    /* renamed from: a */
    public void m10985a() {
        try {
            this.f27581a.mo11254a();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public void m10984a(float f) {
        try {
            this.f27581a.mo11253a(f);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public void m10983a(int i) {
        try {
            this.f27581a.mo11252a(i);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public void m10982a(List<LatLng> list) {
        try {
            this.f27581a.mo11250a(list);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public void m10981a(boolean z) {
        try {
            this.f27581a.mo11249a(z);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: b */
    public String m10980b() {
        try {
            return this.f27581a.mo11248b();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: b */
    public void m10979b(float f) {
        try {
            this.f27581a.mo11247b(f);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: b */
    public void m10978b(boolean z) {
        try {
            this.f27581a.mo11246b(z);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: c */
    public List<LatLng> m10977c() {
        try {
            return this.f27581a.mo11245c();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: c */
    public void m10976c(boolean z) {
        try {
            this.f27581a.mo11244c(z);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: d */
    public float m10975d() {
        try {
            return this.f27581a.mo11243d();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: e */
    public int m10974e() {
        try {
            return this.f27581a.mo11242e();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8617i)) {
            return false;
        }
        try {
            return this.f27581a.mo11251a(((C8617i) obj).f27581a);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: f */
    public float m10973f() {
        try {
            return this.f27581a.mo11241f();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: g */
    public boolean m10972g() {
        try {
            return this.f27581a.mo11240g();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: h */
    public boolean m10971h() {
        try {
            return this.f27581a.mo11239h();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    public int hashCode() {
        try {
            return this.f27581a.mo11238i();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: i */
    public boolean m10970i() {
        try {
            return this.f27581a.mo11237j();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }
}
