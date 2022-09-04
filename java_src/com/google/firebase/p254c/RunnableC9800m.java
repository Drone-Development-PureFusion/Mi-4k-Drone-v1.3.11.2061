package com.google.firebase.p254c;

import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.util.Log;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.C7434nb;
import com.google.android.gms.internal.C7447nk;
import com.google.android.gms.p239g.C5286g;
/* renamed from: com.google.firebase.c.m */
/* loaded from: classes2.dex */
class RunnableC9800m implements Runnable {

    /* renamed from: a */
    private C9779i f30589a;

    /* renamed from: b */
    private C5286g<Void> f30590b;

    /* renamed from: c */
    private C7434nb f30591c;

    public RunnableC9800m(@NonNull C9779i c9779i, @NonNull C5286g<Void> c5286g) {
        C4588d.m23627a(c9779i);
        C4588d.m23627a(c5286g);
        this.f30589a = c9779i;
        this.f30590b = c5286g;
        this.f30591c = new C7434nb(this.f30589a.m7046f().m7124f(), this.f30589a.m7046f().m7126d());
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            C7447nk m14451a = this.f30589a.m7044h().m14451a(this.f30589a.m7037o());
            this.f30591c.m14493a(m14451a);
            m14451a.m14439a((C5286g<C5286g<Void>>) this.f30590b, (C5286g<Void>) null);
        } catch (RemoteException e) {
            Log.e("DeleteStorageTask", "Unable to create Firebase Storage network request.", e);
            this.f30590b.m20831a(C9774g.m7117a(e));
        }
    }
}
