package com.google.android.gms.common.stats;

import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p005b.p006a.p007a.p008a.p020j.C0324k;
/* loaded from: classes2.dex */
public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {
    /* renamed from: a */
    public abstract long mo23222a();

    /* renamed from: b */
    public abstract int mo23221b();

    /* renamed from: i */
    public abstract long mo23214i();

    /* renamed from: l */
    public abstract String mo23211l();

    public String toString() {
        long mo23222a = mo23222a();
        String valueOf = String.valueOf(C0324k.f324b);
        int mo23221b = mo23221b();
        String valueOf2 = String.valueOf(C0324k.f324b);
        long mo23214i = mo23214i();
        String valueOf3 = String.valueOf(mo23211l());
        return new StringBuilder(String.valueOf(valueOf).length() + 51 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length()).append(mo23222a).append(valueOf).append(mo23221b).append(valueOf2).append(mo23214i).append(valueOf3).toString();
    }
}
