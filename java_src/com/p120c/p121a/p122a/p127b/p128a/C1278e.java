package com.p120c.p121a.p122a.p127b.p128a;

import android.graphics.Bitmap;
import com.p120c.p121a.p122a.p127b.AbstractC1283c;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.c.a.a.b.a.e */
/* loaded from: classes.dex */
public class C1278e implements AbstractC1283c {

    /* renamed from: a */
    private final AbstractC1283c f3209a;

    /* renamed from: b */
    private final long f3210b;

    /* renamed from: c */
    private final Map<String, Long> f3211c = Collections.synchronizedMap(new HashMap());

    public C1278e(AbstractC1283c abstractC1283c, long j) {
        this.f3209a = abstractC1283c;
        this.f3210b = 1000 * j;
    }

    @Override // com.p120c.p121a.p122a.p127b.AbstractC1283c
    /* renamed from: a */
    public Bitmap mo35964a(String str) {
        Long l = this.f3211c.get(str);
        if (l != null && System.currentTimeMillis() - l.longValue() > this.f3210b) {
            this.f3209a.mo35961b(str);
            this.f3211c.remove(str);
        }
        return this.f3209a.mo35964a(str);
    }

    @Override // com.p120c.p121a.p122a.p127b.AbstractC1283c
    /* renamed from: a */
    public Collection<String> mo35965a() {
        return this.f3209a.mo35965a();
    }

    @Override // com.p120c.p121a.p122a.p127b.AbstractC1283c
    /* renamed from: a */
    public boolean mo35963a(String str, Bitmap bitmap) {
        boolean mo35963a = this.f3209a.mo35963a(str, bitmap);
        if (mo35963a) {
            this.f3211c.put(str, Long.valueOf(System.currentTimeMillis()));
        }
        return mo35963a;
    }

    @Override // com.p120c.p121a.p122a.p127b.AbstractC1283c
    /* renamed from: b */
    public Bitmap mo35961b(String str) {
        this.f3211c.remove(str);
        return this.f3209a.mo35961b(str);
    }

    @Override // com.p120c.p121a.p122a.p127b.AbstractC1283c
    /* renamed from: b */
    public void mo35962b() {
        this.f3209a.mo35962b();
        this.f3211c.clear();
    }
}
