package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.C3589e;
import com.google.android.gms.common.util.C4683f;
import java.util.Map;
@aaa
/* renamed from: com.google.android.gms.internal.wa */
/* loaded from: classes.dex */
public class C7891wa implements AbstractC7877vt {

    /* renamed from: a */
    static final Map<String, Integer> f26029a = C4683f.m23147a("resize", 1, "playVideo", 2, "storePicture", 3, "createCalendarEvent", 4, "setOrientationProperties", 5, "closeResizedAd", 6);

    /* renamed from: b */
    private final C3589e f26030b;

    /* renamed from: c */
    private final C8053yi f26031c;

    public C7891wa(C3589e c3589e, C8053yi c8053yi) {
        this.f26030b = c3589e;
        this.f26031c = c8053yi;
    }

    @Override // com.google.android.gms.internal.AbstractC7877vt
    /* renamed from: a */
    public void mo12713a(acy acyVar, Map<String, String> map) {
        int intValue = f26029a.get(map.get("a")).intValue();
        if (intValue != 5 && this.f26030b != null && !this.f26030b.m27402b()) {
            this.f26030b.m27403a(null);
            return;
        }
        switch (intValue) {
            case 1:
                this.f26031c.m12920a(map);
                return;
            case 2:
            default:
                abr.c("Unknown MRAID command called.");
                return;
            case 3:
                new C8056yk(acyVar, map).m12911a();
                return;
            case 4:
                new C8050yh(acyVar, map).m12929a();
                return;
            case 5:
                new C8055yj(acyVar, map).m12912a();
                return;
            case 6:
                this.f26031c.m12919a(true);
                return;
        }
    }
}
