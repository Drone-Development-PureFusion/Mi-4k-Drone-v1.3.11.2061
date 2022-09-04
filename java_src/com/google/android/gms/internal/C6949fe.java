package com.google.android.gms.internal;

import com.google.android.gms.internal.C6951ff;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.C9628k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
/* renamed from: com.google.android.gms.internal.fe */
/* loaded from: classes2.dex */
public final class C6949fe {

    /* renamed from: com.google.android.gms.internal.fe$a */
    /* loaded from: classes2.dex */
    public static class C6950a {

        /* renamed from: a */
        public final C6951ff f23344a;

        /* renamed from: b */
        public final List<Asset> f23345b;

        public C6950a(C6951ff c6951ff, List<Asset> list) {
            this.f23344a = c6951ff;
            this.f23345b = list;
        }
    }

    /* renamed from: a */
    private static int m15893a(String str, C6951ff.C6952a.C6953a[] c6953aArr) {
        int i = 14;
        for (C6951ff.C6952a.C6953a c6953a : c6953aArr) {
            if (i == 14) {
                if (c6953a.f23351a == 9 || c6953a.f23351a == 2 || c6953a.f23351a == 6) {
                    i = c6953a.f23351a;
                } else if (c6953a.f23351a != 14) {
                    throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 48).append("Unexpected TypedValue type: ").append(c6953a.f23351a).append(" for key ").append(str).toString());
                }
            } else if (c6953a.f23351a != i) {
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 126).append("The ArrayList elements should all be the same type, but ArrayList with key ").append(str).append(" contains items of type ").append(i).append(" and ").append(c6953a.f23351a).toString());
            }
        }
        return i;
    }

    /* renamed from: a */
    static int m15891a(List<Asset> list, Asset asset) {
        list.add(asset);
        return list.size() - 1;
    }

    /* renamed from: a */
    public static C6950a m15895a(C9628k c9628k) {
        C6951ff c6951ff = new C6951ff();
        ArrayList arrayList = new ArrayList();
        c6951ff.f23346a = m15894a(c9628k, arrayList);
        return new C6950a(c6951ff, arrayList);
    }

    /* renamed from: a */
    private static C6951ff.C6952a.C6953a m15889a(List<Asset> list, Object obj) {
        int i;
        int i2 = 0;
        C6951ff.C6952a.C6953a c6953a = new C6951ff.C6952a.C6953a();
        if (obj == null) {
            c6953a.f23351a = 14;
            return c6953a;
        }
        c6953a.f23352b = new C6951ff.C6952a.C6953a.C6954a();
        if (obj instanceof String) {
            c6953a.f23351a = 2;
            c6953a.f23352b.f23354b = (String) obj;
        } else if (obj instanceof Integer) {
            c6953a.f23351a = 6;
            c6953a.f23352b.f23358f = ((Integer) obj).intValue();
        } else if (obj instanceof Long) {
            c6953a.f23351a = 5;
            c6953a.f23352b.f23357e = ((Long) obj).longValue();
        } else if (obj instanceof Double) {
            c6953a.f23351a = 3;
            c6953a.f23352b.f23355c = ((Double) obj).doubleValue();
        } else if (obj instanceof Float) {
            c6953a.f23351a = 4;
            c6953a.f23352b.f23356d = ((Float) obj).floatValue();
        } else if (obj instanceof Boolean) {
            c6953a.f23351a = 8;
            c6953a.f23352b.f23360h = ((Boolean) obj).booleanValue();
        } else if (obj instanceof Byte) {
            c6953a.f23351a = 7;
            c6953a.f23352b.f23359g = ((Byte) obj).byteValue();
        } else if (obj instanceof byte[]) {
            c6953a.f23351a = 1;
            c6953a.f23352b.f23353a = (byte[]) obj;
        } else if (obj instanceof String[]) {
            c6953a.f23351a = 11;
            c6953a.f23352b.f23363k = (String[]) obj;
        } else if (obj instanceof long[]) {
            c6953a.f23351a = 12;
            c6953a.f23352b.f23364l = (long[]) obj;
        } else if (obj instanceof float[]) {
            c6953a.f23351a = 15;
            c6953a.f23352b.f23365m = (float[]) obj;
        } else if (obj instanceof Asset) {
            c6953a.f23351a = 13;
            c6953a.f23352b.f23366n = m15891a(list, (Asset) obj);
        } else if (obj instanceof C9628k) {
            c6953a.f23351a = 9;
            C9628k c9628k = (C9628k) obj;
            TreeSet treeSet = new TreeSet(c9628k.m7597f());
            C6951ff.C6952a[] c6952aArr = new C6951ff.C6952a[treeSet.size()];
            Iterator it2 = treeSet.iterator();
            while (true) {
                int i3 = i2;
                if (!it2.hasNext()) {
                    break;
                }
                String str = (String) it2.next();
                c6952aArr[i3] = new C6951ff.C6952a();
                c6952aArr[i3].f23348a = str;
                c6952aArr[i3].f23349b = m15889a(list, c9628k.m7614b(str));
                i2 = i3 + 1;
            }
            c6953a.f23352b.f23361i = c6952aArr;
        } else if (!(obj instanceof ArrayList)) {
            String valueOf = String.valueOf(obj.getClass().getSimpleName());
            throw new RuntimeException(valueOf.length() != 0 ? "newFieldValueFromValue: unexpected value ".concat(valueOf) : new String("newFieldValueFromValue: unexpected value "));
        } else {
            c6953a.f23351a = 10;
            ArrayList arrayList = (ArrayList) obj;
            C6951ff.C6952a.C6953a[] c6953aArr = new C6951ff.C6952a.C6953a[arrayList.size()];
            Object obj2 = null;
            int size = arrayList.size();
            int i4 = 0;
            int i5 = 14;
            while (i4 < size) {
                Object obj3 = arrayList.get(i4);
                C6951ff.C6952a.C6953a m15889a = m15889a(list, obj3);
                if (m15889a.f23351a != 14 && m15889a.f23351a != 2 && m15889a.f23351a != 6 && m15889a.f23351a != 9) {
                    String valueOf2 = String.valueOf(obj3.getClass());
                    throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf2).length() + 130).append("The only ArrayList element types supported by DataBundleUtil are String, Integer, Bundle, and null, but this ArrayList contains a ").append(valueOf2).toString());
                }
                if (i5 == 14 && m15889a.f23351a != 14) {
                    i = m15889a.f23351a;
                } else if (m15889a.f23351a != i5) {
                    String valueOf3 = String.valueOf(obj2.getClass());
                    String valueOf4 = String.valueOf(obj3.getClass());
                    throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf3).length() + 80 + String.valueOf(valueOf4).length()).append("ArrayList elements must all be of the sameclass, but this one contains a ").append(valueOf3).append(" and a ").append(valueOf4).toString());
                } else {
                    obj3 = obj2;
                    i = i5;
                }
                c6953aArr[i4] = m15889a;
                i4++;
                i5 = i;
                obj2 = obj3;
            }
            c6953a.f23352b.f23362j = c6953aArr;
        }
        return c6953a;
    }

    /* renamed from: a */
    public static C9628k m15896a(C6950a c6950a) {
        C6951ff.C6952a[] c6952aArr;
        C9628k c9628k = new C9628k();
        for (C6951ff.C6952a c6952a : c6950a.f23344a.f23346a) {
            m15890a(c6950a.f23345b, c9628k, c6952a.f23348a, c6952a.f23349b);
        }
        return c9628k;
    }

    /* renamed from: a */
    private static ArrayList m15892a(List<Asset> list, C6951ff.C6952a.C6953a.C6954a c6954a, int i) {
        C6951ff.C6952a.C6953a[] c6953aArr;
        ArrayList arrayList = new ArrayList(c6954a.f23362j.length);
        for (C6951ff.C6952a.C6953a c6953a : c6954a.f23362j) {
            if (c6953a.f23351a == 14) {
                arrayList.add(null);
            } else if (i == 9) {
                C9628k c9628k = new C9628k();
                C6951ff.C6952a[] c6952aArr = c6953a.f23352b.f23361i;
                for (C6951ff.C6952a c6952a : c6952aArr) {
                    m15890a(list, c9628k, c6952a.f23348a, c6952a.f23349b);
                }
                arrayList.add(c9628k);
            } else if (i == 2) {
                arrayList.add(c6953a.f23352b.f23354b);
            } else if (i != 6) {
                throw new IllegalArgumentException(new StringBuilder(39).append("Unexpected typeOfArrayList: ").append(i).toString());
            } else {
                arrayList.add(Integer.valueOf(c6953a.f23352b.f23358f));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m15890a(List<Asset> list, C9628k c9628k, String str, C6951ff.C6952a.C6953a c6953a) {
        C6951ff.C6952a[] c6952aArr;
        int i = c6953a.f23351a;
        if (i == 14) {
            c9628k.m7624a(str, (String) null);
            return;
        }
        C6951ff.C6952a.C6953a.C6954a c6954a = c6953a.f23352b;
        if (i == 1) {
            c9628k.m7621a(str, c6954a.f23353a);
        } else if (i == 11) {
            c9628k.m7618a(str, c6954a.f23363k);
        } else if (i == 12) {
            c9628k.m7619a(str, c6954a.f23364l);
        } else if (i == 15) {
            c9628k.m7620a(str, c6954a.f23365m);
        } else if (i == 2) {
            c9628k.m7624a(str, c6954a.f23354b);
        } else if (i == 3) {
            c9628k.m7632a(str, c6954a.f23355c);
        } else if (i == 4) {
            c9628k.m7631a(str, c6954a.f23356d);
        } else if (i == 5) {
            c9628k.m7629a(str, c6954a.f23357e);
        } else if (i == 6) {
            c9628k.m7630a(str, c6954a.f23358f);
        } else if (i == 7) {
            c9628k.m7633a(str, (byte) c6954a.f23359g);
        } else if (i == 8) {
            c9628k.m7622a(str, c6954a.f23360h);
        } else if (i == 13) {
            if (list == null) {
                String valueOf = String.valueOf(str);
                throw new RuntimeException(valueOf.length() != 0 ? "populateBundle: unexpected type for: ".concat(valueOf) : new String("populateBundle: unexpected type for: "));
            }
            c9628k.m7628a(str, list.get((int) c6954a.f23366n));
        } else if (i == 9) {
            C9628k c9628k2 = new C9628k();
            for (C6951ff.C6952a c6952a : c6954a.f23361i) {
                m15890a(list, c9628k2, c6952a.f23348a, c6952a.f23349b);
            }
            c9628k.m7627a(str, c9628k2);
        } else if (i != 10) {
            throw new RuntimeException(new StringBuilder(43).append("populateBundle: unexpected type ").append(i).toString());
        } else {
            int m15893a = m15893a(str, c6954a.f23362j);
            ArrayList<Integer> m15892a = m15892a(list, c6954a, m15893a);
            if (m15893a == 14) {
                c9628k.m7602c(str, m15892a);
            } else if (m15893a == 9) {
                c9628k.m7623a(str, (ArrayList<C9628k>) m15892a);
            } else if (m15893a == 2) {
                c9628k.m7602c(str, m15892a);
            } else if (m15893a != 6) {
                throw new IllegalStateException(new StringBuilder(39).append("Unexpected typeOfArrayList: ").append(m15893a).toString());
            } else {
                c9628k.m7607b(str, m15892a);
            }
        }
    }

    /* renamed from: a */
    private static C6951ff.C6952a[] m15894a(C9628k c9628k, List<Asset> list) {
        TreeSet treeSet = new TreeSet(c9628k.m7597f());
        C6951ff.C6952a[] c6952aArr = new C6951ff.C6952a[treeSet.size()];
        int i = 0;
        Iterator it2 = treeSet.iterator();
        while (true) {
            int i2 = i;
            if (it2.hasNext()) {
                String str = (String) it2.next();
                Object m7614b = c9628k.m7614b(str);
                c6952aArr[i2] = new C6951ff.C6952a();
                c6952aArr[i2].f23348a = str;
                c6952aArr[i2].f23349b = m15889a(list, m7614b);
                i = i2 + 1;
            } else {
                return c6952aArr;
            }
        }
    }
}
