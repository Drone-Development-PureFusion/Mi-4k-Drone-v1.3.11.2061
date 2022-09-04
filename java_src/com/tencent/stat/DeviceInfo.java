package com.tencent.stat;

import com.tencent.stat.common.C10346k;
import com.tencent.stat.common.StatLogger;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class DeviceInfo {
    public static final int NEW_USER = 0;
    public static final int OLD_USER = 1;
    public static final String TAG_ANDROID_ID = "aid";
    public static final String TAG_FLAG = "__MTA_DEVICE_INFO__";
    public static final String TAG_IMEI = "ui";
    public static final String TAG_MAC = "mc";
    public static final String TAG_MID = "mid";
    public static final String TAG_TIMESTAMPS = "ts";
    public static final String TAG_VERSION = "ver";
    public static final int UPGRADE_USER = 2;

    /* renamed from: h */
    private static StatLogger f32082h = C10346k.m5425b();

    /* renamed from: a */
    private String f32083a;

    /* renamed from: b */
    private String f32084b;

    /* renamed from: c */
    private String f32085c;

    /* renamed from: d */
    private String f32086d;

    /* renamed from: e */
    private int f32087e;

    /* renamed from: f */
    private int f32088f;

    /* renamed from: g */
    private long f32089g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DeviceInfo() {
        this.f32083a = null;
        this.f32084b = null;
        this.f32085c = null;
        this.f32086d = "0";
        this.f32088f = 0;
        this.f32089g = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DeviceInfo(String str, String str2, int i) {
        this.f32083a = null;
        this.f32084b = null;
        this.f32085c = null;
        this.f32086d = "0";
        this.f32088f = 0;
        this.f32089g = 0L;
        this.f32083a = str;
        this.f32084b = str2;
        this.f32087e = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static DeviceInfo m5536a(String str) {
        DeviceInfo deviceInfo = new DeviceInfo();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.isNull(TAG_IMEI)) {
                deviceInfo.m5530d(jSONObject.getString(TAG_IMEI));
            }
            if (!jSONObject.isNull(TAG_MAC)) {
                deviceInfo.m5529e(jSONObject.getString(TAG_MAC));
            }
            if (!jSONObject.isNull(TAG_MID)) {
                deviceInfo.m5531c(jSONObject.getString(TAG_MID));
            }
            if (!jSONObject.isNull(TAG_ANDROID_ID)) {
                deviceInfo.m5533b(jSONObject.getString(TAG_ANDROID_ID));
            }
            if (!jSONObject.isNull(TAG_TIMESTAMPS)) {
                deviceInfo.m5538a(jSONObject.getLong(TAG_TIMESTAMPS));
            }
            if (!jSONObject.isNull(TAG_VERSION)) {
                deviceInfo.m5539a(jSONObject.getInt(TAG_VERSION));
            }
        } catch (JSONException e) {
            f32082h.m5465e((Exception) e);
        }
        return deviceInfo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m5540a() {
        return this.f32088f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m5537a(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            return 1;
        }
        String mid = getMid();
        String mid2 = deviceInfo.getMid();
        if (mid != null && mid2 != null && mid.equals(mid2)) {
            return 0;
        }
        int m5540a = m5540a();
        int m5540a2 = deviceInfo.m5540a();
        if (m5540a > m5540a2) {
            return 1;
        }
        if (m5540a != m5540a2) {
            return -1;
        }
        long m5535b = m5535b();
        long m5535b2 = deviceInfo.m5535b();
        if (m5535b > m5535b2) {
            return 1;
        }
        return m5535b == m5535b2 ? 0 : -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m5539a(int i) {
        this.f32088f = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m5538a(long j) {
        this.f32089g = j;
    }

    /* renamed from: b */
    long m5535b() {
        return this.f32089g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m5534b(int i) {
        this.f32087e = i;
    }

    /* renamed from: b */
    void m5533b(String str) {
        this.f32085c = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public JSONObject m5532c() {
        JSONObject jSONObject = new JSONObject();
        try {
            C10346k.m5427a(jSONObject, TAG_IMEI, this.f32083a);
            C10346k.m5427a(jSONObject, TAG_MAC, this.f32084b);
            C10346k.m5427a(jSONObject, TAG_MID, this.f32086d);
            C10346k.m5427a(jSONObject, TAG_ANDROID_ID, this.f32085c);
            jSONObject.put(TAG_TIMESTAMPS, this.f32089g);
            jSONObject.put(TAG_VERSION, this.f32088f);
        } catch (JSONException e) {
            f32082h.m5465e((Exception) e);
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m5531c(String str) {
        this.f32086d = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m5530d(String str) {
        this.f32083a = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m5529e(String str) {
        this.f32084b = str;
    }

    public String getImei() {
        return this.f32083a;
    }

    public String getMac() {
        return this.f32084b;
    }

    public String getMid() {
        return this.f32086d;
    }

    public int getUserType() {
        return this.f32087e;
    }

    public String toString() {
        return m5532c().toString();
    }
}
