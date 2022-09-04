package org.p328c;

import java.util.Arrays;
import org.p325b.AbstractC11433k;
import org.p325b.C11425d;
/* renamed from: org.c.d */
/* loaded from: classes2.dex */
public class C11567d {
    /* renamed from: a */
    public static <T> void m690a(T t, AbstractC11433k<T> abstractC11433k) {
        if (!abstractC11433k.mo900a(t)) {
            throw new C11595e(t, abstractC11433k);
        }
    }

    /* renamed from: a */
    public static <T> void m689a(String str, T t, AbstractC11433k<T> abstractC11433k) {
        if (!abstractC11433k.mo900a(t)) {
            throw new C11595e(str, t, abstractC11433k);
        }
    }

    /* renamed from: a */
    public static void m688a(String str, Throwable th) {
        m689a(str, th, C11425d.m1115b());
    }

    /* renamed from: a */
    public static void m687a(String str, boolean z) {
        if (!z) {
            throw new C11595e(str);
        }
    }

    /* renamed from: a */
    public static void m686a(Throwable th) {
        m690a(th, (AbstractC11433k<Throwable>) C11425d.m1115b());
    }

    /* renamed from: a */
    public static void m685a(boolean z) {
        m690a(Boolean.valueOf(z), C11425d.m1126a(true));
    }

    /* renamed from: a */
    public static void m684a(Object... objArr) {
        m690a(Arrays.asList(objArr), C11425d.m1099c((AbstractC11433k) C11425d.m1103c()));
    }

    /* renamed from: b */
    public static void m683b(String str, boolean z) {
        m687a(str, !z);
    }

    /* renamed from: b */
    public static void m682b(boolean z) {
        m685a(!z);
    }
}
