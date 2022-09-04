package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.analytics.C3839d;
import com.google.android.gms.analytics.C3852g;
import com.google.android.gms.analytics.p229a.C3832a;
import com.google.android.gms.analytics.p229a.C3833b;
import com.google.android.gms.analytics.p229a.C3834c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.util.C4683f;
import com.google.android.gms.internal.C6716app;
import com.google.firebase.p251a.C9654a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* renamed from: com.google.android.gms.internal.dc */
/* loaded from: classes2.dex */
public class C6827dc extends aqg {

    /* renamed from: a */
    private static final String f22914a = EnumC6890eg.UNIVERSAL_ANALYTICS.toString();

    /* renamed from: b */
    private static final List<String> f22915b = Arrays.asList(C3833b.f14897a, C3833b.f14901e, C3833b.f14902f, "click", C3833b.f14899c, C3833b.f14900d, C3833b.f14904h, C3833b.f14905i);

    /* renamed from: c */
    private static final Pattern f22916c = Pattern.compile("dimension(\\d+)");

    /* renamed from: d */
    private static final Pattern f22917d = Pattern.compile("metric(\\d+)");

    /* renamed from: e */
    private static final Set<String> f22918e = C4683f.m23149a("", "0", "false");

    /* renamed from: f */
    private static final Map<String, String> f22919f = C4683f.m23147a("transactionId", "&ti", "transactionAffiliation", "&ta", "transactionTax", "&tt", "transactionShipping", "&ts", "transactionTotal", "&tr", "transactionCurrency", "&cu");

    /* renamed from: g */
    private static final Map<String, String> f22920g = C4683f.m23147a("name", "&in", "sku", "&ic", "category", "&iv", C9654a.C9656b.f30239x, "&ip", C9654a.C9656b.f30240y, "&iq", C9654a.C9656b.f30221f, "&cu");

    /* renamed from: h */
    private final aqb f22921h;

    /* renamed from: i */
    private final C6716app.AbstractC6720c f22922i;

    /* renamed from: j */
    private Map<String, Object> f22923j;

    public C6827dc(Context context, C6716app.AbstractC6720c abstractC6720c) {
        this(new aqb(context), abstractC6720c);
    }

    public C6827dc(aqb aqbVar, C6716app.AbstractC6720c abstractC6720c) {
        this.f22922i = abstractC6720c;
        this.f22921h = aqbVar;
    }

    /* renamed from: a */
    private C3833b m16183a(String str, Map<String, Object> map) {
        C3833b c3833b = new C3833b(str);
        Object obj = map.get("id");
        if (obj != null) {
            c3833b.m26613a(String.valueOf(obj));
        }
        Object obj2 = map.get("affiliation");
        if (obj2 != null) {
            c3833b.m26610b(String.valueOf(obj2));
        }
        Object obj3 = map.get(C9654a.C9656b.f30222g);
        if (obj3 != null) {
            c3833b.m26608c(String.valueOf(obj3));
        }
        Object obj4 = map.get("list");
        if (obj4 != null) {
            c3833b.m26606e(String.valueOf(obj4));
        }
        Object obj5 = map.get("option");
        if (obj5 != null) {
            c3833b.m26607d(String.valueOf(obj5));
        }
        Object obj6 = map.get("revenue");
        if (obj6 != null) {
            c3833b.m26615a(m16185a(obj6).doubleValue());
        }
        Object obj7 = map.get(C9654a.C9656b.f30214D);
        if (obj7 != null) {
            c3833b.m26611b(m16185a(obj7).doubleValue());
        }
        Object obj8 = map.get(C9654a.C9656b.f30211A);
        if (obj8 != null) {
            c3833b.m26609c(m16185a(obj8).doubleValue());
        }
        Object obj9 = map.get("step");
        if (obj9 != null) {
            c3833b.m26614a(m16179b(obj9).intValue());
        }
        return c3833b;
    }

    /* renamed from: a */
    private C3834c m16182a(Map<String, String> map) {
        C3834c c3834c = new C3834c();
        String str = map.get("id");
        if (str != null) {
            c3834c.m26604a(String.valueOf(str));
        }
        String str2 = map.get("name");
        if (str2 != null) {
            c3834c.m26602b(String.valueOf(str2));
        }
        String str3 = map.get("creative");
        if (str3 != null) {
            c3834c.m26601c(String.valueOf(str3));
        }
        String str4 = map.get("position");
        if (str4 != null) {
            c3834c.m26600d(String.valueOf(str4));
        }
        return c3834c;
    }

    /* renamed from: a */
    private Double m16185a(Object obj) {
        if (obj instanceof String) {
            try {
                return Double.valueOf((String) obj);
            } catch (NumberFormatException e) {
                String valueOf = String.valueOf(e.getMessage());
                throw new RuntimeException(valueOf.length() != 0 ? "Cannot convert the object to Double: ".concat(valueOf) : new String("Cannot convert the object to Double: "));
            }
        } else if (obj instanceof Integer) {
            return Double.valueOf(((Integer) obj).doubleValue());
        } else {
            if (obj instanceof Double) {
                return (Double) obj;
            }
            String valueOf2 = String.valueOf(obj.toString());
            throw new RuntimeException(valueOf2.length() != 0 ? "Cannot convert the object to Double: ".concat(valueOf2) : new String("Cannot convert the object to Double: "));
        }
    }

    /* renamed from: a */
    private List<Map<String, Object>> m16184a(String str) {
        Object obj = this.f22923j.get(str);
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof List)) {
            throw new IllegalArgumentException("transactionProducts should be of type List.");
        }
        List<Map<String, Object>> list = (List) obj;
        for (Map<String, Object> map : list) {
            if (!(map instanceof Map)) {
                throw new IllegalArgumentException("Each element of transactionProducts should be of type Map.");
            }
        }
        return list;
    }

    /* renamed from: a */
    private Map<String, String> m16186a(AbstractC6880ea<?> abstractC6880ea) {
        C4588d.m23627a(abstractC6880ea);
        C4588d.m23619b(abstractC6880ea instanceof C6891eh);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object m16025a = C6895ek.m16025a((AbstractC6880ea<?>) C6895ek.m16021b(abstractC6880ea));
        C4588d.m23623a(m16025a instanceof Map);
        for (Map.Entry entry : ((Map) m16025a).entrySet()) {
            linkedHashMap.put(entry.getKey().toString(), entry.getValue().toString());
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    private void m16188a(C3852g c3852g, AbstractC6880ea<?> abstractC6880ea) {
        c3852g.m26511a(m16180b(abstractC6880ea));
    }

    /* renamed from: a */
    private void m16187a(C3852g c3852g, AbstractC6880ea<?> abstractC6880ea, AbstractC6880ea<?> abstractC6880ea2, AbstractC6880ea<?> abstractC6880ea3) {
        String str = (String) this.f22923j.get("transactionId");
        if (str == null) {
            aph.m16396a("Cannot find transactionId in data layer.");
            return;
        }
        LinkedList<Map<String, String>> linkedList = new LinkedList();
        try {
            Map<String, String> m16180b = m16180b(abstractC6880ea);
            m16180b.put("&t", "transaction");
            for (Map.Entry<String, String> entry : m16177c(abstractC6880ea2).entrySet()) {
                String str2 = (String) this.f22923j.get(entry.getKey());
                if (str2 != null) {
                    m16180b.put(entry.getValue(), str2);
                }
            }
            linkedList.add(m16180b);
            List<Map<String, Object>> m16184a = m16184a("transactionProducts");
            if (m16184a != null) {
                for (Map<String, Object> map : m16184a) {
                    if (map.get("name") == null) {
                        aph.m16396a("Unable to send transaction item hit due to missing 'name' field.");
                        return;
                    }
                    Map<String, String> m16180b2 = m16180b(abstractC6880ea);
                    m16180b2.put("&t", "item");
                    m16180b2.put("&ti", str);
                    for (Map.Entry<String, String> entry2 : m16176d(abstractC6880ea3).entrySet()) {
                        Object obj = map.get(entry2.getKey());
                        if (obj != null) {
                            m16180b2.put(entry2.getValue(), obj.toString());
                        }
                    }
                    linkedList.add(m16180b2);
                }
            }
            for (Map<String, String> map2 : linkedList) {
                c3852g.m26511a(map2);
            }
        } catch (IllegalArgumentException e) {
            aph.m16395a("Unable to send transaction", e);
        }
    }

    /* renamed from: b */
    private C3832a m16178b(Map<String, Object> map) {
        C3832a c3832a = new C3832a();
        Object obj = map.get("id");
        if (obj != null) {
            c3832a.m26625a(String.valueOf(obj));
        }
        Object obj2 = map.get("name");
        if (obj2 != null) {
            c3832a.m26622b(String.valueOf(obj2));
        }
        Object obj3 = map.get("brand");
        if (obj3 != null) {
            c3832a.m26621c(String.valueOf(obj3));
        }
        Object obj4 = map.get("category");
        if (obj4 != null) {
            c3832a.m26620d(String.valueOf(obj4));
        }
        Object obj5 = map.get("variant");
        if (obj5 != null) {
            c3832a.m26619e(String.valueOf(obj5));
        }
        Object obj6 = map.get(C9654a.C9656b.f30222g);
        if (obj6 != null) {
            c3832a.m26618f(String.valueOf(obj6));
        }
        Object obj7 = map.get("position");
        if (obj7 != null) {
            c3832a.m26628a(m16179b(obj7).intValue());
        }
        Object obj8 = map.get(C9654a.C9656b.f30239x);
        if (obj8 != null) {
            c3832a.m26629a(m16185a(obj8).doubleValue());
        }
        Object obj9 = map.get(C9654a.C9656b.f30240y);
        if (obj9 != null) {
            c3832a.m26623b(m16179b(obj9).intValue());
        }
        for (String str : map.keySet()) {
            Matcher matcher = f22916c.matcher(str);
            if (matcher.matches()) {
                try {
                    c3832a.m26626a(Integer.parseInt(matcher.group(1)), String.valueOf(map.get(str)));
                } catch (NumberFormatException e) {
                    String valueOf = String.valueOf(str);
                    aph.m16394b(valueOf.length() != 0 ? "illegal number in custom dimension value: ".concat(valueOf) : new String("illegal number in custom dimension value: "));
                }
            } else {
                Matcher matcher2 = f22917d.matcher(str);
                if (matcher2.matches()) {
                    try {
                        c3832a.m26627a(Integer.parseInt(matcher2.group(1)), m16179b(map.get(str)).intValue());
                    } catch (NumberFormatException e2) {
                        String valueOf2 = String.valueOf(str);
                        aph.m16394b(valueOf2.length() != 0 ? "illegal number in custom metric value: ".concat(valueOf2) : new String("illegal number in custom metric value: "));
                    }
                }
            }
        }
        return c3832a;
    }

    /* renamed from: b */
    private Integer m16179b(Object obj) {
        if (obj instanceof String) {
            try {
                return Integer.valueOf((String) obj);
            } catch (NumberFormatException e) {
                String valueOf = String.valueOf(e.getMessage());
                throw new RuntimeException(valueOf.length() != 0 ? "Cannot convert the object to Integer: ".concat(valueOf) : new String("Cannot convert the object to Integer: "));
            }
        } else if (obj instanceof Double) {
            return Integer.valueOf(((Double) obj).intValue());
        } else {
            if (obj instanceof Integer) {
                return (Integer) obj;
            }
            String valueOf2 = String.valueOf(obj.toString());
            throw new RuntimeException(valueOf2.length() != 0 ? "Cannot convert the object to Integer: ".concat(valueOf2) : new String("Cannot convert the object to Integer: "));
        }
    }

    /* renamed from: b */
    private Map<String, String> m16180b(AbstractC6880ea<?> abstractC6880ea) {
        Map<String, String> m16186a = m16186a(abstractC6880ea);
        String str = m16186a.get("&aip");
        if (str != null && f22918e.contains(str.toLowerCase())) {
            m16186a.remove("&aip");
        }
        return m16186a;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x010b  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m16181b(C3852g c3852g, AbstractC6880ea<?> abstractC6880ea, AbstractC6880ea<?> abstractC6880ea2, AbstractC6880ea<?> abstractC6880ea3) {
        boolean z;
        C3839d.C3843d c3845f = new C3839d.C3845f();
        Map<String, String> m16180b = m16180b(abstractC6880ea);
        c3845f.a(m16180b);
        Object m16025a = aqf.m16224a(abstractC6880ea2) ? this.f22923j.get("ecommerce") : C6895ek.m16025a((AbstractC6880ea<?>) C6895ek.m16021b(abstractC6880ea3));
        if (m16025a instanceof Map) {
            Map map = (Map) m16025a;
            String str = m16180b.get("&cu");
            if (str == null) {
                str = (String) map.get("currencyCode");
            }
            if (str != null) {
                c3845f.a("&cu", str);
            }
            Object obj = map.get("impressions");
            if (obj instanceof List) {
                for (Map<String, Object> map2 : (List) obj) {
                    try {
                        c3845f.a(m16178b(map2), (String) map2.get("list"));
                    } catch (RuntimeException e) {
                        String valueOf = String.valueOf(e.getMessage());
                        aph.m16396a(valueOf.length() != 0 ? "Failed to extract a product from event data. ".concat(valueOf) : new String("Failed to extract a product from event data. "));
                    }
                }
            }
            List<Map<String, String>> list = null;
            if (map.containsKey("promoClick")) {
                list = (List) ((Map) map.get("promoClick")).get("promotions");
            } else if (map.containsKey("promoView")) {
                list = (List) ((Map) map.get("promoView")).get("promotions");
            }
            if (list != null) {
                for (Map<String, String> map3 : list) {
                    try {
                        c3845f.a(m16182a(map3));
                    } catch (RuntimeException e2) {
                        String valueOf2 = String.valueOf(e2.getMessage());
                        aph.m16396a(valueOf2.length() != 0 ? "Failed to extract a promotion from event data. ".concat(valueOf2) : new String("Failed to extract a promotion from event data. "));
                    }
                }
                if (map.containsKey("promoClick")) {
                    c3845f.a("&promoa", "click");
                    z = false;
                    if (z) {
                        Iterator<String> it2 = f22915b.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            String next = it2.next();
                            if (map.containsKey(next)) {
                                Map map4 = (Map) map.get(next);
                                List<Map<String, Object>> list2 = (List) map4.get("products");
                                if (list2 != null) {
                                    for (Map<String, Object> map5 : list2) {
                                        try {
                                            c3845f.a(m16178b(map5));
                                        } catch (RuntimeException e3) {
                                            String valueOf3 = String.valueOf(e3.getMessage());
                                            aph.m16396a(valueOf3.length() != 0 ? "Failed to extract a product from event data. ".concat(valueOf3) : new String("Failed to extract a product from event data. "));
                                        }
                                    }
                                }
                                try {
                                    c3845f.a(map4.containsKey("actionField") ? m16183a(next, (Map) map4.get("actionField")) : new C3833b(next));
                                } catch (RuntimeException e4) {
                                    String valueOf4 = String.valueOf(e4.getMessage());
                                    aph.m16396a(valueOf4.length() != 0 ? "Failed to extract a product action from event data. ".concat(valueOf4) : new String("Failed to extract a product action from event data. "));
                                }
                            }
                        }
                    }
                } else {
                    c3845f.a("&promoa", C3834c.f14908b);
                }
            }
            z = true;
            if (z) {
            }
        }
        c3852g.m26511a((Map<String, String>) c3845f.mo26533a());
    }

    /* renamed from: c */
    private Map<String, String> m16177c(AbstractC6880ea<?> abstractC6880ea) {
        return abstractC6880ea == C6886ee.f23122e ? f22919f : m16186a(abstractC6880ea);
    }

    /* renamed from: d */
    private Map<String, String> m16176d(AbstractC6880ea<?> abstractC6880ea) {
        return abstractC6880ea == C6886ee.f23122e ? f22920g : m16186a(abstractC6880ea);
    }

    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    protected AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        boolean z = false;
        C4588d.m23619b(abstractC6880eaArr != null);
        C4588d.m23619b(abstractC6880eaArr.length >= 1);
        try {
            this.f22923j = C6895ek.m16029a(this.f22922i.mo16320a().m16429e());
            AbstractC6880ea<?> abstractC6880ea = abstractC6880eaArr[0];
            C6883eb c6883eb = abstractC6880eaArr.length > 1 ? abstractC6880eaArr[1] : new C6883eb(true);
            C6883eb c6883eb2 = abstractC6880eaArr.length > 2 ? abstractC6880eaArr[2] : new C6883eb(false);
            C6886ee c6886ee = abstractC6880eaArr.length > 3 ? abstractC6880eaArr[3] : C6886ee.f23122e;
            C6886ee c6886ee2 = abstractC6880eaArr.length > 4 ? abstractC6880eaArr[4] : C6886ee.f23122e;
            C6883eb c6883eb3 = abstractC6880eaArr.length > 5 ? abstractC6880eaArr[5] : new C6883eb(false);
            C6883eb c6883eb4 = abstractC6880eaArr.length > 6 ? abstractC6880eaArr[6] : new C6883eb(false);
            C6886ee c6886ee3 = abstractC6880eaArr.length > 7 ? abstractC6880eaArr[7] : C6886ee.f23122e;
            C6883eb c6883eb5 = abstractC6880eaArr.length > 8 ? abstractC6880eaArr[8] : new C6883eb(false);
            C4588d.m23619b(abstractC6880ea instanceof C6891eh);
            C4588d.m23619b(c6886ee == C6886ee.f23122e || (c6886ee instanceof C6891eh));
            C4588d.m23619b(c6886ee2 == C6886ee.f23122e || (c6886ee2 instanceof C6891eh));
            if (c6886ee3 == C6886ee.f23122e || (c6886ee3 instanceof C6891eh)) {
                z = true;
            }
            C4588d.m23619b(z);
            C3852g m16235a = this.f22921h.m16235a("_GTM_DEFAULT_TRACKER_");
            m16235a.m26493e(aqf.m16224a(c6883eb5));
            if (aqf.m16224a(c6883eb3)) {
                m16181b(m16235a, abstractC6880ea, c6883eb4, c6886ee3);
            } else if (aqf.m16224a(c6883eb)) {
                m16188a(m16235a, abstractC6880ea);
            } else if (aqf.m16224a(c6883eb2)) {
                m16187a(m16235a, abstractC6880ea, c6886ee, c6886ee2);
            } else {
                aph.m16394b("Ignoring unknown tag.");
            }
            this.f22923j = null;
            return C6886ee.f23122e;
        } catch (Throwable th) {
            this.f22923j = null;
            throw th;
        }
    }
}
