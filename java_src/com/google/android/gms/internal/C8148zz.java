package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.facebook.common.util.UriUtil;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.xiaomi.market.sdk.C10445j;
import com.xiaomi.mipush.sdk.Constants;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.LinkedList;
@aaa
/* renamed from: com.google.android.gms.internal.zz */
/* loaded from: classes.dex */
public class C8148zz implements Thread.UncaughtExceptionHandler {
    @Nullable

    /* renamed from: a */
    private Thread.UncaughtExceptionHandler f26595a;
    @Nullable

    /* renamed from: b */
    private Thread.UncaughtExceptionHandler f26596b;

    /* renamed from: c */
    private Context f26597c;

    /* renamed from: d */
    private VersionInfoParcel f26598d;

    public C8148zz(Context context, VersionInfoParcel versionInfoParcel, @Nullable Thread.UncaughtExceptionHandler uncaughtExceptionHandler, @Nullable Thread.UncaughtExceptionHandler uncaughtExceptionHandler2) {
        this.f26595a = uncaughtExceptionHandler;
        this.f26596b = uncaughtExceptionHandler2;
        this.f26597c = context;
        this.f26598d = versionInfoParcel;
    }

    /* renamed from: a */
    public static C8148zz m12703a(Context context, Thread thread, VersionInfoParcel versionInfoParcel) {
        if (context == null || thread == null || versionInfoParcel == null) {
            return null;
        }
        if (!m12704a(context)) {
            return null;
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = thread.getUncaughtExceptionHandler();
        C8148zz c8148zz = new C8148zz(context, versionInfoParcel, uncaughtExceptionHandler, Thread.getDefaultUncaughtExceptionHandler());
        if (uncaughtExceptionHandler != null && (uncaughtExceptionHandler instanceof C8148zz)) {
            return (C8148zz) uncaughtExceptionHandler;
        }
        try {
            thread.setUncaughtExceptionHandler(c8148zz);
            return c8148zz;
        } catch (SecurityException e) {
            abr.c("Fail to set UncaughtExceptionHandler.", e);
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m12704a(Context context) {
        return C7788uf.f25889g.m13486c().booleanValue();
    }

    /* renamed from: c */
    private Throwable m12696c(Throwable th) {
        Throwable th2;
        if (C7788uf.f25890h.m13486c().booleanValue()) {
            return th;
        }
        LinkedList linkedList = new LinkedList();
        while (th != null) {
            linkedList.push(th);
            th = th.getCause();
        }
        Throwable th3 = null;
        while (!linkedList.isEmpty()) {
            Throwable th4 = (Throwable) linkedList.pop();
            StackTraceElement[] stackTrace = th4.getStackTrace();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new StackTraceElement(th4.getClass().getName(), "<filtered>", "<filtered>", 1));
            boolean z = false;
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (m12701a(stackTraceElement.getClassName())) {
                    arrayList.add(stackTraceElement);
                    z = true;
                } else if (m12698b(stackTraceElement.getClassName())) {
                    arrayList.add(stackTraceElement);
                } else {
                    arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                }
            }
            if (z) {
                th2 = th3 == null ? new Throwable(th4.getMessage()) : new Throwable(th4.getMessage(), th3);
                th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            } else {
                th2 = th3;
            }
            th3 = th2;
        }
        return th3;
    }

    /* renamed from: a */
    String m12702a(Class cls, Throwable th, String str) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return new Uri.Builder().scheme(UriUtil.HTTPS_SCHEME).path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter(C10445j.f32457ac, Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT)).appendQueryParameter("device", C3779u.m26890e().m18320e()).appendQueryParameter("js", this.f26598d.f14733b).appendQueryParameter("appid", this.f26597c.getApplicationContext().getPackageName()).appendQueryParameter("exceptiontype", cls.getName()).appendQueryParameter("stacktrace", stringWriter.toString()).appendQueryParameter("eids", TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, C7788uf.m13471a())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "133155058").appendQueryParameter("rc", "dev").toString();
    }

    /* renamed from: a */
    public void m12699a(Throwable th, String str) {
        Throwable m12696c;
        if (m12704a(this.f26597c) && (m12696c = m12696c(th)) != null) {
            Class<?> cls = th.getClass();
            ArrayList arrayList = new ArrayList();
            arrayList.add(m12702a(cls, m12696c, str));
            C3779u.m26890e().m18344a(arrayList, C3779u.m26886i().m18439h());
        }
    }

    /* renamed from: a */
    protected boolean m12701a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith(C7788uf.f25891i.m13486c())) {
            return true;
        }
        try {
            return Class.forName(str).isAnnotationPresent(aaa.class);
        } catch (Exception e) {
            String valueOf = String.valueOf(str);
            abr.a(valueOf.length() != 0 ? "Fail to check class type for class ".concat(valueOf) : new String("Fail to check class type for class "), e);
            return false;
        }
    }

    /* renamed from: a */
    protected boolean m12700a(Throwable th) {
        StackTraceElement[] stackTrace;
        boolean z = true;
        if (th == null) {
            return false;
        }
        boolean z2 = false;
        boolean z3 = false;
        while (th != null) {
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                if (m12701a(stackTraceElement.getClassName())) {
                    z3 = true;
                }
                if (getClass().getName().equals(stackTraceElement.getClassName())) {
                    z2 = true;
                }
            }
            th = th.getCause();
        }
        if (!z3 || z2) {
            z = false;
        }
        return z;
    }

    /* renamed from: b */
    public void m12697b(Throwable th) {
        m12699a(th, "");
    }

    /* renamed from: b */
    protected boolean m12698b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("android.") || str.startsWith("java.");
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        if (m12700a(th)) {
            if (Looper.getMainLooper().getThread() != thread) {
                m12699a(th, "AdMobExceptionReporter.uncaughtException");
                return;
            }
            m12697b(th);
        }
        if (this.f26595a != null) {
            this.f26595a.uncaughtException(thread, th);
        } else if (this.f26596b == null) {
        } else {
            this.f26596b.uncaughtException(thread, th);
        }
    }
}
