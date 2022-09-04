package com.google.android.gms.internal;

import java.util.Map;
@aaa
/* renamed from: com.google.android.gms.internal.vw */
/* loaded from: classes.dex */
public class C7886vw implements AbstractC7877vt {

    /* renamed from: a */
    private final AbstractC7887vx f26027a;

    public C7886vw(AbstractC7887vx abstractC7887vx) {
        this.f26027a = abstractC7887vx;
    }

    @Override // com.google.android.gms.internal.AbstractC7877vt
    /* renamed from: a */
    public void mo12713a(acy acyVar, Map<String, String> map) {
        float f;
        boolean equals = "1".equals(map.get("transparentBackground"));
        boolean equals2 = "1".equals(map.get("blur"));
        try {
        } catch (NumberFormatException e) {
            abr.b("Fail to parse float", e);
        }
        if (map.get("blurRadius") != null) {
            f = Float.parseFloat(map.get("blurRadius"));
            this.f26027a.mo13294b(equals);
            this.f26027a.mo13295a(equals2, f);
        }
        f = 0.0f;
        this.f26027a.mo13294b(equals);
        this.f26027a.mo13295a(equals2, f);
    }
}
