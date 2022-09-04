package com.google.android.gms.internal;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.p001v4.util.ArrayMap;
import com.google.android.gms.common.internal.C4588d;
import com.google.firebase.C9751b;
import com.google.firebase.auth.AbstractC9735j;
import com.google.firebase.auth.AbstractC9739n;
import com.google.firebase.auth.AbstractC9749w;
import com.google.firebase.auth.api.model.GetTokenResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.go */
/* loaded from: classes2.dex */
public class C7046go extends AbstractC9739n {

    /* renamed from: a */
    private GetTokenResponse f23793a;

    /* renamed from: b */
    private C7044gm f23794b;

    /* renamed from: c */
    private String f23795c;

    /* renamed from: e */
    private List<C7044gm> f23797e;

    /* renamed from: f */
    private List<String> f23798f;

    /* renamed from: g */
    private Map<String, C7044gm> f23799g;

    /* renamed from: i */
    private boolean f23801i;

    /* renamed from: j */
    private C7459nr f23802j = C7010fy.m15800a();

    /* renamed from: d */
    private String f23796d = "com.google.firebase.auth.internal.DefaultFirebaseUser";

    /* renamed from: h */
    private String f23800h = "2";

    public C7046go(@NonNull C9751b c9751b, @NonNull List<? extends AbstractC9749w> list) {
        C4588d.m23627a(c9751b);
        this.f23795c = c9751b.m7212b();
        mo7268a(list);
    }

    /* renamed from: a */
    public C7046go m15720a(@NonNull String str) {
        this.f23800h = str;
        return this;
    }

    @Override // com.google.firebase.auth.AbstractC9739n
    /* renamed from: a */
    public C7046go mo7265b(boolean z) {
        this.f23801i = z;
        return this;
    }

    @Override // com.google.firebase.auth.AbstractC9739n
    @NonNull
    /* renamed from: a */
    public AbstractC9739n mo7268a(@NonNull List<? extends AbstractC9749w> list) {
        C4588d.m23627a(list);
        this.f23797e = new ArrayList(list.size());
        this.f23798f = new ArrayList(list.size());
        this.f23799g = new ArrayMap();
        for (int i = 0; i < list.size(); i++) {
            C7044gm c7044gm = new C7044gm(list.get(i));
            if (c7044gm.mo7232b().equals(AbstractC9735j.f30416a)) {
                this.f23794b = c7044gm;
            } else {
                this.f23798f.add(c7044gm.mo7232b());
            }
            this.f23797e.add(c7044gm);
            this.f23799g.put(c7044gm.mo7232b(), c7044gm);
        }
        if (this.f23794b == null) {
            this.f23794b = this.f23797e.get(0);
        }
        return this;
    }

    @Override // com.google.firebase.auth.AbstractC9739n, com.google.firebase.auth.AbstractC9749w
    @NonNull
    /* renamed from: a */
    public String mo7233a() {
        return this.f23794b.mo7233a();
    }

    @Override // com.google.firebase.auth.AbstractC9739n
    /* renamed from: a */
    public void mo7270a(@NonNull GetTokenResponse getTokenResponse) {
        this.f23793a = (GetTokenResponse) C4588d.m23627a(getTokenResponse);
    }

    @Override // com.google.firebase.auth.AbstractC9739n, com.google.firebase.auth.AbstractC9749w
    @NonNull
    /* renamed from: b */
    public String mo7232b() {
        return this.f23794b.mo7232b();
    }

    @Override // com.google.firebase.auth.AbstractC9739n, com.google.firebase.auth.AbstractC9749w
    @Nullable
    /* renamed from: c */
    public String mo7231c() {
        return this.f23794b.mo7231c();
    }

    @Override // com.google.firebase.auth.AbstractC9739n, com.google.firebase.auth.AbstractC9749w
    @Nullable
    /* renamed from: d */
    public Uri mo7230d() {
        return this.f23794b.mo7230d();
    }

    @Override // com.google.firebase.auth.AbstractC9739n, com.google.firebase.auth.AbstractC9749w
    @Nullable
    /* renamed from: e */
    public String mo7229e() {
        return this.f23794b.mo7229e();
    }

    @Override // com.google.firebase.auth.AbstractC9749w
    /* renamed from: f */
    public boolean mo7228f() {
        return this.f23794b.mo7228f();
    }

    @Override // com.google.firebase.auth.AbstractC9739n
    @NonNull
    /* renamed from: g */
    public C9751b mo7261g() {
        return C9751b.m7214a(this.f23795c);
    }

    /* renamed from: h */
    public List<C7044gm> m15718h() {
        return this.f23797e;
    }

    @Override // com.google.firebase.auth.AbstractC9739n
    /* renamed from: i */
    public boolean mo7259i() {
        return this.f23801i;
    }

    @Override // com.google.firebase.auth.AbstractC9739n
    @Nullable
    /* renamed from: j */
    public List<String> mo7258j() {
        return this.f23798f;
    }

    @Override // com.google.firebase.auth.AbstractC9739n
    @NonNull
    /* renamed from: k */
    public List<? extends AbstractC9749w> mo7257k() {
        return this.f23797e;
    }

    @Override // com.google.firebase.auth.AbstractC9739n
    @NonNull
    /* renamed from: l */
    public GetTokenResponse mo7256l() {
        return this.f23793a;
    }

    @Override // com.google.firebase.auth.AbstractC9739n
    @NonNull
    /* renamed from: m */
    public String mo7255m() {
        return mo7256l().m7329c();
    }

    @Override // com.google.firebase.auth.AbstractC9739n
    @NonNull
    /* renamed from: n */
    public String mo7254n() {
        return this.f23802j.m14398a(this.f23793a);
    }
}
