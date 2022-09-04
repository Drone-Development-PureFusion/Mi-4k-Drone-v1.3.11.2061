package com.google.android.gms.internal;

import com.xiaomi.market.sdk.C10445j;
import java.util.Map;
@aaa
/* renamed from: com.google.android.gms.internal.vo */
/* loaded from: classes.dex */
public final class C7856vo implements AbstractC7877vt {

    /* renamed from: a */
    private final AbstractC7857vp f25984a;

    public C7856vo(AbstractC7857vp abstractC7857vp) {
        this.f25984a = abstractC7857vp;
    }

    @Override // com.google.android.gms.internal.AbstractC7877vt
    /* renamed from: a */
    public void mo12713a(acy acyVar, Map<String, String> map) {
        String str = map.get("name");
        if (str == null) {
            abr.d("App event with no name parameter.");
        } else {
            this.f25984a.mo13319a(str, map.get(C10445j.f32461ag));
        }
    }
}
