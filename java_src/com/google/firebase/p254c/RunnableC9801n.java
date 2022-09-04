package com.google.firebase.p254c;

import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.util.Log;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.C7434nb;
import com.google.android.gms.internal.C7447nk;
import com.google.android.gms.p239g.C5286g;
import com.google.firebase.p254c.C9776h;
import org.json.JSONException;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.c.n */
/* loaded from: classes2.dex */
public class RunnableC9801n implements Runnable {

    /* renamed from: a */
    private C9779i f30592a;

    /* renamed from: b */
    private C5286g<C9776h> f30593b;

    /* renamed from: c */
    private C9776h f30594c;

    /* renamed from: d */
    private C7434nb f30595d;

    public RunnableC9801n(@NonNull C9779i c9779i, @NonNull C5286g<C9776h> c5286g) {
        C4588d.m23627a(c9779i);
        C4588d.m23627a(c5286g);
        this.f30592a = c9779i;
        this.f30593b = c5286g;
        this.f30595d = new C7434nb(this.f30592a.m7045g(), this.f30592a.m7046f().m7126d());
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            C7447nk m14444b = this.f30592a.m7044h().m14444b(this.f30592a.m7037o());
            this.f30595d.m14493a(m14444b);
            if (m14444b.m14429h()) {
                try {
                    this.f30594c = new C9776h.C9778a(m14444b.m14433d(), this.f30592a).m7072a();
                } catch (RemoteException | JSONException e) {
                    String valueOf = String.valueOf(m14444b.m14432e());
                    Log.e("GetMetadataTask", valueOf.length() != 0 ? "Unable to parse resulting metadata. ".concat(valueOf) : new String("Unable to parse resulting metadata. "), e);
                    this.f30593b.m20831a(C9774g.m7117a(e));
                    return;
                }
            }
            if (this.f30593b == null) {
                return;
            }
            m14444b.m14439a((C5286g<C5286g<C9776h>>) this.f30593b, (C5286g<C9776h>) this.f30594c);
        } catch (RemoteException e2) {
            Log.e("GetMetadataTask", "Unable to create firebase storage network request.", e2);
            this.f30593b.m20831a(C9774g.m7117a(e2));
        }
    }
}
