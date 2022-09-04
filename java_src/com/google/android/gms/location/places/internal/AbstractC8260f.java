package com.google.android.gms.location.places.internal;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.location.places.NearbyAlertRequest;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.PlaceRequest;
import com.google.android.gms.location.places.internal.AbstractC8269i;
/* renamed from: com.google.android.gms.location.places.internal.f */
/* loaded from: classes2.dex */
public interface AbstractC8260f extends IInterface {

    /* renamed from: com.google.android.gms.location.places.internal.f$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8261a extends Binder implements AbstractC8260f {

        /* renamed from: com.google.android.gms.location.places.internal.f$a$a */
        /* loaded from: classes2.dex */
        private static class C8262a implements AbstractC8260f {

            /* renamed from: a */
            private IBinder f27132a;

            C8262a(IBinder iBinder) {
                this.f27132a = iBinder;
            }

            @Override // com.google.android.gms.location.places.internal.AbstractC8260f
            /* renamed from: a */
            public void mo12246a(NearbyAlertRequest nearbyAlertRequest, PlacesParams placesParams, PendingIntent pendingIntent, AbstractC8269i abstractC8269i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                    if (nearbyAlertRequest != null) {
                        obtain.writeInt(1);
                        nearbyAlertRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (placesParams != null) {
                        obtain.writeInt(1);
                        placesParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC8269i != null ? abstractC8269i.asBinder() : null);
                    this.f27132a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.places.internal.AbstractC8260f
            /* renamed from: a */
            public void mo12245a(PlaceFilter placeFilter, PlacesParams placesParams, AbstractC8269i abstractC8269i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                    if (placeFilter != null) {
                        obtain.writeInt(1);
                        placeFilter.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (placesParams != null) {
                        obtain.writeInt(1);
                        placesParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC8269i != null ? abstractC8269i.asBinder() : null);
                    this.f27132a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.places.internal.AbstractC8260f
            /* renamed from: a */
            public void mo12244a(PlaceReport placeReport, PlacesParams placesParams, AbstractC8269i abstractC8269i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                    if (placeReport != null) {
                        obtain.writeInt(1);
                        placeReport.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (placesParams != null) {
                        obtain.writeInt(1);
                        placesParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC8269i != null ? abstractC8269i.asBinder() : null);
                    this.f27132a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.places.internal.AbstractC8260f
            /* renamed from: a */
            public void mo12243a(PlaceRequest placeRequest, PlacesParams placesParams, PendingIntent pendingIntent, AbstractC8269i abstractC8269i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                    if (placeRequest != null) {
                        obtain.writeInt(1);
                        placeRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (placesParams != null) {
                        obtain.writeInt(1);
                        placesParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC8269i != null ? abstractC8269i.asBinder() : null);
                    this.f27132a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.places.internal.AbstractC8260f
            /* renamed from: a */
            public void mo12242a(PlacesParams placesParams, PendingIntent pendingIntent, AbstractC8269i abstractC8269i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                    if (placesParams != null) {
                        obtain.writeInt(1);
                        placesParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC8269i != null ? abstractC8269i.asBinder() : null);
                    this.f27132a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f27132a;
            }

            @Override // com.google.android.gms.location.places.internal.AbstractC8260f
            /* renamed from: b */
            public void mo12241b(PlacesParams placesParams, PendingIntent pendingIntent, AbstractC8269i abstractC8269i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                    if (placesParams != null) {
                        obtain.writeInt(1);
                        placesParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC8269i != null ? abstractC8269i.asBinder() : null);
                    this.f27132a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static AbstractC8260f m12247a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8260f)) ? new C8262a(iBinder) : (AbstractC8260f) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                    a(parcel.readInt() != 0 ? PlaceRequest.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (PlacesParams) PlacesParams.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, AbstractC8269i.AbstractBinderC8270a.m12215a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                    a(parcel.readInt() != 0 ? (PlacesParams) PlacesParams.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, AbstractC8269i.AbstractBinderC8270a.m12215a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                    a(parcel.readInt() != 0 ? (NearbyAlertRequest) NearbyAlertRequest.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (PlacesParams) PlacesParams.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, AbstractC8269i.AbstractBinderC8270a.m12215a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                    b(parcel.readInt() != 0 ? (PlacesParams) PlacesParams.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, AbstractC8269i.AbstractBinderC8270a.m12215a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                    a(parcel.readInt() != 0 ? (PlaceFilter) PlaceFilter.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (PlacesParams) PlacesParams.CREATOR.createFromParcel(parcel) : null, AbstractC8269i.AbstractBinderC8270a.m12215a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                    a(parcel.readInt() != 0 ? PlaceReport.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (PlacesParams) PlacesParams.CREATOR.createFromParcel(parcel) : null, AbstractC8269i.AbstractBinderC8270a.m12215a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.location.places.internal.IGooglePlaceDetectionService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo12246a(NearbyAlertRequest nearbyAlertRequest, PlacesParams placesParams, PendingIntent pendingIntent, AbstractC8269i abstractC8269i);

    /* renamed from: a */
    void mo12245a(PlaceFilter placeFilter, PlacesParams placesParams, AbstractC8269i abstractC8269i);

    /* renamed from: a */
    void mo12244a(PlaceReport placeReport, PlacesParams placesParams, AbstractC8269i abstractC8269i);

    /* renamed from: a */
    void mo12243a(PlaceRequest placeRequest, PlacesParams placesParams, PendingIntent pendingIntent, AbstractC8269i abstractC8269i);

    /* renamed from: a */
    void mo12242a(PlacesParams placesParams, PendingIntent pendingIntent, AbstractC8269i abstractC8269i);

    /* renamed from: b */
    void mo12241b(PlacesParams placesParams, PendingIntent pendingIntent, AbstractC8269i abstractC8269i);
}
