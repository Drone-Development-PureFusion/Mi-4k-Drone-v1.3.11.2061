package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C4597m;
import com.google.android.gms.p239g.AbstractC5285f;
import com.google.android.gms.p239g.C5286g;
import java.util.concurrent.CancellationException;
/* loaded from: classes2.dex */
public class ain extends ahm {

    /* renamed from: e */
    private C5286g<Void> f21948e = new C5286g<>();

    private ain(aik aikVar) {
        super(aikVar);
        this.f21940d.mo12684a("GmsAvailabilityHelper", this);
    }

    /* renamed from: a */
    public static ain m17208a(Activity activity) {
        aik b = b(activity);
        ain ainVar = (ain) b.mo12683a("GmsAvailabilityHelper", ain.class);
        if (ainVar != null) {
            if (!ainVar.f21948e.m20832a().mo7028a()) {
                return ainVar;
            }
            ainVar.f21948e = new C5286g<>();
            return ainVar;
        }
        return new ain(b);
    }

    /* renamed from: a */
    public void m17207a(ConnectionResult connectionResult) {
        b(connectionResult, 0);
    }

    @Override // com.google.android.gms.internal.ahm
    /* renamed from: a */
    protected void mo17206a(ConnectionResult connectionResult, int i) {
        this.f21948e.m20831a(C4597m.m23597a(connectionResult));
    }

    @Override // com.google.android.gms.internal.ahm
    /* renamed from: c */
    protected void mo17205c() {
        int mo23375a = this.f21742c.mo23375a((Context) this.f21940d.mo12687a());
        if (mo23375a == 0) {
            this.f21948e.m20830a((C5286g<Void>) null);
        } else {
            m17207a(new ConnectionResult(mo23375a, null));
        }
    }

    @Override // com.google.android.gms.internal.aij
    /* renamed from: f */
    public void mo17204f() {
        super.f();
        this.f21948e.m20831a(new CancellationException("Host activity was destroyed before Google Play services could be made available."));
    }

    /* renamed from: g */
    public AbstractC5285f<Void> m17203g() {
        return this.f21948e.m20832a();
    }
}
