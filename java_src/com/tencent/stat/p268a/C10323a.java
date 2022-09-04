package com.tencent.stat.p268a;

import android.content.Context;
import com.tencent.stat.StatConfig;
import com.tencent.stat.common.C10346k;
import java.util.Map;
import org.json.JSONObject;
/* renamed from: com.tencent.stat.a.a */
/* loaded from: classes2.dex */
public class C10323a extends AbstractC10327e {

    /* renamed from: a */
    Map<String, ?> f32161a;

    public C10323a(Context context, int i, Map<String, ?> map) {
        super(context, i);
        this.f32161a = null;
        this.f32161a = map;
    }

    @Override // com.tencent.stat.p268a.AbstractC10327e
    /* renamed from: a */
    public EnumC10328f mo5470a() {
        return EnumC10328f.ADDITION;
    }

    @Override // com.tencent.stat.p268a.AbstractC10327e
    /* renamed from: a */
    public boolean mo5469a(JSONObject jSONObject) {
        C10346k.m5427a(jSONObject, "qq", StatConfig.getQQ());
        if (this.f32161a == null || this.f32161a.size() <= 0) {
            return true;
        }
        for (Map.Entry<String, ?> entry : this.f32161a.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        return true;
    }
}
