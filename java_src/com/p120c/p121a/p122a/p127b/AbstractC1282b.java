package com.p120c.p121a.p122a.p127b;

import android.graphics.Bitmap;
import com.p120c.p121a.p138c.C1356d;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: com.c.a.a.b.b */
/* loaded from: classes.dex */
public abstract class AbstractC1282b extends AbstractC1273a {

    /* renamed from: a */
    private static final int f3216a = 16;

    /* renamed from: b */
    private static final int f3217b = 16777216;

    /* renamed from: c */
    private final int f3218c;

    /* renamed from: e */
    private final List<Bitmap> f3220e = Collections.synchronizedList(new LinkedList());

    /* renamed from: d */
    private final AtomicInteger f3219d = new AtomicInteger();

    public AbstractC1282b(int i) {
        this.f3218c = i;
        if (i > 16777216) {
            C1356d.m35605c("You set too large memory cache size (more than %1$d Mb)", 16);
        }
    }

    @Override // com.p120c.p121a.p122a.p127b.AbstractC1273a, com.p120c.p121a.p122a.p127b.AbstractC1283c
    /* renamed from: a */
    public boolean mo35963a(String str, Bitmap bitmap) {
        boolean z = false;
        int mo35968b = mo35968b(bitmap);
        int m35967c = m35967c();
        int i = this.f3219d.get();
        if (mo35968b < m35967c) {
            int i2 = i;
            while (i2 + mo35968b > m35967c) {
                Bitmap mo35966d = mo35966d();
                if (this.f3220e.remove(mo35966d)) {
                    i2 = this.f3219d.addAndGet(-mo35968b(mo35966d));
                }
            }
            this.f3220e.add(bitmap);
            this.f3219d.addAndGet(mo35968b);
            z = true;
        }
        super.mo35963a(str, bitmap);
        return z;
    }

    /* renamed from: b */
    protected abstract int mo35968b(Bitmap bitmap);

    @Override // com.p120c.p121a.p122a.p127b.AbstractC1273a, com.p120c.p121a.p122a.p127b.AbstractC1283c
    /* renamed from: b */
    public Bitmap mo35961b(String str) {
        Bitmap mo35964a = super.mo35964a(str);
        if (mo35964a != null && this.f3220e.remove(mo35964a)) {
            this.f3219d.addAndGet(-mo35968b(mo35964a));
        }
        return super.mo35961b(str);
    }

    @Override // com.p120c.p121a.p122a.p127b.AbstractC1273a, com.p120c.p121a.p122a.p127b.AbstractC1283c
    /* renamed from: b */
    public void mo35962b() {
        this.f3220e.clear();
        this.f3219d.set(0);
        super.mo35962b();
    }

    /* renamed from: c */
    protected int m35967c() {
        return this.f3218c;
    }

    /* renamed from: d */
    protected abstract Bitmap mo35966d();
}
