package org.p356d.p358b;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import org.p286a.p287a.p299f.p302c.C11125l;
import org.p356d.AbstractC11759f;
/* renamed from: org.d.b.b */
/* loaded from: classes3.dex */
public class C11733b implements AbstractC11759f {

    /* renamed from: e */
    private static String f37033e = "[ ";

    /* renamed from: f */
    private static String f37034f = " ]";

    /* renamed from: g */
    private static String f37035g = ", ";
    private static final long serialVersionUID = 1803952589649545191L;

    /* renamed from: c */
    private final String f37036c;

    /* renamed from: d */
    private List<AbstractC11759f> f37037d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11733b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("A marker name cannot be null");
        }
        this.f37036c = str;
    }

    @Override // org.p356d.AbstractC11759f
    /* renamed from: a */
    public String mo11a() {
        return this.f37036c;
    }

    @Override // org.p356d.AbstractC11759f
    /* renamed from: a */
    public synchronized void mo9a(AbstractC11759f abstractC11759f) {
        if (abstractC11759f == null) {
            throw new IllegalArgumentException("A null value cannot be added to a Marker as reference.");
        }
        if (!mo5c(abstractC11759f) && !abstractC11759f.mo5c(this)) {
            if (this.f37037d == null) {
                this.f37037d = new Vector();
            }
            this.f37037d.add(abstractC11759f);
        }
    }

    @Override // org.p356d.AbstractC11759f
    /* renamed from: a */
    public boolean mo10a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Other cannot be null");
        }
        if (this.f37036c.equals(str)) {
            return true;
        }
        if (mo6c()) {
            for (AbstractC11759f abstractC11759f : this.f37037d) {
                if (abstractC11759f.mo10a(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.p356d.AbstractC11759f
    /* renamed from: b */
    public boolean mo8b() {
        return mo6c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0020, code lost:
        r4.f37037d.remove(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0025, code lost:
        r0 = true;
     */
    @Override // org.p356d.AbstractC11759f
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized boolean mo7b(AbstractC11759f abstractC11759f) {
        boolean z;
        if (this.f37037d != null) {
            int size = this.f37037d.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                } else if (abstractC11759f.equals(this.f37037d.get(i))) {
                    break;
                } else {
                    i++;
                }
            }
        } else {
            z = false;
        }
        return z;
    }

    @Override // org.p356d.AbstractC11759f
    /* renamed from: c */
    public synchronized boolean mo6c() {
        boolean z;
        if (this.f37037d != null) {
            if (this.f37037d.size() > 0) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    @Override // org.p356d.AbstractC11759f
    /* renamed from: c */
    public boolean mo5c(AbstractC11759f abstractC11759f) {
        if (abstractC11759f == null) {
            throw new IllegalArgumentException("Other cannot be null");
        }
        if (equals(abstractC11759f)) {
            return true;
        }
        if (mo6c()) {
            for (AbstractC11759f abstractC11759f2 : this.f37037d) {
                if (abstractC11759f2.mo5c(abstractC11759f)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.p356d.AbstractC11759f
    /* renamed from: d */
    public synchronized Iterator<AbstractC11759f> mo4d() {
        return this.f37037d != null ? this.f37037d.iterator() : Collections.emptyList().iterator();
    }

    @Override // org.p356d.AbstractC11759f
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof AbstractC11759f)) {
            return this.f37036c.equals(((AbstractC11759f) obj).mo11a());
        }
        return false;
    }

    @Override // org.p356d.AbstractC11759f
    public int hashCode() {
        return this.f37036c.hashCode();
    }

    public String toString() {
        if (!mo6c()) {
            return mo11a();
        }
        Iterator<AbstractC11759f> mo4d = mo4d();
        StringBuilder sb = new StringBuilder(mo11a());
        sb.append(C11125l.f35805c).append(f37033e);
        while (mo4d.hasNext()) {
            sb.append(mo4d.next().mo11a());
            if (mo4d.hasNext()) {
                sb.append(f37035g);
            }
        }
        sb.append(f37034f);
        return sb.toString();
    }
}
