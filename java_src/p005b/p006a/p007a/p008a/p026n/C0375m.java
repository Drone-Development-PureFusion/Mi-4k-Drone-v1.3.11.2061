package p005b.p006a.p007a.p008a.p026n;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;
import org.p356d.AbstractC11759f;
import org.p356d.p358b.C11737f;
import p005b.p006a.p007a.p008a.C0281d;
/* renamed from: b.a.a.a.n.m */
/* loaded from: classes.dex */
public class C0375m implements AbstractC0366d, Serializable {

    /* renamed from: a */
    private static final int f390a = -1;

    /* renamed from: b */
    private static final String f391b = "NULL_ARGUMENT_ARRAY_ELEMENT";
    private static final long serialVersionUID = 6553722650255690312L;

    /* renamed from: c */
    private String f392c;

    /* renamed from: d */
    private String f393d;

    /* renamed from: e */
    private C0372j f394e;

    /* renamed from: f */
    private transient C0281d f395f;

    /* renamed from: g */
    private String f396g;

    /* renamed from: h */
    private transient String f397h;

    /* renamed from: i */
    private transient Object[] f398i;

    /* renamed from: j */
    private C0381s f399j;

    /* renamed from: k */
    private StackTraceElement[] f400k;

    /* renamed from: l */
    private AbstractC11759f f401l;

    /* renamed from: m */
    private Map<String, String> f402m;

    /* renamed from: n */
    private long f403n;

    /* renamed from: a */
    public static C0375m m39539a(AbstractC0366d abstractC0366d) {
        C0375m c0375m = new C0375m();
        c0375m.f393d = abstractC0366d.mo39534f();
        c0375m.f394e = abstractC0366d.mo39533g();
        c0375m.f392c = abstractC0366d.mo39540a();
        c0375m.f395f = abstractC0366d.mo39538b();
        c0375m.f396g = abstractC0366d.mo39537c();
        c0375m.f398i = abstractC0366d.mo39536d();
        c0375m.f401l = abstractC0366d.mo39529k();
        c0375m.f402m = abstractC0366d.mo39528l();
        c0375m.f403n = abstractC0366d.mo39526n();
        c0375m.f399j = C0381s.m39489a(abstractC0366d.mo39532h());
        if (abstractC0366d.mo39530j()) {
            c0375m.f400k = abstractC0366d.mo39531i();
        }
        return c0375m;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.f395f = C0281d.m39803a(objectInputStream.readInt());
        int readInt = objectInputStream.readInt();
        if (readInt != -1) {
            this.f398i = new String[readInt];
            for (int i = 0; i < readInt; i++) {
                Object readObject = objectInputStream.readObject();
                if (!f391b.equals(readObject)) {
                    this.f398i[i] = readObject;
                }
            }
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.f395f.f217v);
        if (this.f398i == null) {
            objectOutputStream.writeInt(-1);
            return;
        }
        objectOutputStream.writeInt(this.f398i.length);
        for (int i = 0; i < this.f398i.length; i++) {
            if (this.f398i[i] != null) {
                objectOutputStream.writeObject(this.f398i[i].toString());
            } else {
                objectOutputStream.writeObject(f391b);
            }
        }
    }

    @Override // p005b.p006a.p007a.p008a.p026n.AbstractC0366d
    /* renamed from: a */
    public String mo39540a() {
        return this.f392c;
    }

    @Override // p005b.p006a.p007a.p008a.p026n.AbstractC0366d
    /* renamed from: b */
    public C0281d mo39538b() {
        return this.f395f;
    }

    @Override // p005b.p006a.p007a.p008a.p026n.AbstractC0366d
    /* renamed from: c */
    public String mo39537c() {
        return this.f396g;
    }

    @Override // p005b.p006a.p007a.p008a.p026n.AbstractC0366d
    /* renamed from: d */
    public Object[] mo39536d() {
        return this.f398i;
    }

    @Override // p005b.p006a.p007a.p008a.p026n.AbstractC0366d
    /* renamed from: e */
    public String mo39535e() {
        if (this.f397h != null) {
            return this.f397h;
        }
        if (this.f398i != null) {
            this.f397h = C11737f.m154a(this.f396g, this.f398i).m160a();
        } else {
            this.f397h = this.f396g;
        }
        return this.f397h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C0375m c0375m = (C0375m) obj;
            if (this.f396g == null) {
                if (c0375m.f396g != null) {
                    return false;
                }
            } else if (!this.f396g.equals(c0375m.f396g)) {
                return false;
            }
            if (this.f393d == null) {
                if (c0375m.f393d != null) {
                    return false;
                }
            } else if (!this.f393d.equals(c0375m.f393d)) {
                return false;
            }
            if (this.f392c == null) {
                if (c0375m.f392c != null) {
                    return false;
                }
            } else if (!this.f392c.equals(c0375m.f392c)) {
                return false;
            }
            if (this.f403n != c0375m.f403n) {
                return false;
            }
            if (this.f401l == null) {
                if (c0375m.f401l != null) {
                    return false;
                }
            } else if (!this.f401l.equals(c0375m.f401l)) {
                return false;
            }
            return this.f402m == null ? c0375m.f402m == null : this.f402m.equals(c0375m.f402m);
        }
        return false;
    }

    @Override // p005b.p006a.p007a.p008a.p026n.AbstractC0366d
    /* renamed from: f */
    public String mo39534f() {
        return this.f393d;
    }

    @Override // p005b.p006a.p007a.p008a.p026n.AbstractC0366d
    /* renamed from: g */
    public C0372j mo39533g() {
        return this.f394e;
    }

    @Override // p005b.p006a.p007a.p008a.p026n.AbstractC0366d
    /* renamed from: h */
    public AbstractC0367e mo39532h() {
        return this.f399j;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.f396g == null ? 0 : this.f396g.hashCode()) + 31) * 31;
        if (this.f392c != null) {
            i = this.f392c.hashCode();
        }
        return ((hashCode + i) * 31) + ((int) (this.f403n ^ (this.f403n >>> 32)));
    }

    @Override // p005b.p006a.p007a.p008a.p026n.AbstractC0366d
    /* renamed from: i */
    public StackTraceElement[] mo39531i() {
        return this.f400k;
    }

    @Override // p005b.p006a.p007a.p008a.p026n.AbstractC0366d
    /* renamed from: j */
    public boolean mo39530j() {
        return this.f400k != null;
    }

    @Override // p005b.p006a.p007a.p008a.p026n.AbstractC0366d
    /* renamed from: k */
    public AbstractC11759f mo39529k() {
        return this.f401l;
    }

    @Override // p005b.p006a.p007a.p008a.p026n.AbstractC0366d
    /* renamed from: l */
    public Map<String, String> mo39528l() {
        return this.f402m;
    }

    @Override // p005b.p006a.p007a.p008a.p026n.AbstractC0366d
    /* renamed from: m */
    public Map<String, String> mo39527m() {
        return this.f402m;
    }

    @Override // p005b.p006a.p007a.p008a.p026n.AbstractC0366d
    /* renamed from: n */
    public long mo39526n() {
        return this.f403n;
    }

    @Override // p005b.p006a.p007a.p008a.p026n.AbstractC0366d, p005b.p006a.p007a.p029b.p055o.AbstractC0665i
    /* renamed from: o */
    public void mo38531o() {
    }

    /* renamed from: p */
    public long m39525p() {
        return this.f394e.m39557c();
    }

    /* renamed from: q */
    public C0372j m39524q() {
        return this.f394e;
    }
}
