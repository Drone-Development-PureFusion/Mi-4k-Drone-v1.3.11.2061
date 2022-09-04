package com.google.android.gms.auth;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.annotation.RequiresPermission;
import android.text.TextUtils;
import com.google.android.gms.common.C4516c;
import com.google.android.gms.common.C4517d;
import com.google.android.gms.common.C4656l;
import com.google.android.gms.common.ServiceConnectionC4540h;
import com.google.android.gms.common.internal.AbstractC4643y;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.AbstractC7702sr;
import com.google.android.gms.internal.afb;
import com.google.android.gms.internal.ajl;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
/* renamed from: com.google.android.gms.auth.j */
/* loaded from: classes.dex */
public class C4082j {

    /* renamed from: a */
    private static final ComponentName f15592a;

    /* renamed from: b */
    private static final ComponentName f15593b;

    /* renamed from: c */
    private static final ajl f15594c;

    /* renamed from: j */
    public static final String f15595j = "com.google";

    /* renamed from: k */
    public static final String f15596k = "com.google.work";

    /* renamed from: l */
    public static final String f15597l = "suppressProgressScreen";

    /* renamed from: m */
    public static final String f15598m;

    /* renamed from: n */
    public static final String f15599n;

    /* renamed from: o */
    public static final int f15600o = 1;

    /* renamed from: p */
    public static final int f15601p = 2;

    /* renamed from: q */
    public static final int f15602q = 3;

    /* renamed from: r */
    public static final int f15603r = 4;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.auth.j$a */
    /* loaded from: classes2.dex */
    public interface AbstractC4087a<T> {
        /* renamed from: b */
        T mo25519b(IBinder iBinder);
    }

    static {
        f15598m = Build.VERSION.SDK_INT >= 11 ? "callerUid" : "callerUid";
        f15599n = Build.VERSION.SDK_INT >= 14 ? "androidPackageName" : "androidPackageName";
        f15592a = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
        f15593b = new ComponentName("com.google.android.gms", "com.google.android.gms.recovery.RecoveryService");
        f15594c = C4081i.m25540a("GoogleAuthUtil");
    }

    /* renamed from: a */
    private static <T> T m25537a(Context context, ComponentName componentName, AbstractC4087a<T> abstractC4087a) {
        ServiceConnectionC4540h serviceConnectionC4540h = new ServiceConnectionC4540h();
        AbstractC4643y m23408a = AbstractC4643y.m23408a(context);
        try {
            if (!m23408a.mo23407a(componentName, serviceConnectionC4540h, "GoogleAuthUtil")) {
                throw new IOException("Could not bind to service.");
            }
            try {
                return abstractC4087a.mo25519b(serviceConnectionC4540h.m23801a());
            } catch (RemoteException | InterruptedException e) {
                f15594c.m17115b("GoogleAuthUtil", "Error on service connection.", e);
                throw new IOException("Error on service connection.", e);
            }
        } finally {
            m23408a.mo23403b(componentName, serviceConnectionC4540h, "GoogleAuthUtil");
        }
    }

    /* renamed from: a */
    private static void m25538a(Context context) {
        try {
            C4656l.m23336f(context.getApplicationContext());
        } catch (C4516c e) {
            throw new C3973a(e.getMessage());
        } catch (C4517d e2) {
            throw new C4075c(e2.m23905a(), e2.getMessage(), e2.b());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m25536a(Intent intent) {
        if (intent == null) {
            throw new IllegalArgumentException("Callback cannot be null.");
        }
        try {
            Intent.parseUri(intent.toUri(1), 1);
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException("Parameter callback contains invalid data. It must be serializable using toUri() and parseUri().");
        }
    }

    @TargetApi(23)
    /* renamed from: b */
    public static Bundle m25533b(Context context, final Account account) {
        C4588d.m23627a(context);
        C4588d.m23626a(account, "Account cannot be null.");
        m25538a(context);
        return (Bundle) m25537a(context, f15592a, new AbstractC4087a<Bundle>() { // from class: com.google.android.gms.auth.j.4
            @Override // com.google.android.gms.auth.C4082j.AbstractC4087a
            /* renamed from: a */
            public Bundle mo25519b(IBinder iBinder) {
                return (Bundle) C4082j.m25530b(AbstractC7702sr.AbstractBinderC7703a.m13685a(iBinder).mo13684a(account));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static <T> T m25530b(T t) {
        if (t == null) {
            f15594c.m17114c("GoogleAuthUtil", "Binder call returned null.");
            throw new IOException("Service unavailable.");
        }
        return t;
    }

    /* renamed from: b */
    public static String m25532b(Context context, Account account, String str) {
        return m25527e(context, account, str, new Bundle());
    }

    @Deprecated
    /* renamed from: b */
    public static String m25531b(Context context, String str, String str2) {
        return m25532b(context, new Account(str, "com.google"), str2);
    }

    /* renamed from: b */
    public static List<AccountChangeEvent> m25534b(Context context, final int i, final String str) {
        C4588d.m23624a(str, (Object) "accountName must be provided");
        C4588d.m23616c("Calling this from your main thread can lead to deadlock");
        m25538a(context);
        return (List) m25537a(context, f15592a, new AbstractC4087a<List<AccountChangeEvent>>() { // from class: com.google.android.gms.auth.j.3
            @Override // com.google.android.gms.auth.C4082j.AbstractC4087a
            /* renamed from: a */
            public List<AccountChangeEvent> mo25519b(IBinder iBinder) {
                return ((AccountChangeEventsResponse) C4082j.m25530b(AbstractC7702sr.AbstractBinderC7703a.m13685a(iBinder).mo13681a(new AccountChangeEventsRequest().m25866a(str).m25868a(i)))).m25863a();
            }
        });
    }

    @Deprecated
    /* renamed from: c */
    public static String m25529c(Context context, String str, String str2, Bundle bundle) {
        return m25527e(context, new Account(str, "com.google"), str2, bundle);
    }

    @RequiresPermission("android.permission.MANAGE_ACCOUNTS")
    @Deprecated
    /* renamed from: d */
    public static void m25528d(Context context, String str) {
        AccountManager.get(context).invalidateAuthToken("com.google", str);
    }

    /* renamed from: e */
    public static String m25527e(Context context, Account account, String str, Bundle bundle) {
        return m25525f(context, account, str, bundle).m25862a();
    }

    /* renamed from: e */
    public static void m25526e(Context context, final String str) {
        C4588d.m23616c("Calling this from your main thread can lead to deadlock");
        m25538a(context);
        final Bundle bundle = new Bundle();
        String str2 = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str2);
        if (!bundle.containsKey(f15599n)) {
            bundle.putString(f15599n, str2);
        }
        m25537a(context, f15592a, new AbstractC4087a<Void>() { // from class: com.google.android.gms.auth.j.2
            @Override // com.google.android.gms.auth.C4082j.AbstractC4087a
            /* renamed from: a */
            public Void mo25519b(IBinder iBinder) {
                Bundle bundle2 = (Bundle) C4082j.m25530b(AbstractC7702sr.AbstractBinderC7703a.m13685a(iBinder).mo13680a(str, bundle));
                String string = bundle2.getString("Error");
                if (!bundle2.getBoolean("booleanResult")) {
                    throw new C3973a(string);
                }
                return null;
            }
        });
    }

    /* renamed from: f */
    public static TokenData m25525f(Context context, final Account account, final String str, Bundle bundle) {
        C4588d.m23616c("Calling this from your main thread can lead to deadlock");
        C4588d.m23624a(str, (Object) "Scope cannot be empty or null.");
        C4588d.m23626a(account, "Account cannot be null.");
        m25538a(context);
        final Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        String str2 = context.getApplicationInfo().packageName;
        bundle2.putString("clientPackageName", str2);
        if (TextUtils.isEmpty(bundle2.getString(f15599n))) {
            bundle2.putString(f15599n, str2);
        }
        bundle2.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
        return (TokenData) m25537a(context, f15592a, new AbstractC4087a<TokenData>() { // from class: com.google.android.gms.auth.j.1
            @Override // com.google.android.gms.auth.C4082j.AbstractC4087a
            /* renamed from: a */
            public TokenData mo25519b(IBinder iBinder) {
                Bundle bundle3 = (Bundle) C4082j.m25530b(AbstractC7702sr.AbstractBinderC7703a.m13685a(iBinder).mo13683a(account, str, bundle2));
                TokenData m25861a = TokenData.m25861a(bundle3, "tokenDetails");
                if (m25861a != null) {
                    return m25861a;
                }
                String string = bundle3.getString("Error");
                Intent intent = (Intent) bundle3.getParcelable("userRecoveryIntent");
                afb m17818a = afb.m17818a(string);
                if (!afb.m17819a(m17818a)) {
                    if (!afb.m17817b(m17818a)) {
                        throw new C3973a(string);
                    }
                    throw new IOException(string);
                }
                ajl ajlVar = C4082j.f15594c;
                String valueOf = String.valueOf(m17818a);
                ajlVar.m17114c("GoogleAuthUtil", new StringBuilder(String.valueOf(valueOf).length() + 31).append("isUserRecoverableError status: ").append(valueOf).toString());
                throw new C4076d(string, intent);
            }
        });
    }

    /* renamed from: f */
    public static String m25524f(Context context, String str) {
        C4588d.m23624a(str, (Object) "accountName must be provided");
        C4588d.m23616c("Calling this from your main thread can lead to deadlock");
        m25538a(context);
        return m25529c(context, str, "^^_account_id_^^", new Bundle());
    }
}
