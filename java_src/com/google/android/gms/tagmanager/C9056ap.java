package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.AbstractC7090hj;
import com.google.android.gms.internal.C6899en;
import com.google.android.gms.internal.EnumC6958fh;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.tagmanager.ap */
/* loaded from: classes2.dex */
class C9056ap {
    /* renamed from: a */
    public static C6899en.C6903c m9305a(String str) {
        AbstractC7090hj.C7091a m9304b = m9304b(new JSONObject(str));
        C6899en.C6904d m15998a = C6899en.C6903c.m15998a();
        for (int i = 0; i < m9304b.f23884d.length; i++) {
            m15998a.m15992a(C6899en.C6901a.m16005a().m15999a(EnumC6958fh.INSTANCE_NAME.toString(), m9304b.f23884d[i]).m15999a(EnumC6958fh.FUNCTION.toString(), C9147cw.m9130a(C9166dk.m9068d())).m15999a(C9166dk.m9067e(), m9304b.f23885e[i]).m16001a());
        }
        return m15998a.m15994a();
    }

    /* renamed from: a */
    static Object m9306a(Object obj) {
        if (obj instanceof JSONArray) {
            throw new RuntimeException("JSONArrays are not supported");
        }
        if (JSONObject.NULL.equals(obj)) {
            throw new RuntimeException("JSON nulls are not supported");
        }
        if (!(obj instanceof JSONObject)) {
            return obj;
        }
        JSONObject jSONObject = (JSONObject) obj;
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, m9306a(jSONObject.get(next)));
        }
        return hashMap;
    }

    /* renamed from: b */
    private static AbstractC7090hj.C7091a m9304b(Object obj) {
        return C9147cw.m9111f(m9306a(obj));
    }
}
