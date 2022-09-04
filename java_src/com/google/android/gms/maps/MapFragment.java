package com.google.android.gms.maps;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.os.RemoteException;
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
@TargetApi(11)
/* loaded from: classes2.dex */
public class MapFragment extends Fragment {

    /* renamed from: a */
    private final C8351b f27240a = new C8351b(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.maps.MapFragment$a */
    /* loaded from: classes2.dex */
    public static class C8349a implements AbstractC8461k {

        /* renamed from: a */
        private final Fragment f27241a;

        /* renamed from: b */
        private final AbstractC8440d f27242b;

        public C8349a(Fragment fragment, AbstractC8440d abstractC8440d) {
            this.f27242b = (AbstractC8440d) C4588d.m23627a(abstractC8440d);
            this.f27241a = (Fragment) C4588d.m23627a(fragment);
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: a */
        public View mo8326a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            try {
                return (View) BinderC4173f.m25294a(this.f27242b.mo11755a(BinderC4173f.m25293a(layoutInflater), BinderC4173f.m25293a(viewGroup), bundle));
            } catch (RemoteException e) {
                throw new C8618j(e);
            }
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: a */
        public void mo8330a() {
            try {
                this.f27242b.mo11743i();
            } catch (RemoteException e) {
                throw new C8618j(e);
            }
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: a */
        public void mo8328a(Activity activity, Bundle bundle, Bundle bundle2) {
            try {
                this.f27242b.mo11754a(BinderC4173f.m25293a(activity), (GoogleMapOptions) bundle.getParcelable("MapOptions"), bundle2);
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
            Bundle arguments = this.f27241a.getArguments();
            if (arguments != null && arguments.containsKey("MapOptions")) {
                C8485u.m11647a(bundle, "MapOptions", arguments.getParcelable("MapOptions"));
            }
            this.f27242b.mo11756a(bundle);
        }

        @Override // com.google.android.gms.maps.p247a.AbstractC8461k
        /* renamed from: a */
        public void mo11659a(final AbstractC8554f abstractC8554f) {
            try {
                this.f27242b.mo11753a(new AbstractC8413ao.AbstractBinderC8414a() { // from class: com.google.android.gms.maps.MapFragment.a.1
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
                this.f27242b.mo11752b();
            } catch (RemoteException e) {
                throw new C8618j(e);
            }
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: b */
        public void mo8314b(Bundle bundle) {
            try {
                this.f27242b.mo11751b(bundle);
            } catch (RemoteException e) {
                throw new C8618j(e);
            }
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: c */
        public void mo8313c() {
            try {
                this.f27242b.mo11750c();
            } catch (RemoteException e) {
                throw new C8618j(e);
            }
        }

        /* renamed from: c */
        public void m11965c(Bundle bundle) {
            try {
                this.f27242b.mo11749c(bundle);
            } catch (RemoteException e) {
                throw new C8618j(e);
            }
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: d */
        public void mo8312d() {
            try {
                this.f27242b.mo11742j();
            } catch (RemoteException e) {
                throw new C8618j(e);
            }
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: e */
        public void mo8311e() {
            try {
                this.f27242b.mo11748d();
            } catch (RemoteException e) {
                throw new C8618j(e);
            }
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: f */
        public void mo8310f() {
            try {
                this.f27242b.mo11747e();
            } catch (RemoteException e) {
                throw new C8618j(e);
            }
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: g */
        public void mo8309g() {
            try {
                this.f27242b.mo11746f();
            } catch (RemoteException e) {
                throw new C8618j(e);
            }
        }

        /* renamed from: h */
        public void m11964h() {
            try {
                this.f27242b.mo11744h();
            } catch (RemoteException e) {
                throw new C8618j(e);
            }
        }
    }

    /* renamed from: com.google.android.gms.maps.MapFragment$b */
    /* loaded from: classes2.dex */
    static class C8351b extends AbstractC4157b<C8349a> {

        /* renamed from: a */
        protected AbstractC4174g<C8349a> f27245a;

        /* renamed from: b */
        private final Fragment f27246b;

        /* renamed from: c */
        private Activity f27247c;

        /* renamed from: d */
        private final List<AbstractC8554f> f27248d = new ArrayList();

        C8351b(Fragment fragment) {
            this.f27246b = fragment;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m11963a(Activity activity) {
            this.f27247c = activity;
            m11959i();
        }

        @Override // com.google.android.gms.p232c.AbstractC4157b
        /* renamed from: a */
        protected void mo8306a(AbstractC4174g<C8349a> abstractC4174g) {
            this.f27245a = abstractC4174g;
            m11959i();
        }

        /* renamed from: a */
        public void m11961a(AbstractC8554f abstractC8554f) {
            if (a() != null) {
                a().mo11659a(abstractC8554f);
            } else {
                this.f27248d.add(abstractC8554f);
            }
        }

        /* renamed from: c */
        public void m11960c(Bundle bundle) {
            if (a() != null) {
                a().m11965c(bundle);
            }
        }

        /* renamed from: i */
        public void m11959i() {
            if (this.f27247c == null || this.f27245a == null || a() != null) {
                return;
            }
            try {
                C8553e.m11488a(this.f27247c);
                AbstractC8440d mo11630b = C8486v.m11645a(this.f27247c).mo11630b(BinderC4173f.m25293a(this.f27247c));
                if (mo11630b == null) {
                    return;
                }
                this.f27245a.mo25292a(new C8349a(this.f27246b, mo11630b));
                for (AbstractC8554f abstractC8554f : this.f27248d) {
                    a().mo11659a(abstractC8554f);
                }
                this.f27248d.clear();
            } catch (RemoteException e) {
                throw new C8618j(e);
            } catch (C4516c e2) {
            }
        }

        /* renamed from: j */
        public void m11958j() {
            if (a() != null) {
                a().m11964h();
            }
        }
    }

    /* renamed from: a */
    public static MapFragment m11970a() {
        return new MapFragment();
    }

    /* renamed from: a */
    public static MapFragment m11968a(GoogleMapOptions googleMapOptions) {
        MapFragment mapFragment = new MapFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("MapOptions", googleMapOptions);
        mapFragment.setArguments(bundle);
        return mapFragment;
    }

    /* renamed from: a */
    public final void m11969a(Bundle bundle) {
        C4588d.m23620b("onEnterAmbient must be called on the main thread.");
        this.f27240a.m11960c(bundle);
    }

    /* renamed from: a */
    public void m11967a(AbstractC8554f abstractC8554f) {
        C4588d.m23620b("getMapAsync must be called on the main thread.");
        this.f27240a.m11961a(abstractC8554f);
    }

    /* renamed from: b */
    public final void m11966b() {
        C4588d.m23620b("onExitAmbient must be called on the main thread.");
        this.f27240a.m11958j();
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MapFragment.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f27240a.m11963a(activity);
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f27240a.a(bundle);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = this.f27240a.a(layoutInflater, viewGroup, bundle);
        a.setClickable(true);
        return a;
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        this.f27240a.g();
        super.onDestroy();
    }

    @Override // android.app.Fragment
    public void onDestroyView() {
        this.f27240a.f();
        super.onDestroyView();
    }

    @Override // android.app.Fragment
    @SuppressLint({"NewApi"})
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(activity, attributeSet, bundle);
        this.f27240a.m11963a(activity);
        GoogleMapOptions m12010a = GoogleMapOptions.m12010a(activity, attributeSet);
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("MapOptions", m12010a);
        this.f27240a.a(activity, bundle2, bundle);
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f27240a.h();
        super.onLowMemory();
    }

    @Override // android.app.Fragment
    public void onPause() {
        this.f27240a.d();
        super.onPause();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        this.f27240a.c();
    }

    @Override // android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MapFragment.class.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        this.f27240a.b(bundle);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f27240a.b();
    }

    @Override // android.app.Fragment
    public void onStop() {
        this.f27240a.e();
        super.onStop();
    }

    @Override // android.app.Fragment
    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }
}
