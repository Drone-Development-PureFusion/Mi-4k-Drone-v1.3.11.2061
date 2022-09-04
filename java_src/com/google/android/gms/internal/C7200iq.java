package com.google.android.gms.internal;

import com.google.android.gms.internal.C7204is;
import com.google.android.gms.internal.C7322kw;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.iq */
/* loaded from: classes2.dex */
public class C7200iq {
    /* renamed from: a */
    public static C7142ia m15253a(C7142ia c7142ia, Map<String, Object> map) {
        C7142ia m15436a = C7142ia.m15436a();
        Iterator<Map.Entry<C7160ij, AbstractC7344lh>> it2 = c7142ia.iterator();
        while (true) {
            C7142ia c7142ia2 = m15436a;
            if (it2.hasNext()) {
                Map.Entry<C7160ij, AbstractC7344lh> next = it2.next();
                m15436a = c7142ia2.m15432a(next.getKey(), m15251a(next.getValue(), map));
            } else {
                return c7142ia2;
            }
        }
    }

    /* renamed from: a */
    public static C7204is m15252a(C7204is c7204is, final Map<String, Object> map) {
        final C7204is c7204is2 = new C7204is();
        c7204is.m15244a(new C7160ij(""), new C7204is.AbstractC7208b() { // from class: com.google.android.gms.internal.iq.1
            @Override // com.google.android.gms.internal.C7204is.AbstractC7208b
            /* renamed from: a */
            public void mo15240a(C7160ij c7160ij, AbstractC7344lh abstractC7344lh) {
                C7204is.this.m15243a(c7160ij, C7200iq.m15251a(abstractC7344lh, (Map<String, Object>) map));
            }
        });
        return c7204is2;
    }

    /* renamed from: a */
    public static AbstractC7344lh m15251a(AbstractC7344lh abstractC7344lh, final Map<String, Object> map) {
        Object mo14710a = abstractC7344lh.mo14737f().mo14710a();
        if (mo14710a instanceof Map) {
            Map map2 = (Map) mo14710a;
            if (map2.containsKey(".sv")) {
                mo14710a = map.get((String) map2.get(".sv"));
            }
        }
        AbstractC7344lh m14728a = C7350ll.m14728a(mo14710a);
        if (abstractC7344lh.mo14743e()) {
            Object m15249a = m15249a(abstractC7344lh.mo14710a(), map);
            return (!m15249a.equals(abstractC7344lh.mo14710a()) || !m14728a.equals(abstractC7344lh.mo14737f())) ? C7347li.m14734a(m15249a, m14728a) : abstractC7344lh;
        } else if (abstractC7344lh.mo14739b()) {
            return abstractC7344lh;
        } else {
            C7322kw c7322kw = (C7322kw) abstractC7344lh;
            final C7203ir c7203ir = new C7203ir(c7322kw);
            c7322kw.m14819a(new C7322kw.AbstractC7325a() { // from class: com.google.android.gms.internal.iq.2
                @Override // com.google.android.gms.internal.C7322kw.AbstractC7325a
                /* renamed from: a */
                public void mo14802a(C7319kv c7319kv, AbstractC7344lh abstractC7344lh2) {
                    AbstractC7344lh m15251a = C7200iq.m15251a(abstractC7344lh2, (Map<String, Object>) map);
                    if (m15251a != abstractC7344lh2) {
                        c7203ir.m15246a(new C7160ij(c7319kv.m14823e()), m15251a);
                    }
                }
            });
            return !c7203ir.m15248a().mo14737f().equals(m14728a) ? c7203ir.m15248a().mo14705b(m14728a) : c7203ir.m15248a();
        }
    }

    /* renamed from: a */
    public static Object m15249a(Object obj, Map<String, Object> map) {
        if (obj instanceof Map) {
            Map map2 = (Map) obj;
            if (!map2.containsKey(".sv")) {
                return obj;
            }
            String str = (String) map2.get(".sv");
            return map.containsKey(str) ? map.get(str) : obj;
        }
        return obj;
    }

    /* renamed from: a */
    public static Map<String, Object> m15250a(AbstractC7381mc abstractC7381mc) {
        HashMap hashMap = new HashMap();
        hashMap.put("timestamp", Long.valueOf(abstractC7381mc.mo14618a()));
        return hashMap;
    }
}
