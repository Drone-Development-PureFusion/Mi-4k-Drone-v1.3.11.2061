package com.google.android.gms.plus;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.C4538f;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.common.util.C4699v;
import com.google.android.gms.internal.ahl;
import com.google.android.gms.internal.anp;
import com.google.android.gms.internal.anq;
import com.google.android.gms.internal.anr;
import com.google.android.gms.internal.ans;
import com.google.android.gms.plus.internal.C8968e;
import com.google.android.gms.plus.internal.PlusCommonExtras;
import com.google.android.gms.plus.internal.PlusSession;
import java.util.HashSet;
import java.util.Set;
@Deprecated
/* renamed from: com.google.android.gms.plus.c */
/* loaded from: classes.dex */
public final class C8943c {

    /* renamed from: a */
    public static final C4467a.C4478g<C8968e> f28463a = new C4467a.C4478g<>();

    /* renamed from: b */
    static final C4467a.AbstractC4473b<C8968e, C8945a> f28464b = new C4467a.AbstractC4473b<C8968e, C8945a>() { // from class: com.google.android.gms.plus.c.1
        @Override // com.google.android.gms.common.api.C4467a.AbstractC4476e
        /* renamed from: a */
        public int mo9706a() {
            return 2;
        }

        @Override // com.google.android.gms.common.api.C4467a.AbstractC4473b
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public C8968e mo7438a(Context context, Looper looper, C4626s c4626s, C8945a c8945a, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
            if (c8945a == null) {
                c8945a = new C8945a();
            }
            return new C8968e(context, looper, c4626s, new PlusSession(c4626s.m23532c().name, C4699v.m23095a(c4626s.m23529f()), (String[]) c8945a.f28473b.toArray(new String[0]), new String[0], context.getPackageName(), context.getPackageName(), null, new PlusCommonExtras()), abstractC4491b, abstractC4492c);
        }
    };
    @Deprecated

    /* renamed from: c */
    public static final C4467a<C8945a> f28465c = new C4467a<>("Plus.API", f28464b, f28463a);

    /* renamed from: d */
    public static final Scope f28466d = new Scope(C4538f.f16923c);

    /* renamed from: e */
    public static final Scope f28467e = new Scope(C4538f.f16925e);
    @Deprecated

    /* renamed from: f */
    public static final AbstractC8940b f28468f = new ans();
    @Deprecated

    /* renamed from: g */
    public static final AbstractC8922a f28469g = new anp();
    @Deprecated

    /* renamed from: h */
    public static final AbstractC8957g f28470h = new anr();

    /* renamed from: i */
    public static final AbstractC8956f f28471i = new anq();

    /* renamed from: com.google.android.gms.plus.c$a */
    /* loaded from: classes2.dex */
    public static final class C8945a implements C4467a.AbstractC4468a.AbstractC4472d {

        /* renamed from: a */
        final String f28472a;

        /* renamed from: b */
        final Set<String> f28473b;

        /* renamed from: com.google.android.gms.plus.c$a$a */
        /* loaded from: classes2.dex */
        public static final class C8946a {

            /* renamed from: a */
            String f28474a;

            /* renamed from: b */
            final Set<String> f28475b = new HashSet();

            /* renamed from: a */
            public C8946a m9702a(String str) {
                this.f28474a = str;
                return this;
            }

            /* renamed from: a */
            public C8946a m9701a(String... strArr) {
                C4588d.m23626a(strArr, "activityTypes may not be null.");
                for (String str : strArr) {
                    this.f28475b.add(str);
                }
                return this;
            }

            /* renamed from: a */
            public C8945a m9703a() {
                return new C8945a(this);
            }
        }

        private C8945a() {
            this.f28472a = null;
            this.f28473b = new HashSet();
        }

        private C8945a(C8946a c8946a) {
            this.f28472a = c8946a.f28474a;
            this.f28473b = c8946a.f28475b;
        }

        /* renamed from: a */
        public static C8946a m9704a() {
            return new C8946a();
        }
    }

    /* renamed from: com.google.android.gms.plus.c$b */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC8947b<R extends AbstractC4502m> extends ahl.AbstractC6343a<R, C8968e> {
        public AbstractC8947b(AbstractC4489g abstractC4489g) {
            super(C8943c.f28463a, abstractC4489g);
        }
    }

    private C8943c() {
    }

    /* renamed from: a */
    public static C8968e m9707a(AbstractC4489g abstractC4489g, boolean z) {
        C4588d.m23618b(abstractC4489g != null, "GoogleApiClient parameter is required.");
        C4588d.m23622a(abstractC4489g.mo17353j(), "GoogleApiClient must be connected.");
        C4588d.m23622a(abstractC4489g.mo17382a((C4467a<?>) f28465c), "GoogleApiClient is not configured to use the Plus.API Api. Pass this into GoogleApiClient.Builder#addApi() to use this feature.");
        boolean mo17369b = abstractC4489g.mo17369b(f28465c);
        if (!z || mo17369b) {
            if (!mo17369b) {
                return null;
            }
            return (C8968e) abstractC4489g.mo17383a((C4467a.C4475d<C4467a.AbstractC4477f>) f28463a);
        }
        throw new IllegalStateException("GoogleApiClient has an optional Plus.API and is not connected to Plus. Use GoogleApiClient.hasConnectedApi(Plus.API) to guard this call.");
    }
}
