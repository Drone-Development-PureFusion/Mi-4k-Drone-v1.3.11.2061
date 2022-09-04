package com.google.android.gms.internal;

import android.os.Bundle;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.C4588d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.ek */
/* loaded from: classes2.dex */
public class C6895ek {
    /* renamed from: a */
    public static Bundle m16022a(Map<String, AbstractC6880ea<?>> map) {
        if (map == null) {
            return null;
        }
        Bundle bundle = new Bundle(map.size());
        for (Map.Entry<String, AbstractC6880ea<?>> entry : map.entrySet()) {
            if (entry.getValue() instanceof C6893ej) {
                bundle.putString(entry.getKey(), (String) ((C6893ej) entry.getValue()).mo16034b());
            } else if (entry.getValue() instanceof C6883eb) {
                bundle.putBoolean(entry.getKey(), ((Boolean) ((C6883eb) entry.getValue()).mo16034b()).booleanValue());
            } else if (entry.getValue() instanceof C6884ec) {
                bundle.putDouble(entry.getKey(), ((Double) ((C6884ec) entry.getValue()).mo16034b()).doubleValue());
            } else if (!(entry.getValue() instanceof C6891eh)) {
                throw new IllegalArgumentException(String.format("Invalid param type for key '%s'. Only boolean, double and string types and maps of thereof are supported.", entry.getKey()));
            } else {
                bundle.putBundle(entry.getKey(), m16022a(((C6891eh) entry.getValue()).mo16034b()));
            }
        }
        return bundle;
    }

    /* renamed from: a */
    public static AbstractC6880ea m16028a(apr aprVar, AbstractC6880ea abstractC6880ea) {
        C4588d.m23627a(abstractC6880ea);
        if (!m16020c(abstractC6880ea) && !(abstractC6880ea instanceof C6885ed) && !(abstractC6880ea instanceof C6887ef) && !(abstractC6880ea instanceof C6891eh)) {
            if (!(abstractC6880ea instanceof C6892ei)) {
                throw new UnsupportedOperationException("Attempting to evaluate unknown type");
            }
            abstractC6880ea = m16027a(aprVar, (C6892ei) abstractC6880ea);
        }
        if (abstractC6880ea != null) {
            if (!(abstractC6880ea instanceof C6892ei)) {
                return abstractC6880ea;
            }
            throw new IllegalArgumentException("AbstractType evaluated to illegal type Statement.");
        }
        throw new IllegalArgumentException("AbstractType evaluated to Java null");
    }

    /* renamed from: a */
    public static AbstractC6880ea m16027a(apr aprVar, C6892ei c6892ei) {
        String m16039e = c6892ei.m16039e();
        List<AbstractC6880ea<?>> m16038f = c6892ei.m16038f();
        AbstractC6880ea<?> m16315b = aprVar.m16315b(m16039e);
        if (m16315b == null) {
            throw new UnsupportedOperationException(new StringBuilder(String.valueOf(m16039e).length() + 28).append("Function '").append(m16039e).append("' is not supported").toString());
        }
        if (m16315b instanceof C6885ed) {
            return ((aqe) ((C6885ed) m16315b).mo16034b()).mo12846a_(aprVar, (AbstractC6880ea[]) m16038f.toArray(new AbstractC6880ea[m16038f.size()]));
        }
        throw new UnsupportedOperationException(new StringBuilder(String.valueOf(m16039e).length() + 29).append("Function '").append(m16039e).append("' is not a function").toString());
    }

    /* renamed from: a */
    public static AbstractC6880ea<?> m16024a(@Nullable Object obj) {
        if (obj == null) {
            return C6886ee.f23121d;
        }
        if (obj instanceof AbstractC6880ea) {
            return (AbstractC6880ea) obj;
        }
        if (obj instanceof Boolean) {
            return new C6883eb((Boolean) obj);
        }
        if (obj instanceof Short) {
            return new C6884ec(Double.valueOf(((Short) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C6884ec(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Long) {
            return new C6884ec(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Float) {
            return new C6884ec(Double.valueOf(((Float) obj).doubleValue()));
        }
        if (obj instanceof Double) {
            return new C6884ec((Double) obj);
        }
        if (!(obj instanceof Byte) && !(obj instanceof Character)) {
            if (obj instanceof String) {
                return new C6893ej((String) obj);
            }
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (List) obj) {
                    arrayList.add(m16024a(obj2));
                }
                return new C6887ef(arrayList);
            } else if (obj instanceof Map) {
                HashMap hashMap = new HashMap();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    C4588d.m23619b(entry.getKey() instanceof String);
                    hashMap.put((String) entry.getKey(), m16024a(entry.getValue()));
                }
                return new C6891eh(hashMap);
            } else if (!(obj instanceof Bundle)) {
                String valueOf = String.valueOf(obj.getClass());
                throw new UnsupportedOperationException(new StringBuilder(String.valueOf(valueOf).length() + 20).append("Type not supported: ").append(valueOf).toString());
            } else {
                HashMap hashMap2 = new HashMap();
                for (String str : ((Bundle) obj).keySet()) {
                    hashMap2.put(str, m16024a(((Bundle) obj).get(str)));
                }
                return new C6891eh(hashMap2);
            }
        }
        return new C6893ej(obj.toString());
    }

    /* renamed from: a */
    public static C6886ee m16026a(apr aprVar, List<AbstractC6880ea<?>> list) {
        for (AbstractC6880ea<?> abstractC6880ea : list) {
            C4588d.m23619b(abstractC6880ea instanceof C6892ei);
            AbstractC6880ea m16028a = m16028a(aprVar, abstractC6880ea);
            if (m16019d(m16028a)) {
                return (C6886ee) m16028a;
            }
        }
        return C6886ee.f23122e;
    }

    /* renamed from: a */
    public static Object m16025a(AbstractC6880ea<?> abstractC6880ea) {
        if (abstractC6880ea != null && abstractC6880ea != C6886ee.f23121d) {
            if (abstractC6880ea instanceof C6883eb) {
                return (Boolean) ((C6883eb) abstractC6880ea).mo16034b();
            }
            if (abstractC6880ea instanceof C6884ec) {
                double doubleValue = ((Double) ((C6884ec) abstractC6880ea).mo16034b()).doubleValue();
                return (Double.isInfinite(doubleValue) || doubleValue - Math.floor(doubleValue) >= 1.0E-5d) ? ((Double) ((C6884ec) abstractC6880ea).mo16034b()).toString() : Integer.valueOf((int) doubleValue);
            } else if (abstractC6880ea instanceof C6893ej) {
                return (String) ((C6893ej) abstractC6880ea).mo16034b();
            } else {
                if (abstractC6880ea instanceof C6887ef) {
                    ArrayList arrayList = new ArrayList();
                    for (AbstractC6880ea<?> abstractC6880ea2 : ((C6887ef) abstractC6880ea).mo16034b()) {
                        Object m16025a = m16025a(abstractC6880ea2);
                        if (m16025a == null) {
                            aph.m16396a(String.format("Failure to convert a list element to object: %s (%s)", abstractC6880ea2, abstractC6880ea2.getClass().getCanonicalName()));
                            return null;
                        }
                        arrayList.add(m16025a);
                    }
                    return arrayList;
                } else if (!(abstractC6880ea instanceof C6891eh)) {
                    String valueOf = String.valueOf(abstractC6880ea.getClass());
                    aph.m16396a(new StringBuilder(String.valueOf(valueOf).length() + 49).append("Converting to Object from unknown abstract type: ").append(valueOf).toString());
                    return null;
                } else {
                    HashMap hashMap = new HashMap();
                    for (Map.Entry<String, AbstractC6880ea<?>> entry : ((C6891eh) abstractC6880ea).mo16034b().entrySet()) {
                        Object m16025a2 = m16025a(entry.getValue());
                        if (m16025a2 == null) {
                            aph.m16396a(String.format("Failure to convert a map's value to object: %s (%s)", entry.getValue(), entry.getValue().getClass().getCanonicalName()));
                            return null;
                        }
                        hashMap.put(entry.getKey(), m16025a2);
                    }
                    return hashMap;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private static List<Object> m16023a(List<Object> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof Bundle) {
                arrayList.add(m16029a((Bundle) obj));
            } else if (obj instanceof List) {
                arrayList.add(m16023a((List<Object>) obj));
            } else {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Map<String, Object> m16029a(Bundle bundle) {
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                hashMap.put(str, m16029a((Bundle) obj));
            } else if (obj instanceof List) {
                hashMap.put(str, m16023a((List<Object>) obj));
            } else {
                hashMap.put(str, obj);
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    public static AbstractC6880ea m16021b(AbstractC6880ea<?> abstractC6880ea) {
        if (abstractC6880ea instanceof C6891eh) {
            HashSet<String> hashSet = new HashSet();
            Map<String, AbstractC6880ea<?>> mo16034b = ((C6891eh) abstractC6880ea).mo16034b();
            for (Map.Entry<String, AbstractC6880ea<?>> entry : mo16034b.entrySet()) {
                if (entry.getValue() == C6886ee.f23122e) {
                    hashSet.add(entry.getKey());
                }
            }
            for (String str : hashSet) {
                mo16034b.remove(str);
            }
        }
        return abstractC6880ea;
    }

    /* renamed from: c */
    public static boolean m16020c(AbstractC6880ea abstractC6880ea) {
        return (abstractC6880ea instanceof C6883eb) || (abstractC6880ea instanceof C6884ec) || (abstractC6880ea instanceof C6893ej) || abstractC6880ea == C6886ee.f23121d || abstractC6880ea == C6886ee.f23122e;
    }

    /* renamed from: d */
    public static boolean m16019d(AbstractC6880ea abstractC6880ea) {
        return abstractC6880ea == C6886ee.f23120c || abstractC6880ea == C6886ee.f23119b || ((abstractC6880ea instanceof C6886ee) && ((C6886ee) abstractC6880ea).m16053e());
    }
}
