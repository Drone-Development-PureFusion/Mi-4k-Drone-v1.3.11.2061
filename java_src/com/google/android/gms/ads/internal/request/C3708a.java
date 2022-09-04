package com.google.android.gms.ads.internal.request;

import android.content.Context;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.internal.C7667ro;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abi;
import com.google.android.gms.internal.abq;
import java.util.concurrent.Future;
@aaa
/* renamed from: com.google.android.gms.ads.internal.request.a */
/* loaded from: classes.dex */
public class C3708a {

    /* renamed from: com.google.android.gms.ads.internal.request.a$a */
    /* loaded from: classes2.dex */
    public interface AbstractC3709a {
        /* renamed from: a */
        void mo27033a(abi.C6129a c6129a);
    }

    /* renamed from: a */
    public abq m27034a(Context context, AdRequestInfoParcel.C3706a c3706a, C7667ro c7667ro, AbstractC3709a abstractC3709a) {
        abq c3736n = c3706a.f14525b.f13847c.getBundle("sdk_less_server_data") != null ? new C3736n(context, c3706a, abstractC3709a) : new C3710b(context, c3706a, c7667ro, abstractC3709a);
        Future future = (Future) c3736n.mo12820e();
        return c3736n;
    }
}
