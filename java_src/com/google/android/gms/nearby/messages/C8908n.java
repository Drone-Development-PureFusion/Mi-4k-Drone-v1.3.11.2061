package com.google.android.gms.nearby.messages;

import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.C4588d;
/* renamed from: com.google.android.gms.nearby.messages.n */
/* loaded from: classes2.dex */
public final class C8908n {

    /* renamed from: a */
    public static final C8908n f28389a = new C8910a().m9757a();

    /* renamed from: b */
    public final boolean f28390b;

    /* renamed from: c */
    private final Strategy f28391c;

    /* renamed from: d */
    private final MessageFilter f28392d;
    @Nullable

    /* renamed from: e */
    private final AbstractC8907m f28393e;

    /* renamed from: com.google.android.gms.nearby.messages.n$a */
    /* loaded from: classes2.dex */
    public static class C8910a {

        /* renamed from: a */
        private Strategy f28394a = Strategy.f28193i;

        /* renamed from: b */
        private MessageFilter f28395b = MessageFilter.f28177a;
        @Nullable

        /* renamed from: c */
        private AbstractC8907m f28396c;

        /* renamed from: a */
        public C8910a m9756a(MessageFilter messageFilter) {
            this.f28395b = messageFilter;
            return this;
        }

        /* renamed from: a */
        public C8910a m9755a(Strategy strategy) {
            this.f28394a = strategy;
            return this;
        }

        /* renamed from: a */
        public C8910a m9754a(AbstractC8907m abstractC8907m) {
            this.f28396c = (AbstractC8907m) C4588d.m23627a(abstractC8907m);
            return this;
        }

        /* renamed from: a */
        public C8908n m9757a() {
            return new C8908n(this.f28394a, this.f28395b, this.f28396c, false);
        }
    }

    private C8908n(Strategy strategy, MessageFilter messageFilter, @Nullable AbstractC8907m abstractC8907m, boolean z) {
        this.f28391c = strategy;
        this.f28392d = messageFilter;
        this.f28393e = abstractC8907m;
        this.f28390b = z;
    }

    /* renamed from: a */
    public Strategy m9760a() {
        return this.f28391c;
    }

    /* renamed from: b */
    public MessageFilter m9759b() {
        return this.f28392d;
    }

    @Nullable
    /* renamed from: c */
    public AbstractC8907m m9758c() {
        return this.f28393e;
    }
}
