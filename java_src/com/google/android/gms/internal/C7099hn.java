package com.google.android.gms.internal;

import java.util.concurrent.ScheduledExecutorService;
/* renamed from: com.google.android.gms.internal.hn */
/* loaded from: classes2.dex */
public class C7099hn {

    /* renamed from: a */
    private final ScheduledExecutorService f23908a;

    /* renamed from: b */
    private final AbstractC7097hm f23909b;

    /* renamed from: c */
    private final AbstractC7316kt f23910c;

    /* renamed from: d */
    private final boolean f23911d;

    /* renamed from: e */
    private final String f23912e;

    /* renamed from: f */
    private final String f23913f;

    public C7099hn(AbstractC7316kt abstractC7316kt, AbstractC7097hm abstractC7097hm, ScheduledExecutorService scheduledExecutorService, boolean z, String str, String str2) {
        this.f23910c = abstractC7316kt;
        this.f23909b = abstractC7097hm;
        this.f23908a = scheduledExecutorService;
        this.f23911d = z;
        this.f23912e = str;
        this.f23913f = str2;
    }

    /* renamed from: a */
    public AbstractC7316kt m15584a() {
        return this.f23910c;
    }

    /* renamed from: b */
    public AbstractC7097hm m15583b() {
        return this.f23909b;
    }

    /* renamed from: c */
    public ScheduledExecutorService m15582c() {
        return this.f23908a;
    }

    /* renamed from: d */
    public boolean m15581d() {
        return this.f23911d;
    }

    /* renamed from: e */
    public String m15580e() {
        return this.f23912e;
    }

    /* renamed from: f */
    public String m15579f() {
        return this.f23913f;
    }
}
