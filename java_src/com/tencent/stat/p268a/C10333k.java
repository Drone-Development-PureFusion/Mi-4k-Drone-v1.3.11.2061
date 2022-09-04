package com.tencent.stat.p268a;

import android.content.Context;
import com.tencent.stat.common.C10336a;
import org.json.JSONObject;
/* renamed from: com.tencent.stat.a.k */
/* loaded from: classes2.dex */
public class C10333k extends AbstractC10327e {

    /* renamed from: a */
    private C10336a f32201a;

    /* renamed from: l */
    private JSONObject f32202l;

    public C10333k(Context context, int i, JSONObject jSONObject) {
        super(context, i);
        this.f32202l = null;
        this.f32201a = new C10336a(context);
        this.f32202l = jSONObject;
    }

    @Override // com.tencent.stat.p268a.AbstractC10327e
    /* renamed from: a */
    public EnumC10328f mo5470a() {
        return EnumC10328f.SESSION_ENV;
    }

    @Override // com.tencent.stat.p268a.AbstractC10327e
    /* renamed from: a */
    public boolean mo5469a(JSONObject jSONObject) {
        if (this.f32174e != null) {
            jSONObject.put("ut", this.f32174e.getUserType());
        }
        if (this.f32202l != null) {
            jSONObject.put("cfg", this.f32202l);
        }
        this.f32201a.m5458a(jSONObject);
        return true;
    }
}
