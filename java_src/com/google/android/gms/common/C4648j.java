package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4557aa;
import com.google.android.gms.common.util.C4686i;
import com.google.android.gms.drive.AbstractC4808e;
import com.google.android.gms.internal.ajp;
import com.xiaomi.mipush.sdk.Constants;
/* renamed from: com.google.android.gms.common.j */
/* loaded from: classes.dex */
public class C4648j {

    /* renamed from: d */
    public static final String f17167d = "com.google.android.gms";

    /* renamed from: c */
    public static final int f17166c = C4656l.f17181e;

    /* renamed from: a */
    private static final C4648j f17165a = new C4648j();

    /* renamed from: b */
    public static C4648j m23370b() {
        return f17165a;
    }

    /* renamed from: b */
    private String m23366b(@Nullable Context context, @Nullable String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(f17166c);
        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        if (context != null) {
            try {
                sb.append(ajp.m17106b(context).m17108b(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public int mo23375a(Context context) {
        int m23339e = C4656l.m23339e(context);
        if (C4656l.m23341d(context, m23339e)) {
            return 18;
        }
        return m23339e;
    }

    @Nullable
    /* renamed from: a */
    public PendingIntent mo23374a(Context context, int i, int i2) {
        return mo23373a(context, i, i2, null);
    }

    @Nullable
    /* renamed from: a */
    public PendingIntent mo23373a(Context context, int i, int i2, @Nullable String str) {
        if (C4686i.m23137a(context) && i == 2) {
            i = 42;
        }
        Intent mo23372a = mo23372a(context, i, str);
        if (mo23372a == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i2, mo23372a, AbstractC4808e.f17570a_);
    }

    @Nullable
    /* renamed from: a */
    public Intent mo23372a(Context context, int i, @Nullable String str) {
        switch (i) {
            case 1:
            case 2:
                return C4557aa.m23713a("com.google.android.gms", m23366b(context, str));
            case 3:
                return C4557aa.m23714a("com.google.android.gms");
            case 42:
                return C4557aa.m23715a();
            default:
                return null;
        }
    }

    /* renamed from: a */
    public boolean mo23376a(int i) {
        return C4656l.m23335g(i);
    }

    /* renamed from: a */
    public boolean m23371a(Context context, String str) {
        return C4656l.m23348a(context, str);
    }

    @Nullable
    @Deprecated
    /* renamed from: b */
    public Intent mo23369b(int i) {
        return mo23372a((Context) null, i, (String) null);
    }

    @Nullable
    /* renamed from: b */
    public String mo23368b(Context context) {
        return C4656l.m23331j(context);
    }

    /* renamed from: b */
    public boolean mo23367b(Context context, int i) {
        return C4656l.m23341d(context, i);
    }

    /* renamed from: c */
    public int mo23364c(Context context) {
        return C4656l.m23328m(context);
    }

    /* renamed from: c */
    public String mo23365c(int i) {
        return C4656l.m23342d(i);
    }

    /* renamed from: d */
    public void m23363d(Context context) {
        C4656l.m23336f(context);
    }

    /* renamed from: e */
    public void m23362e(Context context) {
        C4656l.m23332i(context);
    }
}
