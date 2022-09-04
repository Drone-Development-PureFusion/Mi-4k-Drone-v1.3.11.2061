package org.p356d;

import java.io.Closeable;
import java.util.Map;
import org.p356d.p358b.C11740i;
import org.p356d.p358b.C11744m;
import org.p356d.p359c.C11749b;
import org.p356d.p360d.AbstractC11754c;
/* renamed from: org.d.e */
/* loaded from: classes3.dex */
public class C11756e {

    /* renamed from: a */
    static final String f37100a = "http://www.slf4j.org/codes.html#null_MDCA";

    /* renamed from: b */
    static final String f37101b = "http://www.slf4j.org/codes.html#no_static_mdc_binder";

    /* renamed from: c */
    static AbstractC11754c f37102c;

    /* renamed from: org.d.e$a */
    /* loaded from: classes3.dex */
    public static class C11758a implements Closeable {

        /* renamed from: a */
        private final String f37103a;

        private C11758a(String str) {
            this.f37103a = str;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            C11756e.m15b(this.f37103a);
        }
    }

    static {
        try {
            f37102c = m12d();
        } catch (Exception e) {
            C11744m.m123a("MDC binding unsuccessful.", e);
        } catch (NoClassDefFoundError e2) {
            f37102c = new C11740i();
            String message = e2.getMessage();
            if (message == null || !message.contains("StaticMDCBinder")) {
                throw e2;
            }
            C11744m.m119c("Failed to load class \"org.slf4j.impl.StaticMDCBinder\".");
            C11744m.m119c("Defaulting to no-operation MDCAdapter implementation.");
            C11744m.m119c("See http://www.slf4j.org/codes.html#no_static_mdc_binder for further details.");
        }
    }

    private C11756e() {
    }

    /* renamed from: a */
    public static String m19a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("key parameter cannot be null");
        }
        if (f37102c != null) {
            return f37102c.mo24b(str);
        }
        throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
    }

    /* renamed from: a */
    public static void m20a() {
        if (f37102c == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        f37102c.mo28a();
    }

    /* renamed from: a */
    public static void m18a(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("key parameter cannot be null");
        }
        if (f37102c == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        f37102c.mo26a(str, str2);
    }

    /* renamed from: a */
    public static void m17a(Map<String, String> map) {
        if (f37102c == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        f37102c.mo25a(map);
    }

    /* renamed from: b */
    public static Map<String, String> m16b() {
        if (f37102c == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        return f37102c.mo23d();
    }

    /* renamed from: b */
    public static C11758a m14b(String str, String str2) {
        m18a(str, str2);
        return new C11758a(str);
    }

    /* renamed from: b */
    public static void m15b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("key parameter cannot be null");
        }
        if (f37102c == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        f37102c.mo27a(str);
    }

    /* renamed from: c */
    public static AbstractC11754c m13c() {
        return f37102c;
    }

    /* renamed from: d */
    private static AbstractC11754c m12d() {
        try {
            return C11749b.getSingleton().m54a();
        } catch (NoSuchMethodError e) {
            return C11749b.f37069a.m54a();
        }
    }
}
