package p070c.p072b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
/* renamed from: c.b.m */
/* loaded from: classes.dex */
public class C0757m {

    /* renamed from: a */
    protected List<C0755k> f1412a = new ArrayList();

    /* renamed from: b */
    protected List<C0755k> f1413b = new ArrayList();

    /* renamed from: c */
    protected List<AbstractC0756l> f1414c = new ArrayList();

    /* renamed from: d */
    protected int f1415d = 0;

    /* renamed from: e */
    private boolean f1416e = false;

    /* renamed from: i */
    private synchronized List<AbstractC0756l> m38168i() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        arrayList.addAll(this.f1414c);
        return arrayList;
    }

    /* renamed from: a */
    public synchronized int m38184a() {
        return this.f1413b.size();
    }

    /* renamed from: a */
    public void m38183a(AbstractC0753i abstractC0753i) {
        for (AbstractC0756l abstractC0756l : m38168i()) {
            abstractC0756l.mo836a(abstractC0753i);
        }
    }

    /* renamed from: a */
    public synchronized void m38182a(AbstractC0753i abstractC0753i, C0745b c0745b) {
        this.f1412a.add(new C0755k(abstractC0753i, c0745b));
        for (AbstractC0756l abstractC0756l : m38168i()) {
            abstractC0756l.mo835a(abstractC0753i, c0745b);
        }
    }

    /* renamed from: a */
    public void m38181a(AbstractC0753i abstractC0753i, AbstractC0752h abstractC0752h) {
        try {
            abstractC0752h.mo38167a();
        } catch (C0745b e) {
            m38182a(abstractC0753i, e);
        } catch (ThreadDeath e2) {
            throw e2;
        } catch (Throwable th) {
            m38180a(abstractC0753i, th);
        }
    }

    /* renamed from: a */
    public synchronized void m38180a(AbstractC0753i abstractC0753i, Throwable th) {
        this.f1413b.add(new C0755k(abstractC0753i, th));
        for (AbstractC0756l abstractC0756l : m38168i()) {
            abstractC0756l.mo834a(abstractC0753i, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m38179a(final AbstractC0754j abstractC0754j) {
        m38176b(abstractC0754j);
        m38181a(abstractC0754j, new AbstractC0752h() { // from class: c.b.m.1
            @Override // p070c.p072b.AbstractC0752h
            /* renamed from: a */
            public void mo38167a() {
                abstractC0754j.m38209d();
            }
        });
        m38183a((AbstractC0753i) abstractC0754j);
    }

    /* renamed from: a */
    public synchronized void m38178a(AbstractC0756l abstractC0756l) {
        this.f1414c.add(abstractC0756l);
    }

    /* renamed from: b */
    public synchronized Enumeration<C0755k> m38177b() {
        return Collections.enumeration(this.f1413b);
    }

    /* renamed from: b */
    public void m38176b(AbstractC0753i abstractC0753i) {
        int mo38166a = abstractC0753i.mo38166a();
        synchronized (this) {
            this.f1415d = mo38166a + this.f1415d;
        }
        for (AbstractC0756l abstractC0756l : m38168i()) {
            abstractC0756l.mo833b(abstractC0753i);
        }
    }

    /* renamed from: b */
    public synchronized void m38175b(AbstractC0756l abstractC0756l) {
        this.f1414c.remove(abstractC0756l);
    }

    /* renamed from: c */
    public synchronized int m38174c() {
        return this.f1412a.size();
    }

    /* renamed from: d */
    public synchronized Enumeration<C0755k> m38173d() {
        return Collections.enumeration(this.f1412a);
    }

    /* renamed from: e */
    public synchronized int m38172e() {
        return this.f1415d;
    }

    /* renamed from: f */
    public synchronized boolean m38171f() {
        return this.f1416e;
    }

    /* renamed from: g */
    public synchronized void m38170g() {
        this.f1416e = true;
    }

    /* renamed from: h */
    public synchronized boolean m38169h() {
        boolean z;
        if (m38174c() == 0) {
            if (m38184a() == 0) {
                z = true;
            }
        }
        z = false;
        return z;
    }
}
