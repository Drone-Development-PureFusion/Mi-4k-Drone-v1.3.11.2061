package p005b.p006a.p007a.p008a.p027o;

import java.util.LinkedHashMap;
import java.util.Map;
/* renamed from: b.a.a.a.o.c */
/* loaded from: classes.dex */
class C0385c extends LinkedHashMap<String, Integer> {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    final int f439a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0385c(int i) {
        super((int) (i * 1.3333334f), 0.75f, true);
        if (i < 1) {
            throw new IllegalArgumentException("Cache size cannot be smaller than 1");
        }
        this.f439a = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m39469a(String str) {
        Integer valueOf;
        if (str == null) {
            return 0;
        }
        synchronized (this) {
            Integer num = (Integer) super.get(str);
            valueOf = num == null ? 0 : Integer.valueOf(num.intValue() + 1);
            super.put(str, valueOf);
        }
        return valueOf.intValue();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public synchronized void clear() {
        super.clear();
    }

    @Override // java.util.LinkedHashMap
    protected boolean removeEldestEntry(Map.Entry<String, Integer> entry) {
        return size() > this.f439a;
    }
}
