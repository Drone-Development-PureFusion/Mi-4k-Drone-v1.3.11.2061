package com.google.android.gms.internal;

import com.google.android.gms.analytics.AbstractC3938n;
import com.google.android.gms.common.internal.C4588d;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.ads */
/* loaded from: classes2.dex */
public final class C6217ads extends AbstractC3938n<C6217ads> {

    /* renamed from: a */
    private final Map<String, Object> f21298a = new HashMap();

    /* renamed from: a */
    private String m17996a(String str) {
        C4588d.m23625a(str);
        if (str != null && str.startsWith("&")) {
            str = str.substring(1);
        }
        C4588d.m23624a(str, (Object) "Name can not be empty or \"&\"");
        return str;
    }

    /* renamed from: a */
    public Map<String, Object> m17998a() {
        return Collections.unmodifiableMap(this.f21298a);
    }

    @Override // com.google.android.gms.analytics.AbstractC3938n
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo17922a(C6217ads c6217ads) {
        C4588d.m23627a(c6217ads);
        c6217ads.f21298a.putAll(this.f21298a);
    }

    /* renamed from: a */
    public void m17995a(String str, String str2) {
        this.f21298a.put(m17996a(str), str2);
    }

    public String toString() {
        return a((Object) this.f21298a);
    }
}
