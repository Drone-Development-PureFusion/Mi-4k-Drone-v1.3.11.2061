package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import java.util.PriorityQueue;
import org.p286a.p287a.p299f.p302c.C11125l;
@aaa
/* renamed from: com.google.android.gms.internal.tv */
/* loaded from: classes.dex */
public class C7771tv {

    /* renamed from: com.google.android.gms.internal.tv$a */
    /* loaded from: classes2.dex */
    public static class C7772a {

        /* renamed from: a */
        final long f25696a;

        /* renamed from: b */
        final String f25697b;

        /* renamed from: c */
        final int f25698c;

        C7772a(long j, String str, int i) {
            this.f25696a = j;
            this.f25697b = str;
            this.f25698c = i;
        }

        public boolean equals(@Nullable Object obj) {
            if (obj == null || !(obj instanceof C7772a)) {
                return false;
            }
            return ((C7772a) obj).f25696a == this.f25696a && ((C7772a) obj).f25698c == this.f25698c;
        }

        public int hashCode() {
            return (int) this.f25696a;
        }
    }

    /* renamed from: a */
    static long m13513a(int i, int i2, long j, long j2, long j3) {
        return ((((((j + 1073807359) - ((((i + 2147483647L) % 1073807359) * j2) % 1073807359)) % 1073807359) * j3) % 1073807359) + ((i2 + 2147483647L) % 1073807359)) % 1073807359;
    }

    /* renamed from: a */
    static long m13511a(long j, int i) {
        if (i == 0) {
            return 1L;
        }
        return i != 1 ? i % 2 == 0 ? m13511a((j * j) % 1073807359, i / 2) % 1073807359 : ((m13511a((j * j) % 1073807359, i / 2) % 1073807359) * j) % 1073807359 : j;
    }

    /* renamed from: a */
    static String m13510a(String[] strArr, int i, int i2) {
        if (strArr.length < i + i2) {
            abr.b("Unable to construct shingle");
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i3 = i; i3 < (i + i2) - 1; i3++) {
            stringBuffer.append(strArr[i3]);
            stringBuffer.append(C11125l.f35805c);
        }
        stringBuffer.append(strArr[(i + i2) - 1]);
        return stringBuffer.toString();
    }

    /* renamed from: a */
    static void m13512a(int i, long j, String str, int i2, PriorityQueue<C7772a> priorityQueue) {
        C7772a c7772a = new C7772a(j, str, i2);
        if ((priorityQueue.size() != i || (priorityQueue.peek().f25698c <= c7772a.f25698c && priorityQueue.peek().f25696a <= c7772a.f25696a)) && !priorityQueue.contains(c7772a)) {
            priorityQueue.add(c7772a);
            if (priorityQueue.size() <= i) {
                return;
            }
            priorityQueue.poll();
        }
    }

    /* renamed from: a */
    public static void m13509a(String[] strArr, int i, int i2, PriorityQueue<C7772a> priorityQueue) {
        if (strArr.length < i2) {
            m13512a(i, m13508b(strArr, 0, strArr.length), m13510a(strArr, 0, strArr.length), strArr.length, priorityQueue);
            return;
        }
        long m13508b = m13508b(strArr, 0, i2);
        m13512a(i, m13508b, m13510a(strArr, 0, i2), i2, priorityQueue);
        long m13511a = m13511a(16785407L, i2 - 1);
        int i3 = 1;
        while (i3 < (strArr.length - i2) + 1) {
            long m13513a = m13513a(C7769tt.m13521a(strArr[i3 - 1]), C7769tt.m13521a(strArr[(i3 + i2) - 1]), m13508b, m13511a, 16785407L);
            m13512a(i, m13513a, m13510a(strArr, i3, i2), strArr.length, priorityQueue);
            i3++;
            m13508b = m13513a;
        }
    }

    /* renamed from: b */
    private static long m13508b(String[] strArr, int i, int i2) {
        long m13521a = (C7769tt.m13521a(strArr[i]) + 2147483647L) % 1073807359;
        for (int i3 = i + 1; i3 < i + i2; i3++) {
            m13521a = (((m13521a * 16785407) % 1073807359) + ((C7769tt.m13521a(strArr[i3]) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return m13521a;
    }
}
