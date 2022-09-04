package com.google.android.gms.ads.internal.request;

import android.content.Context;
import com.google.android.gms.ads.internal.client.C3514ac;
import com.google.android.gms.ads.internal.request.AbstractC3718d;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.C4686i;
import com.google.android.gms.internal.C7788uf;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.abx;
import com.google.android.gms.internal.acr;
@aaa
/* renamed from: com.google.android.gms.ads.internal.request.c */
/* loaded from: classes.dex */
public final class C3714c {

    /* renamed from: com.google.android.gms.ads.internal.request.c$a */
    /* loaded from: classes2.dex */
    public interface AbstractC3716a {
        /* renamed from: a */
        void mo27018a(AdResponseParcel adResponseParcel);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.ads.internal.request.c$b */
    /* loaded from: classes2.dex */
    public interface AbstractC3717b {
        /* renamed from: a */
        boolean mo27019a(VersionInfoParcel versionInfoParcel);
    }

    /* renamed from: a */
    public static abx m27023a(final Context context, VersionInfoParcel versionInfoParcel, acr<AdRequestInfoParcel> acrVar, AbstractC3716a abstractC3716a) {
        return m27022a(context, versionInfoParcel, acrVar, abstractC3716a, new AbstractC3717b() { // from class: com.google.android.gms.ads.internal.request.c.1
            @Override // com.google.android.gms.ads.internal.request.C3714c.AbstractC3717b
            /* renamed from: a */
            public boolean mo27019a(VersionInfoParcel versionInfoParcel2) {
                return versionInfoParcel2.f14736e || (C4686i.m23135b(context) && !C7788uf.f25724I.m13486c().booleanValue());
            }
        });
    }

    /* renamed from: a */
    static abx m27022a(Context context, VersionInfoParcel versionInfoParcel, acr<AdRequestInfoParcel> acrVar, AbstractC3716a abstractC3716a, AbstractC3717b abstractC3717b) {
        return abstractC3717b.mo27019a(versionInfoParcel) ? m27021a(context, acrVar, abstractC3716a) : m27020b(context, versionInfoParcel, acrVar, abstractC3716a);
    }

    /* renamed from: a */
    private static abx m27021a(Context context, acr<AdRequestInfoParcel> acrVar, AbstractC3716a abstractC3716a) {
        abr.a("Fetching ad response from local ad request service.");
        AbstractC3718d.C3721a c3721a = new AbstractC3718d.C3721a(context, acrVar, abstractC3716a);
        Void r0 = (Void) c3721a.mo12820e();
        return c3721a;
    }

    /* renamed from: b */
    private static abx m27020b(Context context, VersionInfoParcel versionInfoParcel, acr<AdRequestInfoParcel> acrVar, AbstractC3716a abstractC3716a) {
        abr.a("Fetching ad response from remote ad request service.");
        if (!C3514ac.m27586a().m26853b(context)) {
            abr.d("Failed to connect to remote ad request service.");
            return null;
        }
        return new AbstractC3718d.C3722b(context, versionInfoParcel, acrVar, abstractC3716a);
    }
}
