package com.fimi.soul.module.flyplannermedia;

import java.util.ArrayList;
import java.util.List;
/* renamed from: com.fimi.soul.module.flyplannermedia.a */
/* loaded from: classes.dex */
public class C2780a<T> {

    /* renamed from: a */
    private int f9680a;

    /* renamed from: b */
    private int f9681b;

    /* renamed from: c */
    private int f9682c;

    /* renamed from: d */
    private List<List<T>> f9683d;

    /* renamed from: e */
    private AbstractC2781a<T> f9684e;

    /* renamed from: com.fimi.soul.module.flyplannermedia.a$a */
    /* loaded from: classes.dex */
    public interface AbstractC2781a<T> {
        /* renamed from: a */
        boolean mo30303a(T t);
    }

    public C2780a() {
        this.f9680a = 12;
        this.f9681b = 0;
        this.f9682c = 0;
        this.f9683d = null;
    }

    public C2780a(List<T> list) {
        this.f9680a = 12;
        this.f9681b = 0;
        this.f9682c = 0;
        this.f9683d = null;
        m30308a(list);
    }

    public C2780a(List<T> list, int i) {
        this.f9680a = 12;
        this.f9681b = 0;
        this.f9682c = 0;
        this.f9683d = null;
        this.f9680a = i;
        m30308a(list);
    }

    /* renamed from: a */
    private void m30308a(List<T> list) {
        this.f9683d = new ArrayList();
        int size = ((list.size() - 1) / this.f9680a) + 1;
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < this.f9680a; i2++) {
                int i3 = (this.f9680a * i) + i2;
                if (i3 < list.size()) {
                    arrayList.add(list.get(i3));
                }
            }
            this.f9683d.add(arrayList);
        }
    }

    /* renamed from: a */
    public int m30310a() {
        return this.f9680a;
    }

    /* renamed from: a */
    public void m30309a(AbstractC2781a<T> abstractC2781a) {
        this.f9684e = abstractC2781a;
    }

    /* renamed from: b */
    public boolean m30307b() {
        if (this.f9684e == null || this.f9682c >= this.f9680a || this.f9681b >= this.f9683d.size() || this.f9682c >= this.f9683d.get(this.f9681b).size()) {
            return false;
        }
        T t = this.f9683d.get(this.f9681b).get(this.f9682c);
        this.f9682c++;
        this.f9684e.mo30303a(t);
        return true;
    }

    /* renamed from: c */
    public int m30306c() {
        return this.f9682c;
    }

    /* renamed from: d */
    public void m30305d() {
        this.f9681b = 0;
        this.f9682c = 0;
    }

    /* renamed from: e */
    public boolean m30304e() {
        if (this.f9681b >= this.f9683d.size() || this.f9682c < this.f9683d.get(this.f9681b).size()) {
            return false;
        }
        this.f9681b++;
        this.f9682c = 0;
        return true;
    }
}
