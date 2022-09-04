package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.support.p001v4.app.FragmentActivity;
import android.support.p001v4.app.LoaderManager;
import android.support.p001v4.content.Loader;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.auth.api.signin.AbstractC4044a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.Status;
@KeepName
/* loaded from: classes.dex */
public class SignInHubActivity extends FragmentActivity {

    /* renamed from: a */
    private C4073j f15554a;

    /* renamed from: b */
    private SignInConfiguration f15555b;

    /* renamed from: c */
    private boolean f15556c;

    /* renamed from: d */
    private int f15557d;

    /* renamed from: e */
    private Intent f15558e;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.auth.api.signin.internal.SignInHubActivity$a */
    /* loaded from: classes.dex */
    public class C4051a implements LoaderManager.LoaderCallbacks<Void> {
        private C4051a() {
        }

        @Override // android.support.p001v4.app.LoaderManager.LoaderCallbacks
        /* renamed from: a */
        public void onLoadFinished(Loader<Void> loader, Void r5) {
            SignInHubActivity.this.setResult(SignInHubActivity.this.f15557d, SignInHubActivity.this.f15558e);
            SignInHubActivity.this.finish();
        }

        @Override // android.support.p001v4.app.LoaderManager.LoaderCallbacks
        public Loader<Void> onCreateLoader(int i, Bundle bundle) {
            return new zzb(SignInHubActivity.this, AbstractC4489g.m23980a());
        }

        @Override // android.support.p001v4.app.LoaderManager.LoaderCallbacks
        public void onLoaderReset(Loader<Void> loader) {
        }
    }

    /* renamed from: a */
    private void m25624a() {
        getSupportLoaderManager().initLoader(0, null, new C4051a());
    }

    /* renamed from: a */
    private void m25623a(int i) {
        Status status = new Status(i);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
    }

    /* renamed from: a */
    private void m25622a(int i, Intent intent) {
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra(AbstractC4044a.f15546a);
            if (signInAccount != null && signInAccount.m25639a() != null) {
                GoogleSignInAccount m25639a = signInAccount.m25639a();
                this.f15554a.m25577b(m25639a, this.f15555b.m25625b());
                intent.removeExtra(AbstractC4044a.f15546a);
                intent.putExtra("googleSignInAccount", m25639a);
                this.f15556c = true;
                this.f15557d = i;
                this.f15558e = intent;
                m25624a();
                return;
            } else if (intent.hasExtra("errorCode")) {
                m25623a(intent.getIntExtra("errorCode", 8));
                return;
            }
        }
        m25623a(8);
    }

    /* renamed from: a */
    private void m25621a(Intent intent) {
        intent.setPackage("com.google.android.gms");
        intent.putExtra("config", this.f15555b);
        try {
            startActivityForResult(intent, 40962);
        } catch (ActivityNotFoundException e) {
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            m25623a(8);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        setResult(0);
        switch (i) {
            case 40962:
                m25622a(i2, intent);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f15554a = C4073j.m25582a(this);
        Intent intent = getIntent();
        if (!"com.google.android.gms.auth.GOOGLE_SIGN_IN".equals(intent.getAction())) {
            String valueOf = String.valueOf(intent.getAction());
            Log.e("AuthSignInClient", valueOf.length() != 0 ? "Unknown action: ".concat(valueOf) : new String("Unknown action: "));
            finish();
        }
        this.f15555b = (SignInConfiguration) intent.getParcelableExtra("config");
        if (this.f15555b == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
        } else if (bundle == null) {
            m25621a(new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN"));
        } else {
            this.f15556c = bundle.getBoolean("signingInGoogleApiClients");
            if (!this.f15556c) {
                return;
            }
            this.f15557d = bundle.getInt("signInResultCode");
            this.f15558e = (Intent) bundle.getParcelable("signInResultData");
            m25624a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p001v4.app.FragmentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f15556c);
        if (this.f15556c) {
            bundle.putInt("signInResultCode", this.f15557d);
            bundle.putParcelable("signInResultData", this.f15558e);
        }
    }
}
