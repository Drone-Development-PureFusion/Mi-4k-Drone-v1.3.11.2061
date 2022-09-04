package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.analytics.internal.C3892f;
import com.google.android.gms.analytics.internal.C3909p;
import com.google.android.gms.analytics.p229a.C3832a;
import com.google.android.gms.analytics.p229a.C3833b;
import com.google.android.gms.analytics.p229a.C3834c;
import com.google.android.gms.tagmanager.C9196e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.android.gms.analytics.d */
/* loaded from: classes2.dex */
public class C3839d {

    @Deprecated
    /* renamed from: com.google.android.gms.analytics.d$a */
    /* loaded from: classes.dex */
    public static class C3840a extends C3843d<C3840a> {
        public C3840a() {
            a("&t", "screenview");
        }

        @Override // com.google.android.gms.analytics.C3839d.C3843d
        /* renamed from: a */
        public /* bridge */ /* synthetic */ Map mo26533a() {
            return super.mo26533a();
        }
    }

    /* renamed from: com.google.android.gms.analytics.d$b */
    /* loaded from: classes2.dex */
    public static class C3841b extends C3843d<C3841b> {
        public C3841b() {
            a("&t", C9196e.f29004b);
        }

        public C3841b(String str, String str2) {
            this();
            m26567a(str);
            m26566b(str2);
        }

        /* renamed from: a */
        public C3841b m26568a(long j) {
            a("&ev", Long.toString(j));
            return this;
        }

        /* renamed from: a */
        public C3841b m26567a(String str) {
            a("&ec", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.C3839d.C3843d
        /* renamed from: a */
        public /* bridge */ /* synthetic */ Map mo26533a() {
            return super.mo26533a();
        }

        /* renamed from: b */
        public C3841b m26566b(String str) {
            a("&ea", str);
            return this;
        }

        /* renamed from: c */
        public C3841b m26565c(String str) {
            a("&el", str);
            return this;
        }
    }

    /* renamed from: com.google.android.gms.analytics.d$c */
    /* loaded from: classes2.dex */
    public static class C3842c extends C3843d<C3842c> {
        public C3842c() {
            a("&t", "exception");
        }

        /* renamed from: a */
        public C3842c m26564a(String str) {
            a("&exd", str);
            return this;
        }

        /* renamed from: a */
        public C3842c m26563a(boolean z) {
            a("&exf", C3909p.m26189a(z));
            return this;
        }

        @Override // com.google.android.gms.analytics.C3839d.C3843d
        /* renamed from: a */
        public /* bridge */ /* synthetic */ Map mo26533a() {
            return super.mo26533a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.google.android.gms.analytics.d$d */
    /* loaded from: classes2.dex */
    public static class C3843d<T extends C3843d> {

        /* renamed from: a */
        C3833b f14923a;

        /* renamed from: e */
        private Map<String, String> f14927e = new HashMap();

        /* renamed from: b */
        Map<String, List<C3832a>> f14924b = new HashMap();

        /* renamed from: c */
        List<C3834c> f14925c = new ArrayList();

        /* renamed from: d */
        List<C3832a> f14926d = new ArrayList();

        protected C3843d() {
        }

        /* renamed from: b */
        private T m26553b(String str, String str2) {
            if (str == null) {
                C3892f.m26292c("HitBuilder.setIfNonNull() called with a null paramName.");
            } else if (str2 != null) {
                this.f14927e.put(str, str2);
            }
            return this;
        }

        /* renamed from: a */
        public T m26562a(int i, float f) {
            m26556a(C3933j.m26012c(i), Float.toString(f));
            return this;
        }

        /* renamed from: a */
        public T m26561a(int i, String str) {
            m26556a(C3933j.m26015a(i), str);
            return this;
        }

        /* renamed from: a */
        public T m26560a(C3832a c3832a) {
            if (c3832a == null) {
                C3892f.m26292c("product should be non-null");
            } else {
                this.f14926d.add(c3832a);
            }
            return this;
        }

        /* renamed from: a */
        public T m26559a(C3832a c3832a, String str) {
            if (c3832a == null) {
                C3892f.m26292c("product should be non-null");
            } else {
                if (str == null) {
                    str = "";
                }
                if (!this.f14924b.containsKey(str)) {
                    this.f14924b.put(str, new ArrayList());
                }
                this.f14924b.get(str).add(c3832a);
            }
            return this;
        }

        /* renamed from: a */
        public T m26558a(C3833b c3833b) {
            this.f14923a = c3833b;
            return this;
        }

        /* renamed from: a */
        public T m26557a(C3834c c3834c) {
            if (c3834c == null) {
                C3892f.m26292c("promotion should be non-null");
            } else {
                this.f14925c.add(c3834c);
            }
            return this;
        }

        /* renamed from: a */
        public final T m26556a(String str, String str2) {
            if (str != null) {
                this.f14927e.put(str, str2);
            } else {
                C3892f.m26292c("HitBuilder.set() called with a null paramName.");
            }
            return this;
        }

        /* renamed from: a */
        public final T m26555a(Map<String, String> map) {
            if (map != null) {
                this.f14927e.putAll(new HashMap(map));
            }
            return this;
        }

        /* renamed from: a */
        public Map<String, String> mo26533a() {
            HashMap hashMap = new HashMap(this.f14927e);
            if (this.f14923a != null) {
                hashMap.putAll(this.f14923a.m26616a());
            }
            int i = 1;
            for (C3834c c3834c : this.f14925c) {
                hashMap.putAll(c3834c.m26599e(C3933j.m26008g(i)));
                i++;
            }
            int i2 = 1;
            for (C3832a c3832a : this.f14926d) {
                hashMap.putAll(c3832a.m26617g(C3933j.m26010e(i2)));
                i2++;
            }
            int i3 = 1;
            for (Map.Entry<String, List<C3832a>> entry : this.f14924b.entrySet()) {
                String m26005j = C3933j.m26005j(i3);
                int i4 = 1;
                for (C3832a c3832a2 : entry.getValue()) {
                    String valueOf = String.valueOf(m26005j);
                    String valueOf2 = String.valueOf(C3933j.m26006i(i4));
                    hashMap.putAll(c3832a2.m26617g(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)));
                    i4++;
                }
                if (!TextUtils.isEmpty(entry.getKey())) {
                    String valueOf3 = String.valueOf(m26005j);
                    String valueOf4 = String.valueOf("nm");
                    hashMap.put(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3), entry.getKey());
                }
                i3++;
            }
            return hashMap;
        }

        /* renamed from: b */
        public T m26554b() {
            m26556a("&sc", "start");
            return this;
        }

        /* renamed from: b */
        public T m26552b(boolean z) {
            m26556a("&ni", C3909p.m26189a(z));
            return this;
        }

        /* renamed from: d */
        public T m26551d(String str) {
            String m26186c = C3909p.m26186c(str);
            if (!TextUtils.isEmpty(m26186c)) {
                Map<String, String> m26196a = C3909p.m26196a(m26186c);
                m26553b("&cc", m26196a.get("utm_content"));
                m26553b("&cm", m26196a.get("utm_medium"));
                m26553b("&cn", m26196a.get("utm_campaign"));
                m26553b("&cs", m26196a.get("utm_source"));
                m26553b("&ck", m26196a.get("utm_term"));
                m26553b("&ci", m26196a.get("utm_id"));
                m26553b("&anid", m26196a.get("anid"));
                m26553b("&gclid", m26196a.get("gclid"));
                m26553b("&dclid", m26196a.get("dclid"));
                m26553b("&aclid", m26196a.get("aclid"));
                m26553b("&gmob_t", m26196a.get("gmob_t"));
            }
            return this;
        }

        /* renamed from: e */
        public T m26550e(String str) {
            this.f14927e.put("&promoa", str);
            return this;
        }

        /* renamed from: f */
        protected T m26549f(String str) {
            m26556a("&t", str);
            return this;
        }

        /* renamed from: g */
        protected String m26548g(String str) {
            return this.f14927e.get(str);
        }
    }

    @Deprecated
    /* renamed from: com.google.android.gms.analytics.d$e */
    /* loaded from: classes.dex */
    public static class C3844e extends C3843d<C3844e> {
        public C3844e() {
            a("&t", "item");
        }

        /* renamed from: a */
        public C3844e m26547a(double d) {
            a("&ip", Double.toString(d));
            return this;
        }

        /* renamed from: a */
        public C3844e m26546a(long j) {
            a("&iq", Long.toString(j));
            return this;
        }

        /* renamed from: a */
        public C3844e m26545a(String str) {
            a("&ti", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.C3839d.C3843d
        /* renamed from: a */
        public /* bridge */ /* synthetic */ Map mo26533a() {
            return super.mo26533a();
        }

        /* renamed from: b */
        public C3844e m26544b(String str) {
            a("&in", str);
            return this;
        }

        /* renamed from: c */
        public C3844e m26543c(String str) {
            a("&ic", str);
            return this;
        }

        /* renamed from: h */
        public C3844e m26542h(String str) {
            a("&iv", str);
            return this;
        }

        /* renamed from: i */
        public C3844e m26541i(String str) {
            a("&cu", str);
            return this;
        }
    }

    /* renamed from: com.google.android.gms.analytics.d$f */
    /* loaded from: classes2.dex */
    public static class C3845f extends C3843d<C3845f> {
        public C3845f() {
            a("&t", "screenview");
        }

        @Override // com.google.android.gms.analytics.C3839d.C3843d
        /* renamed from: a */
        public /* bridge */ /* synthetic */ Map mo26533a() {
            return super.mo26533a();
        }
    }

    /* renamed from: com.google.android.gms.analytics.d$g */
    /* loaded from: classes2.dex */
    public static class C3846g extends C3843d<C3846g> {
        public C3846g() {
            a("&t", "social");
        }

        /* renamed from: a */
        public C3846g m26540a(String str) {
            a("&sn", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.C3839d.C3843d
        /* renamed from: a */
        public /* bridge */ /* synthetic */ Map mo26533a() {
            return super.mo26533a();
        }

        /* renamed from: b */
        public C3846g m26539b(String str) {
            a("&sa", str);
            return this;
        }

        /* renamed from: c */
        public C3846g m26538c(String str) {
            a("&st", str);
            return this;
        }
    }

    /* renamed from: com.google.android.gms.analytics.d$h */
    /* loaded from: classes2.dex */
    public static class C3847h extends C3843d<C3847h> {
        public C3847h() {
            a("&t", "timing");
        }

        public C3847h(String str, String str2, long j) {
            this();
            m26536a(str2);
            m26537a(j);
            m26535b(str);
        }

        /* renamed from: a */
        public C3847h m26537a(long j) {
            a("&utt", Long.toString(j));
            return this;
        }

        /* renamed from: a */
        public C3847h m26536a(String str) {
            a("&utv", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.C3839d.C3843d
        /* renamed from: a */
        public /* bridge */ /* synthetic */ Map mo26533a() {
            return super.mo26533a();
        }

        /* renamed from: b */
        public C3847h m26535b(String str) {
            a("&utc", str);
            return this;
        }

        /* renamed from: c */
        public C3847h m26534c(String str) {
            a("&utl", str);
            return this;
        }
    }

    @Deprecated
    /* renamed from: com.google.android.gms.analytics.d$i */
    /* loaded from: classes.dex */
    public static class C3848i extends C3843d<C3848i> {
        public C3848i() {
            a("&t", "transaction");
        }

        /* renamed from: a */
        public C3848i m26532a(double d) {
            a("&tr", Double.toString(d));
            return this;
        }

        /* renamed from: a */
        public C3848i m26531a(String str) {
            a("&ti", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.C3839d.C3843d
        /* renamed from: a */
        public /* bridge */ /* synthetic */ Map mo26533a() {
            return super.mo26533a();
        }

        /* renamed from: b */
        public C3848i m26530b(double d) {
            a("&tt", Double.toString(d));
            return this;
        }

        /* renamed from: b */
        public C3848i m26529b(String str) {
            a("&ta", str);
            return this;
        }

        /* renamed from: c */
        public C3848i m26528c(double d) {
            a("&ts", Double.toString(d));
            return this;
        }

        /* renamed from: c */
        public C3848i m26527c(String str) {
            a("&cu", str);
            return this;
        }
    }
}
