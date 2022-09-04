package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC7339le;
import com.google.android.gms.internal.AbstractC7344lh;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
/* renamed from: com.google.android.gms.internal.le */
/* loaded from: classes2.dex */
public abstract class AbstractC7339le<T extends AbstractC7339le> implements AbstractC7344lh {

    /* renamed from: c */
    static final /* synthetic */ boolean f24522c;

    /* renamed from: a */
    private String f24523a;

    /* renamed from: b */
    protected final AbstractC7344lh f24524b;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.google.android.gms.internal.le$a */
    /* loaded from: classes2.dex */
    public enum EnumC7341a {
        DeferredValue,
        Boolean,
        Number,
        String
    }

    static {
        f24522c = !AbstractC7339le.class.desiredAssertionStatus();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC7339le(AbstractC7344lh abstractC7344lh) {
        this.f24524b = abstractC7344lh;
    }

    /* renamed from: a */
    private static int m14760a(C7342lf c7342lf, C7333kz c7333kz) {
        return Double.valueOf(((Long) c7342lf.mo14710a()).longValue()).compareTo((Double) c7333kz.mo14710a());
    }

    /* renamed from: a */
    protected abstract int mo14709a(T t);

    @Override // com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: a */
    public AbstractC7344lh mo14750a(C7160ij c7160ij) {
        return c7160ij.m15356h() ? this : c7160ij.m15363d().m14822f() ? this.f24524b : C7335la.m14778j();
    }

    @Override // com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: a */
    public AbstractC7344lh mo14749a(C7160ij c7160ij, AbstractC7344lh abstractC7344lh) {
        C7319kv m15363d = c7160ij.m15363d();
        if (m15363d == null) {
            return abstractC7344lh;
        }
        if (abstractC7344lh.mo14739b() && !m15363d.m14822f()) {
            return this;
        }
        if (!f24522c && c7160ij.m15363d().m14822f() && c7160ij.m15355i() != 1) {
            throw new AssertionError();
        }
        return mo14748a(m15363d, C7335la.m14778j().mo14749a(c7160ij.m15361e(), abstractC7344lh));
    }

    @Override // com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: a */
    public AbstractC7344lh mo14748a(C7319kv c7319kv, AbstractC7344lh abstractC7344lh) {
        return c7319kv.m14822f() ? b(abstractC7344lh) : !abstractC7344lh.mo14739b() ? C7335la.m14778j().mo14748a(c7319kv, abstractC7344lh).mo14705b(this.f24524b) : this;
    }

    @Override // com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: a */
    public Object mo14747a(boolean z) {
        if (!z || this.f24524b.mo14739b()) {
            return a();
        }
        HashMap hashMap = new HashMap();
        hashMap.put(".value", a());
        hashMap.put(".priority", this.f24524b.mo14710a());
        return hashMap;
    }

    @Override // com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: a */
    public boolean mo14741a(C7319kv c7319kv) {
        return false;
    }

    /* renamed from: b */
    protected int m14759b(AbstractC7339le<?> abstractC7339le) {
        EnumC7341a mo14704u_ = mo14704u_();
        EnumC7341a mo14704u_2 = abstractC7339le.mo14704u_();
        return mo14704u_.equals(mo14704u_2) ? mo14709a((AbstractC7339le<T>) abstractC7339le) : mo14704u_.compareTo(mo14704u_2);
    }

    @Override // com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: b */
    public C7319kv mo14746b(C7319kv c7319kv) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public String m14758b(AbstractC7344lh.EnumC7346a enumC7346a) {
        switch (enumC7346a) {
            case V1:
            case V2:
                if (this.f24524b.mo14739b()) {
                    return "";
                }
                String valueOf = String.valueOf(this.f24524b.mo14708a(enumC7346a));
                return new StringBuilder(String.valueOf(valueOf).length() + 10).append("priority:").append(valueOf).append(":").toString();
            default:
                String valueOf2 = String.valueOf(enumC7346a);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf2).length() + 22).append("Unknown hash version: ").append(valueOf2).toString());
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: b */
    public boolean mo14739b() {
        return false;
    }

    @Override // com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: c */
    public int mo14745c() {
        return 0;
    }

    @Override // java.lang.Comparable
    /* renamed from: c */
    public int compareTo(AbstractC7344lh abstractC7344lh) {
        if (abstractC7344lh.mo14739b()) {
            return 1;
        }
        if (abstractC7344lh instanceof C7322kw) {
            return -1;
        }
        if (!f24522c && !abstractC7344lh.mo14743e()) {
            throw new AssertionError("Node is not leaf node!");
        }
        return (!(this instanceof C7342lf) || !(abstractC7344lh instanceof C7333kz)) ? (!(this instanceof C7333kz) || !(abstractC7344lh instanceof C7342lf)) ? m14759b((AbstractC7339le) abstractC7344lh) : m14760a((C7342lf) abstractC7344lh, (C7333kz) this) * (-1) : m14760a((C7342lf) this, (C7333kz) abstractC7344lh);
    }

    @Override // com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: c */
    public AbstractC7344lh mo14738c(C7319kv c7319kv) {
        return c7319kv.m14822f() ? this.f24524b : C7335la.m14778j();
    }

    @Override // com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: d */
    public String mo14744d() {
        if (this.f24523a == null) {
            this.f24523a = C7392mk.m14605b(a(AbstractC7344lh.EnumC7346a.V1));
        }
        return this.f24523a;
    }

    @Override // com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: e */
    public boolean mo14743e() {
        return true;
    }

    @Override // com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: f */
    public AbstractC7344lh mo14737f() {
        return this.f24524b;
    }

    @Override // com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: i */
    public Iterator<C7343lg> mo14742i() {
        return Collections.emptyList().iterator();
    }

    @Override // java.lang.Iterable
    public Iterator<C7343lg> iterator() {
        return Collections.emptyList().iterator();
    }

    public String toString() {
        String obj = mo14747a(true).toString();
        return obj.length() <= 100 ? obj : String.valueOf(obj.substring(0, 100)).concat("...");
    }

    /* renamed from: u_ */
    protected abstract EnumC7341a mo14704u_();
}
