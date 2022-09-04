package com.google.android.gms.cast.framework;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.cast.framework.AbstractC4246ad;
import com.google.android.gms.cast.internal.C4440m;
import com.google.android.gms.internal.afc;
import com.google.android.gms.p232c.AbstractC4170e;
import com.google.android.gms.p232c.BinderC4173f;
/* renamed from: com.google.android.gms.cast.framework.j */
/* loaded from: classes.dex */
public abstract class AbstractC4279j {

    /* renamed from: a */
    private static final C4440m f16236a = new C4440m("Session");

    /* renamed from: b */
    private final AbstractC4377z f16237b;

    /* renamed from: c */
    private final BinderC4281a f16238c = new BinderC4281a();

    /* renamed from: com.google.android.gms.cast.framework.j$a */
    /* loaded from: classes2.dex */
    private class BinderC4281a extends AbstractC4246ad.AbstractBinderC4247a {
        private BinderC4281a() {
        }

        @Override // com.google.android.gms.cast.framework.AbstractC4246ad
        /* renamed from: a */
        public int mo24726a() {
            return 9683208;
        }

        @Override // com.google.android.gms.cast.framework.AbstractC4246ad
        /* renamed from: a */
        public void mo24725a(Bundle bundle) {
            AbstractC4279j.this.mo24744a(bundle);
        }

        @Override // com.google.android.gms.cast.framework.AbstractC4246ad
        /* renamed from: a */
        public void mo24724a(boolean z) {
            AbstractC4279j.this.mo24743a(z);
        }

        @Override // com.google.android.gms.cast.framework.AbstractC4246ad
        /* renamed from: b */
        public AbstractC4170e mo24723b() {
            return BinderC4173f.m25293a(AbstractC4279j.this);
        }

        @Override // com.google.android.gms.cast.framework.AbstractC4246ad
        /* renamed from: b */
        public void mo24722b(Bundle bundle) {
            AbstractC4279j.this.mo24741b(bundle);
        }

        @Override // com.google.android.gms.cast.framework.AbstractC4246ad
        /* renamed from: c */
        public long mo24721c() {
            return AbstractC4279j.this.mo24736k();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC4279j(Context context, String str, String str2) {
        this.f16237b = afc.m17808a(context, str, str2, this.f16238c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m24745a(int i) {
        try {
            this.f16237b.mo24369a(i);
        } catch (RemoteException e) {
            f16236a.m24163a(e, "Unable to call %s on %s.", "notifyFailedToStartSession", AbstractC4377z.class.getSimpleName());
        }
    }

    /* renamed from: a */
    protected abstract void mo24744a(Bundle bundle);

    /* renamed from: a */
    protected abstract void mo24743a(boolean z);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final void m24742b(int i) {
        try {
            this.f16237b.mo24365b(i);
        } catch (RemoteException e) {
            f16236a.m24163a(e, "Unable to call %s on %s.", "notifySessionEnded", AbstractC4377z.class.getSimpleName());
        }
    }

    /* renamed from: b */
    protected abstract void mo24741b(Bundle bundle);

    /* renamed from: b */
    protected final void m24740b(String str) {
        try {
            this.f16237b.mo24368a(str);
        } catch (RemoteException e) {
            f16236a.m24163a(e, "Unable to call %s on %s.", "notifySessionStarted", AbstractC4377z.class.getSimpleName());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final void m24739c(int i) {
        try {
            this.f16237b.mo24363c(i);
        } catch (RemoteException e) {
            f16236a.m24163a(e, "Unable to call %s on %s.", "notifyFailedToResumeSession", AbstractC4377z.class.getSimpleName());
        }
    }

    /* renamed from: c */
    protected final void m24738c(boolean z) {
        try {
            this.f16237b.mo24367a(z);
        } catch (RemoteException e) {
            f16236a.m24163a(e, "Unable to call %s on %s.", "notifySessionResumed", AbstractC4377z.class.getSimpleName());
        }
    }

    /* renamed from: d */
    protected final void m24737d(int i) {
        try {
            this.f16237b.mo24361d(i);
        } catch (RemoteException e) {
            f16236a.m24163a(e, "Unable to call %s on %s.", "notifySessionSuspended", AbstractC4377z.class.getSimpleName());
        }
    }

    /* renamed from: k */
    public long mo24736k() {
        return 0L;
    }

    /* renamed from: m */
    public final String m24735m() {
        try {
            return this.f16237b.mo24366b();
        } catch (RemoteException e) {
            f16236a.m24163a(e, "Unable to call %s on %s.", "getCategory", AbstractC4377z.class.getSimpleName());
            return null;
        }
    }

    /* renamed from: n */
    public final String m24734n() {
        try {
            return this.f16237b.mo24364c();
        } catch (RemoteException e) {
            f16236a.m24163a(e, "Unable to call %s on %s.", "getSessionId", AbstractC4377z.class.getSimpleName());
            return null;
        }
    }

    /* renamed from: o */
    public boolean m24733o() {
        try {
            return this.f16237b.mo24360e();
        } catch (RemoteException e) {
            f16236a.m24163a(e, "Unable to call %s on %s.", "isConnected", AbstractC4377z.class.getSimpleName());
            return false;
        }
    }

    /* renamed from: p */
    public boolean m24732p() {
        try {
            return this.f16237b.mo24359f();
        } catch (RemoteException e) {
            f16236a.m24163a(e, "Unable to call %s on %s.", "isConnecting", AbstractC4377z.class.getSimpleName());
            return false;
        }
    }

    /* renamed from: q */
    public boolean m24731q() {
        try {
            return this.f16237b.mo24358g();
        } catch (RemoteException e) {
            f16236a.m24163a(e, "Unable to call %s on %s.", "isDisconnecting", AbstractC4377z.class.getSimpleName());
            return false;
        }
    }

    /* renamed from: r */
    public boolean m24730r() {
        try {
            return this.f16237b.mo24357h();
        } catch (RemoteException e) {
            f16236a.m24163a(e, "Unable to call %s on %s.", "isDisconnected", AbstractC4377z.class.getSimpleName());
            return true;
        }
    }

    /* renamed from: s */
    public boolean m24729s() {
        try {
            return this.f16237b.mo24356i();
        } catch (RemoteException e) {
            f16236a.m24163a(e, "Unable to call %s on %s.", "isResuming", AbstractC4377z.class.getSimpleName());
            return false;
        }
    }

    /* renamed from: t */
    public boolean m24728t() {
        try {
            return this.f16237b.mo24355j();
        } catch (RemoteException e) {
            f16236a.m24163a(e, "Unable to call %s on %s.", "isSuspended", AbstractC4377z.class.getSimpleName());
            return false;
        }
    }

    /* renamed from: u */
    public final AbstractC4170e m24727u() {
        try {
            return this.f16237b.mo24370a();
        } catch (RemoteException e) {
            f16236a.m24163a(e, "Unable to call %s on %s.", "getWrappedObject", AbstractC4377z.class.getSimpleName());
            return null;
        }
    }
}
