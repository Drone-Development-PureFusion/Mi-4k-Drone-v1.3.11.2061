package com.google.android.gms.internal;

import android.support.annotation.NonNull;
import com.google.android.gms.internal.AbstractC7136hy;
import com.google.android.gms.p239g.AbstractC5282c;
import com.google.android.gms.p239g.AbstractC5283d;
import com.google.firebase.C9653a;
import com.google.firebase.C9751b;
import com.google.firebase.auth.C9741o;
import java.util.concurrent.ScheduledExecutorService;
/* renamed from: com.google.android.gms.internal.gu */
/* loaded from: classes2.dex */
public class C7052gu implements AbstractC7136hy {

    /* renamed from: a */
    private final ScheduledExecutorService f23811a;

    /* renamed from: b */
    private final C9751b f23812b;

    public C7052gu(@NonNull C9751b c9751b, @NonNull ScheduledExecutorService scheduledExecutorService) {
        this.f23812b = c9751b;
        this.f23811a = scheduledExecutorService;
    }

    /* renamed from: b */
    private C9751b.AbstractC9752a m15700b(final AbstractC7136hy.AbstractC7138b abstractC7138b) {
        return new C9751b.AbstractC9752a() { // from class: com.google.android.gms.internal.gu.3
            @Override // com.google.firebase.C9751b.AbstractC9752a
            /* renamed from: a */
            public void mo7192a(@NonNull final C7415mr c7415mr) {
                C7052gu.this.f23811a.execute(new Runnable() { // from class: com.google.android.gms.internal.gu.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        abstractC7138b.mo15282a(c7415mr.m14547a());
                    }
                });
            }
        };
    }

    @Override // com.google.android.gms.internal.AbstractC7136hy
    /* renamed from: a */
    public void mo15438a(AbstractC7136hy.AbstractC7138b abstractC7138b) {
        this.f23812b.m7218a(m15700b(abstractC7138b));
    }

    @Override // com.google.android.gms.internal.AbstractC7136hy
    /* renamed from: a */
    public void mo15437a(boolean z, @NonNull final AbstractC7136hy.AbstractC7137a abstractC7137a) {
        this.f23812b.m7209b(z).mo7015a(this.f23811a, new AbstractC5283d<C9741o>() { // from class: com.google.android.gms.internal.gu.2
            @Override // com.google.android.gms.p239g.AbstractC5283d
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7033a(C9741o c9741o) {
                abstractC7137a.mo15385a(c9741o.m7248a());
            }
        }).mo7016a(this.f23811a, new AbstractC5282c() { // from class: com.google.android.gms.internal.gu.1
            /* renamed from: b */
            private boolean m15699b(Exception exc) {
                return (exc instanceof C9653a) || (exc instanceof C7416ms);
            }

            @Override // com.google.android.gms.p239g.AbstractC5282c
            /* renamed from: a */
            public void mo7035a(@NonNull Exception exc) {
                if (m15699b(exc)) {
                    abstractC7137a.mo15385a(null);
                } else {
                    abstractC7137a.mo15384b(exc.getMessage());
                }
            }
        });
    }
}
