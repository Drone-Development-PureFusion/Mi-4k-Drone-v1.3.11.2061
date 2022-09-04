package com.p120c.p121a.p122a.p127b.p128a;

import android.graphics.Bitmap;
import com.p120c.p121a.p122a.p127b.AbstractC1283c;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
/* renamed from: com.c.a.a.b.a.b */
/* loaded from: classes.dex */
public class C1275b implements AbstractC1283c {

    /* renamed from: a */
    private final AbstractC1283c f3203a;

    /* renamed from: b */
    private final Comparator<String> f3204b;

    public C1275b(AbstractC1283c abstractC1283c, Comparator<String> comparator) {
        this.f3203a = abstractC1283c;
        this.f3204b = comparator;
    }

    @Override // com.p120c.p121a.p122a.p127b.AbstractC1283c
    /* renamed from: a */
    public Bitmap mo35964a(String str) {
        return this.f3203a.mo35964a(str);
    }

    @Override // com.p120c.p121a.p122a.p127b.AbstractC1283c
    /* renamed from: a */
    public Collection<String> mo35965a() {
        return this.f3203a.mo35965a();
    }

    @Override // com.p120c.p121a.p122a.p127b.AbstractC1283c
    /* renamed from: a */
    public boolean mo35963a(String str, Bitmap bitmap) {
        String str2;
        synchronized (this.f3203a) {
            Iterator<String> it2 = this.f3203a.mo35965a().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    str2 = null;
                    break;
                }
                str2 = it2.next();
                if (this.f3204b.compare(str, str2) == 0) {
                    break;
                }
            }
            if (str2 != null) {
                this.f3203a.mo35961b(str2);
            }
        }
        return this.f3203a.mo35963a(str, bitmap);
    }

    @Override // com.p120c.p121a.p122a.p127b.AbstractC1283c
    /* renamed from: b */
    public Bitmap mo35961b(String str) {
        return this.f3203a.mo35961b(str);
    }

    @Override // com.p120c.p121a.p122a.p127b.AbstractC1283c
    /* renamed from: b */
    public void mo35962b() {
        this.f3203a.mo35962b();
    }
}
