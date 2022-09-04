package com.xiaomi.network;

import com.tencent.stat.DeviceInfo;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class AccessHistory {

    /* renamed from: a */
    private int f32722a;

    /* renamed from: b */
    private long f32723b;

    /* renamed from: c */
    private long f32724c;

    /* renamed from: d */
    private String f32725d;

    /* renamed from: e */
    private long f32726e;

    public AccessHistory() {
        this(0, 0L, 0L, null);
    }

    public AccessHistory(int i, long j, long j2, Exception exc) {
        this.f32722a = i;
        this.f32723b = j;
        this.f32726e = j2;
        this.f32724c = System.currentTimeMillis();
        if (exc != null) {
            this.f32725d = exc.getClass().getSimpleName();
        }
    }

    /* renamed from: a */
    public int m4778a() {
        return this.f32722a;
    }

    /* renamed from: a */
    public AccessHistory m4777a(JSONObject jSONObject) {
        this.f32723b = jSONObject.getLong("cost");
        this.f32726e = jSONObject.getLong("size");
        this.f32724c = jSONObject.getLong(DeviceInfo.TAG_TIMESTAMPS);
        this.f32722a = jSONObject.getInt("wt");
        this.f32725d = jSONObject.optString("expt");
        return this;
    }

    /* renamed from: b */
    public JSONObject m4776b() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cost", this.f32723b);
        jSONObject.put("size", this.f32726e);
        jSONObject.put(DeviceInfo.TAG_TIMESTAMPS, this.f32724c);
        jSONObject.put("wt", this.f32722a);
        jSONObject.put("expt", this.f32725d);
        return jSONObject;
    }
}
