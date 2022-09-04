package p070c.p071a;

import p070c.p072b.AbstractC0753i;
import p070c.p072b.AbstractC0754j;
import p070c.p072b.C0757m;
import p070c.p072b.C0759n;
/* renamed from: c.a.a */
/* loaded from: classes.dex */
public class C0738a extends C0759n {

    /* renamed from: a */
    private volatile int f1383a;

    public C0738a() {
    }

    public C0738a(Class<? extends AbstractC0754j> cls) {
        super(cls);
    }

    public C0738a(Class<? extends AbstractC0754j> cls, String str) {
        super(cls, str);
    }

    public C0738a(String str) {
        super(str);
    }

    @Override // p070c.p072b.C0759n
    /* renamed from: a */
    public void mo38163a(final AbstractC0753i abstractC0753i, final C0757m c0757m) {
        new Thread() { // from class: c.a.a.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    abstractC0753i.mo38162a(c0757m);
                } finally {
                    C0738a.this.m38297b();
                }
            }
        }.start();
    }

    @Override // p070c.p072b.C0759n, p070c.p072b.AbstractC0753i
    /* renamed from: a */
    public void mo38162a(C0757m c0757m) {
        this.f1383a = 0;
        super.mo38162a(c0757m);
        m38296z_();
    }

    /* renamed from: b */
    public synchronized void m38297b() {
        this.f1383a++;
        notifyAll();
    }

    /* renamed from: z_ */
    synchronized void m38296z_() {
        while (this.f1383a < d()) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
    }
}
