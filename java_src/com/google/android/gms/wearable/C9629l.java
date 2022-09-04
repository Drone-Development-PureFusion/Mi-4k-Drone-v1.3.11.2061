package com.google.android.gms.wearable;

import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.C6949fe;
import com.google.android.gms.internal.C6951ff;
import com.google.android.gms.internal.C7648rc;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.wearable.l */
/* loaded from: classes2.dex */
public class C9629l {

    /* renamed from: a */
    private final Uri f30155a;

    /* renamed from: b */
    private final C9628k f30156b;

    private C9629l(AbstractC9466h abstractC9466h) {
        this.f30155a = abstractC9466h.mo7782c();
        this.f30156b = m7579b(abstractC9466h.a());
    }

    /* renamed from: a */
    public static C9629l m7581a(AbstractC9466h abstractC9466h) {
        if (abstractC9466h == null) {
            throw new IllegalStateException("provided dataItem is null");
        }
        return new C9629l(abstractC9466h);
    }

    /* renamed from: b */
    private C9628k m7579b(AbstractC9466h abstractC9466h) {
        if (abstractC9466h.mo7781d() != null || abstractC9466h.mo7780e().size() <= 0) {
            if (abstractC9466h.mo7781d() == null) {
                return new C9628k();
            }
            try {
                ArrayList arrayList = new ArrayList();
                int size = abstractC9466h.mo7780e().size();
                for (int i = 0; i < size; i++) {
                    AbstractC9467i abstractC9467i = abstractC9466h.mo7780e().get(Integer.toString(i));
                    if (abstractC9467i == null) {
                        String valueOf = String.valueOf(abstractC9466h);
                        throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 64).append("Cannot find DataItemAsset referenced in data at ").append(i).append(" for ").append(valueOf).toString());
                    }
                    arrayList.add(Asset.m8142a(abstractC9467i.mo7794c()));
                }
                return C6949fe.m15896a(new C6949fe.C6950a(C6951ff.m15887a(abstractC9466h.mo7781d()), arrayList));
            } catch (C7648rc | NullPointerException e) {
                String valueOf2 = String.valueOf(abstractC9466h.mo7782c());
                String valueOf3 = String.valueOf(Base64.encodeToString(abstractC9466h.mo7781d(), 0));
                Log.w("DataItem", new StringBuilder(String.valueOf(valueOf2).length() + 50 + String.valueOf(valueOf3).length()).append("Unable to parse datamap from dataItem. uri=").append(valueOf2).append(", data=").append(valueOf3).toString());
                String valueOf4 = String.valueOf(abstractC9466h.mo7782c());
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf4).length() + 44).append("Unable to parse datamap from dataItem.  uri=").append(valueOf4).toString(), e);
            }
        }
        throw new IllegalArgumentException("Cannot create DataMapItem from a DataItem  that wasn't made with DataMapItem.");
    }

    /* renamed from: a */
    public Uri m7582a() {
        return this.f30155a;
    }

    /* renamed from: b */
    public C9628k m7580b() {
        return this.f30156b;
    }
}
