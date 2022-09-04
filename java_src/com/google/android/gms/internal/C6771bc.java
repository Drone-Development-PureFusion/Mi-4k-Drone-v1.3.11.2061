package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.bc */
/* loaded from: classes2.dex */
public class C6771bc extends aqg {

    /* renamed from: a */
    private final AbstractC6772a f22869a;

    /* renamed from: com.google.android.gms.internal.bc$a */
    /* loaded from: classes2.dex */
    public interface AbstractC6772a {
        /* renamed from: a */
        Object mo16202a(String str, Map<String, Object> map);
    }

    public C6771bc(AbstractC6772a abstractC6772a) {
        this.f22869a = abstractC6772a;
    }

    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    protected AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        C4588d.m23627a(abstractC6880eaArr);
        C4588d.m23619b(abstractC6880eaArr.length >= 1);
        C4588d.m23619b(abstractC6880eaArr[0] instanceof C6893ej);
        String str = (String) ((C6893ej) abstractC6880eaArr[0]).mo16034b();
        HashMap hashMap = new HashMap();
        if (abstractC6880eaArr.length >= 2 && abstractC6880eaArr[1] != C6886ee.f23122e) {
            C4588d.m23619b(abstractC6880eaArr[1] instanceof C6891eh);
            for (Map.Entry<String, AbstractC6880ea<?>> entry : ((C6891eh) abstractC6880eaArr[1]).mo16034b().entrySet()) {
                C4588d.m23623a(!(entry.getValue() instanceof C6892ei));
                C4588d.m23623a(!C6895ek.m16019d(entry.getValue()));
                hashMap.put(entry.getKey(), entry.getValue().mo16034b());
            }
        }
        return C6895ek.m16024a(this.f22869a.mo16202a(str, hashMap));
    }
}
