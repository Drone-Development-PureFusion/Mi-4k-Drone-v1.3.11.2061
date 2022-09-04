package com.tencent.stat;

import android.content.Context;
import com.tencent.stat.common.C10346k;
import com.tencent.stat.common.StatLogger;
/* loaded from: classes2.dex */
public class StatMid {

    /* renamed from: a */
    private static StatLogger f32134a = C10346k.m5425b();

    /* renamed from: b */
    private static DeviceInfo f32135b = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static synchronized DeviceInfo m5510a(Context context) {
        DeviceInfo deviceInfo;
        synchronized (StatMid.class) {
            C10322a m5490a = C10322a.m5490a(context);
            DeviceInfo m5507a = m5507a(m5490a.m5483d(DeviceInfo.TAG_FLAG, null));
            f32134a.m5466d("get device info from internal storage:" + m5507a);
            DeviceInfo m5507a2 = m5507a(m5490a.m5481f(DeviceInfo.TAG_FLAG, null));
            f32134a.m5466d("get device info from setting.system:" + m5507a2);
            DeviceInfo m5507a3 = m5507a(m5490a.m5487b(DeviceInfo.TAG_FLAG, null));
            f32134a.m5466d("get device info from SharedPreference:" + m5507a3);
            f32135b = m5508a(m5507a3, m5507a2, m5507a);
            if (f32135b == null) {
                f32135b = new DeviceInfo();
            }
            DeviceInfo m5349b = C10362n.m5362a(context).m5349b(context);
            if (m5349b != null) {
                f32135b.m5530d(m5349b.getImei());
                f32135b.m5529e(m5349b.getMac());
                f32135b.m5534b(m5349b.getUserType());
            }
            deviceInfo = f32135b;
        }
        return deviceInfo;
    }

    /* renamed from: a */
    static DeviceInfo m5509a(DeviceInfo deviceInfo, DeviceInfo deviceInfo2) {
        if (deviceInfo != null && deviceInfo2 != null) {
            return deviceInfo.m5537a(deviceInfo2) >= 0 ? deviceInfo : deviceInfo2;
        } else if (deviceInfo != null) {
            return deviceInfo;
        } else {
            if (deviceInfo2 == null) {
                return null;
            }
            return deviceInfo2;
        }
    }

    /* renamed from: a */
    static DeviceInfo m5508a(DeviceInfo deviceInfo, DeviceInfo deviceInfo2, DeviceInfo deviceInfo3) {
        return m5509a(m5509a(deviceInfo, deviceInfo2), m5509a(deviceInfo2, deviceInfo3));
    }

    /* renamed from: a */
    private static DeviceInfo m5507a(String str) {
        if (str != null) {
            return DeviceInfo.m5536a(C10346k.m5416d(str));
        }
        return null;
    }

    public static DeviceInfo getDeviceInfo(Context context) {
        if (context == null) {
            f32134a.error("Context for StatConfig.getDeviceInfo is null.");
            return null;
        }
        if (f32135b == null) {
            m5510a(context);
        }
        return f32135b;
    }

    public static String getMid(Context context) {
        if (f32135b == null) {
            getDeviceInfo(context);
        }
        return f32135b.getMid();
    }

    public static void updateDeviceInfo(Context context, String str) {
        try {
            getDeviceInfo(context);
            f32135b.m5531c(str);
            f32135b.m5539a(f32135b.m5540a() + 1);
            f32135b.m5538a(System.currentTimeMillis());
            String jSONObject = f32135b.m5532c().toString();
            f32134a.m5466d("save DeviceInfo:" + jSONObject);
            String replace = C10346k.m5419c(jSONObject).replace("\n", "");
            C10322a m5490a = C10322a.m5490a(context);
            m5490a.m5485c(DeviceInfo.TAG_FLAG, replace);
            m5490a.m5482e(DeviceInfo.TAG_FLAG, replace);
            m5490a.m5489a(DeviceInfo.TAG_FLAG, replace);
        } catch (Throwable th) {
            f32134a.m5464e(th);
        }
    }
}
