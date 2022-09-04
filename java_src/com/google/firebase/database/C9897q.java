package com.google.firebase.database;

import com.google.android.gms.internal.AbstractC7344lh;
/* renamed from: com.google.firebase.database.q */
/* loaded from: classes2.dex */
public class C9897q {

    /* renamed from: com.google.firebase.database.q$a */
    /* loaded from: classes2.dex */
    public interface AbstractC9899a {
        /* renamed from: a */
        C9900b m6648a(C9880k c9880k);

        /* renamed from: a */
        void m6649a(C9831c c9831c, boolean z, C9828b c9828b);
    }

    /* renamed from: com.google.firebase.database.q$b */
    /* loaded from: classes2.dex */
    public static class C9900b {

        /* renamed from: a */
        private boolean f30776a;

        /* renamed from: b */
        private AbstractC7344lh f30777b;

        private C9900b(boolean z, AbstractC7344lh abstractC7344lh) {
            this.f30776a = z;
            this.f30777b = abstractC7344lh;
        }

        /* renamed from: a */
        public boolean m6647a() {
            return this.f30776a;
        }

        /* renamed from: b */
        public AbstractC7344lh m6646b() {
            return this.f30777b;
        }
    }

    /* renamed from: a */
    public static C9900b m6651a() {
        return new C9900b(false, null);
    }

    /* renamed from: a */
    public static C9900b m6650a(C9880k c9880k) {
        return new C9900b(true, c9880k.m6729a());
    }
}
