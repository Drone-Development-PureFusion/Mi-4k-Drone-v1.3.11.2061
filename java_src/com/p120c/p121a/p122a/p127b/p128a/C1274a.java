package com.p120c.p121a.p122a.p127b.p128a;

import android.graphics.Bitmap;
import com.p120c.p121a.p122a.p127b.AbstractC1282b;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
/* renamed from: com.c.a.a.b.a.a */
/* loaded from: classes.dex */
public class C1274a extends AbstractC1282b {

    /* renamed from: a */
    private final List<Bitmap> f3202a = Collections.synchronizedList(new LinkedList());

    public C1274a(int i) {
        super(i);
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
            this.f3202a.add(bitmap);
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
        Bitmap a = super.a(str);
        if (a != null) {
            this.f3202a.remove(a);
        }
        return super.mo35961b(str);
    }

    @Override // com.p120c.p121a.p122a.p127b.AbstractC1282b, com.p120c.p121a.p122a.p127b.AbstractC1273a, com.p120c.p121a.p122a.p127b.AbstractC1283c
    /* renamed from: b */
    public void mo35962b() {
        this.f3202a.clear();
        super.mo35962b();
    }

    @Override // com.p120c.p121a.p122a.p127b.AbstractC1282b
    /* renamed from: d */
    protected Bitmap mo35966d() {
        return this.f3202a.remove(0);
    }
}
