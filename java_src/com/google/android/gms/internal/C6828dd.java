package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.C4588d;
/* renamed from: com.google.android.gms.internal.dd */
/* loaded from: classes2.dex */
public class C6828dd {

    /* renamed from: a */
    private final String f22924a;
    @Nullable

    /* renamed from: b */
    private final String f22925b;
    @Nullable

    /* renamed from: c */
    private final String f22926c;

    /* renamed from: d */
    private final boolean f22927d;
    @Nullable

    /* renamed from: e */
    private final String f22928e;
    @Nullable

    /* renamed from: f */
    private final String f22929f;

    public C6828dd(String str, String str2, @Nullable String str3, boolean z, @Nullable String str4) {
        this(str, str2, str3, z, str4, "");
    }

    public C6828dd(String str, String str2, @Nullable String str3, boolean z, @Nullable String str4, String str5) {
        C4588d.m23627a(str);
        C4588d.m23627a(str5);
        this.f22924a = str;
        this.f22925b = str2;
        this.f22926c = str3;
        this.f22927d = z;
        this.f22928e = str4;
        this.f22929f = str5;
    }

    /* renamed from: a */
    public String m16175a() {
        return this.f22924a;
    }

    /* renamed from: b */
    public String m16174b() {
        return this.f22925b;
    }

    /* renamed from: c */
    public String m16173c() {
        return this.f22926c;
    }

    /* renamed from: d */
    public String m16172d() {
        if (this.f22926c != null) {
            String str = this.f22926c;
            String str2 = this.f22924a;
            return new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length()).append(str).append("_").append(str2).toString();
        }
        return this.f22924a;
    }

    /* renamed from: e */
    public boolean m16171e() {
        return this.f22927d;
    }

    /* renamed from: f */
    public String m16170f() {
        return this.f22928e;
    }

    /* renamed from: g */
    public String m16169g() {
        return this.f22929f;
    }
}
