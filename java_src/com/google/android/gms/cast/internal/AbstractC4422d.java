package com.google.android.gms.cast.internal;

import android.support.annotation.NonNull;
import android.text.TextUtils;
/* renamed from: com.google.android.gms.cast.internal.d */
/* loaded from: classes2.dex */
public abstract class AbstractC4422d {

    /* renamed from: a */
    private final String f16609a;

    /* renamed from: b */
    private AbstractC4443o f16610b;

    /* renamed from: f */
    protected final C4440m f16611f;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC4422d(String str, String str2, String str3) {
        C4430f.m24205a(str);
        this.f16609a = str;
        this.f16611f = new C4440m(str2);
        m24265a(str3);
    }

    /* renamed from: a */
    public void mo24152a() {
    }

    /* renamed from: a */
    public void mo17666a(long j, int i) {
    }

    /* renamed from: a */
    public final void m24266a(AbstractC4443o abstractC4443o) {
        this.f16610b = abstractC4443o;
        if (this.f16610b == null) {
            mo24152a();
        }
    }

    /* renamed from: a */
    public void m24265a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f16611f.m24165a(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m24264a(String str, long j, String str2) {
        this.f16611f.m24164a("Sending text message: %s to: %s", str, str2);
        this.f16610b.mo24119a(this.f16609a, str, j, str2);
    }

    /* renamed from: b */
    public String m24263b() {
        return this.f16609a;
    }

    /* renamed from: b */
    public void mo17652b(@NonNull String str) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final long m24262c() {
        return this.f16610b.mo24120a();
    }
}
