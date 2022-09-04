package com.fimi.p152e;

import android.os.Handler;
import android.os.Message;
import com.fimi.p148c.AbstractC1522a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* renamed from: com.fimi.e.d */
/* loaded from: classes.dex */
public class C1549d {

    /* renamed from: a */
    private static C1549d f3783a = new C1549d();

    /* renamed from: c */
    private C1542a f3785c;

    /* renamed from: b */
    private List<AbstractC1522a> f3784b = new ArrayList();

    /* renamed from: d */
    private Handler f3786d = new Handler() { // from class: com.fimi.e.d.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    for (AbstractC1522a abstractC1522a : C1549d.this.f3784b) {
                        abstractC1522a.mo28051b("removeSession");
                    }
                    return;
                case 1:
                    for (AbstractC1522a abstractC1522a2 : C1549d.this.f3784b) {
                        abstractC1522a2.mo28082a("startSession");
                    }
                    return;
                default:
                    return;
            }
        }
    };

    /* renamed from: a */
    public static void m35213a() {
        m35208b();
    }

    /* renamed from: b */
    public static C1549d m35208b() {
        return f3783a;
    }

    /* renamed from: a */
    public synchronized void m35212a(AbstractC1522a abstractC1522a) {
        this.f3784b.add(abstractC1522a);
    }

    /* renamed from: a */
    public synchronized void m35211a(C1542a c1542a) {
        this.f3785c = c1542a;
        this.f3786d.sendEmptyMessage(1);
    }

    /* renamed from: a */
    public synchronized void m35209a(byte[] bArr, int i) {
        if (this.f3785c != null) {
            this.f3785c.mo35222a(bArr, i);
        }
    }

    /* renamed from: b */
    public synchronized void m35207b(AbstractC1522a abstractC1522a) {
        AbstractC1522a abstractC1522a2;
        Iterator<AbstractC1522a> it2 = this.f3784b.iterator();
        while (true) {
            if (!it2.hasNext()) {
                abstractC1522a2 = null;
                break;
            }
            abstractC1522a2 = it2.next();
            if (abstractC1522a2 != null && abstractC1522a2 == abstractC1522a) {
                break;
            }
        }
        if (abstractC1522a2 != null) {
            this.f3784b.remove(abstractC1522a2);
        }
    }

    /* renamed from: c */
    public synchronized void m35206c() {
        this.f3785c = null;
        this.f3786d.sendEmptyMessage(0);
    }

    /* renamed from: d */
    public synchronized boolean m35205d() {
        return this.f3785c != null;
    }

    /* renamed from: e */
    public synchronized void m35204e() {
        if (this.f3785c != null) {
            this.f3785c.mo35221b();
        }
    }
}
