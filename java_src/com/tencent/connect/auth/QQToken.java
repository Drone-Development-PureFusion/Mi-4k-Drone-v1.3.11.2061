package com.tencent.connect.auth;
/* loaded from: classes2.dex */
public class QQToken {
    public static final int AUTH_QQ = 2;
    public static final int AUTH_QZONE = 3;
    public static final int AUTH_WEB = 1;

    /* renamed from: a */
    private String f31216a;

    /* renamed from: b */
    private String f31217b;

    /* renamed from: c */
    private String f31218c;

    /* renamed from: d */
    private int f31219d = 1;

    /* renamed from: e */
    private long f31220e = -1;

    public QQToken(String str) {
        this.f31216a = str;
    }

    public String getAccessToken() {
        return this.f31217b;
    }

    public String getAppId() {
        return this.f31216a;
    }

    public int getAuthSource() {
        return this.f31219d;
    }

    public long getExpireTimeInSecond() {
        return this.f31220e;
    }

    public String getOpenId() {
        return this.f31218c;
    }

    public boolean isSessionValid() {
        return this.f31217b != null && System.currentTimeMillis() < this.f31220e;
    }

    public void setAccessToken(String str, String str2) {
        this.f31217b = str;
        this.f31220e = 0L;
        if (str2 != null) {
            this.f31220e = System.currentTimeMillis() + (Long.parseLong(str2) * 1000);
        }
    }

    public void setAppId(String str) {
        this.f31216a = str;
    }

    public void setAuthSource(int i) {
        this.f31219d = i;
    }

    public void setOpenId(String str) {
        this.f31218c = str;
    }
}
