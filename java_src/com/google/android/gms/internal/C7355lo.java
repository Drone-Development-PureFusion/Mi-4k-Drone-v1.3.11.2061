package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC7339le;
import com.google.android.gms.internal.AbstractC7344lh;
/* renamed from: com.google.android.gms.internal.lo */
/* loaded from: classes2.dex */
public class C7355lo extends AbstractC7339le<C7355lo> {

    /* renamed from: a */
    private final String f24551a;

    public C7355lo(String str, AbstractC7344lh abstractC7344lh) {
        super(abstractC7344lh);
        this.f24551a = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.AbstractC7339le
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public int mo14709a(C7355lo c7355lo) {
        return this.f24551a.compareTo(c7355lo.f24551a);
    }

    @Override // com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: a */
    public C7355lo mo14705b(AbstractC7344lh abstractC7344lh) {
        return new C7355lo(this.f24551a, abstractC7344lh);
    }

    @Override // com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: a */
    public Object mo14710a() {
        return this.f24551a;
    }

    @Override // com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: a */
    public String mo14708a(AbstractC7344lh.EnumC7346a enumC7346a) {
        switch (enumC7346a) {
            case V1:
                String valueOf = String.valueOf(b(enumC7346a));
                String str = this.f24551a;
                return new StringBuilder(String.valueOf(valueOf).length() + 7 + String.valueOf(str).length()).append(valueOf).append("string:").append(str).toString();
            case V2:
                String valueOf2 = String.valueOf(b(enumC7346a));
                String valueOf3 = String.valueOf(C7392mk.m14604c(this.f24551a));
                return new StringBuilder(String.valueOf(valueOf2).length() + 7 + String.valueOf(valueOf3).length()).append(valueOf2).append("string:").append(valueOf3).toString();
            default:
                String valueOf4 = String.valueOf(enumC7346a);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf4).length() + 38).append("Invalid hash version for string node: ").append(valueOf4).toString());
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7355lo)) {
            return false;
        }
        C7355lo c7355lo = (C7355lo) obj;
        return this.f24551a.equals(c7355lo.f24551a) && this.f24524b.equals(c7355lo.f24524b);
    }

    public int hashCode() {
        return this.f24551a.hashCode() + this.f24524b.hashCode();
    }

    @Override // com.google.android.gms.internal.AbstractC7339le
    /* renamed from: u_ */
    protected AbstractC7339le.EnumC7341a mo14704u_() {
        return AbstractC7339le.EnumC7341a.String;
    }
}
