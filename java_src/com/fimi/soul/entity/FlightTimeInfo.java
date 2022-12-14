package com.fimi.soul.entity;

import java.io.Serializable;
import p005b.p006a.p007a.p029b.C0494h;
/* loaded from: classes.dex */
public class FlightTimeInfo implements Serializable {
    private int flyCount;
    private String planeID;
    private long totalDistance;
    private long totalFlyTime;
    private long totalRealFlyTime;

    public int getFlyCount() {
        return this.flyCount;
    }

    public String getPlaneID() {
        return this.planeID;
    }

    public long getTotalDistance() {
        return this.totalDistance;
    }

    public long getTotalFlyTime() {
        return this.totalFlyTime;
    }

    public long getTotalRealFlyTime() {
        return this.totalRealFlyTime;
    }

    public void setFlyCount(int i) {
        this.flyCount = i;
    }

    public void setPlaneID(String str) {
        this.planeID = str;
    }

    public void setTotalDistance(long j) {
        this.totalDistance = j;
    }

    public void setTotalFlyTime(long j) {
        this.totalFlyTime = j;
    }

    public void setTotalRealFlyTime(long j) {
        this.totalRealFlyTime = j;
    }

    public String toString() {
        return "FlightTimeInfo{totalFlyTime=" + this.totalFlyTime + ", flyCount=" + this.flyCount + ", totalDistance=" + this.totalDistance + ", planeID='" + this.planeID + C0494h.f738z + ", totalRealFlyTime=" + this.totalRealFlyTime + C0494h.f735w;
    }
}
