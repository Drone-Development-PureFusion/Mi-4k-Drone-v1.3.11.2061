package p005b.p006a.p007a.p008a.p028p;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.p356d.p360d.AbstractC11754c;
/* renamed from: b.a.a.a.p.f */
/* loaded from: classes.dex */
public final class C0398f implements AbstractC11754c {

    /* renamed from: c */
    private static final int f470c = 1;

    /* renamed from: d */
    private static final int f471d = 2;

    /* renamed from: a */
    final InheritableThreadLocal<Map<String, String>> f472a = new InheritableThreadLocal<>();

    /* renamed from: b */
    final ThreadLocal<Integer> f473b = new ThreadLocal<>();

    /* renamed from: a */
    private Integer m39428a(int i) {
        Integer num = this.f473b.get();
        this.f473b.set(Integer.valueOf(i));
        return num;
    }

    /* renamed from: a */
    private boolean m39427a(Integer num) {
        return num == null || num.intValue() == 2;
    }

    /* renamed from: b */
    private Map<String, String> m39425b(Map<String, String> map) {
        Map<String, String> synchronizedMap = Collections.synchronizedMap(new HashMap());
        if (map != null) {
            synchronized (map) {
                synchronizedMap.putAll(map);
            }
        }
        this.f472a.set(synchronizedMap);
        return synchronizedMap;
    }

    @Override // org.p356d.p360d.AbstractC11754c
    /* renamed from: a */
    public void mo28a() {
        this.f473b.set(1);
        this.f472a.remove();
    }

    @Override // org.p356d.p360d.AbstractC11754c
    /* renamed from: a */
    public void mo27a(String str) {
        Map<String, String> map;
        if (str == null || (map = this.f472a.get()) == null) {
            return;
        }
        if (m39427a(m39428a(1))) {
            m39425b(map).remove(str);
        } else {
            map.remove(str);
        }
    }

    @Override // org.p356d.p360d.AbstractC11754c
    /* renamed from: a */
    public void mo26a(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("key cannot be null");
        }
        Map<String, String> map = this.f472a.get();
        if (m39427a(m39428a(1)) || map == null) {
            m39425b(map).put(str, str2);
        } else {
            map.put(str, str2);
        }
    }

    @Override // org.p356d.p360d.AbstractC11754c
    /* renamed from: a */
    public void mo25a(Map map) {
        this.f473b.set(1);
        Map<String, String> synchronizedMap = Collections.synchronizedMap(new HashMap());
        synchronizedMap.putAll(map);
        this.f472a.set(synchronizedMap);
    }

    @Override // org.p356d.p360d.AbstractC11754c
    /* renamed from: b */
    public String mo24b(String str) {
        Map<String, String> m39426b = m39426b();
        if (m39426b == null || str == null) {
            return null;
        }
        return m39426b.get(str);
    }

    /* renamed from: b */
    public Map<String, String> m39426b() {
        this.f473b.set(2);
        return this.f472a.get();
    }

    /* renamed from: c */
    public Set<String> m39424c() {
        Map<String, String> m39426b = m39426b();
        if (m39426b != null) {
            return m39426b.keySet();
        }
        return null;
    }

    @Override // org.p356d.p360d.AbstractC11754c
    /* renamed from: d */
    public Map mo23d() {
        this.f473b.set(2);
        Map<String, String> map = this.f472a.get();
        if (map == null) {
            return null;
        }
        return new HashMap(map);
    }
}
