package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4588d;
import com.google.firebase.C9751b;
import com.google.firebase.auth.AbstractC9739n;
import com.google.firebase.auth.api.model.GetTokenResponse;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.google.android.gms.internal.gs */
/* loaded from: classes2.dex */
public class C7050gs {

    /* renamed from: a */
    private Context f23804a;

    /* renamed from: b */
    private String f23805b;

    /* renamed from: c */
    private SharedPreferences f23806c;

    /* renamed from: d */
    private C7459nr f23807d;

    /* renamed from: e */
    private C7477oc f23808e = new C7477oc();

    public C7050gs(@NonNull Context context, @NonNull String str, @NonNull C7459nr c7459nr) {
        C4588d.m23627a(context);
        this.f23805b = C4588d.m23625a(str);
        this.f23804a = context.getApplicationContext();
        String format = String.format("com.google.firebase.auth.api.Store.%s", this.f23805b);
        this.f23807d = (C7459nr) C4588d.m23627a(c7459nr);
        this.f23806c = this.f23804a.getSharedPreferences(format, 0);
    }

    /* renamed from: a */
    private C7046go m15715a(@NonNull C7475oa c7475oa) {
        String mo14348c = c7475oa.m14358b("cachedTokenState").mo14348c();
        String mo14348c2 = c7475oa.m14358b("applicationName").mo14348c();
        boolean mo14344g = c7475oa.m14358b("anonymous").mo14344g();
        AbstractC7471nx m14358b = c7475oa.m14358b("version");
        String mo14348c3 = (m14358b == null || m14358b.m14368k()) ? "2" : m14358b.mo14348c();
        C7468nu m14357c = c7475oa.m14357c("userInfos");
        int m14375a = m14357c.m14375a();
        ArrayList arrayList = new ArrayList(m14375a);
        for (int i = 0; i < m14375a; i++) {
            arrayList.add((C7044gm) this.f23807d.m14407a(m14357c.m14374a(i), (Class<Object>) C7044gm.class));
        }
        C7046go c7046go = new C7046go(C9751b.m7214a(mo14348c2), arrayList);
        if (!TextUtils.isEmpty(mo14348c)) {
            c7046go.mo7270a((GetTokenResponse) this.f23807d.m14393a(mo14348c, (Class<Object>) GetTokenResponse.class));
        }
        ((C7046go) c7046go.mo7265b(mo14344g)).m15720a(mo14348c3);
        return c7046go;
    }

    /* renamed from: c */
    private static AbstractC7471nx m15704c(String str) {
        return new C7477oc().m14354a(str);
    }

    @Nullable
    /* renamed from: d */
    private String m15703d(@NonNull AbstractC9739n abstractC9739n) {
        C7475oa c7475oa = new C7475oa();
        if (C7046go.class.isAssignableFrom(abstractC9739n.getClass())) {
            C7046go c7046go = (C7046go) abstractC9739n;
            c7475oa.m14359a("cachedTokenState", c7046go.mo7254n());
            c7475oa.m14359a("applicationName", c7046go.mo7261g().m7212b());
            c7475oa.m14359a("type", "com.google.firebase.auth.internal.DefaultFirebaseUser");
            if (c7046go.m15718h() != null) {
                C7468nu c7468nu = new C7468nu();
                List<C7044gm> m15718h = c7046go.m15718h();
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= m15718h.size()) {
                        break;
                    }
                    c7468nu.m14373a(m15704c(this.f23807d.m14398a(m15718h.get(i2))));
                    i = i2 + 1;
                }
                c7475oa.m14361a("userInfos", c7468nu);
            }
            c7475oa.m14360a("anonymous", Boolean.valueOf(c7046go.mo7259i()));
            c7475oa.m14359a("version", "2");
            return c7475oa.toString();
        }
        return null;
    }

    @Nullable
    /* renamed from: a */
    public AbstractC9739n m15716a() {
        String m15706b = m15706b("com.google.firebase.auth.FIREBASE_USER");
        if (TextUtils.isEmpty(m15706b)) {
            return null;
        }
        try {
            C7475oa m14367l = this.f23808e.m14354a(m15706b).m14367l();
            if (m14367l.m14362a("type") && "com.google.firebase.auth.internal.DefaultFirebaseUser".equalsIgnoreCase(m14367l.m14358b("type").mo14348c())) {
                return m15715a(m14367l);
            }
            return null;
        } catch (C7481og e) {
            return null;
        }
    }

    @Nullable
    /* renamed from: a */
    public <T> T m15711a(String str, Class<T> cls) {
        String m15706b = m15706b(str);
        if (TextUtils.isEmpty(m15706b)) {
            return null;
        }
        return (T) this.f23807d.m14393a(m15706b, (Class<Object>) cls);
    }

    /* renamed from: a */
    public void m15714a(@NonNull AbstractC9739n abstractC9739n) {
        C4588d.m23627a(abstractC9739n);
        String m15703d = m15703d(abstractC9739n);
        if (!TextUtils.isEmpty(m15703d)) {
            m15709a("com.google.firebase.auth.FIREBASE_USER", m15703d);
        }
    }

    /* renamed from: a */
    public void m15713a(@NonNull AbstractC9739n abstractC9739n, @NonNull GetTokenResponse getTokenResponse) {
        C4588d.m23627a(abstractC9739n);
        C4588d.m23627a(getTokenResponse);
        m15710a(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", abstractC9739n.mo7233a()), getTokenResponse);
    }

    /* renamed from: a */
    public void m15712a(String str) {
        this.f23806c.edit().remove(str).apply();
    }

    /* renamed from: a */
    public void m15710a(String str, Object obj) {
        this.f23806c.edit().putString(str, this.f23807d.m14398a(obj)).apply();
    }

    /* renamed from: a */
    public void m15709a(String str, String str2) {
        this.f23806c.edit().putString(str, str2).apply();
    }

    /* renamed from: b */
    public GetTokenResponse m15707b(@NonNull AbstractC9739n abstractC9739n) {
        C4588d.m23627a(abstractC9739n);
        return (GetTokenResponse) m15711a(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", abstractC9739n.mo7233a()), (Class<Object>) GetTokenResponse.class);
    }

    @Nullable
    /* renamed from: b */
    public String m15706b(String str) {
        return this.f23806c.getString(str, null);
    }

    /* renamed from: b */
    public void m15708b() {
        m15712a("com.google.firebase.auth.FIREBASE_USER");
    }

    /* renamed from: c */
    public void m15705c(@NonNull AbstractC9739n abstractC9739n) {
        C4588d.m23627a(abstractC9739n);
        m15712a(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", abstractC9739n.mo7233a()));
    }
}
