package com.xiaomi.channel.commonutils.logger;

import android.util.Log;
/* renamed from: com.xiaomi.channel.commonutils.logger.a */
/* loaded from: classes2.dex */
public class C10403a implements LoggerInterface {

    /* renamed from: a */
    private String f32328a = "xiaomi";

    @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
    public void log(String str) {
        Log.v(this.f32328a, str);
    }

    @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
    public void log(String str, Throwable th) {
        Log.v(this.f32328a, str, th);
    }

    @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
    public void setTag(String str) {
        this.f32328a = str;
    }
}
