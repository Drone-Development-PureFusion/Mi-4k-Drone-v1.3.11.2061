package com.google.android.gms.tagmanager;

import android.annotation.TargetApi;
import android.util.LruCache;
import com.google.android.gms.tagmanager.C9163dj;
@TargetApi(12)
/* renamed from: com.google.android.gms.tagmanager.aq */
/* loaded from: classes2.dex */
class C9057aq<K, V> implements AbstractC9162di<K, V> {

    /* renamed from: a */
    private LruCache<K, V> f28707a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9057aq(int i, final C9163dj.AbstractC9165a<K, V> abstractC9165a) {
        this.f28707a = new LruCache<K, V>(i) { // from class: com.google.android.gms.tagmanager.aq.1
            @Override // android.util.LruCache
            protected int sizeOf(K k, V v) {
                return abstractC9165a.mo9069a(k, v);
            }
        };
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9162di
    /* renamed from: a */
    public V mo9073a(K k) {
        return this.f28707a.get(k);
    }

    @Override // com.google.android.gms.tagmanager.AbstractC9162di
    /* renamed from: a */
    public void mo9072a(K k, V v) {
        this.f28707a.put(k, v);
    }
}
