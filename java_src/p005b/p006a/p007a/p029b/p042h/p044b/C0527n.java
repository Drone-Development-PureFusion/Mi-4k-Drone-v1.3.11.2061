package p005b.p006a.p007a.p029b.p042h.p044b;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
/* renamed from: b.a.a.b.h.b.n */
/* loaded from: classes.dex */
public class C0527n {

    /* renamed from: a */
    private String f826a;

    /* renamed from: b */
    private String f827b;

    /* renamed from: a */
    public SecureRandom m38967a() {
        try {
            return m38963c() != null ? SecureRandom.getInstance(m38965b(), m38963c()) : SecureRandom.getInstance(m38965b());
        } catch (NoSuchAlgorithmException e) {
            throw new NoSuchAlgorithmException("no such secure random algorithm: " + m38965b());
        } catch (NoSuchProviderException e2) {
            throw new NoSuchProviderException("no such secure random provider: " + m38963c());
        }
    }

    /* renamed from: a */
    public void m38966a(String str) {
        this.f826a = str;
    }

    /* renamed from: b */
    public String m38965b() {
        return this.f826a == null ? AbstractC0518e.f805d : this.f826a;
    }

    /* renamed from: b */
    public void m38964b(String str) {
        this.f827b = str;
    }

    /* renamed from: c */
    public String m38963c() {
        return this.f827b;
    }
}
