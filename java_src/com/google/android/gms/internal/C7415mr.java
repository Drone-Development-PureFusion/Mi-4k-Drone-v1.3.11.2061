package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.C4585c;
import com.xiaomi.mipush.sdk.Constants;
/* renamed from: com.google.android.gms.internal.mr */
/* loaded from: classes2.dex */
public class C7415mr {

    /* renamed from: a */
    private String f24844a;

    public C7415mr(@Nullable String str) {
        this.f24844a = str;
    }

    @Nullable
    /* renamed from: a */
    public String m14547a() {
        return this.f24844a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7415mr)) {
            return false;
        }
        return C4585c.m23634a(this.f24844a, ((C7415mr) obj).f24844a);
    }

    public int hashCode() {
        return C4585c.m23633a(this.f24844a);
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a(Constants.EXTRA_KEY_TOKEN, this.f24844a).toString();
    }
}
