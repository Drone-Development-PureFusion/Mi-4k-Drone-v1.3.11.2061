package com.xiaomi.channel.commonutils.logger;
/* loaded from: classes.dex */
public interface LoggerInterface {
    void log(String str);

    void log(String str, Throwable th);

    void setTag(String str);
}