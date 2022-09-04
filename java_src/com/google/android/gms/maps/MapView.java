package com.google.android.gms.maps;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.C4516c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.maps.model.C8618j;
import com.google.android.gms.maps.p247a.AbstractC8413ao;
import com.google.android.gms.maps.p247a.AbstractC8434b;
import com.google.android.gms.maps.p247a.AbstractC8443e;
import com.google.android.gms.maps.p247a.AbstractC8461k;
import com.google.android.gms.maps.p247a.C8486v;
import com.google.android.gms.p232c.AbstractC4157b;
import com.google.android.gms.p232c.AbstractC4174g;
import com.google.android.gms.p232c.BinderC4173f;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class MapView extends FrameLayout {

    /* renamed from: a */
    private final C8354b f27249a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.maps.MapView$a */
    /* loaded from: classes2.dex */
    public static class C8352a implements AbstractC8461k {

        /* renamed from: a */
        private final ViewGroup f27250a;

        /* renamed from: b */
        private final AbstractC8443e f27251b;

        /* renamed from: c */
        private View f27252c;

        public C8352a(ViewGroup viewGroup, AbstractC8443e abstractC8443e) {
            this.f27251b = (AbstractC8443e) C4588d.m23627a(abstractC8443e);
            this.f27250a = (ViewGroup) C4588d.m23627a(viewGroup);
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: a */
        public View mo8326a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            throw new UnsupportedOperationException("onCreateView not allowed on MapViewDelegate");
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: a */
        public void mo8330a() {
            try {
                this.f27251b.mo11729h();
            } catch (RemoteException e) {
                throw new C8618j(e);
            }
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: a */
        public void mo8328a(Activity activity, Bundle bundle, Bundle bundle2) {
            throw new UnsupportedOperationException("onInflate not allowed on MapViewDelegate");
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: a */
        public void mo8327a(Bundle bundle) {
            try {
                this.f27251b.mo11739a(bundle);
                this.f27252c = (View) BinderC4173f.m25294a(this.f27251b.mo11731f());
                this.f27250a.removeAllViews();
                this.f27250a.addView(this.f27252c);
            } catch (RemoteException e) {
                throw new C8618j(e);
            }
        }

        @Override // com.google.android.gms.maps.p247a.AbstractC8461k
        /* renamed from: a */
        public void mo11659a(final AbstractC8554f abstractC8554f) {
            try {
                this.f27251b.mo11738a(new AbstractC8413ao.AbstractBinderC8414a() { // from class: com.google.android.gms.maps.MapView.a.1
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
                this.f27251b.mo11737b();
            } catch (RemoteException e) {
                throw new C8618j(e);
            }
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: b */
        public void mo8314b(Bundle bundle) {
            try {
                this.f27251b.mo11736b(bundle);
            } catch (RemoteException e) {
                throw new C8618j(e);
            }
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: c */
        public void mo8313c() {
            try {
                this.f27251b.mo11735c();
            } catch (RemoteException e) {
                throw new C8618j(e);
            }
        }

        /* renamed from: c */
        public void m11945c(Bundle bundle) {
            try {
                this.f27251b.mo11734c(bundle);
            } catch (RemoteException e) {
                throw new C8618j(e);
            }
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: d */
        public void mo8312d() {
            try {
                this.f27251b.mo11728i();
            } catch (RemoteException e) {
                throw new C8618j(e);
            }
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: e */
        public void mo8311e() {
            throw new UnsupportedOperationException("onDestroyView not allowed on MapViewDelegate");
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: f */
        public void mo8310f() {
            try {
                this.f27251b.mo11733d();
            } catch (RemoteException e) {
                throw new C8618j(e);
            }
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: g */
        public void mo8309g() {
            try {
                this.f27251b.mo11732e();
            } catch (RemoteException e) {
                throw new C8618j(e);
            }
        }

        /* renamed from: h */
        public void m11944h() {
            try {
                this.f27251b.mo11730g();
            } catch (RemoteException e) {
                throw new C8618j(e);
            }
        }
    }

    /* renamed from: com.google.android.gms.maps.MapView$b */
    /* loaded from: classes2.dex */
    static class C8354b extends AbstractC4157b<C8352a> {

        /* renamed from: a */
        protected AbstractC4174g<C8352a> f27255a;

        /* renamed from: b */
        private final ViewGroup f27256b;

        /* renamed from: c */
        private final Context f27257c;

        /* renamed from: d */
        private final GoogleMapOptions f27258d;

        /* renamed from: e */
        private final List<AbstractC8554f> f27259e = new ArrayList();

        C8354b(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
            this.f27256b = viewGroup;
            this.f27257c = context;
            this.f27258d = googleMapOptions;
        }

        @Override // com.google.android.gms.p232c.AbstractC4157b
        /* renamed from: a */
        protected void mo8306a(AbstractC4174g<C8352a> abstractC4174g) {
            this.f27255a = abstractC4174g;
            m11941i();
        }

        /* renamed from: a */
        public void m11943a(AbstractC8554f abstractC8554f) {
            if (a() != null) {
                a().mo11659a(abstractC8554f);
            } else {
                this.f27259e.add(abstractC8554f);
            }
        }

        /* renamed from: c */
        public void m11942c(Bundle bundle) {
            if (a() != null) {
                a().m11945c(bundle);
            }
        }

        /* renamed from: i */
        public void m11941i() {
            if (this.f27255a == null || a() != null) {
                return;
            }
            try {
                C8553e.m11488a(this.f27257c);
                AbstractC8443e mo11633a = C8486v.m11645a(this.f27257c).mo11633a(BinderC4173f.m25293a(this.f27257c), this.f27258d);
                if (mo11633a == null) {
                    return;
                }
                this.f27255a.mo25292a(new C8352a(this.f27256b, mo11633a));
                for (AbstractC8554f abstractC8554f : this.f27259e) {
                    a().mo11659a(abstractC8554f);
                }
                this.f27259e.clear();
            } catch (RemoteException e) {
                throw new C8618j(e);
            } catch (C4516c e2) {
            }
        }

        /* renamed from: j */
        public void m11940j() {
            if (a() != null) {
                a().m11944h();
            }
        }
    }

    public MapView(Context context) {
        super(context);
        this.f27249a = new C8354b(this, context, null);
        m11946h();
    }

    public MapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27249a = new C8354b(this, context, GoogleMapOptions.m12010a(context, attributeSet));
        m11946h();
    }

    public MapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f27249a = new C8354b(this, context, GoogleMapOptions.m12010a(context, attributeSet));
        m11946h();
    }

    public MapView(Context context, GoogleMapOptions googleMapOptions) {
        super(context);
        this.f27249a = new C8354b(this, context, googleMapOptions);
        m11946h();
    }

    /* renamed from: h */
    private void m11946h() {
        setClickable(true);
    }

    /* renamed from: a */
    public final void m11957a() {
        this.f27249a.c();
    }

    /* renamed from: a */
    public final void m11956a(Bundle bundle) {
        this.f27249a.a(bundle);
        if (this.f27249a.a() == null) {
            AbstractC4157b.m25307b(this);
        }
    }

    /* renamed from: a */
    public void m11955a(AbstractC8554f abstractC8554f) {
        C4588d.m23620b("getMapAsync() must be called on the main thread");
        this.f27249a.m11943a(abstractC8554f);
    }

    /* renamed from: b */
    public final void m11954b() {
        this.f27249a.d();
    }

    /* renamed from: b */
    public final void m11953b(Bundle bundle) {
        this.f27249a.b(bundle);
    }

    /* renamed from: c */
    public final void m11952c() {
        this.f27249a.b();
    }

    /* renamed from: c */
    public final void m11951c(Bundle bundle) {
        C4588d.m23620b("onEnterAmbient() must be called on the main thread");
        this.f27249a.m11942c(bundle);
    }

    /* renamed from: d */
    public final void m11950d() {
        this.f27249a.e();
    }

    /* renamed from: e */
    public final void m11949e() {
        this.f27249a.g();
    }

    /* renamed from: f */
    public final void m11948f() {
        this.f27249a.h();
    }

    /* renamed from: g */
    public final void m11947g() {
        C4588d.m23620b("onExitAmbient() must be called on the main thread");
        this.f27249a.m11940j();
    }
}
