package p005b.p006a.p007a.p008a.p026n;

import java.io.Serializable;
/* renamed from: b.a.a.a.n.p */
/* loaded from: classes.dex */
public class C0378p implements Serializable {
    private static final long serialVersionUID = -2374374378980555982L;

    /* renamed from: a */
    final StackTraceElement f406a;

    /* renamed from: b */
    private transient String f407b;

    /* renamed from: c */
    private C0364b f408c;

    public C0378p(StackTraceElement stackTraceElement) {
        if (stackTraceElement == null) {
            throw new IllegalArgumentException("ste cannot be null");
        }
        this.f406a = stackTraceElement;
    }

    /* renamed from: a */
    public String m39512a() {
        if (this.f407b == null) {
            this.f407b = "at " + this.f406a.toString();
        }
        return this.f407b;
    }

    /* renamed from: a */
    public void m39511a(C0364b c0364b) {
        if (this.f408c != null) {
            throw new IllegalStateException("Packaging data has been already set");
        }
        this.f408c = c0364b;
    }

    /* renamed from: b */
    public StackTraceElement m39510b() {
        return this.f406a;
    }

    /* renamed from: c */
    public C0364b m39509c() {
        return this.f408c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C0378p c0378p = (C0378p) obj;
            if (!this.f406a.equals(c0378p.f406a)) {
                return false;
            }
            return this.f408c == null ? c0378p.f408c == null : this.f408c.equals(c0378p.f408c);
        }
        return false;
    }

    public int hashCode() {
        return this.f406a.hashCode();
    }

    public String toString() {
        return m39512a();
    }
}
