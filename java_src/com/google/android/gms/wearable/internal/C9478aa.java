package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.net.Uri;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.ail;
import com.google.android.gms.wearable.AbstractC9630m;
/* renamed from: com.google.android.gms.wearable.internal.aa */
/* loaded from: classes2.dex */
public final class C9478aa implements AbstractC9630m {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.wearable.internal.aa$a */
    /* loaded from: classes2.dex */
    public static final class C9481a extends AbstractC9546ba<Status> {

        /* renamed from: a */
        private AbstractC9630m.AbstractC9632b f30006a;

        /* renamed from: b */
        private ail<AbstractC9630m.AbstractC9632b> f30007b;

        /* renamed from: c */
        private IntentFilter[] f30008c;

        private C9481a(AbstractC4489g abstractC4489g, AbstractC9630m.AbstractC9632b abstractC9632b, ail<AbstractC9630m.AbstractC9632b> ailVar, IntentFilter[] intentFilterArr) {
            super(abstractC4489g);
            this.f30006a = (AbstractC9630m.AbstractC9632b) C4588d.m23627a(abstractC9632b);
            this.f30007b = (ail) C4588d.m23627a(ailVar);
            this.f30008c = (IntentFilter[]) C4588d.m23627a(intentFilterArr);
        }

        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public Status mo7807b(Status status) {
            this.f30006a = null;
            this.f30007b = null;
            this.f30008c = null;
            return status;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahl.AbstractC6343a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7809a(C9527ar c9527ar) {
            c9527ar.m7962a(this, this.f30006a, this.f30007b, this.f30008c);
            this.f30006a = null;
            this.f30007b = null;
            this.f30008c = null;
        }
    }

    /* renamed from: com.google.android.gms.wearable.internal.aa$b */
    /* loaded from: classes2.dex */
    public static class C9482b implements AbstractC9630m.AbstractC9633c {

        /* renamed from: a */
        private final Status f30009a;

        /* renamed from: b */
        private final int f30010b;

        public C9482b(Status status, int i) {
            this.f30009a = status;
            this.f30010b = i;
        }

        @Override // com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        public Status mo7645a() {
            return this.f30009a;
        }

        @Override // com.google.android.gms.wearable.AbstractC9630m.AbstractC9633c
        /* renamed from: b */
        public int mo7573b() {
            return this.f30010b;
        }
    }

    /* renamed from: a */
    private AbstractC4494i<Status> m8036a(AbstractC4489g abstractC4489g, AbstractC9630m.AbstractC9632b abstractC9632b, IntentFilter[] intentFilterArr) {
        return abstractC4489g.mo17255a((AbstractC4489g) new C9481a(abstractC4489g, abstractC9632b, abstractC4489g.mo17373a((AbstractC4489g) abstractC9632b), intentFilterArr));
    }

    @Override // com.google.android.gms.wearable.AbstractC9630m
    /* renamed from: a */
    public AbstractC4494i<Status> mo7578a(AbstractC4489g abstractC4489g, AbstractC9630m.AbstractC9632b abstractC9632b) {
        return m8036a(abstractC4489g, abstractC9632b, new IntentFilter[]{C9504ap.m7986a(AbstractC9630m.f30157a)});
    }

    @Override // com.google.android.gms.wearable.AbstractC9630m
    /* renamed from: a */
    public AbstractC4494i<Status> mo7577a(AbstractC4489g abstractC4489g, AbstractC9630m.AbstractC9632b abstractC9632b, Uri uri, int i) {
        C4588d.m23618b(uri != null, "uri must not be null");
        C4588d.m23618b(i == 0 || i == 1, "invalid filter type");
        return m8036a(abstractC4489g, abstractC9632b, new IntentFilter[]{C9504ap.m7985a(AbstractC9630m.f30157a, uri, i)});
    }

    @Override // com.google.android.gms.wearable.AbstractC9630m
    /* renamed from: a */
    public AbstractC4494i<AbstractC9630m.AbstractC9633c> mo7576a(AbstractC4489g abstractC4489g, final String str, final String str2, final byte[] bArr) {
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC9546ba<AbstractC9630m.AbstractC9633c>(abstractC4489g) { // from class: com.google.android.gms.wearable.internal.aa.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahn
            /* renamed from: a */
            public AbstractC9630m.AbstractC9633c mo7807b(Status status) {
                return new C9482b(status, -1);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C9527ar c9527ar) {
                c9527ar.m7954a(this, str, str2, bArr);
            }
        });
    }

    @Override // com.google.android.gms.wearable.AbstractC9630m
    /* renamed from: b */
    public AbstractC4494i<Status> mo7575b(AbstractC4489g abstractC4489g, final AbstractC9630m.AbstractC9632b abstractC9632b) {
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC9546ba<Status>(abstractC4489g) { // from class: com.google.android.gms.wearable.internal.aa.2
            @Override // com.google.android.gms.internal.ahn
            /* renamed from: a */
            public Status mo7807b(Status status) {
                return status;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C9527ar c9527ar) {
                c9527ar.m7963a(this, abstractC9632b);
            }
        });
    }
}
