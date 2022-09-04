package it.p273a.p274a.p275a;

import it.p273a.p274a.AbstractC10866e;
import it.p273a.p274a.AbstractC10869h;
import it.p273a.p274a.C10867f;
import it.p273a.p274a.C10876o;
import java.io.IOException;
import java.net.Socket;
/* renamed from: it.a.a.a.e */
/* loaded from: classes2.dex */
public class C10851e extends AbstractC10869h {

    /* renamed from: d */
    public static int f34740d = 0;

    /* renamed from: e */
    public static int f34741e = 1;

    /* renamed from: f */
    public int f34742f;

    /* renamed from: g */
    private String f34743g;

    /* renamed from: h */
    private int f34744h;

    /* renamed from: i */
    private String f34745i;

    /* renamed from: j */
    private String f34746j;

    public C10851e(String str, int i) {
        this(str, i, "anonymous", "ftp4j");
    }

    public C10851e(String str, int i, String str2, String str3) {
        super(true);
        this.f34742f = f34740d;
        this.f34743g = str;
        this.f34744h = i;
        this.f34745i = str2;
        this.f34746j = str3;
    }

    @Override // it.p273a.p274a.AbstractC10869h
    /* renamed from: c */
    public Socket mo3004c(String str, int i) {
        boolean z;
        Socket a = a(this.f34743g, this.f34744h);
        C10867f c10867f = new C10867f(a, "ASCII");
        try {
            if (c10867f.m3016c().m2982a() != 220) {
                throw new IOException("Invalid proxy response");
            }
            if (this.f34742f == f34740d) {
                c10867f.m3021a(new StringBuffer().append("USER ").append(this.f34745i).toString());
                try {
                    switch (c10867f.m3016c().m2982a()) {
                        case AbstractC10866e.f34827F /* 230 */:
                            z = false;
                            break;
                        case AbstractC10866e.f34850q /* 331 */:
                            z = true;
                            break;
                        default:
                            throw new IOException("Proxy authentication failed");
                    }
                    if (z) {
                        c10867f.m3021a(new StringBuffer().append("PASS ").append(this.f34746j).toString());
                        try {
                            if (c10867f.m3016c().m2982a() != 230) {
                                throw new IOException("Proxy authentication failed");
                            }
                        } catch (C10876o e) {
                            throw new IOException("Invalid proxy response");
                        }
                    }
                    c10867f.m3021a(new StringBuffer().append("SITE ").append(str).append(":").append(i).toString());
                } catch (C10876o e2) {
                    throw new IOException("Invalid proxy response");
                }
            } else if (this.f34742f == f34741e) {
                c10867f.m3021a(new StringBuffer().append("OPEN ").append(str).append(":").append(i).toString());
            }
            return a;
        } catch (C10876o e3) {
            throw new IOException("Invalid proxy response");
        }
    }

    @Override // it.p273a.p274a.AbstractC10869h
    /* renamed from: d */
    public Socket mo3003d(String str, int i) {
        return b(str, i);
    }

    /* renamed from: d */
    public void m3130d(int i) {
        if (i == f34741e || i == f34740d) {
            this.f34742f = i;
            return;
        }
        throw new IllegalArgumentException("Invalid style");
    }
}
