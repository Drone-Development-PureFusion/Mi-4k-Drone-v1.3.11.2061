package com.google.android.gms.maps;

import android.graphics.Bitmap;
import android.location.Location;
import android.os.RemoteException;
import android.support.annotation.RequiresPermission;
import android.view.View;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.maps.AbstractC8551d;
import com.google.android.gms.maps.model.C8611c;
import com.google.android.gms.maps.model.C8612d;
import com.google.android.gms.maps.model.C8613e;
import com.google.android.gms.maps.model.C8615g;
import com.google.android.gms.maps.model.C8616h;
import com.google.android.gms.maps.model.C8617i;
import com.google.android.gms.maps.model.C8618j;
import com.google.android.gms.maps.model.C8619k;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PointOfInterest;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.p248a.AbstractC8576a;
import com.google.android.gms.maps.model.p248a.AbstractC8582c;
import com.google.android.gms.maps.model.p248a.AbstractC8585d;
import com.google.android.gms.maps.model.p248a.AbstractC8588e;
import com.google.android.gms.maps.model.p248a.AbstractC8594g;
import com.google.android.gms.maps.model.p248a.AbstractC8597h;
import com.google.android.gms.maps.model.p248a.AbstractC8600i;
import com.google.android.gms.maps.p247a.AbstractC8371aa;
import com.google.android.gms.maps.p247a.AbstractC8374ab;
import com.google.android.gms.maps.p247a.AbstractC8377ac;
import com.google.android.gms.maps.p247a.AbstractC8380ad;
import com.google.android.gms.maps.p247a.AbstractC8383ae;
import com.google.android.gms.maps.p247a.AbstractC8386af;
import com.google.android.gms.maps.p247a.AbstractC8389ag;
import com.google.android.gms.maps.p247a.AbstractC8392ah;
import com.google.android.gms.maps.p247a.AbstractC8395ai;
import com.google.android.gms.maps.p247a.AbstractC8398aj;
import com.google.android.gms.maps.p247a.AbstractC8401ak;
import com.google.android.gms.maps.p247a.AbstractC8404al;
import com.google.android.gms.maps.p247a.AbstractC8407am;
import com.google.android.gms.maps.p247a.AbstractC8410an;
import com.google.android.gms.maps.p247a.AbstractC8416ap;
import com.google.android.gms.maps.p247a.AbstractC8419aq;
import com.google.android.gms.maps.p247a.AbstractC8422ar;
import com.google.android.gms.maps.p247a.AbstractC8425as;
import com.google.android.gms.maps.p247a.AbstractC8428at;
import com.google.android.gms.maps.p247a.AbstractC8431au;
import com.google.android.gms.maps.p247a.AbstractC8434b;
import com.google.android.gms.maps.p247a.AbstractC8437c;
import com.google.android.gms.maps.p247a.AbstractC8464n;
import com.google.android.gms.maps.p247a.AbstractC8482t;
import com.google.android.gms.maps.p247a.AbstractC8487w;
import com.google.android.gms.maps.p247a.AbstractC8493y;
import com.google.android.gms.maps.p247a.AbstractC8496z;
import com.google.android.gms.p232c.AbstractC4170e;
import com.google.android.gms.p232c.BinderC4173f;
/* renamed from: com.google.android.gms.maps.c */
/* loaded from: classes.dex */
public final class C8500c {

    /* renamed from: a */
    public static final int f27357a = 0;

    /* renamed from: b */
    public static final int f27358b = 1;

    /* renamed from: c */
    public static final int f27359c = 2;

    /* renamed from: d */
    public static final int f27360d = 3;

    /* renamed from: e */
    public static final int f27361e = 4;

    /* renamed from: f */
    private final AbstractC8434b f27362f;

    /* renamed from: g */
    private C8566j f27363g;

    /* renamed from: com.google.android.gms.maps.c$a */
    /* loaded from: classes2.dex */
    public interface AbstractC8526a {
        /* renamed from: a */
        void mo11522a();

        /* renamed from: b */
        void mo11521b();
    }

    /* renamed from: com.google.android.gms.maps.c$b */
    /* loaded from: classes.dex */
    public interface AbstractC8527b {
        /* renamed from: a */
        View mo11520a(C8615g c8615g);

        /* renamed from: b */
        View mo11519b(C8615g c8615g);
    }

    @Deprecated
    /* renamed from: com.google.android.gms.maps.c$c */
    /* loaded from: classes.dex */
    public interface AbstractC8528c {
        /* renamed from: a */
        void mo11518a(CameraPosition cameraPosition);
    }

    /* renamed from: com.google.android.gms.maps.c$d */
    /* loaded from: classes2.dex */
    public interface AbstractC8529d {
        /* renamed from: a */
        void m11517a();
    }

    /* renamed from: com.google.android.gms.maps.c$e */
    /* loaded from: classes2.dex */
    public interface AbstractC8530e {
        /* renamed from: a */
        void m11516a();
    }

    /* renamed from: com.google.android.gms.maps.c$f */
    /* loaded from: classes2.dex */
    public interface AbstractC8531f {
        /* renamed from: a */
        void m11515a();
    }

    /* renamed from: com.google.android.gms.maps.c$g */
    /* loaded from: classes2.dex */
    public interface AbstractC8532g {

        /* renamed from: a */
        public static final int f27414a = 1;

        /* renamed from: b */
        public static final int f27415b = 2;

        /* renamed from: c */
        public static final int f27416c = 3;

        /* renamed from: a */
        void m11514a(int i);
    }

    /* renamed from: com.google.android.gms.maps.c$h */
    /* loaded from: classes2.dex */
    public interface AbstractC8533h {
        /* renamed from: a */
        void m11513a(C8611c c8611c);
    }

    /* renamed from: com.google.android.gms.maps.c$i */
    /* loaded from: classes2.dex */
    public interface AbstractC8534i {
        /* renamed from: a */
        void m11512a(C8612d c8612d);
    }

    /* renamed from: com.google.android.gms.maps.c$j */
    /* loaded from: classes2.dex */
    public interface AbstractC8535j {
        /* renamed from: a */
        void m11511a();

        /* renamed from: a */
        void m11510a(C8613e c8613e);
    }

    /* renamed from: com.google.android.gms.maps.c$k */
    /* loaded from: classes.dex */
    public interface AbstractC8536k {
        /* renamed from: c */
        void mo11509c(C8615g c8615g);
    }

    /* renamed from: com.google.android.gms.maps.c$l */
    /* loaded from: classes2.dex */
    public interface AbstractC8537l {
        /* renamed from: a */
        void m11508a(C8615g c8615g);
    }

    /* renamed from: com.google.android.gms.maps.c$m */
    /* loaded from: classes2.dex */
    public interface AbstractC8538m {
        /* renamed from: a */
        void m11507a(C8615g c8615g);
    }

    /* renamed from: com.google.android.gms.maps.c$n */
    /* loaded from: classes.dex */
    public interface AbstractC8539n {
        /* renamed from: a */
        void mo11506a(LatLng latLng);
    }

    /* renamed from: com.google.android.gms.maps.c$o */
    /* loaded from: classes.dex */
    public interface AbstractC8540o {
        /* renamed from: b */
        void mo11505b();
    }

    /* renamed from: com.google.android.gms.maps.c$p */
    /* loaded from: classes.dex */
    public interface AbstractC8541p {
        /* renamed from: b */
        void mo11504b(LatLng latLng);
    }

    /* renamed from: com.google.android.gms.maps.c$q */
    /* loaded from: classes.dex */
    public interface AbstractC8542q {
        /* renamed from: d */
        boolean mo11503d(C8615g c8615g);
    }

    /* renamed from: com.google.android.gms.maps.c$r */
    /* loaded from: classes.dex */
    public interface AbstractC8543r {
        /* renamed from: e */
        void mo11502e(C8615g c8615g);

        /* renamed from: f */
        void mo11501f(C8615g c8615g);

        /* renamed from: g */
        void mo11500g(C8615g c8615g);
    }

    /* renamed from: com.google.android.gms.maps.c$s */
    /* loaded from: classes2.dex */
    public interface AbstractC8544s {
        /* renamed from: a */
        boolean m11499a();
    }

    @Deprecated
    /* renamed from: com.google.android.gms.maps.c$t */
    /* loaded from: classes.dex */
    public interface AbstractC8545t {
        /* renamed from: a */
        void m11498a(Location location);
    }

    /* renamed from: com.google.android.gms.maps.c$u */
    /* loaded from: classes2.dex */
    public interface AbstractC8546u {
        /* renamed from: a */
        void m11497a(PointOfInterest pointOfInterest);
    }

    /* renamed from: com.google.android.gms.maps.c$v */
    /* loaded from: classes2.dex */
    public interface AbstractC8547v {
        /* renamed from: a */
        void m11496a(C8616h c8616h);
    }

    /* renamed from: com.google.android.gms.maps.c$w */
    /* loaded from: classes2.dex */
    public interface AbstractC8548w {
        /* renamed from: a */
        void m11495a(C8617i c8617i);
    }

    /* renamed from: com.google.android.gms.maps.c$x */
    /* loaded from: classes2.dex */
    public interface AbstractC8549x {
        /* renamed from: a */
        void m11494a(Bitmap bitmap);
    }

    /* renamed from: com.google.android.gms.maps.c$y */
    /* loaded from: classes2.dex */
    private static final class BinderC8550y extends AbstractC8487w.AbstractBinderC8488a {

        /* renamed from: a */
        private final AbstractC8526a f27417a;

        BinderC8550y(AbstractC8526a abstractC8526a) {
            this.f27417a = abstractC8526a;
        }

        @Override // com.google.android.gms.maps.p247a.AbstractC8487w
        /* renamed from: a */
        public void mo11493a() {
            this.f27417a.mo11522a();
        }

        @Override // com.google.android.gms.maps.p247a.AbstractC8487w
        /* renamed from: b */
        public void mo11492b() {
            this.f27417a.mo11521b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C8500c(AbstractC8434b abstractC8434b) {
        this.f27362f = (AbstractC8434b) C4588d.m23627a(abstractC8434b);
    }

    /* renamed from: a */
    public final CameraPosition m11613a() {
        try {
            return this.f27362f.mo11834a();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public final C8611c m11581a(CircleOptions circleOptions) {
        try {
            return new C8611c(this.f27362f.mo11800a(circleOptions));
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public final C8612d m11580a(GroundOverlayOptions groundOverlayOptions) {
        try {
            AbstractC8585d mo11799a = this.f27362f.mo11799a(groundOverlayOptions);
            if (mo11799a == null) {
                return null;
            }
            return new C8612d(mo11799a);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public final C8615g m11577a(MarkerOptions markerOptions) {
        try {
            AbstractC8594g mo11796a = this.f27362f.mo11796a(markerOptions);
            if (mo11796a == null) {
                return null;
            }
            return new C8615g(mo11796a);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public final C8616h m11576a(PolygonOptions polygonOptions) {
        try {
            return new C8616h(this.f27362f.mo11795a(polygonOptions));
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public final C8617i m11575a(PolylineOptions polylineOptions) {
        try {
            return new C8617i(this.f27362f.mo11794a(polylineOptions));
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public final C8619k m11574a(TileOverlayOptions tileOverlayOptions) {
        try {
            AbstractC8600i mo11793a = this.f27362f.mo11793a(tileOverlayOptions);
            if (mo11793a == null) {
                return null;
            }
            return new C8619k(mo11793a);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public void m11612a(float f) {
        try {
            this.f27362f.mo11833a(f);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public final void m11611a(int i) {
        try {
            this.f27362f.mo11832a(i);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public final void m11610a(int i, int i2, int i3, int i4) {
        try {
            this.f27362f.mo11831a(i, i2, i3, i4);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public final void m11609a(C8367a c8367a) {
        try {
            this.f27362f.mo11829a(c8367a.m11872a());
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public final void m11608a(C8367a c8367a, int i, AbstractC8526a abstractC8526a) {
        try {
            this.f27362f.mo11828a(c8367a.m11872a(), i, abstractC8526a == null ? null : new BinderC8550y(abstractC8526a));
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public final void m11607a(C8367a c8367a, AbstractC8526a abstractC8526a) {
        try {
            this.f27362f.mo11827a(c8367a.m11872a(), abstractC8526a == null ? null : new BinderC8550y(abstractC8526a));
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public final void m11606a(final AbstractC8527b abstractC8527b) {
        try {
            if (abstractC8527b == null) {
                this.f27362f.mo11802a((AbstractC8493y) null);
            } else {
                this.f27362f.mo11802a(new AbstractC8493y.AbstractBinderC8494a() { // from class: com.google.android.gms.maps.c.22
                    @Override // com.google.android.gms.maps.p247a.AbstractC8493y
                    /* renamed from: a */
                    public AbstractC4170e mo11535a(AbstractC8594g abstractC8594g) {
                        return BinderC4173f.m25293a(abstractC8527b.mo11520a(new C8615g(abstractC8594g)));
                    }

                    @Override // com.google.android.gms.maps.p247a.AbstractC8493y
                    /* renamed from: b */
                    public AbstractC4170e mo11534b(AbstractC8594g abstractC8594g) {
                        return BinderC4173f.m25293a(abstractC8527b.mo11519b(new C8615g(abstractC8594g)));
                    }
                });
            }
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    @Deprecated
    /* renamed from: a */
    public final void m11605a(final AbstractC8528c abstractC8528c) {
        try {
            if (abstractC8528c == null) {
                this.f27362f.mo11801a((AbstractC8496z) null);
            } else {
                this.f27362f.mo11801a(new AbstractC8496z.AbstractBinderC8497a() { // from class: com.google.android.gms.maps.c.10
                    @Override // com.google.android.gms.maps.p247a.AbstractC8496z
                    /* renamed from: a */
                    public void mo11550a(CameraPosition cameraPosition) {
                        abstractC8528c.mo11518a(cameraPosition);
                    }
                });
            }
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public final void m11604a(final AbstractC8529d abstractC8529d) {
        try {
            if (abstractC8529d == null) {
                this.f27362f.mo11826a((AbstractC8371aa) null);
            } else {
                this.f27362f.mo11826a(new AbstractC8371aa.AbstractBinderC8372a() { // from class: com.google.android.gms.maps.c.15
                    @Override // com.google.android.gms.maps.p247a.AbstractC8371aa
                    /* renamed from: a */
                    public void mo11545a() {
                        abstractC8529d.m11517a();
                    }
                });
            }
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public final void m11603a(final AbstractC8530e abstractC8530e) {
        try {
            if (abstractC8530e == null) {
                this.f27362f.mo11825a((AbstractC8374ab) null);
            } else {
                this.f27362f.mo11825a(new AbstractC8374ab.AbstractBinderC8375a() { // from class: com.google.android.gms.maps.c.14
                    @Override // com.google.android.gms.maps.p247a.AbstractC8374ab
                    /* renamed from: a */
                    public void mo11546a() {
                        abstractC8530e.m11516a();
                    }
                });
            }
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public final void m11602a(final AbstractC8531f abstractC8531f) {
        try {
            if (abstractC8531f == null) {
                this.f27362f.mo11824a((AbstractC8377ac) null);
            } else {
                this.f27362f.mo11824a(new AbstractC8377ac.AbstractBinderC8378a() { // from class: com.google.android.gms.maps.c.13
                    @Override // com.google.android.gms.maps.p247a.AbstractC8377ac
                    /* renamed from: a */
                    public void mo11547a() {
                        abstractC8531f.m11515a();
                    }
                });
            }
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public final void m11601a(final AbstractC8532g abstractC8532g) {
        try {
            if (abstractC8532g == null) {
                this.f27362f.mo11823a((AbstractC8380ad) null);
            } else {
                this.f27362f.mo11823a(new AbstractC8380ad.AbstractBinderC8381a() { // from class: com.google.android.gms.maps.c.11
                    @Override // com.google.android.gms.maps.p247a.AbstractC8380ad
                    /* renamed from: a */
                    public void mo11549a(int i) {
                        abstractC8532g.m11514a(i);
                    }
                });
            }
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public final void m11600a(final AbstractC8533h abstractC8533h) {
        try {
            if (abstractC8533h == null) {
                this.f27362f.mo11822a((AbstractC8383ae) null);
            } else {
                this.f27362f.mo11822a(new AbstractC8383ae.AbstractBinderC8384a() { // from class: com.google.android.gms.maps.c.5
                    @Override // com.google.android.gms.maps.p247a.AbstractC8383ae
                    /* renamed from: a */
                    public void mo11528a(AbstractC8582c abstractC8582c) {
                        abstractC8533h.m11513a(new C8611c(abstractC8582c));
                    }
                });
            }
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public final void m11599a(final AbstractC8534i abstractC8534i) {
        try {
            if (abstractC8534i == null) {
                this.f27362f.mo11821a((AbstractC8386af) null);
            } else {
                this.f27362f.mo11821a(new AbstractC8386af.AbstractBinderC8387a() { // from class: com.google.android.gms.maps.c.3
                    @Override // com.google.android.gms.maps.p247a.AbstractC8386af
                    /* renamed from: a */
                    public void mo11531a(AbstractC8585d abstractC8585d) {
                        abstractC8534i.m11512a(new C8612d(abstractC8585d));
                    }
                });
            }
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public final void m11598a(final AbstractC8535j abstractC8535j) {
        try {
            if (abstractC8535j == null) {
                this.f27362f.mo11820a((AbstractC8389ag) null);
            } else {
                this.f27362f.mo11820a(new AbstractC8389ag.AbstractBinderC8390a() { // from class: com.google.android.gms.maps.c.1
                    @Override // com.google.android.gms.maps.p247a.AbstractC8389ag
                    /* renamed from: a */
                    public void mo11552a() {
                        abstractC8535j.m11511a();
                    }

                    @Override // com.google.android.gms.maps.p247a.AbstractC8389ag
                    /* renamed from: a */
                    public void mo11551a(AbstractC8588e abstractC8588e) {
                        abstractC8535j.m11510a(new C8613e(abstractC8588e));
                    }
                });
            }
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public final void m11597a(final AbstractC8536k abstractC8536k) {
        try {
            if (abstractC8536k == null) {
                this.f27362f.mo11819a((AbstractC8392ah) null);
            } else {
                this.f27362f.mo11819a(new AbstractC8392ah.AbstractBinderC8393a() { // from class: com.google.android.gms.maps.c.19
                    @Override // com.google.android.gms.maps.p247a.AbstractC8392ah
                    /* renamed from: a */
                    public void mo11539a(AbstractC8594g abstractC8594g) {
                        abstractC8536k.mo11509c(new C8615g(abstractC8594g));
                    }
                });
            }
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public final void m11596a(final AbstractC8537l abstractC8537l) {
        try {
            if (abstractC8537l == null) {
                this.f27362f.mo11818a((AbstractC8395ai) null);
            } else {
                this.f27362f.mo11818a(new AbstractC8395ai.AbstractBinderC8396a() { // from class: com.google.android.gms.maps.c.21
                    @Override // com.google.android.gms.maps.p247a.AbstractC8395ai
                    /* renamed from: a */
                    public void mo11536a(AbstractC8594g abstractC8594g) {
                        abstractC8537l.m11508a(new C8615g(abstractC8594g));
                    }
                });
            }
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public final void m11595a(final AbstractC8538m abstractC8538m) {
        try {
            if (abstractC8538m == null) {
                this.f27362f.mo11817a((AbstractC8398aj) null);
            } else {
                this.f27362f.mo11817a(new AbstractC8398aj.AbstractBinderC8399a() { // from class: com.google.android.gms.maps.c.20
                    @Override // com.google.android.gms.maps.p247a.AbstractC8398aj
                    /* renamed from: a */
                    public void mo11537a(AbstractC8594g abstractC8594g) {
                        abstractC8538m.m11507a(new C8615g(abstractC8594g));
                    }
                });
            }
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public final void m11594a(final AbstractC8539n abstractC8539n) {
        try {
            if (abstractC8539n == null) {
                this.f27362f.mo11816a((AbstractC8404al) null);
            } else {
                this.f27362f.mo11816a(new AbstractC8404al.AbstractBinderC8405a() { // from class: com.google.android.gms.maps.c.16
                    @Override // com.google.android.gms.maps.p247a.AbstractC8404al
                    /* renamed from: a */
                    public void mo11544a(LatLng latLng) {
                        abstractC8539n.mo11506a(latLng);
                    }
                });
            }
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public void m11593a(final AbstractC8540o abstractC8540o) {
        try {
            if (abstractC8540o == null) {
                this.f27362f.mo11815a((AbstractC8407am) null);
            } else {
                this.f27362f.mo11815a(new AbstractC8407am.AbstractBinderC8408a() { // from class: com.google.android.gms.maps.c.2
                    @Override // com.google.android.gms.maps.p247a.AbstractC8407am
                    /* renamed from: a */
                    public void mo11538a() {
                        abstractC8540o.mo11505b();
                    }
                });
            }
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public final void m11592a(final AbstractC8541p abstractC8541p) {
        try {
            if (abstractC8541p == null) {
                this.f27362f.mo11814a((AbstractC8410an) null);
            } else {
                this.f27362f.mo11814a(new AbstractC8410an.AbstractBinderC8411a() { // from class: com.google.android.gms.maps.c.17
                    @Override // com.google.android.gms.maps.p247a.AbstractC8410an
                    /* renamed from: a */
                    public void mo11543a(LatLng latLng) {
                        abstractC8541p.mo11504b(latLng);
                    }
                });
            }
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public final void m11591a(final AbstractC8542q abstractC8542q) {
        try {
            if (abstractC8542q == null) {
                this.f27362f.mo11812a((AbstractC8416ap) null);
            } else {
                this.f27362f.mo11812a(new AbstractC8416ap.AbstractBinderC8417a() { // from class: com.google.android.gms.maps.c.12
                    @Override // com.google.android.gms.maps.p247a.AbstractC8416ap
                    /* renamed from: a */
                    public boolean mo11548a(AbstractC8594g abstractC8594g) {
                        return abstractC8542q.mo11503d(new C8615g(abstractC8594g));
                    }
                });
            }
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public final void m11590a(final AbstractC8543r abstractC8543r) {
        try {
            if (abstractC8543r == null) {
                this.f27362f.mo11811a((AbstractC8419aq) null);
            } else {
                this.f27362f.mo11811a(new AbstractC8419aq.AbstractBinderC8420a() { // from class: com.google.android.gms.maps.c.18
                    @Override // com.google.android.gms.maps.p247a.AbstractC8419aq
                    /* renamed from: a */
                    public void mo11542a(AbstractC8594g abstractC8594g) {
                        abstractC8543r.mo11500g(new C8615g(abstractC8594g));
                    }

                    @Override // com.google.android.gms.maps.p247a.AbstractC8419aq
                    /* renamed from: b */
                    public void mo11541b(AbstractC8594g abstractC8594g) {
                        abstractC8543r.mo11501f(new C8615g(abstractC8594g));
                    }

                    @Override // com.google.android.gms.maps.p247a.AbstractC8419aq
                    /* renamed from: c */
                    public void mo11540c(AbstractC8594g abstractC8594g) {
                        abstractC8543r.mo11502e(new C8615g(abstractC8594g));
                    }
                });
            }
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public final void m11589a(final AbstractC8544s abstractC8544s) {
        try {
            if (abstractC8544s == null) {
                this.f27362f.mo11810a((AbstractC8422ar) null);
            } else {
                this.f27362f.mo11810a(new AbstractC8422ar.AbstractBinderC8423a() { // from class: com.google.android.gms.maps.c.24
                    @Override // com.google.android.gms.maps.p247a.AbstractC8422ar
                    /* renamed from: a */
                    public boolean mo11532a() {
                        return abstractC8544s.m11499a();
                    }
                });
            }
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    @Deprecated
    /* renamed from: a */
    public final void m11588a(final AbstractC8545t abstractC8545t) {
        try {
            if (abstractC8545t == null) {
                this.f27362f.mo11809a((AbstractC8425as) null);
            } else {
                this.f27362f.mo11809a(new AbstractC8425as.AbstractBinderC8426a() { // from class: com.google.android.gms.maps.c.23
                    @Override // com.google.android.gms.maps.p247a.AbstractC8425as
                    /* renamed from: a */
                    public void mo11533a(AbstractC4170e abstractC4170e) {
                        abstractC8545t.m11498a((Location) BinderC4173f.m25294a(abstractC4170e));
                    }
                });
            }
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public final void m11587a(final AbstractC8546u abstractC8546u) {
        try {
            if (abstractC8546u == null) {
                this.f27362f.mo11808a((AbstractC8428at) null);
            } else {
                this.f27362f.mo11808a(new AbstractC8428at.AbstractBinderC8429a() { // from class: com.google.android.gms.maps.c.9
                    @Override // com.google.android.gms.maps.p247a.AbstractC8428at
                    /* renamed from: a */
                    public void mo11523a(PointOfInterest pointOfInterest) {
                        abstractC8546u.m11497a(pointOfInterest);
                    }
                });
            }
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public final void m11586a(final AbstractC8547v abstractC8547v) {
        try {
            if (abstractC8547v == null) {
                this.f27362f.mo11807a((AbstractC8431au) null);
            } else {
                this.f27362f.mo11807a(new AbstractC8431au.AbstractBinderC8432a() { // from class: com.google.android.gms.maps.c.6
                    @Override // com.google.android.gms.maps.p247a.AbstractC8431au
                    /* renamed from: a */
                    public void mo11527a(AbstractC8597h abstractC8597h) {
                        abstractC8547v.m11496a(new C8616h(abstractC8597h));
                    }
                });
            }
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public final void m11585a(final AbstractC8548w abstractC8548w) {
        try {
            if (abstractC8548w == null) {
                this.f27362f.mo11805a((AbstractC8464n) null);
            } else {
                this.f27362f.mo11805a(new AbstractC8464n.AbstractBinderC8465a() { // from class: com.google.android.gms.maps.c.7
                    @Override // com.google.android.gms.maps.p247a.AbstractC8464n
                    /* renamed from: a */
                    public void mo11526a(AbstractC8576a abstractC8576a) {
                        abstractC8548w.m11495a(new C8617i(abstractC8576a));
                    }
                });
            }
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public final void m11584a(AbstractC8549x abstractC8549x) {
        m11583a(abstractC8549x, (Bitmap) null);
    }

    /* renamed from: a */
    public final void m11583a(final AbstractC8549x abstractC8549x, Bitmap bitmap) {
        try {
            this.f27362f.mo11803a(new AbstractC8482t.AbstractBinderC8483a() { // from class: com.google.android.gms.maps.c.8
                @Override // com.google.android.gms.maps.p247a.AbstractC8482t
                /* renamed from: a */
                public void mo11525a(Bitmap bitmap2) {
                    abstractC8549x.m11494a(bitmap2);
                }

                @Override // com.google.android.gms.maps.p247a.AbstractC8482t
                /* renamed from: a */
                public void mo11524a(AbstractC4170e abstractC4170e) {
                    abstractC8549x.m11494a((Bitmap) BinderC4173f.m25294a(abstractC4170e));
                }
            }, (BinderC4173f) (bitmap != null ? BinderC4173f.m25293a(bitmap) : null));
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public final void m11582a(final AbstractC8551d abstractC8551d) {
        try {
            if (abstractC8551d == null) {
                this.f27362f.mo11806a((AbstractC8437c) null);
            } else {
                this.f27362f.mo11806a(new AbstractC8437c.AbstractBinderC8438a() { // from class: com.google.android.gms.maps.c.4
                    @Override // com.google.android.gms.maps.p247a.AbstractC8437c
                    /* renamed from: a */
                    public void mo11530a() {
                        abstractC8551d.m11491a();
                    }

                    @Override // com.google.android.gms.maps.p247a.AbstractC8437c
                    /* renamed from: a */
                    public void mo11529a(final AbstractC8401ak abstractC8401ak) {
                        abstractC8551d.m11490a(new AbstractC8551d.AbstractC8552a() { // from class: com.google.android.gms.maps.c.4.1
                            @Override // com.google.android.gms.maps.AbstractC8551d.AbstractC8552a
                            /* renamed from: a */
                            public void mo11489a(Location location) {
                                try {
                                    abstractC8401ak.mo11848a(location);
                                } catch (RemoteException e) {
                                    throw new C8618j(e);
                                }
                            }
                        });
                    }
                });
            }
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public void m11579a(LatLngBounds latLngBounds) {
        try {
            this.f27362f.mo11798a(latLngBounds);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public final void m11573a(String str) {
        try {
            this.f27362f.mo11792a(str);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public final void m11572a(boolean z) {
        try {
            this.f27362f.mo11791a(z);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: a */
    public boolean m11578a(MapStyleOptions mapStyleOptions) {
        try {
            return this.f27362f.mo11797a(mapStyleOptions);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: b */
    public final float m11571b() {
        try {
            return this.f27362f.mo11789b();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: b */
    public void m11570b(float f) {
        try {
            this.f27362f.mo11788b(f);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: b */
    public final void m11569b(C8367a c8367a) {
        try {
            this.f27362f.mo11786b(c8367a.m11872a());
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: b */
    public final boolean m11568b(boolean z) {
        try {
            return this.f27362f.mo11785b(z);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: c */
    public final float m11567c() {
        try {
            return this.f27362f.mo11784c();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: c */
    public final void m11566c(boolean z) {
        try {
            this.f27362f.mo11780d(z);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: d */
    public final void m11565d() {
        try {
            this.f27362f.mo11781d();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: d */
    public final void m11564d(boolean z) {
        try {
            this.f27362f.mo11782c(z);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: e */
    public final void m11563e() {
        try {
            this.f27362f.mo11779e();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: f */
    public C8613e m11562f() {
        try {
            AbstractC8588e mo11769n = this.f27362f.mo11769n();
            if (mo11769n == null) {
                return null;
            }
            return new C8613e(mo11769n);
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: g */
    public final int m11561g() {
        try {
            return this.f27362f.mo11777f();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: h */
    public final boolean m11560h() {
        try {
            return this.f27362f.mo11776g();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: i */
    public final boolean m11559i() {
        try {
            return this.f27362f.mo11775h();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: j */
    public final boolean m11558j() {
        try {
            return this.f27362f.mo11770m();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: k */
    public final boolean m11557k() {
        try {
            return this.f27362f.mo11774i();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    @Deprecated
    /* renamed from: l */
    public final Location m11556l() {
        try {
            return this.f27362f.mo11773j();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: m */
    public final C8566j m11555m() {
        try {
            if (this.f27363g == null) {
                this.f27363g = new C8566j(this.f27362f.mo11772k());
            }
            return this.f27363g;
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: n */
    public final C8556h m11554n() {
        try {
            return new C8556h(this.f27362f.mo11771l());
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }

    /* renamed from: o */
    public void m11553o() {
        try {
            this.f27362f.mo11762u();
        } catch (RemoteException e) {
            throw new C8618j(e);
        }
    }
}
