package org.p328c.p337b;

import org.p325b.AbstractC11428g;
import org.p325b.AbstractC11433k;
import org.p325b.AbstractC11435m;
import org.p325b.C11436n;
/* renamed from: org.c.b.b */
/* loaded from: classes.dex */
public class C11503b extends RuntimeException implements AbstractC11435m {
    private static final long serialVersionUID = 2;

    /* renamed from: a */
    private final String f36605a;

    /* renamed from: b */
    private final boolean f36606b;

    /* renamed from: c */
    private final Object f36607c;

    /* renamed from: d */
    private final AbstractC11433k<?> f36608d;

    @Deprecated
    public C11503b(Object obj, AbstractC11433k<?> abstractC11433k) {
        this(null, true, obj, abstractC11433k);
    }

    @Deprecated
    public C11503b(String str) {
        this(str, false, null, null);
    }

    @Deprecated
    public C11503b(String str, Object obj, AbstractC11433k<?> abstractC11433k) {
        this(str, true, obj, abstractC11433k);
    }

    @Deprecated
    public C11503b(String str, Throwable th) {
        this(str, false, null, null);
        initCause(th);
    }

    @Deprecated
    public C11503b(String str, boolean z, Object obj, AbstractC11433k<?> abstractC11433k) {
        this.f36605a = str;
        this.f36607c = obj;
        this.f36608d = abstractC11433k;
        this.f36606b = z;
        if (obj instanceof Throwable) {
            initCause((Throwable) obj);
        }
    }

    @Override // org.p325b.AbstractC11435m
    /* renamed from: a */
    public void mo905a(AbstractC11428g abstractC11428g) {
        if (this.f36605a != null) {
            abstractC11428g.mo1086a(this.f36605a);
        }
        if (this.f36606b) {
            if (this.f36605a != null) {
                abstractC11428g.mo1086a(": ");
            }
            abstractC11428g.mo1086a("got: ");
            abstractC11428g.mo1087a(this.f36607c);
            if (this.f36608d == null) {
                return;
            }
            abstractC11428g.mo1086a(", expected: ");
            abstractC11428g.mo1083a((AbstractC11435m) this.f36608d);
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return C11436n.m1072c(this);
    }
}
