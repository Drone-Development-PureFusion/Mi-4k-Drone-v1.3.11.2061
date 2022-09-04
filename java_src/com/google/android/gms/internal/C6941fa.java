package com.google.android.gms.internal;

import android.accounts.Account;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
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
import com.google.android.gms.common.api.C4487e;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC4638w;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.C4626s;
import com.google.android.gms.internal.AbstractC6919ev;
import com.google.android.gms.internal.AbstractC6928ey;
import com.google.android.gms.internal.ahl;
import com.google.android.gms.wallet.C9357e;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;
import com.google.android.gms.wallet.firstparty.GetBuyFlowInitializationTokenResponse;
import com.google.android.gms.wallet.firstparty.GetClientTokenResponse;
import com.google.android.gms.wallet.firstparty.GetInstrumentsResponse;
import java.lang.ref.WeakReference;
/* renamed from: com.google.android.gms.internal.fa */
/* loaded from: classes2.dex */
public class C6941fa extends AbstractC4638w<AbstractC6919ev> {

    /* renamed from: a */
    private final Context f23335a;

    /* renamed from: e */
    private final int f23336e;

    /* renamed from: f */
    private final String f23337f;

    /* renamed from: g */
    private final int f23338g;

    /* renamed from: h */
    private final boolean f23339h;

    /* renamed from: com.google.android.gms.internal.fa$a */
    /* loaded from: classes2.dex */
    private static class BinderC6943a extends AbstractC6928ey.AbstractBinderC6929a {
        private BinderC6943a() {
        }

        @Override // com.google.android.gms.internal.AbstractC6928ey
        /* renamed from: a */
        public void mo15905a(int i, Bundle bundle) {
        }

        @Override // com.google.android.gms.internal.AbstractC6928ey
        /* renamed from: a */
        public void mo15904a(int i, FullWallet fullWallet, Bundle bundle) {
        }

        @Override // com.google.android.gms.internal.AbstractC6928ey
        /* renamed from: a */
        public void mo15903a(int i, MaskedWallet maskedWallet, Bundle bundle) {
        }

        @Override // com.google.android.gms.internal.AbstractC6928ey
        /* renamed from: a */
        public void mo15902a(int i, boolean z, Bundle bundle) {
        }

        @Override // com.google.android.gms.internal.AbstractC6928ey
        /* renamed from: a */
        public void mo15910a(Status status, Bundle bundle) {
        }

        @Override // com.google.android.gms.internal.AbstractC6928ey
        /* renamed from: a */
        public void mo15909a(Status status, GetBuyFlowInitializationTokenResponse getBuyFlowInitializationTokenResponse, Bundle bundle) {
        }

        @Override // com.google.android.gms.internal.AbstractC6928ey
        /* renamed from: a */
        public void mo15908a(Status status, GetClientTokenResponse getClientTokenResponse, Bundle bundle) {
        }

        @Override // com.google.android.gms.internal.AbstractC6928ey
        /* renamed from: a */
        public void mo15907a(Status status, GetInstrumentsResponse getInstrumentsResponse, Bundle bundle) {
        }

        @Override // com.google.android.gms.internal.AbstractC6928ey
        /* renamed from: a */
        public void mo15901a(Status status, boolean z, Bundle bundle) {
        }

        @Override // com.google.android.gms.internal.AbstractC6928ey
        /* renamed from: b */
        public void mo15900b(int i, boolean z, Bundle bundle) {
        }

        @Override // com.google.android.gms.internal.AbstractC6928ey
        /* renamed from: b */
        public void mo15906b(Status status, Bundle bundle) {
        }
    }

    /* renamed from: com.google.android.gms.internal.fa$b */
    /* loaded from: classes2.dex */
    private static class BinderC6944b extends BinderC6943a {

        /* renamed from: a */
        private final ahl.AbstractC6344b<C4487e> f23340a;

        public BinderC6944b(ahl.AbstractC6344b<C4487e> abstractC6344b) {
            super();
            this.f23340a = abstractC6344b;
        }

        @Override // com.google.android.gms.internal.C6941fa.BinderC6943a, com.google.android.gms.internal.AbstractC6928ey
        /* renamed from: a */
        public void mo15901a(Status status, boolean z, Bundle bundle) {
            this.f23340a.mo7413a(new C4487e(status, z));
        }
    }

    /* renamed from: com.google.android.gms.internal.fa$c */
    /* loaded from: classes2.dex */
    static final class BinderC6945c extends BinderC6943a {

        /* renamed from: a */
        private final WeakReference<Activity> f23341a;

        /* renamed from: b */
        private final int f23342b;

        public BinderC6945c(Context context, int i) {
            super();
            this.f23341a = new WeakReference<>((Activity) context);
            this.f23342b = i;
        }

        @Override // com.google.android.gms.internal.C6941fa.BinderC6943a, com.google.android.gms.internal.AbstractC6928ey
        /* renamed from: a */
        public void mo15905a(int i, Bundle bundle) {
            C4588d.m23626a(bundle, "Bundle should not be null");
            Activity activity = this.f23341a.get();
            if (activity == null) {
                Log.d("WalletClientImpl", "Ignoring onWalletObjectsCreated, Activity has gone");
                return;
            }
            ConnectionResult connectionResult = new ConnectionResult(i, (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT"));
            if (connectionResult.m24050a()) {
                try {
                    connectionResult.m24048a(activity, this.f23342b);
                    return;
                } catch (IntentSender.SendIntentException e) {
                    Log.w("WalletClientImpl", "Exception starting pending intent", e);
                    return;
                }
            }
            String valueOf = String.valueOf(connectionResult);
            Log.e("WalletClientImpl", new StringBuilder(String.valueOf(valueOf).length() + 75).append("Create Wallet Objects confirmation UI will not be shown connection result: ").append(valueOf).toString());
            Intent intent = new Intent();
            intent.putExtra(C9357e.f29589e, C9357e.f29601q);
            PendingIntent createPendingResult = activity.createPendingResult(this.f23342b, intent, 1073741824);
            if (createPendingResult == null) {
                Log.w("WalletClientImpl", "Null pending result returned for onWalletObjectsCreated");
                return;
            }
            try {
                createPendingResult.send(1);
            } catch (PendingIntent.CanceledException e2) {
                Log.w("WalletClientImpl", "Exception setting pending result", e2);
            }
        }

        @Override // com.google.android.gms.internal.C6941fa.BinderC6943a, com.google.android.gms.internal.AbstractC6928ey
        /* renamed from: a */
        public void mo15904a(int i, FullWallet fullWallet, Bundle bundle) {
            int i2;
            Activity activity = this.f23341a.get();
            if (activity == null) {
                Log.d("WalletClientImpl", "Ignoring onFullWalletLoaded, Activity has gone");
                return;
            }
            PendingIntent pendingIntent = null;
            if (bundle != null) {
                pendingIntent = (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT");
            }
            ConnectionResult connectionResult = new ConnectionResult(i, pendingIntent);
            if (connectionResult.m24050a()) {
                try {
                    connectionResult.m24048a(activity, this.f23342b);
                    return;
                } catch (IntentSender.SendIntentException e) {
                    Log.w("WalletClientImpl", "Exception starting pending intent", e);
                    return;
                }
            }
            Intent intent = new Intent();
            if (connectionResult.m24047b()) {
                i2 = -1;
                intent.putExtra(C9357e.f29588d, fullWallet);
            } else {
                i2 = i == 408 ? 0 : 1;
                intent.putExtra(C9357e.f29589e, i);
            }
            PendingIntent createPendingResult = activity.createPendingResult(this.f23342b, intent, 1073741824);
            if (createPendingResult == null) {
                Log.w("WalletClientImpl", "Null pending result returned for onFullWalletLoaded");
                return;
            }
            try {
                createPendingResult.send(i2);
            } catch (PendingIntent.CanceledException e2) {
                Log.w("WalletClientImpl", "Exception setting pending result", e2);
            }
        }

        @Override // com.google.android.gms.internal.C6941fa.BinderC6943a, com.google.android.gms.internal.AbstractC6928ey
        /* renamed from: a */
        public void mo15903a(int i, MaskedWallet maskedWallet, Bundle bundle) {
            int i2;
            Activity activity = this.f23341a.get();
            if (activity == null) {
                Log.d("WalletClientImpl", "Ignoring onMaskedWalletLoaded, Activity has gone");
                return;
            }
            PendingIntent pendingIntent = null;
            if (bundle != null) {
                pendingIntent = (PendingIntent) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_PENDING_INTENT");
            }
            ConnectionResult connectionResult = new ConnectionResult(i, pendingIntent);
            if (connectionResult.m24050a()) {
                try {
                    connectionResult.m24048a(activity, this.f23342b);
                    return;
                } catch (IntentSender.SendIntentException e) {
                    Log.w("WalletClientImpl", "Exception starting pending intent", e);
                    return;
                }
            }
            Intent intent = new Intent();
            if (connectionResult.m24047b()) {
                i2 = -1;
                intent.putExtra(C9357e.f29587c, maskedWallet);
            } else {
                i2 = i == 408 ? 0 : 1;
                intent.putExtra(C9357e.f29589e, i);
            }
            PendingIntent createPendingResult = activity.createPendingResult(this.f23342b, intent, 1073741824);
            if (createPendingResult == null) {
                Log.w("WalletClientImpl", "Null pending result returned for onMaskedWalletLoaded");
                return;
            }
            try {
                createPendingResult.send(i2);
            } catch (PendingIntent.CanceledException e2) {
                Log.w("WalletClientImpl", "Exception setting pending result", e2);
            }
        }

        @Override // com.google.android.gms.internal.C6941fa.BinderC6943a, com.google.android.gms.internal.AbstractC6928ey
        /* renamed from: a */
        public void mo15902a(int i, boolean z, Bundle bundle) {
            Activity activity = this.f23341a.get();
            if (activity == null) {
                Log.d("WalletClientImpl", "Ignoring onPreAuthorizationDetermined, Activity has gone");
                return;
            }
            Intent intent = new Intent();
            intent.putExtra(C9357e.f29586b, z);
            PendingIntent createPendingResult = activity.createPendingResult(this.f23342b, intent, 1073741824);
            if (createPendingResult == null) {
                Log.w("WalletClientImpl", "Null pending result returned for onPreAuthorizationDetermined");
                return;
            }
            try {
                createPendingResult.send(-1);
            } catch (PendingIntent.CanceledException e) {
                Log.w("WalletClientImpl", "Exception setting pending result", e);
            }
        }

        @Override // com.google.android.gms.internal.C6941fa.BinderC6943a, com.google.android.gms.internal.AbstractC6928ey
        /* renamed from: a */
        public void mo15901a(Status status, boolean z, Bundle bundle) {
            Activity activity = this.f23341a.get();
            if (activity == null) {
                Log.d("WalletClientImpl", "Ignoring onIsReadyToPayDetermined, Activity has gone");
                return;
            }
            Intent intent = new Intent();
            intent.putExtra(C9357e.f29592h, z);
            PendingIntent createPendingResult = activity.createPendingResult(this.f23342b, intent, 1073741824);
            if (createPendingResult == null) {
                Log.w("WalletClientImpl", "Null pending result returned for onIsReadyToPayDetermined");
                return;
            }
            try {
                createPendingResult.send(-1);
            } catch (PendingIntent.CanceledException e) {
                Log.w("WalletClientImpl", "Exception setting pending result in onIsReadyToPayDetermined", e);
            }
        }

        @Override // com.google.android.gms.internal.C6941fa.BinderC6943a, com.google.android.gms.internal.AbstractC6928ey
        /* renamed from: b */
        public void mo15900b(int i, boolean z, Bundle bundle) {
            Activity activity = this.f23341a.get();
            if (activity == null) {
                Log.d("WalletClientImpl", "Ignoring onIsNewUserDetermined, Activity has gone");
                return;
            }
            Intent intent = new Intent();
            intent.putExtra(C9357e.f29591g, z);
            PendingIntent createPendingResult = activity.createPendingResult(this.f23342b, intent, 1073741824);
            if (createPendingResult == null) {
                Log.w("WalletClientImpl", "Null pending result returned for onIsNewUserDetermined");
                return;
            }
            try {
                createPendingResult.send(-1);
            } catch (PendingIntent.CanceledException e) {
                Log.w("WalletClientImpl", "Exception setting pending result", e);
            }
        }
    }

    public C6941fa(Context context, Looper looper, C4626s c4626s, AbstractC4489g.AbstractC4491b abstractC4491b, AbstractC4489g.AbstractC4492c abstractC4492c, int i, int i2, boolean z) {
        super(context, looper, 4, c4626s, abstractC4491b, abstractC4492c);
        this.f23335a = context;
        this.f23336e = i;
        this.f23337f = c4626s.m23537a();
        this.f23338g = i2;
        this.f23339h = z;
    }

    /* renamed from: a */
    public static Bundle m15920a(int i, String str, String str2, int i2, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", i);
        bundle.putBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", z);
        bundle.putString("androidPackageName", str);
        if (!TextUtils.isEmpty(str2)) {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(str2, "com.google"));
        }
        bundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", i2);
        return bundle;
    }

    /* renamed from: h */
    private Bundle m15911h() {
        return m15920a(this.f23336e, this.f23335a.getPackageName(), this.f23337f, this.f23338g, this.f23339h);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: H */
    public boolean mo15921H() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    public AbstractC6919ev mo7440b(IBinder iBinder) {
        return AbstractC6919ev.AbstractBinderC6920a.m15945a(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: a */
    protected String mo7443a() {
        return "com.google.android.gms.wallet.service.BIND";
    }

    /* renamed from: a */
    public void m15918a(FullWalletRequest fullWalletRequest, int i) {
        BinderC6945c binderC6945c = new BinderC6945c(this.f23335a, i);
        try {
            ((AbstractC6919ev) G()).mo15941a(fullWalletRequest, m15911h(), binderC6945c);
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException getting full wallet", e);
            binderC6945c.mo15904a(8, (FullWallet) null, Bundle.EMPTY);
        }
    }

    /* renamed from: a */
    public void m15917a(IsReadyToPayRequest isReadyToPayRequest, ahl.AbstractC6344b<C4487e> abstractC6344b) {
        BinderC6944b binderC6944b = new BinderC6944b(abstractC6344b);
        try {
            ((AbstractC6919ev) G()).mo15940a(isReadyToPayRequest, m15911h(), binderC6944b);
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e);
            binderC6944b.mo15901a(Status.f16788c, false, Bundle.EMPTY);
        }
    }

    /* renamed from: a */
    public void m15916a(MaskedWalletRequest maskedWalletRequest, int i) {
        Bundle m15911h = m15911h();
        BinderC6945c binderC6945c = new BinderC6945c(this.f23335a, i);
        try {
            ((AbstractC6919ev) G()).mo15938a(maskedWalletRequest, m15911h, binderC6945c);
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException getting masked wallet", e);
            binderC6945c.mo15903a(8, (MaskedWallet) null, Bundle.EMPTY);
        }
    }

    /* renamed from: a */
    public void m15915a(NotifyTransactionStatusRequest notifyTransactionStatusRequest) {
        try {
            ((AbstractC6919ev) G()).mo15937a(notifyTransactionStatusRequest, m15911h());
        } catch (RemoteException e) {
        }
    }

    /* renamed from: a */
    public void m15914a(String str, String str2, int i) {
        Bundle m15911h = m15911h();
        BinderC6945c binderC6945c = new BinderC6945c(this.f23335a, i);
        try {
            ((AbstractC6919ev) G()).mo15931a(str, str2, m15911h, binderC6945c);
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException changing masked wallet", e);
            binderC6945c.mo15903a(8, (MaskedWallet) null, Bundle.EMPTY);
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC4600p
    /* renamed from: b */
    protected String mo7441b() {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    /* renamed from: c */
    public void m15913c(int i) {
        Bundle m15911h = m15911h();
        BinderC6945c binderC6945c = new BinderC6945c(this.f23335a, i);
        try {
            ((AbstractC6919ev) G()).mo15943a(m15911h, binderC6945c);
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException during checkForPreAuthorization", e);
            binderC6945c.mo15902a(8, false, Bundle.EMPTY);
        }
    }

    /* renamed from: d */
    public void m15912d(int i) {
        Bundle m15911h = m15911h();
        BinderC6945c binderC6945c = new BinderC6945c(this.f23335a, i);
        try {
            ((AbstractC6919ev) G()).mo15929b(m15911h, binderC6945c);
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException during isNewUser", e);
            binderC6945c.mo15900b(8, false, Bundle.EMPTY);
        }
    }
}
