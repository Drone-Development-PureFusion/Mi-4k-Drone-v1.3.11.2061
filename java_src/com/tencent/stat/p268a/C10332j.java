package com.tencent.stat.p268a;

import android.content.Context;
import com.tencent.stat.common.C10346k;
import org.json.JSONObject;
/* renamed from: com.tencent.stat.a.j */
/* loaded from: classes2.dex */
public class C10332j extends AbstractC10327e {

    /* renamed from: a */
    Long f32198a;

    /* renamed from: l */
    String f32199l;

    /* renamed from: m */
    String f32200m;

    public C10332j(Context context, String str, String str2, int i, Long l) {
        super(context, i);
        this.f32198a = null;
        this.f32200m = str;
        this.f32199l = str2;
        this.f32198a = l;
    }

    @Override // com.tencent.stat.p268a.AbstractC10327e
    /* renamed from: a */
    public EnumC10328f mo5470a() {
        return EnumC10328f.PAGE_VIEW;
    }

    @Override // com.tencent.stat.p268a.AbstractC10327e
    /* renamed from: a */
    public boolean mo5469a(JSONObject jSONObject) {
        C10346k.m5427a(jSONObject, "pi", this.f32199l);
        C10346k.m5427a(jSONObject, "rf", this.f32200m);
        if (this.f32198a != null) {
            jSONObject.put("du", this.f32198a);
            return true;
        }
        return true;
    }
}
