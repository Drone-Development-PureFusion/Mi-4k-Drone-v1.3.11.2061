package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC4489g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: com.google.android.gms.common.internal.x */
/* loaded from: classes2.dex */
public final class C4641x implements Handler.Callback {

    /* renamed from: b */
    private final AbstractC4642a f17138b;

    /* renamed from: h */
    private final Handler f17144h;

    /* renamed from: c */
    private final ArrayList<AbstractC4489g.AbstractC4491b> f17139c = new ArrayList<>();

    /* renamed from: a */
    final ArrayList<AbstractC4489g.AbstractC4491b> f17137a = new ArrayList<>();

    /* renamed from: d */
    private final ArrayList<AbstractC4489g.AbstractC4492c> f17140d = new ArrayList<>();

    /* renamed from: e */
    private volatile boolean f17141e = false;

    /* renamed from: f */
    private final AtomicInteger f17142f = new AtomicInteger(0);

    /* renamed from: g */
    private boolean f17143g = false;

    /* renamed from: i */
    private final Object f17145i = new Object();

    /* renamed from: com.google.android.gms.common.internal.x$a */
    /* loaded from: classes.dex */
    public interface AbstractC4642a {
        /* renamed from: g */
        Bundle mo17342g();

        /* renamed from: t */
        boolean mo17341t();
    }

    public C4641x(Looper looper, AbstractC4642a abstractC4642a) {
        this.f17138b = abstractC4642a;
        this.f17144h = new Handler(looper, this);
    }

    /* renamed from: a */
    public void m23419a() {
        this.f17141e = false;
        this.f17142f.incrementAndGet();
    }

    /* renamed from: a */
    public void m23418a(int i) {
        boolean z = false;
        if (Looper.myLooper() == this.f17144h.getLooper()) {
            z = true;
        }
        C4588d.m23622a(z, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.f17144h.removeMessages(1);
        synchronized (this.f17145i) {
            this.f17143g = true;
            ArrayList arrayList = new ArrayList(this.f17139c);
            int i2 = this.f17142f.get();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                AbstractC4489g.AbstractC4491b abstractC4491b = (AbstractC4489g.AbstractC4491b) it2.next();
                if (!this.f17141e || this.f17142f.get() != i2) {
                    break;
                } else if (this.f17139c.contains(abstractC4491b)) {
                    abstractC4491b.mo17285a(i);
                }
            }
            this.f17137a.clear();
            this.f17143g = false;
        }
    }

    /* renamed from: a */
    public void m23417a(Bundle bundle) {
        boolean z = true;
        C4588d.m23622a(Looper.myLooper() == this.f17144h.getLooper(), "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.f17145i) {
            C4588d.m23623a(!this.f17143g);
            this.f17144h.removeMessages(1);
            this.f17143g = true;
            if (this.f17137a.size() != 0) {
                z = false;
            }
            C4588d.m23623a(z);
            ArrayList arrayList = new ArrayList(this.f17139c);
            int i = this.f17142f.get();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                AbstractC4489g.AbstractC4491b abstractC4491b = (AbstractC4489g.AbstractC4491b) it2.next();
                if (!this.f17141e || !this.f17138b.mo17341t() || this.f17142f.get() != i) {
                    break;
                } else if (!this.f17137a.contains(abstractC4491b)) {
                    abstractC4491b.mo17281a(bundle);
                }
            }
            this.f17137a.clear();
            this.f17143g = false;
        }
    }

    /* renamed from: a */
    public void m23416a(ConnectionResult connectionResult) {
        C4588d.m23622a(Looper.myLooper() == this.f17144h.getLooper(), "onConnectionFailure must only be called on the Handler thread");
        this.f17144h.removeMessages(1);
        synchronized (this.f17145i) {
            ArrayList arrayList = new ArrayList(this.f17140d);
            int i = this.f17142f.get();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                AbstractC4489g.AbstractC4492c abstractC4492c = (AbstractC4489g.AbstractC4492c) it2.next();
                if (!this.f17141e || this.f17142f.get() != i) {
                    return;
                }
                if (this.f17140d.contains(abstractC4492c)) {
                    abstractC4492c.mo17280a(connectionResult);
                }
            }
        }
    }

    /* renamed from: a */
    public void m23415a(AbstractC4489g.AbstractC4491b abstractC4491b) {
        C4588d.m23627a(abstractC4491b);
        synchronized (this.f17145i) {
            if (this.f17139c.contains(abstractC4491b)) {
                String valueOf = String.valueOf(abstractC4491b);
                Log.w("GmsClientEvents", new StringBuilder(String.valueOf(valueOf).length() + 62).append("registerConnectionCallbacks(): listener ").append(valueOf).append(" is already registered").toString());
            } else {
                this.f17139c.add(abstractC4491b);
            }
        }
        if (this.f17138b.mo17341t()) {
            this.f17144h.sendMessage(this.f17144h.obtainMessage(1, abstractC4491b));
        }
    }

    /* renamed from: a */
    public void m23414a(AbstractC4489g.AbstractC4492c abstractC4492c) {
        C4588d.m23627a(abstractC4492c);
        synchronized (this.f17145i) {
            if (this.f17140d.contains(abstractC4492c)) {
                String valueOf = String.valueOf(abstractC4492c);
                Log.w("GmsClientEvents", new StringBuilder(String.valueOf(valueOf).length() + 67).append("registerConnectionFailedListener(): listener ").append(valueOf).append(" is already registered").toString());
            } else {
                this.f17140d.add(abstractC4492c);
            }
        }
    }

    /* renamed from: b */
    public void m23413b() {
        this.f17141e = true;
    }

    /* renamed from: b */
    public boolean m23412b(AbstractC4489g.AbstractC4491b abstractC4491b) {
        boolean contains;
        C4588d.m23627a(abstractC4491b);
        synchronized (this.f17145i) {
            contains = this.f17139c.contains(abstractC4491b);
        }
        return contains;
    }

    /* renamed from: b */
    public boolean m23411b(AbstractC4489g.AbstractC4492c abstractC4492c) {
        boolean contains;
        C4588d.m23627a(abstractC4492c);
        synchronized (this.f17145i) {
            contains = this.f17140d.contains(abstractC4492c);
        }
        return contains;
    }

    /* renamed from: c */
    public void m23410c(AbstractC4489g.AbstractC4491b abstractC4491b) {
        C4588d.m23627a(abstractC4491b);
        synchronized (this.f17145i) {
            if (!this.f17139c.remove(abstractC4491b)) {
                String valueOf = String.valueOf(abstractC4491b);
                Log.w("GmsClientEvents", new StringBuilder(String.valueOf(valueOf).length() + 52).append("unregisterConnectionCallbacks(): listener ").append(valueOf).append(" not found").toString());
            } else if (this.f17143g) {
                this.f17137a.add(abstractC4491b);
            }
        }
    }

    /* renamed from: c */
    public void m23409c(AbstractC4489g.AbstractC4492c abstractC4492c) {
        C4588d.m23627a(abstractC4492c);
        synchronized (this.f17145i) {
            if (!this.f17140d.remove(abstractC4492c)) {
                String valueOf = String.valueOf(abstractC4492c);
                Log.w("GmsClientEvents", new StringBuilder(String.valueOf(valueOf).length() + 57).append("unregisterConnectionFailedListener(): listener ").append(valueOf).append(" not found").toString());
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            Log.wtf("GmsClientEvents", new StringBuilder(45).append("Don't know how to handle message: ").append(message.what).toString(), new Exception());
            return false;
        }
        AbstractC4489g.AbstractC4491b abstractC4491b = (AbstractC4489g.AbstractC4491b) message.obj;
        synchronized (this.f17145i) {
            if (this.f17141e && this.f17138b.mo17341t() && this.f17139c.contains(abstractC4491b)) {
                abstractC4491b.mo17281a(this.f17138b.mo17342g());
            }
        }
        return true;
    }
}
