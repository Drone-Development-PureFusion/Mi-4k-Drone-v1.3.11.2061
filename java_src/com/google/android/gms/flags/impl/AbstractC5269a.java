package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import com.google.android.gms.internal.aml;
import java.util.concurrent.Callable;
/* renamed from: com.google.android.gms.flags.impl.a */
/* loaded from: classes2.dex */
public abstract class AbstractC5269a<T> {

    /* renamed from: com.google.android.gms.flags.impl.a$a */
    /* loaded from: classes2.dex */
    public static class C5270a extends AbstractC5269a<Boolean> {
        /* renamed from: a */
        public static Boolean m20842a(final SharedPreferences sharedPreferences, final String str, final Boolean bool) {
            return (Boolean) aml.m16789a(new Callable<Boolean>() { // from class: com.google.android.gms.flags.impl.a.a.1
                @Override // java.util.concurrent.Callable
                /* renamed from: a */
                public Boolean call() {
                    return Boolean.valueOf(sharedPreferences.getBoolean(str, bool.booleanValue()));
                }
            });
        }
    }

    /* renamed from: com.google.android.gms.flags.impl.a$b */
    /* loaded from: classes2.dex */
    public static class C5272b extends AbstractC5269a<Integer> {
        /* renamed from: a */
        public static Integer m20840a(final SharedPreferences sharedPreferences, final String str, final Integer num) {
            return (Integer) aml.m16789a(new Callable<Integer>() { // from class: com.google.android.gms.flags.impl.a.b.1
                @Override // java.util.concurrent.Callable
                /* renamed from: a */
                public Integer call() {
                    return Integer.valueOf(sharedPreferences.getInt(str, num.intValue()));
                }
            });
        }
    }

    /* renamed from: com.google.android.gms.flags.impl.a$c */
    /* loaded from: classes2.dex */
    public static class C5274c extends AbstractC5269a<Long> {
        /* renamed from: a */
        public static Long m20838a(final SharedPreferences sharedPreferences, final String str, final Long l) {
            return (Long) aml.m16789a(new Callable<Long>() { // from class: com.google.android.gms.flags.impl.a.c.1
                @Override // java.util.concurrent.Callable
                /* renamed from: a */
                public Long call() {
                    return Long.valueOf(sharedPreferences.getLong(str, l.longValue()));
                }
            });
        }
    }

    /* renamed from: com.google.android.gms.flags.impl.a$d */
    /* loaded from: classes2.dex */
    public static class C5276d extends AbstractC5269a<String> {
        /* renamed from: a */
        public static String m20836a(final SharedPreferences sharedPreferences, final String str, final String str2) {
            return (String) aml.m16789a(new Callable<String>() { // from class: com.google.android.gms.flags.impl.a.d.1
                @Override // java.util.concurrent.Callable
                /* renamed from: a */
                public String call() {
                    return sharedPreferences.getString(str, str2);
                }
            });
        }
    }
}
