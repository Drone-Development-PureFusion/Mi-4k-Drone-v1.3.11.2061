package p005b.p006a.p007a.p029b.p056p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* renamed from: b.a.a.b.p.h */
/* loaded from: classes.dex */
public abstract class AbstractC0683h implements AbstractC0682g {

    /* renamed from: j */
    private static final List<AbstractC0682g> f1219j = new ArrayList(0);

    /* renamed from: d */
    int f1220d;

    /* renamed from: e */
    final String f1221e;

    /* renamed from: f */
    final Object f1222f;

    /* renamed from: g */
    List<AbstractC0682g> f1223g;

    /* renamed from: h */
    Throwable f1224h;

    /* renamed from: i */
    long f1225i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0683h(int i, String str, Object obj) {
        this(i, str, obj, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0683h(int i, String str, Object obj, Throwable th) {
        this.f1220d = i;
        this.f1221e = str;
        this.f1222f = obj;
        this.f1224h = th;
        this.f1225i = System.currentTimeMillis();
    }

    @Override // p005b.p006a.p007a.p029b.p056p.AbstractC0682g
    /* renamed from: a */
    public int mo38519a() {
        return this.f1220d;
    }

    @Override // p005b.p006a.p007a.p029b.p056p.AbstractC0682g
    /* renamed from: a */
    public synchronized void mo38518a(AbstractC0682g abstractC0682g) {
        if (abstractC0682g == null) {
            throw new NullPointerException("Null values are not valid Status.");
        }
        if (this.f1223g == null) {
            this.f1223g = new ArrayList();
        }
        this.f1223g.add(abstractC0682g);
    }

    @Override // p005b.p006a.p007a.p029b.p056p.AbstractC0682g
    /* renamed from: b */
    public synchronized int mo38517b() {
        int i;
        int i2 = this.f1220d;
        Iterator<AbstractC0682g> mo38510h = mo38510h();
        i = i2;
        while (mo38510h.hasNext()) {
            int mo38517b = mo38510h.next().mo38517b();
            if (mo38517b > i) {
                i = mo38517b;
            }
        }
        return i;
    }

    @Override // p005b.p006a.p007a.p029b.p056p.AbstractC0682g
    /* renamed from: b */
    public synchronized boolean mo38516b(AbstractC0682g abstractC0682g) {
        return this.f1223g == null ? false : this.f1223g.remove(abstractC0682g);
    }

    @Override // p005b.p006a.p007a.p029b.p056p.AbstractC0682g
    /* renamed from: c */
    public Object mo38515c() {
        return this.f1222f;
    }

    @Override // p005b.p006a.p007a.p029b.p056p.AbstractC0682g
    /* renamed from: d */
    public String mo38514d() {
        return this.f1221e;
    }

    @Override // p005b.p006a.p007a.p029b.p056p.AbstractC0682g
    /* renamed from: e */
    public Throwable mo38513e() {
        return this.f1224h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AbstractC0683h abstractC0683h = (AbstractC0683h) obj;
            if (this.f1220d != abstractC0683h.f1220d) {
                return false;
            }
            return this.f1221e == null ? abstractC0683h.f1221e == null : this.f1221e.equals(abstractC0683h.f1221e);
        }
        return false;
    }

    @Override // p005b.p006a.p007a.p029b.p056p.AbstractC0682g
    /* renamed from: f */
    public Long mo38512f() {
        return Long.valueOf(this.f1225i);
    }

    @Override // p005b.p006a.p007a.p029b.p056p.AbstractC0682g
    /* renamed from: g */
    public synchronized boolean mo38511g() {
        boolean z;
        if (this.f1223g != null) {
            if (this.f1223g.size() > 0) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    @Override // p005b.p006a.p007a.p029b.p056p.AbstractC0682g
    /* renamed from: h */
    public synchronized Iterator<AbstractC0682g> mo38510h() {
        return this.f1223g != null ? this.f1223g.iterator() : f1219j.iterator();
    }

    public int hashCode() {
        return (this.f1221e == null ? 0 : this.f1221e.hashCode()) + ((this.f1220d + 31) * 31);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        switch (mo38517b()) {
            case 0:
                stringBuffer.append("INFO");
                break;
            case 1:
                stringBuffer.append("WARN");
                break;
            case 2:
                stringBuffer.append("ERROR");
                break;
        }
        if (this.f1222f != null) {
            stringBuffer.append(" in ");
            stringBuffer.append(this.f1222f);
            stringBuffer.append(" -");
        }
        stringBuffer.append(" ");
        stringBuffer.append(this.f1221e);
        if (this.f1224h != null) {
            stringBuffer.append(" ");
            stringBuffer.append(this.f1224h);
        }
        return stringBuffer.toString();
    }
}
