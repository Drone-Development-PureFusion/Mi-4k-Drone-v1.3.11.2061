package com.google.android.gms.auth;

import android.accounts.Account;
import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.RequiresPermission;
import android.util.Log;
import com.google.android.gms.common.C4536e;
import com.google.android.gms.common.internal.C4588d;
import java.util.List;
/* renamed from: com.google.android.gms.auth.b */
/* loaded from: classes.dex */
public final class C4074b extends C4082j {

    /* renamed from: a */
    public static final String f15581a = "com.google";

    /* renamed from: b */
    public static final String f15582b = "com.google.work";

    /* renamed from: c */
    public static final String f15583c = "suppressProgressScreen";

    /* renamed from: d */
    public static final String f15584d = C4082j.f15598m;

    /* renamed from: e */
    public static final String f15585e = C4082j.f15599n;

    /* renamed from: f */
    public static final int f15586f = 1;

    /* renamed from: g */
    public static final int f15587g = 2;

    /* renamed from: h */
    public static final int f15588h = 3;

    /* renamed from: i */
    public static final int f15589i = 4;

    private C4074b() {
    }

    @TargetApi(23)
    /* renamed from: a */
    public static Bundle m25568a(Context context, Account account) {
        return C4082j.m25533b(context, account);
    }

    /* renamed from: a */
    public static String m25567a(Context context, Account account, String str) {
        return C4082j.m25532b(context, account, str);
    }

    /* renamed from: a */
    public static String m25566a(Context context, Account account, String str, Bundle bundle) {
        return m25558b(context, account, str, bundle).m25862a();
    }

    /* renamed from: a */
    public static String m25565a(Context context, Account account, String str, Bundle bundle, Intent intent) {
        a(intent);
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putParcelable("callback_intent", intent);
        bundle.putBoolean("handle_notification", true);
        return m25552g(context, account, str, bundle).m25862a();
    }

    /* renamed from: a */
    public static String m25564a(Context context, Account account, String str, Bundle bundle, String str2, Bundle bundle2) {
        C4588d.m23624a(str2, (Object) "Authority cannot be empty or null.");
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        ContentResolver.validateSyncExtrasBundle(bundle2);
        bundle.putString("authority", str2);
        bundle.putBundle("sync_extras", bundle2);
        bundle.putBoolean("handle_notification", true);
        return m25552g(context, account, str, bundle).m25862a();
    }

    @Deprecated
    /* renamed from: a */
    public static String m25562a(Context context, String str, String str2) {
        return C4082j.m25531b(context, str, str2);
    }

    @Deprecated
    /* renamed from: a */
    public static String m25561a(Context context, String str, String str2, Bundle bundle) {
        return m25566a(context, new Account(str, "com.google"), str2, bundle);
    }

    @Deprecated
    /* renamed from: a */
    public static String m25560a(Context context, String str, String str2, Bundle bundle, Intent intent) {
        return m25565a(context, new Account(str, "com.google"), str2, bundle, intent);
    }

    @Deprecated
    /* renamed from: a */
    public static String m25559a(Context context, String str, String str2, Bundle bundle, String str3, Bundle bundle2) {
        return m25564a(context, new Account(str, "com.google"), str2, bundle, str3, bundle2);
    }

    /* renamed from: a */
    public static List<AccountChangeEvent> m25569a(Context context, int i, String str) {
        return C4082j.m25534b(context, i, str);
    }

    @RequiresPermission("android.permission.MANAGE_ACCOUNTS")
    @Deprecated
    /* renamed from: a */
    public static void m25563a(Context context, String str) {
        C4082j.m25528d(context, str);
    }

    /* renamed from: b */
    public static TokenData m25558b(Context context, Account account, String str, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("handle_notification", true);
        return m25552g(context, account, str, bundle);
    }

    @Deprecated
    /* renamed from: b */
    public static String m25556b(Context context, String str, String str2, Bundle bundle) {
        return C4082j.m25529c(context, str, str2, bundle);
    }

    /* renamed from: b */
    public static void m25557b(Context context, String str) {
        C4082j.m25526e(context, str);
    }

    /* renamed from: c */
    public static String m25555c(Context context, Account account, String str, Bundle bundle) {
        return C4082j.m25527e(context, account, str, bundle);
    }

    /* renamed from: c */
    public static String m25554c(Context context, String str) {
        return C4082j.m25524f(context, str);
    }

    /* renamed from: d */
    public static TokenData m25553d(Context context, Account account, String str, Bundle bundle) {
        return C4082j.m25525f(context, account, str, bundle);
    }

    /* renamed from: g */
    private static TokenData m25552g(Context context, Account account, String str, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            TokenData m25553d = m25553d(context, account, str, bundle);
            C4536e.i(context);
            return m25553d;
        } catch (C4075c e) {
            C4536e.m23820a(e.m25551a(), context);
            Log.w("GoogleAuthUtil", "Error when getting token", e);
            throw new C4077e("User intervention required. Notification has been pushed.");
        } catch (C4076d e2) {
            C4536e.i(context);
            Log.w("GoogleAuthUtil", "Error when getting token", e2);
            throw new C4077e("User intervention required. Notification has been pushed.");
        }
    }
}
