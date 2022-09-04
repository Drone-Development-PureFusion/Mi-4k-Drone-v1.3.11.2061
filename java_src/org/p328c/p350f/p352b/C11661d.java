package org.p328c.p350f.p352b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.p328c.p350f.p351a.C11651k;
/* renamed from: org.c.f.b.d */
/* loaded from: classes.dex */
public class C11661d {

    /* renamed from: a */
    private final String f36804a;

    /* renamed from: b */
    private final C11651k f36805b;

    /* renamed from: c */
    private final List<Object> f36806c;

    public C11661d(String str, C11651k c11651k, List<Object> list) {
        m363a(str, "The name is missing.");
        m363a(c11651k, "The test class is missing.");
        m363a(list, "The parameters are missing.");
        this.f36804a = str;
        this.f36805b = c11651k;
        this.f36806c = Collections.unmodifiableList(new ArrayList(list));
    }

    /* renamed from: a */
    private static void m363a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* renamed from: a */
    public String m364a() {
        return this.f36804a;
    }

    /* renamed from: b */
    public C11651k m362b() {
        return this.f36805b;
    }

    /* renamed from: c */
    public List<Object> m361c() {
        return this.f36806c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C11661d c11661d = (C11661d) obj;
            return this.f36804a.equals(c11661d.f36804a) && this.f36806c.equals(c11661d.f36806c) && this.f36805b.equals(c11661d.f36805b);
        }
        return false;
    }

    public int hashCode() {
        return (14747 * (((this.f36804a.hashCode() + 14747) * 14747) + this.f36805b.hashCode())) + this.f36806c.hashCode();
    }

    public String toString() {
        return this.f36805b.m410e() + " '" + this.f36804a + "' with parameters " + this.f36806c;
    }
}
