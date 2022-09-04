package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC7068gz;
import com.google.android.gms.internal.AbstractC7078he;
import com.google.android.gms.internal.AbstractC7344lh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.kw */
/* loaded from: classes2.dex */
public class C7322kw implements AbstractC7344lh {

    /* renamed from: a */
    public static Comparator<C7319kv> f24490a;

    /* renamed from: b */
    static final /* synthetic */ boolean f24491b;

    /* renamed from: c */
    private final AbstractC7068gz<C7319kv, AbstractC7344lh> f24492c;

    /* renamed from: e */
    private final AbstractC7344lh f24493e;

    /* renamed from: f */
    private String f24494f;

    /* renamed from: com.google.android.gms.internal.kw$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC7325a extends AbstractC7078he.AbstractC7080b<C7319kv, AbstractC7344lh> {
        /* JADX WARN: Can't rename method to resolve collision */
        /* renamed from: a */
        public abstract void mo14802a(C7319kv c7319kv, AbstractC7344lh abstractC7344lh);

        @Override // com.google.android.gms.internal.AbstractC7078he.AbstractC7080b
        /* renamed from: b */
        public void mo14811a(C7319kv c7319kv, AbstractC7344lh abstractC7344lh) {
            mo14802a(c7319kv, abstractC7344lh);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.kw$b */
    /* loaded from: classes2.dex */
    public static class C7326b implements Iterator<C7343lg> {

        /* renamed from: a */
        private final Iterator<Map.Entry<C7319kv, AbstractC7344lh>> f24498a;

        public C7326b(Iterator<Map.Entry<C7319kv, AbstractC7344lh>> it2) {
            this.f24498a = it2;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public C7343lg next() {
            Map.Entry<C7319kv, AbstractC7344lh> next = this.f24498a.next();
            return new C7343lg(next.getKey(), next.getValue());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f24498a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f24498a.remove();
        }
    }

    static {
        f24491b = !C7322kw.class.desiredAssertionStatus();
        f24490a = new Comparator<C7319kv>() { // from class: com.google.android.gms.internal.kw.1
            @Override // java.util.Comparator
            /* renamed from: a */
            public int compare(C7319kv c7319kv, C7319kv c7319kv2) {
                return c7319kv.compareTo(c7319kv2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C7322kw() {
        this.f24494f = null;
        this.f24492c = AbstractC7068gz.C7069a.m15661a(f24490a);
        this.f24493e = C7350ll.m14730a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C7322kw(AbstractC7068gz<C7319kv, AbstractC7344lh> abstractC7068gz, AbstractC7344lh abstractC7344lh) {
        this.f24494f = null;
        if (!abstractC7068gz.mo15614d() || abstractC7344lh.mo14739b()) {
            this.f24493e = abstractC7344lh;
            this.f24492c = abstractC7068gz;
            return;
        }
        throw new IllegalArgumentException("Can't create empty ChildrenNode with priority!");
    }

    /* renamed from: a */
    private static void m14817a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(" ");
        }
    }

    /* renamed from: b */
    private void m14816b(StringBuilder sb, int i) {
        if (this.f24492c.mo15614d() && this.f24493e.mo14739b()) {
            sb.append("{ }");
            return;
        }
        sb.append("{\n");
        Iterator<Map.Entry<C7319kv, AbstractC7344lh>> it2 = this.f24492c.iterator();
        while (it2.hasNext()) {
            Map.Entry<C7319kv, AbstractC7344lh> next = it2.next();
            m14817a(sb, i + 2);
            sb.append(next.getKey().m14823e());
            sb.append("=");
            if (next.getValue() instanceof C7322kw) {
                ((C7322kw) next.getValue()).m14816b(sb, i + 2);
            } else {
                sb.append(next.getValue().toString());
            }
            sb.append("\n");
        }
        if (!this.f24493e.mo14739b()) {
            m14817a(sb, i + 2);
            sb.append(".priority=");
            sb.append(this.f24493e.toString());
            sb.append("\n");
        }
        m14817a(sb, i);
        sb.append("}");
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(AbstractC7344lh abstractC7344lh) {
        if (mo14739b()) {
            return abstractC7344lh.mo14739b() ? 0 : -1;
        }
        if (!abstractC7344lh.mo14743e() && !abstractC7344lh.mo14739b()) {
            return abstractC7344lh == AbstractC7344lh.f24536d ? -1 : 0;
        }
        return 1;
    }

    @Override // com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: a */
    public AbstractC7344lh mo14750a(C7160ij c7160ij) {
        C7319kv m15363d = c7160ij.m15363d();
        return m15363d == null ? this : mo14738c(m15363d).mo14750a(c7160ij.m15361e());
    }

    @Override // com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: a */
    public AbstractC7344lh mo14749a(C7160ij c7160ij, AbstractC7344lh abstractC7344lh) {
        C7319kv m15363d = c7160ij.m15363d();
        if (m15363d == null) {
            return abstractC7344lh;
        }
        if (!m15363d.m14822f()) {
            return mo14748a(m15363d, mo14738c(m15363d).mo14749a(c7160ij.m15361e(), abstractC7344lh));
        }
        if (!f24491b && !C7350ll.m14729a(abstractC7344lh)) {
            throw new AssertionError();
        }
        return mo14705b(abstractC7344lh);
    }

    @Override // com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: a */
    public AbstractC7344lh mo14748a(C7319kv c7319kv, AbstractC7344lh abstractC7344lh) {
        if (c7319kv.m14822f()) {
            return mo14705b(abstractC7344lh);
        }
        AbstractC7068gz<C7319kv, AbstractC7344lh> abstractC7068gz = this.f24492c;
        if (abstractC7068gz.mo15622a((AbstractC7068gz<C7319kv, AbstractC7344lh>) c7319kv)) {
            abstractC7068gz = abstractC7068gz.mo15615c(c7319kv);
        }
        if (!abstractC7344lh.mo14739b()) {
            abstractC7068gz = abstractC7068gz.mo15621a(c7319kv, abstractC7344lh);
        }
        return abstractC7068gz.mo15614d() ? C7335la.m14778j() : new C7322kw(abstractC7068gz, this.f24493e);
    }

    @Override // com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: a */
    public Object mo14710a() {
        return mo14747a(false);
    }

    @Override // com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: a */
    public Object mo14747a(boolean z) {
        boolean z2;
        if (mo14739b()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator<Map.Entry<C7319kv, AbstractC7344lh>> it2 = this.f24492c.iterator();
        boolean z3 = true;
        int i = 0;
        int i2 = 0;
        while (it2.hasNext()) {
            Map.Entry<C7319kv, AbstractC7344lh> next = it2.next();
            String m14823e = next.getKey().m14823e();
            hashMap.put(m14823e, next.getValue().mo14747a(z));
            i2++;
            if (z3) {
                if (m14823e.length() <= 1 || m14823e.charAt(0) != '0') {
                    Integer m14603d = C7392mk.m14603d(m14823e);
                    if (m14603d == null || m14603d.intValue() < 0) {
                        z2 = false;
                    } else if (m14603d.intValue() > i) {
                        i = m14603d.intValue();
                        z2 = z3;
                    }
                } else {
                    z2 = false;
                }
                z3 = z2;
                i = i;
            }
            z2 = z3;
            z3 = z2;
            i = i;
        }
        if (z || !z3 || i >= i2 * 2) {
            if (z && !this.f24493e.mo14739b()) {
                hashMap.put(".priority", this.f24493e.mo14710a());
            }
            return hashMap;
        }
        ArrayList arrayList = new ArrayList(i + 1);
        for (int i3 = 0; i3 <= i; i3++) {
            arrayList.add(hashMap.get(new StringBuilder(11).append(i3).toString()));
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: a */
    public String mo14708a(AbstractC7344lh.EnumC7346a enumC7346a) {
        if (enumC7346a != AbstractC7344lh.EnumC7346a.V1) {
            throw new IllegalArgumentException("Hashes on children nodes only supported for V1");
        }
        StringBuilder sb = new StringBuilder();
        if (!this.f24493e.mo14739b()) {
            sb.append("priority:");
            sb.append(this.f24493e.mo14708a(AbstractC7344lh.EnumC7346a.V1));
            sb.append(":");
        }
        ArrayList<C7343lg> arrayList = new ArrayList();
        Iterator<C7343lg> it2 = iterator();
        boolean z = false;
        while (it2.hasNext()) {
            C7343lg next = it2.next();
            arrayList.add(next);
            z = z || !next.m14751d().mo14737f().mo14739b();
        }
        if (z) {
            Collections.sort(arrayList, C7349lk.m14731d());
        }
        for (C7343lg c7343lg : arrayList) {
            String mo14744d = c7343lg.m14751d().mo14744d();
            if (!mo14744d.equals("")) {
                sb.append(":");
                sb.append(c7343lg.m14752c().m14823e());
                sb.append(":");
                sb.append(mo14744d);
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public void m14819a(AbstractC7325a abstractC7325a) {
        m14818a(abstractC7325a, false);
    }

    /* renamed from: a */
    public void m14818a(final AbstractC7325a abstractC7325a, boolean z) {
        if (!z || mo14737f().mo14739b()) {
            this.f24492c.mo15623a(abstractC7325a);
        } else {
            this.f24492c.mo15623a(new AbstractC7078he.AbstractC7080b<C7319kv, AbstractC7344lh>() { // from class: com.google.android.gms.internal.kw.2

                /* renamed from: a */
                boolean f24495a = false;

                @Override // com.google.android.gms.internal.AbstractC7078he.AbstractC7080b
                /* renamed from: a  reason: avoid collision after fix types in other method */
                public void mo14811a(C7319kv c7319kv, AbstractC7344lh abstractC7344lh) {
                    if (!this.f24495a && c7319kv.compareTo(C7319kv.m14825c()) > 0) {
                        this.f24495a = true;
                        abstractC7325a.mo14802a(C7319kv.m14825c(), C7322kw.this.mo14737f());
                    }
                    abstractC7325a.mo14802a(c7319kv, abstractC7344lh);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: a */
    public boolean mo14741a(C7319kv c7319kv) {
        return !mo14738c(c7319kv).mo14739b();
    }

    @Override // com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: b */
    public C7319kv mo14746b(C7319kv c7319kv) {
        return this.f24492c.mo15613d(c7319kv);
    }

    @Override // com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: b */
    public AbstractC7344lh mo14705b(AbstractC7344lh abstractC7344lh) {
        return this.f24492c.mo15614d() ? C7335la.m14778j() : new C7322kw(this.f24492c, abstractC7344lh);
    }

    @Override // com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: b */
    public boolean mo14739b() {
        return this.f24492c.mo15614d();
    }

    @Override // com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: c */
    public int mo14745c() {
        return this.f24492c.mo15616c();
    }

    @Override // com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: c */
    public AbstractC7344lh mo14738c(C7319kv c7319kv) {
        return (!c7319kv.m14822f() || this.f24493e.mo14739b()) ? this.f24492c.mo15622a((AbstractC7068gz<C7319kv, AbstractC7344lh>) c7319kv) ? this.f24492c.mo15617b(c7319kv) : C7335la.m14778j() : this.f24493e;
    }

    @Override // com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: d */
    public String mo14744d() {
        if (this.f24494f == null) {
            String mo14708a = mo14708a(AbstractC7344lh.EnumC7346a.V1);
            this.f24494f = mo14708a.isEmpty() ? "" : C7392mk.m14605b(mo14708a);
        }
        return this.f24494f;
    }

    @Override // com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: e */
    public boolean mo14743e() {
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7322kw)) {
            return false;
        }
        C7322kw c7322kw = (C7322kw) obj;
        if (mo14737f().equals(c7322kw.mo14737f()) && this.f24492c.mo15616c() == c7322kw.f24492c.mo15616c()) {
            Iterator<Map.Entry<C7319kv, AbstractC7344lh>> it2 = this.f24492c.iterator();
            Iterator<Map.Entry<C7319kv, AbstractC7344lh>> it3 = c7322kw.f24492c.iterator();
            while (it2.hasNext() && it3.hasNext()) {
                Map.Entry<C7319kv, AbstractC7344lh> next = it2.next();
                Map.Entry<C7319kv, AbstractC7344lh> next2 = it3.next();
                if (next.getKey().equals(next2.getKey()) || !next.getValue().equals(next2.getValue())) {
                    return false;
                }
                while (it2.hasNext()) {
                    Map.Entry<C7319kv, AbstractC7344lh> next3 = it2.next();
                    Map.Entry<C7319kv, AbstractC7344lh> next22 = it3.next();
                    if (next3.getKey().equals(next22.getKey())) {
                    }
                    return false;
                }
            }
            if (!it2.hasNext() && !it3.hasNext()) {
                return true;
            }
            throw new IllegalStateException("Something went wrong internally.");
        }
        return false;
    }

    @Override // com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: f */
    public AbstractC7344lh mo14737f() {
        return this.f24493e;
    }

    /* renamed from: g */
    public C7319kv m14815g() {
        return this.f24492c.mo15624a();
    }

    /* renamed from: h */
    public C7319kv m14814h() {
        return this.f24492c.mo15618b();
    }

    public int hashCode() {
        int i = 0;
        Iterator<C7343lg> it2 = iterator();
        while (true) {
            int i2 = i;
            if (it2.hasNext()) {
                C7343lg next = it2.next();
                i = next.m14751d().hashCode() + (((i2 * 31) + next.m14752c().hashCode()) * 17);
            } else {
                return i2;
            }
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: i */
    public Iterator<C7343lg> mo14742i() {
        return new C7326b(this.f24492c.mo15612e());
    }

    @Override // java.lang.Iterable
    public Iterator<C7343lg> iterator() {
        return new C7326b(this.f24492c.iterator());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        m14816b(sb, 0);
        return sb.toString();
    }
}
