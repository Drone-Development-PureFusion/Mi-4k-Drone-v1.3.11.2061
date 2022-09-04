package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC7339le;
import com.google.android.gms.internal.AbstractC7344lh;
/* renamed from: com.google.android.gms.internal.kz */
/* loaded from: classes2.dex */
public class C7333kz extends AbstractC7339le<C7333kz> {

    /* renamed from: a */
    static final /* synthetic */ boolean f24513a;

    /* renamed from: e */
    private final Double f24514e;

    static {
        f24513a = !C7333kz.class.desiredAssertionStatus();
    }

    public C7333kz(Double d, AbstractC7344lh abstractC7344lh) {
        super(abstractC7344lh);
        this.f24514e = d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.AbstractC7339le
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public int mo14709a(C7333kz c7333kz) {
        return this.f24514e.compareTo(c7333kz.f24514e);
    }

    @Override // com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: a */
    public C7333kz mo14705b(AbstractC7344lh abstractC7344lh) {
        if (f24513a || C7350ll.m14729a(abstractC7344lh)) {
            return new C7333kz(this.f24514e, abstractC7344lh);
        }
        throw new AssertionError();
    }

    @Override // com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: a */
    public Object mo14710a() {
        return this.f24514e;
    }

    @Override // com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: a */
    public String mo14708a(AbstractC7344lh.EnumC7346a enumC7346a) {
        String valueOf = String.valueOf(String.valueOf(b(enumC7346a)).concat("number:"));
        String valueOf2 = String.valueOf(C7392mk.m14612a(this.f24514e.doubleValue()));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7333kz)) {
            return false;
        }
        C7333kz c7333kz = (C7333kz) obj;
        return this.f24514e.equals(c7333kz.f24514e) && this.f24524b.equals(c7333kz.f24524b);
    }

    public int hashCode() {
        return this.f24514e.hashCode() + this.f24524b.hashCode();
    }

    @Override // com.google.android.gms.internal.AbstractC7339le
    /* renamed from: u_ */
    protected AbstractC7339le.EnumC7341a mo14704u_() {
        return AbstractC7339le.EnumC7341a.Number;
    }
}
