package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.C3779u;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
@aaa
/* renamed from: com.google.android.gms.internal.wh */
/* loaded from: classes.dex */
public class C7902wh implements Iterable<C7900wg> {

    /* renamed from: a */
    private final List<C7900wg> f26044a = new LinkedList();

    /* renamed from: c */
    private C7900wg m13266c(acy acyVar) {
        Iterator<C7900wg> it2 = C3779u.m26898B().iterator();
        while (it2.hasNext()) {
            C7900wg next = it2.next();
            if (next.f26040a == acyVar) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    public int m13271a() {
        return this.f26044a.size();
    }

    /* renamed from: a */
    public void m13269a(C7900wg c7900wg) {
        this.f26044a.add(c7900wg);
    }

    /* renamed from: a */
    public boolean m13270a(acy acyVar) {
        C7900wg m13266c = m13266c(acyVar);
        if (m13266c != null) {
            m13266c.f26041b.mo13256a();
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void m13267b(C7900wg c7900wg) {
        this.f26044a.remove(c7900wg);
    }

    /* renamed from: b */
    public boolean m13268b(acy acyVar) {
        return m13266c(acyVar) != null;
    }

    @Override // java.lang.Iterable
    public Iterator<C7900wg> iterator() {
        return this.f26044a.iterator();
    }
}
