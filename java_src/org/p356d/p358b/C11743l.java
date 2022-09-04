package org.p356d.p358b;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import org.p356d.AbstractC11724a;
import org.p356d.AbstractC11747c;
import org.p356d.p357a.C11729e;
/* renamed from: org.d.b.l */
/* loaded from: classes3.dex */
public class C11743l implements AbstractC11724a {

    /* renamed from: a */
    boolean f37056a = false;

    /* renamed from: b */
    final Map<String, C11742k> f37057b = new HashMap();

    /* renamed from: c */
    final LinkedBlockingQueue<C11729e> f37058c = new LinkedBlockingQueue<>();

    /* renamed from: a */
    public List<String> m131a() {
        return new ArrayList(this.f37057b.keySet());
    }

    /* renamed from: b */
    public List<C11742k> m130b() {
        return new ArrayList(this.f37057b.values());
    }

    /* renamed from: c */
    public LinkedBlockingQueue<C11729e> m129c() {
        return this.f37058c;
    }

    /* renamed from: d */
    public void m128d() {
        this.f37056a = true;
    }

    @Override // org.p356d.AbstractC11724a
    /* renamed from: e */
    public synchronized AbstractC11747c mo126e(String str) {
        C11742k c11742k;
        c11742k = this.f37057b.get(str);
        if (c11742k == null) {
            c11742k = new C11742k(str, this.f37058c, this.f37056a);
            this.f37057b.put(str, c11742k);
        }
        return c11742k;
    }

    /* renamed from: e */
    public void m127e() {
        this.f37057b.clear();
        this.f37058c.clear();
    }
}
