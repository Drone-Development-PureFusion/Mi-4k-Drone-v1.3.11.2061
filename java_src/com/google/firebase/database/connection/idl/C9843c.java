package com.google.firebase.database.connection.idl;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.AbstractC7102hq;
import com.google.android.gms.internal.AbstractC7103hr;
import com.google.android.gms.internal.AbstractC7121hu;
import com.google.android.gms.internal.C7099hn;
import com.google.android.gms.p232c.BinderC4173f;
import com.google.firebase.database.connection.idl.AbstractC9853g;
import com.google.firebase.database.connection.idl.AbstractC9862j;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.firebase.database.connection.idl.c */
/* loaded from: classes2.dex */
public class C9843c implements AbstractC7103hr {

    /* renamed from: a */
    private final AbstractC9856h f30708a;

    private C9843c(AbstractC9856h abstractC9856h) {
        this.f30708a = abstractC9856h;
    }

    /* renamed from: a */
    public static C9843c m6813a(Context context, ConnectionConfig connectionConfig, C7099hn c7099hn, AbstractC7103hr.AbstractC7104a abstractC7104a) {
        return new C9843c(IPersistentConnectionImpl.loadDynamic(context, connectionConfig, c7099hn.m15583b(), c7099hn.m15582c(), abstractC7104a));
    }

    /* renamed from: a */
    private static AbstractC9862j m6812a(final AbstractC7121hu abstractC7121hu) {
        return new AbstractC9862j.AbstractBinderC9863a() { // from class: com.google.firebase.database.connection.idl.c.2
            @Override // com.google.firebase.database.connection.idl.AbstractC9862j
            /* renamed from: a */
            public void mo6776a(String str, String str2) {
                AbstractC7121hu.this.mo6832a(str, str2);
            }
        };
    }

    @Override // com.google.android.gms.internal.AbstractC7103hr
    /* renamed from: a */
    public void mo6814a() {
        try {
            this.f30708a.initialize();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7103hr
    /* renamed from: a */
    public void mo6811a(List<String> list, AbstractC7121hu abstractC7121hu) {
        try {
            this.f30708a.onDisconnectCancel(list, m6812a(abstractC7121hu));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7103hr
    /* renamed from: a */
    public void mo6810a(List<String> list, Object obj, AbstractC7121hu abstractC7121hu) {
        try {
            this.f30708a.put(list, BinderC4173f.m25293a(obj), m6812a(abstractC7121hu));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7103hr
    /* renamed from: a */
    public void mo6809a(List<String> list, Object obj, String str, AbstractC7121hu abstractC7121hu) {
        try {
            this.f30708a.compareAndPut(list, BinderC4173f.m25293a(obj), str, m6812a(abstractC7121hu));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7103hr
    /* renamed from: a */
    public void mo6808a(List<String> list, Map<String, Object> map) {
        try {
            this.f30708a.unlisten(list, BinderC4173f.m25293a(map));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7103hr
    /* renamed from: a */
    public void mo6807a(List<String> list, Map<String, Object> map, final AbstractC7102hq abstractC7102hq, Long l, AbstractC7121hu abstractC7121hu) {
        long longValue;
        AbstractC9853g.AbstractBinderC9854a abstractBinderC9854a = new AbstractC9853g.AbstractBinderC9854a() { // from class: com.google.firebase.database.connection.idl.c.1
            @Override // com.google.firebase.database.connection.idl.AbstractC9853g
            /* renamed from: a */
            public String mo6787a() {
                return abstractC7102hq.mo6835a();
            }

            @Override // com.google.firebase.database.connection.idl.AbstractC9853g
            /* renamed from: b */
            public boolean mo6786b() {
                return abstractC7102hq.mo6834b();
            }

            @Override // com.google.firebase.database.connection.idl.AbstractC9853g
            /* renamed from: c */
            public CompoundHashParcelable mo6785c() {
                return CompoundHashParcelable.m6850a(abstractC7102hq.mo6833c());
            }
        };
        if (l != null) {
            try {
                longValue = l.longValue();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } else {
            longValue = -1;
        }
        this.f30708a.listen(list, BinderC4173f.m25293a(map), abstractBinderC9854a, longValue, m6812a(abstractC7121hu));
    }

    @Override // com.google.android.gms.internal.AbstractC7103hr
    /* renamed from: a */
    public void mo6806a(List<String> list, Map<String, Object> map, AbstractC7121hu abstractC7121hu) {
        try {
            this.f30708a.merge(list, BinderC4173f.m25293a(map), m6812a(abstractC7121hu));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7103hr
    /* renamed from: b */
    public void mo6805b() {
        try {
            this.f30708a.shutdown();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7103hr
    /* renamed from: b */
    public void mo6804b(List<String> list, Object obj, AbstractC7121hu abstractC7121hu) {
        try {
            this.f30708a.onDisconnectPut(list, BinderC4173f.m25293a(obj), m6812a(abstractC7121hu));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7103hr
    /* renamed from: b */
    public void mo6803b(List<String> list, Map<String, Object> map, AbstractC7121hu abstractC7121hu) {
        try {
            this.f30708a.onDisconnectMerge(list, BinderC4173f.m25293a(map), m6812a(abstractC7121hu));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7103hr
    /* renamed from: c */
    public void mo6802c() {
        try {
            this.f30708a.refreshAuthToken();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7103hr
    /* renamed from: c */
    public void mo6801c(String str) {
        try {
            this.f30708a.refreshAuthToken2(str);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7103hr
    /* renamed from: d */
    public void mo6800d() {
        try {
            this.f30708a.purgeOutstandingWrites();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7103hr
    /* renamed from: d */
    public void mo6799d(String str) {
        try {
            this.f30708a.interrupt(str);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7103hr
    /* renamed from: e */
    public void mo6798e(String str) {
        try {
            this.f30708a.resume(str);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7103hr
    /* renamed from: f */
    public boolean mo6797f(String str) {
        try {
            return this.f30708a.isInterrupted(str);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
