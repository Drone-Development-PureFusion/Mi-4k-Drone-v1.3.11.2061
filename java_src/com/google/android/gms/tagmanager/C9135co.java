package com.google.android.gms.tagmanager;

import com.google.android.gms.tagmanager.C9163dj;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* renamed from: com.google.android.gms.tagmanager.co */
/* loaded from: classes2.dex */
class C9135co<K, V> implements AbstractC9162di<K, V> {

    /* renamed from: a */
    private final Map<K, V> f28862a = new HashMap();

    /* renamed from: b */
    private final int f28863b;

    /* renamed from: c */
    private final C9163dj.AbstractC9165a<K, V> f28864c;

    /* renamed from: d */
    private int f28865d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9135co(int i, C9163dj.AbstractC9165a<K, V> abstractC9165a) {
        this.f28863b = i;
        this.f28864c = abstractC9165a;
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9162di
    /* renamed from: a */
    public synchronized V mo9073a(K k) {
        return this.f28862a.get(k);
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9162di
    /* renamed from: a */
    public synchronized void mo9072a(K k, V v) {
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        this.f28865d += this.f28864c.mo9069a(k, v);
        if (this.f28865d > this.f28863b) {
            Iterator<Map.Entry<K, V>> it2 = this.f28862a.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<K, V> next = it2.next();
                this.f28865d -= this.f28864c.mo9069a(next.getKey(), next.getValue());
                it2.remove();
                if (this.f28865d <= this.f28863b) {
                    break;
                }
            }
        }
        this.f28862a.put(k, v);
    }
}
