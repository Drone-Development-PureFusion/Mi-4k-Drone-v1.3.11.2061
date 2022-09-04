package com.tencent.stat.p268a;

import android.content.Context;
import com.tencent.stat.StatAppMonitor;
import com.tencent.stat.common.C10346k;
import org.json.JSONObject;
/* renamed from: com.tencent.stat.a.h */
/* loaded from: classes2.dex */
public class C10330h extends AbstractC10327e {

    /* renamed from: l */
    private static String f32192l = null;

    /* renamed from: m */
    private static String f32193m = null;

    /* renamed from: a */
    private StatAppMonitor f32194a;

    public C10330h(Context context, int i, StatAppMonitor statAppMonitor) {
        super(context, i);
        this.f32194a = null;
        this.f32194a = statAppMonitor.m40155clone();
    }

    @Override // com.tencent.stat.p268a.AbstractC10327e
    /* renamed from: a */
    public EnumC10328f mo5470a() {
        return EnumC10328f.MONITOR_STAT;
    }

    @Override // com.tencent.stat.p268a.AbstractC10327e
    /* renamed from: a */
    public boolean mo5469a(JSONObject jSONObject) {
        if (this.f32194a == null) {
            return false;
        }
        jSONObject.put("na", this.f32194a.getInterfaceName());
        jSONObject.put("rq", this.f32194a.getReqSize());
        jSONObject.put("rp", this.f32194a.getRespSize());
        jSONObject.put("rt", this.f32194a.getResultType());
        jSONObject.put("tm", this.f32194a.getMillisecondsConsume());
        jSONObject.put("rc", this.f32194a.getReturnCode());
        jSONObject.put("sp", this.f32194a.getSampling());
        if (f32193m == null) {
            f32193m = C10346k.m5397r(this.f32180k);
        }
        C10346k.m5427a(jSONObject, "av", f32193m);
        if (f32192l == null) {
            f32192l = C10346k.m5402m(this.f32180k);
        }
        C10346k.m5427a(jSONObject, "op", f32192l);
        jSONObject.put("cn", C10346k.m5399p(this.f32180k));
        return true;
    }
}
