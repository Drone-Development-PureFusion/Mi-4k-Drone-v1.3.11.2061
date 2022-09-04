package com.google.android.gms.analytics;

import android.content.Context;
import com.google.android.gms.analytics.C3839d;
import com.google.android.gms.analytics.internal.C3892f;
import java.lang.Thread;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.analytics.b */
/* loaded from: classes2.dex */
public class C3835b implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private final Thread.UncaughtExceptionHandler f14910a;

    /* renamed from: b */
    private final C3852g f14911b;

    /* renamed from: c */
    private final Context f14912c;

    /* renamed from: d */
    private AbstractC3831a f14913d;

    /* renamed from: e */
    private C3836c f14914e;

    public C3835b(C3852g c3852g, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Context context) {
        if (c3852g == null) {
            throw new NullPointerException("tracker cannot be null");
        }
        if (context == null) {
            throw new NullPointerException("context cannot be null");
        }
        this.f14910a = uncaughtExceptionHandler;
        this.f14911b = c3852g;
        this.f14913d = new C3851f(context, new ArrayList());
        this.f14912c = context.getApplicationContext();
        String valueOf = String.valueOf(uncaughtExceptionHandler == null ? "null" : uncaughtExceptionHandler.getClass().getName());
        C3892f.m26293b(valueOf.length() != 0 ? "ExceptionReporter created, original handler is ".concat(valueOf) : new String("ExceptionReporter created, original handler is "));
    }

    /* renamed from: a */
    public AbstractC3831a m26598a() {
        return this.f14913d;
    }

    /* renamed from: a */
    public void m26597a(AbstractC3831a abstractC3831a) {
        this.f14913d = abstractC3831a;
    }

    /* renamed from: b */
    C3836c m26596b() {
        if (this.f14914e == null) {
            this.f14914e = C3836c.m26590a(this.f14912c);
        }
        return this.f14914e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public Thread.UncaughtExceptionHandler m26595c() {
        return this.f14910a;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        String str = "UncaughtException";
        if (this.f14913d != null) {
            str = this.f14913d.mo26525a(thread != null ? thread.getName() : null, th);
        }
        String valueOf = String.valueOf(str);
        C3892f.m26293b(valueOf.length() != 0 ? "Reporting uncaught exception: ".concat(valueOf) : new String("Reporting uncaught exception: "));
        this.f14911b.m26511a(new C3839d.C3842c().m26564a(str).m26563a(true).mo26533a());
        C3836c m26596b = m26596b();
        m26596b.m26572i();
        m26596b.m26571j();
        if (this.f14910a != null) {
            C3892f.m26293b("Passing exception to the original handler");
            this.f14910a.uncaughtException(thread, th);
        }
    }
}
