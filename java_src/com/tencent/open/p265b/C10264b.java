package com.tencent.open.p265b;

import android.os.Bundle;
import java.io.Serializable;
import java.util.HashMap;
/* renamed from: com.tencent.open.b.b */
/* loaded from: classes2.dex */
public class C10264b implements Serializable {

    /* renamed from: a */
    public final HashMap<String, String> f31928a = new HashMap<>();

    public C10264b(Bundle bundle) {
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                this.f31928a.put(str, bundle.getString(str));
            }
        }
    }
}
