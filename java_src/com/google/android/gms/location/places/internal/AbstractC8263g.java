package com.google.android.gms.location.places.internal;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.location.places.AddPlaceRequest;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.NearbyAlertRequest;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.PlaceRequest;
import com.google.android.gms.location.places.UserDataType;
import com.google.android.gms.location.places.internal.AbstractC8266h;
import com.google.android.gms.location.places.internal.AbstractC8269i;
import com.google.android.gms.location.places.personalized.AbstractC8300c;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;
/* renamed from: com.google.android.gms.location.places.internal.g */
/* loaded from: classes2.dex */
public interface AbstractC8263g extends IInterface {

    /* renamed from: com.google.android.gms.location.places.internal.g$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8264a extends Binder implements AbstractC8263g {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.google.android.gms.location.places.internal.g$a$a */
        /* loaded from: classes2.dex */
        public static class C8265a implements AbstractC8263g {

            /* renamed from: a */
            private IBinder f27133a;

            C8265a(IBinder iBinder) {
                this.f27133a = iBinder;
            }

            @Override // com.google.android.gms.location.places.internal.AbstractC8263g
            /* renamed from: a */
            public void mo12239a(AddPlaceRequest addPlaceRequest, PlacesParams placesParams, AbstractC8269i abstractC8269i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    if (addPlaceRequest != null) {
                        obtain.writeInt(1);
                        addPlaceRequest.writeToParcel(obtain, 0);
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
                    this.f27133a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.places.internal.AbstractC8263g
            /* renamed from: a */
            public void mo12238a(NearbyAlertRequest nearbyAlertRequest, PlacesParams placesParams, PendingIntent pendingIntent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
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
                    this.f27133a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.places.internal.AbstractC8263g
            /* renamed from: a */
            public void mo12237a(PlaceFilter placeFilter, PlacesParams placesParams, AbstractC8269i abstractC8269i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
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
                    this.f27133a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.places.internal.AbstractC8263g
            /* renamed from: a */
            public void mo12236a(PlaceReport placeReport, PlacesParams placesParams) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
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
                    this.f27133a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.places.internal.AbstractC8263g
            /* renamed from: a */
            public void mo12235a(PlaceRequest placeRequest, PlacesParams placesParams, PendingIntent pendingIntent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
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
                    this.f27133a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.places.internal.AbstractC8263g
            /* renamed from: a */
            public void mo12234a(UserDataType userDataType, LatLngBounds latLngBounds, List<String> list, PlacesParams placesParams, AbstractC8269i abstractC8269i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    if (userDataType != null) {
                        obtain.writeInt(1);
                        userDataType.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (latLngBounds != null) {
                        obtain.writeInt(1);
                        latLngBounds.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStringList(list);
                    if (placesParams != null) {
                        obtain.writeInt(1);
                        placesParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC8269i != null ? abstractC8269i.asBinder() : null);
                    this.f27133a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.places.internal.AbstractC8263g
            /* renamed from: a */
            public void mo12233a(PlacesParams placesParams, PendingIntent pendingIntent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
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
                    this.f27133a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.places.internal.AbstractC8263g
            /* renamed from: a */
            public void mo12232a(PlacesParams placesParams, AbstractC8269i abstractC8269i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    if (placesParams != null) {
                        obtain.writeInt(1);
                        placesParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC8269i != null ? abstractC8269i.asBinder() : null);
                    this.f27133a.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.places.internal.AbstractC8263g
            /* renamed from: a */
            public void mo12231a(PlacesParams placesParams, AbstractC8300c abstractC8300c) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    if (placesParams != null) {
                        obtain.writeInt(1);
                        placesParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC8300c != null ? abstractC8300c.asBinder() : null);
                    this.f27133a.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.places.internal.AbstractC8263g
            /* renamed from: a */
            public void mo12230a(LatLng latLng, PlaceFilter placeFilter, PlacesParams placesParams, AbstractC8269i abstractC8269i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    if (latLng != null) {
                        obtain.writeInt(1);
                        latLng.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
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
                    this.f27133a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.places.internal.AbstractC8263g
            /* renamed from: a */
            public void mo12229a(LatLng latLng, PlacesParams placesParams, AbstractC8269i abstractC8269i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    if (latLng != null) {
                        obtain.writeInt(1);
                        latLng.writeToParcel(obtain, 0);
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
                    this.f27133a.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.places.internal.AbstractC8263g
            /* renamed from: a */
            public void mo12228a(LatLngBounds latLngBounds, int i, String str, PlaceFilter placeFilter, PlacesParams placesParams, AbstractC8269i abstractC8269i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    if (latLngBounds != null) {
                        obtain.writeInt(1);
                        latLngBounds.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    obtain.writeString(str);
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
                    this.f27133a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.places.internal.AbstractC8263g
            /* renamed from: a */
            public void mo12227a(String str, int i, int i2, int i3, PlacesParams placesParams, AbstractC8266h abstractC8266h) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    if (placesParams != null) {
                        obtain.writeInt(1);
                        placesParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC8266h != null ? abstractC8266h.asBinder() : null);
                    this.f27133a.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.places.internal.AbstractC8263g
            /* renamed from: a */
            public void mo12226a(String str, int i, PlacesParams placesParams, AbstractC8269i abstractC8269i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    if (placesParams != null) {
                        obtain.writeInt(1);
                        placesParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC8269i != null ? abstractC8269i.asBinder() : null);
                    this.f27133a.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.places.internal.AbstractC8263g
            /* renamed from: a */
            public void mo12225a(String str, PlacesParams placesParams, AbstractC8266h abstractC8266h) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    obtain.writeString(str);
                    if (placesParams != null) {
                        obtain.writeInt(1);
                        placesParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC8266h != null ? abstractC8266h.asBinder() : null);
                    this.f27133a.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.places.internal.AbstractC8263g
            /* renamed from: a */
            public void mo12224a(String str, PlacesParams placesParams, AbstractC8269i abstractC8269i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    obtain.writeString(str);
                    if (placesParams != null) {
                        obtain.writeInt(1);
                        placesParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC8269i != null ? abstractC8269i.asBinder() : null);
                    this.f27133a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.places.internal.AbstractC8263g
            /* renamed from: a */
            public void mo12223a(String str, LatLngBounds latLngBounds, AutocompleteFilter autocompleteFilter, PlacesParams placesParams, AbstractC8269i abstractC8269i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    obtain.writeString(str);
                    if (latLngBounds != null) {
                        obtain.writeInt(1);
                        latLngBounds.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (autocompleteFilter != null) {
                        obtain.writeInt(1);
                        autocompleteFilter.writeToParcel(obtain, 0);
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
                    this.f27133a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.places.internal.AbstractC8263g
            /* renamed from: a */
            public void mo12222a(String str, String str2, PlacesParams placesParams, AbstractC8300c abstractC8300c) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (placesParams != null) {
                        obtain.writeInt(1);
                        placesParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC8300c != null ? abstractC8300c.asBinder() : null);
                    this.f27133a.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.places.internal.AbstractC8263g
            /* renamed from: a */
            public void mo12221a(String str, String str2, String str3, PlacesParams placesParams, AbstractC8300c abstractC8300c) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    if (placesParams != null) {
                        obtain.writeInt(1);
                        placesParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC8300c != null ? abstractC8300c.asBinder() : null);
                    this.f27133a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.places.internal.AbstractC8263g
            /* renamed from: a */
            public void mo12220a(List<String> list, PlacesParams placesParams, AbstractC8269i abstractC8269i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    obtain.writeStringList(list);
                    if (placesParams != null) {
                        obtain.writeInt(1);
                        placesParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC8269i != null ? abstractC8269i.asBinder() : null);
                    this.f27133a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f27133a;
            }

            @Override // com.google.android.gms.location.places.internal.AbstractC8263g
            /* renamed from: b */
            public void mo12219b(PlacesParams placesParams, PendingIntent pendingIntent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
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
                    this.f27133a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.places.internal.AbstractC8263g
            /* renamed from: b */
            public void mo12218b(PlacesParams placesParams, AbstractC8300c abstractC8300c) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    if (placesParams != null) {
                        obtain.writeInt(1);
                        placesParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC8300c != null ? abstractC8300c.asBinder() : null);
                    this.f27133a.transact(25, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.places.internal.AbstractC8263g
            /* renamed from: b */
            public void mo12217b(List<String> list, PlacesParams placesParams, AbstractC8269i abstractC8269i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    obtain.writeStringList(list);
                    if (placesParams != null) {
                        obtain.writeInt(1);
                        placesParams.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC8269i != null ? abstractC8269i.asBinder() : null);
                    this.f27133a.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static AbstractC8263g m12240a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8263g)) ? new C8265a(iBinder) : (AbstractC8263g) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            PlacesParams placesParams = null;
            switch (i) {
                case 2:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    LatLngBounds latLngBounds = parcel.readInt() != 0 ? (LatLngBounds) LatLngBounds.CREATOR.createFromParcel(parcel) : null;
                    int readInt = parcel.readInt();
                    String readString = parcel.readString();
                    PlaceFilter placeFilter = parcel.readInt() != 0 ? (PlaceFilter) PlaceFilter.CREATOR.createFromParcel(parcel) : null;
                    if (parcel.readInt() != 0) {
                        placesParams = (PlacesParams) PlacesParams.CREATOR.createFromParcel(parcel);
                    }
                    a(latLngBounds, readInt, readString, placeFilter, placesParams, AbstractC8269i.AbstractBinderC8270a.m12215a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    a(parcel.readInt() != 0 ? (LatLng) LatLng.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (PlaceFilter) PlaceFilter.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (PlacesParams) PlacesParams.CREATOR.createFromParcel(parcel) : null, AbstractC8269i.AbstractBinderC8270a.m12215a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    a(parcel.readInt() != 0 ? (PlaceFilter) PlaceFilter.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (PlacesParams) PlacesParams.CREATOR.createFromParcel(parcel) : null, AbstractC8269i.AbstractBinderC8270a.m12215a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    a(parcel.readString(), parcel.readInt() != 0 ? (PlacesParams) PlacesParams.CREATOR.createFromParcel(parcel) : null, AbstractC8269i.AbstractBinderC8270a.m12215a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    a(parcel.createStringArrayList(), parcel.readInt() != 0 ? (PlacesParams) PlacesParams.CREATOR.createFromParcel(parcel) : null, AbstractC8269i.AbstractBinderC8270a.m12215a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    a(parcel.readInt() != 0 ? (UserDataType) UserDataType.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (LatLngBounds) LatLngBounds.CREATOR.createFromParcel(parcel) : null, parcel.createStringArrayList(), parcel.readInt() != 0 ? (PlacesParams) PlacesParams.CREATOR.createFromParcel(parcel) : null, AbstractC8269i.AbstractBinderC8270a.m12215a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    a(parcel.readInt() != 0 ? PlaceRequest.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (PlacesParams) PlacesParams.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    a(parcel.readInt() != 0 ? (PlacesParams) PlacesParams.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 11:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    a(parcel.readInt() != 0 ? (NearbyAlertRequest) NearbyAlertRequest.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (PlacesParams) PlacesParams.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    b(parcel.readInt() != 0 ? (PlacesParams) PlacesParams.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    a(parcel.readString(), parcel.readInt() != 0 ? (LatLngBounds) LatLngBounds.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (AutocompleteFilter) AutocompleteFilter.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (PlacesParams) PlacesParams.CREATOR.createFromParcel(parcel) : null, AbstractC8269i.AbstractBinderC8270a.m12215a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    a(parcel.readInt() != 0 ? AddPlaceRequest.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (PlacesParams) PlacesParams.CREATOR.createFromParcel(parcel) : null, AbstractC8269i.AbstractBinderC8270a.m12215a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    a(parcel.readInt() != 0 ? PlaceReport.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (PlacesParams) PlacesParams.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (PlacesParams) PlacesParams.CREATOR.createFromParcel(parcel) : null, AbstractC8300c.AbstractBinderC8301a.m12123a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 17:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    b(parcel.createStringArrayList(), parcel.readInt() != 0 ? (PlacesParams) PlacesParams.CREATOR.createFromParcel(parcel) : null, AbstractC8269i.AbstractBinderC8270a.m12215a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 18:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    a(parcel.readString(), parcel.readInt(), parcel.readInt() != 0 ? (PlacesParams) PlacesParams.CREATOR.createFromParcel(parcel) : null, AbstractC8269i.AbstractBinderC8270a.m12215a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 19:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    a(parcel.readString(), parcel.readInt() != 0 ? (PlacesParams) PlacesParams.CREATOR.createFromParcel(parcel) : null, AbstractC8266h.AbstractBinderC8267a.m12216a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 20:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    String readString2 = parcel.readString();
                    int readInt2 = parcel.readInt();
                    int readInt3 = parcel.readInt();
                    int readInt4 = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        placesParams = (PlacesParams) PlacesParams.CREATOR.createFromParcel(parcel);
                    }
                    a(readString2, readInt2, readInt3, readInt4, placesParams, AbstractC8266h.AbstractBinderC8267a.m12216a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 21:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    a(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (PlacesParams) PlacesParams.CREATOR.createFromParcel(parcel) : null, AbstractC8300c.AbstractBinderC8301a.m12123a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 22:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    a(parcel.readInt() != 0 ? (LatLng) LatLng.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (PlacesParams) PlacesParams.CREATOR.createFromParcel(parcel) : null, AbstractC8269i.AbstractBinderC8270a.m12215a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 23:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    a(parcel.readInt() != 0 ? (PlacesParams) PlacesParams.CREATOR.createFromParcel(parcel) : null, AbstractC8269i.AbstractBinderC8270a.m12215a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 24:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    a(parcel.readInt() != 0 ? (PlacesParams) PlacesParams.CREATOR.createFromParcel(parcel) : null, AbstractC8300c.AbstractBinderC8301a.m12123a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 25:
                    parcel.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    b(parcel.readInt() != 0 ? (PlacesParams) PlacesParams.CREATOR.createFromParcel(parcel) : null, AbstractC8300c.AbstractBinderC8301a.m12123a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.location.places.internal.IGooglePlacesService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo12239a(AddPlaceRequest addPlaceRequest, PlacesParams placesParams, AbstractC8269i abstractC8269i);

    /* renamed from: a */
    void mo12238a(NearbyAlertRequest nearbyAlertRequest, PlacesParams placesParams, PendingIntent pendingIntent);

    /* renamed from: a */
    void mo12237a(PlaceFilter placeFilter, PlacesParams placesParams, AbstractC8269i abstractC8269i);

    /* renamed from: a */
    void mo12236a(PlaceReport placeReport, PlacesParams placesParams);

    /* renamed from: a */
    void mo12235a(PlaceRequest placeRequest, PlacesParams placesParams, PendingIntent pendingIntent);

    /* renamed from: a */
    void mo12234a(UserDataType userDataType, LatLngBounds latLngBounds, List<String> list, PlacesParams placesParams, AbstractC8269i abstractC8269i);

    /* renamed from: a */
    void mo12233a(PlacesParams placesParams, PendingIntent pendingIntent);

    /* renamed from: a */
    void mo12232a(PlacesParams placesParams, AbstractC8269i abstractC8269i);

    /* renamed from: a */
    void mo12231a(PlacesParams placesParams, AbstractC8300c abstractC8300c);

    /* renamed from: a */
    void mo12230a(LatLng latLng, PlaceFilter placeFilter, PlacesParams placesParams, AbstractC8269i abstractC8269i);

    /* renamed from: a */
    void mo12229a(LatLng latLng, PlacesParams placesParams, AbstractC8269i abstractC8269i);

    /* renamed from: a */
    void mo12228a(LatLngBounds latLngBounds, int i, String str, PlaceFilter placeFilter, PlacesParams placesParams, AbstractC8269i abstractC8269i);

    /* renamed from: a */
    void mo12227a(String str, int i, int i2, int i3, PlacesParams placesParams, AbstractC8266h abstractC8266h);

    /* renamed from: a */
    void mo12226a(String str, int i, PlacesParams placesParams, AbstractC8269i abstractC8269i);

    /* renamed from: a */
    void mo12225a(String str, PlacesParams placesParams, AbstractC8266h abstractC8266h);

    /* renamed from: a */
    void mo12224a(String str, PlacesParams placesParams, AbstractC8269i abstractC8269i);

    /* renamed from: a */
    void mo12223a(String str, LatLngBounds latLngBounds, AutocompleteFilter autocompleteFilter, PlacesParams placesParams, AbstractC8269i abstractC8269i);

    /* renamed from: a */
    void mo12222a(String str, String str2, PlacesParams placesParams, AbstractC8300c abstractC8300c);

    /* renamed from: a */
    void mo12221a(String str, String str2, String str3, PlacesParams placesParams, AbstractC8300c abstractC8300c);

    /* renamed from: a */
    void mo12220a(List<String> list, PlacesParams placesParams, AbstractC8269i abstractC8269i);

    /* renamed from: b */
    void mo12219b(PlacesParams placesParams, PendingIntent pendingIntent);

    /* renamed from: b */
    void mo12218b(PlacesParams placesParams, AbstractC8300c abstractC8300c);

    /* renamed from: b */
    void mo12217b(List<String> list, PlacesParams placesParams, AbstractC8269i abstractC8269i);
}
