package com.google.android.gms.gcm;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.iid.C6095a;
import java.util.regex.Pattern;
/* renamed from: com.google.android.gms.gcm.b */
/* loaded from: classes2.dex */
public class C6066b {

    /* renamed from: a */
    private static C6066b f20535a;

    /* renamed from: c */
    private static final Pattern f20536c = Pattern.compile("/topics/[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: b */
    private C6095a f20537b;

    private C6066b(Context context) {
        this.f20537b = C6095a.m18745c(context);
    }

    /* renamed from: a */
    public static synchronized C6066b m18855a(Context context) {
        C6066b c6066b;
        synchronized (C6066b.class) {
            if (f20535a == null) {
                f20535a = new C6066b(context);
            }
            c6066b = f20535a;
        }
        return c6066b;
    }

    @RequiresPermission("com.google.android.c2dm.permission.RECEIVE")
    /* renamed from: a */
    public void m18854a(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", str2);
        this.f20537b.m18753a(str, str2, bundle);
    }

    @RequiresPermission("com.google.android.c2dm.permission.RECEIVE")
    /* renamed from: a */
    public void m18853a(String str, String str2, Bundle bundle) {
        if (str == null || str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Invalid appInstanceToken: ".concat(valueOf) : new String("Invalid appInstanceToken: "));
        } else if (str2 == null || !f20536c.matcher(str2).matches()) {
            String valueOf2 = String.valueOf(str2);
            throw new IllegalArgumentException(valueOf2.length() != 0 ? "Invalid topic name: ".concat(valueOf2) : new String("Invalid topic name: "));
        } else {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString("gcm.topic", str2);
            this.f20537b.m18747b(str, str2, bundle);
        }
    }
}
