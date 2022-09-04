package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC7339le;
import com.google.android.gms.internal.AbstractC7344lh;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.ky */
/* loaded from: classes2.dex */
public class C7332ky extends AbstractC7339le<C7332ky> {

    /* renamed from: a */
    static final /* synthetic */ boolean f24511a;

    /* renamed from: e */
    private Map<Object, Object> f24512e;

    static {
        f24511a = !C7332ky.class.desiredAssertionStatus();
    }

    public C7332ky(Map<Object, Object> map, AbstractC7344lh abstractC7344lh) {
        super(abstractC7344lh);
        this.f24512e = map;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.AbstractC7339le
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public int mo14709a(C7332ky c7332ky) {
        return 0;
    }

    @Override // com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: a */
    public C7332ky mo14705b(AbstractC7344lh abstractC7344lh) {
        if (f24511a || C7350ll.m14729a(abstractC7344lh)) {
            return new C7332ky(this.f24512e, abstractC7344lh);
        }
        throw new AssertionError();
    }

    @Override // com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: a */
    public Object mo14710a() {
        return this.f24512e;
    }

    @Override // com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: a */
    public String mo14708a(AbstractC7344lh.EnumC7346a enumC7346a) {
        String valueOf = String.valueOf(b(enumC7346a));
        String valueOf2 = String.valueOf(this.f24512e);
        return new StringBuilder(String.valueOf(valueOf).length() + 14 + String.valueOf(valueOf2).length()).append(valueOf).append("deferredValue:").append(valueOf2).toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7332ky)) {
            return false;
        }
        C7332ky c7332ky = (C7332ky) obj;
        return this.f24512e.equals(c7332ky.f24512e) && this.f24524b.equals(c7332ky.f24524b);
    }

    public int hashCode() {
        return this.f24512e.hashCode() + this.f24524b.hashCode();
    }

    @Override // com.google.android.gms.internal.AbstractC7339le
    /* renamed from: u_ */
    protected AbstractC7339le.EnumC7341a mo14704u_() {
        return AbstractC7339le.EnumC7341a.DeferredValue;
    }
}
