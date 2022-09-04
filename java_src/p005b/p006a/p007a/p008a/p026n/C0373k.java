package p005b.p006a.p007a.p008a.p026n;

import java.io.Serializable;
import p005b.p006a.p007a.p008a.C0286f;
/* renamed from: b.a.a.a.n.k */
/* loaded from: classes.dex */
public class C0373k implements Serializable {

    /* renamed from: c */
    static final /* synthetic */ boolean f372c;
    private static final long serialVersionUID = 5028223666108713696L;

    /* renamed from: a */
    final C0372j f373a;

    /* renamed from: b */
    final String f374b;

    static {
        f372c = !C0373k.class.desiredAssertionStatus();
    }

    public C0373k(String str, C0286f c0286f) {
        this.f374b = str;
        if (f372c || c0286f.m39750d() != null) {
            this.f373a = c0286f.m39750d();
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public C0372j m39556a() {
        return this.f373a;
    }

    /* renamed from: b */
    public String m39555b() {
        return this.f374b;
    }
}
