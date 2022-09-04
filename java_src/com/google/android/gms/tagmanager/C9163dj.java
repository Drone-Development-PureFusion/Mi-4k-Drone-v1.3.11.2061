package com.google.android.gms.tagmanager;

import android.os.Build;
/* renamed from: com.google.android.gms.tagmanager.dj */
/* loaded from: classes2.dex */
class C9163dj<K, V> {

    /* renamed from: a */
    final AbstractC9165a<K, V> f28928a = new AbstractC9165a<K, V>() { // from class: com.google.android.gms.tagmanager.dj.1
        @Override // com.google.android.gms.tagmanager.C9163dj.AbstractC9165a
        /* renamed from: a */
        public int mo9069a(K k, V v) {
            return 1;
        }
    };

    /* renamed from: com.google.android.gms.tagmanager.dj$a */
    /* loaded from: classes2.dex */
    public interface AbstractC9165a<K, V> {
        /* renamed from: a */
        int mo9069a(K k, V v);
    }

    /* renamed from: a */
    int m9071a() {
        return Build.VERSION.SDK_INT;
    }

    /* renamed from: a */
    public AbstractC9162di<K, V> m9070a(int i, AbstractC9165a<K, V> abstractC9165a) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        return m9071a() < 12 ? new C9135co(i, abstractC9165a) : new C9057aq(i, abstractC9165a);
    }
}
