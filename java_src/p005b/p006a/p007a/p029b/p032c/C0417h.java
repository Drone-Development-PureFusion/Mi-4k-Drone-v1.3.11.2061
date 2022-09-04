package p005b.p006a.p007a.p029b.p032c;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
/* renamed from: b.a.a.b.c.h */
/* loaded from: classes.dex */
public class C0417h<E> extends AbstractC0413d<E> {

    /* renamed from: c */
    public static final int f505c = 1853421169;

    /* renamed from: d */
    public static final int f506d = 640373619;

    /* renamed from: f */
    private int f508f = 100;

    /* renamed from: e */
    List<E> f507e = new ArrayList(this.f508f);

    @Override // p005b.p006a.p007a.p029b.p032c.AbstractC0412c
    /* renamed from: a */
    public void mo39373a() {
        m39368b();
    }

    /* renamed from: a */
    void m39372a(ByteArrayOutputStream byteArrayOutputStream, int i) {
        C0410a.m39395a(byteArrayOutputStream, (int) f505c);
        C0410a.m39395a(byteArrayOutputStream, i);
        C0410a.m39395a(byteArrayOutputStream, 0);
        C0410a.m39395a(byteArrayOutputStream, 1853421169 ^ i);
    }

    @Override // p005b.p006a.p007a.p029b.p032c.AbstractC0413d, p005b.p006a.p007a.p029b.p032c.AbstractC0412c
    /* renamed from: a */
    public void mo39371a(OutputStream outputStream) {
        super.mo39371a(outputStream);
        this.f507e.clear();
    }

    @Override // p005b.p006a.p007a.p029b.p032c.AbstractC0412c
    /* renamed from: a */
    public void mo39370a(E e) {
        this.f507e.add(e);
        if (this.f507e.size() == this.f508f) {
            m39368b();
        }
    }

    /* renamed from: a */
    void m39369a(byte[] bArr) {
        C0410a.m39391a(bArr, 8, bArr.length - 8);
    }

    /* renamed from: b */
    void m39368b() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(10000);
        int size = this.f507e.size();
        m39372a(byteArrayOutputStream, size);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        for (E e : this.f507e) {
            objectOutputStream.writeObject(e);
        }
        this.f507e.clear();
        objectOutputStream.flush();
        m39367b(byteArrayOutputStream, size);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        objectOutputStream.close();
        m39369a(byteArray);
        this.f498b.write(byteArray);
    }

    /* renamed from: b */
    void m39367b(ByteArrayOutputStream byteArrayOutputStream, int i) {
        C0410a.m39395a(byteArrayOutputStream, (int) f506d);
        C0410a.m39395a(byteArrayOutputStream, 640373619 ^ i);
    }
}
