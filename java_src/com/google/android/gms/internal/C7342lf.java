package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC7339le;
import com.google.android.gms.internal.AbstractC7344lh;
/* renamed from: com.google.android.gms.internal.lf */
/* loaded from: classes2.dex */
public class C7342lf extends AbstractC7339le<C7342lf> {

    /* renamed from: a */
    private final long f24531a;

    public C7342lf(Long l, AbstractC7344lh abstractC7344lh) {
        super(abstractC7344lh);
        this.f24531a = l.longValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.AbstractC7339le
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public int mo14709a(C7342lf c7342lf) {
        return C7392mk.m14610a(this.f24531a, c7342lf.f24531a);
    }

    @Override // com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: a */
    public C7342lf mo14705b(AbstractC7344lh abstractC7344lh) {
        return new C7342lf(Long.valueOf(this.f24531a), abstractC7344lh);
    }

    @Override // com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: a */
    public Object mo14710a() {
        return Long.valueOf(this.f24531a);
    }

    @Override // com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: a */
    public String mo14708a(AbstractC7344lh.EnumC7346a enumC7346a) {
        String valueOf = String.valueOf(String.valueOf(b(enumC7346a)).concat("number:"));
        String valueOf2 = String.valueOf(C7392mk.m14612a(this.f24531a));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7342lf)) {
            return false;
        }
        C7342lf c7342lf = (C7342lf) obj;
        return this.f24531a == c7342lf.f24531a && this.f24524b.equals(c7342lf.f24524b);
    }

    public int hashCode() {
        return ((int) (this.f24531a ^ (this.f24531a >>> 32))) + this.f24524b.hashCode();
    }

    @Override // com.google.android.gms.internal.AbstractC7339le
    /* renamed from: u_ */
    protected AbstractC7339le.EnumC7341a mo14704u_() {
        return AbstractC7339le.EnumC7341a.Number;
    }
}
