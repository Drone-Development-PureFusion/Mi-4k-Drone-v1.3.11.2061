package com.p079a.p080a;

import java.util.zip.ZipException;
/* renamed from: com.a.a.o */
/* loaded from: classes.dex */
public class C0880o extends ZipException {
    private static final long serialVersionUID = 4430521921766595597L;

    /* renamed from: a */
    private final C0881a f1848a;

    /* renamed from: b */
    private final C0890w f1849b;

    /* renamed from: com.a.a.o$a */
    /* loaded from: classes.dex */
    public static class C0881a {

        /* renamed from: a */
        public static final C0881a f1850a = new C0881a("encryption");

        /* renamed from: b */
        public static final C0881a f1851b = new C0881a("compression method");

        /* renamed from: c */
        public static final C0881a f1852c = new C0881a("data descriptor");

        /* renamed from: d */
        private final String f1853d;

        private C0881a(String str) {
            this.f1853d = str;
        }

        public String toString() {
            return this.f1853d;
        }
    }

    public C0880o(C0881a c0881a, C0890w c0890w) {
        super("unsupported feature " + c0881a + " used in entry " + c0890w.getName());
        this.f1848a = c0881a;
        this.f1849b = c0890w;
    }

    /* renamed from: a */
    public C0881a m37544a() {
        return this.f1848a;
    }

    /* renamed from: b */
    public C0890w m37543b() {
        return this.f1849b;
    }
}
