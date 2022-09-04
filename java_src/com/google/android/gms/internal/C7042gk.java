package com.google.android.gms.internal;

import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.C4588d;
import com.google.firebase.auth.AbstractC9718a;
import com.google.firebase.auth.C9730e;
import com.google.firebase.auth.C9742p;
import com.google.firebase.auth.C9744r;
import com.google.firebase.auth.C9747u;
import com.google.firebase.auth.api.model.VerifyAssertionRequest;
/* renamed from: com.google.android.gms.internal.gk */
/* loaded from: classes2.dex */
public class C7042gk {
    @NonNull
    /* renamed from: a */
    public static VerifyAssertionRequest m15721a(@NonNull AbstractC9718a abstractC9718a) {
        C4588d.m23627a(abstractC9718a);
        if (C9744r.class.isAssignableFrom(abstractC9718a.getClass())) {
            return C9744r.m7244a((C9744r) abstractC9718a);
        }
        if (C9730e.class.isAssignableFrom(abstractC9718a.getClass())) {
            return C9730e.m7277a((C9730e) abstractC9718a);
        }
        if (C9747u.class.isAssignableFrom(abstractC9718a.getClass())) {
            return C9747u.m7237a((C9747u) abstractC9718a);
        }
        if (!C9742p.class.isAssignableFrom(abstractC9718a.getClass())) {
            throw new IllegalArgumentException("Unsupported credential type.");
        }
        return C9742p.m7247a((C9742p) abstractC9718a);
    }
}
