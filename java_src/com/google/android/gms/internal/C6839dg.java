package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import com.google.android.gms.analytics.p229a.C3833b;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.C6865dv;
import com.google.android.gms.internal.C6867dw;
import com.google.android.gms.internal.C6870dx;
import com.google.android.gms.internal.C6873dy;
import com.google.android.gms.internal.C6876dz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.dg */
/* loaded from: classes2.dex */
public final class C6839dg {
    /* renamed from: a */
    public static aqd m16157a(Object obj) {
        JSONArray jSONArray;
        String str;
        JSONArray jSONArray2;
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            str = jSONObject.getString("name");
            jSONArray2 = jSONObject.getJSONArray("params");
            jSONArray = jSONObject.getJSONArray("instructions");
        } else if (!(obj instanceof JSONArray)) {
            throw new IllegalArgumentException("invalid JSON in runtime section");
        } else {
            JSONArray jSONArray3 = (JSONArray) obj;
            C4588d.m23619b(jSONArray3.length() >= 3);
            String string = jSONArray3.getString(1);
            JSONArray jSONArray4 = jSONArray3.getJSONArray(2);
            JSONArray jSONArray5 = new JSONArray();
            for (int i = 1; i < jSONArray4.length(); i++) {
                C4588d.m23619b(jSONArray4.get(i) instanceof String);
                jSONArray5.put(jSONArray4.get(i));
            }
            JSONArray jSONArray6 = new JSONArray();
            for (int i2 = 3; i2 < jSONArray3.length(); i2++) {
                jSONArray6.put(jSONArray3.get(i2));
            }
            jSONArray = jSONArray6;
            str = string;
            jSONArray2 = jSONArray5;
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
            arrayList.add(jSONArray2.getString(i3));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            JSONArray jSONArray7 = jSONArray.getJSONArray(i4);
            if (jSONArray7.length() != 0) {
                arrayList2.add(m16149b(jSONArray7));
            }
        }
        return new aqd(null, str, arrayList, arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C6865dv m16155a(String str) {
        Object obj = new JSONObject(str).get("resource");
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            C6865dv.C6866a c6866a = new C6865dv.C6866a();
            c6866a.m16086a(jSONObject.optString("version"));
            List<String> m16154a = m16154a(jSONObject.getJSONArray("macros"));
            List<C6867dw> m16153a = m16153a(jSONObject.getJSONArray("tags"), m16154a);
            List<C6867dw> m16153a2 = m16153a(jSONObject.getJSONArray("predicates"), m16154a);
            for (C6867dw c6867dw : m16153a(jSONObject.getJSONArray("macros"), m16154a)) {
                c6866a.m16088a(c6867dw);
            }
            JSONArray jSONArray = jSONObject.getJSONArray("rules");
            for (int i = 0; i < jSONArray.length(); i++) {
                c6866a.m16087a(m16152a(jSONArray.getJSONArray(i), m16153a, m16153a2));
            }
            return c6866a.m16089a();
        }
        throw new C6829de("Resource map not found");
    }

    /* renamed from: a */
    static C6867dw m16151a(JSONObject jSONObject, List<String> list) {
        C6867dw.C6869a c6869a = new C6867dw.C6869a();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            C6876dz m16065a = m16156a(jSONObject.get(next), list).m16065a();
            if ("push_after_evaluate".equals(next)) {
                c6869a.m16083a(m16065a);
            } else {
                c6869a.m16082a(next, m16065a);
            }
        }
        return c6869a.m16084a();
    }

    /* renamed from: a */
    static C6870dx m16152a(JSONArray jSONArray, List<C6867dw> list, List<C6867dw> list2) {
        C6870dx.C6872a c6872a = new C6870dx.C6872a();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i);
            if (jSONArray2.getString(0).equals("if")) {
                for (int i2 = 1; i2 < jSONArray2.length(); i2++) {
                    c6872a.m16076a(list2.get(jSONArray2.getInt(i2)));
                }
            } else if (jSONArray2.getString(0).equals("unless")) {
                for (int i3 = 1; i3 < jSONArray2.length(); i3++) {
                    c6872a.m16075b(list2.get(jSONArray2.getInt(i3)));
                }
            } else if (jSONArray2.getString(0).equals(C3833b.f14899c)) {
                for (int i4 = 1; i4 < jSONArray2.length(); i4++) {
                    c6872a.m16074c(list.get(jSONArray2.getInt(i4)));
                }
            } else if (jSONArray2.getString(0).equals("block")) {
                for (int i5 = 1; i5 < jSONArray2.length(); i5++) {
                    c6872a.m16073d(list.get(jSONArray2.getInt(i5)));
                }
            } else {
                String valueOf = String.valueOf(jSONArray2.getString(0));
                m16148c(valueOf.length() != 0 ? "Unknown Rule property: ".concat(valueOf) : new String("Unknown Rule property: "));
            }
        }
        return c6872a.m16077a();
    }

    /* renamed from: a */
    static C6876dz.C6878a m16156a(Object obj, List<String> list) {
        if (!(obj instanceof JSONArray)) {
            if (obj instanceof Boolean) {
                return new C6876dz.C6878a(8, obj);
            }
            if (obj instanceof Integer) {
                return new C6876dz.C6878a(6, obj);
            }
            if (obj instanceof String) {
                return new C6876dz.C6878a(1, obj);
            }
            String valueOf = String.valueOf(obj);
            m16148c(new StringBuilder(String.valueOf(valueOf).length() + 20).append("Invalid value type: ").append(valueOf).toString());
            return null;
        }
        JSONArray jSONArray = (JSONArray) obj;
        String string = jSONArray.getString(0);
        if (string.equals("escape")) {
            C6876dz.C6878a m16156a = m16156a(jSONArray.get(1), list);
            for (int i = 2; i < jSONArray.length(); i++) {
                m16156a.m16064a(jSONArray.getInt(i));
            }
            return m16156a;
        } else if (string.equals("list")) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 1; i2 < jSONArray.length(); i2++) {
                arrayList.add(m16156a(jSONArray.get(i2), list).m16065a());
            }
            C6876dz.C6878a c6878a = new C6876dz.C6878a(2, arrayList);
            c6878a.m16063a(true);
            return c6878a;
        } else if (string.equals("map")) {
            HashMap hashMap = new HashMap();
            for (int i3 = 1; i3 < jSONArray.length(); i3 += 2) {
                hashMap.put(m16156a(jSONArray.get(i3), list).m16065a(), m16156a(jSONArray.get(i3 + 1), list).m16065a());
            }
            C6876dz.C6878a c6878a2 = new C6876dz.C6878a(3, hashMap);
            c6878a2.m16063a(true);
            return c6878a2;
        } else if (string.equals("macro")) {
            C6876dz.C6878a c6878a3 = new C6876dz.C6878a(4, list.get(jSONArray.getInt(1)));
            c6878a3.m16063a(true);
            return c6878a3;
        } else if (!string.equals("template")) {
            String valueOf2 = String.valueOf(obj);
            m16148c(new StringBuilder(String.valueOf(valueOf2).length() + 20).append("Invalid value type: ").append(valueOf2).toString());
            return null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (int i4 = 1; i4 < jSONArray.length(); i4++) {
                arrayList2.add(m16156a(jSONArray.get(i4), list).m16065a());
            }
            C6876dz.C6878a c6878a4 = new C6876dz.C6878a(7, arrayList2);
            c6878a4.m16063a(true);
            return c6878a4;
        }
    }

    /* renamed from: a */
    static List<String> m16154a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getJSONObject(i).getString("instance_name"));
        }
        return arrayList;
    }

    /* renamed from: a */
    static List<C6867dw> m16153a(JSONArray jSONArray, List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(m16151a(jSONArray.getJSONObject(i), list));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    /* renamed from: b */
    public static C6873dy m16150b(String str) {
        JSONObject jSONObject = new JSONObject(str);
        JSONArray optJSONArray = jSONObject.optJSONArray("runtime");
        if (optJSONArray == null) {
            return null;
        }
        C6873dy.C6875a c6875a = new C6873dy.C6875a();
        Object obj = jSONObject.get("resource");
        if (!(obj instanceof JSONObject)) {
            throw new C6829de("Resource map not found");
        }
        c6875a.m16069a(((JSONObject) obj).optString("version"));
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= optJSONArray.length()) {
                return c6875a.m16071a();
            }
            Object obj2 = optJSONArray.get(i2);
            if (!(obj2 instanceof JSONArray) || ((JSONArray) obj2).length() != 0) {
                c6875a.m16070a(m16157a(obj2));
            }
            i = i2 + 1;
        }
    }

    /* renamed from: b */
    private static C6892ei m16149b(JSONArray jSONArray) {
        C4588d.m23619b(jSONArray.length() > 0);
        String string = jSONArray.getString(0);
        ArrayList arrayList = new ArrayList();
        for (int i = 1; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                JSONArray jSONArray2 = (JSONArray) obj;
                if (jSONArray2.length() != 0) {
                    arrayList.add(m16149b(jSONArray2));
                }
            } else if (obj == JSONObject.NULL) {
                arrayList.add(C6886ee.f23121d);
            } else {
                arrayList.add(C6895ek.m16024a(obj));
            }
        }
        return new C6892ei(string, arrayList);
    }

    /* renamed from: c */
    private static void m16148c(String str) {
        aph.m16396a(str);
        throw new C6829de(str);
    }
}
