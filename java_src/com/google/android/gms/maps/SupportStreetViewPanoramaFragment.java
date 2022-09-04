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
/* loaded from: classes.dex */
public class SupportStreetViewPanoramaFragment extends Fragment {

    /* renamed from: a */
    private final C8366b f27301a = new C8366b(this);

    /* renamed from: b */
    private C8557i f27302b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.maps.SupportStreetViewPanoramaFragment$a */
    /* loaded from: classes2.dex */
    public static class C8364a implements AbstractC8462l {

        /* renamed from: a */
        private final Fragment f27303a;

        /* renamed from: b */
        private final AbstractC8452h f27304b;

        public C8364a(Fragment fragment, AbstractC8452h abstractC8452h) {
            this.f27304b = (AbstractC8452h) C4588d.m23627a(abstractC8452h);
            this.f27303a = (Fragment) C4588d.m23627a(fragment);
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: a */
        public View mo8326a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            try {
                return (View) BinderC4173f.m25294a(this.f27304b.mo11699a(BinderC4173f.m25293a(layoutInflater), BinderC4173f.m25293a(viewGroup), bundle));
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
                this.f27304b.mo11698a(BinderC4173f.m25293a(activity), (StreetViewPanoramaOptions) null, bundle2);
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
            Bundle arguments = this.f27303a.getArguments();
            if (arguments != null && arguments.containsKey("StreetViewPanoramaOptions")) {
                C8485u.m11647a(bundle, "StreetViewPanoramaOptions", arguments.getParcelable("StreetViewPanoramaOptions"));
            }
            this.f27304b.mo11700a(bundle);
        }

        @Override // com.google.android.gms.maps.p247a.AbstractC8462l
        /* renamed from: a */
        public void mo11658a(final AbstractC8555g abstractC8555g) {
            try {
                this.f27304b.mo11697a(new AbstractC8479s.AbstractBinderC8480a() { // from class: com.google.android.gms.maps.SupportStreetViewPanoramaFragment.a.1
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
                this.f27304b.mo11696b();
            } catch (RemoteException e) {
                throw new C8618j(e);
            }
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: b */
        public void mo8314b(Bundle bundle) {
            try {
                this.f27304b.mo11695b(bundle);
            } catch (RemoteException e) {
                throw new C8618j(e);
            }
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: c */
        public void mo8313c() {
            try {
                this.f27304b.mo11694c();
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
                this.f27304b.mo11693d();
            } catch (RemoteException e) {
                throw new C8618j(e);
            }
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: f */
        public void mo8310f() {
            try {
                this.f27304b.mo11692e();
            } catch (RemoteException e) {
                throw new C8618j(e);
            }
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: g */
        public void mo8309g() {
            try {
                this.f27304b.mo11691f();
            } catch (RemoteException e) {
                throw new C8618j(e);
            }
        }

        /* renamed from: h */
        public AbstractC8452h m11877h() {
            return this.f27304b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.maps.SupportStreetViewPanoramaFragment$b */
    /* loaded from: classes2.dex */
    public static class C8366b extends AbstractC4157b<C8364a> {

        /* renamed from: a */
        protected AbstractC4174g<C8364a> f27307a;

        /* renamed from: b */
        private final Fragment f27308b;

        /* renamed from: c */
        private Activity f27309c;

        /* renamed from: d */
        private final List<AbstractC8555g> f27310d = new ArrayList();

        C8366b(Fragment fragment) {
            this.f27308b = fragment;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m11876a(Activity activity) {
            this.f27309c = activity;
            m11873i();
        }

        @Override // com.google.android.gms.p232c.AbstractC4157b
        /* renamed from: a */
        protected void mo8306a(AbstractC4174g<C8364a> abstractC4174g) {
            this.f27307a = abstractC4174g;
            m11873i();
        }

        /* renamed from: a */
        public void m11874a(AbstractC8555g abstractC8555g) {
            if (a() != null) {
                a().mo11658a(abstractC8555g);
            } else {
                this.f27310d.add(abstractC8555g);
            }
        }

        /* renamed from: i */
        public void m11873i() {
            if (this.f27309c == null || this.f27307a == null || a() != null) {
                return;
            }
            try {
                C8553e.m11488a(this.f27309c);
                this.f27307a.mo25292a(new C8364a(this.f27308b, C8486v.m11645a(this.f27309c).mo11629c(BinderC4173f.m25293a(this.f27309c))));
                for (AbstractC8555g abstractC8555g : this.f27310d) {
                    a().mo11658a(abstractC8555g);
                }
                this.f27310d.clear();
            } catch (RemoteException e) {
                throw new C8618j(e);
            } catch (C4516c e2) {
            }
        }
    }

    /* renamed from: a */
    public static SupportStreetViewPanoramaFragment m11882a() {
        return new SupportStreetViewPanoramaFragment();
    }

    /* renamed from: a */
    public static SupportStreetViewPanoramaFragment m11881a(StreetViewPanoramaOptions streetViewPanoramaOptions) {
        SupportStreetViewPanoramaFragment supportStreetViewPanoramaFragment = new SupportStreetViewPanoramaFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("StreetViewPanoramaOptions", streetViewPanoramaOptions);
        supportStreetViewPanoramaFragment.setArguments(bundle);
        return supportStreetViewPanoramaFragment;
    }

    /* renamed from: a */
    public void m11880a(AbstractC8555g abstractC8555g) {
        C4588d.m23620b("getStreetViewPanoramaAsync() must be called on the main thread");
        this.f27301a.m11874a(abstractC8555g);
    }

    /* renamed from: b */
    protected AbstractC8452h m11879b() {
        this.f27301a.m11873i();
        if (this.f27301a.a() == null) {
            return null;
        }
        return this.f27301a.a().m11877h();
    }

    @Deprecated
    /* renamed from: c */
    public final C8557i m11878c() {
        AbstractC8452h m11879b = m11879b();
        if (m11879b == null) {
            return null;
        }
        try {
            AbstractC8449g mo11701a = m11879b.mo11701a();
            if (mo11701a == null) {
                return null;
            }
            if (this.f27302b == null || this.f27302b.m11481a().asBinder() != mo11701a.asBinder()) {
                this.f27302b = new C8557i(mo11701a);
            }
            return this.f27302b;
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    @Override // android.support.p001v4.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportStreetViewPanoramaFragment.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    @Override // android.support.p001v4.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f27301a.m11876a(activity);
    }

    @Override // android.support.p001v4.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f27301a.a(bundle);
    }

    @Override // android.support.p001v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f27301a.a(layoutInflater, viewGroup, bundle);
    }

    @Override // android.support.p001v4.app.Fragment
    public void onDestroy() {
        this.f27301a.g();
        super.onDestroy();
    }

    @Override // android.support.p001v4.app.Fragment
    public void onDestroyView() {
        this.f27301a.f();
        super.onDestroyView();
    }

    @Override // android.support.p001v4.app.Fragment
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(activity, attributeSet, bundle);
        this.f27301a.m11876a(activity);
        this.f27301a.a(activity, new Bundle(), bundle);
    }

    @Override // android.support.p001v4.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f27301a.h();
        super.onLowMemory();
    }

    @Override // android.support.p001v4.app.Fragment
    public void onPause() {
        this.f27301a.d();
        super.onPause();
    }

    @Override // android.support.p001v4.app.Fragment
    public void onResume() {
        super.onResume();
        this.f27301a.c();
    }

    @Override // android.support.p001v4.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportStreetViewPanoramaFragment.class.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        this.f27301a.b(bundle);
    }

    @Override // android.support.p001v4.app.Fragment
    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }
}
