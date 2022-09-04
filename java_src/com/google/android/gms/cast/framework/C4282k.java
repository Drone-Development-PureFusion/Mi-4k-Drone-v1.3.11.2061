package com.google.android.gms.cast.framework;

import android.os.RemoteException;
import com.google.android.gms.cast.internal.C4440m;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.p232c.AbstractC4170e;
import com.google.android.gms.p232c.BinderC4173f;
/* renamed from: com.google.android.gms.cast.framework.k */
/* loaded from: classes.dex */
public class C4282k {

    /* renamed from: a */
    private static final C4440m f16240a = new C4440m("SessionManager");

    /* renamed from: b */
    private final AbstractC4238aa f16241b;

    public C4282k(AbstractC4238aa abstractC4238aa) {
        this.f16241b = abstractC4238aa;
    }

    /* renamed from: a */
    public AbstractC4279j m24720a() {
        try {
            return (AbstractC4279j) BinderC4173f.m25294a(this.f16241b.mo24892a());
        } catch (RemoteException e) {
            f16240a.m24163a(e, "Unable to call %s on %s.", "getWrappedCurrentSession", AbstractC4238aa.class.getSimpleName());
            return null;
        }
    }

    /* renamed from: a */
    public void m24719a(AbstractC4260f abstractC4260f) {
        C4588d.m23627a(abstractC4260f);
        try {
            this.f16241b.mo24890a(new BinderC4351p(abstractC4260f));
        } catch (RemoteException e) {
            f16240a.m24163a(e, "Unable to call %s on %s.", "addCastStateListener", AbstractC4238aa.class.getSimpleName());
        }
    }

    /* renamed from: a */
    public void m24718a(AbstractC4283l<AbstractC4279j> abstractC4283l) {
        m24717a(abstractC4283l, AbstractC4279j.class);
    }

    /* renamed from: a */
    public <T extends AbstractC4279j> void m24717a(AbstractC4283l<T> abstractC4283l, Class<T> cls) {
        C4588d.m23627a(abstractC4283l);
        C4588d.m23627a(cls);
        try {
            this.f16241b.mo24891a(new BinderC4249ae(abstractC4283l, cls));
        } catch (RemoteException e) {
            f16240a.m24163a(e, "Unable to call %s on %s.", "addSessionManagerListener", AbstractC4238aa.class.getSimpleName());
        }
    }

    /* renamed from: a */
    public void m24716a(boolean z) {
        try {
            this.f16241b.mo24889a(true, z);
        } catch (RemoteException e) {
            f16240a.m24163a(e, "Unable to call %s on %s.", "endCurrentSession", AbstractC4238aa.class.getSimpleName());
        }
    }

    /* renamed from: b */
    public C4253d m24715b() {
        AbstractC4279j m24720a = m24720a();
        if (m24720a == null || !(m24720a instanceof C4253d)) {
            return null;
        }
        return (C4253d) m24720a;
    }

    /* renamed from: b */
    public void m24714b(AbstractC4260f abstractC4260f) {
        if (abstractC4260f == null) {
            return;
        }
        try {
            this.f16241b.mo24886b(new BinderC4351p(abstractC4260f));
        } catch (RemoteException e) {
            f16240a.m24163a(e, "Unable to call %s on %s.", "removeCastStateListener", AbstractC4238aa.class.getSimpleName());
        }
    }

    /* renamed from: b */
    public void m24713b(AbstractC4283l<AbstractC4279j> abstractC4283l) {
        m24712b(abstractC4283l, AbstractC4279j.class);
    }

    /* renamed from: b */
    public <T extends AbstractC4279j> void m24712b(AbstractC4283l<T> abstractC4283l, Class cls) {
        C4588d.m23627a(cls);
        if (abstractC4283l == null) {
            return;
        }
        try {
            this.f16241b.mo24887b(new BinderC4249ae(abstractC4283l, cls));
        } catch (RemoteException e) {
            f16240a.m24163a(e, "Unable to call %s on %s.", "removeSessionManagerListener", AbstractC4238aa.class.getSimpleName());
        }
    }

    /* renamed from: c */
    public AbstractC4170e m24711c() {
        try {
            return this.f16241b.mo24888b();
        } catch (RemoteException e) {
            f16240a.m24163a(e, "Unable to call %s on %s.", "getWrappedThis", AbstractC4238aa.class.getSimpleName());
            return null;
        }
    }
}
