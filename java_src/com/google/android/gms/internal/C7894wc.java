package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
@aaa
/* renamed from: com.google.android.gms.internal.wc */
/* loaded from: classes.dex */
public class C7894wc implements AbstractC7877vt {

    /* renamed from: a */
    private final Object f26036a = new Object();

    /* renamed from: b */
    private final Map<String, AbstractC7895a> f26037b = new HashMap();

    /* renamed from: com.google.android.gms.internal.wc$a */
    /* loaded from: classes2.dex */
    public interface AbstractC7895a {
        /* renamed from: a */
        void m13280a(String str);

        /* renamed from: a */
        void m13279a(JSONObject jSONObject);
    }

    @Override // com.google.android.gms.internal.AbstractC7877vt
    /* renamed from: a */
    public void mo12713a(acy acyVar, Map<String, String> map) {
        String str = map.get("id");
        String str2 = map.get("fail");
        String str3 = map.get("fail_reason");
        String str4 = map.get("result");
        synchronized (this.f26036a) {
            AbstractC7895a remove = this.f26037b.remove(str);
            if (remove == null) {
                String valueOf = String.valueOf(str);
                abr.d(valueOf.length() != 0 ? "Received result for unexpected method invocation: ".concat(valueOf) : new String("Received result for unexpected method invocation: "));
            } else if (!TextUtils.isEmpty(str2)) {
                remove.m13280a(str3);
            } else if (str4 == null) {
                remove.m13280a("No result.");
            } else {
                try {
                    remove.m13279a(new JSONObject(str4));
                } catch (JSONException e) {
                    remove.m13280a(e.getMessage());
                }
            }
        }
    }
}
