package com.google.android.gms.internal;

import com.google.firebase.database.C9831c;
/* renamed from: com.google.android.gms.internal.jz */
/* loaded from: classes2.dex */
public class C7283jz implements AbstractC7287kc {

    /* renamed from: a */
    private final C7160ij f24391a;

    /* renamed from: b */
    private final AbstractC7151ie f24392b;

    /* renamed from: c */
    private final C9831c f24393c;

    public C7283jz(AbstractC7151ie abstractC7151ie, C9831c c9831c, C7160ij c7160ij) {
        this.f24392b = abstractC7151ie;
        this.f24391a = c7160ij;
        this.f24393c = c9831c;
    }

    /* renamed from: a */
    public C7160ij m14953a() {
        return this.f24391a;
    }

    @Override // com.google.android.gms.internal.AbstractC7287kc
    /* renamed from: b */
    public void mo14934b() {
        this.f24392b.mo15134a(this.f24393c);
    }

    @Override // com.google.android.gms.internal.AbstractC7287kc
    public String toString() {
        String valueOf = String.valueOf(m14953a());
        return new StringBuilder(String.valueOf(valueOf).length() + 7).append(valueOf).append(":CANCEL").toString();
    }
}
