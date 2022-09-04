package com.tencent.p263mm.sdk.storage;

import android.os.Handler;
import android.os.Looper;
import com.tencent.p263mm.sdk.platformtools.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
/* renamed from: com.tencent.mm.sdk.storage.MStorageEvent */
/* loaded from: classes2.dex */
public abstract class MStorageEvent<T, E> {

    /* renamed from: bP */
    private int f31708bP = 0;

    /* renamed from: bQ */
    private final Hashtable<T, Object> f31709bQ = new Hashtable<>();

    /* renamed from: bR */
    private final CopyOnWriteArraySet<E> f31710bR = new CopyOnWriteArraySet<>();

    /* renamed from: e */
    private void m5840e() {
        HashSet hashSet = new HashSet(this.f31709bQ.keySet());
        if (hashSet.size() <= 0) {
            return;
        }
        HashMap hashMap = new HashMap();
        for (final E e : hashSet) {
            Object obj = this.f31709bQ.get(e);
            Iterator<E> it2 = this.f31710bR.iterator();
            while (it2.hasNext()) {
                final E next = it2.next();
                if (next != null) {
                    if (obj == null) {
                        Log.m5873f("MicroMsg.SDK.MStorageEvent", "handle listener fatal unknown bug");
                    } else if (obj instanceof Looper) {
                        Looper looper = (Looper) obj;
                        Handler handler = (Handler) hashMap.get(looper);
                        if (handler == null) {
                            handler = new Handler(looper);
                            hashMap.put(looper, handler);
                        }
                        handler.post(new Runnable() { // from class: com.tencent.mm.sdk.storage.MStorageEvent.1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.lang.Runnable
                            public void run() {
                                MStorageEvent.this.processEvent(e, next);
                            }
                        });
                    } else {
                        processEvent(e, next);
                    }
                }
            }
        }
        this.f31710bR.clear();
    }

    public void add(T t, Looper looper) {
        if (!this.f31709bQ.containsKey(t)) {
            if (looper != null) {
                this.f31709bQ.put(t, looper);
            } else {
                this.f31709bQ.put(t, new Object());
            }
        }
    }

    public void doNotify() {
        if (!isLocked()) {
            m5840e();
        }
    }

    public boolean event(E e) {
        return this.f31710bR.add(e);
    }

    public boolean isLocked() {
        return this.f31708bP > 0;
    }

    public void lock() {
        this.f31708bP++;
    }

    protected abstract void processEvent(T t, E e);

    public void remove(T t) {
        this.f31709bQ.remove(t);
    }

    public void removeAll() {
        this.f31709bQ.clear();
    }

    public void unlock() {
        this.f31708bP--;
        if (this.f31708bP <= 0) {
            this.f31708bP = 0;
            m5840e();
        }
    }
}
