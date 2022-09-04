package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.maps.model.p248a.AbstractC8600i;
/* renamed from: com.google.android.gms.maps.model.k */
/* loaded from: classes2.dex */
public final class C8619k {

    /* renamed from: a */
    private final AbstractC8600i f27582a;

    public C8619k(AbstractC8600i abstractC8600i) {
        this.f27582a = (AbstractC8600i) C4588d.m23627a(abstractC8600i);
    }

    /* renamed from: a */
    public void m10969a() {
        try {
            this.f27582a.mo11115a();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public void m10968a(float f) {
        try {
            this.f27582a.mo11114a(f);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public void m10967a(boolean z) {
        try {
            this.f27582a.mo11112a(z);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: b */
    public void m10966b() {
        try {
            this.f27582a.mo11111b();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: b */
    public void m10965b(float f) {
        try {
            this.f27582a.mo11110b(f);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: b */
    public void m10964b(boolean z) {
        try {
            this.f27582a.mo11109b(z);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: c */
    public String m10963c() {
        try {
            return this.f27582a.mo11108c();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: d */
    public float m10962d() {
        try {
            return this.f27582a.mo11107d();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: e */
    public boolean m10961e() {
        try {
            return this.f27582a.mo11106e();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8619k)) {
            return false;
        }
        try {
            return this.f27582a.mo11113a(((C8619k) obj).f27582a);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: f */
    public boolean m10960f() {
        try {
            return this.f27582a.mo11104g();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: g */
    public float m10959g() {
        try {
            return this.f27582a.mo11103h();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    public int hashCode() {
        try {
            return this.f27582a.mo11105f();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }
}
