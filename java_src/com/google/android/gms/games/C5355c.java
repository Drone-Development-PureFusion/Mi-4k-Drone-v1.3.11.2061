package com.google.android.gms.games;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.support.annotation.RequiresPermission;
import android.view.View;
import com.google.android.gms.common.C4538f;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.games.achievement.AbstractC5335c;
import com.google.android.gms.games.appcontent.AbstractC5351i;
import com.google.android.gms.games.event.AbstractC5382c;
import com.google.android.gms.games.internal.C5670d;
import com.google.android.gms.games.internal.p241a.C5393a;
import com.google.android.gms.games.internal.p241a.C5408b;
import com.google.android.gms.games.internal.p241a.C5412c;
import com.google.android.gms.games.internal.p241a.C5420d;
import com.google.android.gms.games.internal.p241a.C5430e;
import com.google.android.gms.games.internal.p241a.C5436f;
import com.google.android.gms.games.internal.p241a.C5456g;
import com.google.android.gms.games.internal.p241a.C5457h;
import com.google.android.gms.games.internal.p241a.C5472i;
import com.google.android.gms.games.internal.p241a.C5519j;
import com.google.android.gms.games.internal.p241a.C5532k;
import com.google.android.gms.games.internal.p241a.C5533l;
import com.google.android.gms.games.internal.p241a.C5550m;
import com.google.android.gms.games.internal.p241a.C5565n;
import com.google.android.gms.games.internal.p241a.C5579o;
import com.google.android.gms.games.internal.p241a.C5583p;
import com.google.android.gms.games.internal.p241a.C5609q;
import com.google.android.gms.games.multiplayer.AbstractC5940c;
import com.google.android.gms.games.multiplayer.AbstractC5942d;
import com.google.android.gms.games.multiplayer.realtime.AbstractC5952b;
import com.google.android.gms.games.multiplayer.turnbased.AbstractC5971g;
import com.google.android.gms.games.p240a.AbstractC5326m;
import com.google.android.gms.games.quest.AbstractC5991f;
import com.google.android.gms.games.request.AbstractC6001g;
import com.google.android.gms.games.snapshot.AbstractC6013g;
import com.google.android.gms.games.social.AbstractC6019b;
import com.google.android.gms.games.stats.AbstractC6028c;
import com.google.android.gms.games.video.AbstractC6037f;
import com.google.android.gms.internal.ahl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: com.google.android.gms.games.c */
/* loaded from: classes.dex */
public final class C5355c {

    /* renamed from: a */
    public static final String f19402a = "players";

    /* renamed from: b */
    public static final String f19403b = "status";

    /* renamed from: c */
    static final C4467a.C4478g<C5670d> f19404c = new C4467a.C4478g<>();

    /* renamed from: y */
    private static final C4467a.AbstractC4473b<C5670d, C5365c> f19426y = new AbstractC5364b() { // from class: com.google.android.gms.games.c.1
        @Override // com.google.android.gms.common.api.C4467a.AbstractC4476e
        /* renamed from: a */
        public List<Scope> mo20498a(C5365c c5365c) {
            return Collections.singletonList(C5355c.f19405d);
        }
    };

    /* renamed from: z */
    private static final C4467a.AbstractC4473b<C5670d, C5365c> f19427z = new AbstractC5364b() { // from class: com.google.android.gms.games.c.2
        @Override // com.google.android.gms.common.api.C4467a.AbstractC4476e
        /* renamed from: a */
        public List<Scope> mo20498a(C5365c c5365c) {
            return Collections.singletonList(C5355c.f19407f);
        }
    };

    /* renamed from: d */
    public static final Scope f19405d = new Scope(C4538f.f16926f);

    /* renamed from: e */
    public static final C4467a<C5365c> f19406e = new C4467a<>("Games.API", f19426y, f19404c);

    /* renamed from: f */
    public static final Scope f19407f = new Scope("https://www.googleapis.com/auth/games.firstparty");

    /* renamed from: g */
    public static final C4467a<C5365c> f19408g = new C4467a<>("Games.API_1P", f19427z, f19404c);

    /* renamed from: h */
    public static final AbstractC5376e f19409h = new C5420d();

    /* renamed from: i */
    public static final AbstractC5335c f19410i = new C5393a();

    /* renamed from: j */
    public static final AbstractC5351i f19411j = new C5408b();

    /* renamed from: k */
    public static final AbstractC5382c f19412k = new C5412c();

    /* renamed from: l */
    public static final AbstractC5326m f19413l = new C5436f();

    /* renamed from: m */
    public static final AbstractC5940c f19414m = new C5430e();

    /* renamed from: n */
    public static final AbstractC5971g f19415n = new C5583p();

    /* renamed from: o */
    public static final AbstractC5952b f19416o = new C5532k();

    /* renamed from: p */
    public static final AbstractC5942d f19417p = new C5456g();

    /* renamed from: q */
    public static final AbstractC5978n f19418q = new C5472i();

    /* renamed from: r */
    public static final AbstractC5385g f19419r = new C5457h();

    /* renamed from: s */
    public static final AbstractC5991f f19420s = new C5519j();

    /* renamed from: t */
    public static final AbstractC6001g f19421t = new C5533l();

    /* renamed from: u */
    public static final AbstractC6013g f19422u = new C5550m();

    /* renamed from: v */
    public static final AbstractC6028c f19423v = new C5579o();

    /* renamed from: w */
    public static final AbstractC6037f f19424w = new C5609q();

    /* renamed from: x */
    public static final AbstractC6019b f19425x = new C5565n();

    /* renamed from: com.google.android.gms.games.c$3 */
    /* loaded from: classes2.dex */
    final class C53583 extends AbstractC5370f {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahl.AbstractC6343a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7809a(C5670d c5670d) {
            c5670d.m20188a(this);
        }
    }

    /* renamed from: com.google.android.gms.games.c$6 */
    /* loaded from: classes2.dex */
    final class C53616 extends AbstractC5363a<Status> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public Status mo7807b(Status status) {
            return status;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahl.AbstractC6343a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7809a(C5670d c5670d) {
            c5670d.m20202a((Account) null, (byte[]) null);
        }
    }

    /* renamed from: com.google.android.gms.games.c$7 */
    /* loaded from: classes2.dex */
    final class C53627 extends AbstractC5363a<Status> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public Status mo7807b(Status status) {
            return status;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ahl.AbstractC6343a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7809a(C5670d c5670d) {
            c5670d.m20203a((Account) null);
        }
    }

    /* renamed from: com.google.android.gms.games.c$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC5363a<R extends AbstractC4502m> extends ahl.AbstractC6343a<R, C5670d> {
        public AbstractC5363a(AbstractC4489g abstractC4489g) {
            super(C5355c.f19404c, abstractC4489g);
        }
    }

    /* renamed from: com.google.android.gms.games.c$b */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC5364b extends C4467a.AbstractC4473b<C5670d, C5365c> {
        private AbstractC5364b() {
        }

        @Override // com.google.android.gms.common.api.C4467a.AbstractC4476e
        /* renamed from: a */
        public int mo9706a() {
            return 1;
        }

        @Override // com.google.android.gms.common.api.C4467a.AbstractC4473b
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public C5670d mo7438a(Context context, Looper looper, C4626s c4626s, C5365c c5365c, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
            return new C5670d(context, looper, c4626s, c5365c == null ? new C5365c() : c5365c, abstractC4491b, abstractC4492c);
        }
    }

    /* renamed from: com.google.android.gms.games.c$c */
    /* loaded from: classes2.dex */
    public static final class C5365c implements C4467a.AbstractC4468a.AbstractC4472d {

        /* renamed from: a */
        public final boolean f19429a;

        /* renamed from: b */
        public final boolean f19430b;

        /* renamed from: c */
        public final int f19431c;

        /* renamed from: d */
        public final boolean f19432d;

        /* renamed from: e */
        public final int f19433e;

        /* renamed from: f */
        public final String f19434f;

        /* renamed from: g */
        public final ArrayList<String> f19435g;

        /* renamed from: h */
        public final boolean f19436h;

        /* renamed from: i */
        public final boolean f19437i;

        /* renamed from: com.google.android.gms.games.c$c$a */
        /* loaded from: classes2.dex */
        public static final class C5366a {

            /* renamed from: a */
            boolean f19438a;

            /* renamed from: b */
            boolean f19439b;

            /* renamed from: c */
            int f19440c;

            /* renamed from: d */
            boolean f19441d;

            /* renamed from: e */
            int f19442e;

            /* renamed from: f */
            String f19443f;

            /* renamed from: g */
            ArrayList<String> f19444g;

            /* renamed from: h */
            boolean f19445h;

            /* renamed from: i */
            boolean f19446i;

            private C5366a() {
                this.f19438a = false;
                this.f19439b = true;
                this.f19440c = 17;
                this.f19441d = false;
                this.f19442e = 4368;
                this.f19443f = null;
                this.f19444g = new ArrayList<>();
                this.f19445h = false;
                this.f19446i = false;
            }

            /* renamed from: a */
            public C5366a m20486a(int i) {
                this.f19442e = i;
                return this;
            }

            /* renamed from: a */
            public C5366a m20485a(boolean z) {
                this.f19439b = z;
                this.f19440c = 17;
                return this;
            }

            /* renamed from: a */
            public C5366a m20484a(boolean z, int i) {
                this.f19439b = z;
                this.f19440c = i;
                return this;
            }

            /* renamed from: a */
            public C5365c m20487a() {
                return new C5365c(this);
            }

            /* renamed from: b */
            public C5366a m20483b(boolean z) {
                this.f19445h = z;
                return this;
            }
        }

        private C5365c() {
            this.f19429a = false;
            this.f19430b = true;
            this.f19431c = 17;
            this.f19432d = false;
            this.f19433e = 4368;
            this.f19434f = null;
            this.f19435g = new ArrayList<>();
            this.f19436h = false;
            this.f19437i = false;
        }

        private C5365c(C5366a c5366a) {
            this.f19429a = false;
            this.f19430b = c5366a.f19439b;
            this.f19431c = c5366a.f19440c;
            this.f19432d = false;
            this.f19433e = c5366a.f19442e;
            this.f19434f = null;
            this.f19435g = c5366a.f19444g;
            this.f19436h = c5366a.f19445h;
            this.f19437i = false;
        }

        /* renamed from: b */
        public static C5366a m20488b() {
            return new C5366a();
        }

        /* renamed from: a */
        public Bundle m20489a() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("com.google.android.gms.games.key.isHeadless", this.f19429a);
            bundle.putBoolean("com.google.android.gms.games.key.showConnectingPopup", this.f19430b);
            bundle.putInt("com.google.android.gms.games.key.connectingPopupGravity", this.f19431c);
            bundle.putBoolean("com.google.android.gms.games.key.retryingSignIn", this.f19432d);
            bundle.putInt("com.google.android.gms.games.key.sdkVariant", this.f19433e);
            bundle.putString("com.google.android.gms.games.key.forceResolveAccountKey", this.f19434f);
            bundle.putStringArrayList("com.google.android.gms.games.key.proxyApis", this.f19435g);
            bundle.putBoolean("com.google.android.gms.games.key.requireGooglePlus", this.f19436h);
            bundle.putBoolean("com.google.android.gms.games.key.unauthenticated", this.f19437i);
            return bundle;
        }
    }

    /* renamed from: com.google.android.gms.games.c$d */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC5367d extends AbstractC5363a<AbstractC5369e> {
        private AbstractC5367d(AbstractC4489g abstractC4489g) {
            super(abstractC4489g);
        }

        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public AbstractC5369e mo7807b(final Status status) {
            return new AbstractC5369e() { // from class: com.google.android.gms.games.c.d.1
                @Override // com.google.android.gms.common.api.AbstractC4502m
                /* renamed from: a */
                public Status mo7645a() {
                    return status;
                }

                @Override // com.google.android.gms.games.C5355c.AbstractC5369e
                /* renamed from: b */
                public String mo20033b() {
                    return null;
                }
            };
        }
    }

    @Deprecated
    /* renamed from: com.google.android.gms.games.c$e */
    /* loaded from: classes.dex */
    public interface AbstractC5369e extends AbstractC4502m {
        /* renamed from: b */
        String mo20033b();
    }

    /* renamed from: com.google.android.gms.games.c$f */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC5370f extends AbstractC5363a<AbstractC5372g> {
        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public AbstractC5372g mo7807b(final Status status) {
            return new AbstractC5372g() { // from class: com.google.android.gms.games.c.f.1
                @Override // com.google.android.gms.common.api.AbstractC4502m
                /* renamed from: a */
                public Status mo7645a() {
                    return status;
                }
            };
        }
    }

    /* renamed from: com.google.android.gms.games.c$g */
    /* loaded from: classes2.dex */
    public interface AbstractC5372g extends AbstractC4502m {
    }

    /* renamed from: com.google.android.gms.games.c$h */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC5373h extends AbstractC5363a<Status> {
        private AbstractC5373h(AbstractC4489g abstractC4489g) {
            super(abstractC4489g);
        }

        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public Status mo7807b(Status status) {
            return status;
        }
    }

    /* renamed from: com.google.android.gms.games.c$i */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC5374i extends AbstractC5363a<Status> {
        @Override // com.google.android.gms.internal.ahn
        /* renamed from: a */
        public Status mo7807b(Status status) {
            return status;
        }
    }

    private C5355c() {
    }

    @Deprecated
    /* renamed from: a */
    public static AbstractC4494i<AbstractC5369e> m20508a(AbstractC4489g abstractC4489g, final String str) {
        C4588d.m23624a(str, (Object) "Please provide a valid serverClientId");
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC5367d(abstractC4489g) { // from class: com.google.android.gms.games.c.4
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C5670d c5670d) {
                c5670d.m20142a(str, this);
            }
        });
    }

    /* renamed from: a */
    public static C5670d m20511a(AbstractC4489g abstractC4489g) {
        return m20507a(abstractC4489g, true);
    }

    /* renamed from: a */
    public static C5670d m20507a(AbstractC4489g abstractC4489g, boolean z) {
        C4588d.m23618b(abstractC4489g != null, "GoogleApiClient parameter is required.");
        C4588d.m23622a(abstractC4489g.mo17353j(), "GoogleApiClient must be connected.");
        return m20505b(abstractC4489g, z);
    }

    /* renamed from: a */
    public static void m20510a(AbstractC4489g abstractC4489g, int i) {
        C5670d m20507a = m20507a(abstractC4489g, false);
        if (m20507a != null) {
            m20507a.m20114c(i);
        }
    }

    /* renamed from: a */
    public static void m20509a(AbstractC4489g abstractC4489g, View view) {
        C4588d.m23627a(view);
        C5670d m20507a = m20507a(abstractC4489g, false);
        if (m20507a != null) {
            m20507a.m20197a(view);
        }
    }

    /* renamed from: b */
    public static C5670d m20505b(AbstractC4489g abstractC4489g, boolean z) {
        C4588d.m23622a(abstractC4489g.mo17382a((C4467a<?>) f19406e), "GoogleApiClient is not configured to use the Games Api. Pass Games.API into GoogleApiClient.Builder#addApi() to use this feature.");
        boolean mo17369b = abstractC4489g.mo17369b(f19406e);
        if (!z || mo17369b) {
            if (!mo17369b) {
                return null;
            }
            return (C5670d) abstractC4489g.mo17383a((C4467a.C4475d<C4467a.AbstractC4477f>) f19404c);
        }
        throw new IllegalStateException("GoogleApiClient has an optional Games.API and is not connected to Games. Use GoogleApiClient.hasConnectedApi(Games.API) to guard this call.");
    }

    @RequiresPermission("android.permission.GET_ACCOUNTS")
    /* renamed from: b */
    public static String m20506b(AbstractC4489g abstractC4489g) {
        return m20511a(abstractC4489g).m20075h();
    }

    /* renamed from: c */
    public static String m20504c(AbstractC4489g abstractC4489g) {
        return m20511a(abstractC4489g).m20217M();
    }

    /* renamed from: d */
    public static Intent m20503d(AbstractC4489g abstractC4489g) {
        return m20511a(abstractC4489g).m20219K();
    }

    /* renamed from: e */
    public static AbstractC4494i<Status> m20502e(AbstractC4489g abstractC4489g) {
        return abstractC4489g.mo17253b((AbstractC4489g) new AbstractC5373h(abstractC4489g) { // from class: com.google.android.gms.games.c.5
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ahl.AbstractC6343a
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo7809a(C5670d c5670d) {
                c5670d.m20113c(this);
            }
        });
    }

    /* renamed from: f */
    public static int m20501f(AbstractC4489g abstractC4489g) {
        return m20511a(abstractC4489g).m20218L();
    }
}
