package com.google.android.gms.internal;

import com.google.android.gms.cast.internal.C4430f;
import com.google.android.gms.common.util.C4693p;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class ags {

    /* renamed from: a */
    private final String f21654a;

    /* renamed from: b */
    private final int f21655b;

    /* renamed from: c */
    private final JSONObject f21656c;

    public ags(String str, int i, JSONObject jSONObject) {
        this.f21654a = str;
        this.f21655b = i;
        this.f21656c = jSONObject;
    }

    public ags(JSONObject jSONObject) {
        this(jSONObject.optString("playerId"), jSONObject.optInt("playerState"), jSONObject.optJSONObject("playerData"));
    }

    /* renamed from: a */
    public int m17579a() {
        return this.f21655b;
    }

    /* renamed from: b */
    public JSONObject m17578b() {
        return this.f21656c;
    }

    /* renamed from: c */
    public String m17577c() {
        return this.f21654a;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ags)) {
            return false;
        }
        ags agsVar = (ags) obj;
        return this.f21655b == agsVar.m17579a() && C4430f.m24206a(this.f21654a, agsVar.m17577c()) && C4693p.m23118a(this.f21656c, agsVar.m17578b());
    }
}
