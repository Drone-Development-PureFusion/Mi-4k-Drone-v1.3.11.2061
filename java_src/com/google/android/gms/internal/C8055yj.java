package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.C3779u;
import java.util.Map;
@aaa
/* renamed from: com.google.android.gms.internal.yj */
/* loaded from: classes.dex */
public class C8055yj {

    /* renamed from: a */
    private final acy f26394a;

    /* renamed from: b */
    private final boolean f26395b;

    /* renamed from: c */
    private final String f26396c;

    public C8055yj(acy acyVar, Map<String, String> map) {
        this.f26394a = acyVar;
        this.f26396c = map.get("forceOrientation");
        if (map.containsKey("allowOrientationChange")) {
            this.f26395b = Boolean.parseBoolean(map.get("allowOrientationChange"));
        } else {
            this.f26395b = true;
        }
    }

    /* renamed from: a */
    public void m12912a() {
        if (this.f26394a == null) {
            abr.d("AdWebView is null");
        } else {
            this.f26394a.mo18104b("portrait".equalsIgnoreCase(this.f26396c) ? C3779u.m26888g().mo18301b() : "landscape".equalsIgnoreCase(this.f26396c) ? C3779u.m26888g().mo18302a() : this.f26395b ? -1 : C3779u.m26888g().mo18290c());
        }
    }
}
