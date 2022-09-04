package p005b.p006a.p007a.p029b.p034e;

import java.util.ArrayList;
import java.util.List;
/* renamed from: b.a.a.b.e.a */
/* loaded from: classes.dex */
public class C0423a<E> {

    /* renamed from: a */
    E[] f524a;

    /* renamed from: b */
    int f525b;

    /* renamed from: c */
    int f526c;

    /* renamed from: d */
    int f527d;

    /* renamed from: e */
    int f528e;

    public C0423a(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("The maxSize argument (" + i + ") is not a positive integer.");
        }
        m39346c(i);
    }

    public C0423a(C0423a<E> c0423a) {
        this.f528e = c0423a.f528e;
        this.f524a = (E[]) new Object[this.f528e];
        System.arraycopy(c0423a.f524a, 0, this.f524a, 0, this.f528e);
        this.f526c = c0423a.f526c;
        this.f525b = c0423a.f525b;
        this.f527d = c0423a.f527d;
    }

    /* renamed from: c */
    private void m39346c(int i) {
        this.f528e = i;
        this.f524a = (E[]) new Object[i];
        this.f525b = 0;
        this.f526c = 0;
        this.f527d = 0;
    }

    /* renamed from: a */
    public E m39351a(int i) {
        if (i < 0 || i >= this.f527d) {
            return null;
        }
        return this.f524a[(this.f525b + i) % this.f528e];
    }

    /* renamed from: a */
    public void m39352a() {
        m39346c(this.f528e);
    }

    /* renamed from: a */
    public void m39350a(E e) {
        this.f524a[this.f526c] = e;
        int i = this.f526c + 1;
        this.f526c = i;
        if (i == this.f528e) {
            this.f526c = 0;
        }
        if (this.f527d < this.f528e) {
            this.f527d++;
            return;
        }
        int i2 = this.f525b + 1;
        this.f525b = i2;
        if (i2 != this.f528e) {
            return;
        }
        this.f525b = 0;
    }

    /* renamed from: b */
    public int m39349b() {
        return this.f528e;
    }

    /* renamed from: b */
    public void m39348b(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Negative array size [" + i + "] not allowed.");
        }
        if (i == this.f527d) {
            return;
        }
        E[] eArr = (E[]) new Object[i];
        int i2 = i < this.f527d ? i : this.f527d;
        for (int i3 = 0; i3 < i2; i3++) {
            eArr[i3] = this.f524a[this.f525b];
            this.f524a[this.f525b] = null;
            int i4 = this.f525b + 1;
            this.f525b = i4;
            if (i4 == this.f527d) {
                this.f525b = 0;
            }
        }
        this.f524a = eArr;
        this.f525b = 0;
        this.f527d = i2;
        this.f528e = i;
        if (i2 == i) {
            this.f526c = 0;
        } else {
            this.f526c = i2;
        }
    }

    /* renamed from: c */
    public E m39347c() {
        if (this.f527d > 0) {
            this.f527d--;
            E e = this.f524a[this.f525b];
            this.f524a[this.f525b] = null;
            int i = this.f525b + 1;
            this.f525b = i;
            if (i != this.f528e) {
                return e;
            }
            this.f525b = 0;
            return e;
        }
        return null;
    }

    /* renamed from: d */
    public List<E> m39345d() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < m39344e(); i++) {
            arrayList.add(m39351a(i));
        }
        return arrayList;
    }

    /* renamed from: e */
    public int m39344e() {
        return this.f527d;
    }
}
