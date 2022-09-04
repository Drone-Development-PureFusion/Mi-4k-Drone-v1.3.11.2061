package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.net.Uri;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.ahl;
import com.google.android.gms.internal.ail;
import com.google.android.gms.wearable.AbstractC9441a;
import com.google.android.gms.wearable.AbstractC9452b;
import com.google.android.gms.wearable.AbstractC9635o;
import com.google.android.gms.wearable.internal.C9483ab;
import java.util.Map;
import java.util.Set;
/* renamed from: com.google.android.gms.wearable.internal.bb */
/* loaded from: classes2.dex */
public class C9547bb implements AbstractC9441a {

    /* renamed from: com.google.android.gms.wearable.internal.bb$a */
    /* loaded from: classes2.dex */
    public static class C9553a implements AbstractC9441a.AbstractC9442a, AbstractC9441a.AbstractC9448g {

        /* renamed from: a */
        private final Status f30081a;

        public C9553a(Status status) {
            this.f30081a = status;
        }

        @Override // com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        public Status mo7645a() {
            return this.f30081a;
        }
    }

    /* renamed from: com.google.android.gms.wearable.internal.bb$b */
    /* loaded from: classes2.dex */
    private static class C9554b implements AbstractC9441a.AbstractC9444c {

        /* renamed from: a */
        final AbstractC9441a.AbstractC9444c f30082a;

        /* renamed from: b */
        final String f30083b;

        C9554b(AbstractC9441a.AbstractC9444c abstractC9444c, String str) {
            this.f30082a = abstractC9444c;
            this.f30083b = str;
        }

        @Override // com.google.android.gms.wearable.AbstractC9441a.AbstractC9444c
        /* renamed from: a */
        public void mo7884a(AbstractC9452b abstractC9452b) {
            this.f30082a.mo7884a(abstractC9452b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C9554b c9554b = (C9554b) obj;
            if (!this.f30082a.equals(c9554b.f30082a)) {
                return false;
            }
            return this.f30083b.equals(c9554b.f30083b);
        }

        public int hashCode() {
            return (this.f30082a.hashCode() * 31) + this.f30083b.hashCode();
        }
    }

    /* renamed from: com.google.android.gms.wearable.internal.bb$c */
    /* loaded from: classes2.dex */
    public static class C9555c implements AbstractC9452b {

        /* renamed from: a */
        private final String f30084a;

        /* renamed from: b */
        private final Set<AbstractC9635o> f30085b;

        public C9555c(AbstractC9452b abstractC9452b) {
            this(abstractC9452b.mo7883a(), abstractC9452b.mo7882b());
        }

        public C9555c(String str, Set<AbstractC9635o> set) {
            this.f30084a = str;
            this.f30085b = set;
        }

        @Override // com.google.android.gms.wearable.AbstractC9452b
        /* renamed from: a */
        public String mo7883a() {
            return this.f30084a;
        }

        @Override // com.google.android.gms.wearable.AbstractC9452b
        /* renamed from: b */
        public Set<AbstractC9635o> mo7882b() {
            return this.f30085b;
        }
    }

    /* renamed from: com.google.android.gms.wearable.internal.bb$d */
    /* loaded from: classes2.dex */
    public static class C9556d implements AbstractC9441a.AbstractC9445d {

        /* renamed from: a */
        private final Status f30086a;

        /* renamed from: b */
        private final Map<String, AbstractC9452b> f30087b;

        public C9556d(Status status, Map<String, AbstractC9452b> map) {
            this.f30086a = status;
            this.f30087b = map;
        }

        @Override // com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        public Status mo7645a() {
            return this.f30086a;
        }

        @Override // com.google.android.gms.wearable.AbstractC9441a.AbstractC9445d
        /* renamed from: b */
        public Map<String, AbstractC9452b> mo7881b() {
            return this.f30087b;
        }
    }

    /* renamed from: com.google.android.gms.wearable.internal.bb$e */
    /* loaded from: classes2.dex */
    public static class C9557e implements AbstractC9441a.AbstractC9446e {

        /* renamed from: a */
        private final AbstractC9452b f30088a;

        /* renamed from: b */
        private final Status f30089b;

        public C9557e(Status status, AbstractC9452b abstractC9452b) {
            this.f30089b = status;
            this.f30088a = abstractC9452b;
        }

        @Override // com.google.android.gms.common.api.AbstractC4502m
        /* renamed from: a */
        public Status mo7645a() {
            return this.f30089b;
        }

        @Override // com.google.android.gms.wearable.AbstractC9441a.AbstractC9446e
        /* renamed from: b */
        public AbstractC9452b mo7880b() {
            return this.f30088a;
        }
    }

    /* renamed from: com.google.android.gms.wearable.internal.bb$f */
    /* loaded from: classes2.dex */
    private static final class C9558f extends AbstractC9546ba<Status> {

        /* renamed from: a */
        private AbstractC9441a.AbstractC9444c f30090a;

        private C9558f(AbstractC4489g abstractC4489g, AbstractC9441a.AbstractC9444c abstractC9444c) {
            super(abstractC4489g);
            this.f30090a = abstractC9444c;
        }

        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public Status mo7807b(Status status) {
            this.f30090a = null;
            return status;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahl.AbstractC6343a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7809a(C9527ar c9527ar) {
            c9527ar.m7970a(this, this.f30090a);
            this.f30090a = null;
        }
    }

    /* renamed from: a */
    private AbstractC4494i<Status> m7899a(AbstractC4489g abstractC4489g, AbstractC9441a.AbstractC9444c abstractC9444c, IntentFilter[] intentFilterArr) {
        return C9483ab.m8028a(abstractC4489g, m7896a(intentFilterArr), abstractC9444c);
    }

    /* renamed from: a */
    private static C9483ab.AbstractC9484a<AbstractC9441a.AbstractC9444c> m7896a(final IntentFilter[] intentFilterArr) {
        return new C9483ab.AbstractC9484a<AbstractC9441a.AbstractC9444c>() { // from class: com.google.android.gms.wearable.internal.bb.5
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void m7885a(C9527ar c9527ar, ahl.AbstractC6344b<Status> abstractC6344b, AbstractC9441a.AbstractC9444c abstractC9444c, ail<AbstractC9441a.AbstractC9444c> ailVar) {
                c9527ar.m7969a(abstractC6344b, abstractC9444c, ailVar, intentFilterArr);
            }

            @Override // com.google.android.gms.wearable.internal.C9483ab.AbstractC9484a
            /* renamed from: a */
            public /* bridge */ /* synthetic */ void mo7811a(C9527ar c9527ar, ahl.AbstractC6344b abstractC6344b, AbstractC9441a.AbstractC9444c abstractC9444c, ail<AbstractC9441a.AbstractC9444c> ailVar) {
                m7885a(c9527ar, (ahl.AbstractC6344b<Status>) abstractC6344b, abstractC9444c, ailVar);
            }
        };
    }

    @Override // com.google.android.gms.wearable.AbstractC9441a
    /* renamed from: a */
    public AbstractC4494i<AbstractC9441a.AbstractC9445d> mo7903a(AbstractC4489g abstractC4489g, final int i) {
        boolean z = true;
        if (i != 0 && i != 1) {
            z = false;
        }
        C4588d.m23619b(z);
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC9546ba<AbstractC9441a.AbstractC9445d>(abstractC4489g) { // from class: com.google.android.gms.wearable.internal.bb.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahn
            /* renamed from: a */
            public AbstractC9441a.AbstractC9445d mo7807b(Status status) {
                return new C9556d(status, null);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C9527ar c9527ar) {
                c9527ar.m7975a(this, i);
            }
        });
    }

    @Override // com.google.android.gms.wearable.AbstractC9441a
    /* renamed from: a */
    public AbstractC4494i<Status> mo7902a(AbstractC4489g abstractC4489g, AbstractC9441a.AbstractC9444c abstractC9444c) {
        return abstractC4489g.mo17255a((AbstractC4489g) new C9558f(abstractC4489g, abstractC9444c));
    }

    @Override // com.google.android.gms.wearable.AbstractC9441a
    /* renamed from: a */
    public AbstractC4494i<Status> mo7901a(AbstractC4489g abstractC4489g, AbstractC9441a.AbstractC9444c abstractC9444c, Uri uri, int i) {
        C4588d.m23618b(uri != null, "uri must not be null");
        C4588d.m23618b(i == 0 || i == 1, "invalid filter type");
        return m7899a(abstractC4489g, abstractC9444c, new IntentFilter[]{C9504ap.m7985a(AbstractC9441a.f29839a, uri, i)});
    }

    @Override // com.google.android.gms.wearable.AbstractC9441a
    /* renamed from: a */
    public AbstractC4494i<Status> mo7900a(AbstractC4489g abstractC4489g, AbstractC9441a.AbstractC9444c abstractC9444c, String str) {
        String str2;
        C4588d.m23618b(str != null, "capability must not be null");
        C9554b c9554b = new C9554b(abstractC9444c, str);
        IntentFilter m7986a = C9504ap.m7986a(AbstractC9441a.f29839a);
        if (!str.startsWith("/")) {
            String valueOf = String.valueOf(str);
            str2 = valueOf.length() != 0 ? "/".concat(valueOf) : new String("/");
        } else {
            str2 = str;
        }
        m7986a.addDataPath(str2, 0);
        return m7899a(abstractC4489g, c9554b, new IntentFilter[]{m7986a});
    }

    @Override // com.google.android.gms.wearable.AbstractC9441a
    /* renamed from: a */
    public AbstractC4494i<AbstractC9441a.AbstractC9442a> mo7898a(AbstractC4489g abstractC4489g, final String str) {
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC9546ba<AbstractC9441a.AbstractC9442a>(abstractC4489g) { // from class: com.google.android.gms.wearable.internal.bb.3
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahn
            /* renamed from: a */
            public AbstractC9441a.AbstractC9442a mo7807b(Status status) {
                return new C9553a(status);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C9527ar c9527ar) {
                c9527ar.m7959a(this, str);
            }
        });
    }

    @Override // com.google.android.gms.wearable.AbstractC9441a
    /* renamed from: a */
    public AbstractC4494i<AbstractC9441a.AbstractC9446e> mo7897a(AbstractC4489g abstractC4489g, final String str, final int i) {
        boolean z = true;
        if (i != 0 && i != 1) {
            z = false;
        }
        C4588d.m23619b(z);
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC9546ba<AbstractC9441a.AbstractC9446e>(abstractC4489g) { // from class: com.google.android.gms.wearable.internal.bb.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahn
            /* renamed from: a */
            public AbstractC9441a.AbstractC9446e mo7807b(Status status) {
                return new C9557e(status, null);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C9527ar c9527ar) {
                c9527ar.m7958a(this, str, i);
            }
        });
    }

    @Override // com.google.android.gms.wearable.AbstractC9441a
    /* renamed from: b */
    public AbstractC4494i<Status> mo7895b(AbstractC4489g abstractC4489g, AbstractC9441a.AbstractC9444c abstractC9444c, String str) {
        return abstractC4489g.mo17255a((AbstractC4489g) new C9558f(abstractC4489g, new C9554b(abstractC9444c, str)));
    }

    @Override // com.google.android.gms.wearable.AbstractC9441a
    /* renamed from: b */
    public AbstractC4494i<AbstractC9441a.AbstractC9448g> mo7894b(AbstractC4489g abstractC4489g, final String str) {
        return abstractC4489g.mo17255a((AbstractC4489g) new AbstractC9546ba<AbstractC9441a.AbstractC9448g>(abstractC4489g) { // from class: com.google.android.gms.wearable.internal.bb.4
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahn
            /* renamed from: a */
            public AbstractC9441a.AbstractC9448g mo7807b(Status status) {
                return new C9553a(status);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C9527ar c9527ar) {
                c9527ar.m7951b(this, str);
            }
        });
    }
}
