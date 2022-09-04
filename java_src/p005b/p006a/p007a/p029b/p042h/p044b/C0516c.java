package p005b.p006a.p007a.p029b.p042h.p044b;

import javax.net.ssl.KeyManagerFactory;
/* renamed from: b.a.a.b.h.b.c */
/* loaded from: classes.dex */
public class C0516c {

    /* renamed from: a */
    private String f796a;

    /* renamed from: b */
    private String f797b;

    /* renamed from: a */
    public KeyManagerFactory m39030a() {
        return m39026c() != null ? KeyManagerFactory.getInstance(m39028b(), m39026c()) : KeyManagerFactory.getInstance(m39028b());
    }

    /* renamed from: a */
    public void m39029a(String str) {
        this.f796a = str;
    }

    /* renamed from: b */
    public String m39028b() {
        return this.f796a == null ? KeyManagerFactory.getDefaultAlgorithm() : this.f796a;
    }

    /* renamed from: b */
    public void m39027b(String str) {
        this.f797b = str;
    }

    /* renamed from: c */
    public String m39026c() {
        return this.f797b;
    }
}
