package com.google.android.gms.wallet.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.p001v4.app.Fragment;
import android.support.p001v4.app.FragmentActivity;
import android.support.p001v4.app.FragmentManager;
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
import com.google.android.gms.p232c.BinderC4173f;
import com.google.android.gms.p232c.BinderC4177i;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;
/* loaded from: classes2.dex */
public final class SupportWalletFragment extends Fragment {

    /* renamed from: a */
    private C9373c f29641a;

    /* renamed from: b */
    private boolean f29642b = false;

    /* renamed from: c */
    private final BinderC4177i f29643c = BinderC4177i.m25287a(this);

    /* renamed from: d */
    private final View$OnClickListenerC9374d f29644d = new View$OnClickListenerC9374d();

    /* renamed from: e */
    private BinderC9372b f29645e = new BinderC9372b(this);

    /* renamed from: f */
    private final Fragment f29646f = this;

    /* renamed from: g */
    private WalletFragmentOptions f29647g;

    /* renamed from: h */
    private WalletFragmentInitParams f29648h;

    /* renamed from: i */
    private MaskedWalletRequest f29649i;

    /* renamed from: j */
    private MaskedWallet f29650j;

    /* renamed from: k */
    private Boolean f29651k;

    /* renamed from: com.google.android.gms.wallet.fragment.SupportWalletFragment$a */
    /* loaded from: classes2.dex */
    public interface AbstractC9371a {
        /* renamed from: a */
        void m8370a(SupportWalletFragment supportWalletFragment, int i, int i2, Bundle bundle);
    }

    /* renamed from: com.google.android.gms.wallet.fragment.SupportWalletFragment$b */
    /* loaded from: classes2.dex */
    static class BinderC9372b extends AbstractC6916eu.AbstractBinderC6917a {

        /* renamed from: a */
        private AbstractC9371a f29652a;

        /* renamed from: b */
        private final SupportWalletFragment f29653b;

        BinderC9372b(SupportWalletFragment supportWalletFragment) {
            this.f29653b = supportWalletFragment;
        }

        @Override // com.google.android.gms.internal.AbstractC6916eu
        /* renamed from: a */
        public void mo8332a(int i, int i2, Bundle bundle) {
            if (this.f29652a != null) {
                this.f29652a.m8370a(this.f29653b, i, i2, bundle);
            }
        }

        /* renamed from: a */
        public void m8369a(AbstractC9371a abstractC9371a) {
            this.f29652a = abstractC9371a;
        }
    }

    /* renamed from: com.google.android.gms.wallet.fragment.SupportWalletFragment$c */
    /* loaded from: classes2.dex */
    private static class C9373c implements AbstractC4156a {

        /* renamed from: a */
        private final AbstractC6913et f29654a;

        private C9373c(AbstractC6913et abstractC6913et) {
            this.f29654a = abstractC6913et;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m8368a(int i, int i2, Intent intent) {
            try {
                this.f29654a.mo15959a(i, i2, intent);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m8367a(MaskedWallet maskedWallet) {
            try {
                this.f29654a.mo15955a(maskedWallet);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m8366a(MaskedWalletRequest maskedWalletRequest) {
            try {
                this.f29654a.mo15954a(maskedWalletRequest);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m8359a(WalletFragmentInitParams walletFragmentInitParams) {
            try {
                this.f29654a.mo15953a(walletFragmentInitParams);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m8358a(boolean z) {
            try {
                this.f29654a.mo15952a(z);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public int m8357h() {
            try {
                return this.f29654a.mo15947e();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: a */
        public View mo8326a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            try {
                return (View) BinderC4173f.m25294a(this.f29654a.mo15957a(BinderC4173f.m25293a(layoutInflater), BinderC4173f.m25293a(viewGroup), bundle));
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: a */
        public void mo8330a() {
            try {
                this.f29654a.mo15960a();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: a */
        public void mo8328a(Activity activity, Bundle bundle, Bundle bundle2) {
            try {
                this.f29654a.mo15956a(BinderC4173f.m25293a(activity), (WalletFragmentOptions) bundle.getParcelable("extraWalletFragmentOptions"), bundle2);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: a */
        public void mo8327a(Bundle bundle) {
            try {
                this.f29654a.mo15958a(bundle);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: b */
        public void mo8315b() {
            try {
                this.f29654a.mo15951b();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: b */
        public void mo8314b(Bundle bundle) {
            try {
                this.f29654a.mo15950b(bundle);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: c */
        public void mo8313c() {
            try {
                this.f29654a.mo15949c();
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: d */
        public void mo8312d() {
            try {
                this.f29654a.mo15948d();
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

    /* renamed from: com.google.android.gms.wallet.fragment.SupportWalletFragment$d */
    /* loaded from: classes2.dex */
    private class View$OnClickListenerC9374d extends AbstractC4157b<C9373c> implements View.OnClickListener {
        private View$OnClickListenerC9374d() {
        }

        @Override // com.google.android.gms.p232c.AbstractC4157b
        /* renamed from: a */
        protected void mo8307a(FrameLayout frameLayout) {
            WalletFragmentStyle m8279d;
            int i = -1;
            int i2 = -2;
            Button button = new Button(SupportWalletFragment.this.f29646f.getActivity());
            button.setText(C3424R.C3427string.wallet_buy_button_place_holder);
            if (SupportWalletFragment.this.f29647g != null && (m8279d = SupportWalletFragment.this.f29647g.m8279d()) != null) {
                DisplayMetrics displayMetrics = SupportWalletFragment.this.f29646f.getResources().getDisplayMetrics();
                i = m8279d.m8263a("buyButtonWidth", displayMetrics, -1);
                i2 = m8279d.m8263a("buyButtonHeight", displayMetrics, -2);
            }
            button.setLayoutParams(new ViewGroup.LayoutParams(i, i2));
            button.setOnClickListener(this);
            frameLayout.addView(button);
        }

        @Override // com.google.android.gms.p232c.AbstractC4157b
        /* renamed from: a */
        protected void mo8306a(AbstractC4174g<C9373c> abstractC4174g) {
            FragmentActivity activity = SupportWalletFragment.this.f29646f.getActivity();
            if (SupportWalletFragment.this.f29641a != null || !SupportWalletFragment.this.f29642b || activity == null) {
                return;
            }
            try {
                AbstractC6913et m15898a = C6946fb.m15898a(activity, SupportWalletFragment.this.f29643c, SupportWalletFragment.this.f29647g, SupportWalletFragment.this.f29645e);
                SupportWalletFragment.this.f29641a = new C9373c(m15898a);
                SupportWalletFragment.this.f29647g = null;
                abstractC4174g.mo25292a(SupportWalletFragment.this.f29641a);
                if (SupportWalletFragment.this.f29648h != null) {
                    SupportWalletFragment.this.f29641a.m8359a(SupportWalletFragment.this.f29648h);
                    SupportWalletFragment.this.f29648h = null;
                }
                if (SupportWalletFragment.this.f29649i != null) {
                    SupportWalletFragment.this.f29641a.m8366a(SupportWalletFragment.this.f29649i);
                    SupportWalletFragment.this.f29649i = null;
                }
                if (SupportWalletFragment.this.f29650j != null) {
                    SupportWalletFragment.this.f29641a.m8367a(SupportWalletFragment.this.f29650j);
                    SupportWalletFragment.this.f29650j = null;
                }
                if (SupportWalletFragment.this.f29651k == null) {
                    return;
                }
                SupportWalletFragment.this.f29641a.m8358a(SupportWalletFragment.this.f29651k.booleanValue());
                SupportWalletFragment.this.f29651k = null;
            } catch (C4516c e) {
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FragmentActivity activity = SupportWalletFragment.this.f29646f.getActivity();
            C4536e.m23812b(C4536e.m23815a((Context) activity), (Activity) activity, -1);
        }
    }

    /* renamed from: a */
    public static SupportWalletFragment m8381a(WalletFragmentOptions walletFragmentOptions) {
        SupportWalletFragment supportWalletFragment = new SupportWalletFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("extraWalletFragmentOptions", walletFragmentOptions);
        supportWalletFragment.f29646f.setArguments(bundle);
        return supportWalletFragment;
    }

    /* renamed from: a */
    public int m8393a() {
        if (this.f29641a != null) {
            return this.f29641a.m8357h();
        }
        return 0;
    }

    /* renamed from: a */
    public void m8392a(MaskedWallet maskedWallet) {
        if (this.f29641a == null) {
            this.f29650j = maskedWallet;
            return;
        }
        this.f29641a.m8367a(maskedWallet);
        this.f29650j = null;
    }

    /* renamed from: a */
    public void m8391a(MaskedWalletRequest maskedWalletRequest) {
        if (this.f29641a == null) {
            this.f29649i = maskedWalletRequest;
            return;
        }
        this.f29641a.m8366a(maskedWalletRequest);
        this.f29649i = null;
    }

    /* renamed from: a */
    public void m8390a(AbstractC9371a abstractC9371a) {
        this.f29645e.m8369a(abstractC9371a);
    }

    /* renamed from: a */
    public void m8382a(WalletFragmentInitParams walletFragmentInitParams) {
        if (this.f29641a != null) {
            this.f29641a.m8359a(walletFragmentInitParams);
            this.f29648h = null;
        } else if (this.f29648h != null) {
            Log.w("SupportWalletFragment", "initialize(WalletFragmentInitParams) was called more than once. Ignoring.");
        } else {
            this.f29648h = walletFragmentInitParams;
            if (this.f29649i != null) {
                Log.w("SupportWalletFragment", "updateMaskedWalletRequest() was called before initialize()");
            }
            if (this.f29650j == null) {
                return;
            }
            Log.w("SupportWalletFragment", "updateMaskedWallet() was called before initialize()");
        }
    }

    /* renamed from: a */
    public void m8380a(boolean z) {
        if (this.f29641a == null) {
            this.f29651k = Boolean.valueOf(z);
            return;
        }
        this.f29641a.m8358a(z);
        this.f29651k = null;
    }

    @Override // android.support.p001v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.f29641a != null) {
            this.f29641a.m8368a(i, i2, intent);
        }
    }

    @Override // android.support.p001v4.app.Fragment
    public void onCreate(Bundle bundle) {
        WalletFragmentOptions walletFragmentOptions;
        super.onCreate(bundle);
        if (bundle != null) {
            bundle.setClassLoader(WalletFragmentOptions.class.getClassLoader());
            WalletFragmentInitParams walletFragmentInitParams = (WalletFragmentInitParams) bundle.getParcelable("walletFragmentInitParams");
            if (walletFragmentInitParams != null) {
                if (this.f29648h != null) {
                    Log.w("SupportWalletFragment", "initialize(WalletFragmentInitParams) was called more than once.Ignoring.");
                }
                this.f29648h = walletFragmentInitParams;
            }
            if (this.f29649i == null) {
                this.f29649i = (MaskedWalletRequest) bundle.getParcelable("maskedWalletRequest");
            }
            if (this.f29650j == null) {
                this.f29650j = (MaskedWallet) bundle.getParcelable("maskedWallet");
            }
            if (bundle.containsKey("walletFragmentOptions")) {
                this.f29647g = (WalletFragmentOptions) bundle.getParcelable("walletFragmentOptions");
            }
            if (bundle.containsKey("enabled")) {
                this.f29651k = Boolean.valueOf(bundle.getBoolean("enabled"));
            }
        } else if (this.f29646f.getArguments() != null && (walletFragmentOptions = (WalletFragmentOptions) this.f29646f.getArguments().getParcelable("extraWalletFragmentOptions")) != null) {
            walletFragmentOptions.m8287a(this.f29646f.getActivity());
            this.f29647g = walletFragmentOptions;
        }
        this.f29642b = true;
        this.f29644d.a(bundle);
    }

    @Override // android.support.p001v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f29644d.a(layoutInflater, viewGroup, bundle);
    }

    @Override // android.support.p001v4.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f29642b = false;
    }

    @Override // android.support.p001v4.app.Fragment
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(activity, attributeSet, bundle);
        if (this.f29647g == null) {
            this.f29647g = WalletFragmentOptions.m8286a(activity, attributeSet);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("attrKeyWalletFragmentOptions", this.f29647g);
        this.f29644d.a(activity, bundle2, bundle);
    }

    @Override // android.support.p001v4.app.Fragment
    public void onPause() {
        super.onPause();
        this.f29644d.d();
    }

    @Override // android.support.p001v4.app.Fragment
    public void onResume() {
        super.onResume();
        this.f29644d.c();
        FragmentManager supportFragmentManager = this.f29646f.getActivity().getSupportFragmentManager();
        Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(C4536e.f16916a);
        if (findFragmentByTag != null) {
            supportFragmentManager.beginTransaction().remove(findFragmentByTag).commit();
            C4536e.m23812b(C4536e.m23815a((Context) this.f29646f.getActivity()), (Activity) this.f29646f.getActivity(), -1);
        }
    }

    @Override // android.support.p001v4.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.setClassLoader(WalletFragmentOptions.class.getClassLoader());
        this.f29644d.b(bundle);
        if (this.f29648h != null) {
            bundle.putParcelable("walletFragmentInitParams", this.f29648h);
            this.f29648h = null;
        }
        if (this.f29649i != null) {
            bundle.putParcelable("maskedWalletRequest", this.f29649i);
            this.f29649i = null;
        }
        if (this.f29650j != null) {
            bundle.putParcelable("maskedWallet", this.f29650j);
            this.f29650j = null;
        }
        if (this.f29647g != null) {
            bundle.putParcelable("walletFragmentOptions", this.f29647g);
            this.f29647g = null;
        }
        if (this.f29651k != null) {
            bundle.putBoolean("enabled", this.f29651k.booleanValue());
            this.f29651k = null;
        }
    }

    @Override // android.support.p001v4.app.Fragment
    public void onStart() {
        super.onStart();
        this.f29644d.b();
    }

    @Override // android.support.p001v4.app.Fragment
    public void onStop() {
        super.onStop();
        this.f29644d.e();
    }
}
