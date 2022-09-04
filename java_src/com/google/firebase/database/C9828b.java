package com.google.firebase.database;

import com.google.android.gms.internal.C7160ij;
import com.google.android.gms.internal.C7337lc;
import com.google.android.gms.internal.C7343lg;
import com.google.android.gms.internal.C7394ml;
import com.google.android.gms.internal.C7395mm;
import java.util.Iterator;
/* renamed from: com.google.firebase.database.b */
/* loaded from: classes2.dex */
public class C9828b {

    /* renamed from: a */
    private final C7337lc f30655a;

    /* renamed from: b */
    private final C9867e f30656b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9828b(C9867e c9867e, C7337lc c7337lc) {
        this.f30655a = c7337lc;
        this.f30656b = c9867e;
    }

    /* renamed from: a */
    public C9828b m6870a(String str) {
        return new C9828b(this.f30656b.m6761a(str), C7337lc.m14769a(this.f30655a.m14773a().mo14750a(new C7160ij(str))));
    }

    /* renamed from: a */
    public <T> T m6872a(AbstractC9876h<T> abstractC9876h) {
        return (T) C7395mm.m14589a(this.f30655a.m14773a().mo14710a(), abstractC9876h);
    }

    /* renamed from: a */
    public <T> T m6871a(Class<T> cls) {
        return (T) C7395mm.m14588a(this.f30655a.m14773a().mo14710a(), (Class<Object>) cls);
    }

    /* renamed from: a */
    public Object m6869a(boolean z) {
        return this.f30655a.m14773a().mo14747a(z);
    }

    /* renamed from: a */
    public boolean m6874a() {
        return this.f30655a.m14773a().mo14745c() > 0;
    }

    /* renamed from: b */
    public boolean m6868b() {
        return !this.f30655a.m14773a().mo14739b();
    }

    /* renamed from: b */
    public boolean m6867b(String str) {
        if (this.f30656b.m6749g() == null) {
            C7394ml.m14597b(str);
        } else {
            C7394ml.m14599a(str);
        }
        return !this.f30655a.m14773a().mo14750a(new C7160ij(str)).mo14739b();
    }

    /* renamed from: c */
    public Object m6866c() {
        return this.f30655a.m14773a().mo14710a();
    }

    /* renamed from: d */
    public long m6865d() {
        return this.f30655a.m14773a().mo14745c();
    }

    /* renamed from: e */
    public C9867e m6864e() {
        return this.f30656b;
    }

    /* renamed from: f */
    public String m6863f() {
        return this.f30656b.m6747i();
    }

    /* renamed from: g */
    public Iterable<C9828b> m6862g() {
        final Iterator<C7343lg> it2 = this.f30655a.iterator();
        return new Iterable<C9828b>() { // from class: com.google.firebase.database.b.1
            @Override // java.lang.Iterable
            public Iterator<C9828b> iterator() {
                return new Iterator<C9828b>() { // from class: com.google.firebase.database.b.1.1
                    @Override // java.util.Iterator
                    /* renamed from: a */
                    public C9828b next() {
                        C7343lg c7343lg = (C7343lg) it2.next();
                        return new C9828b(C9828b.this.f30656b.m6761a(c7343lg.m14752c().m14823e()), C7337lc.m14769a(c7343lg.m14751d()));
                    }

                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        return it2.hasNext();
                    }

                    @Override // java.util.Iterator
                    public void remove() {
                        throw new UnsupportedOperationException("remove called on immutable collection");
                    }
                };
            }
        };
    }

    /* renamed from: h */
    public Object m6861h() {
        Object mo14710a = this.f30655a.m14773a().mo14737f().mo14710a();
        return mo14710a instanceof Long ? Double.valueOf(((Long) mo14710a).longValue()) : mo14710a;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f30656b.m6747i());
        String valueOf2 = String.valueOf(this.f30655a.m14773a().mo14747a(true));
        return new StringBuilder(String.valueOf(valueOf).length() + 33 + String.valueOf(valueOf2).length()).append("DataSnapshot { key = ").append(valueOf).append(", value = ").append(valueOf2).append(" }").toString();
    }
}
