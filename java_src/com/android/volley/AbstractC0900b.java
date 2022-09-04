package com.android.volley;

import java.util.Collections;
import java.util.Map;
/* renamed from: com.android.volley.b */
/* loaded from: classes.dex */
public interface AbstractC0900b {

    /* renamed from: com.android.volley.b$a */
    /* loaded from: classes.dex */
    public static class C0901a {

        /* renamed from: a */
        public byte[] f1979a;

        /* renamed from: b */
        public String f1980b;

        /* renamed from: c */
        public long f1981c;

        /* renamed from: d */
        public long f1982d;

        /* renamed from: e */
        public long f1983e;

        /* renamed from: f */
        public long f1984f;

        /* renamed from: g */
        public Map<String, String> f1985g = Collections.emptyMap();

        /* renamed from: a */
        public boolean m37443a() {
            return this.f1983e < System.currentTimeMillis();
        }

        /* renamed from: b */
        public boolean m37442b() {
            return this.f1984f < System.currentTimeMillis();
        }
    }

    /* renamed from: a */
    C0901a mo37280a(String str);

    /* renamed from: a */
    void mo37281a();

    /* renamed from: a */
    void mo37279a(String str, C0901a c0901a);

    /* renamed from: a */
    void mo37278a(String str, boolean z);

    /* renamed from: b */
    void mo37277b();

    /* renamed from: b */
    void mo37276b(String str);
}
