package com.google.android.gms.ads.internal.purchase;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abr;
@aaa
/* renamed from: com.google.android.gms.ads.internal.purchase.b */
/* loaded from: classes.dex */
public class C3684b {

    /* renamed from: a */
    Object f14405a;

    /* renamed from: b */
    private final Context f14406b;

    /* renamed from: c */
    private final boolean f14407c;

    public C3684b(Context context) {
        this(context, true);
    }

    public C3684b(Context context, boolean z) {
        this.f14406b = context;
        this.f14407c = z;
    }

    /* renamed from: a */
    public int m27108a(int i, String str, String str2) {
        try {
            Class<?> loadClass = this.f14406b.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService");
            return ((Integer) loadClass.getDeclaredMethod("isBillingSupported", Integer.TYPE, String.class, String.class).invoke(loadClass.cast(this.f14405a), Integer.valueOf(i), str, str2)).intValue();
        } catch (Exception e) {
            if (this.f14407c) {
                abr.d("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.", e);
            }
            return 5;
        }
    }

    /* renamed from: a */
    public int m27106a(String str, String str2) {
        try {
            Class<?> loadClass = this.f14406b.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService");
            return ((Integer) loadClass.getDeclaredMethod("consumePurchase", Integer.TYPE, String.class, String.class).invoke(loadClass.cast(this.f14405a), 3, str, str2)).intValue();
        } catch (Exception e) {
            if (this.f14407c) {
                abr.d("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.", e);
            }
            return 5;
        }
    }

    /* renamed from: a */
    public Bundle m27105a(String str, String str2, String str3) {
        try {
            Class<?> loadClass = this.f14406b.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService");
            return (Bundle) loadClass.getDeclaredMethod("getBuyIntent", Integer.TYPE, String.class, String.class, String.class, String.class).invoke(loadClass.cast(this.f14405a), 3, str, str2, "inapp", str3);
        } catch (Exception e) {
            if (this.f14407c) {
                abr.d("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.", e);
            }
            return null;
        }
    }

    /* renamed from: a */
    public void m27109a() {
        this.f14405a = null;
    }

    /* renamed from: a */
    public void m27107a(IBinder iBinder) {
        try {
            this.f14405a = this.f14406b.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService$Stub").getDeclaredMethod("asInterface", IBinder.class).invoke(null, iBinder);
        } catch (Exception e) {
            if (!this.f14407c) {
                return;
            }
            abr.d("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.");
        }
    }

    /* renamed from: b */
    public Bundle m27104b(String str, String str2) {
        try {
            Class<?> loadClass = this.f14406b.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService");
            return (Bundle) loadClass.getDeclaredMethod("getPurchases", Integer.TYPE, String.class, String.class, String.class).invoke(loadClass.cast(this.f14405a), 3, str, "inapp", str2);
        } catch (Exception e) {
            if (this.f14407c) {
                abr.d("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.", e);
            }
            return null;
        }
    }
}
