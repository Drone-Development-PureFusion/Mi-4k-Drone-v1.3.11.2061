package it.p273a.p274a.p276b;

import it.p273a.p274a.AbstractC10881t;
import java.util.ArrayList;
/* renamed from: it.a.a.b.b */
/* loaded from: classes.dex */
public class C10858b implements AbstractC10881t {

    /* renamed from: a */
    private ArrayList f34809a = new ArrayList();

    public C10858b() {
    }

    public C10858b(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof String) {
                m3027b((String) obj);
            }
        }
    }

    public C10858b(String[] strArr) {
        for (String str : strArr) {
            m3027b(str);
        }
    }

    @Override // it.p273a.p274a.AbstractC10881t
    /* renamed from: a */
    public boolean mo2979a(String str) {
        boolean contains;
        synchronized (this.f34809a) {
            contains = this.f34809a.contains(str);
        }
        return contains;
    }

    /* renamed from: b */
    public void m3027b(String str) {
        synchronized (this.f34809a) {
            this.f34809a.add(str.toLowerCase());
        }
    }

    /* renamed from: b */
    public String[] m3028b() {
        String[] strArr;
        synchronized (this.f34809a) {
            int size = this.f34809a.size();
            strArr = new String[size];
            for (int i = 0; i < size; i++) {
                strArr[i] = (String) this.f34809a.get(i);
            }
        }
        return strArr;
    }

    /* renamed from: c */
    public void m3026c(String str) {
        synchronized (this.f34809a) {
            this.f34809a.remove(str.toLowerCase());
        }
    }
}
