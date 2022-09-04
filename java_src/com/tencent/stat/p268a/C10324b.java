package com.tencent.stat.p268a;

import android.content.Context;
import com.tencent.p263mm.sdk.platformtools.LocaleUtil;
import java.util.Map;
import java.util.Properties;
import org.json.JSONArray;
import org.json.JSONObject;
/* renamed from: com.tencent.stat.a.b */
/* loaded from: classes2.dex */
public class C10324b extends AbstractC10327e {

    /* renamed from: a */
    protected C10325c f32162a = new C10325c();

    /* renamed from: l */
    private long f32163l = -1;

    public C10324b(Context context, int i, String str) {
        super(context, i);
        this.f32162a.f32164a = str;
    }

    @Override // com.tencent.stat.p268a.AbstractC10327e
    /* renamed from: a */
    public EnumC10328f mo5470a() {
        return EnumC10328f.CUSTOM;
    }

    /* renamed from: a */
    public void m5480a(long j) {
        this.f32163l = j;
    }

    /* renamed from: a */
    public void m5479a(Properties properties) {
        if (properties != null) {
            this.f32162a.f32166c = (Properties) properties.clone();
        }
    }

    /* renamed from: a */
    public void m5478a(String[] strArr) {
        if (strArr != null) {
            this.f32162a.f32165b = (String[]) strArr.clone();
        }
    }

    @Override // com.tencent.stat.p268a.AbstractC10327e
    /* renamed from: a */
    public boolean mo5469a(JSONObject jSONObject) {
        Object jSONObject2;
        jSONObject.put("ei", this.f32162a.f32164a);
        if (this.f32163l > 0) {
            jSONObject.put("du", this.f32163l);
        }
        if (this.f32162a.f32166c == null && this.f32162a.f32165b == null) {
            jSONObject.put("kv", new JSONObject());
        }
        if (this.f32162a.f32165b != null) {
            JSONArray jSONArray = new JSONArray();
            for (String str : this.f32162a.f32165b) {
                jSONArray.put(str);
            }
            jSONObject.put(LocaleUtil.ARABIC, jSONArray);
        }
        if (this.f32162a.f32166c != null) {
            JSONObject jSONObject3 = new JSONObject();
            try {
                for (Map.Entry entry : this.f32162a.f32166c.entrySet()) {
                    jSONObject3.put(entry.getKey().toString(), entry.getValue().toString());
                }
                jSONObject2 = jSONObject3;
            } catch (Exception e) {
                jSONObject2 = new JSONObject(this.f32162a.f32166c);
            }
            jSONObject.put("kv", jSONObject2);
            return true;
        }
        return true;
    }
}
