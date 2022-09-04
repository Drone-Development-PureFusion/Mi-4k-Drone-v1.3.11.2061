package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.ahl;
import com.google.android.gms.internal.ail;
import com.google.android.gms.wearable.AbstractC9453c;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.internal.C9483ab;
import com.google.android.gms.wearable.internal.C9560bd;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/* loaded from: classes2.dex */
public class ChannelImpl extends AbstractSafeParcelable implements Channel {
    public static final Parcelable.Creator<ChannelImpl> CREATOR = new C9567bg();

    /* renamed from: a */
    final int f29891a;

    /* renamed from: b */
    private final String f29892b;

    /* renamed from: c */
    private final String f29893c;

    /* renamed from: d */
    private final String f29894d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.wearable.internal.ChannelImpl$a */
    /* loaded from: classes2.dex */
    public static final class C9475a implements Channel.AbstractC9426a {

        /* renamed from: a */
        private final Status f29909a;

        /* renamed from: b */
        private final InputStream f29910b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C9475a(Status status, InputStream inputStream) {
            this.f29909a = (Status) C4588d.m23627a(status);
            this.f29910b = inputStream;
        }

        @Override // com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        public Status mo7645a() {
            return this.f29909a;
        }

        @Override // com.google.android.gms.common.api.AbstractC4500k
        /* renamed from: b */
        public void mo7804b() {
            if (this.f29910b != null) {
                try {
                    this.f29910b.close();
                } catch (IOException e) {
                }
            }
        }

        @Override // com.google.android.gms.wearable.Channel.AbstractC9426a
        /* renamed from: c */
        public InputStream mo8045c() {
            return this.f29910b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.wearable.internal.ChannelImpl$b */
    /* loaded from: classes2.dex */
    public static final class C9476b implements Channel.AbstractC9427b {

        /* renamed from: a */
        private final Status f29911a;

        /* renamed from: b */
        private final OutputStream f29912b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C9476b(Status status, OutputStream outputStream) {
            this.f29911a = (Status) C4588d.m23627a(status);
            this.f29912b = outputStream;
        }

        @Override // com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        public Status mo7645a() {
            return this.f29911a;
        }

        @Override // com.google.android.gms.common.api.AbstractC4500k
        /* renamed from: b */
        public void mo7804b() {
            if (this.f29912b != null) {
                try {
                    this.f29912b.close();
                } catch (IOException e) {
                }
            }
        }

        @Override // com.google.android.gms.wearable.Channel.AbstractC9427b
        /* renamed from: c */
        public OutputStream mo8044c() {
            return this.f29912b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ChannelImpl(int i, String str, String str2, String str3) {
        this.f29891a = i;
        this.f29892b = (String) C4588d.m23627a(str);
        this.f29893c = (String) C4588d.m23627a(str2);
        this.f29894d = (String) C4588d.m23627a(str3);
    }

    /* renamed from: a */
    private static C9483ab.AbstractC9484a<AbstractC9453c.AbstractC9454a> m8064a(final String str, final IntentFilter[] intentFilterArr) {
        return new C9483ab.AbstractC9484a<AbstractC9453c.AbstractC9454a>() { // from class: com.google.android.gms.wearable.internal.ChannelImpl.7
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void m8046a(C9527ar c9527ar, ahl.AbstractC6344b<Status> abstractC6344b, AbstractC9453c.AbstractC9454a abstractC9454a, ail<AbstractC9453c.AbstractC9454a> ailVar) {
                c9527ar.m7968a(abstractC6344b, abstractC9454a, ailVar, str, intentFilterArr);
            }

            @Override // com.google.android.gms.wearable.internal.C9483ab.AbstractC9484a
            /* renamed from: a */
            public /* bridge */ /* synthetic */ void mo7811a(C9527ar c9527ar, ahl.AbstractC6344b abstractC6344b, AbstractC9453c.AbstractC9454a abstractC9454a, ail<AbstractC9453c.AbstractC9454a> ailVar) {
                m8046a(c9527ar, (ahl.AbstractC6344b<Status>) abstractC6344b, abstractC9454a, ailVar);
            }
        };
    }

    @Override // com.google.android.gms.wearable.Channel
    /* renamed from: a */
    public AbstractC4494i<Status> mo8071a(AbstractC4489g abstractC4489g) {
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC9546ba<Status>(abstractC4489g) { // from class: com.google.android.gms.wearable.internal.ChannelImpl.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahn
            /* renamed from: a */
            public Status mo7807b(Status status) {
                return status;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C9527ar c9527ar) {
                c9527ar.m7946c(this, ChannelImpl.this.f29892b);
            }
        });
    }

    @Override // com.google.android.gms.wearable.Channel
    /* renamed from: a */
    public AbstractC4494i<Status> mo8070a(AbstractC4489g abstractC4489g, final int i) {
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC9546ba<Status>(abstractC4489g) { // from class: com.google.android.gms.wearable.internal.ChannelImpl.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahn
            /* renamed from: a */
            public Status mo7807b(Status status) {
                return status;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C9527ar c9527ar) {
                c9527ar.m7950b(this, ChannelImpl.this.f29892b, i);
            }
        });
    }

    @Override // com.google.android.gms.wearable.Channel
    /* renamed from: a */
    public AbstractC4494i<Status> mo8069a(AbstractC4489g abstractC4489g, Uri uri) {
        return mo8068a(abstractC4489g, uri, 0L, -1L);
    }

    @Override // com.google.android.gms.wearable.Channel
    /* renamed from: a */
    public AbstractC4494i<Status> mo8068a(AbstractC4489g abstractC4489g, final Uri uri, final long j, final long j2) {
        C4588d.m23626a(abstractC4489g, "client is null");
        C4588d.m23626a(this.f29892b, (Object) "token is null");
        C4588d.m23626a(uri, "uri is null");
        C4588d.m23617b(j >= 0, "startOffset is negative: %s", Long.valueOf(j));
        C4588d.m23617b(j2 >= 0 || j2 == -1, "invalid length: %s", Long.valueOf(j2));
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC9546ba<Status>(abstractC4489g) { // from class: com.google.android.gms.wearable.internal.ChannelImpl.6
            @Override // com.google.android.gms.internal.ahn
            /* renamed from: a */
            public Status mo7807b(Status status) {
                return status;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C9527ar c9527ar) {
                c9527ar.m7957a(this, ChannelImpl.this.f29892b, uri, j, j2);
            }
        });
    }

    @Override // com.google.android.gms.wearable.Channel
    /* renamed from: a */
    public AbstractC4494i<Status> mo8067a(AbstractC4489g abstractC4489g, final Uri uri, final boolean z) {
        C4588d.m23626a(abstractC4489g, "client is null");
        C4588d.m23626a(uri, "uri is null");
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC9546ba<Status>(abstractC4489g) { // from class: com.google.android.gms.wearable.internal.ChannelImpl.5
            @Override // com.google.android.gms.internal.ahn
            /* renamed from: a */
            public Status mo7807b(Status status) {
                return status;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C9527ar c9527ar) {
                c9527ar.m7956a(this, ChannelImpl.this.f29892b, uri, z);
            }
        });
    }

    @Override // com.google.android.gms.wearable.Channel
    /* renamed from: a */
    public AbstractC4494i<Status> mo8066a(AbstractC4489g abstractC4489g, AbstractC9453c.AbstractC9454a abstractC9454a) {
        return C9483ab.m8028a(abstractC4489g, m8064a(this.f29892b, new IntentFilter[]{C9504ap.m7986a(AbstractC9453c.f29844a)}), abstractC9454a);
    }

    @Override // com.google.android.gms.wearable.Channel
    /* renamed from: a */
    public String mo8072a() {
        return this.f29893c;
    }

    @Override // com.google.android.gms.wearable.Channel
    /* renamed from: b */
    public AbstractC4494i<Channel.AbstractC9426a> mo8062b(AbstractC4489g abstractC4489g) {
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC9546ba<Channel.AbstractC9426a>(abstractC4489g) { // from class: com.google.android.gms.wearable.internal.ChannelImpl.3
            @Override // com.google.android.gms.internal.ahn
            /* renamed from: a */
            public Channel.AbstractC9426a mo7807b(Status status) {
                return new C9475a(status, null);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C9527ar c9527ar) {
                c9527ar.m7945d(this, ChannelImpl.this.f29892b);
            }
        });
    }

    @Override // com.google.android.gms.wearable.Channel
    /* renamed from: b */
    public AbstractC4494i<Status> mo8061b(AbstractC4489g abstractC4489g, AbstractC9453c.AbstractC9454a abstractC9454a) {
        C4588d.m23626a(abstractC4489g, "client is null");
        C4588d.m23626a(abstractC9454a, "listener is null");
        return abstractC4489g.mo17255a((AbstractC4489g) new C9560bd.C9564b(abstractC4489g, abstractC9454a, this.f29892b));
    }

    @Override // com.google.android.gms.wearable.Channel
    /* renamed from: b */
    public String mo8063b() {
        return this.f29894d;
    }

    @Override // com.google.android.gms.wearable.Channel
    /* renamed from: c */
    public AbstractC4494i<Channel.AbstractC9427b> mo8059c(AbstractC4489g abstractC4489g) {
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC9546ba<Channel.AbstractC9427b>(abstractC4489g) { // from class: com.google.android.gms.wearable.internal.ChannelImpl.4
            @Override // com.google.android.gms.internal.ahn
            /* renamed from: a */
            public Channel.AbstractC9427b mo7807b(Status status) {
                return new C9476b(status, null);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C9527ar c9527ar) {
                c9527ar.m7944e(this, ChannelImpl.this.f29892b);
            }
        });
    }

    /* renamed from: c */
    public String m8060c() {
        return this.f29892b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChannelImpl)) {
            return false;
        }
        ChannelImpl channelImpl = (ChannelImpl) obj;
        return this.f29892b.equals(channelImpl.f29892b) && C4585c.m23634a(channelImpl.f29893c, this.f29893c) && C4585c.m23634a(channelImpl.f29894d, this.f29894d) && channelImpl.f29891a == this.f29891a;
    }

    public int hashCode() {
        return this.f29892b.hashCode();
    }

    public String toString() {
        int i = this.f29891a;
        String str = this.f29892b;
        String str2 = this.f29893c;
        String str3 = this.f29894d;
        return new StringBuilder(String.valueOf(str).length() + 66 + String.valueOf(str2).length() + String.valueOf(str3).length()).append("ChannelImpl{versionCode=").append(i).append(", token='").append(str).append("'").append(", nodeId='").append(str2).append("'").append(", path='").append(str3).append("'").append("}").toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9567bg.m7859a(this, parcel, i);
    }
}
