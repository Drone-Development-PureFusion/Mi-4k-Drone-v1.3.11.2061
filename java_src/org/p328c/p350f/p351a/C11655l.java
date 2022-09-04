package org.p328c.p350f.p351a;

import java.util.concurrent.TimeUnit;
/* renamed from: org.c.f.a.l */
/* loaded from: classes2.dex */
public class C11655l extends Exception {
    private static final long serialVersionUID = 31935685163547539L;

    /* renamed from: a */
    private final TimeUnit f36798a;

    /* renamed from: b */
    private final long f36799b;

    public C11655l(long j, TimeUnit timeUnit) {
        super(String.format("test timed out after %d %s", Long.valueOf(j), timeUnit.name().toLowerCase()));
        this.f36798a = timeUnit;
        this.f36799b = j;
    }

    /* renamed from: a */
    public long m402a() {
        return this.f36799b;
    }

    /* renamed from: b */
    public TimeUnit m401b() {
        return this.f36798a;
    }
}
