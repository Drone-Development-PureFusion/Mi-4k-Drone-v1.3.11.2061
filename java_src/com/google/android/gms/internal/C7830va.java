package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.C3471h;
import com.google.android.gms.ads.formats.AbstractC3456a;
import com.google.android.gms.ads.formats.AbstractC3462c;
import com.google.android.gms.ads.internal.util.client.C3784b;
import com.google.android.gms.internal.AbstractC7813uu;
import com.google.android.gms.p232c.AbstractC4170e;
import java.util.ArrayList;
import java.util.List;
@aaa
/* renamed from: com.google.android.gms.internal.va */
/* loaded from: classes.dex */
public class C7830va extends AbstractC3462c {

    /* renamed from: a */
    private final AbstractC7826uz f25966a;

    /* renamed from: c */
    private final C7816uv f25968c;

    /* renamed from: b */
    private final List<AbstractC3456a.AbstractC3457a> f25967b = new ArrayList();

    /* renamed from: d */
    private C3471h f25969d = new C3471h();

    public C7830va(AbstractC7826uz abstractC7826uz) {
        C7816uv c7816uv;
        AbstractC7813uu mo13387d;
        this.f25966a = abstractC7826uz;
        try {
            List<Object> mo13389b = this.f25966a.mo13389b();
            if (mo13389b != null) {
                for (Object obj : mo13389b) {
                    AbstractC7813uu m13378a = m13378a(obj);
                    if (m13378a != null) {
                        this.f25967b.add(new C7816uv(m13378a));
                    }
                }
            }
        } catch (RemoteException e) {
            C3784b.m26843b("Failed to get image.", e);
        }
        try {
            mo13387d = this.f25966a.mo13387d();
        } catch (RemoteException e2) {
            C3784b.m26843b("Failed to get icon.", e2);
        }
        if (mo13387d != null) {
            c7816uv = new C7816uv(mo13387d);
            this.f25968c = c7816uv;
        }
        c7816uv = null;
        this.f25968c = c7816uv;
    }

    /* renamed from: a */
    AbstractC7813uu m13378a(Object obj) {
        if (obj instanceof IBinder) {
            return AbstractC7813uu.AbstractBinderC7814a.m13408a((IBinder) obj);
        }
        return null;
    }

    @Override // com.google.android.gms.ads.formats.AbstractC3462c
    /* renamed from: b */
    public CharSequence mo13377b() {
        try {
            return this.f25966a.mo13390a();
        } catch (RemoteException e) {
            C3784b.m26843b("Failed to get headline.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.AbstractC3462c
    /* renamed from: c */
    public List<AbstractC3456a.AbstractC3457a> mo13376c() {
        return this.f25967b;
    }

    @Override // com.google.android.gms.ads.formats.AbstractC3462c
    /* renamed from: d */
    public CharSequence mo13375d() {
        try {
            return this.f25966a.mo13388c();
        } catch (RemoteException e) {
            C3784b.m26843b("Failed to get body.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.AbstractC3462c
    /* renamed from: e */
    public AbstractC3456a.AbstractC3457a mo13374e() {
        return this.f25968c;
    }

    @Override // com.google.android.gms.ads.formats.AbstractC3462c
    /* renamed from: f */
    public CharSequence mo13373f() {
        try {
            return this.f25966a.mo13386e();
        } catch (RemoteException e) {
            C3784b.m26843b("Failed to get call to action.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.AbstractC3462c
    /* renamed from: g */
    public Double mo13372g() {
        try {
            double mo13385f = this.f25966a.mo13385f();
            if (mo13385f != -1.0d) {
                return Double.valueOf(mo13385f);
            }
            return null;
        } catch (RemoteException e) {
            C3784b.m26843b("Failed to get star rating.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.AbstractC3462c
    /* renamed from: h */
    public CharSequence mo13371h() {
        try {
            return this.f25966a.mo13384g();
        } catch (RemoteException e) {
            C3784b.m26843b("Failed to get store", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.AbstractC3462c
    /* renamed from: i */
    public CharSequence mo13370i() {
        try {
            return this.f25966a.mo13383h();
        } catch (RemoteException e) {
            C3784b.m26843b("Failed to get price.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.AbstractC3462c
    /* renamed from: j */
    public C3471h mo13369j() {
        try {
            if (this.f25966a.mo13382i() != null) {
                this.f25969d.m27699a(this.f25966a.mo13382i());
            }
        } catch (RemoteException e) {
            C3784b.m26843b("Exception occurred while getting video controller", e);
        }
        return this.f25969d;
    }

    @Override // com.google.android.gms.ads.formats.AbstractC3462c
    /* renamed from: k */
    public Bundle mo13368k() {
        try {
            return this.f25966a.mo13380n();
        } catch (RemoteException e) {
            C3784b.m26843b("Failed to get extras", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.AbstractC3462c
    /* renamed from: l */
    public void mo13367l() {
        try {
            this.f25966a.mo13379p();
        } catch (RemoteException e) {
            C3784b.m26843b("Failed to destroy", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.ads.formats.AbstractC3456a
    /* renamed from: m */
    public AbstractC4170e mo13355a() {
        try {
            return this.f25966a.mo13381j();
        } catch (RemoteException e) {
            C3784b.m26843b("Failed to retrieve native ad engine.", e);
            return null;
        }
    }
}
