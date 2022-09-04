package com.tencent.stat.common;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* renamed from: com.tencent.stat.common.a */
/* loaded from: classes2.dex */
public class C10336a {

    /* renamed from: a */
    static C10338c f32211a;

    /* renamed from: d */
    private static StatLogger f32212d = C10346k.m5425b();

    /* renamed from: e */
    private static JSONObject f32213e = null;

    /* renamed from: b */
    Integer f32214b;

    /* renamed from: c */
    String f32215c;

    public C10336a(Context context) {
        this.f32214b = null;
        this.f32215c = null;
        try {
            m5460a(context);
            this.f32214b = C10346k.m5398q(context.getApplicationContext());
            this.f32215c = C10346k.m5399p(context);
        } catch (Throwable th) {
            f32212d.m5464e(th);
        }
    }

    /* renamed from: a */
    static synchronized C10338c m5460a(Context context) {
        C10338c c10338c;
        synchronized (C10336a.class) {
            if (f32211a == null) {
                f32211a = new C10338c(context.getApplicationContext());
            }
            c10338c = f32211a;
        }
        return c10338c;
    }

    /* renamed from: a */
    public static void m5459a(Context context, Map<String, String> map) {
        if (map == null) {
            return;
        }
        HashMap hashMap = new HashMap(map);
        if (f32213e == null) {
            f32213e = new JSONObject();
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            f32213e.put((String) entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: a */
    public void m5458a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (f32211a != null) {
                f32211a.m5457a(jSONObject2);
            }
            C10346k.m5427a(jSONObject2, "cn", this.f32215c);
            if (this.f32214b != null) {
                jSONObject2.put("tn", this.f32214b);
            }
            jSONObject.put("ev", jSONObject2);
            if (f32213e == null || f32213e.length() <= 0) {
                return;
            }
            jSONObject.put("eva", f32213e);
        } catch (Throwable th) {
            f32212d.m5464e(th);
        }
    }
}
