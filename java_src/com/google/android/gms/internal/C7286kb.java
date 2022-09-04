package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC7287kc;
import com.google.firebase.database.C9828b;
/* renamed from: com.google.android.gms.internal.kb */
/* loaded from: classes2.dex */
public class C7286kb implements AbstractC7287kc {

    /* renamed from: a */
    private final AbstractC7287kc.EnumC7288a f24399a;

    /* renamed from: b */
    private final AbstractC7151ie f24400b;

    /* renamed from: c */
    private final C9828b f24401c;

    /* renamed from: d */
    private final String f24402d;

    public C7286kb(AbstractC7287kc.EnumC7288a enumC7288a, AbstractC7151ie abstractC7151ie, C9828b c9828b, String str) {
        this.f24399a = enumC7288a;
        this.f24400b = abstractC7151ie;
        this.f24401c = c9828b;
        this.f24402d = str;
    }

    /* renamed from: a */
    public C7160ij m14938a() {
        C7160ij n = this.f24401c.m6864e().n();
        return this.f24399a == AbstractC7287kc.EnumC7288a.VALUE ? n : n.m15359f();
    }

    @Override // com.google.android.gms.internal.AbstractC7287kc
    /* renamed from: b */
    public void mo14934b() {
        this.f24400b.mo15137a(this);
    }

    /* renamed from: c */
    public C9828b m14937c() {
        return this.f24401c;
    }

    /* renamed from: d */
    public String m14936d() {
        return this.f24402d;
    }

    /* renamed from: e */
    public AbstractC7287kc.EnumC7288a m14935e() {
        return this.f24399a;
    }

    @Override // com.google.android.gms.internal.AbstractC7287kc
    public String toString() {
        if (this.f24399a == AbstractC7287kc.EnumC7288a.VALUE) {
            String valueOf = String.valueOf(m14938a());
            String valueOf2 = String.valueOf(this.f24399a);
            String valueOf3 = String.valueOf(this.f24401c.m6869a(true));
            return new StringBuilder(String.valueOf(valueOf).length() + 4 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length()).append(valueOf).append(": ").append(valueOf2).append(": ").append(valueOf3).toString();
        }
        String valueOf4 = String.valueOf(m14938a());
        String valueOf5 = String.valueOf(this.f24399a);
        String valueOf6 = String.valueOf(this.f24401c.m6863f());
        String valueOf7 = String.valueOf(this.f24401c.m6869a(true));
        return new StringBuilder(String.valueOf(valueOf4).length() + 10 + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length() + String.valueOf(valueOf7).length()).append(valueOf4).append(": ").append(valueOf5).append(": { ").append(valueOf6).append(": ").append(valueOf7).append(" }").toString();
    }
}
