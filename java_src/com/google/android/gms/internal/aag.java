package com.google.android.gms.internal;

import com.google.android.gms.internal.C7957wx;
import java.util.Map;
import java.util.concurrent.Future;
@aaa
/* loaded from: classes.dex */
public final class aag {

    /* renamed from: a */
    C7957wx.C7970c f20694a;

    /* renamed from: f */
    private String f20699f;

    /* renamed from: g */
    private String f20700g;

    /* renamed from: e */
    private final Object f20698e = new Object();

    /* renamed from: h */
    private acl<aaj> f20701h = new acl<>();

    /* renamed from: b */
    public final AbstractC7877vt f20695b = new AbstractC7877vt() { // from class: com.google.android.gms.internal.aag.1
        @Override // com.google.android.gms.internal.AbstractC7877vt
        /* renamed from: a */
        public void mo12713a(acy acyVar, Map<String, String> map) {
            synchronized (aag.this.f20698e) {
                if (aag.this.f20701h.isDone()) {
                    return;
                }
                if (!aag.this.f20699f.equals(map.get("request_id"))) {
                    return;
                }
                aaj aajVar = new aaj(1, map);
                String valueOf = String.valueOf(aajVar.m18612e());
                String valueOf2 = String.valueOf(aajVar.m18617b());
                abr.d(new StringBuilder(String.valueOf(valueOf).length() + 24 + String.valueOf(valueOf2).length()).append("Invalid ").append(valueOf).append(" request error: ").append(valueOf2).toString());
                aag.this.f20701h.m18209b((acl) aajVar);
            }
        }
    };

    /* renamed from: c */
    public final AbstractC7877vt f20696c = new AbstractC7877vt() { // from class: com.google.android.gms.internal.aag.2
        @Override // com.google.android.gms.internal.AbstractC7877vt
        /* renamed from: a */
        public void mo12713a(acy acyVar, Map<String, String> map) {
            synchronized (aag.this.f20698e) {
                if (aag.this.f20701h.isDone()) {
                    return;
                }
                aaj aajVar = new aaj(-2, map);
                if (!aag.this.f20699f.equals(aajVar.m18610g())) {
                    return;
                }
                String m18613d = aajVar.m18613d();
                if (m18613d == null) {
                    abr.d("URL missing in loadAdUrl GMSG.");
                    return;
                }
                if (m18613d.contains("%40mediation_adapters%40")) {
                    String replaceAll = m18613d.replaceAll("%40mediation_adapters%40", abp.m18415a(acyVar.getContext(), map.get("check_adapters"), aag.this.f20700g));
                    aajVar.m18618a(replaceAll);
                    String valueOf = String.valueOf(replaceAll);
                    abr.m18409e(valueOf.length() != 0 ? "Ad request URL modified to ".concat(valueOf) : new String("Ad request URL modified to "));
                }
                aag.this.f20701h.m18209b((acl) aajVar);
            }
        }
    };

    /* renamed from: d */
    public final AbstractC7877vt f20697d = new AbstractC7877vt() { // from class: com.google.android.gms.internal.aag.3
        @Override // com.google.android.gms.internal.AbstractC7877vt
        /* renamed from: a */
        public void mo12713a(acy acyVar, Map<String, String> map) {
            synchronized (aag.this.f20698e) {
                if (aag.this.f20701h.isDone()) {
                    return;
                }
                aaj aajVar = new aaj(-2, map);
                if (!aag.this.f20699f.equals(aajVar.m18610g())) {
                    return;
                }
                aajVar.m18609h();
                aag.this.f20701h.m18209b((acl) aajVar);
            }
        }
    };

    public aag(String str, String str2) {
        this.f20700g = str2;
        this.f20699f = str;
    }

    /* renamed from: a */
    public C7957wx.C7970c m18664a() {
        return this.f20694a;
    }

    /* renamed from: a */
    public void m18662a(C7957wx.C7970c c7970c) {
        this.f20694a = c7970c;
    }

    /* renamed from: b */
    public Future<aaj> m18661b() {
        return this.f20701h;
    }

    /* renamed from: c */
    public void m18659c() {
    }
}
