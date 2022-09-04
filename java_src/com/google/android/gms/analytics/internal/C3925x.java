package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.C4588d;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.android.gms.analytics.internal.x */
/* loaded from: classes2.dex */
public class C3925x {

    /* renamed from: a */
    private final long f15174a;

    /* renamed from: b */
    private final String f15175b;

    /* renamed from: c */
    private final String f15176c;

    /* renamed from: d */
    private final boolean f15177d;

    /* renamed from: e */
    private long f15178e;

    /* renamed from: f */
    private final Map<String, String> f15179f;

    public C3925x(long j, String str, String str2, boolean z, long j2, Map<String, String> map) {
        C4588d.m23625a(str);
        C4588d.m23625a(str2);
        this.f15174a = j;
        this.f15175b = str;
        this.f15176c = str2;
        this.f15177d = z;
        this.f15178e = j2;
        if (map != null) {
            this.f15179f = new HashMap(map);
        } else {
            this.f15179f = Collections.emptyMap();
        }
    }

    /* renamed from: a */
    public long m26074a() {
        return this.f15174a;
    }

    /* renamed from: a */
    public void m26073a(long j) {
        this.f15178e = j;
    }

    /* renamed from: b */
    public String m26072b() {
        return this.f15175b;
    }

    /* renamed from: c */
    public String m26071c() {
        return this.f15176c;
    }

    /* renamed from: d */
    public boolean m26070d() {
        return this.f15177d;
    }

    /* renamed from: e */
    public long m26069e() {
        return this.f15178e;
    }

    /* renamed from: f */
    public Map<String, String> m26068f() {
        return this.f15179f;
    }
}
