package com.google.firebase.auth;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.p239g.AbstractC5280a;
import com.google.android.gms.p239g.AbstractC5285f;
import com.google.firebase.C9751b;
import com.google.firebase.auth.api.model.GetTokenResponse;
import java.util.List;
/* renamed from: com.google.firebase.auth.n */
/* loaded from: classes2.dex */
public abstract class AbstractC9739n implements AbstractC9749w {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public FirebaseAuth m7260h() {
        return FirebaseAuth.getInstance(mo7261g());
    }

    @NonNull
    /* renamed from: a */
    public AbstractC5285f<Void> m7272a(@NonNull UserProfileChangeRequest userProfileChangeRequest) {
        C4588d.m23627a(userProfileChangeRequest);
        return m7260h().m7388a(this, userProfileChangeRequest);
    }

    /* renamed from: a */
    public AbstractC5285f<Void> m7271a(@NonNull AbstractC9718a abstractC9718a) {
        C4588d.m23627a(abstractC9718a);
        return m7260h().m7387a(this, abstractC9718a);
    }

    @NonNull
    /* renamed from: a */
    public abstract AbstractC9739n mo7268a(@NonNull List<? extends AbstractC9749w> list);

    @Override // com.google.firebase.auth.AbstractC9749w
    @NonNull
    /* renamed from: a */
    public abstract String mo7233a();

    /* renamed from: a */
    public abstract void mo7270a(@NonNull GetTokenResponse getTokenResponse);

    @NonNull
    /* renamed from: b */
    public AbstractC5285f<AbstractC9727b> m7267b(@NonNull AbstractC9718a abstractC9718a) {
        C4588d.m23627a(abstractC9718a);
        return m7260h().m7374b(this, abstractC9718a);
    }

    /* renamed from: b */
    public AbstractC5285f<AbstractC9727b> m7266b(@NonNull String str) {
        C4588d.m23625a(str);
        return m7260h().m7385a(this, str);
    }

    /* renamed from: b */
    public abstract AbstractC9739n mo7265b(boolean z);

    @Override // com.google.firebase.auth.AbstractC9749w
    @NonNull
    /* renamed from: b */
    public abstract String mo7232b();

    @NonNull
    /* renamed from: c */
    public AbstractC5285f<Void> m7264c(@NonNull String str) {
        C4588d.m23625a(str);
        return m7260h().m7373b(this, str);
    }

    @NonNull
    /* renamed from: c */
    public AbstractC5285f<C9741o> m7263c(boolean z) {
        return m7260h().m7384a(this, z);
    }

    @Override // com.google.firebase.auth.AbstractC9749w
    @Nullable
    /* renamed from: c */
    public abstract String mo7231c();

    @Override // com.google.firebase.auth.AbstractC9749w
    @Nullable
    /* renamed from: d */
    public abstract Uri mo7230d();

    @NonNull
    /* renamed from: d */
    public AbstractC5285f<Void> m7262d(@NonNull String str) {
        C4588d.m23625a(str);
        return m7260h().m7366c(this, str);
    }

    @Override // com.google.firebase.auth.AbstractC9749w
    @Nullable
    /* renamed from: e */
    public abstract String mo7229e();

    @NonNull
    /* renamed from: g */
    public abstract C9751b mo7261g();

    /* renamed from: i */
    public abstract boolean mo7259i();

    @Nullable
    /* renamed from: j */
    public abstract List<String> mo7258j();

    @NonNull
    /* renamed from: k */
    public abstract List<? extends AbstractC9749w> mo7257k();

    @NonNull
    /* renamed from: l */
    public abstract GetTokenResponse mo7256l();

    @NonNull
    /* renamed from: m */
    public abstract String mo7255m();

    @NonNull
    /* renamed from: n */
    public abstract String mo7254n();

    @NonNull
    /* renamed from: o */
    public AbstractC5285f<Void> m7253o() {
        return m7260h().m7375b(this);
    }

    @NonNull
    /* renamed from: p */
    public AbstractC5285f<Void> m7252p() {
        return m7260h().m7367c(this);
    }

    @NonNull
    /* renamed from: q */
    public AbstractC5285f<Void> m7251q() {
        return m7260h().m7384a(this, false).mo20795b(new AbstractC5280a<C9741o, AbstractC5285f<Void>>() { // from class: com.google.firebase.auth.n.1
            @Override // com.google.android.gms.p239g.AbstractC5280a
            /* renamed from: b */
            public AbstractC5285f<Void> mo7250a(@NonNull AbstractC5285f<C9741o> abstractC5285f) {
                return AbstractC9739n.this.m7260h().m7362d(abstractC5285f.mo6998c().m7248a());
            }
        });
    }
}
