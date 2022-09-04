package org.p286a.p287a.p298e;

import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import org.p286a.p287a.C11011b;
import org.p286a.p287a.p288a.AbstractC11008b;
import org.p286a.p287a.p320o.C11354a;
@AbstractC11008b
/* renamed from: org.a.a.e.a */
/* loaded from: classes2.dex */
public class C11087a implements Cloneable {

    /* renamed from: a */
    public static final C11087a f35734a = new C11088a().m2059a();

    /* renamed from: b */
    private final int f35735b;

    /* renamed from: c */
    private final int f35736c;

    /* renamed from: d */
    private final Charset f35737d;

    /* renamed from: e */
    private final CodingErrorAction f35738e;

    /* renamed from: f */
    private final CodingErrorAction f35739f;

    /* renamed from: g */
    private final C11090c f35740g;

    /* renamed from: org.a.a.e.a$a */
    /* loaded from: classes2.dex */
    public static class C11088a {

        /* renamed from: a */
        private int f35741a;

        /* renamed from: b */
        private int f35742b = -1;

        /* renamed from: c */
        private Charset f35743c;

        /* renamed from: d */
        private CodingErrorAction f35744d;

        /* renamed from: e */
        private CodingErrorAction f35745e;

        /* renamed from: f */
        private C11090c f35746f;

        C11088a() {
        }

        /* renamed from: a */
        public C11088a m2058a(int i) {
            this.f35741a = i;
            return this;
        }

        /* renamed from: a */
        public C11088a m2057a(Charset charset) {
            this.f35743c = charset;
            return this;
        }

        /* renamed from: a */
        public C11088a m2056a(CodingErrorAction codingErrorAction) {
            this.f35744d = codingErrorAction;
            if (codingErrorAction != null && this.f35743c == null) {
                this.f35743c = C11011b.f35499f;
            }
            return this;
        }

        /* renamed from: a */
        public C11088a m2055a(C11090c c11090c) {
            this.f35746f = c11090c;
            return this;
        }

        /* renamed from: a */
        public C11087a m2059a() {
            Charset charset = this.f35743c;
            if (charset == null && (this.f35744d != null || this.f35745e != null)) {
                charset = C11011b.f35499f;
            }
            int i = this.f35741a > 0 ? this.f35741a : 8192;
            return new C11087a(i, this.f35742b >= 0 ? this.f35742b : i, charset, this.f35744d, this.f35745e, this.f35746f);
        }

        /* renamed from: b */
        public C11088a m2054b(int i) {
            this.f35742b = i;
            return this;
        }

        /* renamed from: b */
        public C11088a m2053b(CodingErrorAction codingErrorAction) {
            this.f35745e = codingErrorAction;
            if (codingErrorAction != null && this.f35743c == null) {
                this.f35743c = C11011b.f35499f;
            }
            return this;
        }
    }

    C11087a(int i, int i2, Charset charset, CodingErrorAction codingErrorAction, CodingErrorAction codingErrorAction2, C11090c c11090c) {
        this.f35735b = i;
        this.f35736c = i2;
        this.f35737d = charset;
        this.f35738e = codingErrorAction;
        this.f35739f = codingErrorAction2;
        this.f35740g = c11090c;
    }

    /* renamed from: a */
    public static C11088a m2067a(C11087a c11087a) {
        C11354a.m1321a(c11087a, "Connection config");
        return new C11088a().m2057a(c11087a.m2065c()).m2056a(c11087a.m2064d()).m2053b(c11087a.m2063e()).m2055a(c11087a.m2062f());
    }

    /* renamed from: h */
    public static C11088a m2060h() {
        return new C11088a();
    }

    /* renamed from: a */
    public int m2068a() {
        return this.f35735b;
    }

    /* renamed from: b */
    public int m2066b() {
        return this.f35736c;
    }

    /* renamed from: c */
    public Charset m2065c() {
        return this.f35737d;
    }

    /* renamed from: d */
    public CodingErrorAction m2064d() {
        return this.f35738e;
    }

    /* renamed from: e */
    public CodingErrorAction m2063e() {
        return this.f35739f;
    }

    /* renamed from: f */
    public C11090c m2062f() {
        return this.f35740g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public C11087a clone() {
        return (C11087a) super.clone();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[bufferSize=").append(this.f35735b).append(", fragmentSizeHint=").append(this.f35736c).append(", charset=").append(this.f35737d).append(", malformedInputAction=").append(this.f35738e).append(", unmappableInputAction=").append(this.f35739f).append(", messageConstraints=").append(this.f35740g).append("]");
        return sb.toString();
    }
}
