package com.google.android.gms.maps.p247a;

import android.location.Location;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
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
import com.google.android.gms.maps.p247a.AbstractC8404al;
import com.google.android.gms.maps.p247a.AbstractC8407am;
import com.google.android.gms.maps.p247a.AbstractC8410an;
import com.google.android.gms.maps.p247a.AbstractC8413ao;
import com.google.android.gms.maps.p247a.AbstractC8416ap;
import com.google.android.gms.maps.p247a.AbstractC8419aq;
import com.google.android.gms.maps.p247a.AbstractC8422ar;
import com.google.android.gms.maps.p247a.AbstractC8425as;
import com.google.android.gms.maps.p247a.AbstractC8428at;
import com.google.android.gms.maps.p247a.AbstractC8431au;
import com.google.android.gms.maps.p247a.AbstractC8437c;
import com.google.android.gms.maps.p247a.AbstractC8446f;
import com.google.android.gms.maps.p247a.AbstractC8458j;
import com.google.android.gms.maps.p247a.AbstractC8464n;
import com.google.android.gms.maps.p247a.AbstractC8482t;
import com.google.android.gms.maps.p247a.AbstractC8487w;
import com.google.android.gms.maps.p247a.AbstractC8493y;
import com.google.android.gms.maps.p247a.AbstractC8496z;
import com.google.android.gms.p232c.AbstractC4170e;
/* renamed from: com.google.android.gms.maps.a.b */
/* loaded from: classes2.dex */
public interface AbstractC8434b extends IInterface {

    /* renamed from: com.google.android.gms.maps.a.b$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8435a extends Binder implements AbstractC8434b {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.google.android.gms.maps.a.b$a$a */
        /* loaded from: classes2.dex */
        public static class C8436a implements AbstractC8434b {

            /* renamed from: a */
            private IBinder f27334a;

            C8436a(IBinder iBinder) {
                this.f27334a = iBinder;
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: a */
            public CameraPosition mo11834a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.f27334a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (CameraPosition) CameraPosition.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: a */
            public AbstractC8576a mo11794a(PolylineOptions polylineOptions) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (polylineOptions != null) {
                        obtain.writeInt(1);
                        polylineOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f27334a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC8576a.AbstractBinderC8577a.m11255a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: a */
            public AbstractC8582c mo11800a(CircleOptions circleOptions) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (circleOptions != null) {
                        obtain.writeInt(1);
                        circleOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f27334a.transact(35, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC8582c.AbstractBinderC8583a.m11228a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: a */
            public AbstractC8585d mo11799a(GroundOverlayOptions groundOverlayOptions) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (groundOverlayOptions != null) {
                        obtain.writeInt(1);
                        groundOverlayOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f27334a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC8585d.AbstractBinderC8586a.m11207a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: a */
            public AbstractC8594g mo11796a(MarkerOptions markerOptions) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (markerOptions != null) {
                        obtain.writeInt(1);
                        markerOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f27334a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC8594g.AbstractBinderC8595a.m11170a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: a */
            public AbstractC8597h mo11795a(PolygonOptions polygonOptions) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (polygonOptions != null) {
                        obtain.writeInt(1);
                        polygonOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f27334a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC8597h.AbstractBinderC8598a.m11139a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: a */
            public AbstractC8600i mo11793a(TileOverlayOptions tileOverlayOptions) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (tileOverlayOptions != null) {
                        obtain.writeInt(1);
                        tileOverlayOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f27334a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC8600i.AbstractBinderC8601a.m11116a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: a */
            public void mo11833a(float f) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeFloat(f);
                    this.f27334a.transact(92, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: a */
            public void mo11832a(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeInt(i);
                    this.f27334a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: a */
            public void mo11831a(int i, int i2, int i3, int i4) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeInt(i4);
                    this.f27334a.transact(39, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: a */
            public void mo11830a(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f27334a.transact(54, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: a */
            public void mo11829a(AbstractC4170e abstractC4170e) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    this.f27334a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: a */
            public void mo11828a(AbstractC4170e abstractC4170e, int i, AbstractC8487w abstractC8487w) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    obtain.writeInt(i);
                    if (abstractC8487w != null) {
                        iBinder = abstractC8487w.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f27334a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: a */
            public void mo11827a(AbstractC4170e abstractC4170e, AbstractC8487w abstractC8487w) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    if (abstractC8487w != null) {
                        iBinder = abstractC8487w.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f27334a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: a */
            public void mo11826a(AbstractC8371aa abstractC8371aa) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(abstractC8371aa != null ? abstractC8371aa.asBinder() : null);
                    this.f27334a.transact(99, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: a */
            public void mo11825a(AbstractC8374ab abstractC8374ab) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(abstractC8374ab != null ? abstractC8374ab.asBinder() : null);
                    this.f27334a.transact(98, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: a */
            public void mo11824a(AbstractC8377ac abstractC8377ac) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(abstractC8377ac != null ? abstractC8377ac.asBinder() : null);
                    this.f27334a.transact(97, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: a */
            public void mo11823a(AbstractC8380ad abstractC8380ad) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(abstractC8380ad != null ? abstractC8380ad.asBinder() : null);
                    this.f27334a.transact(96, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: a */
            public void mo11822a(AbstractC8383ae abstractC8383ae) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(abstractC8383ae != null ? abstractC8383ae.asBinder() : null);
                    this.f27334a.transact(89, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: a */
            public void mo11821a(AbstractC8386af abstractC8386af) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(abstractC8386af != null ? abstractC8386af.asBinder() : null);
                    this.f27334a.transact(83, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: a */
            public void mo11820a(AbstractC8389ag abstractC8389ag) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(abstractC8389ag != null ? abstractC8389ag.asBinder() : null);
                    this.f27334a.transact(45, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: a */
            public void mo11819a(AbstractC8392ah abstractC8392ah) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(abstractC8392ah != null ? abstractC8392ah.asBinder() : null);
                    this.f27334a.transact(32, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: a */
            public void mo11818a(AbstractC8395ai abstractC8395ai) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(abstractC8395ai != null ? abstractC8395ai.asBinder() : null);
                    this.f27334a.transact(86, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: a */
            public void mo11817a(AbstractC8398aj abstractC8398aj) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(abstractC8398aj != null ? abstractC8398aj.asBinder() : null);
                    this.f27334a.transact(84, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: a */
            public void mo11816a(AbstractC8404al abstractC8404al) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(abstractC8404al != null ? abstractC8404al.asBinder() : null);
                    this.f27334a.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: a */
            public void mo11815a(AbstractC8407am abstractC8407am) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(abstractC8407am != null ? abstractC8407am.asBinder() : null);
                    this.f27334a.transact(42, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: a */
            public void mo11814a(AbstractC8410an abstractC8410an) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(abstractC8410an != null ? abstractC8410an.asBinder() : null);
                    this.f27334a.transact(29, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: a */
            public void mo11813a(AbstractC8413ao abstractC8413ao) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(abstractC8413ao != null ? abstractC8413ao.asBinder() : null);
                    this.f27334a.transact(53, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: a */
            public void mo11812a(AbstractC8416ap abstractC8416ap) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(abstractC8416ap != null ? abstractC8416ap.asBinder() : null);
                    this.f27334a.transact(30, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: a */
            public void mo11811a(AbstractC8419aq abstractC8419aq) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(abstractC8419aq != null ? abstractC8419aq.asBinder() : null);
                    this.f27334a.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: a */
            public void mo11810a(AbstractC8422ar abstractC8422ar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(abstractC8422ar != null ? abstractC8422ar.asBinder() : null);
                    this.f27334a.transact(37, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: a */
            public void mo11809a(AbstractC8425as abstractC8425as) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(abstractC8425as != null ? abstractC8425as.asBinder() : null);
                    this.f27334a.transact(36, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: a */
            public void mo11808a(AbstractC8428at abstractC8428at) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(abstractC8428at != null ? abstractC8428at.asBinder() : null);
                    this.f27334a.transact(80, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: a */
            public void mo11807a(AbstractC8431au abstractC8431au) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(abstractC8431au != null ? abstractC8431au.asBinder() : null);
                    this.f27334a.transact(85, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: a */
            public void mo11806a(AbstractC8437c abstractC8437c) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(abstractC8437c != null ? abstractC8437c.asBinder() : null);
                    this.f27334a.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: a */
            public void mo11805a(AbstractC8464n abstractC8464n) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(abstractC8464n != null ? abstractC8464n.asBinder() : null);
                    this.f27334a.transact(87, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: a */
            public void mo11804a(AbstractC8482t abstractC8482t) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(abstractC8482t != null ? abstractC8482t.asBinder() : null);
                    this.f27334a.transact(71, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: a */
            public void mo11803a(AbstractC8482t abstractC8482t, AbstractC4170e abstractC4170e) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(abstractC8482t != null ? abstractC8482t.asBinder() : null);
                    if (abstractC4170e != null) {
                        iBinder = abstractC4170e.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f27334a.transact(38, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: a */
            public void mo11802a(AbstractC8493y abstractC8493y) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(abstractC8493y != null ? abstractC8493y.asBinder() : null);
                    this.f27334a.transact(33, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: a */
            public void mo11801a(AbstractC8496z abstractC8496z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(abstractC8496z != null ? abstractC8496z.asBinder() : null);
                    this.f27334a.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: a */
            public void mo11798a(LatLngBounds latLngBounds) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (latLngBounds != null) {
                        obtain.writeInt(1);
                        latLngBounds.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f27334a.transact(95, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: a */
            public void mo11792a(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeString(str);
                    this.f27334a.transact(61, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: a */
            public void mo11791a(boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f27334a.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: a */
            public void mo11790a(byte[] bArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeByteArray(bArr);
                    this.f27334a.transact(90, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: a */
            public boolean mo11797a(MapStyleOptions mapStyleOptions) {
                boolean z = true;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (mapStyleOptions != null) {
                        obtain.writeInt(1);
                        mapStyleOptions.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f27334a.transact(91, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f27334a;
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: b */
            public float mo11789b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.f27334a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readFloat();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: b */
            public void mo11788b(float f) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeFloat(f);
                    this.f27334a.transact(93, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: b */
            public void mo11787b(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f27334a.transact(60, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        bundle.readFromParcel(obtain2);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: b */
            public void mo11786b(AbstractC4170e abstractC4170e) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeStrongBinder(abstractC4170e != null ? abstractC4170e.asBinder() : null);
                    this.f27334a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: b */
            public boolean mo11785b(boolean z) {
                boolean z2 = true;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    obtain.writeInt(z ? 1 : 0);
                    this.f27334a.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z2 = false;
                    }
                    return z2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: c */
            public float mo11784c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.f27334a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readFloat();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: c */
            public void mo11783c(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f27334a.transact(81, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: c */
            public void mo11782c(boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f27334a.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: d */
            public void mo11781d() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.f27334a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: d */
            public void mo11780d(boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f27334a.transact(41, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: e */
            public void mo11779e() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.f27334a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: e */
            public void mo11778e(boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f27334a.transact(51, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: f */
            public int mo11777f() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.f27334a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: g */
            public boolean mo11776g() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.f27334a.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: h */
            public boolean mo11775h() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.f27334a.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: i */
            public boolean mo11774i() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.f27334a.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: j */
            public Location mo11773j() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.f27334a.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Location) Location.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: k */
            public AbstractC8458j mo11772k() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.f27334a.transact(25, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC8458j.AbstractBinderC8459a.m11679a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: l */
            public AbstractC8446f mo11771l() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.f27334a.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC8446f.AbstractBinderC8447a.m11727a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: m */
            public boolean mo11770m() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.f27334a.transact(40, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: n */
            public AbstractC8588e mo11769n() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.f27334a.transact(44, obtain, obtain2, 0);
                    obtain2.readException();
                    return AbstractC8588e.AbstractBinderC8589a.m11183a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: o */
            public void mo11768o() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.f27334a.transact(55, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: p */
            public void mo11767p() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.f27334a.transact(56, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: q */
            public void mo11766q() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.f27334a.transact(57, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: r */
            public void mo11765r() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.f27334a.transact(58, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: s */
            public boolean mo11764s() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.f27334a.transact(59, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: t */
            public void mo11763t() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.f27334a.transact(82, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: u */
            public void mo11762u() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.f27334a.transact(94, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: v */
            public void mo11761v() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.f27334a.transact(101, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.maps.p247a.AbstractC8434b
            /* renamed from: w */
            public void mo11760w() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    this.f27334a.transact(102, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static AbstractC8434b m11835a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8434b)) ? new C8436a(iBinder) : (AbstractC8434b) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3 = 0;
            boolean z = false;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            boolean z2 = false;
            int i7 = 0;
            boolean z3 = false;
            boolean z4 = false;
            int i8 = 0;
            IBinder iBinder = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    CameraPosition a = a();
                    parcel2.writeNoException();
                    if (a == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    a.writeToParcel(parcel2, 1);
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    float b = b();
                    parcel2.writeNoException();
                    parcel2.writeFloat(b);
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    float c = c();
                    parcel2.writeNoException();
                    parcel2.writeFloat(c);
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    b(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), AbstractC8487w.AbstractBinderC8488a.m11638a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    a(AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()), parcel.readInt(), AbstractC8487w.AbstractBinderC8488a.m11638a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    d();
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    AbstractC8576a a2 = a(parcel.readInt() != 0 ? (PolylineOptions) PolylineOptions.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (a2 != null) {
                        iBinder = a2.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 10:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    AbstractC8597h a3 = a(parcel.readInt() != 0 ? (PolygonOptions) PolygonOptions.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (a3 != null) {
                        iBinder = a3.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 11:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    AbstractC8594g a4 = a(parcel.readInt() != 0 ? (MarkerOptions) MarkerOptions.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (a4 != null) {
                        iBinder = a4.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 12:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    AbstractC8585d a5 = a(parcel.readInt() != 0 ? (GroundOverlayOptions) GroundOverlayOptions.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (a5 != null) {
                        iBinder = a5.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 13:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    AbstractC8600i a6 = a(parcel.readInt() != 0 ? (TileOverlayOptions) TileOverlayOptions.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (a6 != null) {
                        iBinder = a6.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 14:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    e();
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    int f = f();
                    parcel2.writeNoException();
                    parcel2.writeInt(f);
                    return true;
                case 16:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    a(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 17:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    boolean g = g();
                    parcel2.writeNoException();
                    parcel2.writeInt(g ? 1 : 0);
                    return true;
                case 18:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    a(z);
                    parcel2.writeNoException();
                    return true;
                case 19:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    boolean h = h();
                    parcel2.writeNoException();
                    if (h) {
                        i4 = 1;
                    }
                    parcel2.writeInt(i4);
                    return true;
                case 20:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    boolean b2 = b(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    if (b2) {
                        i5 = 1;
                    }
                    parcel2.writeInt(i5);
                    return true;
                case 21:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    boolean i9 = i();
                    parcel2.writeNoException();
                    if (i9) {
                        i6 = 1;
                    }
                    parcel2.writeInt(i6);
                    return true;
                case 22:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (parcel.readInt() != 0) {
                        z2 = true;
                    }
                    c(z2);
                    parcel2.writeNoException();
                    return true;
                case 23:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    Location j = j();
                    parcel2.writeNoException();
                    if (j == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    j.writeToParcel(parcel2, 1);
                    return true;
                case 24:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    a(AbstractC8437c.AbstractBinderC8438a.m11759a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 25:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    AbstractC8458j k = k();
                    parcel2.writeNoException();
                    if (k != null) {
                        iBinder = k.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 26:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    AbstractC8446f l = l();
                    parcel2.writeNoException();
                    if (l != null) {
                        iBinder = l.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 27:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    a(AbstractC8496z.AbstractBinderC8497a.m11627a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 28:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    a(AbstractC8404al.AbstractBinderC8405a.m11846a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 29:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    a(AbstractC8410an.AbstractBinderC8411a.m11844a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 30:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    a(AbstractC8416ap.AbstractBinderC8417a.m11841a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 31:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    a(AbstractC8419aq.AbstractBinderC8420a.m11840a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 32:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    a(AbstractC8392ah.AbstractBinderC8393a.m11852a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 33:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    a(AbstractC8493y.AbstractBinderC8494a.m11628a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 35:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    AbstractC8582c a7 = a(parcel.readInt() != 0 ? (CircleOptions) CircleOptions.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (a7 != null) {
                        iBinder = a7.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 36:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    a(AbstractC8425as.AbstractBinderC8426a.m11838a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 37:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    a(AbstractC8422ar.AbstractBinderC8423a.m11839a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 38:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    a(AbstractC8482t.AbstractBinderC8483a.m11648a(parcel.readStrongBinder()), AbstractC4170e.AbstractBinderC4171a.m25295a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 39:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    a(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 40:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    boolean m = m();
                    parcel2.writeNoException();
                    if (m) {
                        i7 = 1;
                    }
                    parcel2.writeInt(i7);
                    return true;
                case 41:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (parcel.readInt() != 0) {
                        z3 = true;
                    }
                    d(z3);
                    parcel2.writeNoException();
                    return true;
                case 42:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    a(AbstractC8407am.AbstractBinderC8408a.m11845a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 44:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    AbstractC8588e n = n();
                    parcel2.writeNoException();
                    if (n != null) {
                        iBinder = n.asBinder();
                    }
                    parcel2.writeStrongBinder(iBinder);
                    return true;
                case 45:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    a(AbstractC8389ag.AbstractBinderC8390a.m11853a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 51:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (parcel.readInt() != 0) {
                        z4 = true;
                    }
                    e(z4);
                    parcel2.writeNoException();
                    return true;
                case 53:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    a(AbstractC8413ao.AbstractBinderC8414a.m11843a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 54:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    a(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 55:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    o();
                    parcel2.writeNoException();
                    return true;
                case 56:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    p();
                    parcel2.writeNoException();
                    return true;
                case 57:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    q();
                    parcel2.writeNoException();
                    return true;
                case 58:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    r();
                    parcel2.writeNoException();
                    return true;
                case 59:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    boolean s = s();
                    parcel2.writeNoException();
                    if (s) {
                        i8 = 1;
                    }
                    parcel2.writeInt(i8);
                    return true;
                case 60:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    Bundle bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                    b(bundle);
                    parcel2.writeNoException();
                    if (bundle == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    bundle.writeToParcel(parcel2, 1);
                    return true;
                case 61:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    a(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 71:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    a(AbstractC8482t.AbstractBinderC8483a.m11648a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 80:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    a(AbstractC8428at.AbstractBinderC8429a.m11837a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 81:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    c(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 82:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    t();
                    parcel2.writeNoException();
                    return true;
                case 83:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    a(AbstractC8386af.AbstractBinderC8387a.m11854a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 84:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    a(AbstractC8398aj.AbstractBinderC8399a.m11850a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 85:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    a(AbstractC8431au.AbstractBinderC8432a.m11836a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 86:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    a(AbstractC8395ai.AbstractBinderC8396a.m11851a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 87:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    a(AbstractC8464n.AbstractBinderC8465a.m11655a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 89:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    a(AbstractC8383ae.AbstractBinderC8384a.m11855a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 90:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    a(parcel.createByteArray());
                    parcel2.writeNoException();
                    return true;
                case 91:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    boolean a8 = a(parcel.readInt() != 0 ? (MapStyleOptions) MapStyleOptions.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (a8) {
                        i3 = 1;
                    }
                    parcel2.writeInt(i3);
                    return true;
                case 92:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    a(parcel.readFloat());
                    parcel2.writeNoException();
                    return true;
                case 93:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    b(parcel.readFloat());
                    parcel2.writeNoException();
                    return true;
                case 94:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    u();
                    parcel2.writeNoException();
                    return true;
                case 95:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    a(parcel.readInt() != 0 ? (LatLngBounds) LatLngBounds.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 96:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    a(AbstractC8380ad.AbstractBinderC8381a.m11856a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 97:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    a(AbstractC8377ac.AbstractBinderC8378a.m11857a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 98:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    a(AbstractC8374ab.AbstractBinderC8375a.m11858a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 99:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    a(AbstractC8371aa.AbstractBinderC8372a.m11859a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 101:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    v();
                    parcel2.writeNoException();
                    return true;
                case 102:
                    parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    w();
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    CameraPosition mo11834a();

    /* renamed from: a */
    AbstractC8576a mo11794a(PolylineOptions polylineOptions);

    /* renamed from: a */
    AbstractC8582c mo11800a(CircleOptions circleOptions);

    /* renamed from: a */
    AbstractC8585d mo11799a(GroundOverlayOptions groundOverlayOptions);

    /* renamed from: a */
    AbstractC8594g mo11796a(MarkerOptions markerOptions);

    /* renamed from: a */
    AbstractC8597h mo11795a(PolygonOptions polygonOptions);

    /* renamed from: a */
    AbstractC8600i mo11793a(TileOverlayOptions tileOverlayOptions);

    /* renamed from: a */
    void mo11833a(float f);

    /* renamed from: a */
    void mo11832a(int i);

    /* renamed from: a */
    void mo11831a(int i, int i2, int i3, int i4);

    /* renamed from: a */
    void mo11830a(Bundle bundle);

    /* renamed from: a */
    void mo11829a(AbstractC4170e abstractC4170e);

    /* renamed from: a */
    void mo11828a(AbstractC4170e abstractC4170e, int i, AbstractC8487w abstractC8487w);

    /* renamed from: a */
    void mo11827a(AbstractC4170e abstractC4170e, AbstractC8487w abstractC8487w);

    /* renamed from: a */
    void mo11826a(AbstractC8371aa abstractC8371aa);

    /* renamed from: a */
    void mo11825a(AbstractC8374ab abstractC8374ab);

    /* renamed from: a */
    void mo11824a(AbstractC8377ac abstractC8377ac);

    /* renamed from: a */
    void mo11823a(AbstractC8380ad abstractC8380ad);

    /* renamed from: a */
    void mo11822a(AbstractC8383ae abstractC8383ae);

    /* renamed from: a */
    void mo11821a(AbstractC8386af abstractC8386af);

    /* renamed from: a */
    void mo11820a(AbstractC8389ag abstractC8389ag);

    /* renamed from: a */
    void mo11819a(AbstractC8392ah abstractC8392ah);

    /* renamed from: a */
    void mo11818a(AbstractC8395ai abstractC8395ai);

    /* renamed from: a */
    void mo11817a(AbstractC8398aj abstractC8398aj);

    /* renamed from: a */
    void mo11816a(AbstractC8404al abstractC8404al);

    /* renamed from: a */
    void mo11815a(AbstractC8407am abstractC8407am);

    /* renamed from: a */
    void mo11814a(AbstractC8410an abstractC8410an);

    /* renamed from: a */
    void mo11813a(AbstractC8413ao abstractC8413ao);

    /* renamed from: a */
    void mo11812a(AbstractC8416ap abstractC8416ap);

    /* renamed from: a */
    void mo11811a(AbstractC8419aq abstractC8419aq);

    /* renamed from: a */
    void mo11810a(AbstractC8422ar abstractC8422ar);

    /* renamed from: a */
    void mo11809a(AbstractC8425as abstractC8425as);

    /* renamed from: a */
    void mo11808a(AbstractC8428at abstractC8428at);

    /* renamed from: a */
    void mo11807a(AbstractC8431au abstractC8431au);

    /* renamed from: a */
    void mo11806a(AbstractC8437c abstractC8437c);

    /* renamed from: a */
    void mo11805a(AbstractC8464n abstractC8464n);

    /* renamed from: a */
    void mo11804a(AbstractC8482t abstractC8482t);

    /* renamed from: a */
    void mo11803a(AbstractC8482t abstractC8482t, AbstractC4170e abstractC4170e);

    /* renamed from: a */
    void mo11802a(AbstractC8493y abstractC8493y);

    /* renamed from: a */
    void mo11801a(AbstractC8496z abstractC8496z);

    /* renamed from: a */
    void mo11798a(LatLngBounds latLngBounds);

    /* renamed from: a */
    void mo11792a(String str);

    /* renamed from: a */
    void mo11791a(boolean z);

    /* renamed from: a */
    void mo11790a(byte[] bArr);

    /* renamed from: a */
    boolean mo11797a(MapStyleOptions mapStyleOptions);

    /* renamed from: b */
    float mo11789b();

    /* renamed from: b */
    void mo11788b(float f);

    /* renamed from: b */
    void mo11787b(Bundle bundle);

    /* renamed from: b */
    void mo11786b(AbstractC4170e abstractC4170e);

    /* renamed from: b */
    boolean mo11785b(boolean z);

    /* renamed from: c */
    float mo11784c();

    /* renamed from: c */
    void mo11783c(Bundle bundle);

    /* renamed from: c */
    void mo11782c(boolean z);

    /* renamed from: d */
    void mo11781d();

    /* renamed from: d */
    void mo11780d(boolean z);

    /* renamed from: e */
    void mo11779e();

    /* renamed from: e */
    void mo11778e(boolean z);

    /* renamed from: f */
    int mo11777f();

    /* renamed from: g */
    boolean mo11776g();

    /* renamed from: h */
    boolean mo11775h();

    /* renamed from: i */
    boolean mo11774i();

    /* renamed from: j */
    Location mo11773j();

    /* renamed from: k */
    AbstractC8458j mo11772k();

    /* renamed from: l */
    AbstractC8446f mo11771l();

    /* renamed from: m */
    boolean mo11770m();

    /* renamed from: n */
    AbstractC8588e mo11769n();

    /* renamed from: o */
    void mo11768o();

    /* renamed from: p */
    void mo11767p();

    /* renamed from: q */
    void mo11766q();

    /* renamed from: r */
    void mo11765r();

    /* renamed from: s */
    boolean mo11764s();

    /* renamed from: t */
    void mo11763t();

    /* renamed from: u */
    void mo11762u();

    /* renamed from: v */
    void mo11761v();

    /* renamed from: w */
    void mo11760w();
}
