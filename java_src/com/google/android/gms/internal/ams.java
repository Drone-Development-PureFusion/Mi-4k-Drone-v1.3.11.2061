package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
/* loaded from: classes2.dex */
public class ams {

    /* renamed from: a */
    private static Boolean f22309a = null;

    /* renamed from: b */
    private static ContentProviderClient f22310b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Intent m16762a(Context context, String str, Intent intent) {
        return m16761a(context, str, (Parcelable) intent, true);
    }

    @TargetApi(11)
    /* renamed from: a */
    private static Intent m16761a(Context context, String str, Parcelable parcelable, boolean z) {
        Bundle bundle;
        if (context == null || str == null) {
            throw new IllegalArgumentException("Parameter is null");
        }
        if (!m16763a(context)) {
            return null;
        }
        if (parcelable != null) {
            bundle = new Bundle(1);
            bundle.putParcelable("key_fallbackIntent", parcelable);
        } else {
            bundle = null;
        }
        try {
            Bundle m16760a = m16760a(context, "method_getInstantAppIntent", str, bundle);
            if (m16760a != null) {
                return (Intent) m16760a.getParcelable("key_instantAppIntent");
            }
            return null;
        } catch (DeadObjectException e) {
            Log.e("InstantAppsApi", String.format("While calling %s %s:\n", amq.f22308a, "method_getInstantAppIntent"), e);
            m16764a();
            if (!z) {
                return null;
            }
            return m16761a(context, str, parcelable, false);
        } catch (RemoteException e2) {
            e = e2;
            Log.e("InstantAppsApi", String.format("While calling %s %s:\n", amq.f22308a, "method_getInstantAppIntent"), e);
            return null;
        } catch (IllegalArgumentException e3) {
            e = e3;
            Log.e("InstantAppsApi", String.format("While calling %s %s:\n", amq.f22308a, "method_getInstantAppIntent"), e);
            return null;
        }
    }

    @TargetApi(11)
    /* renamed from: a */
    private static synchronized Bundle m16760a(Context context, String str, String str2, Bundle bundle) {
        Bundle call;
        synchronized (ams.class) {
            call = f22310b == null ? context.getContentResolver().call(amq.f22308a, str, str2, bundle) : m16759a(str, str2, bundle);
        }
        return call;
    }

    @TargetApi(17)
    /* renamed from: a */
    private static synchronized Bundle m16759a(String str, String str2, Bundle bundle) {
        Bundle call;
        synchronized (ams.class) {
            call = f22310b.call(str, str2, bundle);
        }
        return call;
    }

    /* renamed from: a */
    static synchronized void m16764a() {
        synchronized (ams.class) {
            if (f22310b != null) {
                f22310b.release();
                f22310b = null;
            }
            f22309a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(11)
    /* renamed from: a */
    public static synchronized boolean m16763a(Context context) {
        boolean booleanValue;
        synchronized (ams.class) {
            if (context == null) {
                throw new IllegalArgumentException("Parameter is null");
            }
            if (f22309a != null) {
                booleanValue = f22309a.booleanValue();
            } else {
                f22309a = Boolean.valueOf(m16757c(context));
                booleanValue = f22309a.booleanValue();
            }
        }
        return booleanValue;
    }

    @TargetApi(17)
    /* renamed from: b */
    private static synchronized boolean m16758b(Context context) {
        boolean z;
        synchronized (ams.class) {
            if (f22310b == null) {
                f22310b = context.getContentResolver().acquireUnstableContentProviderClient(amq.f22308a);
            }
            z = f22310b != null;
        }
        return z;
    }

    /* renamed from: c */
    private static synchronized boolean m16757c(Context context) {
        ProviderInfo resolveContentProvider;
        boolean z = false;
        synchronized (ams.class) {
            if (Build.VERSION.SDK_INT >= 11 && amt.m16756a(context) && (resolveContentProvider = context.getPackageManager().resolveContentProvider(amq.f22308a.getAuthority(), 0)) != null) {
                if (!resolveContentProvider.packageName.equals("com.google.android.gms")) {
                    String valueOf = String.valueOf(resolveContentProvider.packageName);
                    Log.e("InstantAppsApi", valueOf.length() != 0 ? "Incorrect package name for instant apps content provider: ".concat(valueOf) : new String("Incorrect package name for instant apps content provider: "));
                } else if (Build.VERSION.SDK_INT < 17 || m16758b(context)) {
                    z = true;
                }
            }
        }
        return z;
    }
}
