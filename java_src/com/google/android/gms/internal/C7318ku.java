package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC7339le;
import com.google.android.gms.internal.AbstractC7344lh;
/* renamed from: com.google.android.gms.internal.ku */
/* loaded from: classes2.dex */
public class C7318ku extends AbstractC7339le<C7318ku> {

    /* renamed from: a */
    private final boolean f24482a;

    public C7318ku(Boolean bool, AbstractC7344lh abstractC7344lh) {
        super(abstractC7344lh);
        this.f24482a = bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.AbstractC7339le
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public int mo14709a(C7318ku c7318ku) {
        if (this.f24482a == c7318ku.f24482a) {
            return 0;
        }
        return this.f24482a ? 1 : -1;
    }

    @Override // com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: a */
    public C7318ku mo14705b(AbstractC7344lh abstractC7344lh) {
        return new C7318ku(Boolean.valueOf(this.f24482a), abstractC7344lh);
    }

    @Override // com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: a */
    public Object mo14710a() {
        return Boolean.valueOf(this.f24482a);
    }

    @Override // com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: a */
    public String mo14708a(AbstractC7344lh.EnumC7346a enumC7346a) {
        String valueOf = String.valueOf(b(enumC7346a));
        return new StringBuilder(String.valueOf(valueOf).length() + 13).append(valueOf).append("boolean:").append(this.f24482a).toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7318ku)) {
            return false;
        }
        C7318ku c7318ku = (C7318ku) obj;
        return this.f24482a == c7318ku.f24482a && this.f24524b.equals(c7318ku.f24524b);
    }

    public int hashCode() {
        return (this.f24482a ? 1 : 0) + this.f24524b.hashCode();
    }

    @Override // com.google.android.gms.internal.AbstractC7339le
    /* renamed from: u_ */
    protected AbstractC7339le.EnumC7341a mo14704u_() {
        return AbstractC7339le.EnumC7341a.Boolean;
    }
}
