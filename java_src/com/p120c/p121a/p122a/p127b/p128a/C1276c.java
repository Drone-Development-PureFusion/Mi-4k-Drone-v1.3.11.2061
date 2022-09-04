package com.p120c.p121a.p122a.p127b.p128a;

import android.graphics.Bitmap;
import com.p120c.p121a.p122a.p127b.AbstractC1282b;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
/* renamed from: com.c.a.a.b.a.c */
/* loaded from: classes.dex */
public class C1276c extends AbstractC1282b {

    /* renamed from: a */
    private static final int f3205a = 10;

    /* renamed from: b */
    private static final float f3206b = 1.1f;

    /* renamed from: c */
    private final Map<String, Bitmap> f3207c = Collections.synchronizedMap(new LinkedHashMap(10, f3206b, true));

    public C1276c(int i) {
        super(i);
    }

    @Override // com.p120c.p121a.p122a.p127b.AbstractC1273a, com.p120c.p121a.p122a.p127b.AbstractC1283c
    /* renamed from: a */
    public Bitmap mo35964a(String str) {
        this.f3207c.get(str);
        return super.a(str);
    }

    @Override // com.p120c.p121a.p122a.p127b.AbstractC1273a
    /* renamed from: a */
    protected Reference<Bitmap> mo35969a(Bitmap bitmap) {
        return new WeakReference(bitmap);
    }

    @Override // com.p120c.p121a.p122a.p127b.AbstractC1282b, com.p120c.p121a.p122a.p127b.AbstractC1273a, com.p120c.p121a.p122a.p127b.AbstractC1283c
    /* renamed from: a */
    public boolean mo35963a(String str, Bitmap bitmap) {
        if (super.mo35963a(str, bitmap)) {
            this.f3207c.put(str, bitmap);
            return true;
        }
        return false;
    }

    @Override // com.p120c.p121a.p122a.p127b.AbstractC1282b
    /* renamed from: b */
    protected int mo35968b(Bitmap bitmap) {
        return bitmap.getRowBytes() * bitmap.getHeight();
    }

    @Override // com.p120c.p121a.p122a.p127b.AbstractC1282b, com.p120c.p121a.p122a.p127b.AbstractC1273a, com.p120c.p121a.p122a.p127b.AbstractC1283c
    /* renamed from: b */
    public Bitmap mo35961b(String str) {
        this.f3207c.remove(str);
        return super.mo35961b(str);
    }

    @Override // com.p120c.p121a.p122a.p127b.AbstractC1282b, com.p120c.p121a.p122a.p127b.AbstractC1273a, com.p120c.p121a.p122a.p127b.AbstractC1283c
    /* renamed from: b */
    public void mo35962b() {
        this.f3207c.clear();
        super.mo35962b();
    }

    @Override // com.p120c.p121a.p122a.p127b.AbstractC1282b
    /* renamed from: d */
    protected Bitmap mo35966d() {
        Bitmap bitmap = null;
        synchronized (this.f3207c) {
            Iterator<Map.Entry<String, Bitmap>> it2 = this.f3207c.entrySet().iterator();
            if (it2.hasNext()) {
                bitmap = it2.next().getValue();
                it2.remove();
            }
        }
        return bitmap;
    }
}
