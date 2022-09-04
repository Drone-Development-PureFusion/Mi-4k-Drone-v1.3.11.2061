package com.tencent.stat;

import com.tencent.p263mm.sdk.platformtools.LocaleUtil;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class NetworkMonitor {

    /* renamed from: a */
    private long f32090a = 0;

    /* renamed from: b */
    private int f32091b = 0;

    /* renamed from: c */
    private String f32092c = "";

    /* renamed from: d */
    private int f32093d = 0;

    /* renamed from: e */
    private String f32094e = "";

    public String getDomain() {
        return this.f32092c;
    }

    public long getMillisecondsConsume() {
        return this.f32090a;
    }

    public int getPort() {
        return this.f32093d;
    }

    public String getRemoteIp() {
        return this.f32094e;
    }

    public int getStatusCode() {
        return this.f32091b;
    }

    public void setDomain(String str) {
        this.f32092c = str;
    }

    public void setMillisecondsConsume(long j) {
        this.f32090a = j;
    }

    public void setPort(int i) {
        this.f32093d = i;
    }

    public void setRemoteIp(String str) {
        this.f32094e = str;
    }

    public void setStatusCode(int i) {
        this.f32091b = i;
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tm", this.f32090a);
            jSONObject.put("st", this.f32091b);
            if (this.f32092c != null) {
                jSONObject.put("dm", this.f32092c);
            }
            jSONObject.put(LocaleUtil.PORTUGUESE, this.f32093d);
            if (this.f32094e != null) {
                jSONObject.put("rip", this.f32094e);
            }
            jSONObject.put(DeviceInfo.TAG_TIMESTAMPS, System.currentTimeMillis() / 1000);
        } catch (JSONException e) {
        }
        return jSONObject;
    }
}
