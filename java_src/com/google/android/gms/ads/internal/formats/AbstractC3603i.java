package com.google.android.gms.ads.internal.formats;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.ads.internal.formats.i */
/* loaded from: classes2.dex */
public interface AbstractC3603i {

    /* renamed from: com.google.android.gms.ads.internal.formats.i$a */
    /* loaded from: classes2.dex */
    public interface AbstractC3604a {
        /* renamed from: a */
        void mo27381a(AbstractC3603i abstractC3603i);

        /* renamed from: k */
        String mo27380k();

        /* renamed from: l */
        String mo13338l();

        /* renamed from: m */
        C3595a mo27379m();
    }

    /* renamed from: a */
    void mo27378a();

    /* renamed from: a */
    void mo27377a(MotionEvent motionEvent);

    /* renamed from: a */
    void mo27375a(View view);

    /* renamed from: a */
    void mo27373a(View view, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);

    /* renamed from: a */
    void mo27372a(View view, Map<String, WeakReference<View>> map);

    /* renamed from: a */
    void mo27370a(View view, Map<String, WeakReference<View>> map, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);

    /* renamed from: b */
    void mo27365b(View view);

    /* renamed from: e */
    View mo27362e();

    /* renamed from: f */
    Context mo27361f();
}
