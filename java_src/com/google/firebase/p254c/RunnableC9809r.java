package com.google.firebase.p254c;

import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.util.Log;
import com.google.android.gms.internal.C7434nb;
import com.google.android.gms.internal.C7447nk;
import com.google.android.gms.p239g.C5286g;
import com.google.firebase.p254c.C9776h;
import org.json.JSONException;
/* renamed from: com.google.firebase.c.r */
/* loaded from: classes2.dex */
class RunnableC9809r implements Runnable {

    /* renamed from: a */
    private final C9779i f30620a;

    /* renamed from: b */
    private final C5286g<C9776h> f30621b;

    /* renamed from: c */
    private final C9776h f30622c;

    /* renamed from: d */
    private C9776h f30623d = null;

    /* renamed from: e */
    private C7434nb f30624e;

    public RunnableC9809r(@NonNull C9779i c9779i, @NonNull C5286g<C9776h> c5286g, @NonNull C9776h c9776h) {
        this.f30620a = c9779i;
        this.f30621b = c5286g;
        this.f30622c = c9776h;
        this.f30624e = new C7434nb(this.f30620a.m7045g(), this.f30620a.m7046f().m7126d());
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            C7447nk m14447a = this.f30620a.m7044h().m14447a(this.f30620a.m7037o(), this.f30622c.m7073s());
            this.f30624e.m14493a(m14447a);
            if (m14447a.m14429h()) {
                try {
                    this.f30623d = new C9776h.C9778a(m14447a.m14433d(), this.f30620a).m7072a();
                } catch (RemoteException | JSONException e) {
                    String valueOf = String.valueOf(m14447a.m14432e());
                    Log.e("UpdateMetadataTask", valueOf.length() != 0 ? "Unable to parse a valid JSON object from resulting metadata:".concat(valueOf) : new String("Unable to parse a valid JSON object from resulting metadata:"), e);
                    this.f30621b.m20831a(C9774g.m7117a(e));
                    return;
                }
            }
            if (this.f30621b == null) {
                return;
            }
            m14447a.m14439a((C5286g<C5286g<C9776h>>) this.f30621b, (C5286g<C9776h>) this.f30623d);
        } catch (RemoteException | JSONException e2) {
            Log.e("UpdateMetadataTask", "Unable to create the request from metadata.", e2);
            this.f30621b.m20831a(C9774g.m7117a(e2));
        }
    }
}
