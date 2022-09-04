package com.google.android.gms.internal;

import java.util.Collections;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.ru */
/* loaded from: classes2.dex */
public interface AbstractC7674ru {

    /* renamed from: com.google.android.gms.internal.ru$a */
    /* loaded from: classes2.dex */
    public static class C7675a {

        /* renamed from: a */
        public byte[] f25470a;

        /* renamed from: b */
        public String f25471b;

        /* renamed from: c */
        public long f25472c;

        /* renamed from: d */
        public long f25473d;

        /* renamed from: e */
        public long f25474e;

        /* renamed from: f */
        public long f25475f;

        /* renamed from: g */
        public Map<String, String> f25476g = Collections.emptyMap();

        /* renamed from: a */
        public boolean m13734a() {
            return this.f25474e < System.currentTimeMillis();
        }

        /* renamed from: b */
        public boolean m13733b() {
            return this.f25475f < System.currentTimeMillis();
        }
    }

    /* renamed from: a */
    C7675a mo13736a(String str);

    /* renamed from: a */
    void mo13737a();

    /* renamed from: a */
    void mo13735a(String str, C7675a c7675a);
}
