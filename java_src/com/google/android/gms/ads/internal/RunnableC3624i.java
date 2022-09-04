package com.google.android.gms.ads.internal;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.C3514ac;
import com.google.android.gms.internal.AbstractC7495oq;
import com.google.android.gms.internal.C7666rn;
import com.google.android.gms.internal.C7788uf;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abr;
import com.google.android.gms.internal.abu;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
@aaa
/* renamed from: com.google.android.gms.ads.internal.i */
/* loaded from: classes.dex */
public class RunnableC3624i implements AbstractC7495oq, Runnable {

    /* renamed from: d */
    private ViewTreeObserver$OnGlobalLayoutListenerC3787v f14187d;

    /* renamed from: b */
    private final List<Object[]> f14185b = new Vector();

    /* renamed from: c */
    private final AtomicReference<AbstractC7495oq> f14186c = new AtomicReference<>();

    /* renamed from: a */
    CountDownLatch f14184a = new CountDownLatch(1);

    public RunnableC3624i(ViewTreeObserver$OnGlobalLayoutListenerC3787v viewTreeObserver$OnGlobalLayoutListenerC3787v) {
        this.f14187d = viewTreeObserver$OnGlobalLayoutListenerC3787v;
        if (C3514ac.m27586a().m26854b()) {
            abu.m18391a(this);
        } else {
            run();
        }
    }

    /* renamed from: b */
    private Context m27330b(Context context) {
        Context applicationContext;
        return (C7788uf.f25896n.m13486c().booleanValue() && (applicationContext = context.getApplicationContext()) != null) ? applicationContext : context;
    }

    /* renamed from: b */
    private void m27331b() {
        if (this.f14185b.isEmpty()) {
            return;
        }
        for (Object[] objArr : this.f14185b) {
            if (objArr.length == 1) {
                this.f14186c.get().mo14119a((MotionEvent) objArr[0]);
            } else if (objArr.length == 3) {
                this.f14186c.get().mo14124a(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        this.f14185b.clear();
    }

    /* renamed from: a */
    protected AbstractC7495oq m27332a(String str, Context context, boolean z) {
        return C7666rn.m13795a(str, context, z);
    }

    @Override // com.google.android.gms.internal.AbstractC7495oq
    /* renamed from: a */
    public String mo14123a(Context context) {
        AbstractC7495oq abstractC7495oq;
        if (!m27334a() || (abstractC7495oq = this.f14186c.get()) == null) {
            return "";
        }
        m27331b();
        return abstractC7495oq.mo14123a(m27330b(context));
    }

    @Override // com.google.android.gms.internal.AbstractC7495oq
    /* renamed from: a */
    public String mo14121a(Context context, String str, View view) {
        AbstractC7495oq abstractC7495oq;
        if (!m27334a() || (abstractC7495oq = this.f14186c.get()) == null) {
            return "";
        }
        m27331b();
        return abstractC7495oq.mo14121a(m27330b(context), str, view);
    }

    @Override // com.google.android.gms.internal.AbstractC7495oq
    /* renamed from: a */
    public void mo14124a(int i, int i2, int i3) {
        AbstractC7495oq abstractC7495oq = this.f14186c.get();
        if (abstractC7495oq == null) {
            this.f14185b.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            return;
        }
        m27331b();
        abstractC7495oq.mo14124a(i, i2, i3);
    }

    @Override // com.google.android.gms.internal.AbstractC7495oq
    /* renamed from: a */
    public void mo14119a(MotionEvent motionEvent) {
        AbstractC7495oq abstractC7495oq = this.f14186c.get();
        if (abstractC7495oq == null) {
            this.f14185b.add(new Object[]{motionEvent});
            return;
        }
        m27331b();
        abstractC7495oq.mo14119a(motionEvent);
    }

    /* renamed from: a */
    protected void m27333a(AbstractC7495oq abstractC7495oq) {
        this.f14186c.set(abstractC7495oq);
    }

    /* renamed from: a */
    protected boolean m27334a() {
        try {
            this.f14184a.await();
            return true;
        } catch (InterruptedException e) {
            abr.d("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            m27333a(m27332a(this.f14187d.f14766e.f14733b, m27330b(this.f14187d.f14764c), !C7788uf.f25721F.m13486c().booleanValue() || this.f14187d.f14766e.f14736e));
        } finally {
            this.f14184a.countDown();
            this.f14187d = null;
        }
    }
}
