package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.internal.ahl;
import com.google.android.gms.internal.ail;
import com.google.android.gms.nearby.C8744a;
import com.google.android.gms.nearby.messages.AbstractC8833e;
import com.google.android.gms.nearby.messages.AbstractC8834f;
import com.google.android.gms.nearby.messages.AbstractC8906l;
import com.google.android.gms.nearby.messages.C8835g;
import com.google.android.gms.nearby.messages.C8903k;
import com.google.android.gms.nearby.messages.C8908n;
import com.google.android.gms.nearby.messages.Message;
import java.util.List;
/* renamed from: com.google.android.gms.nearby.messages.internal.t */
/* loaded from: classes2.dex */
public class C8884t implements AbstractC8834f {

    /* renamed from: a */
    public static final C4467a.C4478g<C8871s> f28355a = new C4467a.C4478g<>();

    /* renamed from: b */
    public static final C4467a.AbstractC4473b<C8871s, C8835g> f28356b = new C4467a.AbstractC4473b<C8871s, C8835g>() { // from class: com.google.android.gms.nearby.messages.internal.t.1
        @Override // com.google.android.gms.common.api.C4467a.AbstractC4476e
        /* renamed from: a */
        public int mo9706a() {
            return Integer.MAX_VALUE;
        }

        @Override // com.google.android.gms.common.api.C4467a.AbstractC4473b
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public C8871s mo7438a(Context context, Looper looper, C4626s c4626s, C8835g c8835g, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
            return new C8871s(context, looper, abstractC4491b, abstractC4492c, c4626s, c8835g);
        }
    };

    /* renamed from: com.google.android.gms.nearby.messages.internal.t$a */
    /* loaded from: classes2.dex */
    static abstract class AbstractC8895a extends ahl.AbstractC6343a<Status, C8871s> {
        public AbstractC8895a(AbstractC4489g abstractC4489g) {
            super(C8744a.f27996e, abstractC4489g);
        }

        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public Status mo7807b(Status status) {
            return status;
        }
    }

    /* renamed from: a */
    private static List<Update> m9808a(Intent intent) {
        return C8868p.m9850a(intent, "com.google.android.gms.nearby.messages.UPDATES");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m9798a(Iterable<Update> iterable, AbstractC8833e abstractC8833e) {
        for (Update update : iterable) {
            if (update.m9900a(1)) {
                abstractC8833e.m9932a(update.f28327c);
            }
            if (update.m9900a(2)) {
                abstractC8833e.m9929b(update.f28327c);
            }
            if (update.m9900a(4)) {
                abstractC8833e.m9930a(update.f28327c, update.f28328d);
            }
            if (update.m9900a(8)) {
                abstractC8833e.m9931a(update.f28327c, update.f28329e);
            }
        }
    }

    @Override // com.google.android.gms.nearby.messages.AbstractC8834f
    /* renamed from: a */
    public AbstractC4494i<Status> mo9806a(AbstractC4489g abstractC4489g) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC8895a(abstractC4489g) { // from class: com.google.android.gms.nearby.messages.internal.t.10
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C8871s c8871s) {
                c8871s.m9838a(this);
            }
        });
    }

    @Override // com.google.android.gms.nearby.messages.AbstractC8834f
    /* renamed from: a */
    public AbstractC4494i<Status> mo9805a(AbstractC4489g abstractC4489g, PendingIntent pendingIntent) {
        return mo9804a(abstractC4489g, pendingIntent, C8908n.f28389a);
    }

    @Override // com.google.android.gms.nearby.messages.AbstractC8834f
    /* renamed from: a */
    public AbstractC4494i<Status> mo9804a(AbstractC4489g abstractC4489g, final PendingIntent pendingIntent, final C8908n c8908n) {
        C4588d.m23627a(pendingIntent);
        C4588d.m23627a(c8908n);
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC8895a(abstractC4489g) { // from class: com.google.android.gms.nearby.messages.internal.t.7
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C8871s c8871s) {
                c8871s.m9836a(this, pendingIntent, c8908n);
            }
        });
    }

    @Override // com.google.android.gms.nearby.messages.AbstractC8834f
    /* renamed from: a */
    public AbstractC4494i<Status> mo9803a(AbstractC4489g abstractC4489g, Message message) {
        return mo9802a(abstractC4489g, message, C8903k.f28384a);
    }

    @Override // com.google.android.gms.nearby.messages.AbstractC8834f
    /* renamed from: a */
    public AbstractC4494i<Status> mo9802a(AbstractC4489g abstractC4489g, final Message message, final C8903k c8903k) {
        C4588d.m23627a(message);
        C4588d.m23627a(c8903k);
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC8895a(abstractC4489g) { // from class: com.google.android.gms.nearby.messages.internal.t.4
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C8871s c8871s) {
                c8871s.m9831a(this, MessageWrapper.m9912a(message), c8903k);
            }
        });
    }

    @Override // com.google.android.gms.nearby.messages.AbstractC8834f
    /* renamed from: a */
    public AbstractC4494i<Status> mo9801a(AbstractC4489g abstractC4489g, AbstractC8833e abstractC8833e) {
        return mo9800a(abstractC4489g, abstractC8833e, C8908n.f28389a);
    }

    @Override // com.google.android.gms.nearby.messages.AbstractC8834f
    /* renamed from: a */
    public AbstractC4494i<Status> mo9800a(AbstractC4489g abstractC4489g, final AbstractC8833e abstractC8833e, final C8908n c8908n) {
        C4588d.m23627a(abstractC8833e);
        C4588d.m23627a(c8908n);
        final ail<AbstractC8833e> m9841a = ((C8871s) abstractC4489g.mo17383a((C4467a.C4475d<C4467a.AbstractC4477f>) f28355a)).m9841a(abstractC4489g, abstractC8833e);
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC8895a(abstractC4489g) { // from class: com.google.android.gms.nearby.messages.internal.t.6
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C8871s c8871s) {
                c8871s.m9834a(this, m9841a, abstractC8833e, c8908n, null);
            }
        });
    }

    @Override // com.google.android.gms.nearby.messages.AbstractC8834f
    /* renamed from: a */
    public AbstractC4494i<Status> mo9799a(AbstractC4489g abstractC4489g, final AbstractC8906l abstractC8906l) {
        C4588d.m23627a(abstractC8906l);
        final ail<AbstractC8906l> m9840a = ((C8871s) abstractC4489g.mo17383a((C4467a.C4475d<C4467a.AbstractC4477f>) f28355a)).m9840a(abstractC4489g, abstractC8906l);
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC8895a(abstractC4489g) { // from class: com.google.android.gms.nearby.messages.internal.t.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C8871s c8871s) {
                c8871s.m9833a(this, m9840a, abstractC8906l);
            }
        });
    }

    @Override // com.google.android.gms.nearby.messages.AbstractC8834f
    /* renamed from: a */
    public void mo9807a(Intent intent, AbstractC8833e abstractC8833e) {
        m9798a(m9808a(intent), abstractC8833e);
    }

    @Override // com.google.android.gms.nearby.messages.AbstractC8834f
    /* renamed from: b */
    public AbstractC4494i<Status> mo9797b(AbstractC4489g abstractC4489g, final PendingIntent pendingIntent) {
        C4588d.m23627a(pendingIntent);
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC8895a(abstractC4489g) { // from class: com.google.android.gms.nearby.messages.internal.t.9
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C8871s c8871s) {
                c8871s.m9837a(this, pendingIntent);
            }
        });
    }

    @Override // com.google.android.gms.nearby.messages.AbstractC8834f
    /* renamed from: b */
    public AbstractC4494i<Status> mo9796b(AbstractC4489g abstractC4489g, final Message message) {
        C4588d.m23627a(message);
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC8895a(abstractC4489g) { // from class: com.google.android.gms.nearby.messages.internal.t.5
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C8871s c8871s) {
                c8871s.m9832a(this, MessageWrapper.m9912a(message));
            }
        });
    }

    @Override // com.google.android.gms.nearby.messages.AbstractC8834f
    /* renamed from: b */
    public AbstractC4494i<Status> mo9795b(AbstractC4489g abstractC4489g, final AbstractC8833e abstractC8833e) {
        C4588d.m23627a(abstractC8833e);
        final ail<AbstractC8833e> m9841a = ((C8871s) abstractC4489g.mo17383a((C4467a.C4475d<C4467a.AbstractC4477f>) f28355a)).m9841a(abstractC4489g, abstractC8833e);
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC8895a(abstractC4489g) { // from class: com.google.android.gms.nearby.messages.internal.t.8
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C8871s c8871s) {
                c8871s.m9835a(this, m9841a, abstractC8833e);
            }
        });
    }

    @Override // com.google.android.gms.nearby.messages.AbstractC8834f
    /* renamed from: b */
    public AbstractC4494i<Status> mo9794b(AbstractC4489g abstractC4489g, final AbstractC8906l abstractC8906l) {
        final ail<AbstractC8906l> m9840a = ((C8871s) abstractC4489g.mo17383a((C4467a.C4475d<C4467a.AbstractC4477f>) f28355a)).m9840a(abstractC4489g, abstractC8906l);
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC8895a(abstractC4489g) { // from class: com.google.android.gms.nearby.messages.internal.t.3
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C8871s c8871s) {
                c8871s.m9830b(this, m9840a, abstractC8906l);
            }
        });
    }
}
