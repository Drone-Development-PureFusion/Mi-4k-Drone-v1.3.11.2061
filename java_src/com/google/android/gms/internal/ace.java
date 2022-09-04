package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes2.dex */
public class ace {

    /* renamed from: a */
    private AtomicInteger f21111a;

    /* renamed from: b */
    private final Map<String, Queue<abd<?>>> f21112b;

    /* renamed from: c */
    private final Set<abd<?>> f21113c;

    /* renamed from: d */
    private final PriorityBlockingQueue<abd<?>> f21114d;

    /* renamed from: e */
    private final PriorityBlockingQueue<abd<?>> f21115e;

    /* renamed from: f */
    private final AbstractC7674ru f21116f;

    /* renamed from: g */
    private final AbstractC7888vy f21117g;

    /* renamed from: h */
    private final aeg f21118h;

    /* renamed from: i */
    private C7981wz[] f21119i;

    /* renamed from: j */
    private C7713sv f21120j;

    /* renamed from: k */
    private List<AbstractC6187a> f21121k;

    /* renamed from: com.google.android.gms.internal.ace$a */
    /* loaded from: classes2.dex */
    public interface AbstractC6187a<T> {
        /* renamed from: a */
        void m18226a(abd<T> abdVar);
    }

    public ace(AbstractC7674ru abstractC7674ru, AbstractC7888vy abstractC7888vy) {
        this(abstractC7674ru, abstractC7888vy, 4);
    }

    public ace(AbstractC7674ru abstractC7674ru, AbstractC7888vy abstractC7888vy, int i) {
        this(abstractC7674ru, abstractC7888vy, i, new C7820ux(new Handler(Looper.getMainLooper())));
    }

    public ace(AbstractC7674ru abstractC7674ru, AbstractC7888vy abstractC7888vy, int i, aeg aegVar) {
        this.f21111a = new AtomicInteger();
        this.f21112b = new HashMap();
        this.f21113c = new HashSet();
        this.f21114d = new PriorityBlockingQueue<>();
        this.f21115e = new PriorityBlockingQueue<>();
        this.f21121k = new ArrayList();
        this.f21116f = abstractC7674ru;
        this.f21117g = abstractC7888vy;
        this.f21119i = new C7981wz[i];
        this.f21118h = aegVar;
    }

    /* renamed from: a */
    public <T> abd<T> m18230a(abd<T> abdVar) {
        abdVar.m18516a(this);
        synchronized (this.f21113c) {
            this.f21113c.add(abdVar);
        }
        abdVar.m18518a(m18227c());
        abdVar.m18507b("add-to-queue");
        if (!abdVar.m18494p()) {
            this.f21115e.add(abdVar);
        } else {
            synchronized (this.f21112b) {
                String m18504d = abdVar.m18504d();
                if (this.f21112b.containsKey(m18504d)) {
                    Queue<abd<?>> queue = this.f21112b.get(m18504d);
                    if (queue == null) {
                        queue = new LinkedList<>();
                    }
                    queue.add(abdVar);
                    this.f21112b.put(m18504d, queue);
                    if (ajg.f22012b) {
                        ajg.m17133a("Request for cacheKey=%s is in flight, putting on hold.", m18504d);
                    }
                } else {
                    this.f21112b.put(m18504d, null);
                    this.f21114d.add(abdVar);
                }
            }
        }
        return abdVar;
    }

    /* renamed from: a */
    public void m18231a() {
        m18229b();
        this.f21120j = new C7713sv(this.f21114d, this.f21115e, this.f21116f, this.f21118h);
        this.f21120j.start();
        for (int i = 0; i < this.f21119i.length; i++) {
            C7981wz c7981wz = new C7981wz(this.f21115e, this.f21117g, this.f21116f, this.f21118h);
            this.f21119i[i] = c7981wz;
            c7981wz.start();
        }
    }

    /* renamed from: b */
    public void m18229b() {
        if (this.f21120j != null) {
            this.f21120j.m13669a();
        }
        for (int i = 0; i < this.f21119i.length; i++) {
            if (this.f21119i[i] != null) {
                this.f21119i[i].m13118a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public <T> void m18228b(abd<T> abdVar) {
        synchronized (this.f21113c) {
            this.f21113c.remove(abdVar);
        }
        synchronized (this.f21121k) {
            for (AbstractC6187a abstractC6187a : this.f21121k) {
                abstractC6187a.m18226a(abdVar);
            }
        }
        if (abdVar.m18494p()) {
            synchronized (this.f21112b) {
                String m18504d = abdVar.m18504d();
                Queue<abd<?>> remove = this.f21112b.remove(m18504d);
                if (remove != null) {
                    if (ajg.f22012b) {
                        ajg.m17133a("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(remove.size()), m18504d);
                    }
                    this.f21114d.addAll(remove);
                }
            }
        }
    }

    /* renamed from: c */
    public int m18227c() {
        return this.f21111a.incrementAndGet();
    }
}
