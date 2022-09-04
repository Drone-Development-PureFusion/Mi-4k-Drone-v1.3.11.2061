package com.google.android.gms.internal;

import com.google.firebase.database.C9866d;
/* renamed from: com.google.android.gms.internal.ll */
/* loaded from: classes2.dex */
public class C7350ll {
    /* renamed from: a */
    public static AbstractC7344lh m14730a() {
        return C7335la.m14778j();
    }

    /* renamed from: a */
    public static AbstractC7344lh m14728a(Object obj) {
        AbstractC7344lh m14735a = C7347li.m14735a(obj);
        if (m14735a instanceof C7342lf) {
            m14735a = new C7333kz(Double.valueOf(((Long) m14735a.mo14710a()).longValue()), m14730a());
        }
        if (!m14729a(m14735a)) {
            throw new C9866d("Invalid Firebase Database priority (must be a string, double, ServerValue, or null)");
        }
        return m14735a;
    }

    /* renamed from: a */
    public static boolean m14729a(AbstractC7344lh abstractC7344lh) {
        return abstractC7344lh.mo14737f().mo14739b() && (abstractC7344lh.mo14739b() || (abstractC7344lh instanceof C7333kz) || (abstractC7344lh instanceof C7355lo) || (abstractC7344lh instanceof C7332ky));
    }
}
