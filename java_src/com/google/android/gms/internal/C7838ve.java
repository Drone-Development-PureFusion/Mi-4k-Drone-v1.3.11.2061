package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.formats.AbstractC3456a;
import com.google.android.gms.ads.formats.AbstractC3466e;
import com.google.android.gms.ads.internal.util.client.C3784b;
import java.util.List;
@aaa
/* renamed from: com.google.android.gms.internal.ve */
/* loaded from: classes.dex */
public class C7838ve implements AbstractC3466e {

    /* renamed from: a */
    private final AbstractC7835vd f25975a;

    public C7838ve(AbstractC7835vd abstractC7835vd) {
        this.f25975a = abstractC7835vd;
    }

    @Override // com.google.android.gms.ads.formats.AbstractC3466e
    /* renamed from: a */
    public CharSequence mo13336a(String str) {
        try {
            return this.f25975a.mo13342a(str);
        } catch (RemoteException e) {
            C3784b.m26843b("Failed to get string.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.AbstractC3466e
    /* renamed from: a */
    public List<String> mo13337a() {
        try {
            return this.f25975a.mo13343a();
        } catch (RemoteException e) {
            C3784b.m26843b("Failed to get available asset names.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.AbstractC3466e
    /* renamed from: b */
    public AbstractC3456a.AbstractC3457a mo13334b(String str) {
        try {
            AbstractC7813uu mo13340b = this.f25975a.mo13340b(str);
            if (mo13340b != null) {
                return new C7816uv(mo13340b);
            }
        } catch (RemoteException e) {
            C3784b.m26843b("Failed to get image.", e);
        }
        return null;
    }

    @Override // com.google.android.gms.ads.formats.AbstractC3466e
    /* renamed from: b */
    public String mo13335b() {
        try {
            return this.f25975a.mo13338l();
        } catch (RemoteException e) {
            C3784b.m26843b("Failed to get custom template id.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.AbstractC3466e
    /* renamed from: c */
    public void mo13333c() {
        try {
            this.f25975a.mo13341b();
        } catch (RemoteException e) {
            C3784b.m26843b("Failed to record impression.", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.AbstractC3466e
    /* renamed from: c */
    public void mo13332c(String str) {
        try {
            this.f25975a.mo13339c(str);
        } catch (RemoteException e) {
            C3784b.m26843b("Failed to perform click.", e);
        }
    }
}
