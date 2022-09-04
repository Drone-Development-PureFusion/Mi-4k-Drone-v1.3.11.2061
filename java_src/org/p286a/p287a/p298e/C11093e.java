package org.p286a.p287a.p298e;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.p286a.p287a.p288a.AbstractC11009c;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11009c
/* renamed from: org.a.a.e.e */
/* loaded from: classes2.dex */
public final class C11093e<I> {

    /* renamed from: a */
    private final Map<String, I> f35753a = new HashMap();

    C11093e() {
    }

    /* renamed from: a */
    public static <I> C11093e<I> m2042a() {
        return new C11093e<>();
    }

    /* renamed from: a */
    public C11093e<I> m2041a(String str, I i) {
        C11354a.m1322a(str, "ID");
        C11354a.m1321a(i, "Item");
        this.f35753a.put(str.toLowerCase(Locale.US), i);
        return this;
    }

    /* renamed from: b */
    public C11092d<I> m2040b() {
        return new C11092d<>(this.f35753a);
    }

    public String toString() {
        return this.f35753a.toString();
    }
}
