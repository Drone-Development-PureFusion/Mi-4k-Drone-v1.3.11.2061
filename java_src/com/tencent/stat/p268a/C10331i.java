package com.tencent.stat.p268a;

import android.content.Context;
import com.tencent.stat.common.C10346k;
import org.json.JSONObject;
/* renamed from: com.tencent.stat.a.i */
/* loaded from: classes2.dex */
public class C10331i extends AbstractC10327e {

    /* renamed from: a */
    private static String f32195a = null;

    /* renamed from: l */
    private String f32196l;

    /* renamed from: m */
    private String f32197m = null;

    public C10331i(Context context, int i) {
        super(context, i);
        this.f32196l = null;
        this.f32196l = C10346k.m5399p(context);
        if (f32195a == null) {
            f32195a = C10346k.m5402m(context);
        }
    }

    @Override // com.tencent.stat.p268a.AbstractC10327e
    /* renamed from: a */
    public EnumC10328f mo5470a() {
        return EnumC10328f.NETWORK_MONITOR;
    }

    /* renamed from: a */
    public void m5471a(String str) {
        this.f32197m = str;
    }

    @Override // com.tencent.stat.p268a.AbstractC10327e
    /* renamed from: a */
    public boolean mo5469a(JSONObject jSONObject) {
        C10346k.m5427a(jSONObject, "op", f32195a);
        C10346k.m5427a(jSONObject, "cn", this.f32196l);
        jSONObject.put("sp", this.f32197m);
        return true;
    }
}
