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
import com.google.android.gms.maps.p247a.AbstractC8449g;
import com.google.android.gms.maps.p247a.AbstractC8452h;
import com.google.android.gms.maps.p247a.AbstractC8462l;
import com.google.android.gms.maps.p247a.AbstractC8479s;
import com.google.android.gms.maps.p247a.C8485u;
import com.google.android.gms.maps.p247a.C8486v;
import com.google.android.gms.p232c.AbstractC4157b;
import com.google.android.gms.p232c.AbstractC4174g;
import com.google.android.gms.p232c.BinderC4173f;
import java.util.ArrayList;
import java.util.List;
@TargetApi(11)
/* loaded from: classes.dex */
public class StreetViewPanoramaFragment extends Fragment {

    /* renamed from: a */
    private final C8357b f27260a = new C8357b(this);

    /* renamed from: b */
    private C8557i f27261b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.maps.StreetViewPanoramaFragment$a */
    /* loaded from: classes2.dex */
    public static class C8355a implements AbstractC8462l {

        /* renamed from: a */
        private final Fragment f27262a;

        /* renamed from: b */
        private final AbstractC8452h f27263b;

        public C8355a(Fragment fragment, AbstractC8452h abstractC8452h) {
            this.f27263b = (AbstractC8452h) C4588d.m23627a(abstractC8452h);
            this.f27262a = (Fragment) C4588d.m23627a(fragment);
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: a */
        public View mo8326a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            try {
                return (View) BinderC4173f.m25294a(this.f27263b.mo11699a(BinderC4173f.m25293a(layoutInflater), BinderC4173f.m25293a(viewGroup), bundle));
            } catch (RemoteException e) {
                throw new C8618j(e);
            }
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: a */
        public void mo8330a() {
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: a */
        public void mo8328a(Activity activity, Bundle bundle, Bundle bundle2) {
            try {
                this.f27263b.mo11698a(BinderC4173f.m25293a(activity), (StreetViewPanoramaOptions) null, bundle2);
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
            Bundle arguments = this.f27262a.getArguments();
            if (arguments != null && arguments.containsKey("StreetViewPanoramaOptions")) {
                C8485u.m11647a(bundle, "StreetViewPanoramaOptions", arguments.getParcelable("StreetViewPanoramaOptions"));
            }
            this.f27263b.mo11700a(bundle);
        }

        @Override // com.google.android.gms.maps.p247a.AbstractC8462l
        /* renamed from: a */
        public void mo11658a(final AbstractC8555g abstractC8555g) {
            try {
                this.f27263b.mo11697a(new AbstractC8479s.AbstractBinderC8480a() { // from class: com.google.android.gms.maps.StreetViewPanoramaFragment.a.1
                    @Override // com.google.android.gms.maps.p247a.AbstractC8479s
                    /* renamed from: a */
                    public void mo11649a(AbstractC8449g abstractC8449g) {
                        abstractC8555g.m11485a(new C8557i(abstractC8449g));
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
                this.f27263b.mo11696b();
            } catch (RemoteException e) {
                throw new C8618j(e);
            }
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: b */
        public void mo8314b(Bundle bundle) {
            try {
                this.f27263b.mo11695b(bundle);
            } catch (RemoteException e) {
                throw new C8618j(e);
            }
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: c */
        public void mo8313c() {
            try {
                this.f27263b.mo11694c();
            } catch (RemoteException e) {
                throw new C8618j(e);
            }
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: d */
        public void mo8312d() {
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: e */
        public void mo8311e() {
            try {
                this.f27263b.mo11693d();
            } catch (RemoteException e) {
                throw new C8618j(e);
            }
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: f */
        public void mo8310f() {
            try {
                this.f27263b.mo11692e();
            } catch (RemoteException e) {
                throw new C8618j(e);
            }
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: g */
        public void mo8309g() {
            try {
                this.f27263b.mo11691f();
            } catch (RemoteException e) {
                throw new C8618j(e);
            }
        }

        /* renamed from: h */
        public AbstractC8452h m11934h() {
            return this.f27263b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.maps.StreetViewPanoramaFragment$b */
    /* loaded from: classes2.dex */
    public static class C8357b extends AbstractC4157b<C8355a> {

        /* renamed from: a */
        protected AbstractC4174g<C8355a> f27266a;

        /* renamed from: b */
        private final Fragment f27267b;

        /* renamed from: c */
        private Activity f27268c;

        /* renamed from: d */
        private final List<AbstractC8555g> f27269d = new ArrayList();

        C8357b(Fragment fragment) {
            this.f27267b = fragment;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m11933a(Activity activity) {
            this.f27268c = activity;
            m11930i();
        }

        @Override // com.google.android.gms.p232c.AbstractC4157b
        /* renamed from: a */
        protected void mo8306a(AbstractC4174g<C8355a> abstractC4174g) {
            this.f27266a = abstractC4174g;
            m11930i();
        }

        /* renamed from: a */
        public void m11931a(AbstractC8555g abstractC8555g) {
            if (a() != null) {
                a().mo11658a(abstractC8555g);
            } else {
                this.f27269d.add(abstractC8555g);
            }
        }

        /* renamed from: i */
        public void m11930i() {
            if (this.f27268c == null || this.f27266a == null || a() != null) {
                return;
            }
            try {
                C8553e.m11488a(this.f27268c);
                this.f27266a.mo25292a(new C8355a(this.f27267b, C8486v.m11645a(this.f27268c).mo11629c(BinderC4173f.m25293a(this.f27268c))));
                for (AbstractC8555g abstractC8555g : this.f27269d) {
                    a().mo11658a(abstractC8555g);
                }
                this.f27269d.clear();
            } catch (RemoteException e) {
                throw new C8618j(e);
            } catch (C4516c e2) {
            }
        }
    }

    /* renamed from: a */
    public static StreetViewPanoramaFragment m11939a() {
        return new StreetViewPanoramaFragment();
    }

    /* renamed from: a */
    public static StreetViewPanoramaFragment m11938a(StreetViewPanoramaOptions streetViewPanoramaOptions) {
        StreetViewPanoramaFragment streetViewPanoramaFragment = new StreetViewPanoramaFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("StreetViewPanoramaOptions", streetViewPanoramaOptions);
        streetViewPanoramaFragment.setArguments(bundle);
        return streetViewPanoramaFragment;
    }

    /* renamed from: a */
    public void m11937a(AbstractC8555g abstractC8555g) {
        C4588d.m23620b("getStreetViewPanoramaAsync() must be called on the main thread");
        this.f27260a.m11931a(abstractC8555g);
    }

    /* renamed from: b */
    protected AbstractC8452h m11936b() {
        this.f27260a.m11930i();
        if (this.f27260a.a() == null) {
            return null;
        }
        return this.f27260a.a().m11934h();
    }

    @Deprecated
    /* renamed from: c */
    public final C8557i m11935c() {
        AbstractC8452h m11936b = m11936b();
        if (m11936b == null) {
            return null;
        }
        try {
            AbstractC8449g mo11701a = m11936b.mo11701a();
            if (mo11701a == null) {
                return null;
            }
            if (this.f27261b == null || this.f27261b.m11481a().asBinder() != mo11701a.asBinder()) {
                this.f27261b = new C8557i(mo11701a);
            }
            return this.f27261b;
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(StreetViewPanoramaFragment.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f27260a.m11933a(activity);
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f27260a.a(bundle);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f27260a.a(layoutInflater, viewGroup, bundle);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        this.f27260a.g();
        super.onDestroy();
    }

    @Override // android.app.Fragment
    public void onDestroyView() {
        this.f27260a.f();
        super.onDestroyView();
    }

    @Override // android.app.Fragment
    @SuppressLint({"NewApi"})
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(activity, attributeSet, bundle);
        this.f27260a.m11933a(activity);
        this.f27260a.a(activity, new Bundle(), bundle);
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f27260a.h();
        super.onLowMemory();
    }

    @Override // android.app.Fragment
    public void onPause() {
        this.f27260a.d();
        super.onPause();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        this.f27260a.c();
    }

    @Override // android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(StreetViewPanoramaFragment.class.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        this.f27260a.b(bundle);
    }

    @Override // android.app.Fragment
    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }
}
