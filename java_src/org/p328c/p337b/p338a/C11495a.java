package org.p328c.p337b.p338a;

import java.util.Arrays;
import org.p328c.p347e.AbstractC11637l;
import org.p328c.p350f.p351a.AbstractC11648h;
/* renamed from: org.c.b.a.a */
/* loaded from: classes.dex */
public class C11495a extends AbstractC11648h {

    /* renamed from: a */
    private final boolean f36601a;

    public C11495a(boolean z) {
        this.f36601a = z;
    }

    /* renamed from: a */
    protected C11500f m924a() {
        return new C11500f();
    }

    @Override // org.p328c.p350f.p351a.AbstractC11648h
    /* renamed from: a */
    public AbstractC11637l mo432a(Class<?> cls) {
        for (AbstractC11648h abstractC11648h : Arrays.asList(m921d(), m922c(), m920e(), m923b(), m924a())) {
            AbstractC11637l m428c = abstractC11648h.m428c(cls);
            if (m428c != null) {
                return m428c;
            }
        }
        return null;
    }

    /* renamed from: b */
    protected C11499e m923b() {
        return new C11499e();
    }

    /* renamed from: c */
    protected C11496b m922c() {
        return new C11496b(this);
    }

    /* renamed from: d */
    protected C11497c m921d() {
        return new C11497c();
    }

    /* renamed from: e */
    protected AbstractC11648h m920e() {
        return this.f36601a ? new C11502h() : new C11501g();
    }
}
