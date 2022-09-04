package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.AbstractC7030gi;
import com.google.android.gms.internal.AbstractC7090hj;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.tagmanager.s */
/* loaded from: classes2.dex */
public class C9228s {
    /* renamed from: a */
    private static Map<String, Object> m8883a(AbstractC7090hj.C7091a c7091a) {
        Object m9112f = C9147cw.m9112f(c7091a);
        if (!(m9112f instanceof Map)) {
            String valueOf = String.valueOf(m9112f);
            C9065aw.m9299b(new StringBuilder(String.valueOf(valueOf).length() + 36).append("value: ").append(valueOf).append(" is not a map value, ignored.").toString());
            return null;
        }
        return (Map) m9112f;
    }

    /* renamed from: a */
    private static void m8882a(C9196e c9196e, AbstractC7030gi.C7034d c7034d) {
        for (AbstractC7090hj.C7091a c7091a : c7034d.f23736b) {
            c9196e.m8968a(C9147cw.m9132a(c7091a));
        }
    }

    /* renamed from: a */
    public static void m8881a(C9196e c9196e, AbstractC7030gi.C7039i c7039i) {
        if (c7039i.f23781c == null) {
            C9065aw.m9299b("supplemental missing experimentSupplemental");
            return;
        }
        m8882a(c9196e, c7039i.f23781c);
        m8880b(c9196e, c7039i.f23781c);
        m8879c(c9196e, c7039i.f23781c);
    }

    /* renamed from: b */
    private static void m8880b(C9196e c9196e, AbstractC7030gi.C7034d c7034d) {
        for (AbstractC7090hj.C7091a c7091a : c7034d.f23735a) {
            Map<String, Object> m8883a = m8883a(c7091a);
            if (m8883a != null) {
                c9196e.m8964a(m8883a);
            }
        }
    }

    /* renamed from: c */
    private static void m8879c(C9196e c9196e, AbstractC7030gi.C7034d c7034d) {
        AbstractC7030gi.C7033c[] c7033cArr;
        for (AbstractC7030gi.C7033c c7033c : c7034d.f23737c) {
            if (c7033c.f23730a == null) {
                C9065aw.m9299b("GaExperimentRandom: No key");
            } else {
                Object m8955c = c9196e.m8955c(c7033c.f23730a);
                Long valueOf = !(m8955c instanceof Number) ? null : Long.valueOf(((Number) m8955c).longValue());
                long j = c7033c.f23731b;
                long j2 = c7033c.f23732c;
                if (!c7033c.f23733d || valueOf == null || valueOf.longValue() < j || valueOf.longValue() > j2) {
                    if (j <= j2) {
                        m8955c = Long.valueOf(Math.round((Math.random() * (j2 - j)) + j));
                    } else {
                        C9065aw.m9299b("GaExperimentRandom: random range invalid");
                    }
                }
                c9196e.m8968a(c7033c.f23730a);
                Map<String, Object> m8958b = c9196e.m8958b(c7033c.f23730a, m8955c);
                if (c7033c.f23734e > 0) {
                    if (!m8958b.containsKey("gtm")) {
                        m8958b.put("gtm", C9196e.m8961a("lifetime", Long.valueOf(c7033c.f23734e)));
                    } else {
                        Object obj = m8958b.get("gtm");
                        if (obj instanceof Map) {
                            ((Map) obj).put("lifetime", Long.valueOf(c7033c.f23734e));
                        } else {
                            C9065aw.m9299b("GaExperimentRandom: gtm not a map");
                        }
                    }
                }
                c9196e.m8964a(m8958b);
            }
        }
    }
}
