package com.google.android.gms.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;
import org.json.JSONTokener;
/* renamed from: com.google.android.gms.internal.mb */
/* loaded from: classes2.dex */
public class C7380mb {
    /* renamed from: a */
    public static String m14637a(Object obj) {
        if (obj == null) {
            return "null";
        }
        if (obj instanceof String) {
            return JSONObject.quote((String) obj);
        }
        if (obj instanceof Number) {
            try {
                return JSONObject.numberToString((Number) obj);
            } catch (JSONException e) {
                throw new IOException("Could not serialize number", e);
            }
        } else if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? "true" : "false";
        } else {
            try {
                JSONStringer jSONStringer = new JSONStringer();
                m14636a(obj, jSONStringer);
                return jSONStringer.toString();
            } catch (JSONException e2) {
                throw new IOException("Failed to serialize JSON", e2);
            }
        }
    }

    /* renamed from: a */
    public static String m14634a(Map<String, Object> map) {
        return m14637a((Object) map);
    }

    /* renamed from: a */
    private static List<Object> m14633a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(m14631b(jSONArray.get(i)));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Map<String, Object> m14635a(String str) {
        try {
            return m14632a(new JSONObject(str));
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }

    /* renamed from: a */
    private static Map<String, Object> m14632a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap(jSONObject.length());
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, m14631b(jSONObject.get(next)));
        }
        return hashMap;
    }

    /* renamed from: a */
    private static void m14636a(Object obj, JSONStringer jSONStringer) {
        if (obj instanceof Map) {
            jSONStringer.object();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                jSONStringer.key((String) entry.getKey());
                m14636a(entry.getValue(), jSONStringer);
            }
            jSONStringer.endObject();
        } else if (!(obj instanceof Collection)) {
            jSONStringer.value(obj);
        } else {
            jSONStringer.array();
            for (Object obj2 : (Collection) obj) {
                m14636a(obj2, jSONStringer);
            }
            jSONStringer.endArray();
        }
    }

    /* renamed from: b */
    private static Object m14631b(Object obj) {
        if (obj instanceof JSONObject) {
            return m14632a((JSONObject) obj);
        }
        if (obj instanceof JSONArray) {
            return m14633a((JSONArray) obj);
        }
        if (!obj.equals(JSONObject.NULL)) {
            return obj;
        }
        return null;
    }

    /* renamed from: b */
    public static Object m14630b(String str) {
        try {
            return m14631b(new JSONTokener(str).nextValue());
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }
}
