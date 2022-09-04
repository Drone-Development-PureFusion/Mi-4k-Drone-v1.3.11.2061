package com.google.android.gms.games.internal.p241a;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.C5355c;
import com.google.android.gms.games.internal.C5670d;
import com.google.android.gms.games.snapshot.AbstractC6009d;
import com.google.android.gms.games.snapshot.AbstractC6013g;
import com.google.android.gms.games.snapshot.C6008c;
import com.google.android.gms.games.snapshot.Snapshot;
import com.google.android.gms.games.snapshot.SnapshotContents;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.internal.ahl;
/* renamed from: com.google.android.gms.games.internal.a.m */
/* loaded from: classes2.dex */
public final class C5550m implements AbstractC6013g {

    /* renamed from: com.google.android.gms.games.internal.a.m$6 */
    /* loaded from: classes2.dex */
    class C55566 extends AbstractC5561c {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahl.AbstractC6343a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7809a(C5670d c5670d) {
            c5670d.m20107c((ahl.AbstractC6344b<AbstractC6013g.AbstractC6016c>) this, (String) null, (String) null, false);
        }
    }

    /* renamed from: com.google.android.gms.games.internal.a.m$a */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC5557a extends C5355c.AbstractC5363a<AbstractC6013g.AbstractC6014a> {
        private AbstractC5557a(AbstractC4489g abstractC4489g) {
            super(abstractC4489g);
        }

        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public AbstractC6013g.AbstractC6014a mo7807b(final Status status) {
            return new AbstractC6013g.AbstractC6014a() { // from class: com.google.android.gms.games.internal.a.m.a.1
                @Override // com.google.android.gms.common.api.AbstractC4502m
                /* renamed from: a */
                public Status mo7645a() {
                    return status;
                }

                @Override // com.google.android.gms.games.snapshot.AbstractC6013g.AbstractC6014a
                /* renamed from: c */
                public SnapshotMetadata mo19072c() {
                    return null;
                }
            };
        }
    }

    /* renamed from: com.google.android.gms.games.internal.a.m$b */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC5559b extends C5355c.AbstractC5363a<AbstractC6013g.AbstractC6015b> {
        private AbstractC5559b(AbstractC4489g abstractC4489g) {
            super(abstractC4489g);
        }

        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public AbstractC6013g.AbstractC6015b mo7807b(final Status status) {
            return new AbstractC6013g.AbstractC6015b() { // from class: com.google.android.gms.games.internal.a.m.b.1
                @Override // com.google.android.gms.common.api.AbstractC4502m
                /* renamed from: a */
                public Status mo7645a() {
                    return status;
                }

                @Override // com.google.android.gms.games.snapshot.AbstractC6013g.AbstractC6015b
                /* renamed from: b */
                public String mo19071b() {
                    return null;
                }
            };
        }
    }

    /* renamed from: com.google.android.gms.games.internal.a.m$c */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC5561c extends C5355c.AbstractC5363a<AbstractC6013g.AbstractC6016c> {
        private AbstractC5561c(AbstractC4489g abstractC4489g) {
            super(abstractC4489g);
        }

        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public AbstractC6013g.AbstractC6016c mo7807b(final Status status) {
            return new AbstractC6013g.AbstractC6016c() { // from class: com.google.android.gms.games.internal.a.m.c.1
                @Override // com.google.android.gms.common.api.AbstractC4502m
                /* renamed from: a */
                public Status mo7645a() {
                    return status;
                }

                @Override // com.google.android.gms.common.api.AbstractC4500k
                /* renamed from: b */
                public void mo7804b() {
                }

                @Override // com.google.android.gms.games.snapshot.AbstractC6013g.AbstractC6016c
                /* renamed from: c */
                public C6008c mo19070c() {
                    return new C6008c(DataHolder.m23889b(14));
                }
            };
        }
    }

    /* renamed from: com.google.android.gms.games.internal.a.m$d */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC5563d extends C5355c.AbstractC5363a<AbstractC6013g.AbstractC6017d> {
        private AbstractC5563d(AbstractC4489g abstractC4489g) {
            super(abstractC4489g);
        }

        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public AbstractC6013g.AbstractC6017d mo7807b(final Status status) {
            return new AbstractC6013g.AbstractC6017d() { // from class: com.google.android.gms.games.internal.a.m.d.1
                @Override // com.google.android.gms.common.api.AbstractC4502m
                /* renamed from: a */
                public Status mo7645a() {
                    return status;
                }

                @Override // com.google.android.gms.games.snapshot.AbstractC6013g.AbstractC6017d
                /* renamed from: c */
                public Snapshot mo19069c() {
                    return null;
                }

                @Override // com.google.android.gms.games.snapshot.AbstractC6013g.AbstractC6017d
                /* renamed from: d */
                public String mo19068d() {
                    return null;
                }

                @Override // com.google.android.gms.games.snapshot.AbstractC6013g.AbstractC6017d
                /* renamed from: e */
                public Snapshot mo19067e() {
                    return null;
                }

                @Override // com.google.android.gms.games.snapshot.AbstractC6013g.AbstractC6017d
                /* renamed from: f */
                public SnapshotContents mo19066f() {
                    return null;
                }
            };
        }
    }

    @Override // com.google.android.gms.games.snapshot.AbstractC6013g
    /* renamed from: a */
    public int mo19085a(AbstractC4489g abstractC4489g) {
        return C5355c.m20511a(abstractC4489g).m20212R();
    }

    @Override // com.google.android.gms.games.snapshot.AbstractC6013g
    /* renamed from: a */
    public Intent mo19076a(AbstractC4489g abstractC4489g, String str, boolean z, boolean z2, int i) {
        return C5355c.m20511a(abstractC4489g).m20141a(str, z, z2, i);
    }

    @Override // com.google.android.gms.games.snapshot.AbstractC6013g
    /* renamed from: a */
    public AbstractC4494i<AbstractC6013g.AbstractC6014a> mo19083a(AbstractC4489g abstractC4489g, final Snapshot snapshot, final AbstractC6009d abstractC6009d) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC5557a(abstractC4489g) { // from class: com.google.android.gms.games.internal.a.m.3
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C5670d c5670d) {
                c5670d.m20179a(this, snapshot, abstractC6009d);
            }
        });
    }

    @Override // com.google.android.gms.games.snapshot.AbstractC6013g
    /* renamed from: a */
    public AbstractC4494i<AbstractC6013g.AbstractC6017d> mo19082a(AbstractC4489g abstractC4489g, SnapshotMetadata snapshotMetadata) {
        return mo19078a(abstractC4489g, snapshotMetadata.mo19119h(), false);
    }

    @Override // com.google.android.gms.games.snapshot.AbstractC6013g
    /* renamed from: a */
    public AbstractC4494i<AbstractC6013g.AbstractC6017d> mo19081a(AbstractC4489g abstractC4489g, SnapshotMetadata snapshotMetadata, int i) {
        return mo19077a(abstractC4489g, snapshotMetadata.mo19119h(), false, i);
    }

    @Override // com.google.android.gms.games.snapshot.AbstractC6013g
    /* renamed from: a */
    public AbstractC4494i<AbstractC6013g.AbstractC6017d> mo19080a(AbstractC4489g abstractC4489g, String str, Snapshot snapshot) {
        SnapshotMetadata mo19137c = snapshot.mo19137c();
        return mo19079a(abstractC4489g, str, mo19137c.mo19122e(), new AbstractC6009d.C6010a().m19095a(mo19137c).m19098a(), snapshot.mo19136d());
    }

    @Override // com.google.android.gms.games.snapshot.AbstractC6013g
    /* renamed from: a */
    public AbstractC4494i<AbstractC6013g.AbstractC6017d> mo19079a(AbstractC4489g abstractC4489g, final String str, final String str2, final AbstractC6009d abstractC6009d, final SnapshotContents snapshotContents) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC5563d(abstractC4489g) { // from class: com.google.android.gms.games.internal.a.m.5
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C5670d c5670d) {
                c5670d.m20166a(this, str, str2, abstractC6009d, snapshotContents);
            }
        });
    }

    @Override // com.google.android.gms.games.snapshot.AbstractC6013g
    /* renamed from: a */
    public AbstractC4494i<AbstractC6013g.AbstractC6017d> mo19078a(AbstractC4489g abstractC4489g, String str, boolean z) {
        return mo19077a(abstractC4489g, str, z, -1);
    }

    @Override // com.google.android.gms.games.snapshot.AbstractC6013g
    /* renamed from: a */
    public AbstractC4494i<AbstractC6013g.AbstractC6017d> mo19077a(AbstractC4489g abstractC4489g, final String str, final boolean z, final int i) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC5563d(abstractC4489g) { // from class: com.google.android.gms.games.internal.a.m.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C5670d c5670d) {
                c5670d.m20160a(this, str, z, i);
            }
        });
    }

    @Override // com.google.android.gms.games.snapshot.AbstractC6013g
    /* renamed from: a */
    public AbstractC4494i<AbstractC6013g.AbstractC6016c> mo19075a(AbstractC4489g abstractC4489g, final boolean z) {
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC5561c(abstractC4489g) { // from class: com.google.android.gms.games.internal.a.m.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C5670d c5670d) {
                c5670d.m20080f(this, z);
            }
        });
    }

    @Override // com.google.android.gms.games.snapshot.AbstractC6013g
    /* renamed from: a */
    public SnapshotMetadata mo19086a(Bundle bundle) {
        if (bundle == null || !bundle.containsKey(AbstractC6013g.f20395a)) {
            return null;
        }
        return (SnapshotMetadata) bundle.getParcelable(AbstractC6013g.f20395a);
    }

    @Override // com.google.android.gms.games.snapshot.AbstractC6013g
    /* renamed from: a */
    public void mo19084a(AbstractC4489g abstractC4489g, Snapshot snapshot) {
        C5355c.m20511a(abstractC4489g).m20189a(snapshot);
    }

    @Override // com.google.android.gms.games.snapshot.AbstractC6013g
    /* renamed from: b */
    public int mo19074b(AbstractC4489g abstractC4489g) {
        return C5355c.m20511a(abstractC4489g).m20211S();
    }

    @Override // com.google.android.gms.games.snapshot.AbstractC6013g
    /* renamed from: b */
    public AbstractC4494i<AbstractC6013g.AbstractC6015b> mo19073b(AbstractC4489g abstractC4489g, final SnapshotMetadata snapshotMetadata) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC5559b(abstractC4489g) { // from class: com.google.android.gms.games.internal.a.m.4
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C5670d c5670d) {
                c5670d.m20069i(this, snapshotMetadata.mo19122e());
            }
        });
    }
}
