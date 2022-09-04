package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.C4515b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.aic;
import com.xiaomi.market.sdk.C10445j;
/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    protected int f16783a = 0;

    /* renamed from: a */
    public static PendingIntent m24027a(Context context, PendingIntent pendingIntent, int i) {
        return m24026a(context, pendingIntent, i, true);
    }

    /* renamed from: a */
    public static PendingIntent m24026a(Context context, PendingIntent pendingIntent, int i, boolean z) {
        return PendingIntent.getActivity(context, 0, m24025b(context, pendingIntent, i, z), 134217728);
    }

    /* renamed from: a */
    private void m24030a() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            Log.e("GoogleApiActivity", "Activity started without extras");
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
        Integer num = (Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            Log.e("GoogleApiActivity", "Activity started without resolution");
            finish();
        } else if (pendingIntent == null) {
            C4515b.m23920a().m23907b(this, num.intValue(), 2, this);
            this.f16783a = 1;
        } else {
            try {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                this.f16783a = 1;
            } catch (IntentSender.SendIntentException e) {
                Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                finish();
            }
        }
    }

    /* renamed from: a */
    private void m24028a(int i, aic aicVar) {
        switch (i) {
            case -1:
                aicVar.m17304b();
                return;
            case 0:
                aicVar.m17302b(new ConnectionResult(13, null), getIntent().getIntExtra("failing_client_id", -1));
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    public static Intent m24025b(Context context, PendingIntent pendingIntent, int i, boolean z) {
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", z);
        return intent;
    }

    /* renamed from: a */
    protected void m24029a(int i) {
        setResult(i);
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f16783a = 0;
            aic m17320a = aic.m17320a();
            m24029a(i2);
            if (booleanExtra) {
                m24028a(i2, m17320a);
            }
        } else if (i == 2) {
            this.f16783a = 0;
            m24029a(i2);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        this.f16783a = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f16783a = bundle.getInt(C10445j.f32463ai);
        }
        if (this.f16783a != 1) {
            m24030a();
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        bundle.putInt(C10445j.f32463ai, this.f16783a);
        super.onSaveInstanceState(bundle);
    }
}
