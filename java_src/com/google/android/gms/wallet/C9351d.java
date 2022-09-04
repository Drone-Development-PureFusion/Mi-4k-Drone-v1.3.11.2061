package com.google.android.gms.wallet;

import android.content.Context;
import android.os.Looper;
import android.support.annotation.VisibleForTesting;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.internal.C6931ez;
import com.google.android.gms.internal.C6941fa;
import com.google.android.gms.internal.C6947fc;
import com.google.android.gms.internal.C6948fd;
import com.google.android.gms.internal.ahl;
import com.google.android.gms.wallet.firstparty.AbstractC9361b;
import com.google.android.gms.wallet.wobs.AbstractC9425j;
import java.util.Locale;
/* renamed from: com.google.android.gms.wallet.d */
/* loaded from: classes.dex */
public final class C9351d {

    /* renamed from: e */
    private static final C4467a.C4478g<C6941fa> f29575e = new C4467a.C4478g<>();

    /* renamed from: f */
    private static final C4467a.AbstractC4473b<C6941fa, C9353a> f29576f = new C4467a.AbstractC4473b<C6941fa, C9353a>() { // from class: com.google.android.gms.wallet.d.1
        @Override // com.google.android.gms.common.api.C4467a.AbstractC4473b
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public C6941fa mo7438a(Context context, Looper looper, C4626s c4626s, C9353a c9353a, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
            if (c9353a == null) {
                c9353a = new C9353a();
            }
            return new C6941fa(context, looper, c4626s, abstractC4491b, abstractC4492c, c9353a.f29577a, c9353a.f29578b, c9353a.f29579c);
        }
    };

    /* renamed from: a */
    public static final C4467a<C9353a> f29571a = new C4467a<>("Wallet.API", f29576f, f29575e);

    /* renamed from: b */
    public static final AbstractC9350c f29572b = new C6931ez();

    /* renamed from: c */
    public static final AbstractC9425j f29573c = new C6948fd();

    /* renamed from: d */
    public static final AbstractC9361b f29574d = new C6947fc();

    /* renamed from: com.google.android.gms.wallet.d$a */
    /* loaded from: classes2.dex */
    public static final class C9353a implements C4467a.AbstractC4468a.AbstractC4469a {

        /* renamed from: a */
        public final int f29577a;

        /* renamed from: b */
        public final int f29578b;
        @VisibleForTesting

        /* renamed from: c */
        final boolean f29579c;

        /* renamed from: com.google.android.gms.wallet.d$a$a */
        /* loaded from: classes.dex */
        public static final class C9354a {

            /* renamed from: a */
            private int f29580a = 3;

            /* renamed from: b */
            private int f29581b = 0;

            /* renamed from: c */
            private boolean f29582c = true;

            @Deprecated
            /* renamed from: a */
            public C9354a m8440a() {
                this.f29582c = false;
                return this;
            }

            /* renamed from: a */
            public C9354a m8439a(int i) {
                if (i == 0 || i == 2 || i == 1 || i == 3) {
                    this.f29580a = i;
                    return this;
                }
                throw new IllegalArgumentException(String.format(Locale.US, "Invalid environment value %d", Integer.valueOf(i)));
            }

            /* renamed from: b */
            public C9354a m8436b(int i) {
                if (i == 0 || i == 1) {
                    this.f29581b = i;
                    return this;
                }
                throw new IllegalArgumentException(String.format(Locale.US, "Invalid theme value %d", Integer.valueOf(i)));
            }

            /* renamed from: b */
            public C9353a m8437b() {
                return new C9353a(this);
            }
        }

        private C9353a() {
            this(new C9354a());
        }

        private C9353a(C9354a c9354a) {
            this.f29577a = c9354a.f29580a;
            this.f29578b = c9354a.f29581b;
            this.f29579c = c9354a.f29582c;
        }
    }

    /* renamed from: com.google.android.gms.wallet.d$b */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC9355b<R extends AbstractC4502m> extends ahl.AbstractC6343a<R, C6941fa> {
        public AbstractC9355b(AbstractC4489g abstractC4489g) {
            super(C9351d.f29571a, abstractC4489g);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.android.gms.internal.ahl.AbstractC6343a
        @VisibleForTesting
        /* renamed from: a */
        public abstract void mo7809a(C6941fa c6941fa);
    }

    /* renamed from: com.google.android.gms.wallet.d$c */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC9356c extends AbstractC9355b<Status> {
        public AbstractC9356c(AbstractC4489g abstractC4489g) {
            super(abstractC4489g);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public Status mo7807b(Status status) {
            return status;
        }
    }

    private C9351d() {
    }

    @Deprecated
    /* renamed from: a */
    public static void m8446a(AbstractC4489g abstractC4489g, int i) {
        f29572b.mo8453a(abstractC4489g, i);
    }

    @Deprecated
    /* renamed from: a */
    public static void m8445a(AbstractC4489g abstractC4489g, FullWalletRequest fullWalletRequest, int i) {
        f29572b.mo8452a(abstractC4489g, fullWalletRequest, i);
    }

    @Deprecated
    /* renamed from: a */
    public static void m8444a(AbstractC4489g abstractC4489g, MaskedWalletRequest maskedWalletRequest, int i) {
        f29572b.mo8450a(abstractC4489g, maskedWalletRequest, i);
    }

    @Deprecated
    /* renamed from: a */
    public static void m8443a(AbstractC4489g abstractC4489g, NotifyTransactionStatusRequest notifyTransactionStatusRequest) {
        f29572b.mo8449a(abstractC4489g, notifyTransactionStatusRequest);
    }

    @Deprecated
    /* renamed from: a */
    public static void m8442a(AbstractC4489g abstractC4489g, String str, String str2, int i) {
        f29572b.mo8448a(abstractC4489g, str, str2, i);
    }
}
