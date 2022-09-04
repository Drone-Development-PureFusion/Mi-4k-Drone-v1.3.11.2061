package com.google.android.gms.internal;

import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class agn {

    /* renamed from: a */
    private final String f21626a;

    /* renamed from: b */
    private final int f21627b;

    /* renamed from: c */
    private final String f21628c;

    public agn(String str, int i, String str2) {
        this.f21626a = str;
        this.f21627b = i;
        this.f21628c = str2;
    }

    public agn(JSONObject jSONObject) {
        this(jSONObject.optString("applicationName"), jSONObject.optInt("maxPlayers"), jSONObject.optString("version"));
    }

    /* renamed from: a */
    public final String m17623a() {
        return this.f21626a;
    }

    /* renamed from: b */
    public final int m17622b() {
        return this.f21627b;
    }

    /* renamed from: c */
    public final String m17621c() {
        return this.f21628c;
    }
}
