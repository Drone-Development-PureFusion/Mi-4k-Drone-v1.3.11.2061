package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.common.internal.C4598n;
import java.util.Map;
import java.util.concurrent.Future;
@aaa
/* renamed from: com.google.android.gms.internal.wj */
/* loaded from: classes.dex */
public class C7907wj implements AbstractC7877vt {
    @Override // com.google.android.gms.internal.AbstractC7877vt
    /* renamed from: a */
    public void mo12713a(acy acyVar, Map<String, String> map) {
        int i;
        C7902wh m26898B = C3779u.m26898B();
        if (map.containsKey("abort")) {
            if (m26898B.m13270a(acyVar)) {
                return;
            }
            abr.d("Precache abort but no preload task running.");
            return;
        }
        String str = map.get("src");
        if (str == null) {
            abr.d("Precache video action is missing the src parameter.");
            return;
        }
        try {
            i = Integer.parseInt(map.get("player"));
        } catch (NumberFormatException e) {
            i = 0;
        }
        String str2 = map.containsKey("mimetype") ? map.get("mimetype") : "";
        if (m26898B.m13268b(acyVar)) {
            abr.d("Precache task already running.");
            return;
        }
        C4598n.m23595a(acyVar.mo18088h());
        Future future = (Future) new C7900wg(acyVar, acyVar.mo18088h().f14059a.mo13257a(acyVar, i, str2), str).mo12820e();
    }
}
