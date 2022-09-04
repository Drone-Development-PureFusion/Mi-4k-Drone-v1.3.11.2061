package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AbstractC3456a;
import com.google.android.gms.ads.formats.AbstractC3464d;
import com.google.android.gms.ads.internal.util.client.C3784b;
import com.google.android.gms.internal.AbstractC7813uu;
import com.google.android.gms.p232c.AbstractC4170e;
import java.util.ArrayList;
import java.util.List;
@aaa
/* renamed from: com.google.android.gms.internal.vc */
/* loaded from: classes.dex */
public class C7834vc extends AbstractC3464d {

    /* renamed from: a */
    private final AbstractC7831vb f25971a;

    /* renamed from: b */
    private final List<AbstractC3456a.AbstractC3457a> f25972b = new ArrayList();

    /* renamed from: c */
    private final C7816uv f25973c;

    public C7834vc(AbstractC7831vb abstractC7831vb) {
        C7816uv c7816uv;
        AbstractC7813uu mo13361d;
        this.f25971a = abstractC7831vb;
        try {
            List<Object> mo13363b = this.f25971a.mo13363b();
            if (mo13363b != null) {
                for (Object obj : mo13363b) {
                    AbstractC7813uu m13354a = m13354a(obj);
                    if (m13354a != null) {
                        this.f25972b.add(new C7816uv(m13354a));
                    }
                }
            }
        } catch (RemoteException e) {
            C3784b.m26843b("Failed to get image.", e);
        }
        try {
            mo13361d = this.f25971a.mo13361d();
        } catch (RemoteException e2) {
            C3784b.m26843b("Failed to get icon.", e2);
        }
        if (mo13361d != null) {
            c7816uv = new C7816uv(mo13361d);
            this.f25973c = c7816uv;
        }
        c7816uv = null;
        this.f25973c = c7816uv;
    }

    /* renamed from: a */
    AbstractC7813uu m13354a(Object obj) {
        if (obj instanceof IBinder) {
            return AbstractC7813uu.AbstractBinderC7814a.m13408a((IBinder) obj);
        }
        return null;
    }

    @Override // com.google.android.gms.ads.formats.AbstractC3464d
    /* renamed from: b */
    public CharSequence mo13353b() {
        try {
            return this.f25971a.mo13364a();
        } catch (RemoteException e) {
            C3784b.m26843b("Failed to get headline.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.AbstractC3464d
    /* renamed from: c */
    public List<AbstractC3456a.AbstractC3457a> mo13352c() {
        return this.f25972b;
    }

    @Override // com.google.android.gms.ads.formats.AbstractC3464d
    /* renamed from: d */
    public CharSequence mo13351d() {
        try {
            return this.f25971a.mo13362c();
        } catch (RemoteException e) {
            C3784b.m26843b("Failed to get body.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.AbstractC3464d
    /* renamed from: e */
    public AbstractC3456a.AbstractC3457a mo13350e() {
        return this.f25973c;
    }

    @Override // com.google.android.gms.ads.formats.AbstractC3464d
    /* renamed from: f */
    public CharSequence mo13349f() {
        try {
            return this.f25971a.mo13360e();
        } catch (RemoteException e) {
            C3784b.m26843b("Failed to get call to action.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.AbstractC3464d
    /* renamed from: g */
    public CharSequence mo13348g() {
        try {
            return this.f25971a.mo13359f();
        } catch (RemoteException e) {
            C3784b.m26843b("Failed to get attribution.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.AbstractC3464d
    /* renamed from: h */
    public Bundle mo13347h() {
        try {
            return this.f25971a.mo13357h();
        } catch (RemoteException e) {
            C3784b.m26839d("Failed to get extras", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.AbstractC3464d
    /* renamed from: i */
    public void mo13346i() {
        try {
            this.f25971a.mo13356i();
        } catch (RemoteException e) {
            C3784b.m26843b("Failed to destroy", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.ads.formats.AbstractC3456a
    /* renamed from: j */
    public AbstractC4170e mo13355a() {
        try {
            return this.f25971a.mo13358g();
        } catch (RemoteException e) {
            C3784b.m26843b("Failed to retrieve native ad engine.", e);
            return null;
        }
    }
}
