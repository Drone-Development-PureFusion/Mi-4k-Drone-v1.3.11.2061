package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.p001v4.app.Fragment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.C4516c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.maps.model.C8618j;
import com.google.android.gms.maps.p247a.AbstractC8413ao;
import com.google.android.gms.maps.p247a.AbstractC8434b;
import com.google.android.gms.maps.p247a.AbstractC8440d;
import com.google.android.gms.maps.p247a.AbstractC8461k;
import com.google.android.gms.maps.p247a.C8485u;
import com.google.android.gms.maps.p247a.C8486v;
import com.google.android.gms.p232c.AbstractC4157b;
import com.google.android.gms.p232c.AbstractC4174g;
import com.google.android.gms.p232c.BinderC4173f;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class SupportMapFragment extends Fragment {

    /* renamed from: a */
    private final C8363b f27292a = new C8363b(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.maps.SupportMapFragment$a */
    /* loaded from: classes2.dex */
    public static class C8361a implements AbstractC8461k {

        /* renamed from: a */
        private final Fragment f27293a;

        /* renamed from: b */
        private final AbstractC8440d f27294b;

        public C8361a(Fragment fragment, AbstractC8440d abstractC8440d) {
            this.f27294b = (AbstractC8440d) C4588d.m23627a(abstractC8440d);
            this.f27293a = (Fragment) C4588d.m23627a(fragment);
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: a */
        public View mo8326a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            try {
                return (View) BinderC4173f.m25294a(this.f27294b.mo11755a(BinderC4173f.m25293a(layoutInflater), BinderC4173f.m25293a(viewGroup), bundle));
            } catch (RemoteException e) {
                throw new C8618j(e);
            }
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: a */
        public void mo8330a() {
            try {
                this.f27294b.mo11743i();
            } catch (RemoteException e) {
                throw new C8618j(e);
            }
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: a */
        public void mo8328a(Activity activity, Bundle bundle, Bundle bundle2) {
            try {
                this.f27294b.mo11754a(BinderC4173f.m25293a(activity), (GoogleMapOptions) bundle.getParcelable("MapOptions"), bundle2);
            } catch (RemoteException e) {
                throw new C8618j(e);
            }
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: a */
        public void mo8327a(Bundle bundle) {
            if (bundle == null) {
                try {
                    bundle = new Bundle();
                } catch (RemoteException e) {
                    throw new C8618j(e);
                }
            }
            Bundle arguments = this.f27293a.getArguments();
            if (arguments != null && arguments.containsKey("MapOptions")) {
                C8485u.m11647a(bundle, "MapOptions", arguments.getParcelable("MapOptions"));
            }
            this.f27294b.mo11756a(bundle);
        }

        @Override // com.google.android.gms.maps.p247a.AbstractC8461k
        /* renamed from: a */
        public void mo11659a(final AbstractC8554f abstractC8554f) {
            try {
                this.f27294b.mo11753a(new AbstractC8413ao.AbstractBinderC8414a() { // from class: com.google.android.gms.maps.SupportMapFragment.a.1
                    @Override // com.google.android.gms.maps.p247a.AbstractC8413ao
                    /* renamed from: a */
                    public void mo11842a(AbstractC8434b abstractC8434b) {
                        abstractC8554f.mo11486b(new C8500c(abstractC8434b));
                    }
                });
            } catch (RemoteException e) {
                throw new C8618j(e);
            }
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: b */
        public void mo8315b() {
            try {
                this.f27294b.mo11752b();
            } catch (RemoteException e) {
                throw new C8618j(e);
            }
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: b */
        public void mo8314b(Bundle bundle) {
            try {
                this.f27294b.mo11751b(bundle);
            } catch (RemoteException e) {
                throw new C8618j(e);
            }
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: c */
        public void mo8313c() {
            try {
                this.f27294b.mo11750c();
            } catch (RemoteException e) {
                throw new C8618j(e);
            }
        }

        /* renamed from: c */
        public void m11890c(Bundle bundle) {
            try {
                this.f27294b.mo11749c(bundle);
            } catch (RemoteException e) {
                throw new C8618j(e);
            }
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: d */
        public void mo8312d() {
            try {
                this.f27294b.mo11742j();
            } catch (RemoteException e) {
                throw new C8618j(e);
            }
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: e */
        public void mo8311e() {
            try {
                this.f27294b.mo11748d();
            } catch (RemoteException e) {
                throw new C8618j(e);
            }
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: f */
        public void mo8310f() {
            try {
                this.f27294b.mo11747e();
            } catch (RemoteException e) {
                throw new C8618j(e);
            }
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: g */
        public void mo8309g() {
            try {
                this.f27294b.mo11746f();
            } catch (RemoteException e) {
                throw new C8618j(e);
            }
        }

        /* renamed from: h */
        public void m11889h() {
            try {
                this.f27294b.mo11744h();
            } catch (RemoteException e) {
                throw new C8618j(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.maps.SupportMapFragment$b */
    /* loaded from: classes2.dex */
    public static class C8363b extends AbstractC4157b<C8361a> {

        /* renamed from: a */
        protected AbstractC4174g<C8361a> f27297a;

        /* renamed from: b */
        private final Fragment f27298b;

        /* renamed from: c */
        private Activity f27299c;

        /* renamed from: d */
        private final List<AbstractC8554f> f27300d = new ArrayList();

        C8363b(Fragment fragment) {
            this.f27298b = fragment;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m11888a(Activity activity) {
            this.f27299c = activity;
            m11884i();
        }

        @Override // com.google.android.gms.p232c.AbstractC4157b
        /* renamed from: a */
        protected void mo8306a(AbstractC4174g<C8361a> abstractC4174g) {
            this.f27297a = abstractC4174g;
            m11884i();
        }

        /* renamed from: a */
        public void m11886a(AbstractC8554f abstractC8554f) {
            if (a() != null) {
                a().mo11659a(abstractC8554f);
            } else {
                this.f27300d.add(abstractC8554f);
            }
        }

        /* renamed from: c */
        public void m11885c(Bundle bundle) {
            if (a() != null) {
                a().m11890c(bundle);
            }
        }

        /* renamed from: i */
        public void m11884i() {
            if (this.f27299c == null || this.f27297a == null || a() != null) {
                return;
            }
            try {
                C8553e.m11488a(this.f27299c);
                AbstractC8440d mo11630b = C8486v.m11645a(this.f27299c).mo11630b(BinderC4173f.m25293a(this.f27299c));
                if (mo11630b == null) {
                    return;
                }
                this.f27297a.mo25292a(new C8361a(this.f27298b, mo11630b));
                for (AbstractC8554f abstractC8554f : this.f27300d) {
                    a().mo11659a(abstractC8554f);
                }
                this.f27300d.clear();
            } catch (RemoteException e) {
                throw new C8618j(e);
            } catch (C4516c e2) {
            }
        }

        /* renamed from: j */
        public void m11883j() {
            if (a() != null) {
                a().m11889h();
            }
        }
    }

    /* renamed from: a */
    public static SupportMapFragment m11894a(GoogleMapOptions googleMapOptions) {
        SupportMapFragment supportMapFragment = new SupportMapFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("MapOptions", googleMapOptions);
        supportMapFragment.setArguments(bundle);
        return supportMapFragment;
    }

    /* renamed from: e */
    public static SupportMapFragment m11892e() {
        return new SupportMapFragment();
    }

    /* renamed from: a */
    public final void m11895a(Bundle bundle) {
        C4588d.m23620b("onEnterAmbient must be called on the main thread.");
        this.f27292a.m11885c(bundle);
    }

    /* renamed from: a */
    public void m11893a(AbstractC8554f abstractC8554f) {
        C4588d.m23620b("getMapAsync must be called on the main thread.");
        this.f27292a.m11886a(abstractC8554f);
    }

    /* renamed from: f */
    public final void m11891f() {
        C4588d.m23620b("onExitAmbient must be called on the main thread.");
        this.f27292a.m11883j();
    }

    @Override // android.support.p001v4.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportMapFragment.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    @Override // android.support.p001v4.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f27292a.m11888a(activity);
    }

    @Override // android.support.p001v4.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f27292a.a(bundle);
    }

    @Override // android.support.p001v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = this.f27292a.a(layoutInflater, viewGroup, bundle);
        a.setClickable(true);
        return a;
    }

    @Override // android.support.p001v4.app.Fragment
    public void onDestroy() {
        this.f27292a.g();
        super.onDestroy();
    }

    @Override // android.support.p001v4.app.Fragment
    public void onDestroyView() {
        this.f27292a.f();
        super.onDestroyView();
    }

    @Override // android.support.p001v4.app.Fragment
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(activity, attributeSet, bundle);
        this.f27292a.m11888a(activity);
        GoogleMapOptions m12010a = GoogleMapOptions.m12010a(activity, attributeSet);
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("MapOptions", m12010a);
        this.f27292a.a(activity, bundle2, bundle);
    }

    @Override // android.support.p001v4.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f27292a.h();
        super.onLowMemory();
    }

    @Override // android.support.p001v4.app.Fragment
    public void onPause() {
        this.f27292a.d();
        super.onPause();
    }

    @Override // android.support.p001v4.app.Fragment
    public void onResume() {
        super.onResume();
        this.f27292a.c();
    }

    @Override // android.support.p001v4.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportMapFragment.class.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        this.f27292a.b(bundle);
    }

    @Override // android.support.p001v4.app.Fragment
    public void onStart() {
        super.onStart();
        this.f27292a.b();
    }

    @Override // android.support.p001v4.app.Fragment
    public void onStop() {
        this.f27292a.e();
        super.onStop();
    }

    @Override // android.support.p001v4.app.Fragment
    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }
}
