package com.google.firebase.database;

import com.google.android.gms.internal.AbstractC7344lh;
import com.google.android.gms.internal.C7160ij;
import com.google.android.gms.internal.C7164im;
import com.google.android.gms.internal.C7235iz;
import com.google.android.gms.internal.C7347li;
import com.google.android.gms.internal.C7350ll;
import com.google.android.gms.internal.C7389mh;
import com.google.android.gms.internal.C7392mk;
import com.google.android.gms.internal.C7394ml;
import com.google.android.gms.internal.C7395mm;
import com.google.android.gms.p239g.AbstractC5285f;
import com.google.firebase.database.C9867e;
import java.util.Map;
/* renamed from: com.google.firebase.database.l */
/* loaded from: classes2.dex */
public class C9885l {

    /* renamed from: a */
    private C7164im f30751a;

    /* renamed from: b */
    private C7160ij f30752b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9885l(C7164im c7164im, C7160ij c7160ij) {
        this.f30751a = c7164im;
        this.f30752b = c7160ij;
    }

    /* renamed from: a */
    private AbstractC5285f<Void> m6706a(Object obj, AbstractC7344lh abstractC7344lh, C9867e.AbstractC9872a abstractC9872a) {
        C7394ml.m14602a(this.f30752b);
        C7235iz.m15147a(this.f30752b, obj);
        Object m14590a = C7395mm.m14590a(obj);
        C7394ml.m14600a(m14590a);
        final AbstractC7344lh m14734a = C7347li.m14734a(m14590a, abstractC7344lh);
        final C7389mh<AbstractC5285f<Void>, C9867e.AbstractC9872a> m14609a = C7392mk.m14609a(abstractC9872a);
        this.f30751a.m15320a(new Runnable() { // from class: com.google.firebase.database.l.1
            @Override // java.lang.Runnable
            public void run() {
                C9885l.this.f30751a.m15312b(C9885l.this.f30752b, m14734a, (C9867e.AbstractC9872a) m14609a.m14615b());
            }
        });
        return m14609a.m14616a();
    }

    /* renamed from: b */
    private AbstractC5285f<Void> m6696b(final Map<String, Object> map, C9867e.AbstractC9872a abstractC9872a) {
        final Map<C7160ij, AbstractC7344lh> m14601a = C7394ml.m14601a(this.f30752b, map);
        final C7389mh<AbstractC5285f<Void>, C9867e.AbstractC9872a> m14609a = C7392mk.m14609a(abstractC9872a);
        this.f30751a.m15320a(new Runnable() { // from class: com.google.firebase.database.l.2
            @Override // java.lang.Runnable
            public void run() {
                C9885l.this.f30751a.m15336a(C9885l.this.f30752b, m14601a, (C9867e.AbstractC9872a) m14609a.m14615b(), map);
            }
        });
        return m14609a.m14616a();
    }

    /* renamed from: c */
    private AbstractC5285f<Void> m6695c(C9867e.AbstractC9872a abstractC9872a) {
        final C7389mh<AbstractC5285f<Void>, C9867e.AbstractC9872a> m14609a = C7392mk.m14609a(abstractC9872a);
        this.f30751a.m15320a(new Runnable() { // from class: com.google.firebase.database.l.3
            @Override // java.lang.Runnable
            public void run() {
                C9885l.this.f30751a.m15339a(C9885l.this.f30752b, (C9867e.AbstractC9872a) m14609a.m14615b());
            }
        });
        return m14609a.m14616a();
    }

    /* renamed from: a */
    public AbstractC5285f<Void> m6712a() {
        return m6709a((Object) null);
    }

    /* renamed from: a */
    public AbstractC5285f<Void> m6709a(Object obj) {
        return m6706a(obj, C7350ll.m14730a(), (C9867e.AbstractC9872a) null);
    }

    /* renamed from: a */
    public AbstractC5285f<Void> m6708a(Object obj, double d) {
        return m6706a(obj, C7350ll.m14728a(Double.valueOf(d)), (C9867e.AbstractC9872a) null);
    }

    /* renamed from: a */
    public AbstractC5285f<Void> m6704a(Object obj, String str) {
        return m6706a(obj, C7350ll.m14728a(str), (C9867e.AbstractC9872a) null);
    }

    /* renamed from: a */
    public AbstractC5285f<Void> m6701a(Map<String, Object> map) {
        return m6696b(map, null);
    }

    /* renamed from: a */
    public void m6711a(C9867e.AbstractC9872a abstractC9872a) {
        m6705a((Object) null, abstractC9872a);
    }

    /* renamed from: a */
    public void m6707a(Object obj, double d, C9867e.AbstractC9872a abstractC9872a) {
        m6706a(obj, C7350ll.m14728a(Double.valueOf(d)), abstractC9872a);
    }

    /* renamed from: a */
    public void m6705a(Object obj, C9867e.AbstractC9872a abstractC9872a) {
        m6706a(obj, C7350ll.m14730a(), abstractC9872a);
    }

    /* renamed from: a */
    public void m6703a(Object obj, String str, C9867e.AbstractC9872a abstractC9872a) {
        m6706a(obj, C7350ll.m14728a(str), abstractC9872a);
    }

    /* renamed from: a */
    public void m6702a(Object obj, Map map, C9867e.AbstractC9872a abstractC9872a) {
        m6706a(obj, C7350ll.m14728a(map), abstractC9872a);
    }

    /* renamed from: a */
    public void m6700a(Map<String, Object> map, C9867e.AbstractC9872a abstractC9872a) {
        m6696b(map, abstractC9872a);
    }

    /* renamed from: b */
    public AbstractC5285f<Void> m6699b() {
        return m6695c(null);
    }

    /* renamed from: b */
    public void m6698b(C9867e.AbstractC9872a abstractC9872a) {
        m6695c(abstractC9872a);
    }
}
