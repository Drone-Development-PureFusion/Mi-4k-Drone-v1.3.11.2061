package org.p286a.p287a.p306i.p309c;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.http.conn.routing.HttpRoute;
import org.p286a.p287a.p288a.AbstractC11010d;
import org.p286a.p287a.p299f.AbstractC11133h;
import org.p286a.p287a.p318m.AbstractC11329a;
import org.p286a.p287a.p318m.AbstractC11334b;
@AbstractC11010d
/* renamed from: org.a.a.i.c.b */
/* loaded from: classes2.dex */
class C11212b extends AbstractC11329a<HttpRoute, AbstractC11133h, C11213c> {

    /* renamed from: a */
    private static final AtomicLong f36111a = new AtomicLong();

    /* renamed from: b */
    private final long f36112b;

    /* renamed from: c */
    private final TimeUnit f36113c;

    public C11212b(AbstractC11334b<HttpRoute, AbstractC11133h> abstractC11334b, int i, int i2, long j, TimeUnit timeUnit) {
        super(abstractC11334b, i, i2);
        this.f36112b = j;
        this.f36113c = timeUnit;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.p286a.p287a.p318m.AbstractC11329a
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public C11213c mo1422a(HttpRoute httpRoute, AbstractC11133h abstractC11133h) {
        return new C11213c(Long.toString(f36111a.getAndIncrement()), httpRoute, abstractC11133h, this.f36112b, this.f36113c);
    }
}
