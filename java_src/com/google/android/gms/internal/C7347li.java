package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC7068gz;
import com.google.firebase.database.C9866d;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.li */
/* loaded from: classes2.dex */
public class C7347li {
    /* renamed from: a */
    public static int m14736a(C7319kv c7319kv, AbstractC7344lh abstractC7344lh, C7319kv c7319kv2, AbstractC7344lh abstractC7344lh2) {
        int compareTo = abstractC7344lh.compareTo(abstractC7344lh2);
        return compareTo != 0 ? compareTo : c7319kv.compareTo(c7319kv2);
    }

    /* renamed from: a */
    public static AbstractC7344lh m14735a(Object obj) {
        return m14734a(obj, C7350ll.m14730a());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[Catch: ClassCastException -> 0x00d2, TryCatch #0 {ClassCastException -> 0x00d2, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x0010, B:7:0x001a, B:9:0x0022, B:11:0x002b, B:14:0x0030, B:16:0x0034, B:18:0x003d, B:20:0x0041, B:22:0x004a, B:24:0x004e, B:26:0x0060, B:28:0x0064, B:30:0x006d, B:32:0x0071, B:34:0x007a, B:36:0x007e, B:38:0x012e, B:40:0x0144, B:41:0x0148, B:42:0x014b, B:43:0x014c, B:44:0x0082, B:46:0x0086, B:48:0x0090, B:50:0x0097, B:51:0x00a8, B:53:0x00ae, B:56:0x00bc, B:59:0x00ca, B:66:0x00dc, B:68:0x00e2, B:70:0x0121, B:72:0x00e8, B:73:0x00f4, B:75:0x00fa, B:77:0x0117, B:79:0x011e), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030 A[Catch: ClassCastException -> 0x00d2, TryCatch #0 {ClassCastException -> 0x00d2, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x0010, B:7:0x001a, B:9:0x0022, B:11:0x002b, B:14:0x0030, B:16:0x0034, B:18:0x003d, B:20:0x0041, B:22:0x004a, B:24:0x004e, B:26:0x0060, B:28:0x0064, B:30:0x006d, B:32:0x0071, B:34:0x007a, B:36:0x007e, B:38:0x012e, B:40:0x0144, B:41:0x0148, B:42:0x014b, B:43:0x014c, B:44:0x0082, B:46:0x0086, B:48:0x0090, B:50:0x0097, B:51:0x00a8, B:53:0x00ae, B:56:0x00bc, B:59:0x00ca, B:66:0x00dc, B:68:0x00e2, B:70:0x0121, B:72:0x00e8, B:73:0x00f4, B:75:0x00fa, B:77:0x0117, B:79:0x011e), top: B:1:0x0000 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AbstractC7344lh m14734a(Object obj, AbstractC7344lh abstractC7344lh) {
        Object obj2;
        HashMap hashMap;
        try {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (map.containsKey(".priority")) {
                    abstractC7344lh = C7350ll.m14728a(map.get(".priority"));
                }
                if (map.containsKey(".value")) {
                    obj2 = map.get(".value");
                    if (obj2 != null) {
                        return C7335la.m14778j();
                    }
                    if (obj2 instanceof String) {
                        return new C7355lo((String) obj2, abstractC7344lh);
                    }
                    if (obj2 instanceof Long) {
                        return new C7342lf((Long) obj2, abstractC7344lh);
                    }
                    if (obj2 instanceof Integer) {
                        return new C7342lf(Long.valueOf(((Integer) obj2).intValue()), abstractC7344lh);
                    }
                    if (obj2 instanceof Double) {
                        return new C7333kz((Double) obj2, abstractC7344lh);
                    }
                    if (obj2 instanceof Boolean) {
                        return new C7318ku((Boolean) obj2, abstractC7344lh);
                    }
                    if (!(obj2 instanceof Map) && !(obj2 instanceof List)) {
                        String valueOf = String.valueOf(obj2.getClass().toString());
                        throw new C9866d(valueOf.length() != 0 ? "Failed to parse node with class ".concat(valueOf) : new String("Failed to parse node with class "));
                    }
                    if (obj2 instanceof Map) {
                        Map map2 = (Map) obj2;
                        if (map2.containsKey(".sv")) {
                            return new C7332ky(map2, abstractC7344lh);
                        }
                        HashMap hashMap2 = new HashMap(map2.size());
                        for (String str : map2.keySet()) {
                            if (!str.startsWith(".")) {
                                AbstractC7344lh m14735a = m14735a(map2.get(str));
                                if (!m14735a.mo14739b()) {
                                    hashMap2.put(C7319kv.m14828a(str), m14735a);
                                }
                            }
                        }
                        hashMap = hashMap2;
                    } else {
                        List list = (List) obj2;
                        HashMap hashMap3 = new HashMap(list.size());
                        for (int i = 0; i < list.size(); i++) {
                            String sb = new StringBuilder(11).append(i).toString();
                            AbstractC7344lh m14735a2 = m14735a(list.get(i));
                            if (!m14735a2.mo14739b()) {
                                hashMap3.put(C7319kv.m14828a(sb), m14735a2);
                            }
                        }
                        hashMap = hashMap3;
                    }
                    return hashMap.isEmpty() ? C7335la.m14778j() : new C7322kw(AbstractC7068gz.C7069a.m15659a(hashMap, C7322kw.f24490a), abstractC7344lh);
                }
            }
            obj2 = obj;
            if (obj2 != null) {
            }
        } catch (ClassCastException e) {
            throw new C9866d("Failed to parse node", e);
        }
    }
}
