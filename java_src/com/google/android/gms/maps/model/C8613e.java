package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.maps.model.p248a.AbstractC8588e;
import com.google.android.gms.maps.model.p248a.AbstractC8591f;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.google.android.gms.maps.model.e */
/* loaded from: classes2.dex */
public final class C8613e {

    /* renamed from: a */
    private final AbstractC8588e f27577a;

    public C8613e(AbstractC8588e abstractC8588e) {
        this.f27577a = (AbstractC8588e) C4588d.m23627a(abstractC8588e);
    }

    /* renamed from: a */
    public int m11040a() {
        try {
            return this.f27577a.mo11182a();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: b */
    public int m11039b() {
        try {
            return this.f27577a.mo11182a();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: c */
    public List<C8614f> m11038c() {
        try {
            List<IBinder> mo11179c = this.f27577a.mo11179c();
            ArrayList arrayList = new ArrayList(mo11179c.size());
            for (IBinder iBinder : mo11179c) {
                arrayList.add(new C8614f(AbstractC8591f.AbstractBinderC8592a.m11176a(iBinder)));
            }
            return arrayList;
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: d */
    public boolean m11037d() {
        try {
            return this.f27577a.mo11178d();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8613e)) {
            return false;
        }
        try {
            return this.f27577a.mo11181a(((C8613e) obj).f27577a);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    public int hashCode() {
        try {
            return this.f27577a.mo11177e();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }
}
