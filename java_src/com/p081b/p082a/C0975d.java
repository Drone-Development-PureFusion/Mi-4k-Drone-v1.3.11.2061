package com.p081b.p082a;

import android.view.animation.Interpolator;
import com.p081b.p082a.AbstractC0971a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* renamed from: com.b.a.d */
/* loaded from: classes.dex */
public final class C0975d extends AbstractC0971a {

    /* renamed from: c */
    private ArrayList<AbstractC0971a> f2192c = new ArrayList<>();

    /* renamed from: d */
    private HashMap<AbstractC0971a, C0981e> f2193d = new HashMap<>();

    /* renamed from: e */
    private ArrayList<C0981e> f2194e = new ArrayList<>();

    /* renamed from: f */
    private ArrayList<C0981e> f2195f = new ArrayList<>();

    /* renamed from: g */
    private boolean f2196g = true;

    /* renamed from: h */
    private C0977a f2197h = null;

    /* renamed from: b */
    boolean f2191b = false;

    /* renamed from: i */
    private boolean f2198i = false;

    /* renamed from: j */
    private long f2199j = 0;

    /* renamed from: k */
    private C1015q f2200k = null;

    /* renamed from: l */
    private long f2201l = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.b.a.d$a */
    /* loaded from: classes.dex */
    public class C0977a implements AbstractC0971a.AbstractC0972a {

        /* renamed from: b */
        private C0975d f2206b;

        C0977a(C0975d c0975d) {
            this.f2206b = c0975d;
        }

        @Override // com.p081b.p082a.AbstractC0971a.AbstractC0972a
        /* renamed from: a */
        public void mo36892a(AbstractC0971a abstractC0971a) {
        }

        @Override // com.p081b.p082a.AbstractC0971a.AbstractC0972a
        /* renamed from: b */
        public void mo36891b(AbstractC0971a abstractC0971a) {
            boolean z;
            abstractC0971a.m37251b(this);
            C0975d.this.f2192c.remove(abstractC0971a);
            ((C0981e) this.f2206b.f2193d.get(abstractC0971a)).f2221f = true;
            if (!C0975d.this.f2191b) {
                ArrayList arrayList = this.f2206b.f2195f;
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        z = true;
                        break;
                    } else if (!((C0981e) arrayList.get(i)).f2221f) {
                        z = false;
                        break;
                    } else {
                        i++;
                    }
                }
                if (!z) {
                    return;
                }
                if (C0975d.this.f2175a != null) {
                    ArrayList arrayList2 = (ArrayList) C0975d.this.f2175a.clone();
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((AbstractC0971a.AbstractC0972a) arrayList2.get(i2)).mo36891b(this.f2206b);
                    }
                }
                this.f2206b.f2198i = false;
            }
        }

        @Override // com.p081b.p082a.AbstractC0971a.AbstractC0972a
        /* renamed from: c */
        public void mo36890c(AbstractC0971a abstractC0971a) {
            if (C0975d.this.f2191b || C0975d.this.f2192c.size() != 0 || C0975d.this.f2175a == null) {
                return;
            }
            int size = C0975d.this.f2175a.size();
            for (int i = 0; i < size; i++) {
                C0975d.this.f2175a.get(i).mo36890c(this.f2206b);
            }
        }

        @Override // com.p081b.p082a.AbstractC0971a.AbstractC0972a
        /* renamed from: d */
        public void mo36889d(AbstractC0971a abstractC0971a) {
        }
    }

    /* renamed from: com.b.a.d$b */
    /* loaded from: classes.dex */
    public class C0978b {

        /* renamed from: b */
        private C0981e f2208b;

        C0978b(AbstractC0971a abstractC0971a) {
            this.f2208b = (C0981e) C0975d.this.f2193d.get(abstractC0971a);
            if (this.f2208b == null) {
                this.f2208b = new C0981e(abstractC0971a);
                C0975d.this.f2193d.put(abstractC0971a, this.f2208b);
                C0975d.this.f2194e.add(this.f2208b);
            }
        }

        /* renamed from: a */
        public C0978b m37229a(long j) {
            C1015q m37079b = C1015q.m37079b(0.0f, 1.0f);
            m37079b.mo37083b(j);
            m37226c(m37079b);
            return this;
        }

        /* renamed from: a */
        public C0978b m37228a(AbstractC0971a abstractC0971a) {
            C0981e c0981e = (C0981e) C0975d.this.f2193d.get(abstractC0971a);
            if (c0981e == null) {
                c0981e = new C0981e(abstractC0971a);
                C0975d.this.f2193d.put(abstractC0971a, c0981e);
                C0975d.this.f2194e.add(c0981e);
            }
            c0981e.m37223a(new C0979c(this.f2208b, 0));
            return this;
        }

        /* renamed from: b */
        public C0978b m37227b(AbstractC0971a abstractC0971a) {
            C0981e c0981e = (C0981e) C0975d.this.f2193d.get(abstractC0971a);
            if (c0981e == null) {
                c0981e = new C0981e(abstractC0971a);
                C0975d.this.f2193d.put(abstractC0971a, c0981e);
                C0975d.this.f2194e.add(c0981e);
            }
            c0981e.m37223a(new C0979c(this.f2208b, 1));
            return this;
        }

        /* renamed from: c */
        public C0978b m37226c(AbstractC0971a abstractC0971a) {
            C0981e c0981e = (C0981e) C0975d.this.f2193d.get(abstractC0971a);
            if (c0981e == null) {
                c0981e = new C0981e(abstractC0971a);
                C0975d.this.f2193d.put(abstractC0971a, c0981e);
                C0975d.this.f2194e.add(c0981e);
            }
            this.f2208b.m37223a(new C0979c(c0981e, 1));
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.b.a.d$c */
    /* loaded from: classes.dex */
    public static class C0979c {

        /* renamed from: a */
        static final int f2209a = 0;

        /* renamed from: b */
        static final int f2210b = 1;

        /* renamed from: c */
        public C0981e f2211c;

        /* renamed from: d */
        public int f2212d;

        public C0979c(C0981e c0981e, int i) {
            this.f2211c = c0981e;
            this.f2212d = i;
        }
    }

    /* renamed from: com.b.a.d$d */
    /* loaded from: classes.dex */
    private static class C0980d implements AbstractC0971a.AbstractC0972a {

        /* renamed from: a */
        private C0975d f2213a;

        /* renamed from: b */
        private C0981e f2214b;

        /* renamed from: c */
        private int f2215c;

        public C0980d(C0975d c0975d, C0981e c0981e, int i) {
            this.f2213a = c0975d;
            this.f2214b = c0981e;
            this.f2215c = i;
        }

        /* renamed from: e */
        private void m37225e(AbstractC0971a abstractC0971a) {
            C0979c c0979c;
            if (this.f2213a.f2191b) {
                return;
            }
            int size = this.f2214b.f2218c.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    c0979c = null;
                    break;
                }
                c0979c = this.f2214b.f2218c.get(i);
                if (c0979c.f2212d == this.f2215c && c0979c.f2211c.f2216a == abstractC0971a) {
                    abstractC0971a.m37251b(this);
                    break;
                }
                i++;
            }
            this.f2214b.f2218c.remove(c0979c);
            if (this.f2214b.f2218c.size() != 0) {
                return;
            }
            this.f2214b.f2216a.mo37101a();
            this.f2213a.f2192c.add(this.f2214b.f2216a);
        }

        @Override // com.p081b.p082a.AbstractC0971a.AbstractC0972a
        /* renamed from: a */
        public void mo36892a(AbstractC0971a abstractC0971a) {
            if (this.f2215c == 0) {
                m37225e(abstractC0971a);
            }
        }

        @Override // com.p081b.p082a.AbstractC0971a.AbstractC0972a
        /* renamed from: b */
        public void mo36891b(AbstractC0971a abstractC0971a) {
            if (this.f2215c == 1) {
                m37225e(abstractC0971a);
            }
        }

        @Override // com.p081b.p082a.AbstractC0971a.AbstractC0972a
        /* renamed from: c */
        public void mo36890c(AbstractC0971a abstractC0971a) {
        }

        @Override // com.p081b.p082a.AbstractC0971a.AbstractC0972a
        /* renamed from: d */
        public void mo36889d(AbstractC0971a abstractC0971a) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.b.a.d$e */
    /* loaded from: classes.dex */
    public static class C0981e implements Cloneable {

        /* renamed from: a */
        public AbstractC0971a f2216a;

        /* renamed from: b */
        public ArrayList<C0979c> f2217b = null;

        /* renamed from: c */
        public ArrayList<C0979c> f2218c = null;

        /* renamed from: d */
        public ArrayList<C0981e> f2219d = null;

        /* renamed from: e */
        public ArrayList<C0981e> f2220e = null;

        /* renamed from: f */
        public boolean f2221f = false;

        public C0981e(AbstractC0971a abstractC0971a) {
            this.f2216a = abstractC0971a;
        }

        /* renamed from: a */
        public C0981e clone() {
            try {
                C0981e c0981e = (C0981e) super.clone();
                c0981e.f2216a = this.f2216a.clone();
                return c0981e;
            } catch (CloneNotSupportedException e) {
                throw new AssertionError();
            }
        }

        /* renamed from: a */
        public void m37223a(C0979c c0979c) {
            if (this.f2217b == null) {
                this.f2217b = new ArrayList<>();
                this.f2219d = new ArrayList<>();
            }
            this.f2217b.add(c0979c);
            if (!this.f2219d.contains(c0979c.f2211c)) {
                this.f2219d.add(c0979c.f2211c);
            }
            C0981e c0981e = c0979c.f2211c;
            if (c0981e.f2220e == null) {
                c0981e.f2220e = new ArrayList<>();
            }
            c0981e.f2220e.add(this);
        }
    }

    /* renamed from: o */
    private void m37230o() {
        if (!this.f2196g) {
            int size = this.f2194e.size();
            for (int i = 0; i < size; i++) {
                C0981e c0981e = this.f2194e.get(i);
                if (c0981e.f2217b != null && c0981e.f2217b.size() > 0) {
                    int size2 = c0981e.f2217b.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        C0979c c0979c = c0981e.f2217b.get(i2);
                        if (c0981e.f2219d == null) {
                            c0981e.f2219d = new ArrayList<>();
                        }
                        if (!c0981e.f2219d.contains(c0979c.f2211c)) {
                            c0981e.f2219d.add(c0979c.f2211c);
                        }
                    }
                }
                c0981e.f2221f = false;
            }
            return;
        }
        this.f2195f.clear();
        ArrayList arrayList = new ArrayList();
        int size3 = this.f2194e.size();
        for (int i3 = 0; i3 < size3; i3++) {
            C0981e c0981e2 = this.f2194e.get(i3);
            if (c0981e2.f2217b == null || c0981e2.f2217b.size() == 0) {
                arrayList.add(c0981e2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        while (arrayList.size() > 0) {
            int size4 = arrayList.size();
            for (int i4 = 0; i4 < size4; i4++) {
                C0981e c0981e3 = (C0981e) arrayList.get(i4);
                this.f2195f.add(c0981e3);
                if (c0981e3.f2220e != null) {
                    int size5 = c0981e3.f2220e.size();
                    for (int i5 = 0; i5 < size5; i5++) {
                        C0981e c0981e4 = c0981e3.f2220e.get(i5);
                        c0981e4.f2219d.remove(c0981e3);
                        if (c0981e4.f2219d.size() == 0) {
                            arrayList2.add(c0981e4);
                        }
                    }
                }
            }
            arrayList.clear();
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        }
        this.f2196g = false;
        if (this.f2195f.size() == this.f2194e.size()) {
            return;
        }
        throw new IllegalStateException("Circular dependencies cannot exist in AnimatorSet");
    }

    /* renamed from: a */
    public C0978b m37243a(AbstractC0971a abstractC0971a) {
        if (abstractC0971a != null) {
            this.f2196g = true;
            return new C0978b(abstractC0971a);
        }
        return null;
    }

    @Override // com.p081b.p082a.AbstractC0971a
    /* renamed from: a */
    public void mo37101a() {
        this.f2191b = false;
        this.f2198i = true;
        m37230o();
        int size = this.f2195f.size();
        for (int i = 0; i < size; i++) {
            C0981e c0981e = this.f2195f.get(i);
            ArrayList<AbstractC0971a.AbstractC0972a> m37250h = c0981e.f2216a.m37250h();
            if (m37250h != null && m37250h.size() > 0) {
                Iterator it2 = new ArrayList(m37250h).iterator();
                while (it2.hasNext()) {
                    AbstractC0971a.AbstractC0972a abstractC0972a = (AbstractC0971a.AbstractC0972a) it2.next();
                    if ((abstractC0972a instanceof C0980d) || (abstractC0972a instanceof C0977a)) {
                        c0981e.f2216a.m37251b(abstractC0972a);
                    }
                }
            }
        }
        final ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < size; i2++) {
            C0981e c0981e2 = this.f2195f.get(i2);
            if (this.f2197h == null) {
                this.f2197h = new C0977a(this);
            }
            if (c0981e2.f2217b == null || c0981e2.f2217b.size() == 0) {
                arrayList.add(c0981e2);
            } else {
                int size2 = c0981e2.f2217b.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    C0979c c0979c = c0981e2.f2217b.get(i3);
                    c0979c.f2211c.f2216a.m37252a((AbstractC0971a.AbstractC0972a) new C0980d(this, c0981e2, c0979c.f2212d));
                }
                c0981e2.f2218c = (ArrayList) c0981e2.f2217b.clone();
            }
            c0981e2.f2216a.m37252a((AbstractC0971a.AbstractC0972a) this.f2197h);
        }
        if (this.f2199j <= 0) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                C0981e c0981e3 = (C0981e) it3.next();
                c0981e3.f2216a.mo37101a();
                this.f2192c.add(c0981e3.f2216a);
            }
        } else {
            this.f2200k = C1015q.m37079b(0.0f, 1.0f);
            this.f2200k.mo37083b(this.f2199j);
            this.f2200k.a((AbstractC0971a.AbstractC0972a) new AbstractC0974c() { // from class: com.b.a.d.1

                /* renamed from: a */
                boolean f2202a = false;

                @Override // com.p081b.p082a.AbstractC0974c, com.p081b.p082a.AbstractC0971a.AbstractC0972a
                /* renamed from: b */
                public void mo36891b(AbstractC0971a abstractC0971a) {
                    if (!this.f2202a) {
                        int size3 = arrayList.size();
                        for (int i4 = 0; i4 < size3; i4++) {
                            C0981e c0981e4 = (C0981e) arrayList.get(i4);
                            c0981e4.f2216a.mo37101a();
                            C0975d.this.f2192c.add(c0981e4.f2216a);
                        }
                    }
                }

                @Override // com.p081b.p082a.AbstractC0974c, com.p081b.p082a.AbstractC0971a.AbstractC0972a
                /* renamed from: c */
                public void mo36890c(AbstractC0971a abstractC0971a) {
                    this.f2202a = true;
                }
            });
            this.f2200k.mo37101a();
        }
        if (this.f2175a != null) {
            ArrayList arrayList2 = (ArrayList) this.f2175a.clone();
            int size3 = arrayList2.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ((AbstractC0971a.AbstractC0972a) arrayList2.get(i4)).mo36892a(this);
            }
        }
        if (this.f2194e.size() == 0 && this.f2199j == 0) {
            this.f2198i = false;
            if (this.f2175a == null) {
                return;
            }
            ArrayList arrayList3 = (ArrayList) this.f2175a.clone();
            int size4 = arrayList3.size();
            for (int i5 = 0; i5 < size4; i5++) {
                ((AbstractC0971a.AbstractC0972a) arrayList3.get(i5)).mo36891b(this);
            }
        }
    }

    @Override // com.p081b.p082a.AbstractC0971a
    /* renamed from: a */
    public void mo37098a(long j) {
        this.f2199j = j;
    }

    @Override // com.p081b.p082a.AbstractC0971a
    /* renamed from: a */
    public void mo37097a(Interpolator interpolator) {
        Iterator<C0981e> it2 = this.f2194e.iterator();
        while (it2.hasNext()) {
            it2.next().f2216a.mo37097a(interpolator);
        }
    }

    @Override // com.p081b.p082a.AbstractC0971a
    /* renamed from: a */
    public void mo37188a(Object obj) {
        Iterator<C0981e> it2 = this.f2194e.iterator();
        while (it2.hasNext()) {
            AbstractC0971a abstractC0971a = it2.next().f2216a;
            if (abstractC0971a instanceof C0975d) {
                ((C0975d) abstractC0971a).mo37188a(obj);
            } else if (abstractC0971a instanceof C0992l) {
                ((C0992l) abstractC0971a).mo37188a(obj);
            }
        }
    }

    /* renamed from: a */
    public void m37240a(Collection<AbstractC0971a> collection) {
        C0978b c0978b;
        if (collection == null || collection.size() <= 0) {
            return;
        }
        this.f2196g = true;
        C0978b c0978b2 = null;
        for (AbstractC0971a abstractC0971a : collection) {
            if (c0978b2 == null) {
                c0978b = m37243a(abstractC0971a);
            } else {
                c0978b2.m37228a(abstractC0971a);
                c0978b = c0978b2;
            }
            c0978b2 = c0978b;
        }
    }

    /* renamed from: a */
    public void m37239a(List<AbstractC0971a> list) {
        int i = 0;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f2196g = true;
        if (list.size() == 1) {
            m37243a(list.get(0));
            return;
        }
        while (true) {
            int i2 = i;
            if (i2 >= list.size() - 1) {
                return;
            }
            m37243a(list.get(i2)).m37227b(list.get(i2 + 1));
            i = i2 + 1;
        }
    }

    /* renamed from: a */
    public void m37238a(AbstractC0971a... abstractC0971aArr) {
        if (abstractC0971aArr != null) {
            this.f2196g = true;
            C0978b m37243a = m37243a(abstractC0971aArr[0]);
            for (int i = 1; i < abstractC0971aArr.length; i++) {
                m37243a.m37228a(abstractC0971aArr[i]);
            }
        }
    }

    @Override // com.p081b.p082a.AbstractC0971a
    /* renamed from: b */
    public void mo37085b() {
        ArrayList arrayList;
        this.f2191b = true;
        if (mo37067g()) {
            if (this.f2175a != null) {
                ArrayList arrayList2 = (ArrayList) this.f2175a.clone();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((AbstractC0971a.AbstractC0972a) it2.next()).mo36890c(this);
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            if (this.f2200k != null && this.f2200k.mo37069f()) {
                this.f2200k.mo37085b();
            } else if (this.f2195f.size() > 0) {
                Iterator<C0981e> it3 = this.f2195f.iterator();
                while (it3.hasNext()) {
                    it3.next().f2216a.mo37085b();
                }
            }
            if (arrayList != null) {
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    ((AbstractC0971a.AbstractC0972a) it4.next()).mo36891b(this);
                }
            }
            this.f2198i = false;
        }
    }

    /* renamed from: b */
    public void m37236b(AbstractC0971a... abstractC0971aArr) {
        if (abstractC0971aArr != null) {
            this.f2196g = true;
            if (abstractC0971aArr.length == 1) {
                m37243a(abstractC0971aArr[0]);
                return;
            }
            for (int i = 0; i < abstractC0971aArr.length - 1; i++) {
                m37243a(abstractC0971aArr[i]).m37227b(abstractC0971aArr[i + 1]);
            }
        }
    }

    @Override // com.p081b.p082a.AbstractC0971a
    /* renamed from: c */
    public C0975d mo37083b(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("duration must be a value of zero or greater");
        }
        Iterator<C0981e> it2 = this.f2194e.iterator();
        while (it2.hasNext()) {
            it2.next().f2216a.mo37083b(j);
        }
        this.f2201l = j;
        return this;
    }

    @Override // com.p081b.p082a.AbstractC0971a
    /* renamed from: c */
    public void mo37076c() {
        this.f2191b = true;
        if (mo37067g()) {
            if (this.f2195f.size() != this.f2194e.size()) {
                m37230o();
                Iterator<C0981e> it2 = this.f2195f.iterator();
                while (it2.hasNext()) {
                    C0981e next = it2.next();
                    if (this.f2197h == null) {
                        this.f2197h = new C0977a(this);
                    }
                    next.f2216a.m37252a((AbstractC0971a.AbstractC0972a) this.f2197h);
                }
            }
            if (this.f2200k != null) {
                this.f2200k.mo37085b();
            }
            if (this.f2195f.size() > 0) {
                Iterator<C0981e> it3 = this.f2195f.iterator();
                while (it3.hasNext()) {
                    it3.next().f2216a.mo37076c();
                }
            }
            if (this.f2175a != null) {
                Iterator it4 = ((ArrayList) this.f2175a.clone()).iterator();
                while (it4.hasNext()) {
                    ((AbstractC0971a.AbstractC0972a) it4.next()).mo36891b(this);
                }
            }
            this.f2198i = false;
        }
    }

    @Override // com.p081b.p082a.AbstractC0971a
    /* renamed from: d */
    public long mo37073d() {
        return this.f2199j;
    }

    @Override // com.p081b.p082a.AbstractC0971a
    /* renamed from: e */
    public long mo37071e() {
        return this.f2201l;
    }

    @Override // com.p081b.p082a.AbstractC0971a
    /* renamed from: f */
    public boolean mo37069f() {
        Iterator<C0981e> it2 = this.f2194e.iterator();
        while (it2.hasNext()) {
            if (it2.next().f2216a.mo37069f()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p081b.p082a.AbstractC0971a
    /* renamed from: g */
    public boolean mo37067g() {
        return this.f2198i;
    }

    @Override // com.p081b.p082a.AbstractC0971a
    /* renamed from: k */
    public void mo37178k() {
        Iterator<C0981e> it2 = this.f2194e.iterator();
        while (it2.hasNext()) {
            it2.next().f2216a.mo37178k();
        }
    }

    @Override // com.p081b.p082a.AbstractC0971a
    /* renamed from: l */
    public void mo37177l() {
        Iterator<C0981e> it2 = this.f2194e.iterator();
        while (it2.hasNext()) {
            it2.next().f2216a.mo37177l();
        }
    }

    /* renamed from: m */
    public ArrayList<AbstractC0971a> m37232m() {
        ArrayList<AbstractC0971a> arrayList = new ArrayList<>();
        Iterator<C0981e> it2 = this.f2194e.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().f2216a);
        }
        return arrayList;
    }

    @Override // com.p081b.p082a.AbstractC0971a
    /* renamed from: n */
    public C0975d mo37065j() {
        C0975d c0975d = (C0975d) super.clone();
        c0975d.f2196g = true;
        c0975d.f2191b = false;
        c0975d.f2198i = false;
        c0975d.f2192c = new ArrayList<>();
        c0975d.f2193d = new HashMap<>();
        c0975d.f2194e = new ArrayList<>();
        c0975d.f2195f = new ArrayList<>();
        HashMap hashMap = new HashMap();
        Iterator<C0981e> it2 = this.f2194e.iterator();
        while (it2.hasNext()) {
            C0981e next = it2.next();
            C0981e clone = next.clone();
            hashMap.put(next, clone);
            c0975d.f2194e.add(clone);
            c0975d.f2193d.put(clone.f2216a, clone);
            clone.f2217b = null;
            clone.f2218c = null;
            clone.f2220e = null;
            clone.f2219d = null;
            ArrayList<AbstractC0971a.AbstractC0972a> m37250h = clone.f2216a.m37250h();
            if (m37250h != null) {
                Iterator<AbstractC0971a.AbstractC0972a> it3 = m37250h.iterator();
                ArrayList arrayList = null;
                while (it3.hasNext()) {
                    AbstractC0971a.AbstractC0972a next2 = it3.next();
                    if (next2 instanceof C0977a) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(next2);
                    }
                }
                if (arrayList != null) {
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        m37250h.remove((AbstractC0971a.AbstractC0972a) it4.next());
                    }
                }
            }
        }
        Iterator<C0981e> it5 = this.f2194e.iterator();
        while (it5.hasNext()) {
            C0981e next3 = it5.next();
            C0981e c0981e = (C0981e) hashMap.get(next3);
            if (next3.f2217b != null) {
                Iterator<C0979c> it6 = next3.f2217b.iterator();
                while (it6.hasNext()) {
                    C0979c next4 = it6.next();
                    c0981e.m37223a(new C0979c((C0981e) hashMap.get(next4.f2211c), next4.f2212d));
                }
            }
        }
        return c0975d;
    }
}
