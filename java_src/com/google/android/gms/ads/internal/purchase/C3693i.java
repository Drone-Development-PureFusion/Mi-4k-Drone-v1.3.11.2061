package com.google.android.gms.ads.internal.purchase;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.ads.purchase.InAppPurchaseActivity;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abl;
import com.google.android.gms.internal.abr;
import org.json.JSONException;
import org.json.JSONObject;
@aaa
/* renamed from: com.google.android.gms.ads.internal.purchase.i */
/* loaded from: classes.dex */
public class C3693i {
    /* renamed from: a */
    public int m27081a(Intent intent) {
        if (intent == null) {
            return 5;
        }
        Object obj = intent.getExtras().get("RESPONSE_CODE");
        if (obj == null) {
            abr.d("Intent with no response code, assuming OK (known issue)");
            return 0;
        } else if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        } else {
            if (obj instanceof Long) {
                return (int) ((Long) obj).longValue();
            }
            String valueOf = String.valueOf(obj.getClass().getName());
            abr.d(valueOf.length() != 0 ? "Unexpected type for intent response code. ".concat(valueOf) : new String("Unexpected type for intent response code. "));
            return 5;
        }
    }

    /* renamed from: a */
    public int m27080a(Bundle bundle) {
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            abr.d("Bundle with null response code, assuming OK (known issue)");
            return 0;
        } else if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        } else {
            if (obj instanceof Long) {
                return (int) ((Long) obj).longValue();
            }
            String valueOf = String.valueOf(obj.getClass().getName());
            abr.d(valueOf.length() != 0 ? "Unexpected type for intent response code. ".concat(valueOf) : new String("Unexpected type for intent response code. "));
            return 5;
        }
    }

    /* renamed from: a */
    public String m27079a(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new JSONObject(str).getString("developerPayload");
        } catch (JSONException e) {
            abr.d("Fail to parse purchase data");
            return null;
        }
    }

    /* renamed from: a */
    public void m27083a(final Context context) {
        ServiceConnection serviceConnection = new ServiceConnection() { // from class: com.google.android.gms.ads.internal.purchase.i.1
            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                boolean z = false;
                C3684b c3684b = new C3684b(context.getApplicationContext(), false);
                c3684b.m27107a(iBinder);
                int m27108a = c3684b.m27108a(3, context.getPackageName(), "inapp");
                abl m26886i = C3779u.m26886i();
                if (m27108a == 0) {
                    z = true;
                }
                m26886i.m18443d(z);
                context.unbindService(this);
                c3684b.m27109a();
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
            }
        };
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        context.bindService(intent, serviceConnection, 1);
    }

    /* renamed from: a */
    public void m27082a(Context context, boolean z, GInAppPurchaseManagerInfoParcel gInAppPurchaseManagerInfoParcel) {
        Intent intent = new Intent();
        intent.setClassName(context, InAppPurchaseActivity.f14825a);
        intent.putExtra("com.google.android.gms.ads.internal.purchase.useClientJar", z);
        GInAppPurchaseManagerInfoParcel.m27116a(intent, gInAppPurchaseManagerInfoParcel);
        C3779u.m26890e().m18377a(context, intent);
    }

    /* renamed from: b */
    public String m27078b(Intent intent) {
        if (intent == null) {
            return null;
        }
        return intent.getStringExtra("INAPP_PURCHASE_DATA");
    }

    /* renamed from: b */
    public String m27077b(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new JSONObject(str).getString("purchaseToken");
        } catch (JSONException e) {
            abr.d("Fail to parse purchase data");
            return null;
        }
    }

    /* renamed from: c */
    public String m27076c(Intent intent) {
        if (intent == null) {
            return null;
        }
        return intent.getStringExtra("INAPP_DATA_SIGNATURE");
    }
}
