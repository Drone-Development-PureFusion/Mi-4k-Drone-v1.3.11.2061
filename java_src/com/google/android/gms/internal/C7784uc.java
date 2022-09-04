package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
@aaa
/* renamed from: com.google.android.gms.internal.uc */
/* loaded from: classes.dex */
public class C7784uc {

    /* renamed from: a */
    private final Collection<AbstractC7779ub> f25708a = new ArrayList();

    /* renamed from: b */
    private final Collection<AbstractC7779ub<String>> f25709b = new ArrayList();

    /* renamed from: c */
    private final Collection<AbstractC7779ub<String>> f25710c = new ArrayList();

    /* renamed from: a */
    public List<String> m13480a() {
        ArrayList arrayList = new ArrayList();
        for (AbstractC7779ub<String> abstractC7779ub : this.f25709b) {
            String m13486c = abstractC7779ub.m13486c();
            if (m13486c != null) {
                arrayList.add(m13486c);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void m13479a(AbstractC7779ub abstractC7779ub) {
        this.f25708a.add(abstractC7779ub);
    }

    /* renamed from: b */
    public List<String> m13478b() {
        List<String> m13480a = m13480a();
        for (AbstractC7779ub<String> abstractC7779ub : this.f25710c) {
            String m13486c = abstractC7779ub.m13486c();
            if (m13486c != null) {
                m13480a.add(m13486c);
            }
        }
        return m13480a;
    }

    /* renamed from: b */
    public void m13477b(AbstractC7779ub<String> abstractC7779ub) {
        this.f25709b.add(abstractC7779ub);
    }

    /* renamed from: c */
    public void m13476c(AbstractC7779ub<String> abstractC7779ub) {
        this.f25710c.add(abstractC7779ub);
    }
}
