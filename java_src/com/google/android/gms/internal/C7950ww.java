package com.google.android.gms.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.C3588d;
import com.google.android.gms.ads.internal.C3589e;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.ads.internal.client.AbstractC3501a;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.C3514ac;
import com.google.android.gms.ads.internal.overlay.AbstractC3659g;
import com.google.android.gms.ads.internal.overlay.AbstractC3670p;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.AbstractC7944wu;
import com.google.android.gms.internal.acz;
import org.json.JSONObject;
@aaa
/* renamed from: com.google.android.gms.internal.ww */
/* loaded from: classes.dex */
public class C7950ww implements AbstractC7944wu {

    /* renamed from: a */
    private final acy f26146a;

    public C7950ww(Context context, VersionInfoParcel versionInfoParcel, @Nullable C7667ro c7667ro, C3588d c3588d) {
        this.f26146a = C3779u.m26889f().m18142a(context, new AdSizeParcel(), false, false, c7667ro, versionInfoParcel, null, null, c3588d);
        this.f26146a.mo18122a().setWillNotDraw(true);
    }

    /* renamed from: a */
    private void m13155a(Runnable runnable) {
        if (C3514ac.m27586a().m26854b()) {
            runnable.run();
        } else {
            abv.f21039a.post(runnable);
        }
    }

    @Override // com.google.android.gms.internal.AbstractC7944wu
    /* renamed from: a */
    public void mo13159a() {
        this.f26146a.destroy();
    }

    @Override // com.google.android.gms.internal.AbstractC7944wu
    /* renamed from: a */
    public void mo13158a(AbstractC3501a abstractC3501a, AbstractC3659g abstractC3659g, AbstractC7857vp abstractC7857vp, AbstractC3670p abstractC3670p, boolean z, AbstractC7885vv abstractC7885vv, AbstractC7887vx abstractC7887vx, C3589e c3589e, AbstractC8064yo abstractC8064yo) {
        this.f26146a.mo18084l().m18178a(abstractC3501a, abstractC3659g, abstractC7857vp, abstractC3670p, z, abstractC7885vv, abstractC7887vx, new C3589e(this.f26146a.getContext(), false), abstractC8064yo, null);
    }

    @Override // com.google.android.gms.internal.AbstractC7944wu
    /* renamed from: a */
    public void mo13157a(final AbstractC7944wu.AbstractC7945a abstractC7945a) {
        this.f26146a.mo18084l().m18174a(new acz.AbstractC6197a() { // from class: com.google.android.gms.internal.ww.6
            @Override // com.google.android.gms.internal.acz.AbstractC6197a
            /* renamed from: a */
            public void mo12714a(acy acyVar, boolean z) {
                abstractC7945a.mo13136a();
            }
        });
    }

    @Override // com.google.android.gms.internal.AbstractC7944wu
    /* renamed from: a */
    public void mo13154a(String str) {
        final String format = String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str);
        m13155a(new Runnable() { // from class: com.google.android.gms.internal.ww.3
            @Override // java.lang.Runnable
            public void run() {
                C7950ww.this.f26146a.loadData(format, "text/html", "UTF-8");
            }
        });
    }

    @Override // com.google.android.gms.internal.AbstractC7980wy
    /* renamed from: a */
    public void mo13113a(String str, AbstractC7877vt abstractC7877vt) {
        this.f26146a.mo18084l().m18167a(str, abstractC7877vt);
    }

    @Override // com.google.android.gms.internal.AbstractC7980wy
    /* renamed from: a */
    public void mo13112a(final String str, final String str2) {
        m13155a(new Runnable() { // from class: com.google.android.gms.internal.ww.2
            @Override // java.lang.Runnable
            public void run() {
                C7950ww.this.f26146a.mo13112a(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.AbstractC7980wy
    /* renamed from: a */
    public void mo13111a(final String str, final JSONObject jSONObject) {
        m13155a(new Runnable() { // from class: com.google.android.gms.internal.ww.1
            @Override // java.lang.Runnable
            public void run() {
                C7950ww.this.f26146a.mo13111a(str, jSONObject);
            }
        });
    }

    @Override // com.google.android.gms.internal.AbstractC7944wu
    /* renamed from: b */
    public AbstractC7983xa mo13153b() {
        return new C7984xb(this);
    }

    @Override // com.google.android.gms.internal.AbstractC7944wu
    /* renamed from: b */
    public void mo13152b(final String str) {
        m13155a(new Runnable() { // from class: com.google.android.gms.internal.ww.5
            @Override // java.lang.Runnable
            public void run() {
                C7950ww.this.f26146a.loadUrl(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.AbstractC7980wy
    /* renamed from: b */
    public void mo13110b(String str, AbstractC7877vt abstractC7877vt) {
        this.f26146a.mo18084l().m18160b(str, abstractC7877vt);
    }

    @Override // com.google.android.gms.internal.AbstractC7980wy
    /* renamed from: b */
    public void mo13109b(String str, JSONObject jSONObject) {
        this.f26146a.b(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.AbstractC7944wu
    /* renamed from: c */
    public void mo13151c(final String str) {
        m13155a(new Runnable() { // from class: com.google.android.gms.internal.ww.4
            @Override // java.lang.Runnable
            public void run() {
                C7950ww.this.f26146a.loadData(str, "text/html", "UTF-8");
            }
        });
    }
}
