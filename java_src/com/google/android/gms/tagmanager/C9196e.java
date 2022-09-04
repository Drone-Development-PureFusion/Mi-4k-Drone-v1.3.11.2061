package com.google.android.gms.tagmanager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;
/* renamed from: com.google.android.gms.tagmanager.e */
/* loaded from: classes2.dex */
public class C9196e {

    /* renamed from: b */
    public static final String f29004b = "event";

    /* renamed from: e */
    private final ConcurrentHashMap<AbstractC9200b, Integer> f29007e;

    /* renamed from: f */
    private final Map<String, Object> f29008f;

    /* renamed from: g */
    private final ReentrantLock f29009g;

    /* renamed from: h */
    private final LinkedList<Map<String, Object>> f29010h;

    /* renamed from: i */
    private final AbstractC9201c f29011i;

    /* renamed from: j */
    private final CountDownLatch f29012j;

    /* renamed from: a */
    public static final Object f29003a = new Object();

    /* renamed from: c */
    static final String[] f29005c = "gtm.lifetime".toString().split("\\.");

    /* renamed from: d */
    private static final Pattern f29006d = Pattern.compile("(\\d+)\\s*([smhd]?)");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.tagmanager.e$a */
    /* loaded from: classes2.dex */
    public static final class C9199a {

        /* renamed from: a */
        public final String f29014a;

        /* renamed from: b */
        public final Object f29015b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C9199a(String str, Object obj) {
            this.f29014a = str;
            this.f29015b = obj;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C9199a)) {
                return false;
            }
            C9199a c9199a = (C9199a) obj;
            return this.f29014a.equals(c9199a.f29014a) && this.f29015b.equals(c9199a.f29015b);
        }

        public int hashCode() {
            return Arrays.hashCode(new Integer[]{Integer.valueOf(this.f29014a.hashCode()), Integer.valueOf(this.f29015b.hashCode())});
        }

        public String toString() {
            String str = this.f29014a;
            String valueOf = String.valueOf(this.f29015b.toString());
            return new StringBuilder(String.valueOf(str).length() + 13 + String.valueOf(valueOf).length()).append("Key: ").append(str).append(" value: ").append(valueOf).toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.tagmanager.e$b */
    /* loaded from: classes2.dex */
    public interface AbstractC9200b {
        /* renamed from: a */
        void mo8927a(Map<String, Object> map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.tagmanager.e$c */
    /* loaded from: classes2.dex */
    public interface AbstractC9201c {

        /* renamed from: com.google.android.gms.tagmanager.e$c$a */
        /* loaded from: classes2.dex */
        public interface AbstractC9202a {
            /* renamed from: a */
            void mo8945a(List<C9199a> list);
        }

        /* renamed from: a */
        void mo8948a(AbstractC9202a abstractC9202a);

        /* renamed from: a */
        void mo8947a(String str);

        /* renamed from: a */
        void mo8946a(List<C9199a> list, long j);
    }

    C9196e() {
        this(new AbstractC9201c() { // from class: com.google.android.gms.tagmanager.e.1
            @Override // com.google.android.gms.tagmanager.C9196e.AbstractC9201c
            /* renamed from: a */
            public void mo8948a(AbstractC9201c.AbstractC9202a abstractC9202a) {
                abstractC9202a.mo8945a(new ArrayList());
            }

            @Override // com.google.android.gms.tagmanager.C9196e.AbstractC9201c
            /* renamed from: a */
            public void mo8947a(String str) {
            }

            @Override // com.google.android.gms.tagmanager.C9196e.AbstractC9201c
            /* renamed from: a */
            public void mo8946a(List<C9199a> list, long j) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9196e(AbstractC9201c abstractC9201c) {
        this.f29011i = abstractC9201c;
        this.f29007e = new ConcurrentHashMap<>();
        this.f29008f = new HashMap();
        this.f29009g = new ReentrantLock();
        this.f29010h = new LinkedList<>();
        this.f29012j = new CountDownLatch(1);
        m8972a();
    }

    /* renamed from: a */
    public static Map<String, Object> m8961a(Object... objArr) {
        if (objArr.length % 2 != 0) {
            throw new IllegalArgumentException("expected even number of key-value pairs");
        }
        HashMap hashMap = new HashMap();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= objArr.length) {
                return hashMap;
            }
            if (!(objArr[i2] instanceof String)) {
                String valueOf = String.valueOf(objArr[i2]);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 21).append("key is not a string: ").append(valueOf).toString());
            }
            hashMap.put((String) objArr[i2], objArr[i2 + 1]);
            i = i2 + 2;
        }
    }

    /* renamed from: a */
    private void m8972a() {
        this.f29011i.mo8948a(new AbstractC9201c.AbstractC9202a() { // from class: com.google.android.gms.tagmanager.e.2
            @Override // com.google.android.gms.tagmanager.C9196e.AbstractC9201c.AbstractC9202a
            /* renamed from: a */
            public void mo8945a(List<C9199a> list) {
                for (C9199a c9199a : list) {
                    C9196e.this.m8957b(C9196e.this.m8958b(c9199a.f29014a, c9199a.f29015b));
                }
                C9196e.this.f29012j.countDown();
            }
        });
    }

    /* renamed from: a */
    private void m8963a(Map<String, Object> map, String str, Collection<C9199a> collection) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String str2 = str.length() == 0 ? "" : ".";
            String key = entry.getKey();
            String sb = new StringBuilder(String.valueOf(str).length() + 0 + String.valueOf(str2).length() + String.valueOf(key).length()).append(str).append(str2).append(key).toString();
            if (entry.getValue() instanceof Map) {
                m8963a((Map) entry.getValue(), sb, collection);
            } else if (!sb.equals("gtm.lifetime")) {
                collection.add(new C9199a(sb, entry.getValue()));
            }
        }
    }

    /* renamed from: b */
    static Long m8959b(String str) {
        long j;
        Matcher matcher = f29006d.matcher(str);
        if (!matcher.matches()) {
            String valueOf = String.valueOf(str);
            C9065aw.m9297c(valueOf.length() != 0 ? "unknown _lifetime: ".concat(valueOf) : new String("unknown _lifetime: "));
            return null;
        }
        try {
            j = Long.parseLong(matcher.group(1));
        } catch (NumberFormatException e) {
            String valueOf2 = String.valueOf(str);
            C9065aw.m9299b(valueOf2.length() != 0 ? "illegal number in _lifetime value: ".concat(valueOf2) : new String("illegal number in _lifetime value: "));
            j = 0;
        }
        if (j <= 0) {
            String valueOf3 = String.valueOf(str);
            C9065aw.m9297c(valueOf3.length() != 0 ? "non-positive _lifetime: ".concat(valueOf3) : new String("non-positive _lifetime: "));
            return null;
        }
        String group = matcher.group(2);
        if (group.length() == 0) {
            return Long.valueOf(j);
        }
        switch (group.charAt(0)) {
            case 'd':
                return Long.valueOf(j * 1000 * 60 * 60 * 24);
            case 'h':
                return Long.valueOf(j * 1000 * 60 * 60);
            case 'm':
                return Long.valueOf(j * 1000 * 60);
            case Opcodes.DREM /* 115 */:
                return Long.valueOf(j * 1000);
            default:
                String valueOf4 = String.valueOf(str);
                C9065aw.m9299b(valueOf4.length() != 0 ? "unknown units in _lifetime: ".concat(valueOf4) : new String("unknown units in _lifetime: "));
                return null;
        }
    }

    /* renamed from: b */
    public static List<Object> m8956b(Object... objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* renamed from: b */
    private void m8960b() {
        int i = 0;
        while (true) {
            int i2 = i;
            Map<String, Object> poll = this.f29010h.poll();
            if (poll != null) {
                m8950g(poll);
                i = i2 + 1;
                if (i > 500) {
                    this.f29010h.clear();
                    throw new RuntimeException("Seems like an infinite loop of pushing to the data layer");
                }
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m8957b(Map<String, Object> map) {
        this.f29009g.lock();
        try {
            this.f29010h.offer(map);
            if (this.f29009g.getHoldCount() == 1) {
                m8960b();
            }
            m8954c(map);
        } finally {
            this.f29009g.unlock();
        }
    }

    /* renamed from: c */
    private void m8954c(Map<String, Object> map) {
        Long m8953d = m8953d(map);
        if (m8953d == null) {
            return;
        }
        List<C9199a> m8951f = m8951f(map);
        m8951f.remove("gtm.lifetime");
        this.f29011i.mo8946a(m8951f, m8953d.longValue());
    }

    /* renamed from: d */
    private Long m8953d(Map<String, Object> map) {
        Object m8952e = m8952e(map);
        if (m8952e == null) {
            return null;
        }
        return m8959b(m8952e.toString());
    }

    /* renamed from: e */
    private Object m8952e(Map<String, Object> map) {
        String[] strArr = f29005c;
        int length = strArr.length;
        int i = 0;
        Map<String, Object> map2 = map;
        while (i < length) {
            String str = strArr[i];
            if (!(map2 instanceof Map)) {
                return null;
            }
            i++;
            map2 = map2.get(str);
        }
        return map2;
    }

    /* renamed from: f */
    private List<C9199a> m8951f(Map<String, Object> map) {
        ArrayList arrayList = new ArrayList();
        m8963a(map, "", arrayList);
        return arrayList;
    }

    /* renamed from: g */
    private void m8950g(Map<String, Object> map) {
        synchronized (this.f29008f) {
            for (String str : map.keySet()) {
                m8962a(m8958b(str, map.get(str)), this.f29008f);
            }
        }
        m8949h(map);
    }

    /* renamed from: h */
    private void m8949h(Map<String, Object> map) {
        for (AbstractC9200b abstractC9200b : this.f29007e.keySet()) {
            abstractC9200b.mo8927a(map);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m8971a(AbstractC9200b abstractC9200b) {
        this.f29007e.put(abstractC9200b, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m8968a(String str) {
        m8967a(str, (Object) null);
        this.f29011i.mo8947a(str);
    }

    /* renamed from: a */
    public void m8967a(String str, Object obj) {
        m8964a(m8958b(str, obj));
    }

    /* renamed from: a */
    public void m8966a(String str, Map<String, Object> map) {
        HashMap hashMap = new HashMap(map);
        hashMap.put(f29004b, str);
        m8964a(hashMap);
    }

    /* renamed from: a */
    void m8965a(List<Object> list, List<Object> list2) {
        while (list2.size() < list.size()) {
            list2.add(null);
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < list.size()) {
                Object obj = list.get(i2);
                if (obj instanceof List) {
                    if (!(list2.get(i2) instanceof List)) {
                        list2.set(i2, new ArrayList());
                    }
                    m8965a((List) obj, (List) list2.get(i2));
                } else if (obj instanceof Map) {
                    if (!(list2.get(i2) instanceof Map)) {
                        list2.set(i2, new HashMap());
                    }
                    m8962a((Map) obj, (Map) list2.get(i2));
                } else if (obj != f29003a) {
                    list2.set(i2, obj);
                }
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public void m8964a(Map<String, Object> map) {
        try {
            this.f29012j.await();
        } catch (InterruptedException e) {
            C9065aw.m9299b("DataLayer.push: unexpected InterruptedException");
        }
        m8957b(map);
    }

    /* renamed from: a */
    void m8962a(Map<String, Object> map, Map<String, Object> map2) {
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj instanceof List) {
                if (!(map2.get(str) instanceof List)) {
                    map2.put(str, new ArrayList());
                }
                m8965a((List) obj, (List) map2.get(str));
            } else if (obj instanceof Map) {
                if (!(map2.get(str) instanceof Map)) {
                    map2.put(str, new HashMap());
                }
                m8962a((Map) obj, (Map) map2.get(str));
            } else {
                map2.put(str, obj);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public Map<String, Object> m8958b(String str, Object obj) {
        HashMap hashMap = new HashMap();
        String[] split = str.toString().split("\\.");
        int i = 0;
        HashMap hashMap2 = hashMap;
        while (i < split.length - 1) {
            HashMap hashMap3 = new HashMap();
            hashMap2.put(split[i], hashMap3);
            i++;
            hashMap2 = hashMap3;
        }
        hashMap2.put(split[split.length - 1], obj);
        return hashMap;
    }

    /* renamed from: c */
    public Object m8955c(String str) {
        synchronized (this.f29008f) {
            Map<String, Object> map = this.f29008f;
            String[] split = str.split("\\.");
            int length = split.length;
            Map<String, Object> map2 = map;
            int i = 0;
            while (i < length) {
                String str2 = split[i];
                if (!(map2 instanceof Map)) {
                    return null;
                }
                Object obj = map2.get(str2);
                if (obj == null) {
                    return null;
                }
                i++;
                map2 = obj;
            }
            return map2;
        }
    }

    public String toString() {
        String sb;
        synchronized (this.f29008f) {
            StringBuilder sb2 = new StringBuilder();
            for (Map.Entry<String, Object> entry : this.f29008f.entrySet()) {
                sb2.append(String.format("{\n\tKey: %s\n\tValue: %s\n}\n", entry.getKey(), entry.getValue()));
            }
            sb = sb2.toString();
        }
        return sb;
    }
}
