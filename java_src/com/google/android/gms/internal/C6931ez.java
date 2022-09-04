package com.google.android.gms.internal;

import android.annotation.SuppressLint;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.C4487e;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.AbstractC9350c;
import com.google.android.gms.wallet.C9351d;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;
@SuppressLint({"MissingRemoteException"})
/* renamed from: com.google.android.gms.internal.ez */
/* loaded from: classes2.dex */
public class C6931ez implements AbstractC9350c {
    @Override // com.google.android.gms.wallet.AbstractC9350c
    /* renamed from: a */
    public AbstractC4494i<C4487e> mo8454a(AbstractC4489g abstractC4489g) {
        return abstractC4489g.mo17255a((AbstractC4489g) new C9351d.AbstractC9355b<C4487e>(abstractC4489g) { // from class: com.google.android.gms.internal.ez.7
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahn
            /* renamed from: a */
            public C4487e mo7807b(Status status) {
                return new C4487e(status, false);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.wallet.C9351d.AbstractC9355b, com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C6941fa c6941fa) {
                c6941fa.m15917a(IsReadyToPayRequest.m8565c().m8564a(), this);
            }
        });
    }

    @Override // com.google.android.gms.wallet.AbstractC9350c
    /* renamed from: a */
    public AbstractC4494i<C4487e> mo8451a(AbstractC4489g abstractC4489g, final IsReadyToPayRequest isReadyToPayRequest) {
        return abstractC4489g.mo17255a((AbstractC4489g) new C9351d.AbstractC9355b<C4487e>(abstractC4489g) { // from class: com.google.android.gms.internal.ez.8
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahn
            /* renamed from: a */
            public C4487e mo7807b(Status status) {
                return new C4487e(status, false);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.wallet.C9351d.AbstractC9355b, com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C6941fa c6941fa) {
                c6941fa.m15917a(isReadyToPayRequest, this);
            }
        });
    }

    @Override // com.google.android.gms.wallet.AbstractC9350c
    /* renamed from: a */
    public void mo8453a(AbstractC4489g abstractC4489g, final int i) {
        abstractC4489g.mo17255a((AbstractC4489g) new C9351d.AbstractC9356c(abstractC4489g) { // from class: com.google.android.gms.internal.ez.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.wallet.C9351d.AbstractC9355b, com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C6941fa c6941fa) {
                c6941fa.m15913c(i);
                b((C69321) Status.f16786a);
            }
        });
    }

    @Override // com.google.android.gms.wallet.AbstractC9350c
    /* renamed from: a */
    public void mo8452a(AbstractC4489g abstractC4489g, final FullWalletRequest fullWalletRequest, final int i) {
        abstractC4489g.mo17255a((AbstractC4489g) new C9351d.AbstractC9356c(abstractC4489g) { // from class: com.google.android.gms.internal.ez.3
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.wallet.C9351d.AbstractC9355b, com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C6941fa c6941fa) {
                c6941fa.m15918a(fullWalletRequest, i);
                b((C69343) Status.f16786a);
            }
        });
    }

    @Override // com.google.android.gms.wallet.AbstractC9350c
    /* renamed from: a */
    public void mo8450a(AbstractC4489g abstractC4489g, final MaskedWalletRequest maskedWalletRequest, final int i) {
        abstractC4489g.mo17255a((AbstractC4489g) new C9351d.AbstractC9356c(abstractC4489g) { // from class: com.google.android.gms.internal.ez.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.wallet.C9351d.AbstractC9355b, com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C6941fa c6941fa) {
                c6941fa.m15916a(maskedWalletRequest, i);
                b((C69332) Status.f16786a);
            }
        });
    }

    @Override // com.google.android.gms.wallet.AbstractC9350c
    /* renamed from: a */
    public void mo8449a(AbstractC4489g abstractC4489g, final NotifyTransactionStatusRequest notifyTransactionStatusRequest) {
        abstractC4489g.mo17255a((AbstractC4489g) new C9351d.AbstractC9356c(abstractC4489g) { // from class: com.google.android.gms.internal.ez.5
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.wallet.C9351d.AbstractC9355b, com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C6941fa c6941fa) {
                c6941fa.m15915a(notifyTransactionStatusRequest);
                b((C69365) Status.f16786a);
            }
        });
    }

    @Override // com.google.android.gms.wallet.AbstractC9350c
    /* renamed from: a */
    public void mo8448a(AbstractC4489g abstractC4489g, final String str, final String str2, final int i) {
        abstractC4489g.mo17255a((AbstractC4489g) new C9351d.AbstractC9356c(abstractC4489g) { // from class: com.google.android.gms.internal.ez.4
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.wallet.C9351d.AbstractC9355b, com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C6941fa c6941fa) {
                c6941fa.m15914a(str, str2, i);
                b((C69354) Status.f16786a);
            }
        });
    }

    @Override // com.google.android.gms.wallet.AbstractC9350c
    /* renamed from: b */
    public void mo8447b(AbstractC4489g abstractC4489g, final int i) {
        abstractC4489g.mo17255a((AbstractC4489g) new C9351d.AbstractC9356c(abstractC4489g) { // from class: com.google.android.gms.internal.ez.6
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.wallet.C9351d.AbstractC9355b, com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C6941fa c6941fa) {
                c6941fa.m15912d(i);
                b((C69376) Status.f16786a);
            }
        });
    }
}
