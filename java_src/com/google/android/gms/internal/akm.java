package com.google.android.gms.internal;

import com.fimi.soul.media.player.FimiMediaMeta;
import com.google.android.gms.fitness.data.Field;
import com.google.firebase.p253b.C9755a;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* loaded from: classes2.dex */
public class akm {

    /* renamed from: a */
    public static final Set<String> f22129a = Collections.unmodifiableSet(new HashSet(Arrays.asList("altitude", "duration", "food_item", "meal_type", "repetitions", "resistance", "resistance_type", "debug_session")));

    /* renamed from: d */
    private static final akm f22130d = new akm();

    /* renamed from: b */
    private final Map<String, Map<String, C6451a>> f22131b;

    /* renamed from: c */
    private final Map<String, C6451a> f22132c;

    /* renamed from: com.google.android.gms.internal.akm$a */
    /* loaded from: classes2.dex */
    public static class C6451a {

        /* renamed from: a */
        private final double f22133a;

        /* renamed from: b */
        private final double f22134b;

        private C6451a(double d, double d2) {
            this.f22133a = d;
            this.f22134b = d2;
        }

        /* renamed from: a */
        public boolean m17016a(double d) {
            return d >= this.f22133a && d <= this.f22134b;
        }
    }

    private akm() {
        HashMap hashMap = new HashMap();
        hashMap.put("latitude", new C6451a(-90.0d, 90.0d));
        hashMap.put("longitude", new C6451a(-180.0d, 180.0d));
        hashMap.put("accuracy", new C6451a(C9755a.f30449c, 10000.0d));
        hashMap.put("bpm", new C6451a(C9755a.f30449c, 1000.0d));
        hashMap.put("altitude", new C6451a(-100000.0d, 100000.0d));
        hashMap.put("percentage", new C6451a(C9755a.f30449c, 100.0d));
        hashMap.put("confidence", new C6451a(C9755a.f30449c, 100.0d));
        hashMap.put("duration", new C6451a(C9755a.f30449c, 9.223372036854776E18d));
        hashMap.put(FimiMediaMeta.IJKM_KEY_HEIGHT, new C6451a(C9755a.f30449c, 3.0d));
        hashMap.put("weight", new C6451a(C9755a.f30449c, 1000.0d));
        hashMap.put("speed", new C6451a(C9755a.f30449c, 11000.0d));
        this.f22132c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("com.google.step_count.delta", m17019a("steps", new C6451a(C9755a.f30449c, 1.0E-8d)));
        hashMap2.put("com.google.calories.consumed", m17019a(Field.f18509I, new C6451a(C9755a.f30449c, 1.0E-6d)));
        hashMap2.put("com.google.calories.expended", m17019a(Field.f18509I, new C6451a(C9755a.f30449c, 5.555555555555555E-10d)));
        hashMap2.put("com.google.distance.delta", m17019a("distance", new C6451a(C9755a.f30449c, 1.0E-7d)));
        this.f22131b = Collections.unmodifiableMap(hashMap2);
    }

    /* renamed from: a */
    public static akm m17020a() {
        return f22130d;
    }

    /* renamed from: a */
    private static <K, V> Map<K, V> m17019a(K k, V v) {
        HashMap hashMap = new HashMap();
        hashMap.put(k, v);
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C6451a m17018a(String str) {
        return this.f22132c.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C6451a m17017a(String str, String str2) {
        Map<String, C6451a> map = this.f22131b.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }
}
