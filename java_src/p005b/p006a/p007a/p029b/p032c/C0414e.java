package p005b.p006a.p007a.p029b.p032c;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
/* renamed from: b.a.a.b.c.e */
/* loaded from: classes.dex */
public class C0414e<E> extends InputStream {

    /* renamed from: a */
    C0416g f499a;

    /* renamed from: b */
    List<E> f500b = new ArrayList();

    /* renamed from: c */
    int f501c = 0;

    C0414e(InputStream inputStream) {
        this.f499a = new C0416g(inputStream);
    }

    /* renamed from: d */
    private void m39384d() {
        this.f501c = 0;
        this.f500b.clear();
    }

    /* renamed from: a */
    public E m39390a() {
        E m39387b = m39387b();
        if (m39387b != null) {
            return m39387b;
        }
        m39384d();
        int m39385c = m39385c();
        if (m39385c == -1) {
            return null;
        }
        m39386b(m39385c);
        m39389a(m39385c);
        return m39387b();
    }

    /* renamed from: a */
    E m39388a(ObjectInputStream objectInputStream) {
        E e;
        ClassNotFoundException e2;
        try {
            e = (E) objectInputStream.readObject();
            try {
                this.f500b.add(e);
            } catch (ClassNotFoundException e3) {
                e2 = e3;
                e2.printStackTrace();
                return e;
            }
        } catch (ClassNotFoundException e4) {
            e = null;
            e2 = e4;
        }
        return e;
    }

    /* renamed from: a */
    void m39389a(int i) {
        byte[] bArr = new byte[8];
        if (this.f499a.read(bArr) == -1) {
            throw new IllegalStateException("Looks like a corrupt stream");
        }
        if (C0410a.m39392a(bArr, 0) != 640373619) {
            throw new IllegalStateException("Looks like a corrupt stream");
        }
        if (C0410a.m39392a(bArr, 4) == (640373619 ^ i)) {
            return;
        }
        throw new IllegalStateException("Invalid checksum");
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f499a.available();
    }

    /* renamed from: b */
    E m39387b() {
        if (this.f501c >= this.f500b.size()) {
            return null;
        }
        List<E> list = this.f500b;
        int i = this.f501c;
        this.f501c = i + 1;
        return list.get(i);
    }

    /* renamed from: b */
    void m39386b(int i) {
        ArrayList arrayList = new ArrayList(i);
        ObjectInputStream objectInputStream = new ObjectInputStream(this.f499a);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(m39388a(objectInputStream));
        }
        objectInputStream.close();
    }

    /* renamed from: c */
    int m39385c() {
        int i = -1;
        byte[] bArr = new byte[16];
        if (this.f499a.read(bArr) != -1) {
            if (C0410a.m39392a(bArr, 0) != 1853421169) {
                throw new IllegalStateException("Does not look like data created by ObjectStreamEncoder");
            }
            i = C0410a.m39392a(bArr, 4);
            if (C0410a.m39392a(bArr, 12) != (1853421169 ^ i)) {
                throw new IllegalStateException("Invalid checksum");
            }
        }
        return i;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f499a.m39374a();
    }

    @Override // java.io.InputStream
    public int read() {
        throw new UnsupportedOperationException("Only the readEvent method is supported.");
    }
}
