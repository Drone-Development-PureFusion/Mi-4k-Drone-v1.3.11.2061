package com.fimi.soul.entity;

import java.io.Serializable;
import p005b.p006a.p007a.p029b.C0494h;
/* loaded from: classes.dex */
public class HistoryFileInfo implements Serializable {
    String deviceType;
    String fcId;

    public String getDeviceType() {
        return this.deviceType;
    }

    public String getFcId() {
        return this.fcId;
    }

    public void setDeviceType(String str) {
        this.deviceType = str;
    }

    public void setFcId(String str) {
        this.fcId = str;
    }

    public String toString() {
        return "HistoryFileInfo{fcId='" + this.fcId + C0494h.f738z + ", deviceType='" + this.deviceType + C0494h.f738z + C0494h.f735w;
    }
}
