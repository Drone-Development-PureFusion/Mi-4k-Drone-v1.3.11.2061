package com.google.android.gms.internal;

import com.google.android.gms.cast.internal.C4430f;
import com.google.android.gms.cast.p233a.AbstractC4223b;
import com.google.android.gms.cast.p233a.AbstractC4224c;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.util.C4693p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class agq implements AbstractC4223b {

    /* renamed from: a */
    private final int f21643a;

    /* renamed from: b */
    private final int f21644b;

    /* renamed from: c */
    private final String f21645c;

    /* renamed from: d */
    private final JSONObject f21646d;

    /* renamed from: e */
    private final String f21647e;

    /* renamed from: f */
    private final int f21648f;

    /* renamed from: g */
    private final Map<String, AbstractC4224c> f21649g;

    public agq(int i, int i2, String str, JSONObject jSONObject, Collection<AbstractC4224c> collection, String str2, int i3) {
        this.f21643a = i;
        this.f21644b = i2;
        this.f21645c = str;
        this.f21646d = jSONObject;
        this.f21647e = str2;
        this.f21648f = i3;
        this.f21649g = new HashMap(collection.size());
        for (AbstractC4224c abstractC4224c : collection) {
            this.f21649g.put(abstractC4224c.mo17582c(), abstractC4224c);
        }
    }

    @Override // com.google.android.gms.cast.p233a.AbstractC4223b
    /* renamed from: a */
    public int mo17604a() {
        return this.f21643a;
    }

    @Override // com.google.android.gms.cast.p233a.AbstractC4223b
    /* renamed from: a */
    public AbstractC4224c mo17601a(String str) {
        if (str == null) {
            return null;
        }
        return this.f21649g.get(str);
    }

    @Override // com.google.android.gms.cast.p233a.AbstractC4223b
    /* renamed from: a */
    public List<AbstractC4224c> mo17603a(int i) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC4224c abstractC4224c : mo17588g()) {
            if (abstractC4224c.mo17584a() == i) {
                arrayList.add(abstractC4224c);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.cast.p233a.AbstractC4223b
    /* renamed from: a */
    public boolean mo17602a(AbstractC4223b abstractC4223b) {
        return this.f21643a != abstractC4223b.mo17604a();
    }

    @Override // com.google.android.gms.cast.p233a.AbstractC4223b
    /* renamed from: a */
    public boolean mo17600a(String str, AbstractC4223b abstractC4223b) {
        return !C4430f.m24206a(mo17601a(str), abstractC4223b.mo17601a(str));
    }

    @Override // com.google.android.gms.cast.p233a.AbstractC4223b
    /* renamed from: b */
    public int mo17599b() {
        return this.f21644b;
    }

    @Override // com.google.android.gms.cast.p233a.AbstractC4223b
    /* renamed from: b */
    public boolean mo17598b(AbstractC4223b abstractC4223b) {
        return this.f21644b != abstractC4223b.mo17599b();
    }

    @Override // com.google.android.gms.cast.p233a.AbstractC4223b
    /* renamed from: b */
    public boolean mo17597b(String str, AbstractC4223b abstractC4223b) {
        AbstractC4224c mo17601a = mo17601a(str);
        AbstractC4224c mo17601a2 = abstractC4223b.mo17601a(str);
        if (mo17601a == null && mo17601a2 == null) {
            return false;
        }
        return mo17601a == null || mo17601a2 == null || mo17601a.mo17584a() != mo17601a2.mo17584a();
    }

    @Override // com.google.android.gms.cast.p233a.AbstractC4223b
    /* renamed from: c */
    public JSONObject mo17596c() {
        return this.f21646d;
    }

    @Override // com.google.android.gms.cast.p233a.AbstractC4223b
    /* renamed from: c */
    public boolean mo17595c(AbstractC4223b abstractC4223b) {
        return !C4693p.m23118a(this.f21646d, abstractC4223b.mo17596c());
    }

    @Override // com.google.android.gms.cast.p233a.AbstractC4223b
    /* renamed from: c */
    public boolean mo17594c(String str, AbstractC4223b abstractC4223b) {
        AbstractC4224c mo17601a = mo17601a(str);
        AbstractC4224c mo17601a2 = abstractC4223b.mo17601a(str);
        if (mo17601a == null && mo17601a2 == null) {
            return false;
        }
        return mo17601a == null || mo17601a2 == null || !C4693p.m23118a(mo17601a.mo17583b(), mo17601a2.mo17583b());
    }

    @Override // com.google.android.gms.cast.p233a.AbstractC4223b
    /* renamed from: d */
    public CharSequence mo17593d() {
        return this.f21645c;
    }

    @Override // com.google.android.gms.cast.p233a.AbstractC4223b
    /* renamed from: d */
    public boolean mo17592d(AbstractC4223b abstractC4223b) {
        return !C4430f.m24206a(this.f21645c, abstractC4223b.mo17593d());
    }

    @Override // com.google.android.gms.cast.p233a.AbstractC4223b
    /* renamed from: e */
    public CharSequence mo17591e() {
        return this.f21647e;
    }

    @Override // com.google.android.gms.cast.p233a.AbstractC4223b
    /* renamed from: e */
    public Collection<String> mo17590e(AbstractC4223b abstractC4223b) {
        HashSet hashSet = new HashSet();
        for (AbstractC4224c abstractC4224c : mo17588g()) {
            AbstractC4224c mo17601a = abstractC4223b.mo17601a(abstractC4224c.mo17582c());
            if (mo17601a == null || !abstractC4224c.equals(mo17601a)) {
                hashSet.add(abstractC4224c.mo17582c());
            }
        }
        for (AbstractC4224c abstractC4224c2 : abstractC4223b.mo17588g()) {
            if (mo17601a(abstractC4224c2.mo17582c()) == null) {
                hashSet.add(abstractC4224c2.mo17582c());
            }
        }
        return hashSet;
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2 = true;
        if (obj == null || !(obj instanceof AbstractC4223b)) {
            return false;
        }
        AbstractC4223b abstractC4223b = (AbstractC4223b) obj;
        if (mo17588g().size() != abstractC4223b.mo17588g().size()) {
            return false;
        }
        for (AbstractC4224c abstractC4224c : mo17588g()) {
            boolean z3 = false;
            for (AbstractC4224c abstractC4224c2 : abstractC4223b.mo17588g()) {
                if (!C4430f.m24206a(abstractC4224c.mo17582c(), abstractC4224c2.mo17582c())) {
                    z = z3;
                } else if (!C4430f.m24206a(abstractC4224c, abstractC4224c2)) {
                    return false;
                } else {
                    z = true;
                }
                z3 = z;
            }
            if (!z3) {
                return false;
            }
        }
        if (this.f21643a != abstractC4223b.mo17604a() || this.f21644b != abstractC4223b.mo17599b() || this.f21648f != abstractC4223b.mo17589f() || !C4430f.m24206a(this.f21647e, abstractC4223b.mo17591e()) || !C4430f.m24206a(this.f21645c, abstractC4223b.mo17593d()) || !C4693p.m23118a(this.f21646d, abstractC4223b.mo17596c())) {
            z2 = false;
        }
        return z2;
    }

    @Override // com.google.android.gms.cast.p233a.AbstractC4223b
    /* renamed from: f */
    public int mo17589f() {
        return this.f21648f;
    }

    @Override // com.google.android.gms.cast.p233a.AbstractC4223b
    /* renamed from: g */
    public Collection<AbstractC4224c> mo17588g() {
        return Collections.unmodifiableCollection(this.f21649g.values());
    }

    @Override // com.google.android.gms.cast.p233a.AbstractC4223b
    /* renamed from: h */
    public List<AbstractC4224c> mo17587h() {
        ArrayList arrayList = new ArrayList();
        for (AbstractC4224c abstractC4224c : mo17588g()) {
            if (abstractC4224c.mo17580e()) {
                arrayList.add(abstractC4224c);
            }
        }
        return arrayList;
    }

    public int hashCode() {
        return C4585c.m23633a(Integer.valueOf(this.f21643a), Integer.valueOf(this.f21644b), this.f21649g, this.f21645c, this.f21646d, this.f21647e, Integer.valueOf(this.f21648f));
    }

    @Override // com.google.android.gms.cast.p233a.AbstractC4223b
    /* renamed from: i */
    public List<AbstractC4224c> mo17586i() {
        ArrayList arrayList = new ArrayList();
        for (AbstractC4224c abstractC4224c : mo17588g()) {
            if (abstractC4224c.mo17581d()) {
                arrayList.add(abstractC4224c);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.cast.p233a.AbstractC4223b
    /* renamed from: j */
    public List<AbstractC4224c> mo17585j() {
        ArrayList arrayList = new ArrayList();
        for (AbstractC4224c abstractC4224c : mo17588g()) {
            if (abstractC4224c.mo17581d() && abstractC4224c.mo17580e()) {
                arrayList.add(abstractC4224c);
            }
        }
        return arrayList;
    }
}
