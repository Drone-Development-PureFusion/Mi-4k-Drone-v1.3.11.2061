package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.google.android.gms.common.internal.c */
/* loaded from: classes.dex */
public final class C4585c {

    /* renamed from: com.google.android.gms.common.internal.c$a */
    /* loaded from: classes2.dex */
    public static final class C4587a {

        /* renamed from: a */
        private final List<String> f17042a;

        /* renamed from: b */
        private final Object f17043b;

        private C4587a(Object obj) {
            this.f17043b = C4588d.m23627a(obj);
            this.f17042a = new ArrayList();
        }

        /* renamed from: a */
        public C4587a m23632a(String str, Object obj) {
            List<String> list = this.f17042a;
            String str2 = (String) C4588d.m23627a(str);
            String valueOf = String.valueOf(String.valueOf(obj));
            list.add(new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(valueOf).length()).append(str2).append("=").append(valueOf).toString());
            return this;
        }

        public String toString() {
            StringBuilder append = new StringBuilder(100).append(this.f17043b.getClass().getSimpleName()).append(C0494h.f734v);
            int size = this.f17042a.size();
            for (int i = 0; i < size; i++) {
                append.append(this.f17042a.get(i));
                if (i < size - 1) {
                    append.append(", ");
                }
            }
            return append.append(C0494h.f735w).toString();
        }
    }

    /* renamed from: a */
    public static int m23633a(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    /* renamed from: a */
    public static C4587a m23635a(Object obj) {
        return new C4587a(obj);
    }

    /* renamed from: a */
    public static boolean m23634a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
