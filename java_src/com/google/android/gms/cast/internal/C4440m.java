package com.google.android.gms.cast.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C4588d;
import java.util.Locale;
/* renamed from: com.google.android.gms.cast.internal.m */
/* loaded from: classes.dex */
public class C4440m {

    /* renamed from: b */
    private static boolean f16666b = false;

    /* renamed from: a */
    protected final String f16667a;

    /* renamed from: c */
    private final boolean f16668c;

    /* renamed from: d */
    private boolean f16669d;

    /* renamed from: e */
    private boolean f16670e;

    /* renamed from: f */
    private String f16671f;

    public C4440m(String str) {
        this(str, m24158c());
    }

    public C4440m(String str, boolean z) {
        C4588d.m23624a(str, (Object) "The log tag cannot be null or empty.");
        this.f16667a = str;
        this.f16668c = str.length() <= 23;
        this.f16669d = z;
        this.f16670e = false;
    }

    /* renamed from: c */
    public static boolean m24158c() {
        return false;
    }

    /* renamed from: a */
    public void m24165a(String str) {
        this.f16671f = TextUtils.isEmpty(str) ? null : String.format("[%s] ", str);
    }

    /* renamed from: a */
    public void m24164a(String str, Object... objArr) {
        if (m24161b()) {
            Log.v(this.f16667a, m24153f(str, objArr));
        }
    }

    /* renamed from: a */
    public void m24163a(Throwable th, String str, Object... objArr) {
        if (!m24166a()) {
            return;
        }
        Log.d(this.f16667a, m24153f(str, objArr), th);
    }

    /* renamed from: a */
    public void m24162a(boolean z) {
        this.f16669d = z;
    }

    /* renamed from: a */
    public boolean m24166a() {
        return this.f16669d || (this.f16668c && Log.isLoggable(this.f16667a, 3));
    }

    /* renamed from: b */
    public void m24160b(String str, Object... objArr) {
        if (!m24166a()) {
            return;
        }
        Log.d(this.f16667a, m24153f(str, objArr));
    }

    /* renamed from: b */
    public void m24159b(Throwable th, String str, Object... objArr) {
        Log.w(this.f16667a, m24153f(str, objArr), th);
    }

    /* renamed from: b */
    public boolean m24161b() {
        return false;
    }

    /* renamed from: c */
    public void m24157c(String str, Object... objArr) {
        Log.i(this.f16667a, m24153f(str, objArr));
    }

    /* renamed from: c */
    public void m24156c(Throwable th, String str, Object... objArr) {
        Log.e(this.f16667a, m24153f(str, objArr), th);
    }

    /* renamed from: d */
    public void m24155d(String str, Object... objArr) {
        Log.w(this.f16667a, m24153f(str, objArr));
    }

    /* renamed from: e */
    public void m24154e(String str, Object... objArr) {
        Log.e(this.f16667a, m24153f(str, objArr));
    }

    /* renamed from: f */
    protected String m24153f(String str, Object... objArr) {
        if (objArr.length != 0) {
            str = String.format(Locale.ROOT, str, objArr);
        }
        if (!TextUtils.isEmpty(this.f16671f)) {
            String valueOf = String.valueOf(this.f16671f);
            String valueOf2 = String.valueOf(str);
            return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        return str;
    }
}
