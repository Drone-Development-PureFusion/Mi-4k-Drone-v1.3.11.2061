package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.p286a.p287a.p290c.p293c.C11044h;
import org.p286a.p287a.p290c.p293c.C11048l;
/* renamed from: com.google.android.gms.internal.cz */
/* loaded from: classes2.dex */
public class C6823cz extends aqg {

    /* renamed from: b */
    private static final Set<String> f22909b = new HashSet(Arrays.asList("GET", C11044h.f35585a, "POST", C11048l.f35589a));

    /* renamed from: a */
    private final aoz f22910a;

    public C6823cz(aoz aozVar) {
        this.f22910a = aozVar;
    }

    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    protected AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        HashMap hashMap;
        String str = null;
        C4588d.m23619b(abstractC6880eaArr != null);
        C4588d.m23619b(abstractC6880eaArr.length == 1);
        C4588d.m23619b(abstractC6880eaArr[0] instanceof C6891eh);
        AbstractC6880ea<?> mo16044b = abstractC6880eaArr[0].mo16044b("url");
        C4588d.m23619b(mo16044b instanceof C6893ej);
        String str2 = (String) ((C6893ej) mo16044b).mo16034b();
        AbstractC6880ea<?> mo16044b2 = abstractC6880eaArr[0].mo16044b("method");
        if (mo16044b2 == C6886ee.f23122e) {
            mo16044b2 = new C6893ej("GET");
        }
        C4588d.m23619b(mo16044b2 instanceof C6893ej);
        String str3 = (String) ((C6893ej) mo16044b2).mo16034b();
        C4588d.m23619b(f22909b.contains(str3));
        AbstractC6880ea<?> mo16044b3 = abstractC6880eaArr[0].mo16044b("uniqueId");
        C4588d.m23619b(mo16044b3 == C6886ee.f23122e || mo16044b3 == C6886ee.f23121d || (mo16044b3 instanceof C6893ej));
        String str4 = (mo16044b3 == C6886ee.f23122e || mo16044b3 == C6886ee.f23121d) ? null : (String) ((C6893ej) mo16044b3).mo16034b();
        AbstractC6880ea<?> mo16044b4 = abstractC6880eaArr[0].mo16044b("headers");
        C4588d.m23619b(mo16044b4 == C6886ee.f23122e || (mo16044b4 instanceof C6891eh));
        HashMap hashMap2 = new HashMap();
        if (mo16044b4 == C6886ee.f23122e) {
            hashMap = null;
        } else {
            for (Map.Entry<String, AbstractC6880ea<?>> entry : ((C6891eh) mo16044b4).mo16034b().entrySet()) {
                String key = entry.getKey();
                AbstractC6880ea<?> value = entry.getValue();
                if (!(value instanceof C6893ej)) {
                    aph.m16394b(String.format("Ignore the non-string value of header key %s.", key));
                } else {
                    hashMap2.put(key, (String) ((C6893ej) value).mo16034b());
                }
            }
            hashMap = hashMap2;
        }
        AbstractC6880ea<?> mo16044b5 = abstractC6880eaArr[0].mo16044b("body");
        C4588d.m23619b(mo16044b5 == C6886ee.f23122e || (mo16044b5 instanceof C6893ej));
        if (mo16044b5 != C6886ee.f23122e) {
            str = (String) ((C6893ej) mo16044b5).mo16034b();
        }
        if ((str3.equals("GET") || str3.equals(C11044h.f35585a)) && str != null) {
            aph.m16394b(String.format("Body of %s hit will be ignored: %s.", str3, str));
        }
        this.f22910a.mo16410a(str2, str3, str4, hashMap, str);
        aph.m16391d(String.format("QueueRequest: url = %s, method = %s, uniqueId = %s, headers = %s, body = %s", str2, str3, str4, hashMap, str));
        return C6886ee.f23122e;
    }
}
