package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.analytics.C3839d;
import com.google.android.gms.analytics.C3852g;
import com.google.android.gms.analytics.p229a.C3832a;
import com.google.android.gms.analytics.p229a.C3833b;
import com.google.android.gms.analytics.p229a.C3834c;
import com.google.android.gms.internal.AbstractC7090hj;
import com.google.android.gms.internal.EnumC6890eg;
import com.google.android.gms.internal.EnumC6958fh;
import com.google.firebase.p251a.C9654a;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* renamed from: com.google.android.gms.tagmanager.cx */
/* loaded from: classes2.dex */
public class C9148cx extends AbstractC9145cu {

    /* renamed from: a */
    private static final String f28887a = EnumC6890eg.UNIVERSAL_ANALYTICS.toString();

    /* renamed from: b */
    private static final String f28888b = EnumC6958fh.ACCOUNT.toString();

    /* renamed from: c */
    private static final String f28889c = EnumC6958fh.ANALYTICS_PASS_THROUGH.toString();

    /* renamed from: d */
    private static final String f28890d = EnumC6958fh.ENABLE_ECOMMERCE.toString();

    /* renamed from: e */
    private static final String f28891e = EnumC6958fh.ECOMMERCE_USE_DATA_LAYER.toString();

    /* renamed from: f */
    private static final String f28892f = EnumC6958fh.ECOMMERCE_MACRO_DATA.toString();

    /* renamed from: g */
    private static final String f28893g = EnumC6958fh.ANALYTICS_FIELDS.toString();

    /* renamed from: h */
    private static final String f28894h = EnumC6958fh.TRACK_TRANSACTION.toString();

    /* renamed from: i */
    private static final String f28895i = EnumC6958fh.TRANSACTION_DATALAYER_MAP.toString();

    /* renamed from: j */
    private static final String f28896j = EnumC6958fh.TRANSACTION_ITEM_DATALAYER_MAP.toString();

    /* renamed from: k */
    private static final List<String> f28897k = Arrays.asList(C3833b.f14897a, C3833b.f14901e, C3833b.f14902f, "click", C3833b.f14899c, C3833b.f14900d, C3833b.f14904h, C3833b.f14905i);

    /* renamed from: l */
    private static final Pattern f28898l = Pattern.compile("dimension(\\d+)");

    /* renamed from: m */
    private static final Pattern f28899m = Pattern.compile("metric(\\d+)");

    /* renamed from: n */
    private static Map<String, String> f28900n;

    /* renamed from: o */
    private static Map<String, String> f28901o;

    /* renamed from: p */
    private final Set<String> f28902p;

    /* renamed from: q */
    private final C9143ct f28903q;

    /* renamed from: r */
    private final C9196e f28904r;

    public C9148cx(Context context, C9196e c9196e) {
        this(context, c9196e, new C9143ct(context));
    }

    C9148cx(Context context, C9196e c9196e, C9143ct c9143ct) {
        super(f28887a, new String[0]);
        this.f28904r = c9196e;
        this.f28903q = c9143ct;
        this.f28902p = new HashSet();
        this.f28902p.add("");
        this.f28902p.add("0");
        this.f28902p.add("false");
    }

    /* renamed from: a */
    private C3833b m9101a(String str, Map<String, Object> map) {
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
            c3833b.m26615a(m9103a(obj6).doubleValue());
        }
        Object obj7 = map.get(C9654a.C9656b.f30214D);
        if (obj7 != null) {
            c3833b.m26611b(m9103a(obj7).doubleValue());
        }
        Object obj8 = map.get(C9654a.C9656b.f30211A);
        if (obj8 != null) {
            c3833b.m26609c(m9103a(obj8).doubleValue());
        }
        Object obj9 = map.get("step");
        if (obj9 != null) {
            c3833b.m26614a(m9096b(obj9).intValue());
        }
        return c3833b;
    }

    /* renamed from: a */
    private Double m9103a(Object obj) {
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
    private String m9102a(String str) {
        Object m8955c = this.f28904r.m8955c(str);
        if (m8955c == null) {
            return null;
        }
        return m8955c.toString();
    }

    /* renamed from: a */
    private Map<String, String> m9104a(AbstractC7090hj.C7091a c7091a) {
        Object m9112f = C9147cw.m9112f(c7091a);
        if (!(m9112f instanceof Map)) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((Map) m9112f).entrySet()) {
            linkedHashMap.put(entry.getKey().toString(), entry.getValue().toString());
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    private void m9105a(C3852g c3852g, Map<String, AbstractC7090hj.C7091a> map) {
        String m9102a = m9102a("transactionId");
        if (m9102a == null) {
            C9065aw.m9301a("Cannot find transactionId in data layer.");
            return;
        }
        LinkedList<Map<String, String>> linkedList = new LinkedList();
        try {
            Map<String, String> m9097b = m9097b(map.get(f28893g));
            m9097b.put("&t", "transaction");
            for (Map.Entry<String, String> entry : m9092e(map).entrySet()) {
                m9099a(m9097b, entry.getValue(), m9102a(entry.getKey()));
            }
            linkedList.add(m9097b);
            List<Map<String, String>> m9095b = m9095b("transactionProducts");
            if (m9095b != null) {
                for (Map<String, String> map2 : m9095b) {
                    if (map2.get("name") == null) {
                        C9065aw.m9301a("Unable to send transaction item hit due to missing 'name' field.");
                        return;
                    }
                    Map<String, String> m9097b2 = m9097b(map.get(f28893g));
                    m9097b2.put("&t", "item");
                    m9097b2.put("&ti", m9102a);
                    for (Map.Entry<String, String> entry2 : m9091f(map).entrySet()) {
                        m9099a(m9097b2, entry2.getValue(), map2.get(entry2.getKey()));
                    }
                    linkedList.add(m9097b2);
                }
            }
            for (Map<String, String> map3 : linkedList) {
                c3852g.m26511a(map3);
            }
        } catch (IllegalArgumentException e) {
            C9065aw.m9300a("Unable to send transaction", e);
        }
    }

    /* renamed from: a */
    private void m9099a(Map<String, String> map, String str, String str2) {
        if (str2 != null) {
            map.put(str, str2);
        }
    }

    /* renamed from: a */
    private boolean m9100a(Map<String, AbstractC7090hj.C7091a> map, String str) {
        AbstractC7090hj.C7091a c7091a = map.get(str);
        if (c7091a == null) {
            return false;
        }
        return C9147cw.m9116e(c7091a).booleanValue();
    }

    /* renamed from: b */
    private Integer m9096b(Object obj) {
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
    private List<Map<String, String>> m9095b(String str) {
        Object m8955c = this.f28904r.m8955c(str);
        if (m8955c == null) {
            return null;
        }
        if (!(m8955c instanceof List)) {
            throw new IllegalArgumentException("transactionProducts should be of type List.");
        }
        for (Object obj : (List) m8955c) {
            if (!(obj instanceof Map)) {
                throw new IllegalArgumentException("Each element of transactionProducts should be of type Map.");
            }
        }
        return (List) m8955c;
    }

    /* renamed from: b */
    private Map<String, String> m9097b(AbstractC7090hj.C7091a c7091a) {
        Map<String, String> m9104a;
        if (c7091a != null && (m9104a = m9104a(c7091a)) != null) {
            String str = m9104a.get("&aip");
            if (str != null && this.f28902p.contains(str.toLowerCase())) {
                m9104a.remove("&aip");
            }
            return m9104a;
        }
        return new HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0123  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m9098b(C3852g c3852g, Map<String, AbstractC7090hj.C7091a> map) {
        Map map2;
        boolean z;
        C3839d.C3843d c3845f = new C3839d.C3845f();
        Map<String, String> m9097b = m9097b(map.get(f28893g));
        c3845f.a(m9097b);
        if (m9100a(map, f28891e)) {
            Object m8955c = this.f28904r.m8955c("ecommerce");
            map2 = m8955c instanceof Map ? (Map) m8955c : null;
        } else {
            Object m9112f = C9147cw.m9112f(map.get(f28892f));
            map2 = m9112f instanceof Map ? (Map) m9112f : null;
        }
        if (map2 != null) {
            String str = m9097b.get("&cu");
            if (str == null) {
                str = (String) map2.get("currencyCode");
            }
            if (str != null) {
                c3845f.a("&cu", str);
            }
            Object obj = map2.get("impressions");
            if (obj instanceof List) {
                for (Map<String, Object> map3 : (List) obj) {
                    try {
                        c3845f.a(m9093d(map3), (String) map3.get("list"));
                    } catch (RuntimeException e) {
                        String valueOf = String.valueOf(e.getMessage());
                        C9065aw.m9301a(valueOf.length() != 0 ? "Failed to extract a product from DataLayer. ".concat(valueOf) : new String("Failed to extract a product from DataLayer. "));
                    }
                }
            }
            List<Map<String, String>> list = map2.containsKey("promoClick") ? (List) ((Map) map2.get("promoClick")).get("promotions") : map2.containsKey("promoView") ? (List) ((Map) map2.get("promoView")).get("promotions") : null;
            if (list != null) {
                for (Map<String, String> map4 : list) {
                    try {
                        c3845f.a(m9094c(map4));
                    } catch (RuntimeException e2) {
                        String valueOf2 = String.valueOf(e2.getMessage());
                        C9065aw.m9301a(valueOf2.length() != 0 ? "Failed to extract a promotion from DataLayer. ".concat(valueOf2) : new String("Failed to extract a promotion from DataLayer. "));
                    }
                }
                if (map2.containsKey("promoClick")) {
                    c3845f.a("&promoa", "click");
                    z = false;
                    if (z) {
                        Iterator<String> it2 = f28897k.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            String next = it2.next();
                            if (map2.containsKey(next)) {
                                Map map5 = (Map) map2.get(next);
                                List<Map<String, Object>> list2 = (List) map5.get("products");
                                if (list2 != null) {
                                    for (Map<String, Object> map6 : list2) {
                                        try {
                                            c3845f.a(m9093d(map6));
                                        } catch (RuntimeException e3) {
                                            String valueOf3 = String.valueOf(e3.getMessage());
                                            C9065aw.m9301a(valueOf3.length() != 0 ? "Failed to extract a product from DataLayer. ".concat(valueOf3) : new String("Failed to extract a product from DataLayer. "));
                                        }
                                    }
                                }
                                try {
                                    c3845f.a(map5.containsKey("actionField") ? m9101a(next, (Map) map5.get("actionField")) : new C3833b(next));
                                } catch (RuntimeException e4) {
                                    String valueOf4 = String.valueOf(e4.getMessage());
                                    C9065aw.m9301a(valueOf4.length() != 0 ? "Failed to extract a product action from DataLayer. ".concat(valueOf4) : new String("Failed to extract a product action from DataLayer. "));
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
    private C3834c m9094c(Map<String, String> map) {
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

    /* renamed from: d */
    private C3832a m9093d(Map<String, Object> map) {
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
            c3832a.m26628a(m9096b(obj7).intValue());
        }
        Object obj8 = map.get(C9654a.C9656b.f30239x);
        if (obj8 != null) {
            c3832a.m26629a(m9103a(obj8).doubleValue());
        }
        Object obj9 = map.get(C9654a.C9656b.f30240y);
        if (obj9 != null) {
            c3832a.m26623b(m9096b(obj9).intValue());
        }
        for (String str : map.keySet()) {
            Matcher matcher = f28898l.matcher(str);
            if (matcher.matches()) {
                try {
                    c3832a.m26626a(Integer.parseInt(matcher.group(1)), String.valueOf(map.get(str)));
                } catch (NumberFormatException e) {
                    String valueOf = String.valueOf(str);
                    C9065aw.m9299b(valueOf.length() != 0 ? "illegal number in custom dimension value: ".concat(valueOf) : new String("illegal number in custom dimension value: "));
                }
            } else {
                Matcher matcher2 = f28899m.matcher(str);
                if (matcher2.matches()) {
                    try {
                        c3832a.m26627a(Integer.parseInt(matcher2.group(1)), m9096b(map.get(str)).intValue());
                    } catch (NumberFormatException e2) {
                        String valueOf2 = String.valueOf(str);
                        C9065aw.m9299b(valueOf2.length() != 0 ? "illegal number in custom metric value: ".concat(valueOf2) : new String("illegal number in custom metric value: "));
                    }
                }
            }
        }
        return c3832a;
    }

    /* renamed from: e */
    private Map<String, String> m9092e(Map<String, AbstractC7090hj.C7091a> map) {
        AbstractC7090hj.C7091a c7091a = map.get(f28895i);
        if (c7091a != null) {
            return m9104a(c7091a);
        }
        if (f28900n == null) {
            HashMap hashMap = new HashMap();
            hashMap.put("transactionId", "&ti");
            hashMap.put("transactionAffiliation", "&ta");
            hashMap.put("transactionTax", "&tt");
            hashMap.put("transactionShipping", "&ts");
            hashMap.put("transactionTotal", "&tr");
            hashMap.put("transactionCurrency", "&cu");
            f28900n = hashMap;
        }
        return f28900n;
    }

    /* renamed from: f */
    private Map<String, String> m9091f(Map<String, AbstractC7090hj.C7091a> map) {
        AbstractC7090hj.C7091a c7091a = map.get(f28896j);
        if (c7091a != null) {
            return m9104a(c7091a);
        }
        if (f28901o == null) {
            HashMap hashMap = new HashMap();
            hashMap.put("name", "&in");
            hashMap.put("sku", "&ic");
            hashMap.put("category", "&iv");
            hashMap.put(C9654a.C9656b.f30239x, "&ip");
            hashMap.put(C9654a.C9656b.f30240y, "&iq");
            hashMap.put(C9654a.C9656b.f30221f, "&cu");
            f28901o = hashMap;
        }
        return f28901o;
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9145cu, com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: a */
    public /* bridge */ /* synthetic */ AbstractC7090hj.C7091a mo8870a(Map map) {
        return super.mo8870a((Map<String, AbstractC7090hj.C7091a>) map);
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9145cu, com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo8872a() {
        return super.mo8872a();
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: b */
    public /* bridge */ /* synthetic */ String mo8877b() {
        return super.b();
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9145cu
    /* renamed from: b */
    public void mo8981b(Map<String, AbstractC7090hj.C7091a> map) {
        C3852g m9152a = this.f28903q.m9152a("_GTM_DEFAULT_TRACKER_");
        m9152a.m26493e(m9100a(map, "collect_adid"));
        if (m9100a(map, f28890d)) {
            m9098b(m9152a, map);
        } else if (m9100a(map, f28889c)) {
            m9152a.m26511a(m9097b(map.get(f28893g)));
        } else if (m9100a(map, f28894h)) {
            m9105a(m9152a, map);
        } else {
            C9065aw.m9299b("Ignoring unknown tag.");
        }
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9229t
    /* renamed from: c */
    public /* bridge */ /* synthetic */ Set mo8876c() {
        return super.c();
    }
}
