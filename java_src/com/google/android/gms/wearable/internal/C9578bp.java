package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.ahl;
import com.google.android.gms.internal.ail;
import com.google.android.gms.wearable.AbstractC9458e;
import com.google.android.gms.wearable.AbstractC9466h;
import com.google.android.gms.wearable.AbstractC9467i;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.C9627j;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.internal.C9483ab;
import java.io.IOException;
import java.io.InputStream;
/* renamed from: com.google.android.gms.wearable.internal.bp */
/* loaded from: classes2.dex */
public final class C9578bp implements AbstractC9458e {

    /* renamed from: com.google.android.gms.wearable.internal.bp$a */
    /* loaded from: classes2.dex */
    public static class C9588a implements AbstractC9458e.AbstractC9459a {

        /* renamed from: a */
        private final Status f30128a;

        /* renamed from: b */
        private final AbstractC9466h f30129b;

        public C9588a(Status status, AbstractC9466h abstractC9466h) {
            this.f30128a = status;
            this.f30129b = abstractC9466h;
        }

        @Override // com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        public Status mo7645a() {
            return this.f30128a;
        }

        @Override // com.google.android.gms.wearable.AbstractC9458e.AbstractC9459a
        /* renamed from: b */
        public AbstractC9466h mo7806b() {
            return this.f30129b;
        }
    }

    /* renamed from: com.google.android.gms.wearable.internal.bp$b */
    /* loaded from: classes2.dex */
    public static class C9589b implements AbstractC9458e.AbstractC9461c {

        /* renamed from: a */
        private final Status f30130a;

        /* renamed from: b */
        private final int f30131b;

        public C9589b(Status status, int i) {
            this.f30130a = status;
            this.f30131b = i;
        }

        @Override // com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        public Status mo7645a() {
            return this.f30130a;
        }

        @Override // com.google.android.gms.wearable.AbstractC9458e.AbstractC9461c
        /* renamed from: b */
        public int mo7805b() {
            return this.f30131b;
        }
    }

    /* renamed from: com.google.android.gms.wearable.internal.bp$c */
    /* loaded from: classes2.dex */
    public static class C9590c implements AbstractC9458e.AbstractC9463e {

        /* renamed from: a */
        private final Status f30132a;

        /* renamed from: b */
        private volatile ParcelFileDescriptor f30133b;

        /* renamed from: c */
        private volatile InputStream f30134c;

        /* renamed from: d */
        private volatile boolean f30135d = false;

        public C9590c(Status status, ParcelFileDescriptor parcelFileDescriptor) {
            this.f30132a = status;
            this.f30133b = parcelFileDescriptor;
        }

        @Override // com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        public Status mo7645a() {
            return this.f30132a;
        }

        @Override // com.google.android.gms.common.api.AbstractC4500k
        /* renamed from: b */
        public void mo7804b() {
            if (this.f30133b == null) {
                return;
            }
            if (this.f30135d) {
                throw new IllegalStateException("releasing an already released result.");
            }
            try {
                if (this.f30134c != null) {
                    this.f30134c.close();
                } else {
                    this.f30133b.close();
                }
                this.f30135d = true;
                this.f30133b = null;
                this.f30134c = null;
            } catch (IOException e) {
            }
        }

        @Override // com.google.android.gms.wearable.AbstractC9458e.AbstractC9463e
        /* renamed from: c */
        public ParcelFileDescriptor mo7803c() {
            if (this.f30135d) {
                throw new IllegalStateException("Cannot access the file descriptor after release().");
            }
            return this.f30133b;
        }

        @Override // com.google.android.gms.wearable.AbstractC9458e.AbstractC9463e
        /* renamed from: d */
        public InputStream mo7802d() {
            if (this.f30135d) {
                throw new IllegalStateException("Cannot access the input stream after release().");
            }
            if (this.f30133b == null) {
                return null;
            }
            if (this.f30134c == null) {
                this.f30134c = new ParcelFileDescriptor.AutoCloseInputStream(this.f30133b);
            }
            return this.f30134c;
        }
    }

    /* renamed from: a */
    private AbstractC4494i<Status> m7834a(AbstractC4489g abstractC4489g, AbstractC9458e.AbstractC9460b abstractC9460b, IntentFilter[] intentFilterArr) {
        return C9483ab.m8028a(abstractC4489g, m7831a(intentFilterArr), abstractC9460b);
    }

    /* renamed from: a */
    private static C9483ab.AbstractC9484a<AbstractC9458e.AbstractC9460b> m7831a(final IntentFilter[] intentFilterArr) {
        return new C9483ab.AbstractC9484a<AbstractC9458e.AbstractC9460b>() { // from class: com.google.android.gms.wearable.internal.bp.8
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void m7812a(C9527ar c9527ar, ahl.AbstractC6344b<Status> abstractC6344b, AbstractC9458e.AbstractC9460b abstractC9460b, ail<AbstractC9458e.AbstractC9460b> ailVar) {
                c9527ar.m7965a(abstractC6344b, abstractC9460b, ailVar, intentFilterArr);
            }

            @Override // com.google.android.gms.wearable.internal.C9483ab.AbstractC9484a
            /* renamed from: a */
            public /* bridge */ /* synthetic */ void mo7811a(C9527ar c9527ar, ahl.AbstractC6344b abstractC6344b, AbstractC9458e.AbstractC9460b abstractC9460b, ail<AbstractC9458e.AbstractC9460b> ailVar) {
                m7812a(c9527ar, (ahl.AbstractC6344b<Status>) abstractC6344b, abstractC9460b, ailVar);
            }
        };
    }

    /* renamed from: a */
    private void m7832a(Asset asset) {
        if (asset == null) {
            throw new IllegalArgumentException("asset is null");
        }
        if (asset.m8140b() == null) {
            throw new IllegalArgumentException("invalid asset");
        }
        if (asset.m8145a() == null) {
            return;
        }
        throw new IllegalArgumentException("invalid asset");
    }

    @Override // com.google.android.gms.wearable.AbstractC9458e
    /* renamed from: a */
    public AbstractC4494i<C9627j> mo7841a(AbstractC4489g abstractC4489g) {
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC9546ba<C9627j>(abstractC4489g) { // from class: com.google.android.gms.wearable.internal.bp.3
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahn
            /* renamed from: a */
            public C9627j mo7807b(Status status) {
                return new C9627j(DataHolder.m23889b(status.m24015i()));
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C9527ar c9527ar) {
                c9527ar.m7976a(this);
            }
        });
    }

    @Override // com.google.android.gms.wearable.AbstractC9458e
    /* renamed from: a */
    public AbstractC4494i<AbstractC9458e.AbstractC9459a> mo7840a(AbstractC4489g abstractC4489g, final Uri uri) {
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC9546ba<AbstractC9458e.AbstractC9459a>(abstractC4489g) { // from class: com.google.android.gms.wearable.internal.bp.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahn
            /* renamed from: a */
            public AbstractC9458e.AbstractC9459a mo7807b(Status status) {
                return new C9588a(status, null);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C9527ar c9527ar) {
                c9527ar.m7974a(this, uri);
            }
        });
    }

    @Override // com.google.android.gms.wearable.AbstractC9458e
    /* renamed from: a */
    public AbstractC4494i<C9627j> mo7839a(AbstractC4489g abstractC4489g, final Uri uri, final int i) {
        boolean z = false;
        C4588d.m23618b(uri != null, "uri must not be null");
        if (i == 0 || i == 1) {
            z = true;
        }
        C4588d.m23618b(z, "invalid filter type");
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC9546ba<C9627j>(abstractC4489g) { // from class: com.google.android.gms.wearable.internal.bp.4
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahn
            /* renamed from: a */
            public C9627j mo7807b(Status status) {
                return new C9627j(DataHolder.m23889b(status.m24015i()));
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C9527ar c9527ar) {
                c9527ar.m7973a(this, uri, i);
            }
        });
    }

    @Override // com.google.android.gms.wearable.AbstractC9458e
    /* renamed from: a */
    public AbstractC4494i<AbstractC9458e.AbstractC9463e> mo7838a(AbstractC4489g abstractC4489g, final Asset asset) {
        m7832a(asset);
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC9546ba<AbstractC9458e.AbstractC9463e>(abstractC4489g) { // from class: com.google.android.gms.wearable.internal.bp.6
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahn
            /* renamed from: a */
            public AbstractC9458e.AbstractC9463e mo7807b(Status status) {
                return new C9590c(status, null);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C9527ar c9527ar) {
                c9527ar.m7972a(this, asset);
            }
        });
    }

    @Override // com.google.android.gms.wearable.AbstractC9458e
    /* renamed from: a */
    public AbstractC4494i<AbstractC9458e.AbstractC9459a> mo7837a(AbstractC4489g abstractC4489g, final PutDataRequest putDataRequest) {
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC9546ba<AbstractC9458e.AbstractC9459a>(abstractC4489g) { // from class: com.google.android.gms.wearable.internal.bp.1
            @Override // com.google.android.gms.internal.ahn
            /* renamed from: a */
            public AbstractC9458e.AbstractC9459a mo7807b(Status status) {
                return new C9588a(status, null);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C9527ar c9527ar) {
                c9527ar.m7971a(this, putDataRequest);
            }
        });
    }

    @Override // com.google.android.gms.wearable.AbstractC9458e
    /* renamed from: a */
    public AbstractC4494i<Status> mo7836a(AbstractC4489g abstractC4489g, AbstractC9458e.AbstractC9460b abstractC9460b) {
        return m7834a(abstractC4489g, abstractC9460b, new IntentFilter[]{C9504ap.m7986a(AbstractC9458e.f29851a)});
    }

    @Override // com.google.android.gms.wearable.AbstractC9458e
    /* renamed from: a */
    public AbstractC4494i<Status> mo7835a(AbstractC4489g abstractC4489g, AbstractC9458e.AbstractC9460b abstractC9460b, Uri uri, int i) {
        C4588d.m23618b(uri != null, "uri must not be null");
        C4588d.m23618b(i == 0 || i == 1, "invalid filter type");
        return m7834a(abstractC4489g, abstractC9460b, new IntentFilter[]{C9504ap.m7985a(AbstractC9458e.f29851a, uri, i)});
    }

    @Override // com.google.android.gms.wearable.AbstractC9458e
    /* renamed from: a */
    public AbstractC4494i<AbstractC9458e.AbstractC9463e> mo7833a(AbstractC4489g abstractC4489g, final AbstractC9467i abstractC9467i) {
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC9546ba<AbstractC9458e.AbstractC9463e>(abstractC4489g) { // from class: com.google.android.gms.wearable.internal.bp.7
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahn
            /* renamed from: a */
            public AbstractC9458e.AbstractC9463e mo7807b(Status status) {
                return new C9590c(status, null);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C9527ar c9527ar) {
                c9527ar.m7964a(this, abstractC9467i);
            }
        });
    }

    @Override // com.google.android.gms.wearable.AbstractC9458e
    /* renamed from: b */
    public AbstractC4494i<C9627j> mo7830b(AbstractC4489g abstractC4489g, Uri uri) {
        return mo7839a(abstractC4489g, uri, 0);
    }

    @Override // com.google.android.gms.wearable.AbstractC9458e
    /* renamed from: b */
    public AbstractC4494i<AbstractC9458e.AbstractC9461c> mo7829b(AbstractC4489g abstractC4489g, final Uri uri, final int i) {
        boolean z = false;
        C4588d.m23618b(uri != null, "uri must not be null");
        if (i == 0 || i == 1) {
            z = true;
        }
        C4588d.m23618b(z, "invalid filter type");
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC9546ba<AbstractC9458e.AbstractC9461c>(abstractC4489g) { // from class: com.google.android.gms.wearable.internal.bp.5
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahn
            /* renamed from: a */
            public AbstractC9458e.AbstractC9461c mo7807b(Status status) {
                return new C9589b(status, 0);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C9527ar c9527ar) {
                c9527ar.m7952b(this, uri, i);
            }
        });
    }

    @Override // com.google.android.gms.wearable.AbstractC9458e
    /* renamed from: b */
    public AbstractC4494i<Status> mo7828b(AbstractC4489g abstractC4489g, final AbstractC9458e.AbstractC9460b abstractC9460b) {
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC9546ba<Status>(abstractC4489g) { // from class: com.google.android.gms.wearable.internal.bp.9
            @Override // com.google.android.gms.internal.ahn
            /* renamed from: a */
            public Status mo7807b(Status status) {
                return status;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C9527ar c9527ar) {
                c9527ar.m7966a(this, abstractC9460b);
            }
        });
    }

    @Override // com.google.android.gms.wearable.AbstractC9458e
    /* renamed from: c */
    public AbstractC4494i<AbstractC9458e.AbstractC9461c> mo7827c(AbstractC4489g abstractC4489g, Uri uri) {
        return mo7829b(abstractC4489g, uri, 0);
    }
}
