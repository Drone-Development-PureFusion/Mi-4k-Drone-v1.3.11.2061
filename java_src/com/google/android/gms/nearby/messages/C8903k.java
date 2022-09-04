package com.google.android.gms.nearby.messages;

import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.C4588d;
/* renamed from: com.google.android.gms.nearby.messages.k */
/* loaded from: classes2.dex */
public final class C8903k {

    /* renamed from: a */
    public static final C8903k f28384a = new C8905a().m9765a();

    /* renamed from: b */
    private final Strategy f28385b;
    @Nullable

    /* renamed from: c */
    private final AbstractC8902j f28386c;

    /* renamed from: com.google.android.gms.nearby.messages.k$a */
    /* loaded from: classes2.dex */
    public static class C8905a {

        /* renamed from: a */
        private Strategy f28387a = Strategy.f28193i;
        @Nullable

        /* renamed from: b */
        private AbstractC8902j f28388b;

        /* renamed from: a */
        public C8905a m9764a(Strategy strategy) {
            this.f28387a = (Strategy) C4588d.m23627a(strategy);
            return this;
        }

        /* renamed from: a */
        public C8905a m9763a(AbstractC8902j abstractC8902j) {
            this.f28388b = (AbstractC8902j) C4588d.m23627a(abstractC8902j);
            return this;
        }

        /* renamed from: a */
        public C8903k m9765a() {
            return new C8903k(this.f28387a, this.f28388b);
        }
    }

    private C8903k(Strategy strategy, @Nullable AbstractC8902j abstractC8902j) {
        this.f28385b = strategy;
        this.f28386c = abstractC8902j;
    }

    /* renamed from: a */
    public Strategy m9767a() {
        return this.f28385b;
    }

    @Nullable
    /* renamed from: b */
    public AbstractC8902j m9766b() {
        return this.f28386c;
    }
}
