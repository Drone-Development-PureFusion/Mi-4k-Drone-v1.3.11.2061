package com.google.android.gms.cast.framework;

import android.os.RemoteException;
import com.google.android.gms.cast.internal.C4440m;
import com.google.android.gms.p232c.AbstractC4170e;
/* renamed from: com.google.android.gms.cast.framework.q */
/* loaded from: classes.dex */
public class C4352q {

    /* renamed from: a */
    private static final C4440m f16464a = new C4440m("DiscoveryManager");

    /* renamed from: b */
    private final AbstractC4368w f16465b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4352q(AbstractC4368w abstractC4368w) {
        this.f16465b = abstractC4368w;
    }

    /* renamed from: a */
    public AbstractC4170e m24421a() {
        try {
            return this.f16465b.mo24382c();
        } catch (RemoteException e) {
            f16464a.m24163a(e, "Unable to call %s on %s.", "getWrappedThis", AbstractC4368w.class.getSimpleName());
            return null;
        }
    }
}
