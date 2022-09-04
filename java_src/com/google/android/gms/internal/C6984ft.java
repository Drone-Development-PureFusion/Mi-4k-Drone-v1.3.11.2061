package com.google.android.gms.internal;

import android.content.Context;
import android.support.annotation.NonNull;
import com.google.android.gms.common.api.AbstractC4510u;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.C7018gb;
import com.google.android.gms.p239g.AbstractC5285f;
import com.google.android.gms.p239g.C5286g;
import com.google.android.gms.p239g.C5290i;
import com.google.firebase.C9751b;
import com.google.firebase.auth.AbstractC9718a;
import com.google.firebase.auth.AbstractC9727b;
import com.google.firebase.auth.AbstractC9735j;
import com.google.firebase.auth.AbstractC9739n;
import com.google.firebase.auth.AbstractC9746t;
import com.google.firebase.auth.C9728c;
import com.google.firebase.auth.C9729d;
import com.google.firebase.auth.C9741o;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.api.model.GetAccountInfoUser;
import com.google.firebase.auth.api.model.ProviderUserInfo;
import com.google.firebase.auth.api.model.VerifyAssertionRequest;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.google.android.gms.internal.ft */
/* loaded from: classes2.dex */
public class C6984ft extends AbstractC4510u<C7018gb.C7020a> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.ft$a */
    /* loaded from: classes2.dex */
    public static final class C6985a extends AbstractC7024ge<AbstractC9727b, AbstractC7041gj> {
        @NonNull

        /* renamed from: n */
        private String f23669n;
        @NonNull

        /* renamed from: o */
        private String f23670o;

        public C6985a(@NonNull String str, @NonNull String str2) {
            super(2);
            this.f23669n = C4588d.m23624a(str, (Object) "email cannot be null or empty");
            this.f23670o = C4588d.m23624a(str2, (Object) "password cannot be null or empty");
        }

        @Override // com.google.android.gms.internal.AbstractC7024ge
        /* renamed from: a */
        public void mo15774a() {
            this.f23707e.mo15787c(this.f23669n, this.f23670o, this.f23704b);
        }

        @Override // com.google.android.gms.internal.AbstractC7024ge
        /* renamed from: b */
        public void mo15766b() {
            C7046go m15820b = C6984ft.m15820b(this.f23705c, this.f23711i);
            ((AbstractC7041gj) this.f23708f).mo7357a(this.f23710h, m15820b);
            b(new C7043gl(m15820b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.ft$b */
    /* loaded from: classes2.dex */
    public static final class C6986b extends AbstractC7024ge<Void, AbstractC7049gr> {
        public C6986b() {
            super(5);
        }

        @Override // com.google.android.gms.internal.AbstractC7024ge
        /* renamed from: a */
        public void mo15774a() {
            this.f23707e.mo15781g(this.f23706d.mo7254n(), this.f23704b);
        }

        @Override // com.google.android.gms.internal.AbstractC7024ge
        /* renamed from: b */
        public void mo15766b() {
            ((AbstractC7049gr) this.f23708f).mo7359a();
            b(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.ft$c */
    /* loaded from: classes2.dex */
    public static final class C6987c extends AbstractC7024ge<AbstractC9746t, AbstractC7041gj> {
        @NonNull

        /* renamed from: n */
        private final String f23671n;

        public C6987c(@NonNull String str) {
            super(3);
            this.f23671n = C4588d.m23624a(str, (Object) "email cannot be null or empty");
        }

        @Override // com.google.android.gms.internal.AbstractC7024ge
        /* renamed from: a */
        public void mo15774a() {
            this.f23707e.mo15788c(this.f23671n, this.f23704b);
        }

        @Override // com.google.android.gms.internal.AbstractC7024ge
        /* renamed from: b */
        public void mo15766b() {
            b(new C7047gp(this.f23712j));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.ft$d */
    /* loaded from: classes2.dex */
    public static final class C6988d extends AbstractC7024ge<C9741o, AbstractC7041gj> {
        @NonNull

        /* renamed from: n */
        private final String f23672n;

        public C6988d(@NonNull String str) {
            super(1);
            this.f23672n = C4588d.m23624a(str, (Object) "refresh token cannot be null");
        }

        @Override // com.google.android.gms.internal.AbstractC7024ge
        /* renamed from: a */
        public void mo15774a() {
            this.f23707e.mo15795a(this.f23672n, this.f23704b);
        }

        @Override // com.google.android.gms.internal.AbstractC7024ge
        /* renamed from: b */
        public void mo15766b() {
            this.f23710h.m7331a(this.f23672n);
            ((AbstractC7041gj) this.f23708f).mo7357a(this.f23710h, this.f23706d);
            b(new C9741o(this.f23710h.m7329c()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.ft$e */
    /* loaded from: classes2.dex */
    public static final class C6989e extends AbstractC7024ge<AbstractC9727b, AbstractC7041gj> {
        @NonNull

        /* renamed from: n */
        private final C9728c f23673n;

        public C6989e(@NonNull C9728c c9728c) {
            super(2);
            this.f23673n = (C9728c) C4588d.m23626a(c9728c, "credential cannot be null");
        }

        @Override // com.google.android.gms.internal.AbstractC7024ge
        /* renamed from: a */
        public void mo15774a() {
            this.f23707e.mo15791a(this.f23673n.m7280b(), this.f23673n.m7279c(), this.f23706d.mo7254n(), this.f23704b);
        }

        @Override // com.google.android.gms.internal.AbstractC7024ge
        /* renamed from: b */
        public void mo15766b() {
            C7046go m15820b = C6984ft.m15820b(this.f23705c, this.f23711i);
            ((AbstractC7041gj) this.f23708f).mo7357a(this.f23710h, m15820b);
            b(new C7043gl(m15820b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.ft$f */
    /* loaded from: classes2.dex */
    public static final class C6990f extends AbstractC7024ge<AbstractC9727b, AbstractC7041gj> {
        @NonNull

        /* renamed from: n */
        private final VerifyAssertionRequest f23674n;

        public C6990f(@NonNull AbstractC9718a abstractC9718a) {
            super(2);
            C4588d.m23626a(abstractC9718a, "credential cannot be null");
            this.f23674n = C7042gk.m15721a(abstractC9718a);
        }

        @Override // com.google.android.gms.internal.AbstractC7024ge
        /* renamed from: a */
        public void mo15774a() {
            this.f23707e.mo15793a(this.f23706d.mo7254n(), this.f23674n, this.f23704b);
        }

        @Override // com.google.android.gms.internal.AbstractC7024ge
        /* renamed from: b */
        public void mo15766b() {
            C7046go m15820b = C6984ft.m15820b(this.f23705c, this.f23711i);
            ((AbstractC7041gj) this.f23708f).mo7357a(this.f23710h, m15820b);
            b(new C7043gl(m15820b));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.ft$g */
    /* loaded from: classes2.dex */
    public class C6991g<ResultT, CallbackT> extends aiv<AbstractC7006fu, ResultT> implements AbstractC7023gd<ResultT> {

        /* renamed from: b */
        private AbstractC7024ge<ResultT, CallbackT> f23676b;

        /* renamed from: c */
        private C5286g<ResultT> f23677c;

        public C6991g(AbstractC7024ge<ResultT, CallbackT> abstractC7024ge) {
            this.f23676b = abstractC7024ge;
            this.f23676b.m15771a((AbstractC7023gd<ResultT>) this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.aiv
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo7416a(AbstractC7006fu abstractC7006fu, C5286g<ResultT> c5286g) {
            this.f23677c = c5286g;
            this.f23676b.m15772a(abstractC7006fu.mo15808t_());
        }

        @Override // com.google.android.gms.internal.AbstractC7023gd
        /* renamed from: a */
        public final void mo15775a(ResultT resultt, Status status) {
            C4588d.m23626a(this.f23677c, "doExecute must be called before onComplete");
            if (status != null) {
                this.f23677c.m20831a(C7008fw.m15806a(status));
            } else {
                this.f23677c.m20830a((C5286g<ResultT>) resultt);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.ft$h */
    /* loaded from: classes2.dex */
    public static final class C6992h extends AbstractC7024ge<Void, AbstractC7041gj> {
        @NonNull

        /* renamed from: n */
        private final VerifyAssertionRequest f23678n;

        public C6992h(@NonNull AbstractC9718a abstractC9718a) {
            super(2);
            C4588d.m23626a(abstractC9718a, "credential cannot be null");
            this.f23678n = C7042gk.m15721a(abstractC9718a);
        }

        @Override // com.google.android.gms.internal.AbstractC7024ge
        /* renamed from: a */
        public void mo15774a() {
            this.f23707e.mo15796a(this.f23678n, this.f23704b);
        }

        @Override // com.google.android.gms.internal.AbstractC7024ge
        /* renamed from: b */
        public void mo15766b() {
            C7046go m15820b = C6984ft.m15820b(this.f23705c, this.f23711i);
            if (!this.f23706d.mo7233a().equalsIgnoreCase(m15820b.mo7233a())) {
                a(C7048gq.m15717a());
                return;
            }
            ((AbstractC7041gj) this.f23708f).mo7357a(this.f23710h, m15820b);
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.ft$i */
    /* loaded from: classes2.dex */
    public static final class C6993i extends AbstractC7024ge<Void, AbstractC7041gj> {
        @NonNull

        /* renamed from: n */
        private final String f23679n;
        @NonNull

        /* renamed from: o */
        private final String f23680o;

        public C6993i(@NonNull String str, @NonNull String str2) {
            super(2);
            this.f23679n = C4588d.m23624a(str, (Object) "email cannot be null or empty");
            this.f23680o = C4588d.m23624a(str2, (Object) "password cannot be null or empty");
        }

        @Override // com.google.android.gms.internal.AbstractC7024ge
        /* renamed from: a */
        public void mo15774a() {
            this.f23707e.mo15785d(this.f23679n, this.f23680o, this.f23704b);
        }

        @Override // com.google.android.gms.internal.AbstractC7024ge
        /* renamed from: b */
        public void mo15766b() {
            C7046go m15820b = C6984ft.m15820b(this.f23705c, this.f23711i);
            if (!this.f23706d.mo7233a().equalsIgnoreCase(m15820b.mo7233a())) {
                a(C7048gq.m15717a());
                return;
            }
            ((AbstractC7041gj) this.f23708f).mo7357a(this.f23710h, m15820b);
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.ft$j */
    /* loaded from: classes2.dex */
    public static final class C6994j extends AbstractC7024ge<Void, AbstractC7041gj> {
        public C6994j() {
            super(2);
        }

        @Override // com.google.android.gms.internal.AbstractC7024ge
        /* renamed from: a */
        public void mo15774a() {
            this.f23707e.mo15782f(this.f23706d.mo7254n(), this.f23704b);
        }

        @Override // com.google.android.gms.internal.AbstractC7024ge
        /* renamed from: b */
        public void mo15766b() {
            ((AbstractC7041gj) this.f23708f).mo7357a(this.f23710h, C6984ft.m15819b(this.f23705c, this.f23711i, this.f23706d.mo7259i()));
            b(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.ft$k */
    /* loaded from: classes2.dex */
    public static final class C6995k extends AbstractC7024ge<Void, AbstractC7041gj> {
        @NonNull

        /* renamed from: n */
        private String f23681n;

        public C6995k(@NonNull String str) {
            super(6);
            this.f23681n = C4588d.m23624a(str, (Object) "token cannot be null or empty");
        }

        @Override // com.google.android.gms.internal.AbstractC7024ge
        /* renamed from: a */
        public void mo15774a() {
            this.f23707e.mo15780h(this.f23681n, this.f23704b);
        }

        @Override // com.google.android.gms.internal.AbstractC7024ge
        /* renamed from: b */
        public void mo15766b() {
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.ft$l */
    /* loaded from: classes2.dex */
    public static final class C6996l extends AbstractC7024ge<Void, AbstractC7041gj> {
        @NonNull

        /* renamed from: n */
        private String f23682n;

        public C6996l(@NonNull String str) {
            super(4);
            this.f23682n = C4588d.m23624a(str, (Object) "email cannot be null or empty");
        }

        @Override // com.google.android.gms.internal.AbstractC7024ge
        /* renamed from: a */
        public void mo15774a() {
            this.f23707e.mo15786d(this.f23682n, this.f23704b);
        }

        @Override // com.google.android.gms.internal.AbstractC7024ge
        /* renamed from: b */
        public void mo15766b() {
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.ft$m */
    /* loaded from: classes2.dex */
    public static final class C6997m extends AbstractC7024ge<AbstractC9727b, AbstractC7041gj> {
        public C6997m() {
            super(2);
        }

        @Override // com.google.android.gms.internal.AbstractC7024ge
        /* renamed from: a */
        public void mo15774a() {
            this.f23707e.mo15797a(this.f23704b);
        }

        @Override // com.google.android.gms.internal.AbstractC7024ge
        /* renamed from: b */
        public void mo15766b() {
            C7046go m15819b = C6984ft.m15819b(this.f23705c, this.f23711i, true);
            ((AbstractC7041gj) this.f23708f).mo7357a(this.f23710h, m15819b);
            b(new C7043gl(m15819b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.ft$n */
    /* loaded from: classes2.dex */
    public static final class C6998n extends AbstractC7024ge<AbstractC9727b, AbstractC7041gj> {
        @NonNull

        /* renamed from: n */
        private final VerifyAssertionRequest f23683n;

        public C6998n(@NonNull AbstractC9718a abstractC9718a) {
            super(2);
            C4588d.m23626a(abstractC9718a, "credential cannot be null");
            this.f23683n = C7042gk.m15721a(abstractC9718a);
        }

        @Override // com.google.android.gms.internal.AbstractC7024ge
        /* renamed from: a */
        public void mo15774a() {
            this.f23707e.mo15796a(this.f23683n, this.f23704b);
        }

        @Override // com.google.android.gms.internal.AbstractC7024ge
        /* renamed from: b */
        public void mo15766b() {
            C7046go m15820b = C6984ft.m15820b(this.f23705c, this.f23711i);
            ((AbstractC7041gj) this.f23708f).mo7357a(this.f23710h, m15820b);
            b(new C7043gl(m15820b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.ft$o */
    /* loaded from: classes2.dex */
    public static final class C6999o extends AbstractC7024ge<AbstractC9727b, AbstractC7041gj> {
        @NonNull

        /* renamed from: n */
        private final String f23684n;

        public C6999o(@NonNull String str) {
            super(2);
            this.f23684n = C4588d.m23624a(str, (Object) "token cannot be null or empty");
        }

        @Override // com.google.android.gms.internal.AbstractC7024ge
        /* renamed from: a */
        public void mo15774a() {
            this.f23707e.mo15790b(this.f23684n, this.f23704b);
        }

        @Override // com.google.android.gms.internal.AbstractC7024ge
        /* renamed from: b */
        public void mo15766b() {
            C7046go m15820b = C6984ft.m15820b(this.f23705c, this.f23711i);
            ((AbstractC7041gj) this.f23708f).mo7357a(this.f23710h, m15820b);
            b(new C7043gl(m15820b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.ft$p */
    /* loaded from: classes2.dex */
    public static final class C7000p extends AbstractC7024ge<AbstractC9727b, AbstractC7041gj> {
        @NonNull

        /* renamed from: n */
        private String f23685n;
        @NonNull

        /* renamed from: o */
        private String f23686o;

        public C7000p(String str, String str2) {
            super(2);
            this.f23685n = C4588d.m23624a(str, (Object) "email cannot be null or empty");
            this.f23686o = C4588d.m23624a(str2, (Object) "password cannot be null or empty");
        }

        @Override // com.google.android.gms.internal.AbstractC7024ge
        /* renamed from: a */
        public void mo15774a() {
            this.f23707e.mo15785d(this.f23685n, this.f23686o, this.f23704b);
        }

        @Override // com.google.android.gms.internal.AbstractC7024ge
        /* renamed from: b */
        public void mo15766b() {
            C7046go m15820b = C6984ft.m15820b(this.f23705c, this.f23711i);
            ((AbstractC7041gj) this.f23708f).mo7357a(this.f23710h, m15820b);
            b(new C7043gl(m15820b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.ft$q */
    /* loaded from: classes2.dex */
    public static final class C7001q extends AbstractC7024ge<AbstractC9727b, AbstractC7041gj> {
        public C7001q() {
            super(2);
        }

        @Override // com.google.android.gms.internal.AbstractC7024ge
        /* renamed from: a */
        public void mo15774a() {
            this.f23707e.mo15784e(this.f23706d.mo7254n(), this.f23704b);
        }

        @Override // com.google.android.gms.internal.AbstractC7024ge
        /* renamed from: b */
        public void mo15766b() {
            C7046go m15820b = C6984ft.m15820b(this.f23705c, this.f23711i);
            ((AbstractC7041gj) this.f23708f).mo7357a(this.f23710h, m15820b);
            b(new C7043gl(m15820b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.ft$r */
    /* loaded from: classes2.dex */
    public static final class C7002r extends AbstractC7024ge<AbstractC9727b, AbstractC7041gj> {
        @NonNull

        /* renamed from: n */
        private String f23687n;

        public C7002r(@NonNull String str) {
            super(2);
            this.f23687n = C4588d.m23624a(str, (Object) "provider cannot be null or empty");
        }

        @Override // com.google.android.gms.internal.AbstractC7024ge
        /* renamed from: a */
        public void mo15774a() {
            this.f23707e.mo15783e(this.f23687n, this.f23706d.mo7254n(), this.f23704b);
        }

        @Override // com.google.android.gms.internal.AbstractC7024ge
        /* renamed from: b */
        public void mo15766b() {
            C7046go m15820b = C6984ft.m15820b(this.f23705c, this.f23711i);
            ((AbstractC7041gj) this.f23708f).mo7357a(this.f23710h, m15820b);
            b(new C7043gl(m15820b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.ft$s */
    /* loaded from: classes2.dex */
    public static final class C7003s extends AbstractC7024ge<Void, AbstractC7041gj> {
        @NonNull

        /* renamed from: n */
        private final String f23688n;

        public C7003s(String str) {
            super(2);
            this.f23688n = C4588d.m23624a(str, (Object) "email cannot be null or empty");
        }

        @Override // com.google.android.gms.internal.AbstractC7024ge
        /* renamed from: a */
        public void mo15774a() {
            this.f23707e.mo15792a(this.f23706d.mo7254n(), this.f23688n, this.f23704b);
        }

        @Override // com.google.android.gms.internal.AbstractC7024ge
        /* renamed from: b */
        public void mo15766b() {
            ((AbstractC7041gj) this.f23708f).mo7357a(this.f23710h, C6984ft.m15820b(this.f23705c, this.f23711i));
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.ft$t */
    /* loaded from: classes2.dex */
    public static final class C7004t extends AbstractC7024ge<Void, AbstractC7041gj> {
        @NonNull

        /* renamed from: n */
        private final String f23689n;

        public C7004t(@NonNull String str) {
            super(2);
            this.f23689n = C4588d.m23624a(str, (Object) "password cannot be null or empty");
        }

        @Override // com.google.android.gms.internal.AbstractC7024ge
        /* renamed from: a */
        public void mo15774a() {
            this.f23707e.mo15789b(this.f23706d.mo7254n(), this.f23689n, this.f23704b);
        }

        @Override // com.google.android.gms.internal.AbstractC7024ge
        /* renamed from: b */
        public void mo15766b() {
            ((AbstractC7041gj) this.f23708f).mo7357a(this.f23710h, C6984ft.m15820b(this.f23705c, this.f23711i));
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.ft$u */
    /* loaded from: classes2.dex */
    public static final class C7005u extends AbstractC7024ge<Void, AbstractC7041gj> {
        @NonNull

        /* renamed from: n */
        private final UserProfileChangeRequest f23690n;

        public C7005u(UserProfileChangeRequest userProfileChangeRequest) {
            super(2);
            this.f23690n = (UserProfileChangeRequest) C4588d.m23626a(userProfileChangeRequest, "request cannot be null");
        }

        @Override // com.google.android.gms.internal.AbstractC7024ge
        /* renamed from: a */
        public void mo15774a() {
            this.f23707e.mo15794a(this.f23706d.mo7254n(), this.f23690n, this.f23704b);
        }

        @Override // com.google.android.gms.internal.AbstractC7024ge
        /* renamed from: b */
        public void mo15766b() {
            ((AbstractC7041gj) this.f23708f).mo7357a(this.f23710h, C6984ft.m15820b(this.f23705c, this.f23711i));
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6984ft(@NonNull Context context, @NonNull C7018gb.C7020a c7020a) {
        super(context, C7018gb.f23699b, c7020a);
    }

    @NonNull
    /* renamed from: a */
    private AbstractC5285f<AbstractC9727b> m15833a(@NonNull C9751b c9751b, @NonNull AbstractC9718a abstractC9718a, @NonNull AbstractC9739n abstractC9739n, @NonNull AbstractC7041gj abstractC7041gj) {
        C4588d.m23627a(c9751b);
        C4588d.m23627a(abstractC9718a);
        C4588d.m23627a(abstractC9739n);
        C4588d.m23627a(abstractC7041gj);
        List<String> mo7258j = abstractC9739n.mo7258j();
        return (mo7258j == null || !mo7258j.contains(abstractC9718a.mo7238a())) ? b(m15837a(new C6990f(abstractC9718a).a(c9751b).m15769a(abstractC9739n).m15767a((AbstractC7024ge<AbstractC9727b, AbstractC7041gj>) abstractC7041gj))) : C5290i.m20826a((Exception) C7008fw.m15806a(new Status(17015)));
    }

    @NonNull
    /* renamed from: a */
    private AbstractC5285f<AbstractC9727b> m15830a(@NonNull C9751b c9751b, @NonNull C9728c c9728c, @NonNull AbstractC9739n abstractC9739n, @NonNull AbstractC7041gj abstractC7041gj) {
        return b(m15837a(new C6989e(c9728c).a(c9751b).m15769a(abstractC9739n).m15767a((AbstractC7024ge<AbstractC9727b, AbstractC7041gj>) abstractC7041gj)));
    }

    @NonNull
    /* renamed from: a */
    private AbstractC5285f<AbstractC9727b> m15822a(@NonNull C9751b c9751b, @NonNull String str, @NonNull AbstractC9739n abstractC9739n, @NonNull AbstractC7041gj abstractC7041gj) {
        return b(m15837a(new C7002r(str).a(c9751b).m15769a(abstractC9739n).m15767a((AbstractC7024ge<AbstractC9727b, AbstractC7041gj>) abstractC7041gj)));
    }

    /* renamed from: a */
    private <ResultT, CallbackT> C6991g<ResultT, CallbackT> m15837a(AbstractC7024ge<ResultT, CallbackT> abstractC7024ge) {
        return new C6991g<>(abstractC7024ge);
    }

    @NonNull
    /* renamed from: b */
    private AbstractC5285f<AbstractC9727b> m15818b(@NonNull C9751b c9751b, @NonNull AbstractC9739n abstractC9739n, @NonNull AbstractC7041gj abstractC7041gj) {
        return b(m15837a(new C7001q().a(c9751b).m15769a(abstractC9739n).m15767a((AbstractC7024ge<AbstractC9727b, AbstractC7041gj>) abstractC7041gj)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    /* renamed from: b */
    public static C7046go m15820b(@NonNull C9751b c9751b, @NonNull GetAccountInfoUser getAccountInfoUser) {
        return m15819b(c9751b, getAccountInfoUser, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    /* renamed from: b */
    public static C7046go m15819b(@NonNull C9751b c9751b, @NonNull GetAccountInfoUser getAccountInfoUser, boolean z) {
        C4588d.m23627a(c9751b);
        C4588d.m23627a(getAccountInfoUser);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C7044gm(getAccountInfoUser, AbstractC9735j.f30416a));
        List<ProviderUserInfo> m7335h = getAccountInfoUser.m7335h();
        if (m7335h != null && !m7335h.isEmpty()) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= m7335h.size()) {
                    break;
                }
                arrayList.add(new C7044gm(m7335h.get(i2)));
                i = i2 + 1;
            }
        }
        C7046go c7046go = new C7046go(c9751b, arrayList);
        C7046go c7046go2 = (C7046go) c7046go.mo7265b(z);
        return c7046go;
    }

    @NonNull
    /* renamed from: a */
    public AbstractC5285f<Void> m15836a(@NonNull AbstractC9739n abstractC9739n, @NonNull AbstractC7049gr abstractC7049gr) {
        return b(m15837a(new C6986b().a(abstractC9739n).m15767a((AbstractC7024ge<Void, AbstractC7049gr>) abstractC7049gr)));
    }

    /* renamed from: a */
    public AbstractC5285f<AbstractC9727b> m15835a(@NonNull C9751b c9751b, @NonNull AbstractC7041gj abstractC7041gj) {
        return b(m15837a(new C6997m().a(c9751b).m15767a((AbstractC7024ge<AbstractC9727b, AbstractC7041gj>) abstractC7041gj)));
    }

    /* renamed from: a */
    public AbstractC5285f<AbstractC9727b> m15834a(@NonNull C9751b c9751b, @NonNull AbstractC9718a abstractC9718a, @NonNull AbstractC7041gj abstractC7041gj) {
        return b(m15837a(new C6998n(abstractC9718a).a(c9751b).m15767a((AbstractC7024ge<AbstractC9727b, AbstractC7041gj>) abstractC7041gj)));
    }

    @NonNull
    /* renamed from: a */
    public AbstractC5285f<Void> m15829a(@NonNull C9751b c9751b, @NonNull AbstractC9739n abstractC9739n, @NonNull AbstractC7041gj abstractC7041gj) {
        return a(m15837a(new C6994j().a(c9751b).m15769a(abstractC9739n).m15767a((AbstractC7024ge<Void, AbstractC7041gj>) abstractC7041gj)));
    }

    /* renamed from: a */
    public AbstractC5285f<Void> m15828a(@NonNull C9751b c9751b, @NonNull AbstractC9739n abstractC9739n, @NonNull UserProfileChangeRequest userProfileChangeRequest, @NonNull AbstractC7041gj abstractC7041gj) {
        return b(m15837a(new C7005u(userProfileChangeRequest).a(c9751b).m15769a(abstractC9739n).m15767a((AbstractC7024ge<Void, AbstractC7041gj>) abstractC7041gj)));
    }

    /* renamed from: a */
    public AbstractC5285f<Void> m15827a(@NonNull C9751b c9751b, @NonNull AbstractC9739n abstractC9739n, @NonNull AbstractC9718a abstractC9718a, @NonNull AbstractC7041gj abstractC7041gj) {
        return b(m15837a(new C6992h(abstractC9718a).a(c9751b).m15769a(abstractC9739n).m15767a((AbstractC7024ge<Void, AbstractC7041gj>) abstractC7041gj)));
    }

    /* renamed from: a */
    public AbstractC5285f<C9741o> m15826a(@NonNull C9751b c9751b, @NonNull AbstractC9739n abstractC9739n, @NonNull String str, @NonNull AbstractC7041gj abstractC7041gj) {
        return a(m15837a(new C6988d(str).a(c9751b).m15769a(abstractC9739n).m15767a((AbstractC7024ge<C9741o, AbstractC7041gj>) abstractC7041gj)));
    }

    /* renamed from: a */
    public AbstractC5285f<Void> m15825a(@NonNull C9751b c9751b, @NonNull AbstractC9739n abstractC9739n, @NonNull String str, @NonNull String str2, @NonNull AbstractC7041gj abstractC7041gj) {
        return b(m15837a(new C6993i(str, str2).a(c9751b).m15769a(abstractC9739n).m15767a((AbstractC7024ge<Void, AbstractC7041gj>) abstractC7041gj)));
    }

    /* renamed from: a */
    public AbstractC5285f<AbstractC9746t> m15824a(@NonNull C9751b c9751b, @NonNull String str) {
        return a(m15837a(new C6987c(str).a(c9751b)));
    }

    /* renamed from: a */
    public AbstractC5285f<AbstractC9727b> m15823a(@NonNull C9751b c9751b, @NonNull String str, @NonNull AbstractC7041gj abstractC7041gj) {
        return b(m15837a(new C6999o(str).a(c9751b).m15767a((AbstractC7024ge<AbstractC9727b, AbstractC7041gj>) abstractC7041gj)));
    }

    /* renamed from: a */
    public AbstractC5285f<AbstractC9727b> m15821a(@NonNull C9751b c9751b, @NonNull String str, @NonNull String str2, @NonNull AbstractC7041gj abstractC7041gj) {
        return b(m15837a(new C6985a(str, str2).a(c9751b).m15767a((AbstractC7024ge<AbstractC9727b, AbstractC7041gj>) abstractC7041gj)));
    }

    /* renamed from: b */
    public AbstractC5285f<AbstractC9727b> m15817b(@NonNull C9751b c9751b, @NonNull AbstractC9739n abstractC9739n, @NonNull AbstractC9718a abstractC9718a, @NonNull AbstractC7041gj abstractC7041gj) {
        C4588d.m23627a(c9751b);
        C4588d.m23627a(abstractC9718a);
        C4588d.m23627a(abstractC9739n);
        C4588d.m23627a(abstractC7041gj);
        return C9728c.class.isAssignableFrom(abstractC9718a.getClass()) ? m15830a(c9751b, (C9728c) abstractC9718a, abstractC9739n, abstractC7041gj) : m15833a(c9751b, abstractC9718a, abstractC9739n, abstractC7041gj);
    }

    /* renamed from: b */
    public AbstractC5285f<Void> m15816b(@NonNull C9751b c9751b, @NonNull AbstractC9739n abstractC9739n, @NonNull String str, @NonNull AbstractC7041gj abstractC7041gj) {
        return b(m15837a(new C7003s(str).a(c9751b).m15769a(abstractC9739n).m15767a((AbstractC7024ge<Void, AbstractC7041gj>) abstractC7041gj)));
    }

    /* renamed from: b */
    public AbstractC5285f<Void> m15815b(@NonNull C9751b c9751b, @NonNull String str) {
        return b(m15837a(new C6996l(str).a(c9751b)));
    }

    /* renamed from: b */
    public AbstractC5285f<AbstractC9727b> m15814b(@NonNull C9751b c9751b, @NonNull String str, @NonNull String str2, @NonNull AbstractC7041gj abstractC7041gj) {
        return b(m15837a(new C7000p(str, str2).a(c9751b).m15767a((AbstractC7024ge<AbstractC9727b, AbstractC7041gj>) abstractC7041gj)));
    }

    /* renamed from: c */
    public AbstractC5285f<Void> m15813c(@NonNull C9751b c9751b, @NonNull AbstractC9739n abstractC9739n, @NonNull String str, @NonNull AbstractC7041gj abstractC7041gj) {
        return b(m15837a(new C7004t(str).a(c9751b).m15769a(abstractC9739n).m15767a((AbstractC7024ge<Void, AbstractC7041gj>) abstractC7041gj)));
    }

    /* renamed from: c */
    public AbstractC5285f<Void> m15812c(@NonNull C9751b c9751b, @NonNull String str) {
        return b(m15837a(new C6995k(str).a(c9751b)));
    }

    /* renamed from: d */
    public AbstractC5285f<AbstractC9727b> m15811d(@NonNull C9751b c9751b, @NonNull AbstractC9739n abstractC9739n, @NonNull String str, @NonNull AbstractC7041gj abstractC7041gj) {
        C4588d.m23627a(c9751b);
        C4588d.m23625a(str);
        C4588d.m23627a(abstractC9739n);
        C4588d.m23627a(abstractC7041gj);
        List<String> mo7258j = abstractC9739n.mo7258j();
        if ((mo7258j == null || mo7258j.contains(str)) && !abstractC9739n.mo7259i()) {
            char c = 65535;
            switch (str.hashCode()) {
                case 1216985755:
                    if (str.equals(C9729d.f30412a)) {
                        c = 0;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return m15818b(c9751b, abstractC9739n, abstractC7041gj);
                default:
                    return m15822a(c9751b, str, abstractC9739n, abstractC7041gj);
            }
        }
        return C5290i.m20826a((Exception) C7008fw.m15806a(new Status(17016, str)));
    }
}
