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
import com.google.android.gms.maps.p247a.AbstractC8449g;
import com.google.android.gms.maps.p247a.AbstractC8455i;
import com.google.android.gms.maps.p247a.AbstractC8462l;
import com.google.android.gms.maps.p247a.AbstractC8479s;
import com.google.android.gms.maps.p247a.C8486v;
import com.google.android.gms.p232c.AbstractC4157b;
import com.google.android.gms.p232c.AbstractC4174g;
import com.google.android.gms.p232c.BinderC4173f;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class StreetViewPanoramaView extends FrameLayout {

    /* renamed from: a */
    private final C8360b f27280a;

    /* renamed from: b */
    private C8557i f27281b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.maps.StreetViewPanoramaView$a */
    /* loaded from: classes2.dex */
    public static class C8358a implements AbstractC8462l {

        /* renamed from: a */
        private final ViewGroup f27282a;

        /* renamed from: b */
        private final AbstractC8455i f27283b;

        /* renamed from: c */
        private View f27284c;

        public C8358a(ViewGroup viewGroup, AbstractC8455i abstractC8455i) {
            this.f27283b = (AbstractC8455i) C4588d.m23627a(abstractC8455i);
            this.f27282a = (ViewGroup) C4588d.m23627a(viewGroup);
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: a */
        public View mo8326a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            throw new UnsupportedOperationException("onCreateView not allowed on StreetViewPanoramaViewDelegate");
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: a */
        public void mo8330a() {
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: a */
        public void mo8328a(Activity activity, Bundle bundle, Bundle bundle2) {
            throw new UnsupportedOperationException("onInflate not allowed on StreetViewPanoramaViewDelegate");
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: a */
        public void mo8327a(Bundle bundle) {
            try {
                this.f27283b.mo11687a(bundle);
                this.f27284c = (View) BinderC4173f.m25294a(this.f27283b.mo11680f());
                this.f27282a.removeAllViews();
                this.f27282a.addView(this.f27284c);
            } catch (RemoteException e) {
                throw new C8618j(e);
            }
        }

        @Override // com.google.android.gms.maps.p247a.AbstractC8462l
        /* renamed from: a */
        public void mo11658a(final AbstractC8555g abstractC8555g) {
            try {
                this.f27283b.mo11686a(new AbstractC8479s.AbstractBinderC8480a() { // from class: com.google.android.gms.maps.StreetViewPanoramaView.a.1
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
                this.f27283b.mo11685b();
            } catch (RemoteException e) {
                throw new C8618j(e);
            }
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: b */
        public void mo8314b(Bundle bundle) {
            try {
                this.f27283b.mo11684b(bundle);
            } catch (RemoteException e) {
                throw new C8618j(e);
            }
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: c */
        public void mo8313c() {
            try {
                this.f27283b.mo11683c();
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
            throw new UnsupportedOperationException("onDestroyView not allowed on StreetViewPanoramaViewDelegate");
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: f */
        public void mo8310f() {
            try {
                this.f27283b.mo11682d();
            } catch (RemoteException e) {
                throw new C8618j(e);
            }
        }

        @Override // com.google.android.gms.p232c.AbstractC4156a
        /* renamed from: g */
        public void mo8309g() {
            try {
                this.f27283b.mo11681e();
            } catch (RemoteException e) {
                throw new C8618j(e);
            }
        }

        /* renamed from: h */
        public AbstractC8455i m11898h() {
            return this.f27283b;
        }
    }

    /* renamed from: com.google.android.gms.maps.StreetViewPanoramaView$b */
    /* loaded from: classes2.dex */
    static class C8360b extends AbstractC4157b<C8358a> {

        /* renamed from: a */
        protected AbstractC4174g<C8358a> f27287a;

        /* renamed from: b */
        private final ViewGroup f27288b;

        /* renamed from: c */
        private final Context f27289c;

        /* renamed from: d */
        private final StreetViewPanoramaOptions f27290d;

        /* renamed from: e */
        private final List<AbstractC8555g> f27291e = new ArrayList();

        C8360b(ViewGroup viewGroup, Context context, StreetViewPanoramaOptions streetViewPanoramaOptions) {
            this.f27288b = viewGroup;
            this.f27289c = context;
            this.f27290d = streetViewPanoramaOptions;
        }

        @Override // com.google.android.gms.p232c.AbstractC4157b
        /* renamed from: a */
        protected void mo8306a(AbstractC4174g<C8358a> abstractC4174g) {
            this.f27287a = abstractC4174g;
            m11896i();
        }

        /* renamed from: a */
        public void m11897a(AbstractC8555g abstractC8555g) {
            if (a() != null) {
                a().mo11658a(abstractC8555g);
            } else {
                this.f27291e.add(abstractC8555g);
            }
        }

        /* renamed from: i */
        public void m11896i() {
            if (this.f27287a == null || a() != null) {
                return;
            }
            try {
                this.f27287a.mo25292a(new C8358a(this.f27288b, C8486v.m11645a(this.f27289c).mo11632a(BinderC4173f.m25293a(this.f27289c), this.f27290d)));
                for (AbstractC8555g abstractC8555g : this.f27291e) {
                    a().mo11658a(abstractC8555g);
                }
                this.f27291e.clear();
            } catch (RemoteException e) {
                throw new C8618j(e);
            } catch (C4516c e2) {
            }
        }
    }

    public StreetViewPanoramaView(Context context) {
        super(context);
        this.f27280a = new C8360b(this, context, null);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27280a = new C8360b(this, context, null);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f27280a = new C8360b(this, context, null);
    }

    public StreetViewPanoramaView(Context context, StreetViewPanoramaOptions streetViewPanoramaOptions) {
        super(context);
        this.f27280a = new C8360b(this, context, streetViewPanoramaOptions);
    }

    /* renamed from: a */
    public final void m11905a() {
        this.f27280a.c();
    }

    /* renamed from: a */
    public final void m11904a(Bundle bundle) {
        this.f27280a.a(bundle);
        if (this.f27280a.a() == null) {
            AbstractC4157b.m25307b(this);
        }
    }

    /* renamed from: a */
    public void m11903a(AbstractC8555g abstractC8555g) {
        C4588d.m23620b("getStreetViewPanoramaAsync() must be called on the main thread");
        this.f27280a.m11897a(abstractC8555g);
    }

    /* renamed from: b */
    public final void m11902b() {
        this.f27280a.d();
    }

    /* renamed from: b */
    public final void m11901b(Bundle bundle) {
        this.f27280a.b(bundle);
    }

    /* renamed from: c */
    public final void m11900c() {
        this.f27280a.g();
    }

    /* renamed from: d */
    public final void m11899d() {
        this.f27280a.h();
    }

    @Deprecated
    public final C8557i getStreetViewPanorama() {
        if (this.f27281b != null) {
            return this.f27281b;
        }
        this.f27280a.m11896i();
        if (this.f27280a.a() == null) {
            return null;
        }
        try {
            this.f27281b = new C8557i(this.f27280a.a().m11898h().mo11688a());
            return this.f27281b;
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }
}
