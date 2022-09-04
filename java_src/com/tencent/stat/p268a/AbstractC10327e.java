package com.tencent.stat.p268a;

import android.content.Context;
import com.tencent.stat.C10362n;
import com.tencent.stat.DeviceInfo;
import com.tencent.stat.StatConfig;
import com.tencent.stat.common.C10346k;
import org.json.JSONObject;
/* renamed from: com.tencent.stat.a.e */
/* loaded from: classes2.dex */
public abstract class AbstractC10327e {

    /* renamed from: a */
    private static volatile boolean f32170a = false;

    /* renamed from: b */
    protected String f32171b;

    /* renamed from: d */
    protected int f32173d;

    /* renamed from: e */
    protected DeviceInfo f32174e;

    /* renamed from: f */
    protected int f32175f;

    /* renamed from: g */
    protected String f32176g;

    /* renamed from: h */
    protected String f32177h;

    /* renamed from: i */
    protected String f32178i;

    /* renamed from: k */
    protected Context f32180k;

    /* renamed from: j */
    protected String f32179j = null;

    /* renamed from: c */
    protected long f32172c = System.currentTimeMillis() / 1000;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC10327e(Context context, int i) {
        this.f32171b = null;
        this.f32174e = null;
        this.f32176g = null;
        this.f32177h = null;
        this.f32178i = null;
        this.f32180k = context;
        this.f32173d = i;
        this.f32171b = StatConfig.getAppKey(context);
        this.f32176g = StatConfig.getCustomUserId(context);
        this.f32174e = C10362n.m5362a(context).m5349b(context);
        this.f32175f = C10346k.m5392w(context).intValue();
        this.f32178i = C10346k.m5401n(context);
        this.f32177h = StatConfig.getInstallChannel(context);
    }

    /* renamed from: a */
    public abstract EnumC10328f mo5470a();

    /* renamed from: a */
    public abstract boolean mo5469a(JSONObject jSONObject);

    /* renamed from: b */
    public long m5476b() {
        return this.f32172c;
    }

    /* renamed from: b */
    public boolean m5475b(JSONObject jSONObject) {
        try {
            C10346k.m5427a(jSONObject, "ky", this.f32171b);
            jSONObject.put("et", mo5470a().m5472a());
            if (this.f32174e != null) {
                jSONObject.put(DeviceInfo.TAG_IMEI, this.f32174e.getImei());
                C10346k.m5427a(jSONObject, DeviceInfo.TAG_MAC, this.f32174e.getMac());
                jSONObject.put("ut", this.f32174e.getUserType());
            }
            C10346k.m5427a(jSONObject, "cui", this.f32176g);
            if (mo5470a() != EnumC10328f.SESSION_ENV) {
                C10346k.m5427a(jSONObject, "av", this.f32178i);
                C10346k.m5427a(jSONObject, "ch", this.f32177h);
            }
            C10346k.m5427a(jSONObject, DeviceInfo.TAG_MID, StatConfig.getMid(this.f32180k));
            jSONObject.put("idx", this.f32175f);
            jSONObject.put("si", this.f32173d);
            jSONObject.put(DeviceInfo.TAG_TIMESTAMPS, this.f32172c);
            if (this.f32174e.getUserType() == 0 && C10346k.m5436E(this.f32180k) == 1) {
                jSONObject.put("ia", 1);
            }
            return mo5469a(jSONObject);
        } catch (Throwable th) {
            return false;
        }
    }

    /* renamed from: c */
    public Context m5474c() {
        return this.f32180k;
    }

    /* renamed from: d */
    public String m5473d() {
        try {
            JSONObject jSONObject = new JSONObject();
            m5475b(jSONObject);
            return jSONObject.toString();
        } catch (Throwable th) {
            return "";
        }
    }
}
