package p005b.p006a.p007a.p029b.p042h.p044b;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import p005b.p006a.p007a.p029b.p058r.C0723t;
/* renamed from: b.a.a.b.h.b.d */
/* loaded from: classes.dex */
public class C0517d {

    /* renamed from: a */
    private String f798a;

    /* renamed from: b */
    private String f799b;

    /* renamed from: c */
    private String f800c;

    /* renamed from: d */
    private String f801d;

    /* renamed from: f */
    private KeyStore m39016f() {
        return m39019d() != null ? KeyStore.getInstance(m39021c(), m39019d()) : KeyStore.getInstance(m39021c());
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public KeyStore m39025a() {
        InputStream inputStream;
        Throwable th;
        Exception exc;
        if (m39023b() == null) {
            throw new IllegalArgumentException("location is required");
        }
        try {
            try {
                try {
                    try {
                        InputStream openStream = C0723t.m38389a(m39023b()).openStream();
                        try {
                            KeyStore m39016f = m39016f();
                            m39016f.load(openStream, m39017e().toCharArray());
                            if (openStream != null) {
                                try {
                                    openStream.close();
                                } catch (IOException e) {
                                    e.printStackTrace(System.err);
                                }
                            }
                            return m39016f;
                        } catch (Exception e2) {
                            inputStream = openStream;
                            exc = e2;
                            try {
                                throw new KeyStoreException(m39023b() + ": " + exc.getMessage(), exc);
                            } catch (Throwable th2) {
                                th = th2;
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (IOException e3) {
                                        e3.printStackTrace(System.err);
                                    }
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        inputStream = null;
                        th = th3;
                        if (inputStream != null) {
                        }
                        throw th;
                    }
                } catch (NoSuchAlgorithmException e4) {
                    throw new NoSuchAlgorithmException("no such keystore type: " + m39021c());
                }
            } catch (FileNotFoundException e5) {
                throw new KeyStoreException(m39023b() + ": file not found");
            } catch (NoSuchProviderException e6) {
                throw new NoSuchProviderException("no such keystore provider: " + m39019d());
            }
        } catch (Exception e7) {
            inputStream = null;
            exc = e7;
        } catch (Throwable th4) {
            inputStream = null;
            th = th4;
            if (inputStream != null) {
            }
            throw th;
        }
    }

    /* renamed from: a */
    public void m39024a(String str) {
        this.f798a = str;
    }

    /* renamed from: b */
    public String m39023b() {
        return this.f798a;
    }

    /* renamed from: b */
    public void m39022b(String str) {
        this.f800c = str;
    }

    /* renamed from: c */
    public String m39021c() {
        return this.f800c == null ? AbstractC0518e.f803b : this.f800c;
    }

    /* renamed from: c */
    public void m39020c(String str) {
        this.f799b = str;
    }

    /* renamed from: d */
    public String m39019d() {
        return this.f799b;
    }

    /* renamed from: d */
    public void m39018d(String str) {
        this.f801d = str;
    }

    /* renamed from: e */
    public String m39017e() {
        return this.f801d == null ? AbstractC0518e.f804c : this.f801d;
    }
}
