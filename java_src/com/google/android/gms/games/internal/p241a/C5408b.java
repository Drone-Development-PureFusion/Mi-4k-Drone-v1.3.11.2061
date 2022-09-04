package com.google.android.gms.games.internal.p241a;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.C5355c;
import com.google.android.gms.games.appcontent.AbstractC5351i;
import com.google.android.gms.games.internal.C5670d;
import com.google.android.gms.internal.ahl;
/* renamed from: com.google.android.gms.games.internal.a.b */
/* loaded from: classes2.dex */
public final class C5408b implements AbstractC5351i {

    /* renamed from: com.google.android.gms.games.internal.a.b$1 */
    /* loaded from: classes2.dex */
    class C54091 extends AbstractC5410a {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahl.AbstractC6343a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7809a(C5670d c5670d) {
            c5670d.m20185a((ahl.AbstractC6344b<AbstractC5351i.AbstractC5352a>) this, 0, (String) null, (String[]) null, false);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.a.b$a */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC5410a extends C5355c.AbstractC5363a<AbstractC5351i.AbstractC5352a> {
        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public AbstractC5351i.AbstractC5352a mo7807b(final Status status) {
            return new AbstractC5351i.AbstractC5352a() { // from class: com.google.android.gms.games.internal.a.b.a.1
                @Override // com.google.android.gms.common.api.AbstractC4502m
                /* renamed from: a */
                public Status mo7645a() {
                    return status;
                }

                @Override // com.google.android.gms.common.api.AbstractC4500k
                /* renamed from: b */
                public void mo7804b() {
                }
            };
        }
    }
}
