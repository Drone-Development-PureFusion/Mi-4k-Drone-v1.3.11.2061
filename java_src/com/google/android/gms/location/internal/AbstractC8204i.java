package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.aif;
import com.google.android.gms.location.AbstractC8344x;
import com.google.android.gms.location.ActivityRecognitionRequest;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.GestureRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.internal.AbstractC8198g;
import com.google.android.gms.location.internal.AbstractC8201h;
import com.google.android.gms.location.internal.AbstractC8207j;
import java.util.List;
/* renamed from: com.google.android.gms.location.internal.i */
/* loaded from: classes2.dex */
public interface AbstractC8204i extends IInterface {

    /* renamed from: com.google.android.gms.location.internal.i$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC8205a extends Binder implements AbstractC8204i {

        /* renamed from: com.google.android.gms.location.internal.i$a$a */
        /* loaded from: classes2.dex */
        private static class C8206a implements AbstractC8204i {

            /* renamed from: a */
            private IBinder f26807a;

            C8206a(IBinder iBinder) {
                this.f26807a = iBinder;
            }

            @Override // com.google.android.gms.location.internal.AbstractC8204i
            /* renamed from: a */
            public Location mo12470a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    this.f26807a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Location) Location.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.internal.AbstractC8204i
            /* renamed from: a */
            public ActivityRecognitionResult mo12448a(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    obtain.writeString(str);
                    this.f26807a.transact(64, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (ActivityRecognitionResult) ActivityRecognitionResult.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.internal.AbstractC8204i
            /* renamed from: a */
            public void mo12469a(long j, boolean z, PendingIntent pendingIntent) {
                int i = 1;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    obtain.writeLong(j);
                    if (!z) {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f26807a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.internal.AbstractC8204i
            /* renamed from: a */
            public void mo12468a(PendingIntent pendingIntent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f26807a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.internal.AbstractC8204i
            /* renamed from: a */
            public void mo12467a(PendingIntent pendingIntent, aif aifVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(aifVar != null ? aifVar.asBinder() : null);
                    this.f26807a.transact(73, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.internal.AbstractC8204i
            /* renamed from: a */
            public void mo12466a(PendingIntent pendingIntent, AbstractC8201h abstractC8201h, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC8201h != null ? abstractC8201h.asBinder() : null);
                    obtain.writeString(str);
                    this.f26807a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.internal.AbstractC8204i
            /* renamed from: a */
            public void mo12465a(Location location) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (location != null) {
                        obtain.writeInt(1);
                        location.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f26807a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.internal.AbstractC8204i
            /* renamed from: a */
            public void mo12464a(Location location, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (location != null) {
                        obtain.writeInt(1);
                        location.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    this.f26807a.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.internal.AbstractC8204i
            /* renamed from: a */
            public void mo12463a(aif aifVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    obtain.writeStrongBinder(aifVar != null ? aifVar.asBinder() : null);
                    this.f26807a.transact(71, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.internal.AbstractC8204i
            /* renamed from: a */
            public void mo12462a(ActivityRecognitionRequest activityRecognitionRequest, PendingIntent pendingIntent, aif aifVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (activityRecognitionRequest != null) {
                        obtain.writeInt(1);
                        activityRecognitionRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(aifVar != null ? aifVar.asBinder() : null);
                    this.f26807a.transact(70, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.internal.AbstractC8204i
            /* renamed from: a */
            public void mo12461a(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, aif aifVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (activityTransitionRequest != null) {
                        obtain.writeInt(1);
                        activityTransitionRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(aifVar != null ? aifVar.asBinder() : null);
                    this.f26807a.transact(72, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.internal.AbstractC8204i
            /* renamed from: a */
            public void mo12460a(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, AbstractC8201h abstractC8201h) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (geofencingRequest != null) {
                        obtain.writeInt(1);
                        geofencingRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC8201h != null ? abstractC8201h.asBinder() : null);
                    this.f26807a.transact(57, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.internal.AbstractC8204i
            /* renamed from: a */
            public void mo12459a(GestureRequest gestureRequest, PendingIntent pendingIntent, aif aifVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (gestureRequest != null) {
                        obtain.writeInt(1);
                        gestureRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(aifVar != null ? aifVar.asBinder() : null);
                    this.f26807a.transact(60, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.internal.AbstractC8204i
            /* renamed from: a */
            public void mo12458a(LocationRequest locationRequest, PendingIntent pendingIntent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (locationRequest != null) {
                        obtain.writeInt(1);
                        locationRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f26807a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.internal.AbstractC8204i
            /* renamed from: a */
            public void mo12457a(LocationRequest locationRequest, AbstractC8344x abstractC8344x) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (locationRequest != null) {
                        obtain.writeInt(1);
                        locationRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC8344x != null ? abstractC8344x.asBinder() : null);
                    this.f26807a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.internal.AbstractC8204i
            /* renamed from: a */
            public void mo12456a(LocationRequest locationRequest, AbstractC8344x abstractC8344x, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (locationRequest != null) {
                        obtain.writeInt(1);
                        locationRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC8344x != null ? abstractC8344x.asBinder() : null);
                    obtain.writeString(str);
                    this.f26807a.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.internal.AbstractC8204i
            /* renamed from: a */
            public void mo12455a(LocationSettingsRequest locationSettingsRequest, AbstractC8207j abstractC8207j, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (locationSettingsRequest != null) {
                        obtain.writeInt(1);
                        locationSettingsRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC8207j != null ? abstractC8207j.asBinder() : null);
                    obtain.writeString(str);
                    this.f26807a.transact(63, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.internal.AbstractC8204i
            /* renamed from: a */
            public void mo12454a(LocationRequestInternal locationRequestInternal, PendingIntent pendingIntent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (locationRequestInternal != null) {
                        obtain.writeInt(1);
                        locationRequestInternal.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f26807a.transact(53, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.internal.AbstractC8204i
            /* renamed from: a */
            public void mo12453a(LocationRequestInternal locationRequestInternal, AbstractC8344x abstractC8344x) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (locationRequestInternal != null) {
                        obtain.writeInt(1);
                        locationRequestInternal.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC8344x != null ? abstractC8344x.asBinder() : null);
                    this.f26807a.transact(52, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.internal.AbstractC8204i
            /* renamed from: a */
            public void mo12452a(LocationRequestUpdateData locationRequestUpdateData) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (locationRequestUpdateData != null) {
                        obtain.writeInt(1);
                        locationRequestUpdateData.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f26807a.transact(59, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.internal.AbstractC8204i
            /* renamed from: a */
            public void mo12451a(AbstractC8198g abstractC8198g) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    obtain.writeStrongBinder(abstractC8198g != null ? abstractC8198g.asBinder() : null);
                    this.f26807a.transact(67, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.internal.AbstractC8204i
            /* renamed from: a */
            public void mo12450a(AbstractC8201h abstractC8201h, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    obtain.writeStrongBinder(abstractC8201h != null ? abstractC8201h.asBinder() : null);
                    obtain.writeString(str);
                    this.f26807a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.internal.AbstractC8204i
            /* renamed from: a */
            public void mo12449a(AbstractC8344x abstractC8344x) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    obtain.writeStrongBinder(abstractC8344x != null ? abstractC8344x.asBinder() : null);
                    this.f26807a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.internal.AbstractC8204i
            /* renamed from: a */
            public void mo12447a(List<ParcelableGeofence> list, PendingIntent pendingIntent, AbstractC8201h abstractC8201h, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    obtain.writeTypedList(list);
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(abstractC8201h != null ? abstractC8201h.asBinder() : null);
                    obtain.writeString(str);
                    this.f26807a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.internal.AbstractC8204i
            /* renamed from: a */
            public void mo12446a(boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.f26807a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.internal.AbstractC8204i
            /* renamed from: a */
            public void mo12445a(String[] strArr, AbstractC8201h abstractC8201h, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    obtain.writeStringArray(strArr);
                    obtain.writeStrongBinder(abstractC8201h != null ? abstractC8201h.asBinder() : null);
                    obtain.writeString(str);
                    this.f26807a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f26807a;
            }

            @Override // com.google.android.gms.location.internal.AbstractC8204i
            /* renamed from: b */
            public Location mo12442b(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    obtain.writeString(str);
                    this.f26807a.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Location) Location.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.internal.AbstractC8204i
            /* renamed from: b */
            public void mo12444b(PendingIntent pendingIntent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f26807a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.internal.AbstractC8204i
            /* renamed from: b */
            public void mo12443b(PendingIntent pendingIntent, aif aifVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(aifVar != null ? aifVar.asBinder() : null);
                    this.f26807a.transact(65, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.internal.AbstractC8204i
            /* renamed from: c */
            public LocationAvailability mo12440c(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    obtain.writeString(str);
                    this.f26807a.transact(34, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (LocationAvailability) LocationAvailability.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.internal.AbstractC8204i
            /* renamed from: c */
            public void mo12441c(PendingIntent pendingIntent, aif aifVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(aifVar != null ? aifVar.asBinder() : null);
                    this.f26807a.transact(66, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.internal.AbstractC8204i
            /* renamed from: d */
            public void mo12439d(PendingIntent pendingIntent, aif aifVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(aifVar != null ? aifVar.asBinder() : null);
                    this.f26807a.transact(61, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.internal.AbstractC8204i
            /* renamed from: e */
            public void mo12438e(PendingIntent pendingIntent, aif aifVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(aifVar != null ? aifVar.asBinder() : null);
                    this.f26807a.transact(68, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.google.android.gms.location.internal.AbstractC8204i
            /* renamed from: f */
            public void mo12437f(PendingIntent pendingIntent, aif aifVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (pendingIntent != null) {
                        obtain.writeInt(1);
                        pendingIntent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(aifVar != null ? aifVar.asBinder() : null);
                    this.f26807a.transact(69, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static AbstractC8204i m12471a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC8204i)) ? new C8206a(iBinder) : (AbstractC8204i) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            boolean z = false;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    a(parcel.createTypedArrayList(ParcelableGeofence.CREATOR), parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, AbstractC8201h.AbstractBinderC8202a.m12472a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    a(parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, AbstractC8201h.AbstractBinderC8202a.m12472a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    a(parcel.createStringArray(), AbstractC8201h.AbstractBinderC8202a.m12472a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    a(AbstractC8201h.AbstractBinderC8202a.m12472a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    a(parcel.readLong(), parcel.readInt() != 0, parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    a(parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    Location a = a();
                    parcel2.writeNoException();
                    if (a == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    a.writeToParcel(parcel2, 1);
                    return true;
                case 8:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    a(parcel.readInt() != 0 ? (LocationRequest) LocationRequest.CREATOR.createFromParcel(parcel) : null, AbstractC8344x.AbstractBinderC8345a.m12023a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    a(parcel.readInt() != 0 ? (LocationRequest) LocationRequest.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    a(AbstractC8344x.AbstractBinderC8345a.m12023a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 11:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    b(parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    a(z);
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    a(parcel.readInt() != 0 ? (Location) Location.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 20:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    a(parcel.readInt() != 0 ? (LocationRequest) LocationRequest.CREATOR.createFromParcel(parcel) : null, AbstractC8344x.AbstractBinderC8345a.m12023a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 21:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    Location b = b(parcel.readString());
                    parcel2.writeNoException();
                    if (b == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    b.writeToParcel(parcel2, 1);
                    return true;
                case 26:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    a(parcel.readInt() != 0 ? (Location) Location.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 34:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    LocationAvailability c = c(parcel.readString());
                    parcel2.writeNoException();
                    if (c == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    c.writeToParcel(parcel2, 1);
                    return true;
                case 52:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    a(parcel.readInt() != 0 ? (LocationRequestInternal) LocationRequestInternal.CREATOR.createFromParcel(parcel) : null, AbstractC8344x.AbstractBinderC8345a.m12023a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 53:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    a(parcel.readInt() != 0 ? (LocationRequestInternal) LocationRequestInternal.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 57:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    a(parcel.readInt() != 0 ? GeofencingRequest.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, AbstractC8201h.AbstractBinderC8202a.m12472a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 59:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    a(parcel.readInt() != 0 ? (LocationRequestUpdateData) LocationRequestUpdateData.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 60:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    a(parcel.readInt() != 0 ? (GestureRequest) GestureRequest.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, aif.AbstractBinderC6380a.m17244a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 61:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    d(parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, aif.AbstractBinderC6380a.m17244a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 63:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    a(parcel.readInt() != 0 ? LocationSettingsRequest.CREATOR.createFromParcel(parcel) : null, AbstractC8207j.AbstractBinderC8208a.m12436a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 64:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    ActivityRecognitionResult a2 = a(parcel.readString());
                    parcel2.writeNoException();
                    if (a2 == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeInt(1);
                    a2.writeToParcel(parcel2, 1);
                    return true;
                case 65:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    b(parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, aif.AbstractBinderC6380a.m17244a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 66:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    c(parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, aif.AbstractBinderC6380a.m17244a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 67:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    a(AbstractC8198g.AbstractBinderC8199a.m12474a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 68:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    e(parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, aif.AbstractBinderC6380a.m17244a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 69:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    f(parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, aif.AbstractBinderC6380a.m17244a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 70:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    a(parcel.readInt() != 0 ? ActivityRecognitionRequest.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, aif.AbstractBinderC6380a.m17244a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 71:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    a(aif.AbstractBinderC6380a.m17244a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 72:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    a(parcel.readInt() != 0 ? (ActivityTransitionRequest) ActivityTransitionRequest.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, aif.AbstractBinderC6380a.m17244a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 73:
                    parcel.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    a(parcel.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(parcel) : null, aif.AbstractBinderC6380a.m17244a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    Location mo12470a();

    /* renamed from: a */
    ActivityRecognitionResult mo12448a(String str);

    /* renamed from: a */
    void mo12469a(long j, boolean z, PendingIntent pendingIntent);

    /* renamed from: a */
    void mo12468a(PendingIntent pendingIntent);

    /* renamed from: a */
    void mo12467a(PendingIntent pendingIntent, aif aifVar);

    /* renamed from: a */
    void mo12466a(PendingIntent pendingIntent, AbstractC8201h abstractC8201h, String str);

    /* renamed from: a */
    void mo12465a(Location location);

    /* renamed from: a */
    void mo12464a(Location location, int i);

    /* renamed from: a */
    void mo12463a(aif aifVar);

    /* renamed from: a */
    void mo12462a(ActivityRecognitionRequest activityRecognitionRequest, PendingIntent pendingIntent, aif aifVar);

    /* renamed from: a */
    void mo12461a(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, aif aifVar);

    /* renamed from: a */
    void mo12460a(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, AbstractC8201h abstractC8201h);

    /* renamed from: a */
    void mo12459a(GestureRequest gestureRequest, PendingIntent pendingIntent, aif aifVar);

    /* renamed from: a */
    void mo12458a(LocationRequest locationRequest, PendingIntent pendingIntent);

    /* renamed from: a */
    void mo12457a(LocationRequest locationRequest, AbstractC8344x abstractC8344x);

    /* renamed from: a */
    void mo12456a(LocationRequest locationRequest, AbstractC8344x abstractC8344x, String str);

    /* renamed from: a */
    void mo12455a(LocationSettingsRequest locationSettingsRequest, AbstractC8207j abstractC8207j, String str);

    /* renamed from: a */
    void mo12454a(LocationRequestInternal locationRequestInternal, PendingIntent pendingIntent);

    /* renamed from: a */
    void mo12453a(LocationRequestInternal locationRequestInternal, AbstractC8344x abstractC8344x);

    /* renamed from: a */
    void mo12452a(LocationRequestUpdateData locationRequestUpdateData);

    /* renamed from: a */
    void mo12451a(AbstractC8198g abstractC8198g);

    /* renamed from: a */
    void mo12450a(AbstractC8201h abstractC8201h, String str);

    /* renamed from: a */
    void mo12449a(AbstractC8344x abstractC8344x);

    /* renamed from: a */
    void mo12447a(List<ParcelableGeofence> list, PendingIntent pendingIntent, AbstractC8201h abstractC8201h, String str);

    /* renamed from: a */
    void mo12446a(boolean z);

    /* renamed from: a */
    void mo12445a(String[] strArr, AbstractC8201h abstractC8201h, String str);

    /* renamed from: b */
    Location mo12442b(String str);

    /* renamed from: b */
    void mo12444b(PendingIntent pendingIntent);

    /* renamed from: b */
    void mo12443b(PendingIntent pendingIntent, aif aifVar);

    /* renamed from: c */
    LocationAvailability mo12440c(String str);

    /* renamed from: c */
    void mo12441c(PendingIntent pendingIntent, aif aifVar);

    /* renamed from: d */
    void mo12439d(PendingIntent pendingIntent, aif aifVar);

    /* renamed from: e */
    void mo12438e(PendingIntent pendingIntent, aif aifVar);

    /* renamed from: f */
    void mo12437f(PendingIntent pendingIntent, aif aifVar);
}
