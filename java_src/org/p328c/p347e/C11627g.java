package org.p328c.p347e;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.p328c.p337b.C11508c;
import org.p328c.p347e.AbstractC11624e;
import org.p328c.p350f.p351a.C11645e;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.c.e.g */
/* loaded from: classes2.dex */
public class C11627g {

    /* renamed from: a */
    private final List<String> f36767a = new ArrayList();

    /* renamed from: b */
    private final List<Class<?>> f36768b = new ArrayList();

    /* renamed from: c */
    private final List<Throwable> f36769c = new ArrayList();

    /* renamed from: org.c.e.g$a */
    /* loaded from: classes2.dex */
    public static class C11628a extends Exception {
        private static final long serialVersionUID = 1;

        public C11628a(String str) {
            super(str);
        }
    }

    C11627g() {
    }

    /* renamed from: a */
    public static C11627g m518a(String[] strArr) {
        C11627g c11627g = new C11627g();
        c11627g.m513d(strArr);
        return c11627g;
    }

    /* renamed from: a */
    private AbstractC11630i m521a(Throwable th) {
        return AbstractC11630i.m497a(C11627g.class, th);
    }

    /* renamed from: a */
    private AbstractC11630i m519a(AbstractC11630i abstractC11630i) {
        try {
            AbstractC11630i abstractC11630i2 = abstractC11630i;
            for (String str : this.f36767a) {
                abstractC11630i2 = abstractC11630i2.m495a(C11623d.m526a(abstractC11630i2, str));
            }
            return abstractC11630i2;
        } catch (AbstractC11624e.C11625a e) {
            return m521a(e);
        }
    }

    /* renamed from: a */
    private String[] m517a(String[] strArr, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        while (i != i2) {
            arrayList.add(strArr[i]);
            i++;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: d */
    private void m513d(String[] strArr) {
        m514c(m515b(strArr));
    }

    /* renamed from: a */
    public List<String> m522a() {
        return Collections.unmodifiableList(this.f36767a);
    }

    /* renamed from: a */
    public AbstractC11630i m520a(C11596a c11596a) {
        return this.f36769c.isEmpty() ? m519a(AbstractC11630i.m494a(c11596a, (Class[]) this.f36768b.toArray(new Class[this.f36768b.size()]))) : m521a(new C11645e(this.f36769c));
    }

    /* renamed from: b */
    public List<Class<?>> m516b() {
        return Collections.unmodifiableList(this.f36768b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
        return new java.lang.String[0];
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    String[] m515b(String... strArr) {
        int i;
        String substring;
        int i2 = 0;
        while (true) {
            if (i2 == strArr.length) {
                break;
            }
            String str = strArr[i2];
            if (str.equals("--")) {
                return m517a(strArr, i2 + 1, strArr.length);
            }
            if (!str.startsWith("--")) {
                return m517a(strArr, i2, strArr.length);
            }
            if (str.startsWith("--filter=") || str.equals("--filter")) {
                if (str.equals("--filter")) {
                    i = i2 + 1;
                    if (i >= strArr.length) {
                        this.f36769c.add(new C11628a(str + " value not specified"));
                        break;
                    }
                    substring = strArr[i];
                } else {
                    i = i2;
                    substring = str.substring(str.indexOf(61) + 1);
                }
                this.f36767a.add(substring);
                i2 = i;
            } else {
                this.f36769c.add(new C11628a("JUnit knows nothing about the " + str + " option"));
            }
            i2++;
        }
    }

    /* renamed from: c */
    void m514c(String[] strArr) {
        for (String str : strArr) {
            try {
                this.f36768b.add(C11508c.m897a(str));
            } catch (ClassNotFoundException e) {
                this.f36769c.add(new IllegalArgumentException("Could not find class [" + str + "]", e));
            }
        }
    }
}
