package com.google.android.gms.wearable.internal;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.ahl;
import com.google.android.gms.wearable.AbstractC9441a;
import com.google.android.gms.wearable.AbstractC9452b;
import com.google.android.gms.wearable.AbstractC9453c;
import com.google.android.gms.wearable.AbstractC9458e;
import com.google.android.gms.wearable.AbstractC9630m;
import com.google.android.gms.wearable.AbstractC9636p;
import com.google.android.gms.wearable.C9627j;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.internal.C9478aa;
import com.google.android.gms.wearable.internal.C9486ad;
import com.google.android.gms.wearable.internal.C9547bb;
import com.google.android.gms.wearable.internal.C9560bd;
import com.google.android.gms.wearable.internal.C9578bp;
import com.google.android.gms.wearable.internal.ChannelImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.FutureTask;
/* renamed from: com.google.android.gms.wearable.internal.aq */
/* loaded from: classes2.dex */
final class C9505aq {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.wearable.internal.aq$a */
    /* loaded from: classes2.dex */
    public static final class BinderC9506a extends AbstractBinderC9507b<AbstractC9441a.AbstractC9442a> {
        public BinderC9506a(ahl.AbstractC6344b<AbstractC9441a.AbstractC9442a> abstractC6344b) {
            super(abstractC6344b);
        }

        @Override // com.google.android.gms.wearable.internal.AbstractBinderC9477a, com.google.android.gms.wearable.internal.AbstractC9615w
        /* renamed from: a */
        public void mo7732a(AddLocalCapabilityResponse addLocalCapabilityResponse) {
            a((BinderC9506a) new C9547bb.C9553a(C9501am.m7990a(addLocalCapabilityResponse.f29863b)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.wearable.internal.aq$b */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC9507b<T> extends AbstractBinderC9477a {

        /* renamed from: a */
        private ahl.AbstractC6344b<T> f30025a;

        public AbstractBinderC9507b(ahl.AbstractC6344b<T> abstractC6344b) {
            this.f30025a = abstractC6344b;
        }

        /* renamed from: a */
        public void m7982a(T t) {
            ahl.AbstractC6344b<T> abstractC6344b = this.f30025a;
            if (abstractC6344b != null) {
                abstractC6344b.mo7413a(t);
                this.f30025a = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.wearable.internal.aq$c */
    /* loaded from: classes2.dex */
    public static final class BinderC9508c extends AbstractBinderC9507b<Status> {
        public BinderC9508c(ahl.AbstractC6344b<Status> abstractC6344b) {
            super(abstractC6344b);
        }

        @Override // com.google.android.gms.wearable.internal.AbstractBinderC9477a, com.google.android.gms.wearable.internal.AbstractC9615w
        /* renamed from: a */
        public void mo7729a(CloseChannelResponse closeChannelResponse) {
            a((BinderC9508c) new Status(closeChannelResponse.f29918b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.wearable.internal.aq$d */
    /* loaded from: classes2.dex */
    public static final class BinderC9509d extends AbstractBinderC9507b<Status> {
        public BinderC9509d(ahl.AbstractC6344b<Status> abstractC6344b) {
            super(abstractC6344b);
        }

        @Override // com.google.android.gms.wearable.internal.AbstractBinderC9477a, com.google.android.gms.wearable.internal.AbstractC9615w
        /* renamed from: b */
        public void mo7709b(CloseChannelResponse closeChannelResponse) {
            a((BinderC9509d) new Status(closeChannelResponse.f29918b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.wearable.internal.aq$e */
    /* loaded from: classes2.dex */
    public static final class BinderC9510e extends AbstractBinderC9507b<AbstractC9458e.AbstractC9461c> {
        public BinderC9510e(ahl.AbstractC6344b<AbstractC9458e.AbstractC9461c> abstractC6344b) {
            super(abstractC6344b);
        }

        @Override // com.google.android.gms.wearable.internal.AbstractBinderC9477a, com.google.android.gms.wearable.internal.AbstractC9615w
        /* renamed from: a */
        public void mo7728a(DeleteDataItemsResponse deleteDataItemsResponse) {
            a((BinderC9510e) new C9578bp.C9589b(C9501am.m7990a(deleteDataItemsResponse.f29927b), deleteDataItemsResponse.f29928c));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.wearable.internal.aq$f */
    /* loaded from: classes2.dex */
    public static final class BinderC9511f extends AbstractBinderC9507b<AbstractC9441a.AbstractC9445d> {
        public BinderC9511f(ahl.AbstractC6344b<AbstractC9441a.AbstractC9445d> abstractC6344b) {
            super(abstractC6344b);
        }

        @Override // com.google.android.gms.wearable.internal.AbstractBinderC9477a, com.google.android.gms.wearable.internal.AbstractC9615w
        /* renamed from: a */
        public void mo7727a(GetAllCapabilitiesResponse getAllCapabilitiesResponse) {
            a((BinderC9511f) new C9547bb.C9556d(C9501am.m7990a(getAllCapabilitiesResponse.f29930b), C9505aq.m7983b(getAllCapabilitiesResponse.f29931c)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.wearable.internal.aq$g */
    /* loaded from: classes2.dex */
    public static final class BinderC9512g extends AbstractBinderC9507b<AbstractC9441a.AbstractC9446e> {
        public BinderC9512g(ahl.AbstractC6344b<AbstractC9441a.AbstractC9446e> abstractC6344b) {
            super(abstractC6344b);
        }

        @Override // com.google.android.gms.wearable.internal.AbstractBinderC9477a, com.google.android.gms.wearable.internal.AbstractC9615w
        /* renamed from: a */
        public void mo7726a(GetCapabilityResponse getCapabilityResponse) {
            a((BinderC9512g) new C9547bb.C9557e(C9501am.m7990a(getCapabilityResponse.f29933b), new C9547bb.C9555c(getCapabilityResponse.f29934c)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.wearable.internal.aq$h */
    /* loaded from: classes2.dex */
    public static final class BinderC9513h extends AbstractBinderC9507b<Channel.AbstractC9426a> {

        /* renamed from: a */
        private final BinderC9574bl f30026a;

        public BinderC9513h(ahl.AbstractC6344b<Channel.AbstractC9426a> abstractC6344b, BinderC9574bl binderC9574bl) {
            super(abstractC6344b);
            this.f30026a = (BinderC9574bl) C4588d.m23627a(binderC9574bl);
        }

        @Override // com.google.android.gms.wearable.internal.AbstractBinderC9477a, com.google.android.gms.wearable.internal.AbstractC9615w
        /* renamed from: a */
        public void mo7725a(GetChannelInputStreamResponse getChannelInputStreamResponse) {
            C9568bh c9568bh = null;
            if (getChannelInputStreamResponse.f29937c != null) {
                c9568bh = new C9568bh(new ParcelFileDescriptor.AutoCloseInputStream(getChannelInputStreamResponse.f29937c));
                this.f30026a.m7846a(c9568bh.m7858a());
            }
            a((BinderC9513h) new ChannelImpl.C9475a(new Status(getChannelInputStreamResponse.f29936b), c9568bh));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.wearable.internal.aq$i */
    /* loaded from: classes2.dex */
    public static final class BinderC9514i extends AbstractBinderC9507b<Channel.AbstractC9427b> {

        /* renamed from: a */
        private final BinderC9574bl f30027a;

        public BinderC9514i(ahl.AbstractC6344b<Channel.AbstractC9427b> abstractC6344b, BinderC9574bl binderC9574bl) {
            super(abstractC6344b);
            this.f30027a = (BinderC9574bl) C4588d.m23627a(binderC9574bl);
        }

        @Override // com.google.android.gms.wearable.internal.AbstractBinderC9477a, com.google.android.gms.wearable.internal.AbstractC9615w
        /* renamed from: a */
        public void mo7724a(GetChannelOutputStreamResponse getChannelOutputStreamResponse) {
            C9570bi c9570bi = null;
            if (getChannelOutputStreamResponse.f29940c != null) {
                c9570bi = new C9570bi(new ParcelFileDescriptor.AutoCloseOutputStream(getChannelOutputStreamResponse.f29940c));
                this.f30027a.m7846a(c9570bi.m7855a());
            }
            a((BinderC9514i) new ChannelImpl.C9476b(new Status(getChannelOutputStreamResponse.f29939b), c9570bi));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.wearable.internal.aq$j */
    /* loaded from: classes2.dex */
    public static final class BinderC9515j extends AbstractBinderC9507b<AbstractC9636p.AbstractC9637a> {
        public BinderC9515j(ahl.AbstractC6344b<AbstractC9636p.AbstractC9637a> abstractC6344b) {
            super(abstractC6344b);
        }

        @Override // com.google.android.gms.wearable.internal.AbstractBinderC9477a, com.google.android.gms.wearable.internal.AbstractC9615w
        /* renamed from: a */
        public void mo7718a(GetConnectedNodesResponse getConnectedNodesResponse) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(getConnectedNodesResponse.f29959c);
            a((BinderC9515j) new C9486ad.C9491a(C9501am.m7990a(getConnectedNodesResponse.f29958b), arrayList));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.wearable.internal.aq$k */
    /* loaded from: classes2.dex */
    public static final class BinderC9516k extends AbstractBinderC9507b<AbstractC9458e.AbstractC9459a> {
        public BinderC9516k(ahl.AbstractC6344b<AbstractC9458e.AbstractC9459a> abstractC6344b) {
            super(abstractC6344b);
        }

        @Override // com.google.android.gms.wearable.internal.AbstractBinderC9477a, com.google.android.gms.wearable.internal.AbstractC9615w
        /* renamed from: a */
        public void mo7717a(GetDataItemResponse getDataItemResponse) {
            a((BinderC9516k) new C9578bp.C9588a(C9501am.m7990a(getDataItemResponse.f29961b), getDataItemResponse.f29962c));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.wearable.internal.aq$l */
    /* loaded from: classes2.dex */
    public static final class BinderC9517l extends AbstractBinderC9507b<C9627j> {
        public BinderC9517l(ahl.AbstractC6344b<C9627j> abstractC6344b) {
            super(abstractC6344b);
        }

        @Override // com.google.android.gms.wearable.internal.AbstractBinderC9477a, com.google.android.gms.wearable.internal.AbstractC9615w
        /* renamed from: a */
        public void mo7733a(DataHolder dataHolder) {
            a((BinderC9517l) new C9627j(dataHolder));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.wearable.internal.aq$m */
    /* loaded from: classes2.dex */
    public static final class BinderC9518m extends AbstractBinderC9507b<AbstractC9458e.AbstractC9463e> {
        public BinderC9518m(ahl.AbstractC6344b<AbstractC9458e.AbstractC9463e> abstractC6344b) {
            super(abstractC6344b);
        }

        @Override // com.google.android.gms.wearable.internal.AbstractBinderC9477a, com.google.android.gms.wearable.internal.AbstractC9615w
        /* renamed from: a */
        public void mo7716a(GetFdForAssetResponse getFdForAssetResponse) {
            a((BinderC9518m) new C9578bp.C9590c(C9501am.m7990a(getFdForAssetResponse.f29964b), getFdForAssetResponse.f29965c));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.wearable.internal.aq$n */
    /* loaded from: classes2.dex */
    public static final class BinderC9519n extends AbstractBinderC9507b<AbstractC9636p.AbstractC9638b> {
        public BinderC9519n(ahl.AbstractC6344b<AbstractC9636p.AbstractC9638b> abstractC6344b) {
            super(abstractC6344b);
        }

        @Override // com.google.android.gms.wearable.internal.AbstractBinderC9477a, com.google.android.gms.wearable.internal.AbstractC9615w
        /* renamed from: a */
        public void mo7715a(GetLocalNodeResponse getLocalNodeResponse) {
            a((BinderC9519n) new C9486ad.C9492b(C9501am.m7990a(getLocalNodeResponse.f29967b), getLocalNodeResponse.f29968c));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.wearable.internal.aq$o */
    /* loaded from: classes2.dex */
    public static final class BinderC9520o extends AbstractBinderC9477a {
        @Override // com.google.android.gms.wearable.internal.AbstractBinderC9477a, com.google.android.gms.wearable.internal.AbstractC9615w
        /* renamed from: a */
        public void mo7646a(Status status) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.wearable.internal.aq$p */
    /* loaded from: classes2.dex */
    public static final class BinderC9521p extends AbstractBinderC9507b<AbstractC9453c.AbstractC9456c> {
        public BinderC9521p(ahl.AbstractC6344b<AbstractC9453c.AbstractC9456c> abstractC6344b) {
            super(abstractC6344b);
        }

        @Override // com.google.android.gms.wearable.internal.AbstractBinderC9477a, com.google.android.gms.wearable.internal.AbstractC9615w
        /* renamed from: a */
        public void mo7714a(OpenChannelResponse openChannelResponse) {
            a((BinderC9521p) new C9560bd.C9563a(C9501am.m7990a(openChannelResponse.f29980b), openChannelResponse.f29981c));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.wearable.internal.aq$q */
    /* loaded from: classes2.dex */
    public static final class BinderC9522q extends AbstractBinderC9507b<AbstractC9458e.AbstractC9459a> {

        /* renamed from: a */
        private final List<FutureTask<Boolean>> f30028a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public BinderC9522q(ahl.AbstractC6344b<AbstractC9458e.AbstractC9459a> abstractC6344b, List<FutureTask<Boolean>> list) {
            super(abstractC6344b);
            this.f30028a = list;
        }

        @Override // com.google.android.gms.wearable.internal.AbstractBinderC9477a, com.google.android.gms.wearable.internal.AbstractC9615w
        /* renamed from: a */
        public void mo7713a(PutDataResponse putDataResponse) {
            a((BinderC9522q) new C9578bp.C9588a(C9501am.m7990a(putDataResponse.f29987b), putDataResponse.f29988c));
            if (putDataResponse.f29987b != 0) {
                for (FutureTask<Boolean> futureTask : this.f30028a) {
                    futureTask.cancel(true);
                }
            }
        }
    }

    /* renamed from: com.google.android.gms.wearable.internal.aq$r */
    /* loaded from: classes2.dex */
    static final class BinderC9523r extends AbstractBinderC9507b<Status> {
        public BinderC9523r(ahl.AbstractC6344b<Status> abstractC6344b) {
            super(abstractC6344b);
        }

        @Override // com.google.android.gms.wearable.internal.AbstractBinderC9477a, com.google.android.gms.wearable.internal.AbstractC9615w
        /* renamed from: a */
        public void mo7730a(ChannelSendFileResponse channelSendFileResponse) {
            a((BinderC9523r) new Status(channelSendFileResponse.f29916b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.wearable.internal.aq$s */
    /* loaded from: classes2.dex */
    public static final class BinderC9524s extends AbstractBinderC9507b<AbstractC9441a.AbstractC9448g> {
        public BinderC9524s(ahl.AbstractC6344b<AbstractC9441a.AbstractC9448g> abstractC6344b) {
            super(abstractC6344b);
        }

        @Override // com.google.android.gms.wearable.internal.AbstractBinderC9477a, com.google.android.gms.wearable.internal.AbstractC9615w
        /* renamed from: a */
        public void mo7712a(RemoveLocalCapabilityResponse removeLocalCapabilityResponse) {
            a((BinderC9524s) new C9547bb.C9553a(C9501am.m7990a(removeLocalCapabilityResponse.f29992b)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.wearable.internal.aq$t */
    /* loaded from: classes2.dex */
    public static final class BinderC9525t extends AbstractBinderC9507b<AbstractC9630m.AbstractC9633c> {
        public BinderC9525t(ahl.AbstractC6344b<AbstractC9630m.AbstractC9633c> abstractC6344b) {
            super(abstractC6344b);
        }

        @Override // com.google.android.gms.wearable.internal.AbstractBinderC9477a, com.google.android.gms.wearable.internal.AbstractC9615w
        /* renamed from: a */
        public void mo7711a(SendMessageResponse sendMessageResponse) {
            a((BinderC9525t) new C9478aa.C9482b(C9501am.m7990a(sendMessageResponse.f29994b), sendMessageResponse.f29995c));
        }
    }

    /* renamed from: com.google.android.gms.wearable.internal.aq$u */
    /* loaded from: classes2.dex */
    static final class BinderC9526u extends AbstractBinderC9507b<Status> {
        public BinderC9526u(ahl.AbstractC6344b<Status> abstractC6344b) {
            super(abstractC6344b);
        }

        @Override // com.google.android.gms.wearable.internal.AbstractBinderC9477a, com.google.android.gms.wearable.internal.AbstractC9615w
        /* renamed from: a */
        public void mo7731a(ChannelReceiveFileResponse channelReceiveFileResponse) {
            a((BinderC9526u) new Status(channelReceiveFileResponse.f29914b));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static Map<String, AbstractC9452b> m7983b(List<CapabilityInfoParcelable> list) {
        HashMap hashMap = new HashMap(list.size() * 2);
        for (CapabilityInfoParcelable capabilityInfoParcelable : list) {
            hashMap.put(capabilityInfoParcelable.mo7883a(), new C9547bb.C9555c(capabilityInfoParcelable));
        }
        return hashMap;
    }
}
