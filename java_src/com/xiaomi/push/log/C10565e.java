package com.xiaomi.push.log;

import com.xiaomi.channel.commonutils.logger.LoggerInterface;
/* renamed from: com.xiaomi.push.log.e */
/* loaded from: classes2.dex */
public class C10565e implements LoggerInterface {

    /* renamed from: a */
    private LoggerInterface f32786a;

    /* renamed from: b */
    private LoggerInterface f32787b;

    public C10565e(LoggerInterface loggerInterface, LoggerInterface loggerInterface2) {
        this.f32786a = null;
        this.f32787b = null;
        this.f32786a = loggerInterface;
        this.f32787b = loggerInterface2;
    }

    @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
    public void log(String str) {
        if (this.f32786a != null) {
            this.f32786a.log(str);
        }
        if (this.f32787b != null) {
            this.f32787b.log(str);
        }
    }

    @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
    public void log(String str, Throwable th) {
        if (this.f32786a != null) {
            this.f32786a.log(str, th);
        }
        if (this.f32787b != null) {
            this.f32787b.log(str, th);
        }
    }

    @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
    public void setTag(String str) {
    }
}
