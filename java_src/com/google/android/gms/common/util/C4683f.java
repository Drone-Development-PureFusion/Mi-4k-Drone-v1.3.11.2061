package com.google.android.gms.common.util;

import android.support.p001v4.util.ArrayMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* renamed from: com.google.android.gms.common.util.f */
/* loaded from: classes2.dex */
public final class C4683f {
    /* renamed from: a */
    public static <T> List<T> m23151a(T t) {
        return Collections.singletonList(t);
    }

    /* renamed from: a */
    public static <T> List<T> m23150a(T t, T t2) {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(t);
        arrayList.add(t2);
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m23147a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        ArrayMap arrayMap = new ArrayMap(6);
        arrayMap.put(k, v);
        arrayMap.put(k2, v2);
        arrayMap.put(k3, v3);
        arrayMap.put(k4, v4);
        arrayMap.put(k5, v5);
        arrayMap.put(k6, v6);
        return Collections.unmodifiableMap(arrayMap);
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m23145a(K[] kArr, V[] vArr) {
        m23141b((Object[]) kArr, (Object[]) vArr);
        int length = kArr.length;
        switch (length) {
            case 0:
                return m23144b();
            case 1:
                return m23140c(kArr[0], vArr[0]);
            default:
                Map arrayMap = length <= 32 ? new ArrayMap(length) : new HashMap(length, 1.0f);
                for (int i = 0; i < length; i++) {
                    arrayMap.put(kArr[i], vArr[i]);
                }
                return Collections.unmodifiableMap(arrayMap);
        }
    }

    /* renamed from: a */
    public static <T> Set<T> m23152a() {
        return Collections.emptySet();
    }

    /* renamed from: a */
    public static <T> Set<T> m23149a(T t, T t2, T t3) {
        C4678a c4678a = new C4678a(3);
        c4678a.add(t);
        c4678a.add(t2);
        c4678a.add(t3);
        return Collections.unmodifiableSet(c4678a);
    }

    /* renamed from: a */
    public static <T> Set<T> m23148a(T t, T t2, T t3, T t4) {
        C4678a c4678a = new C4678a(4);
        c4678a.add(t);
        c4678a.add(t2);
        c4678a.add(t3);
        c4678a.add(t4);
        return Collections.unmodifiableSet(c4678a);
    }

    /* renamed from: a */
    public static <T> Set<T> m23146a(T... tArr) {
        switch (tArr.length) {
            case 0:
                return m23152a();
            case 1:
                return m23143b(tArr[0]);
            case 2:
                return m23142b(tArr[0], tArr[1]);
            case 3:
                return m23149a(tArr[0], tArr[1], tArr[2]);
            case 4:
                return m23148a(tArr[0], tArr[1], tArr[2], tArr[3]);
            default:
                return Collections.unmodifiableSet(tArr.length <= 32 ? new C4678a(Arrays.asList(tArr)) : new HashSet(Arrays.asList(tArr)));
        }
    }

    /* renamed from: b */
    public static <K, V> Map<K, V> m23144b() {
        return Collections.emptyMap();
    }

    /* renamed from: b */
    public static <T> Set<T> m23143b(T t) {
        return Collections.singleton(t);
    }

    /* renamed from: b */
    public static <T> Set<T> m23142b(T t, T t2) {
        C4678a c4678a = new C4678a(2);
        c4678a.add(t);
        c4678a.add(t2);
        return Collections.unmodifiableSet(c4678a);
    }

    /* renamed from: b */
    private static <K, V> void m23141b(K[] kArr, V[] vArr) {
        if (kArr.length != vArr.length) {
            int length = kArr.length;
            throw new IllegalArgumentException(new StringBuilder(66).append("Key and values array lengths not equal: ").append(length).append(" != ").append(vArr.length).toString());
        }
    }

    /* renamed from: c */
    public static <K, V> Map<K, V> m23140c(K k, V v) {
        return Collections.singletonMap(k, v);
    }
}
