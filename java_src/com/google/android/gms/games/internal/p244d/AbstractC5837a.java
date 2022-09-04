package com.google.android.gms.games.internal.p244d;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: com.google.android.gms.games.internal.d.a */
/* loaded from: classes2.dex */
public abstract class AbstractC5837a {

    /* renamed from: a */
    private Handler f19985a;

    /* renamed from: c */
    private boolean f19987c;

    /* renamed from: e */
    private int f19989e;

    /* renamed from: b */
    final Object f19986b = new Object();

    /* renamed from: d */
    private HashMap<String, AtomicInteger> f19988d = new HashMap<>();

    public AbstractC5837a(Looper looper, int i) {
        this.f19985a = new Handler(looper);
        this.f19989e = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m20037b() {
        synchronized (this.f19986b) {
            this.f19987c = false;
            m20039a();
        }
    }

    /* renamed from: a */
    public void m20039a() {
        synchronized (this.f19986b) {
            for (Map.Entry<String, AtomicInteger> entry : this.f19988d.entrySet()) {
                mo20035a(entry.getKey(), entry.getValue().get());
            }
            this.f19988d.clear();
        }
    }

    /* renamed from: a */
    protected abstract void mo20035a(String str, int i);

    /* renamed from: b */
    public void m20036b(String str, int i) {
        synchronized (this.f19986b) {
            if (!this.f19987c) {
                this.f19987c = true;
                this.f19985a.postDelayed(new Runnable() { // from class: com.google.android.gms.games.internal.d.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AbstractC5837a.this.m20037b();
                    }
                }, this.f19989e);
            }
            AtomicInteger atomicInteger = this.f19988d.get(str);
            if (atomicInteger == null) {
                atomicInteger = new AtomicInteger();
                this.f19988d.put(str, atomicInteger);
            }
            atomicInteger.addAndGet(i);
        }
    }
}
