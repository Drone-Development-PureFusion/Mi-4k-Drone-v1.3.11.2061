package com.xiaomi.mistatistic.sdk.data;

import com.xiaomi.mistatistic.sdk.controller.C10534o;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.xiaomi.mistatistic.sdk.data.d */
/* loaded from: classes2.dex */
public class C10550d extends AbstractC10547a {

    /* renamed from: b */
    protected long f32705b;

    /* renamed from: c */
    private String f32706c;

    /* renamed from: d */
    private String f32707d;

    /* renamed from: e */
    private Map f32708e;

    public C10550d(String str, String str2, long j) {
        this(str, str2, j, null);
    }

    public C10550d(String str, String str2, long j, Map map) {
        this.f32706c = str;
        this.f32707d = str2;
        this.f32705b = j;
        this.f32708e = map;
    }

    /* renamed from: a */
    private String m4783a(Map map) {
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    JSONObject jSONObject = new JSONObject();
                    for (String str : map.keySet()) {
                        jSONObject.put(str, map.get(str));
                    }
                    return jSONObject.toString();
                }
            } catch (JSONException e) {
                new C10534o().m4822a("json error", e);
            }
        }
        return null;
    }

    @Override // com.xiaomi.mistatistic.sdk.data.AbstractC10547a
    /* renamed from: a */
    public C10554h mo4780a() {
        C10554h c10554h = new C10554h();
        c10554h.f32716a = this.f32706c;
        c10554h.f32718c = this.f32707d;
        c10554h.f32717b = this.f32704a;
        c10554h.f32719d = mo4782b();
        c10554h.f32720e = String.valueOf(this.f32705b);
        c10554h.f32721f = m4783a(this.f32708e);
        return c10554h;
    }

    /* renamed from: b */
    public String mo4782b() {
        return "numeric";
    }
}
