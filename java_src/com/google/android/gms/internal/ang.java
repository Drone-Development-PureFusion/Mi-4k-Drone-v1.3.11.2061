package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.internal.ahl;
import com.google.android.gms.nearby.C8744a;
import com.google.android.gms.nearby.connection.AbstractC8755a;
import com.google.android.gms.nearby.connection.AppMetadata;
import java.util.List;
/* loaded from: classes2.dex */
public final class ang implements AbstractC8755a {

    /* renamed from: a */
    public static final C4467a.C4478g<anf> f22453a = new C4467a.C4478g<>();

    /* renamed from: b */
    public static final C4467a.AbstractC4473b<anf, C4467a.AbstractC4468a.C4470b> f22454b = new C4467a.AbstractC4473b<anf, C4467a.AbstractC4468a.C4470b>() { // from class: com.google.android.gms.internal.ang.1
        @Override // com.google.android.gms.common.api.C4467a.AbstractC4473b
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public anf mo7438a(Context context, Looper looper, C4626s c4626s, C4467a.AbstractC4468a.C4470b c4470b, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
            return new anf(context, looper, c4626s, abstractC4491b, abstractC4492c);
        }
    };

    /* renamed from: com.google.android.gms.internal.ang$a */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC6627a<R extends AbstractC4502m> extends ahl.AbstractC6343a<R, anf> {
        public AbstractC6627a(AbstractC4489g abstractC4489g) {
            super(C8744a.f27992a, abstractC4489g);
        }
    }

    /* renamed from: com.google.android.gms.internal.ang$b */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC6628b extends AbstractC6627a<AbstractC8755a.AbstractC8760e> {
        private AbstractC6628b(AbstractC4489g abstractC4489g) {
            super(abstractC4489g);
        }

        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public AbstractC8755a.AbstractC8760e mo7807b(final Status status) {
            return new AbstractC8755a.AbstractC8760e() { // from class: com.google.android.gms.internal.ang.b.1
                @Override // com.google.android.gms.common.api.AbstractC4502m
                /* renamed from: a */
                public Status mo7645a() {
                    return status;
                }

                @Override // com.google.android.gms.nearby.connection.AbstractC8755a.AbstractC8760e
                /* renamed from: b */
                public String mo10204b() {
                    return null;
                }
            };
        }
    }

    /* renamed from: com.google.android.gms.internal.ang$c */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC6630c extends AbstractC6627a<Status> {
        private AbstractC6630c(AbstractC4489g abstractC4489g) {
            super(abstractC4489g);
        }

        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public Status mo7807b(Status status) {
            return status;
        }
    }

    /* renamed from: a */
    public static anf m16663a(AbstractC4489g abstractC4489g, boolean z) {
        C4588d.m23618b(abstractC4489g != null, "GoogleApiClient parameter is required.");
        C4588d.m23622a(abstractC4489g.mo17353j(), "GoogleApiClient must be connected.");
        return m16662b(abstractC4489g, z);
    }

    /* renamed from: b */
    public static anf m16662b(AbstractC4489g abstractC4489g, boolean z) {
        C4588d.m23622a(abstractC4489g.mo17382a((C4467a<?>) C8744a.f27992a), "GoogleApiClient is not configured to use the Nearby Connections Api. Pass Nearby.CONNECTIONS_API into GoogleApiClient.Builder#addApi() to use this feature.");
        boolean mo17369b = abstractC4489g.mo17369b(C8744a.f27992a);
        if (!z || mo17369b) {
            if (!mo17369b) {
                return null;
            }
            return (anf) abstractC4489g.mo17383a((C4467a.C4475d<C4467a.AbstractC4477f>) f22453a);
        }
        throw new IllegalStateException("GoogleApiClient has an optional Nearby.CONNECTIONS_API and is not connected to Nearby Connections. Use GoogleApiClient.hasConnectedApi(Nearby.CONNECTIONS_API) to guard this call.");
    }

    @Override // com.google.android.gms.nearby.connection.AbstractC8755a
    /* renamed from: a */
    public AbstractC4494i<Status> mo10223a(AbstractC4489g abstractC4489g, final String str, final long j, AbstractC8755a.AbstractC8758c abstractC8758c) {
        final ail mo17373a = abstractC4489g.mo17373a((AbstractC4489g) abstractC8758c);
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC6630c(abstractC4489g) { // from class: com.google.android.gms.internal.ang.3
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(anf anfVar) {
                anfVar.m16681a(this, str, j, mo17373a);
            }
        });
    }

    @Override // com.google.android.gms.nearby.connection.AbstractC8755a
    /* renamed from: a */
    public AbstractC4494i<AbstractC8755a.AbstractC8760e> mo10222a(AbstractC4489g abstractC4489g, final String str, final AppMetadata appMetadata, final long j, AbstractC8755a.AbstractC8756a abstractC8756a) {
        final ail mo17373a = abstractC4489g.mo17373a((AbstractC4489g) abstractC8756a);
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC6628b(abstractC4489g) { // from class: com.google.android.gms.internal.ang.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(anf anfVar) {
                anfVar.m16680a(this, str, appMetadata, j, mo17373a);
            }
        });
    }

    @Override // com.google.android.gms.nearby.connection.AbstractC8755a
    /* renamed from: a */
    public AbstractC4494i<Status> mo10221a(AbstractC4489g abstractC4489g, final String str, final String str2, final byte[] bArr, AbstractC8755a.AbstractC8757b abstractC8757b, AbstractC8755a.AbstractC8759d abstractC8759d) {
        final ail mo17373a = abstractC4489g.mo17373a((AbstractC4489g) abstractC8757b);
        final ail mo17373a2 = abstractC4489g.mo17373a((AbstractC4489g) abstractC8759d);
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC6630c(abstractC4489g) { // from class: com.google.android.gms.internal.ang.4
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(anf anfVar) {
                anfVar.m16679a(this, str, str2, bArr, mo17373a, mo17373a2);
            }
        });
    }

    @Override // com.google.android.gms.nearby.connection.AbstractC8755a
    /* renamed from: a */
    public AbstractC4494i<Status> mo10219a(AbstractC4489g abstractC4489g, final String str, final byte[] bArr, AbstractC8755a.AbstractC8759d abstractC8759d) {
        final ail mo17373a = abstractC4489g.mo17373a((AbstractC4489g) abstractC8759d);
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC6630c(abstractC4489g) { // from class: com.google.android.gms.internal.ang.5
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(anf anfVar) {
                anfVar.m16678a(this, str, bArr, mo17373a);
            }
        });
    }

    @Override // com.google.android.gms.nearby.connection.AbstractC8755a
    /* renamed from: a */
    public String mo10225a(AbstractC4489g abstractC4489g) {
        return m16663a(abstractC4489g, true).m16673h();
    }

    @Override // com.google.android.gms.nearby.connection.AbstractC8755a
    /* renamed from: a */
    public void mo10224a(AbstractC4489g abstractC4489g, String str) {
        anf m16663a = m16663a(abstractC4489g, false);
        if (m16663a != null) {
            m16663a.m16677a(str);
        }
    }

    @Override // com.google.android.gms.nearby.connection.AbstractC8755a
    /* renamed from: a */
    public void mo10220a(AbstractC4489g abstractC4489g, String str, byte[] bArr) {
        anf m16663a = m16663a(abstractC4489g, false);
        if (m16663a != null) {
            m16663a.m16676a(new String[]{str}, bArr);
        }
    }

    @Override // com.google.android.gms.nearby.connection.AbstractC8755a
    /* renamed from: a */
    public void mo10218a(AbstractC4489g abstractC4489g, List<String> list, byte[] bArr) {
        anf m16663a = m16663a(abstractC4489g, false);
        if (m16663a != null) {
            m16663a.m16676a((String[]) list.toArray(new String[0]), bArr);
        }
    }

    @Override // com.google.android.gms.nearby.connection.AbstractC8755a
    /* renamed from: b */
    public AbstractC4494i<Status> mo10216b(AbstractC4489g abstractC4489g, final String str) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC6630c(abstractC4489g) { // from class: com.google.android.gms.internal.ang.6
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(anf anfVar) {
                anfVar.m16682a(this, str);
            }
        });
    }

    @Override // com.google.android.gms.nearby.connection.AbstractC8755a
    /* renamed from: b */
    public String mo10217b(AbstractC4489g abstractC4489g) {
        return m16663a(abstractC4489g, true).m16672i();
    }

    @Override // com.google.android.gms.nearby.connection.AbstractC8755a
    /* renamed from: b */
    public void mo10215b(AbstractC4489g abstractC4489g, String str, byte[] bArr) {
        anf m16663a = m16663a(abstractC4489g, false);
        if (m16663a != null) {
            m16663a.m16674b(new String[]{str}, bArr);
        }
    }

    @Override // com.google.android.gms.nearby.connection.AbstractC8755a
    /* renamed from: b */
    public void mo10214b(AbstractC4489g abstractC4489g, List<String> list, byte[] bArr) {
        anf m16663a = m16663a(abstractC4489g, false);
        if (m16663a != null) {
            m16663a.m16674b((String[]) list.toArray(new String[0]), bArr);
        }
    }

    @Override // com.google.android.gms.nearby.connection.AbstractC8755a
    /* renamed from: c */
    public void mo10213c(AbstractC4489g abstractC4489g) {
        anf m16663a = m16663a(abstractC4489g, false);
        if (m16663a != null) {
            m16663a.m16671j();
        }
    }

    @Override // com.google.android.gms.nearby.connection.AbstractC8755a
    /* renamed from: c */
    public void mo10212c(AbstractC4489g abstractC4489g, String str) {
        anf m16663a = m16663a(abstractC4489g, false);
        if (m16663a != null) {
            m16663a.m16675b(str);
        }
    }

    @Override // com.google.android.gms.nearby.connection.AbstractC8755a
    /* renamed from: d */
    public void mo10211d(AbstractC4489g abstractC4489g) {
        anf m16663a = m16663a(abstractC4489g, false);
        if (m16663a != null) {
            m16663a.m16670k();
        }
    }
}
