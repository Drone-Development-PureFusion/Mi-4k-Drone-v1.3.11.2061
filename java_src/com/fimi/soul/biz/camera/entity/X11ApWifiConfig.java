package com.fimi.soul.biz.camera.entity;

import com.fimi.soul.biz.camera.C1831e;
import com.fimi.soul.biz.p170b.C1760b;
import com.fimi.soul.utils.C3099as;
import java.util.Map;
/* loaded from: classes.dex */
public class X11ApWifiConfig {
    private String ApSSID = "AMBA";
    private String ApIP = C1831e.m33977a();
    private String ApESSID = "amba_TEST";
    private int ApChannel = 4;

    public static X11ApWifiConfig build(String str) {
        X11ApWifiConfig x11ApWifiConfig = new X11ApWifiConfig();
        try {
            Map<String, String> m29278a = C3099as.m29278a(str);
            x11ApWifiConfig.setApSSID(m29278a.get(C1760b.f4579b));
            x11ApWifiConfig.setApIP(m29278a.get("LOCAL_IP"));
            x11ApWifiConfig.setApChannel(Integer.parseInt(m29278a.get("AP_CHANNEL")));
        } catch (Exception e) {
        }
        return x11ApWifiConfig;
    }

    public int getApChannel() {
        return this.ApChannel;
    }

    public String getApESSID() {
        return this.ApESSID;
    }

    public String getApIP() {
        return this.ApIP;
    }

    public String getApSSID() {
        return this.ApSSID;
    }

    public void setApChannel(int i) {
        this.ApChannel = i;
    }

    public void setApESSID(String str) {
        this.ApESSID = str;
    }

    public void setApIP(String str) {
        this.ApIP = str;
    }

    public void setApSSID(String str) {
        this.ApSSID = str;
    }
}
