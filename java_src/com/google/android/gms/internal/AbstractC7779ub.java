package com.google.android.gms.internal;

import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.C3779u;
@aaa
/* renamed from: com.google.android.gms.internal.ub */
/* loaded from: classes.dex */
public abstract class AbstractC7779ub<T> {

    /* renamed from: a */
    private final int f25705a;

    /* renamed from: b */
    private final String f25706b;

    /* renamed from: c */
    private final T f25707c;

    private AbstractC7779ub(int i, String str, T t) {
        this.f25705a = i;
        this.f25706b = str;
        this.f25707c = t;
        C3779u.m26879p().m13479a(this);
    }

    /* renamed from: a */
    public static AbstractC7779ub<String> m13493a(int i, String str) {
        AbstractC7779ub<String> m13489a = m13489a(i, str, (String) null);
        C3779u.m26879p().m13477b(m13489a);
        return m13489a;
    }

    /* renamed from: a */
    public static AbstractC7779ub<Integer> m13492a(int i, String str, int i2) {
        return new AbstractC7779ub<Integer>(i, str, Integer.valueOf(i2)) { // from class: com.google.android.gms.internal.ub.2
            @Override // com.google.android.gms.internal.AbstractC7779ub
            /* renamed from: b */
            public Integer mo13482a(SharedPreferences sharedPreferences) {
                return Integer.valueOf(sharedPreferences.getInt(a(), b().intValue()));
            }
        };
    }

    /* renamed from: a */
    public static AbstractC7779ub<Long> m13491a(int i, String str, long j) {
        return new AbstractC7779ub<Long>(i, str, Long.valueOf(j)) { // from class: com.google.android.gms.internal.ub.3
            @Override // com.google.android.gms.internal.AbstractC7779ub
            /* renamed from: b */
            public Long mo13482a(SharedPreferences sharedPreferences) {
                return Long.valueOf(sharedPreferences.getLong(a(), b().longValue()));
            }
        };
    }

    /* renamed from: a */
    public static AbstractC7779ub<Boolean> m13490a(int i, String str, Boolean bool) {
        return new AbstractC7779ub<Boolean>(i, str, bool) { // from class: com.google.android.gms.internal.ub.1
            @Override // com.google.android.gms.internal.AbstractC7779ub
            /* renamed from: b */
            public Boolean mo13482a(SharedPreferences sharedPreferences) {
                return Boolean.valueOf(sharedPreferences.getBoolean(a(), b().booleanValue()));
            }
        };
    }

    /* renamed from: a */
    public static AbstractC7779ub<String> m13489a(int i, String str, String str2) {
        return new AbstractC7779ub<String>(i, str, str2) { // from class: com.google.android.gms.internal.ub.4
            @Override // com.google.android.gms.internal.AbstractC7779ub
            /* renamed from: b */
            public String mo13482a(SharedPreferences sharedPreferences) {
                return sharedPreferences.getString(a(), b());
            }
        };
    }

    /* renamed from: b */
    public static AbstractC7779ub<String> m13487b(int i, String str) {
        AbstractC7779ub<String> m13489a = m13489a(i, str, (String) null);
        C3779u.m26879p().m13476c(m13489a);
        return m13489a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo13482a(SharedPreferences sharedPreferences);

    /* renamed from: a */
    public String m13494a() {
        return this.f25706b;
    }

    /* renamed from: b */
    public T m13488b() {
        return this.f25707c;
    }

    /* renamed from: c */
    public T m13486c() {
        return (T) C3779u.m26878q().m13473a(this);
    }
}
