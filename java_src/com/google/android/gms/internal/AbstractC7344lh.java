package com.google.android.gms.internal;

import java.util.Iterator;
/* renamed from: com.google.android.gms.internal.lh */
/* loaded from: classes2.dex */
public interface AbstractC7344lh extends Comparable<AbstractC7344lh>, Iterable<C7343lg> {

    /* renamed from: d */
    public static final C7322kw f24536d = new C7322kw() { // from class: com.google.android.gms.internal.lh.1
        @Override // com.google.android.gms.internal.C7322kw, java.lang.Comparable
        /* renamed from: a */
        public int compareTo(AbstractC7344lh abstractC7344lh) {
            return abstractC7344lh == this ? 0 : 1;
        }

        @Override // com.google.android.gms.internal.C7322kw, com.google.android.gms.internal.AbstractC7344lh
        /* renamed from: a */
        public boolean mo14741a(C7319kv c7319kv) {
            return false;
        }

        @Override // com.google.android.gms.internal.C7322kw, com.google.android.gms.internal.AbstractC7344lh
        /* renamed from: b */
        public boolean mo14739b() {
            return false;
        }

        @Override // com.google.android.gms.internal.C7322kw, com.google.android.gms.internal.AbstractC7344lh
        /* renamed from: c */
        public AbstractC7344lh mo14738c(C7319kv c7319kv) {
            return c7319kv.m14822f() ? mo14737f() : C7335la.m14778j();
        }

        @Override // com.google.android.gms.internal.C7322kw
        public boolean equals(Object obj) {
            return obj == this;
        }

        @Override // com.google.android.gms.internal.C7322kw, com.google.android.gms.internal.AbstractC7344lh
        /* renamed from: f */
        public AbstractC7344lh mo14737f() {
            return this;
        }

        @Override // com.google.android.gms.internal.C7322kw
        public String toString() {
            return "<Max Node>";
        }
    };

    /* renamed from: com.google.android.gms.internal.lh$a */
    /* loaded from: classes2.dex */
    public enum EnumC7346a {
        V1,
        V2
    }

    /* renamed from: a */
    AbstractC7344lh mo14750a(C7160ij c7160ij);

    /* renamed from: a */
    AbstractC7344lh mo14749a(C7160ij c7160ij, AbstractC7344lh abstractC7344lh);

    /* renamed from: a */
    AbstractC7344lh mo14748a(C7319kv c7319kv, AbstractC7344lh abstractC7344lh);

    /* renamed from: a */
    Object mo14710a();

    /* renamed from: a */
    Object mo14747a(boolean z);

    /* renamed from: a */
    String mo14708a(EnumC7346a enumC7346a);

    /* renamed from: a */
    boolean mo14741a(C7319kv c7319kv);

    /* renamed from: b */
    C7319kv mo14746b(C7319kv c7319kv);

    /* renamed from: b */
    AbstractC7344lh mo14705b(AbstractC7344lh abstractC7344lh);

    /* renamed from: b */
    boolean mo14739b();

    /* renamed from: c */
    int mo14745c();

    /* renamed from: c */
    AbstractC7344lh mo14738c(C7319kv c7319kv);

    /* renamed from: d */
    String mo14744d();

    /* renamed from: e */
    boolean mo14743e();

    /* renamed from: f */
    AbstractC7344lh mo14737f();

    /* renamed from: i */
    Iterator<C7343lg> mo14742i();
}
