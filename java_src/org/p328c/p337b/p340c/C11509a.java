package org.p328c.p337b.p340c;

import org.p328c.p337b.p338a.C11495a;
import org.p328c.p347e.AbstractC11630i;
import org.p328c.p347e.AbstractC11637l;
/* renamed from: org.c.b.c.a */
/* loaded from: classes2.dex */
public class C11509a extends AbstractC11630i {

    /* renamed from: a */
    private final Object f36613a;

    /* renamed from: b */
    private final Class<?> f36614b;

    /* renamed from: c */
    private final boolean f36615c;

    /* renamed from: d */
    private volatile AbstractC11637l f36616d;

    public C11509a(Class<?> cls) {
        this(cls, true);
    }

    public C11509a(Class<?> cls, boolean z) {
        this.f36613a = new Object();
        this.f36614b = cls;
        this.f36615c = z;
    }

    @Override // org.p328c.p347e.AbstractC11630i
    /* renamed from: a */
    public AbstractC11637l mo489a() {
        if (this.f36616d == null) {
            synchronized (this.f36613a) {
                if (this.f36616d == null) {
                    this.f36616d = new C11495a(this.f36615c).c(this.f36614b);
                }
            }
        }
        return this.f36616d;
    }
}
