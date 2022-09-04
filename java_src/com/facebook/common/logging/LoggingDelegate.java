package com.facebook.common.logging;
/* loaded from: classes.dex */
public interface LoggingDelegate {
    /* renamed from: d */
    void mo35517d(String str, String str2);

    /* renamed from: d */
    void mo35516d(String str, String str2, Throwable th);

    /* renamed from: e */
    void mo35515e(String str, String str2);

    /* renamed from: e */
    void mo35514e(String str, String str2, Throwable th);

    int getMinimumLoggingLevel();

    /* renamed from: i */
    void mo35513i(String str, String str2);

    /* renamed from: i */
    void mo35512i(String str, String str2, Throwable th);

    boolean isLoggable(int i);

    void log(int i, String str, String str2);

    void setMinimumLoggingLevel(int i);

    /* renamed from: v */
    void mo35511v(String str, String str2);

    /* renamed from: v */
    void mo35510v(String str, String str2, Throwable th);

    /* renamed from: w */
    void mo35509w(String str, String str2);

    /* renamed from: w */
    void mo35508w(String str, String str2, Throwable th);

    void wtf(String str, String str2);

    void wtf(String str, String str2, Throwable th);
}
