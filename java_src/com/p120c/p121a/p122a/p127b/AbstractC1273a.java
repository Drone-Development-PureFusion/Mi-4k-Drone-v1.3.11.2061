package com.p120c.p121a.p122a.p127b;

import android.graphics.Bitmap;
import java.lang.ref.Reference;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
/* renamed from: com.c.a.a.b.a */
/* loaded from: classes.dex */
public abstract class AbstractC1273a implements AbstractC1283c {

    /* renamed from: a */
    private final Map<String, Reference<Bitmap>> f3201a = Collections.synchronizedMap(new HashMap());

    @Override // com.p120c.p121a.p122a.p127b.AbstractC1283c
    /* renamed from: a */
    public Bitmap mo35964a(String str) {
        Reference<Bitmap> reference = this.f3201a.get(str);
        if (reference != null) {
            return reference.get();
        }
        return null;
    }

    /* renamed from: a */
    protected abstract Reference<Bitmap> mo35969a(Bitmap bitmap);

    @Override // com.p120c.p121a.p122a.p127b.AbstractC1283c
    /* renamed from: a */
    public Collection<String> mo35965a() {
        HashSet hashSet;
        synchronized (this.f3201a) {
            hashSet = new HashSet(this.f3201a.keySet());
        }
        return hashSet;
    }

    @Override // com.p120c.p121a.p122a.p127b.AbstractC1283c
    /* renamed from: a */
    public boolean mo35963a(String str, Bitmap bitmap) {
        this.f3201a.put(str, mo35969a(bitmap));
        return true;
    }

    @Override // com.p120c.p121a.p122a.p127b.AbstractC1283c
    /* renamed from: b */
    public Bitmap mo35961b(String str) {
        Reference<Bitmap> remove = this.f3201a.remove(str);
        if (remove == null) {
            return null;
        }
        return remove.get();
    }

    @Override // com.p120c.p121a.p122a.p127b.AbstractC1283c
    /* renamed from: b */
    public void mo35962b() {
        this.f3201a.clear();
    }
}
