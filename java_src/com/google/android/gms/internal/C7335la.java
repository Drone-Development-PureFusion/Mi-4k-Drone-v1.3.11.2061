package com.google.android.gms.internal;

import com.google.android.gms.internal.AbstractC7344lh;
import java.util.Collections;
import java.util.Iterator;
/* renamed from: com.google.android.gms.internal.la */
/* loaded from: classes2.dex */
public class C7335la extends C7322kw implements AbstractC7344lh {

    /* renamed from: c */
    private static final C7335la f24515c = new C7335la();

    private C7335la() {
    }

    /* renamed from: j */
    public static C7335la m14778j() {
        return f24515c;
    }

    @Override // com.google.android.gms.internal.C7322kw, java.lang.Comparable
    /* renamed from: a */
    public int compareTo(AbstractC7344lh abstractC7344lh) {
        return abstractC7344lh.mo14739b() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.C7322kw, com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: a */
    public AbstractC7344lh mo14750a(C7160ij c7160ij) {
        return this;
    }

    @Override // com.google.android.gms.internal.C7322kw, com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: a */
    public AbstractC7344lh mo14749a(C7160ij c7160ij, AbstractC7344lh abstractC7344lh) {
        if (c7160ij.m15356h()) {
            return abstractC7344lh;
        }
        C7319kv m15363d = c7160ij.m15363d();
        return mo14748a(m15363d, mo14738c(m15363d).mo14749a(c7160ij.m15361e(), abstractC7344lh));
    }

    @Override // com.google.android.gms.internal.C7322kw, com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: a */
    public AbstractC7344lh mo14748a(C7319kv c7319kv, AbstractC7344lh abstractC7344lh) {
        return (!abstractC7344lh.mo14739b() && !c7319kv.m14822f()) ? new C7322kw().mo14748a(c7319kv, abstractC7344lh) : this;
    }

    @Override // com.google.android.gms.internal.C7322kw, com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: a */
    public Object mo14710a() {
        return null;
    }

    @Override // com.google.android.gms.internal.C7322kw, com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: a */
    public Object mo14747a(boolean z) {
        return null;
    }

    @Override // com.google.android.gms.internal.C7322kw, com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: a */
    public String mo14708a(AbstractC7344lh.EnumC7346a enumC7346a) {
        return "";
    }

    @Override // com.google.android.gms.internal.C7322kw, com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: a */
    public boolean mo14741a(C7319kv c7319kv) {
        return false;
    }

    @Override // com.google.android.gms.internal.C7322kw, com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: b */
    public C7319kv mo14746b(C7319kv c7319kv) {
        return null;
    }

    @Override // com.google.android.gms.internal.C7322kw, com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: b */
    public boolean mo14739b() {
        return true;
    }

    @Override // com.google.android.gms.internal.C7322kw, com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: c */
    public int mo14745c() {
        return 0;
    }

    @Override // com.google.android.gms.internal.C7322kw, com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: c */
    public C7335la mo14705b(AbstractC7344lh abstractC7344lh) {
        return this;
    }

    @Override // com.google.android.gms.internal.C7322kw, com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: c */
    public AbstractC7344lh mo14738c(C7319kv c7319kv) {
        return this;
    }

    @Override // com.google.android.gms.internal.C7322kw, com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: d */
    public String mo14744d() {
        return "";
    }

    @Override // com.google.android.gms.internal.C7322kw, com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: e */
    public boolean mo14743e() {
        return false;
    }

    @Override // com.google.android.gms.internal.C7322kw
    public boolean equals(Object obj) {
        if (obj instanceof C7335la) {
            return true;
        }
        return (obj instanceof AbstractC7344lh) && ((AbstractC7344lh) obj).mo14739b() && mo14737f().equals(((AbstractC7344lh) obj).mo14737f());
    }

    @Override // com.google.android.gms.internal.C7322kw, com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: f */
    public AbstractC7344lh mo14737f() {
        return this;
    }

    @Override // com.google.android.gms.internal.C7322kw
    public int hashCode() {
        return 0;
    }

    @Override // com.google.android.gms.internal.C7322kw, com.google.android.gms.internal.AbstractC7344lh
    /* renamed from: i */
    public Iterator<C7343lg> mo14742i() {
        return Collections.emptyList().iterator();
    }

    @Override // com.google.android.gms.internal.C7322kw, java.lang.Iterable
    public Iterator<C7343lg> iterator() {
        return Collections.emptyList().iterator();
    }

    @Override // com.google.android.gms.internal.C7322kw
    public String toString() {
        return "<Empty Node>";
    }
}
