package com.google.android.gms.internal;

import android.annotation.SuppressLint;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.AbstractC8940b;
import com.google.android.gms.plus.C8943c;
import com.google.android.gms.plus.internal.C8968e;
import com.google.android.gms.plus.p249a.p250a.AbstractC8923a;
import com.google.android.gms.plus.p249a.p250a.C8939b;
import java.util.Collection;
/* loaded from: classes2.dex */
public final class ans implements AbstractC8940b {

    /* renamed from: com.google.android.gms.internal.ans$a */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC6653a extends C8943c.AbstractC8947b<AbstractC8940b.AbstractC8941a> {
        private AbstractC6653a(AbstractC4489g abstractC4489g) {
            super(abstractC4489g);
        }

        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public AbstractC8940b.AbstractC8941a mo7807b(final Status status) {
            return new AbstractC8940b.AbstractC8941a() { // from class: com.google.android.gms.internal.ans.a.1
                @Override // com.google.android.gms.common.api.AbstractC4502m
                /* renamed from: a */
                public Status mo7645a() {
                    return status;
                }

                @Override // com.google.android.gms.common.api.AbstractC4500k
                /* renamed from: b */
                public void mo7804b() {
                }

                @Override // com.google.android.gms.plus.AbstractC8940b.AbstractC8941a
                /* renamed from: c */
                public C8939b mo9622c() {
                    return null;
                }

                @Override // com.google.android.gms.plus.AbstractC8940b.AbstractC8941a
                /* renamed from: d */
                public String mo9621d() {
                    return null;
                }
            };
        }
    }

    @Override // com.google.android.gms.plus.AbstractC8940b
    @SuppressLint({"MissingRemoteException"})
    /* renamed from: a */
    public AbstractC4494i<AbstractC8940b.AbstractC8941a> mo9712a(AbstractC4489g abstractC4489g, final int i, final String str) {
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC6653a(abstractC4489g) { // from class: com.google.android.gms.internal.ans.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C8968e c8968e) {
                a(c8968e.m9631a(this, i, str));
            }
        });
    }

    @Override // com.google.android.gms.plus.AbstractC8940b
    @SuppressLint({"MissingRemoteException"})
    /* renamed from: a */
    public AbstractC4494i<AbstractC8940b.AbstractC8941a> mo9711a(AbstractC4489g abstractC4489g, final String str) {
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC6653a(abstractC4489g) { // from class: com.google.android.gms.internal.ans.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C8968e c8968e) {
                a(c8968e.m9630a(this, str));
            }
        });
    }

    @Override // com.google.android.gms.plus.AbstractC8940b
    @SuppressLint({"MissingRemoteException"})
    /* renamed from: a */
    public AbstractC4494i<AbstractC8940b.AbstractC8941a> mo9710a(AbstractC4489g abstractC4489g, final Collection<String> collection) {
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC6653a(abstractC4489g) { // from class: com.google.android.gms.internal.ans.4
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C8968e c8968e) {
                c8968e.m9629a(this, collection);
            }
        });
    }

    @Override // com.google.android.gms.plus.AbstractC8940b
    @SuppressLint({"MissingRemoteException"})
    /* renamed from: a */
    public AbstractC4494i<AbstractC8940b.AbstractC8941a> mo9709a(AbstractC4489g abstractC4489g, final String... strArr) {
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC6653a(abstractC4489g) { // from class: com.google.android.gms.internal.ans.5
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C8968e c8968e) {
                c8968e.m9628a(this, strArr);
            }
        });
    }

    @Override // com.google.android.gms.plus.AbstractC8940b
    /* renamed from: a */
    public AbstractC8923a mo9713a(AbstractC4489g abstractC4489g) {
        return C8943c.m9707a(abstractC4489g, true).m9624i();
    }

    @Override // com.google.android.gms.plus.AbstractC8940b
    @SuppressLint({"MissingRemoteException"})
    /* renamed from: b */
    public AbstractC4494i<AbstractC8940b.AbstractC8941a> mo9708b(AbstractC4489g abstractC4489g) {
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC6653a(abstractC4489g) { // from class: com.google.android.gms.internal.ans.3
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C8968e c8968e) {
                c8968e.m9632a(this);
            }
        });
    }
}
