package com.fimi.soul.base;

import com.fimi.kernel.BaseApplication;
import com.fimi.soul.biz.manager.C1960d;
import com.fimi.soul.utils.C3152x;
import java.io.PrintStream;
import java.lang.Thread;
/* loaded from: classes.dex */
public class ErrorReportApp extends BaseApplication {

    /* renamed from: a */
    private Thread.UncaughtExceptionHandler f4503a;

    /* renamed from: b */
    private Thread.UncaughtExceptionHandler f4504b = new Thread.UncaughtExceptionHandler() { // from class: com.fimi.soul.base.ErrorReportApp.1
        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            new C1755a(th).m34266a();
            ErrorReportApp.this.f4503a.uncaughtException(thread, th);
        }
    };

    /* renamed from: com.fimi.soul.base.ErrorReportApp$a */
    /* loaded from: classes.dex */
    class C1755a {

        /* renamed from: b */
        private Throwable f4507b;

        public C1755a(Throwable th) {
            this.f4507b = th;
        }

        /* renamed from: a */
        public void m34266a() {
            StackTraceElement[] stackTrace;
            try {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(this.f4507b.toString());
                for (StackTraceElement stackTraceElement : this.f4507b.getStackTrace()) {
                    stringBuffer.append(", Class Name:");
                    stringBuffer.append(stackTraceElement.getClassName());
                    stringBuffer.append(" , Method Name:");
                    stringBuffer.append(stackTraceElement.getMethodName());
                    stringBuffer.append(" , LineNumber:");
                    stringBuffer.append(stackTraceElement.getLineNumber());
                }
                C1960d.m33413a(ErrorReportApp.this.getApplicationContext()).m33411a(stringBuffer.toString());
                PrintStream printStream = new PrintStream(C3152x.m29007b());
                this.f4507b.printStackTrace(printStream);
                printStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.fimi.kernel.BaseApplication, android.app.Application
    public void onCreate() {
        super.onCreate();
        this.f4503a = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this.f4504b);
    }
}
