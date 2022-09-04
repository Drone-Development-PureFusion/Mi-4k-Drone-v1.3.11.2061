package com.tencent.stat;
/* loaded from: classes2.dex */
public class StatAppMonitor implements Cloneable {
    public static final int FAILURE_RESULT_TYPE = 1;
    public static final int LOGIC_FAILURE_RESULT_TYPE = 2;
    public static final int SUCCESS_RESULT_TYPE = 0;

    /* renamed from: a */
    private String f32095a;

    /* renamed from: b */
    private long f32096b;

    /* renamed from: c */
    private long f32097c;

    /* renamed from: d */
    private int f32098d;

    /* renamed from: e */
    private long f32099e;

    /* renamed from: f */
    private int f32100f;

    /* renamed from: g */
    private int f32101g;

    public StatAppMonitor(String str) {
        this.f32095a = null;
        this.f32096b = 0L;
        this.f32097c = 0L;
        this.f32098d = 0;
        this.f32099e = 0L;
        this.f32100f = 0;
        this.f32101g = 1;
        this.f32095a = str;
    }

    public StatAppMonitor(String str, int i, int i2, long j, long j2, long j3, int i3) {
        this.f32095a = null;
        this.f32096b = 0L;
        this.f32097c = 0L;
        this.f32098d = 0;
        this.f32099e = 0L;
        this.f32100f = 0;
        this.f32101g = 1;
        this.f32095a = str;
        this.f32096b = j;
        this.f32097c = j2;
        this.f32098d = i;
        this.f32099e = j3;
        this.f32100f = i2;
        this.f32101g = i3;
    }

    /* renamed from: clone */
    public StatAppMonitor m40155clone() {
        try {
            return (StatAppMonitor) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public String getInterfaceName() {
        return this.f32095a;
    }

    public long getMillisecondsConsume() {
        return this.f32099e;
    }

    public long getReqSize() {
        return this.f32096b;
    }

    public long getRespSize() {
        return this.f32097c;
    }

    public int getResultType() {
        return this.f32098d;
    }

    public int getReturnCode() {
        return this.f32100f;
    }

    public int getSampling() {
        return this.f32101g;
    }

    public void setInterfaceName(String str) {
        this.f32095a = str;
    }

    public void setMillisecondsConsume(long j) {
        this.f32099e = j;
    }

    public void setReqSize(long j) {
        this.f32096b = j;
    }

    public void setRespSize(long j) {
        this.f32097c = j;
    }

    public void setResultType(int i) {
        this.f32098d = i;
    }

    public void setReturnCode(int i) {
        this.f32100f = i;
    }

    public void setSampling(int i) {
        if (i <= 0) {
            i = 1;
        }
        this.f32101g = i;
    }
}
