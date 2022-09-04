package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C3779u;
import com.tencent.tauth.AuthActivity;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import p005b.p006a.p007a.p029b.C0494h;
@aaa
/* renamed from: com.google.android.gms.internal.un */
/* loaded from: classes.dex */
public class C7801un {

    /* renamed from: a */
    boolean f25933a;

    /* renamed from: b */
    private final List<C7799ul> f25934b = new LinkedList();

    /* renamed from: c */
    private final Map<String, String> f25935c = new LinkedHashMap();

    /* renamed from: d */
    private final Object f25936d = new Object();

    /* renamed from: e */
    private String f25937e;

    /* renamed from: f */
    private C7799ul f25938f;
    @Nullable

    /* renamed from: g */
    private C7801un f25939g;

    public C7801un(boolean z, String str, String str2) {
        this.f25933a = z;
        this.f25935c.put(AuthActivity.ACTION_KEY, str);
        this.f25935c.put("ad_format", str2);
    }

    /* renamed from: a */
    public C7799ul m13439a() {
        return m13438a(C3779u.m26884k().mo16432b());
    }

    @Nullable
    /* renamed from: a */
    public C7799ul m13438a(long j) {
        if (!this.f25933a) {
            return null;
        }
        return new C7799ul(j, null, null);
    }

    /* renamed from: a */
    public void m13435a(@Nullable C7801un c7801un) {
        synchronized (this.f25936d) {
            this.f25939g = c7801un;
        }
    }

    /* renamed from: a */
    public void m13434a(String str) {
        if (!this.f25933a) {
            return;
        }
        synchronized (this.f25936d) {
            this.f25937e = str;
        }
    }

    /* renamed from: a */
    public void m13433a(String str, String str2) {
        C7791uh m18442e;
        if (!this.f25933a || TextUtils.isEmpty(str2) || (m18442e = C3779u.m26886i().m18442e()) == null) {
            return;
        }
        synchronized (this.f25936d) {
            m18442e.m13458a(str).m13448a(this.f25935c, str, str2);
        }
    }

    /* renamed from: a */
    public boolean m13437a(C7799ul c7799ul, long j, String... strArr) {
        synchronized (this.f25936d) {
            for (String str : strArr) {
                this.f25934b.add(new C7799ul(j, str, c7799ul));
            }
        }
        return true;
    }

    /* renamed from: a */
    public boolean m13436a(@Nullable C7799ul c7799ul, String... strArr) {
        if (!this.f25933a || c7799ul == null) {
            return false;
        }
        return m13437a(c7799ul, C3779u.m26884k().mo16432b(), strArr);
    }

    /* renamed from: b */
    public void m13432b() {
        synchronized (this.f25936d) {
            this.f25938f = m13439a();
        }
    }

    /* renamed from: c */
    public String m13431c() {
        String sb;
        StringBuilder sb2 = new StringBuilder();
        synchronized (this.f25936d) {
            for (C7799ul c7799ul : this.f25934b) {
                long m13445a = c7799ul.m13445a();
                String m13444b = c7799ul.m13444b();
                C7799ul m13443c = c7799ul.m13443c();
                if (m13443c != null && m13445a > 0) {
                    sb2.append(m13444b).append(C0494h.f686G).append(m13445a - m13443c.m13445a()).append(C0494h.f736x);
                }
            }
            this.f25934b.clear();
            if (!TextUtils.isEmpty(this.f25937e)) {
                sb2.append(this.f25937e);
            } else if (sb2.length() > 0) {
                sb2.setLength(sb2.length() - 1);
            }
            sb = sb2.toString();
        }
        return sb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public Map<String, String> m13430d() {
        Map<String, String> m13454a;
        synchronized (this.f25936d) {
            C7791uh m18442e = C3779u.m26886i().m18442e();
            m13454a = (m18442e == null || this.f25939g == null) ? this.f25935c : m18442e.m13454a(this.f25935c, this.f25939g.m13430d());
        }
        return m13454a;
    }

    /* renamed from: e */
    public C7799ul m13429e() {
        C7799ul c7799ul;
        synchronized (this.f25936d) {
            c7799ul = this.f25938f;
        }
        return c7799ul;
    }
}
