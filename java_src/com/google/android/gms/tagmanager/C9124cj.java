package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.tagmanager.C9196e;
import java.util.Map;
/* renamed from: com.google.android.gms.tagmanager.cj */
/* loaded from: classes2.dex */
class C9124cj implements C9196e.AbstractC9200b {

    /* renamed from: a */
    private final Context f28835a;

    public C9124cj(Context context) {
        this.f28835a = context;
    }

    @Override // com.google.android.gms.tagmanager.C9196e.AbstractC9200b
    /* renamed from: a */
    public void mo8927a(Map<String, Object> map) {
        String queryParameter;
        Object obj;
        Object obj2 = map.get("gtm.url");
        Object obj3 = (obj2 != null || (obj = map.get("gtm")) == null || !(obj instanceof Map)) ? obj2 : ((Map) obj).get("url");
        if (obj3 == null || !(obj3 instanceof String) || (queryParameter = Uri.parse((String) obj3).getQueryParameter("referrer")) == null) {
            return;
        }
        C9052an.m9310c(this.f28835a, queryParameter);
    }
}
