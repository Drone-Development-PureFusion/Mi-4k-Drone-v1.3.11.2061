package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.request.AutoClickProtectionConfigurationParcel;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abi;
import com.google.android.gms.internal.abr;
@aaa
/* renamed from: com.google.android.gms.ads.internal.e */
/* loaded from: classes.dex */
public class C3589e {

    /* renamed from: a */
    private final Context f14063a;

    /* renamed from: b */
    private final AutoClickProtectionConfigurationParcel f14064b;

    /* renamed from: c */
    private boolean f14065c;

    public C3589e(Context context) {
        this(context, false);
    }

    public C3589e(Context context, @Nullable abi.C6129a c6129a) {
        this.f14063a = context;
        if (c6129a == null || c6129a.f20921b.f14556G == null) {
            this.f14064b = new AutoClickProtectionConfigurationParcel();
        } else {
            this.f14064b = c6129a.f20921b.f14556G;
        }
    }

    public C3589e(Context context, boolean z) {
        this.f14063a = context;
        this.f14064b = new AutoClickProtectionConfigurationParcel(z);
    }

    /* renamed from: a */
    public void m27404a() {
        this.f14065c = true;
    }

    /* renamed from: a */
    public void m27403a(@Nullable String str) {
        if (str == null) {
            str = "";
        }
        abr.c("Action was blocked because no touch was detected.");
        if (!this.f14064b.f14592b || this.f14064b.f14593c == null) {
            return;
        }
        for (String str2 : this.f14064b.f14593c) {
            if (!TextUtils.isEmpty(str2)) {
                C3779u.m26890e().m18370a(this.f14063a, "", str2.replace("{NAVIGATION_URL}", Uri.encode(str)));
            }
        }
    }

    /* renamed from: b */
    public boolean m27402b() {
        return !this.f14064b.f14592b || this.f14065c;
    }
}
