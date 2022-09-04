package org.p356d.p358b;

import java.io.Serializable;
import org.p356d.AbstractC11747c;
import org.p356d.C11751d;
/* renamed from: org.d.b.j */
/* loaded from: classes3.dex */
abstract class AbstractC11741j implements Serializable, AbstractC11747c {
    private static final long serialVersionUID = 7535258609338176893L;

    /* renamed from: b */
    protected String f37048b;

    /* renamed from: d */
    public String mo88d() {
        return this.f37048b;
    }

    protected Object readResolve() {
        return C11751d.m48a(mo88d());
    }
}
