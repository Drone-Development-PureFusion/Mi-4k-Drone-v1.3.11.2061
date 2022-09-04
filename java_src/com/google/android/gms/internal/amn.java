package com.google.android.gms.internal;

import android.accounts.Account;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.internal.AbstractC4638w;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.identity.intents.AbstractC6083b;
import com.google.android.gms.identity.intents.UserAddressRequest;
import com.google.android.gms.internal.amo;
import com.google.android.gms.internal.amp;
/* loaded from: classes2.dex */
public class amn extends AbstractC4638w<amp> {

    /* renamed from: a */
    private Activity f22300a;

    /* renamed from: e */
    private BinderC6575a f22301e;

    /* renamed from: f */
    private final String f22302f;

    /* renamed from: g */
    private final int f22303g;

    /* renamed from: com.google.android.gms.internal.amn$a */
    /* loaded from: classes2.dex */
    public static final class BinderC6575a extends amo.AbstractBinderC6576a {

        /* renamed from: a */
        private final int f22304a;

        /* renamed from: b */
        private Activity f22305b;

        public BinderC6575a(int i, Activity activity) {
            this.f22304a = i;
            this.f22305b = activity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m16772a(Activity activity) {
            this.f22305b = activity;
        }

        @Override // com.google.android.gms.internal.amo
        /* renamed from: a */
        public void mo16769a(int i, Bundle bundle) {
            if (i == 1) {
                Intent intent = new Intent();
                intent.putExtras(bundle);
                PendingIntent createPendingResult = this.f22305b.createPendingResult(this.f22304a, intent, 1073741824);
                if (createPendingResult == null) {
                    return;
                }
                try {
                    createPendingResult.send(1);
                    return;
                } catch (PendingIntent.CanceledException e) {
                    Log.w("AddressClientImpl", "Exception settng pending result", e);
                    return;
                }
            }
            PendingIntent pendingIntent = null;
            if (bundle != null) {
                pendingIntent = (PendingIntent) bundle.getParcelable("com.google.android.gms.identity.intents.EXTRA_PENDING_INTENT");
            }
            ConnectionResult connectionResult = new ConnectionResult(i, pendingIntent);
            if (connectionResult.m24050a()) {
                try {
                    connectionResult.m24048a(this.f22305b, this.f22304a);
                    return;
                } catch (IntentSender.SendIntentException e2) {
                    Log.w("AddressClientImpl", "Exception starting pending intent", e2);
                    return;
                }
            }
            try {
                PendingIntent createPendingResult2 = this.f22305b.createPendingResult(this.f22304a, new Intent(), 1073741824);
                if (createPendingResult2 == null) {
                    return;
                }
                createPendingResult2.send(1);
            } catch (PendingIntent.CanceledException e3) {
                Log.w("AddressClientImpl", "Exception setting pending result", e3);
            }
        }
    }

    public amn(Activity activity, Looper looper, C4626s c4626s, int i, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c) {
        super(activity, looper, 12, c4626s, abstractC4491b, abstractC4492c);
        this.f22302f = c4626s.m23537a();
        this.f22300a = activity;
        this.f22303g = i;
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: H */
    public boolean mo15921H() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    public amp mo7440b(IBinder iBinder) {
        return amp.AbstractBinderC6578a.m16768a(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    protected String mo7443a() {
        return "com.google.android.gms.identity.service.BIND";
    }

    /* renamed from: a */
    public void m16775a(UserAddressRequest userAddressRequest, int i) {
        m16773i();
        this.f22301e = new BinderC6575a(i, this.f22300a);
        try {
            Bundle bundle = new Bundle();
            bundle.putString("com.google.android.gms.identity.intents.EXTRA_CALLING_PACKAGE_NAME", B().getPackageName());
            if (!TextUtils.isEmpty(this.f22302f)) {
                bundle.putParcelable("com.google.android.gms.identity.intents.EXTRA_ACCOUNT", new Account(this.f22302f, "com.google"));
            }
            bundle.putInt("com.google.android.gms.identity.intents.EXTRA_THEME", this.f22303g);
            m16774h().mo16767a(this.f22301e, userAddressRequest, bundle);
        } catch (RemoteException e) {
            Log.e("AddressClientImpl", "Exception requesting user address", e);
            Bundle bundle2 = new Bundle();
            bundle2.putInt(AbstractC6083b.AbstractC6085b.f20577b, AbstractC6083b.AbstractC6084a.f20575a);
            this.f22301e.mo16769a(1, bundle2);
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: b */
    protected String mo7441b() {
        return "com.google.android.gms.identity.intents.internal.IAddressService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p, com.google.android.gms.common.api.C4467a.AbstractC4477f
    /* renamed from: f */
    public void mo9828f() {
        super.f();
        if (this.f22301e != null) {
            this.f22301e.m16772a((Activity) null);
            this.f22301e = null;
        }
    }

    /* renamed from: h */
    protected amp m16774h() {
        return (amp) super.G();
    }

    /* renamed from: i */
    protected void m16773i() {
        super.F();
    }
}
