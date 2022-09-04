package com.tencent.stat.common;

import android.util.Log;
/* loaded from: classes2.dex */
public final class StatLogger {

    /* renamed from: a */
    private String f32208a;

    /* renamed from: b */
    private boolean f32209b;

    /* renamed from: c */
    private int f32210c;

    public StatLogger() {
        this.f32208a = "default";
        this.f32209b = true;
        this.f32210c = 2;
    }

    public StatLogger(String str) {
        this.f32208a = "default";
        this.f32209b = true;
        this.f32210c = 2;
        this.f32208a = str;
    }

    /* renamed from: a */
    private String m5467a() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace == null) {
            return null;
        }
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (!stackTraceElement.isNativeMethod() && !stackTraceElement.getClassName().equals(Thread.class.getName()) && !stackTraceElement.getClassName().equals(getClass().getName())) {
                return "[" + Thread.currentThread().getName() + "(" + Thread.currentThread().getId() + "): " + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + "]";
            }
        }
        return null;
    }

    /* renamed from: d */
    public void m5466d(Object obj) {
        if (isDebugEnable()) {
            debug(obj);
        }
    }

    public void debug(Object obj) {
        if (this.f32210c <= 3) {
            String m5467a = m5467a();
            Log.d(this.f32208a, m5467a == null ? obj.toString() : m5467a + " - " + obj);
        }
    }

    /* renamed from: e */
    public void m5465e(Exception exc) {
        if (isDebugEnable()) {
            error(exc);
        }
    }

    /* renamed from: e */
    public void m5464e(Object obj) {
        if (isDebugEnable()) {
            error(obj);
        }
    }

    public void error(Exception exc) {
        if (this.f32210c <= 6) {
            StringBuffer stringBuffer = new StringBuffer();
            String m5467a = m5467a();
            StackTraceElement[] stackTrace = exc.getStackTrace();
            if (m5467a != null) {
                stringBuffer.append(m5467a + " - " + exc + "\r\n");
            } else {
                stringBuffer.append(exc + "\r\n");
            }
            if (stackTrace != null && stackTrace.length > 0) {
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (stackTraceElement != null) {
                        stringBuffer.append("[ " + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + " ]\r\n");
                    }
                }
            }
            Log.e(this.f32208a, stringBuffer.toString());
        }
    }

    public void error(Object obj) {
        if (this.f32210c <= 6) {
            String m5467a = m5467a();
            Log.e(this.f32208a, m5467a == null ? obj.toString() : m5467a + " - " + obj);
        }
    }

    public int getLogLevel() {
        return this.f32210c;
    }

    /* renamed from: i */
    public void m5463i(Object obj) {
        if (isDebugEnable()) {
            info(obj);
        }
    }

    public void info(Object obj) {
        if (this.f32210c <= 4) {
            String m5467a = m5467a();
            Log.i(this.f32208a, m5467a == null ? obj.toString() : m5467a + " - " + obj);
        }
    }

    public boolean isDebugEnable() {
        return this.f32209b;
    }

    public void setDebugEnable(boolean z) {
        this.f32209b = z;
    }

    public void setLogLevel(int i) {
        this.f32210c = i;
    }

    public void setTag(String str) {
        this.f32208a = str;
    }

    /* renamed from: v */
    public void m5462v(Object obj) {
        if (isDebugEnable()) {
            verbose(obj);
        }
    }

    public void verbose(Object obj) {
        if (this.f32210c <= 2) {
            String m5467a = m5467a();
            Log.v(this.f32208a, m5467a == null ? obj.toString() : m5467a + " - " + obj);
        }
    }

    /* renamed from: w */
    public void m5461w(Object obj) {
        if (isDebugEnable()) {
            warn(obj);
        }
    }

    public void warn(Object obj) {
        if (this.f32210c <= 5) {
            String m5467a = m5467a();
            Log.w(this.f32208a, m5467a == null ? obj.toString() : m5467a + " - " + obj);
        }
    }
}
