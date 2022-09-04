package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.maps.model.p248a.AbstractC8597h;
import java.util.List;
/* renamed from: com.google.android.gms.maps.model.h */
/* loaded from: classes2.dex */
public final class C8616h {

    /* renamed from: a */
    private final AbstractC8597h f27580a;

    public C8616h(AbstractC8597h abstractC8597h) {
        this.f27580a = (AbstractC8597h) C4588d.m23627a(abstractC8597h);
    }

    /* renamed from: a */
    public void m11005a() {
        try {
            this.f27580a.mo11138a();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public void m11004a(float f) {
        try {
            this.f27580a.mo11137a(f);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public void m11003a(int i) {
        try {
            this.f27580a.mo11136a(i);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public void m11002a(List<LatLng> list) {
        try {
            this.f27580a.mo11134a(list);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public void m11001a(boolean z) {
        try {
            this.f27580a.mo11133a(z);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: b */
    public String m11000b() {
        try {
            return this.f27580a.mo11132b();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: b */
    public void m10999b(float f) {
        try {
            this.f27580a.mo11131b(f);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: b */
    public void m10998b(int i) {
        try {
            this.f27580a.mo11130b(i);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: b */
    public void m10997b(List<? extends List<LatLng>> list) {
        try {
            this.f27580a.mo11129b(list);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: b */
    public void m10996b(boolean z) {
        try {
            this.f27580a.mo11128b(z);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: c */
    public List<LatLng> m10995c() {
        try {
            return this.f27580a.mo11127c();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: c */
    public void m10994c(boolean z) {
        try {
            this.f27580a.mo11126c(z);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: d */
    public List<List<LatLng>> m10993d() {
        try {
            return this.f27580a.mo11125d();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: e */
    public float m10992e() {
        try {
            return this.f27580a.mo11124e();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8616h)) {
            return false;
        }
        try {
            return this.f27580a.mo11135a(((C8616h) obj).f27580a);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: f */
    public int m10991f() {
        try {
            return this.f27580a.mo11123f();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: g */
    public int m10990g() {
        try {
            return this.f27580a.mo11122g();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: h */
    public float m10989h() {
        try {
            return this.f27580a.mo11121h();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    public int hashCode() {
        try {
            return this.f27580a.mo11118k();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: i */
    public boolean m10988i() {
        try {
            return this.f27580a.mo11120i();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: j */
    public boolean m10987j() {
        try {
            return this.f27580a.mo11119j();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: k */
    public boolean m10986k() {
        try {
            return this.f27580a.mo11117l();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }
}
