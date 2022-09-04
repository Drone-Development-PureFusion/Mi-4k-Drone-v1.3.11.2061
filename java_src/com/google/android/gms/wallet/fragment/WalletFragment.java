package com.google.android.gms.wallet.fragment;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.gms.C3424R;
import com.google.android.gms.common.C4516c;
import com.google.android.gms.common.C4536e;
import com.google.android.gms.internal.AbstractC6913et;
import com.google.android.gms.internal.AbstractC6916eu;
import com.google.android.gms.internal.C6946fb;
import com.google.android.gms.p232c.AbstractC4156a;
import com.google.android.gms.p232c.AbstractC4157b;
import com.google.android.gms.p232c.AbstractC4174g;
import com.google.android.gms.p232c.BinderC4166c;
import com.google.android.gms.p232c.BinderC4173f;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;
@TargetApi(12)
/* loaded from: classes2.dex */
public final class WalletFragment extends Fragment {

    /* renamed from: a */
    private C9378c f29656a;

    /* renamed from: b */
    private boolean f29657b = false;

    /* renamed from: c */
    private final BinderC4166c f29658c = BinderC4166c.m25297a(this);

    /* renamed from: d */
    private final View$OnClickListenerC9379d f29659d = new View$OnClickListenerC9379d();

    /* renamed from: e */
    private BinderC9377b f29660e = new BinderC9377b(this);

    /* renamed from: f */
    private final Fragment f29661f = this;

    /* renamed from: g */
    private WalletFragmentOptions f29662g;

    /* renamed from: h */
    private WalletFragmentInitParams f29663h;

    /* renamed from: i */
    private MaskedWalletRequest f29664i;

    /* renamed from: j */
    private MaskedWallet f29665j;

    /* renamed from: k */
    private Boolean f29666k;

    /* renamed from: com.google.android.gms.wallet.fragment.WalletFragment$a */
    /* loaded from: classes2.dex */
    public interface AbstractC9376a {
        /* renamed from: a */
        void m8333a(WalletFragment walletFragment, int i, int i2, Bundle bundle);
    }

    /* renamed from: com.google.android.gms.wallet.fragment.WalletFragment$b */
    /* loaded from: classes2.dex */
    static class BinderC9377b extends AbstractC6916eu.AbstractBinderC6917a {

        /* renamed from: a */
        private AbstractC9376a f29667a;

        /* renamed from: b */
        private final WalletFragment f29668b;

        BinderC9377b(WalletFragment walletFragment) {
            this.f29668b = walletFragment;
        }

        @Override // com.google.android.gms.internal.AbstractC6916eu
        /* renamed from: a */
        public void mo8332a(int i, int i2, Bundle bundle) {
            if (this.f29667a != null) {
                this.f29667a.m8333a(this.f29668b, i, i2, bundle);
            }
        }

        /* renamed from: a */
        public void m8331a(AbstractC9376a abstractC9376a) {
            this.f29667a = abstractC9376a;
        }
    }

    /* renamed from: com.google.android.gms.wallet.fragment.WalletFragment$c */
    /* loaded from: classes2.dex */
    private static class C9378c implements AbstractC4156a {

        /* renamed from: a */
        private final AbstractC6913et f29669a;

        private C9378c(AbstractC6913et abstractC6913et) {
            this.f29669a = abstractC6913et;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m8329a(int i, int i2, Intent intent) {
            try {
                this.f29669a.mo15959a(i, i2, intent);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m8325a(MaskedWallet maskedWallet) {
            try {
                this.f29669a.mo15955a(maskedWallet);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m8324a(MaskedWalletRequest maskedWalletRequest) {
            try {
                this.f29669a.mo15954a(maskedWalletRequest);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m8317a(WalletFragmentInitParams walletFragmentInitParams) {
            try {
                this.f29669a.mo15953a(walletFragmentInitParams);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m8316a(boolean z) {
            try {
                this.f29669a.mo15952a(z);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public int m8308h() {
            try {
                return this.f29669a.mo15947e();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: a */
        public View mo8326a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            try {
                return (View) BinderC4173f.m25294a(this.f29669a.mo15957a(BinderC4173f.m25293a(layoutInflater), BinderC4173f.m25293a(viewGroup), bundle));
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: a */
        public void mo8330a() {
            try {
                this.f29669a.mo15960a();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: a */
        public void mo8328a(Activity activity, Bundle bundle, Bundle bundle2) {
            try {
                this.f29669a.mo15956a(BinderC4173f.m25293a(activity), (WalletFragmentOptions) bundle.getParcelable("extraWalletFragmentOptions"), bundle2);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: a */
        public void mo8327a(Bundle bundle) {
            try {
                this.f29669a.mo15958a(bundle);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: b */
        public void mo8315b() {
            try {
                this.f29669a.mo15951b();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: b */
        public void mo8314b(Bundle bundle) {
            try {
                this.f29669a.mo15950b(bundle);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: c */
        public void mo8313c() {
            try {
                this.f29669a.mo15949c();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: d */
        public void mo8312d() {
            try {
                this.f29669a.mo15948d();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: e */
        public void mo8311e() {
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: f */
        public void mo8310f() {
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: g */
        public void mo8309g() {
        }
    }

    /* renamed from: com.google.android.gms.wallet.fragment.WalletFragment$d */
    /* loaded from: classes2.dex */
    private class View$OnClickListenerC9379d extends AbstractC4157b<C9378c> implements View.OnClickListener {
        private View$OnClickListenerC9379d() {
        }

        @Override // com.google.android.gms.p232c.AbstractC4157b
        /* renamed from: a */
        protected void mo8307a(FrameLayout frameLayout) {
            WalletFragmentStyle m8279d;
            int i = -1;
            int i2 = -2;
            Button button = new Button(WalletFragment.this.f29661f.getActivity());
            button.setText(C3424R.C3427string.wallet_buy_button_place_holder);
            if (WalletFragment.this.f29662g != null && (m8279d = WalletFragment.this.f29662g.m8279d()) != null) {
                DisplayMetrics displayMetrics = WalletFragment.this.f29661f.getResources().getDisplayMetrics();
                i = m8279d.m8263a("buyButtonWidth", displayMetrics, -1);
                i2 = m8279d.m8263a("buyButtonHeight", displayMetrics, -2);
            }
            button.setLayoutParams(new ViewGroup.LayoutParams(i, i2));
            button.setOnClickListener(this);
            frameLayout.addView(button);
        }

        @Override // com.google.android.gms.p232c.AbstractC4157b
        /* renamed from: a */
        protected void mo8306a(AbstractC4174g<C9378c> abstractC4174g) {
            Activity activity = WalletFragment.this.f29661f.getActivity();
            if (WalletFragment.this.f29656a != null || !WalletFragment.this.f29657b || activity == null) {
                return;
            }
            try {
                AbstractC6913et m15898a = C6946fb.m15898a(activity, WalletFragment.this.f29658c, WalletFragment.this.f29662g, WalletFragment.this.f29660e);
                WalletFragment.this.f29656a = new C9378c(m15898a);
                WalletFragment.this.f29662g = null;
                abstractC4174g.mo25292a(WalletFragment.this.f29656a);
                if (WalletFragment.this.f29663h != null) {
                    WalletFragment.this.f29656a.m8317a(WalletFragment.this.f29663h);
                    WalletFragment.this.f29663h = null;
                }
                if (WalletFragment.this.f29664i != null) {
                    WalletFragment.this.f29656a.m8324a(WalletFragment.this.f29664i);
                    WalletFragment.this.f29664i = null;
                }
                if (WalletFragment.this.f29665j != null) {
                    WalletFragment.this.f29656a.m8325a(WalletFragment.this.f29665j);
                    WalletFragment.this.f29665j = null;
                }
                if (WalletFragment.this.f29666k == null) {
                    return;
                }
                WalletFragment.this.f29656a.m8316a(WalletFragment.this.f29666k.booleanValue());
                WalletFragment.this.f29666k = null;
            } catch (C4516c e) {
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Activity activity = WalletFragment.this.f29661f.getActivity();
            C4536e.m23812b(C4536e.m23815a((Context) activity), activity, -1);
        }
    }

    /* renamed from: a */
    public static WalletFragment m8344a(WalletFragmentOptions walletFragmentOptions) {
        WalletFragment walletFragment = new WalletFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("extraWalletFragmentOptions", walletFragmentOptions);
        walletFragment.f29661f.setArguments(bundle);
        return walletFragment;
    }

    /* renamed from: a */
    public int m8356a() {
        if (this.f29656a != null) {
            return this.f29656a.m8308h();
        }
        return 0;
    }

    /* renamed from: a */
    public void m8355a(MaskedWallet maskedWallet) {
        if (this.f29656a == null) {
            this.f29665j = maskedWallet;
            return;
        }
        this.f29656a.m8325a(maskedWallet);
        this.f29665j = null;
    }

    /* renamed from: a */
    public void m8354a(MaskedWalletRequest maskedWalletRequest) {
        if (this.f29656a == null) {
            this.f29664i = maskedWalletRequest;
            return;
        }
        this.f29656a.m8324a(maskedWalletRequest);
        this.f29664i = null;
    }

    /* renamed from: a */
    public void m8353a(AbstractC9376a abstractC9376a) {
        this.f29660e.m8331a(abstractC9376a);
    }

    /* renamed from: a */
    public void m8345a(WalletFragmentInitParams walletFragmentInitParams) {
        if (this.f29656a != null) {
            this.f29656a.m8317a(walletFragmentInitParams);
            this.f29663h = null;
        } else if (this.f29663h != null) {
            Log.w("WalletFragment", "initialize(WalletFragmentInitParams) was called more than once. Ignoring.");
        } else {
            this.f29663h = walletFragmentInitParams;
            if (this.f29664i != null) {
                Log.w("WalletFragment", "updateMaskedWalletRequest() was called before initialize()");
            }
            if (this.f29665j == null) {
                return;
            }
            Log.w("WalletFragment", "updateMaskedWallet() was called before initialize()");
        }
    }

    /* renamed from: a */
    public void m8343a(boolean z) {
        if (this.f29656a == null) {
            this.f29666k = Boolean.valueOf(z);
            return;
        }
        this.f29656a.m8316a(z);
        this.f29666k = null;
    }

    @Override // android.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.f29656a != null) {
            this.f29656a.m8329a(i, i2, intent);
        }
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        WalletFragmentOptions walletFragmentOptions;
        super.onCreate(bundle);
        if (bundle != null) {
            bundle.setClassLoader(WalletFragmentOptions.class.getClassLoader());
            WalletFragmentInitParams walletFragmentInitParams = (WalletFragmentInitParams) bundle.getParcelable("walletFragmentInitParams");
            if (walletFragmentInitParams != null) {
                if (this.f29663h != null) {
                    Log.w("WalletFragment", "initialize(WalletFragmentInitParams) was called more than once.Ignoring.");
                }
                this.f29663h = walletFragmentInitParams;
            }
            if (this.f29664i == null) {
                this.f29664i = (MaskedWalletRequest) bundle.getParcelable("maskedWalletRequest");
            }
            if (this.f29665j == null) {
                this.f29665j = (MaskedWallet) bundle.getParcelable("maskedWallet");
            }
            if (bundle.containsKey("walletFragmentOptions")) {
                this.f29662g = (WalletFragmentOptions) bundle.getParcelable("walletFragmentOptions");
            }
            if (bundle.containsKey("enabled")) {
                this.f29666k = Boolean.valueOf(bundle.getBoolean("enabled"));
            }
        } else if (this.f29661f.getArguments() != null && (walletFragmentOptions = (WalletFragmentOptions) this.f29661f.getArguments().getParcelable("extraWalletFragmentOptions")) != null) {
            walletFragmentOptions.m8287a(this.f29661f.getActivity());
            this.f29662g = walletFragmentOptions;
        }
        this.f29657b = true;
        this.f29659d.a(bundle);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f29659d.a(layoutInflater, viewGroup, bundle);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f29657b = false;
    }

    @Override // android.app.Fragment
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(activity, attributeSet, bundle);
        if (this.f29662g == null) {
            this.f29662g = WalletFragmentOptions.m8286a(activity, attributeSet);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("attrKeyWalletFragmentOptions", this.f29662g);
        this.f29659d.a(activity, bundle2, bundle);
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        this.f29659d.d();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        this.f29659d.c();
        FragmentManager fragmentManager = this.f29661f.getActivity().getFragmentManager();
        Fragment findFragmentByTag = fragmentManager.findFragmentByTag(C4536e.f16916a);
        if (findFragmentByTag != null) {
            fragmentManager.beginTransaction().remove(findFragmentByTag).commit();
            C4536e.m23812b(C4536e.m23815a((Context) this.f29661f.getActivity()), this.f29661f.getActivity(), -1);
        }
    }

    @Override // android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.setClassLoader(WalletFragmentOptions.class.getClassLoader());
        this.f29659d.b(bundle);
        if (this.f29663h != null) {
            bundle.putParcelable("walletFragmentInitParams", this.f29663h);
            this.f29663h = null;
        }
        if (this.f29664i != null) {
            bundle.putParcelable("maskedWalletRequest", this.f29664i);
            this.f29664i = null;
        }
        if (this.f29665j != null) {
            bundle.putParcelable("maskedWallet", this.f29665j);
            this.f29665j = null;
        }
        if (this.f29662g != null) {
            bundle.putParcelable("walletFragmentOptions", this.f29662g);
            this.f29662g = null;
        }
        if (this.f29666k != null) {
            bundle.putBoolean("enabled", this.f29666k.booleanValue());
            this.f29666k = null;
        }
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f29659d.b();
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.f29659d.e();
    }
}
