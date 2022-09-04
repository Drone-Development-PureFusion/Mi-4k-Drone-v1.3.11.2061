package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
@aaa
/* renamed from: com.google.android.gms.internal.um */
/* loaded from: classes.dex */
public class C7800um {

    /* renamed from: a */
    private final Map<String, C7799ul> f25931a = new HashMap();
    @Nullable

    /* renamed from: b */
    private final C7801un f25932b;

    public C7800um(@Nullable C7801un c7801un) {
        this.f25932b = c7801un;
    }

    @Nullable
    /* renamed from: a */
    public C7801un m13442a() {
        return this.f25932b;
    }

    /* renamed from: a */
    public void m13441a(String str, C7799ul c7799ul) {
        this.f25931a.put(str, c7799ul);
    }

    /* renamed from: a */
    public void m13440a(String str, String str2, long j) {
        C7794uj.m13450a(this.f25932b, this.f25931a.get(str2), j, str);
        this.f25931a.put(str, C7794uj.m13451a(this.f25932b, j));
    }
}
