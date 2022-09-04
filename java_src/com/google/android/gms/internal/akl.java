package com.google.android.gms.internal;

import com.google.android.gms.internal.akm;
import com.google.firebase.p253b.C9755a;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class akl {
    /* renamed from: a */
    public static <DP, DT> String m17021a(DP dp, akg<DP, DT> akgVar) {
        double mo17045a;
        aki<DT> mo17047a = akgVar.mo17047a();
        if (!mo17047a.mo17033a(akgVar.mo17043b(dp))) {
            return null;
        }
        DT mo17046a = akgVar.mo17046a(dp);
        for (int i = 0; i < mo17047a.mo17035a((aki<DT>) mo17046a); i++) {
            String mo17030c = mo17047a.mo17030c(mo17046a, i);
            if (akgVar.mo17041c(dp, i)) {
                double mo17034a = mo17047a.mo17034a(mo17046a, i);
                if (mo17034a == 1.0d) {
                    mo17045a = akgVar.mo17042b(dp, i);
                } else if (mo17034a == 2.0d) {
                    mo17045a = akgVar.mo17045a((akg<DP, DT>) dp, i);
                } else {
                    continue;
                }
                akm.C6451a m17018a = akm.m17020a().m17018a(mo17030c);
                if (m17018a != null && !m17018a.m17016a(mo17045a)) {
                    return "Field out of range";
                }
                akm.C6451a m17017a = akm.m17020a().m17017a(mo17047a.mo17032b(mo17046a), mo17030c);
                if (m17017a != null) {
                    long mo17044a = akgVar.mo17044a((akg<DP, DT>) dp, TimeUnit.NANOSECONDS);
                    if (mo17044a == 0) {
                        if (mo17045a != C9755a.f30449c) {
                            return "DataPoint out of range";
                        }
                        return null;
                    } else if (!m17017a.m17016a(mo17045a / mo17044a)) {
                        return "DataPoint out of range";
                    }
                } else {
                    continue;
                }
            } else if (!mo17047a.mo17031b(mo17046a, i) && !akm.f22129a.contains(mo17030c)) {
                return String.valueOf(mo17030c).concat(" not set");
            }
        }
        return null;
    }
}
