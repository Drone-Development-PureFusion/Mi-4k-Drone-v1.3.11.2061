package com.tencent.stat;

import android.content.Context;
import com.tencent.stat.common.StatLogger;
import com.tencent.stat.p268a.C10326d;
import java.lang.Thread;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.stat.g */
/* loaded from: classes2.dex */
public final class C10355g implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    final /* synthetic */ Context f32277a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10355g(Context context) {
        this.f32277a = context;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        StatLogger statLogger;
        StatLogger statLogger2;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        StatLogger statLogger3;
        StatLogger statLogger4;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler2;
        if (!StatConfig.isEnableStatService()) {
            return;
        }
        C10362n.m5362a(this.f32277a).m5361a(new C10326d(this.f32277a, StatService.m5498a(this.f32277a, false), 2, th), (AbstractC10335c) null);
        statLogger = StatService.f32152i;
        statLogger.debug("MTA has caught the following uncaught exception:");
        statLogger2 = StatService.f32152i;
        statLogger2.error(th);
        uncaughtExceptionHandler = StatService.f32153j;
        if (uncaughtExceptionHandler == null) {
            statLogger3 = StatService.f32152i;
            statLogger3.debug("Original uncaught exception handler not set.");
            return;
        }
        statLogger4 = StatService.f32152i;
        statLogger4.debug("Call the original uncaught exception handler.");
        uncaughtExceptionHandler2 = StatService.f32153j;
        uncaughtExceptionHandler2.uncaughtException(thread, th);
    }
}
