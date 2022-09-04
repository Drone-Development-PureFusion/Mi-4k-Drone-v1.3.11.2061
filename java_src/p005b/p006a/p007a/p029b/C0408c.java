package p005b.p006a.p007a.p029b;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import p005b.p006a.p007a.p029b.p055o.AbstractC0658b;
import p005b.p006a.p007a.p029b.p055o.C0659c;
/* renamed from: b.a.a.b.c */
/* loaded from: classes.dex */
public class C0408c<E> extends AbstractC0689q<E> implements AbstractC0658b<E> {

    /* renamed from: d */
    public static final int f488d = 256;

    /* renamed from: g */
    static final int f489g = -1;

    /* renamed from: c */
    BlockingQueue<E> f491c;

    /* renamed from: b */
    C0659c<E> f490b = new C0659c<>();

    /* renamed from: e */
    int f492e = 256;

    /* renamed from: f */
    int f493f = 0;

    /* renamed from: h */
    int f494h = -1;

    /* renamed from: i */
    C0408c<E>.C0409a f495i = new C0409a();

    /* renamed from: b.a.a.b.c$a */
    /* loaded from: classes.dex */
    class C0409a extends Thread {
        C0409a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            C0408c c0408c = C0408c.this;
            C0659c<E> c0659c = c0408c.f490b;
            while (c0408c.b_()) {
                try {
                    c0659c.m38568a((C0659c<E>) c0408c.f491c.take());
                } catch (InterruptedException e) {
                }
            }
            C0408c.this.d("Worker thread will flush remaining events before exiting.");
            for (E e2 : c0408c.f491c) {
                c0659c.m38568a((C0659c<E>) e2);
            }
            c0659c.mo38563e();
        }
    }

    /* renamed from: a */
    private boolean m39405a() {
        return this.f491c.remainingCapacity() < this.f494h;
    }

    /* renamed from: c */
    private void m39399c(E e) {
        try {
            this.f491c.put(e);
        } catch (InterruptedException e2) {
        }
    }

    /* renamed from: a */
    public void m39404a(int i) {
        this.f492e = i;
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0658b
    /* renamed from: a */
    public void mo38569a(AbstractC0401a<E> abstractC0401a) {
        if (this.f493f != 0) {
            e("One and only one appender may be attached to AsyncAppender.");
            e("Ignoring additional appender named [" + abstractC0401a.mo38476g() + "]");
            return;
        }
        this.f493f++;
        d("Attaching appender named [" + abstractC0401a.mo38476g() + "] to AsyncAppender.");
        this.f490b.mo38569a((AbstractC0401a) abstractC0401a);
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0689q
    /* renamed from: a */
    protected void mo38482a(E e) {
        if (!m39405a() || !mo39400b((C0408c<E>) e)) {
            mo39403a_((C0408c<E>) e);
            m39399c((C0408c<E>) e);
        }
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0658b
    /* renamed from: a_ */
    public AbstractC0401a<E> mo38567a_(String str) {
        return this.f490b.mo38567a_(str);
    }

    /* renamed from: a_ */
    protected void mo39403a_(E e) {
    }

    /* renamed from: b */
    public int m39402b() {
        return this.f492e;
    }

    /* renamed from: b */
    public void m39401b(int i) {
        this.f494h = i;
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0658b
    /* renamed from: b */
    public boolean mo38566b(AbstractC0401a<E> abstractC0401a) {
        return this.f490b.mo38566b(abstractC0401a);
    }

    /* renamed from: b */
    protected boolean mo39400b(E e) {
        return false;
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0658b
    /* renamed from: b */
    public boolean mo38565b(String str) {
        return this.f490b.mo38565b(str);
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0658b
    /* renamed from: c */
    public boolean mo38564c(AbstractC0401a<E> abstractC0401a) {
        return this.f490b.mo38564c(abstractC0401a);
    }

    /* renamed from: d */
    public int m39398d() {
        return this.f494h;
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0658b
    /* renamed from: e */
    public void mo38563e() {
        this.f490b.mo38563e();
    }

    @Override // p005b.p006a.p007a.p029b.p055o.AbstractC0658b
    /* renamed from: f */
    public Iterator<AbstractC0401a<E>> mo38562f() {
        return this.f490b.mo38562f();
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0689q, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: j */
    public void mo38474j() {
        if (this.f493f == 0) {
            c("No attached appenders found.");
        } else if (this.f492e < 1) {
            c("Invalid queue size [" + this.f492e + "]");
        } else {
            this.f491c = new ArrayBlockingQueue(this.f492e);
            if (this.f494h == -1) {
                this.f494h = this.f492e / 5;
            }
            d("Setting discardingThreshold to " + this.f494h);
            this.f495i.setDaemon(true);
            this.f495i.setName("AsyncAppender-Worker-" + this.f495i.getName());
            super.mo38474j();
            this.f495i.start();
        }
    }

    @Override // p005b.p006a.p007a.p029b.AbstractC0689q, p005b.p006a.p007a.p029b.p055o.AbstractC0669m
    /* renamed from: k */
    public void mo38473k() {
        if (!b_()) {
            return;
        }
        super.mo38473k();
        this.f495i.interrupt();
        try {
            this.f495i.join(1000L);
        } catch (InterruptedException e) {
            a("Failed to join worker thread", e);
        }
    }

    /* renamed from: l */
    public int m39397l() {
        return this.f491c.size();
    }

    /* renamed from: m */
    public int m39396m() {
        return this.f491c.remainingCapacity();
    }
}
