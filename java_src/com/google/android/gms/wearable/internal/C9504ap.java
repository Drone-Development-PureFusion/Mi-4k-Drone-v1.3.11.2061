package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.net.Uri;
import com.google.android.gms.wearable.PutDataRequest;
import org.p356d.AbstractC11759f;
/* renamed from: com.google.android.gms.wearable.internal.ap */
/* loaded from: classes2.dex */
public final class C9504ap {
    /* renamed from: a */
    public static IntentFilter m7986a(String str) {
        IntentFilter intentFilter = new IntentFilter(str);
        intentFilter.addDataScheme(PutDataRequest.f29800a);
        intentFilter.addDataAuthority(AbstractC11759f.f37104a, null);
        return intentFilter;
    }

    /* renamed from: a */
    public static IntentFilter m7985a(String str, Uri uri, int i) {
        IntentFilter intentFilter = new IntentFilter(str);
        if (uri.getScheme() != null) {
            intentFilter.addDataScheme(uri.getScheme());
        }
        if (uri.getAuthority() != null) {
            intentFilter.addDataAuthority(uri.getAuthority(), Integer.toString(uri.getPort()));
        }
        if (uri.getPath() != null) {
            intentFilter.addDataPath(uri.getPath(), i);
        }
        return intentFilter;
    }
}
