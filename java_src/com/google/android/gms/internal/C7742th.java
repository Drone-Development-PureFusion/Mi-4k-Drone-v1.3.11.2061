package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONObject;
@aaa
/* renamed from: com.google.android.gms.internal.th */
/* loaded from: classes.dex */
public final class C7742th {

    /* renamed from: a */
    private final String f25612a;

    /* renamed from: b */
    private final JSONObject f25613b;

    /* renamed from: c */
    private final String f25614c;

    /* renamed from: d */
    private final String f25615d;

    /* renamed from: e */
    private final boolean f25616e;

    /* renamed from: f */
    private final boolean f25617f;

    public C7742th(String str, VersionInfoParcel versionInfoParcel, String str2, JSONObject jSONObject, boolean z, boolean z2) {
        this.f25615d = versionInfoParcel.f14733b;
        this.f25613b = jSONObject;
        this.f25614c = str;
        this.f25612a = str2;
        this.f25616e = z;
        this.f25617f = z2;
    }

    /* renamed from: a */
    public String m13607a() {
        return this.f25612a;
    }

    /* renamed from: b */
    public String m13606b() {
        return this.f25615d;
    }

    /* renamed from: c */
    public JSONObject m13605c() {
        return this.f25613b;
    }

    /* renamed from: d */
    public String m13604d() {
        return this.f25614c;
    }

    /* renamed from: e */
    public boolean m13603e() {
        return this.f25616e;
    }

    /* renamed from: f */
    public boolean m13602f() {
        return this.f25617f;
    }
}
