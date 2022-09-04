package com.google.android.gms.measurement.internal;

import android.support.annotation.WorkerThread;
import android.support.p001v4.util.ArrayMap;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.amu;
import com.google.android.gms.internal.amw;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.o */
/* loaded from: classes2.dex */
public class C8725o extends AbstractC8683b {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C8725o(C8668aj c8668aj) {
        super(c8668aj);
    }

    /* renamed from: a */
    private Boolean m10489a(amu.C6581b c6581b, amw.C6590b c6590b, long j) {
        amu.C6582c[] c6582cArr;
        amw.C6591c[] c6591cArr;
        amu.C6582c[] c6582cArr2;
        if (c6581b.f22320e != null) {
            Boolean m10812a = new C8653ae(c6581b.f22320e).m10812a(j);
            if (m10812a == null) {
                return null;
            }
            if (!m10812a.booleanValue()) {
                return false;
            }
        }
        HashSet hashSet = new HashSet();
        for (amu.C6582c c6582c : c6581b.f22318c) {
            if (TextUtils.isEmpty(c6582c.f22325d)) {
                w().m10832z().m10830a("null or empty param name in filter. event", c6590b.f22359b);
                return null;
            }
            hashSet.add(c6582c.f22325d);
        }
        ArrayMap arrayMap = new ArrayMap();
        for (amw.C6591c c6591c : c6590b.f22358a) {
            if (hashSet.contains(c6591c.f22364a)) {
                if (c6591c.f22366c != null) {
                    arrayMap.put(c6591c.f22364a, c6591c.f22366c);
                } else if (c6591c.f22368e != null) {
                    arrayMap.put(c6591c.f22364a, c6591c.f22368e);
                } else if (c6591c.f22365b == null) {
                    w().m10832z().m10829a("Unknown value for param. event, param", c6590b.f22359b, c6591c.f22364a);
                    return null;
                } else {
                    arrayMap.put(c6591c.f22364a, c6591c.f22365b);
                }
            }
        }
        for (amu.C6582c c6582c2 : c6581b.f22318c) {
            boolean equals = Boolean.TRUE.equals(c6582c2.f22324c);
            String str = c6582c2.f22325d;
            if (TextUtils.isEmpty(str)) {
                w().m10832z().m10830a("Event has empty param name. event", c6590b.f22359b);
                return null;
            }
            Object obj = arrayMap.get(str);
            if (obj instanceof Long) {
                if (c6582c2.f22323b == null) {
                    w().m10832z().m10829a("No number filter for long param. event, param", c6590b.f22359b, str);
                    return null;
                }
                Boolean m10812a2 = new C8653ae(c6582c2.f22323b).m10812a(((Long) obj).longValue());
                if (m10812a2 == null) {
                    return null;
                }
                if ((!m10812a2.booleanValue()) ^ equals) {
                    return false;
                }
            } else if (obj instanceof Double) {
                if (c6582c2.f22323b == null) {
                    w().m10832z().m10829a("No number filter for double param. event, param", c6590b.f22359b, str);
                    return null;
                }
                Boolean m10813a = new C8653ae(c6582c2.f22323b).m10813a(((Double) obj).doubleValue());
                if (m10813a == null) {
                    return null;
                }
                if ((!m10813a.booleanValue()) ^ equals) {
                    return false;
                }
            } else if (!(obj instanceof String)) {
                if (obj == null) {
                    w().m10843E().m10829a("Missing param for filter. event, param", c6590b.f22359b, str);
                    return false;
                }
                w().m10832z().m10829a("Unknown param type. event, param", c6590b.f22359b, str);
                return null;
            } else if (c6582c2.f22322a == null) {
                w().m10832z().m10829a("No string filter for String param. event, param", c6590b.f22359b, str);
                return null;
            } else {
                Boolean m10564a = new C8717h(c6582c2.f22322a).m10564a((String) obj);
                if (m10564a == null) {
                    return null;
                }
                if ((!m10564a.booleanValue()) ^ equals) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    private Boolean m10488a(amu.C6584e c6584e, amw.C6595g c6595g) {
        amu.C6582c c6582c = c6584e.f22334c;
        if (c6582c == null) {
            w().m10832z().m10830a("Missing property filter. property", c6595g.f22407b);
            return null;
        }
        boolean equals = Boolean.TRUE.equals(c6582c.f22324c);
        if (c6595g.f22409d != null) {
            if (c6582c.f22323b != null) {
                return m10487a(new C8653ae(c6582c.f22323b).m10812a(c6595g.f22409d.longValue()), equals);
            }
            w().m10832z().m10830a("No number filter for long property. property", c6595g.f22407b);
            return null;
        } else if (c6595g.f22411f != null) {
            if (c6582c.f22323b != null) {
                return m10487a(new C8653ae(c6582c.f22323b).m10813a(c6595g.f22411f.doubleValue()), equals);
            }
            w().m10832z().m10830a("No number filter for double property. property", c6595g.f22407b);
            return null;
        } else if (c6595g.f22408c == null) {
            w().m10832z().m10830a("User property has no value, property", c6595g.f22407b);
            return null;
        } else if (c6582c.f22322a != null) {
            return m10487a(new C8717h(c6582c.f22322a).m10564a(c6595g.f22408c), equals);
        } else {
            if (c6582c.f22323b == null) {
                w().m10832z().m10830a("No string or number filter defined. property", c6595g.f22407b);
                return null;
            }
            C8653ae c8653ae = new C8653ae(c6582c.f22323b);
            if (C8723m.m10494n(c6595g.f22408c)) {
                return m10487a(c8653ae.m10811a(c6595g.f22408c), equals);
            }
            w().m10832z().m10829a("Invalid user property value for Numeric number filter. property, value", c6595g.f22407b, c6595g.f22408c);
            return null;
        }
    }

    /* renamed from: a */
    static Boolean m10487a(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() ^ z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: a */
    public void m10486a(String str, amu.C6580a[] c6580aArr) {
        amu.C6581b[] c6581bArr;
        amu.C6584e[] c6584eArr;
        C4588d.m23627a(c6580aArr);
        for (amu.C6580a c6580a : c6580aArr) {
            for (amu.C6581b c6581b : c6580a.f22314c) {
                String str2 = AppMeasurement.C8635a.f27587a.get(c6581b.f22317b);
                if (str2 != null) {
                    c6581b.f22317b = str2;
                }
                amu.C6582c[] c6582cArr = c6581b.f22318c;
                for (amu.C6582c c6582c : c6582cArr) {
                    String str3 = AppMeasurement.C8638d.f27588a.get(c6582c.f22325d);
                    if (str3 != null) {
                        c6582c.f22325d = str3;
                    }
                }
            }
            for (amu.C6584e c6584e : c6580a.f22313b) {
                String str4 = AppMeasurement.C8639e.f27589a.get(c6584e.f22333b);
                if (str4 != null) {
                    c6584e.f22333b = str4;
                }
            }
        }
        r().m10390a(str, c6580aArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: a */
    public amw.C6589a[] m10485a(String str, amw.C6590b[] c6590bArr, amw.C6595g[] c6595gArr) {
        Map<Integer, List<amu.C6584e>> map;
        C8735u m10346a;
        Map<Integer, List<amu.C6581b>> map2;
        C4588d.m23625a(str);
        HashSet hashSet = new HashSet();
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = new ArrayMap();
        ArrayMap arrayMap3 = new ArrayMap();
        Map<Integer, amw.C6594f> m10374f = r().m10374f(str);
        if (m10374f != null) {
            for (Integer num : m10374f.keySet()) {
                int intValue = num.intValue();
                amw.C6594f c6594f = m10374f.get(Integer.valueOf(intValue));
                BitSet bitSet = (BitSet) arrayMap2.get(Integer.valueOf(intValue));
                BitSet bitSet2 = (BitSet) arrayMap3.get(Integer.valueOf(intValue));
                if (bitSet == null) {
                    bitSet = new BitSet();
                    arrayMap2.put(Integer.valueOf(intValue), bitSet);
                    bitSet2 = new BitSet();
                    arrayMap3.put(Integer.valueOf(intValue), bitSet2);
                }
                for (int i = 0; i < c6594f.f22403a.length * 64; i++) {
                    if (C8723m.m10516a(c6594f.f22403a, i)) {
                        w().m10843E().m10829a("Filter already evaluated. audience ID, filter ID", Integer.valueOf(intValue), Integer.valueOf(i));
                        bitSet2.set(i);
                        if (C8723m.m10516a(c6594f.f22404b, i)) {
                            bitSet.set(i);
                        }
                    }
                }
                amw.C6589a c6589a = new amw.C6589a();
                arrayMap.put(Integer.valueOf(intValue), c6589a);
                c6589a.f22356d = false;
                c6589a.f22355c = c6594f;
                c6589a.f22354b = new amw.C6594f();
                c6589a.f22354b.f22404b = C8723m.m10518a(bitSet);
                c6589a.f22354b.f22403a = C8723m.m10518a(bitSet2);
            }
        }
        if (c6590bArr != null) {
            ArrayMap arrayMap4 = new ArrayMap();
            int length = c6590bArr.length;
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= length) {
                    break;
                }
                amw.C6590b c6590b = c6590bArr[i3];
                C8735u m10393a = r().m10393a(str, c6590b.f22359b);
                if (m10393a == null) {
                    w().m10832z().m10830a("Event aggregate wasn't created during raw event logging. event", c6590b.f22359b);
                    m10346a = new C8735u(str, c6590b.f22359b, 1L, 1L, c6590b.f22360c.longValue());
                } else {
                    m10346a = m10393a.m10346a();
                }
                r().m10403a(m10346a);
                long j = m10346a.f27944c;
                Map<Integer, List<amu.C6581b>> map3 = (Map) arrayMap4.get(c6590b.f22359b);
                if (map3 == null) {
                    Map<Integer, List<amu.C6581b>> m10378d = r().m10378d(str, c6590b.f22359b);
                    if (m10378d == null) {
                        m10378d = new ArrayMap<>();
                    }
                    arrayMap4.put(c6590b.f22359b, m10378d);
                    map2 = m10378d;
                } else {
                    map2 = map3;
                }
                for (Integer num2 : map2.keySet()) {
                    int intValue2 = num2.intValue();
                    if (hashSet.contains(Integer.valueOf(intValue2))) {
                        w().m10843E().m10830a("Skipping failed audience ID", Integer.valueOf(intValue2));
                    } else {
                        amw.C6589a c6589a2 = (amw.C6589a) arrayMap.get(Integer.valueOf(intValue2));
                        BitSet bitSet3 = (BitSet) arrayMap2.get(Integer.valueOf(intValue2));
                        BitSet bitSet4 = (BitSet) arrayMap3.get(Integer.valueOf(intValue2));
                        if (c6589a2 == null) {
                            amw.C6589a c6589a3 = new amw.C6589a();
                            arrayMap.put(Integer.valueOf(intValue2), c6589a3);
                            c6589a3.f22356d = true;
                            bitSet3 = new BitSet();
                            arrayMap2.put(Integer.valueOf(intValue2), bitSet3);
                            bitSet4 = new BitSet();
                            arrayMap3.put(Integer.valueOf(intValue2), bitSet4);
                        }
                        for (amu.C6581b c6581b : map2.get(Integer.valueOf(intValue2))) {
                            if (w().m10841a(2)) {
                                w().m10843E().m10828a("Evaluating filter. audience, filter, event", Integer.valueOf(intValue2), c6581b.f22316a, c6581b.f22317b);
                                w().m10843E().m10830a("Filter definition", C8723m.m10542a(c6581b));
                            }
                            if (c6581b.f22316a == null || c6581b.f22316a.intValue() > 256) {
                                w().m10832z().m10830a("Invalid event filter ID. id", String.valueOf(c6581b.f22316a));
                            } else if (bitSet3.get(c6581b.f22316a.intValue())) {
                                w().m10843E().m10829a("Event filter already evaluated true. audience ID, filter ID", Integer.valueOf(intValue2), c6581b.f22316a);
                            } else {
                                Boolean m10489a = m10489a(c6581b, c6590b, j);
                                w().m10843E().m10830a("Event filter result", m10489a == null ? "null" : m10489a);
                                if (m10489a == null) {
                                    hashSet.add(Integer.valueOf(intValue2));
                                } else {
                                    bitSet4.set(c6581b.f22316a.intValue());
                                    if (m10489a.booleanValue()) {
                                        bitSet3.set(c6581b.f22316a.intValue());
                                    }
                                }
                            }
                        }
                    }
                }
                i2 = i3 + 1;
            }
        }
        if (c6595gArr != null) {
            ArrayMap arrayMap5 = new ArrayMap();
            for (amw.C6595g c6595g : c6595gArr) {
                Map<Integer, List<amu.C6584e>> map4 = (Map) arrayMap5.get(c6595g.f22407b);
                if (map4 == null) {
                    Map<Integer, List<amu.C6584e>> m10376e = r().m10376e(str, c6595g.f22407b);
                    if (m10376e == null) {
                        m10376e = new ArrayMap<>();
                    }
                    arrayMap5.put(c6595g.f22407b, m10376e);
                    map = m10376e;
                } else {
                    map = map4;
                }
                for (Integer num3 : map.keySet()) {
                    int intValue3 = num3.intValue();
                    if (hashSet.contains(Integer.valueOf(intValue3))) {
                        w().m10843E().m10830a("Skipping failed audience ID", Integer.valueOf(intValue3));
                    } else {
                        amw.C6589a c6589a4 = (amw.C6589a) arrayMap.get(Integer.valueOf(intValue3));
                        BitSet bitSet5 = (BitSet) arrayMap2.get(Integer.valueOf(intValue3));
                        BitSet bitSet6 = (BitSet) arrayMap3.get(Integer.valueOf(intValue3));
                        if (c6589a4 == null) {
                            amw.C6589a c6589a5 = new amw.C6589a();
                            arrayMap.put(Integer.valueOf(intValue3), c6589a5);
                            c6589a5.f22356d = true;
                            bitSet5 = new BitSet();
                            arrayMap2.put(Integer.valueOf(intValue3), bitSet5);
                            bitSet6 = new BitSet();
                            arrayMap3.put(Integer.valueOf(intValue3), bitSet6);
                        }
                        for (amu.C6584e c6584e : map.get(Integer.valueOf(intValue3))) {
                            if (w().m10841a(2)) {
                                w().m10843E().m10828a("Evaluating filter. audience, filter, property", Integer.valueOf(intValue3), c6584e.f22332a, c6584e.f22333b);
                                w().m10843E().m10830a("Filter definition", C8723m.m10541a(c6584e));
                            }
                            if (c6584e.f22332a == null || c6584e.f22332a.intValue() > 256) {
                                w().m10832z().m10830a("Invalid property filter ID. id", String.valueOf(c6584e.f22332a));
                                hashSet.add(Integer.valueOf(intValue3));
                                break;
                            } else if (bitSet5.get(c6584e.f22332a.intValue())) {
                                w().m10843E().m10829a("Property filter already evaluated true. audience ID, filter ID", Integer.valueOf(intValue3), c6584e.f22332a);
                            } else {
                                Boolean m10488a = m10488a(c6584e, c6595g);
                                w().m10843E().m10830a("Property filter result", m10488a == null ? "null" : m10488a);
                                if (m10488a == null) {
                                    hashSet.add(Integer.valueOf(intValue3));
                                } else {
                                    bitSet6.set(c6584e.f22332a.intValue());
                                    if (m10488a.booleanValue()) {
                                        bitSet5.set(c6584e.f22332a.intValue());
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        amw.C6589a[] c6589aArr = new amw.C6589a[arrayMap2.size()];
        int i4 = 0;
        for (K k : arrayMap2.keySet()) {
            int intValue4 = k.intValue();
            if (!hashSet.contains(Integer.valueOf(intValue4))) {
                amw.C6589a c6589a6 = (amw.C6589a) arrayMap.get(Integer.valueOf(intValue4));
                if (c6589a6 == null) {
                    c6589a6 = new amw.C6589a();
                }
                amw.C6589a c6589a7 = c6589a6;
                c6589aArr[i4] = c6589a7;
                c6589a7.f22353a = Integer.valueOf(intValue4);
                c6589a7.f22354b = new amw.C6594f();
                c6589a7.f22354b.f22404b = C8723m.m10518a((BitSet) arrayMap2.get(Integer.valueOf(intValue4)));
                c6589a7.f22354b.f22403a = C8723m.m10518a((BitSet) arrayMap3.get(Integer.valueOf(intValue4)));
                r().m10397a(str, intValue4, c6589a7.f22354b);
                i4++;
            }
        }
        return (amw.C6589a[]) Arrays.copyOf(c6589aArr, i4);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC8683b
    /* renamed from: e */
    protected void mo10312e() {
    }
}
