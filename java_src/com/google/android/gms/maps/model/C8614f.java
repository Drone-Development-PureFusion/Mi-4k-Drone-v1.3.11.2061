package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.maps.model.p248a.AbstractC8591f;
/* renamed from: com.google.android.gms.maps.model.f */
/* loaded from: classes2.dex */
public final class C8614f {

    /* renamed from: a */
    private final AbstractC8591f f27578a;

    public C8614f(AbstractC8591f abstractC8591f) {
        this.f27578a = (AbstractC8591f) C4588d.m23627a(abstractC8591f);
    }

    /* renamed from: a */
    public String m11036a() {
        try {
            return this.f27578a.mo11175a();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: b */
    public String m11035b() {
        try {
            return this.f27578a.mo11173b();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: c */
    public void m11034c() {
        try {
            this.f27578a.mo11172c();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8614f)) {
            return false;
        }
        try {
            return this.f27578a.mo11174a(((C8614f) obj).f27578a);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    public int hashCode() {
        try {
            return this.f27578a.mo11171d();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }
}
