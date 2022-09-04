package com.google.android.gms.internal;

import android.support.p001v4.util.SimpleArrayMap;
import com.google.android.gms.ads.internal.formats.BinderC3597c;
import com.google.android.gms.ads.internal.formats.BinderC3600f;
import com.google.android.gms.ads.internal.formats.C3595a;
import com.google.android.gms.internal.CallableC8128zu;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONObject;
@aaa
/* renamed from: com.google.android.gms.internal.zy */
/* loaded from: classes.dex */
public class C8147zy implements CallableC8128zu.AbstractC8136a<BinderC3600f> {

    /* renamed from: a */
    private final boolean f26594a;

    public C8147zy(boolean z) {
        this.f26594a = z;
    }

    /* renamed from: a */
    private <K, V> SimpleArrayMap<K, V> m12709a(SimpleArrayMap<K, Future<V>> simpleArrayMap) {
        SimpleArrayMap<K, V> simpleArrayMap2 = new SimpleArrayMap<>();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < simpleArrayMap.size()) {
                simpleArrayMap2.put(simpleArrayMap.keyAt(i2), simpleArrayMap.valueAt(i2).get());
                i = i2 + 1;
            } else {
                return simpleArrayMap2;
            }
        }
    }

    /* renamed from: a */
    private void m12707a(CallableC8128zu callableC8128zu, JSONObject jSONObject, SimpleArrayMap<String, Future<BinderC3597c>> simpleArrayMap) {
        simpleArrayMap.put(jSONObject.getString("name"), callableC8128zu.m12746a(jSONObject, "image_value", this.f26594a));
    }

    /* renamed from: a */
    private void m12706a(JSONObject jSONObject, SimpleArrayMap<String, String> simpleArrayMap) {
        simpleArrayMap.put(jSONObject.getString("name"), jSONObject.getString("string_value"));
    }

    @Override // com.google.android.gms.internal.CallableC8128zu.AbstractC8136a
    /* renamed from: b */
    public BinderC3600f mo12708a(CallableC8128zu callableC8128zu, JSONObject jSONObject) {
        SimpleArrayMap<String, Future<BinderC3597c>> simpleArrayMap = new SimpleArrayMap<>();
        SimpleArrayMap<String, String> simpleArrayMap2 = new SimpleArrayMap<>();
        aco<C3595a> m12738b = callableC8128zu.m12738b(jSONObject);
        JSONArray jSONArray = jSONObject.getJSONArray("custom_assets");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String string = jSONObject2.getString("type");
            if ("string".equals(string)) {
                m12706a(jSONObject2, simpleArrayMap2);
            } else if ("image".equals(string)) {
                m12707a(callableC8128zu, jSONObject2, simpleArrayMap);
            } else {
                String valueOf = String.valueOf(string);
                abr.d(valueOf.length() != 0 ? "Unknown custom asset type: ".concat(valueOf) : new String("Unknown custom asset type: "));
            }
        }
        return new BinderC3600f(jSONObject.getString("custom_template_id"), m12709a(simpleArrayMap), simpleArrayMap2, m12738b.get());
    }
}
