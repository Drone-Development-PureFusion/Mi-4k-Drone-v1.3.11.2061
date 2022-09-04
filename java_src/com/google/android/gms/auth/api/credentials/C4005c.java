package com.google.android.gms.auth.api.credentials;

import android.accounts.Account;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.C4588d;
/* renamed from: com.google.android.gms.auth.api.credentials.c */
/* loaded from: classes2.dex */
public final class C4005c {

    /* renamed from: a */
    public static final String f15440a = "https://www.facebook.com";

    /* renamed from: b */
    public static final String f15441b = "https://accounts.google.com";

    /* renamed from: c */
    public static final String f15442c = "https://www.linkedin.com";

    /* renamed from: d */
    public static final String f15443d = "https://login.live.com";

    /* renamed from: e */
    public static final String f15444e = "https://www.paypal.com";

    /* renamed from: f */
    public static final String f15445f = "https://twitter.com";

    /* renamed from: g */
    public static final String f15446g = "https://login.yahoo.com";

    private C4005c() {
    }

    @Nullable
    /* renamed from: a */
    public static final String m25766a(@NonNull Account account) {
        C4588d.m23626a(account, "account cannot be null");
        if ("com.google".equals(account.type)) {
            return f15441b;
        }
        if (!"com.facebook.auth.login".equals(account.type)) {
            return null;
        }
        return f15440a;
    }
}
