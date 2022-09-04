package com.google.android.gms.awareness.snapshot.internal;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.location.ActivityRecognitionResult;
/* renamed from: com.google.android.gms.awareness.snapshot.internal.k */
/* loaded from: classes2.dex */
public class C4135k implements Parcelable.Creator<Snapshot> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m25370a(Snapshot snapshot, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23475a(parcel, 1, snapshot.m25432k());
        C4630b.m23470a(parcel, 2, (Parcelable) snapshot.m25442a(), i, false);
        C4630b.m23470a(parcel, 3, (Parcelable) snapshot.m25441b(), i, false);
        C4630b.m23470a(parcel, 4, (Parcelable) snapshot.m25440c(), i, false);
        C4630b.m23470a(parcel, 5, (Parcelable) snapshot.m25439d(), i, false);
        C4630b.m23470a(parcel, 6, (Parcelable) snapshot.m25438e(), i, false);
        C4630b.m23470a(parcel, 7, (Parcelable) snapshot.m25437f(), i, false);
        C4630b.m23470a(parcel, 8, (Parcelable) snapshot.m25436g(), i, false);
        C4630b.m23470a(parcel, 9, (Parcelable) snapshot.m25435h(), i, false);
        C4630b.m23470a(parcel, 10, (Parcelable) snapshot.m25434i(), i, false);
        C4630b.m23470a(parcel, 11, (Parcelable) snapshot.m25433j(), i, false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public Snapshot createFromParcel(Parcel parcel) {
        DayAttributesImpl dayAttributesImpl = null;
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        WeatherImpl weatherImpl = null;
        ScreenStateImpl screenStateImpl = null;
        PowerStateImpl powerStateImpl = null;
        DataHolder dataHolder = null;
        NetworkStateImpl networkStateImpl = null;
        Location location = null;
        HeadphoneStateImpl headphoneStateImpl = null;
        BeaconStateImpl beaconStateImpl = null;
        ActivityRecognitionResult activityRecognitionResult = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                case 2:
                    activityRecognitionResult = (ActivityRecognitionResult) C4628a.m23510a(parcel, m23514a, ActivityRecognitionResult.CREATOR);
                    break;
                case 3:
                    beaconStateImpl = (BeaconStateImpl) C4628a.m23510a(parcel, m23514a, BeaconStateImpl.CREATOR);
                    break;
                case 4:
                    headphoneStateImpl = (HeadphoneStateImpl) C4628a.m23510a(parcel, m23514a, HeadphoneStateImpl.CREATOR);
                    break;
                case 5:
                    location = (Location) C4628a.m23510a(parcel, m23514a, Location.CREATOR);
                    break;
                case 6:
                    networkStateImpl = (NetworkStateImpl) C4628a.m23510a(parcel, m23514a, NetworkStateImpl.CREATOR);
                    break;
                case 7:
                    dataHolder = (DataHolder) C4628a.m23510a(parcel, m23514a, DataHolder.CREATOR);
                    break;
                case 8:
                    powerStateImpl = (PowerStateImpl) C4628a.m23510a(parcel, m23514a, PowerStateImpl.CREATOR);
                    break;
                case 9:
                    screenStateImpl = (ScreenStateImpl) C4628a.m23510a(parcel, m23514a, ScreenStateImpl.CREATOR);
                    break;
                case 10:
                    weatherImpl = (WeatherImpl) C4628a.m23510a(parcel, m23514a, WeatherImpl.CREATOR);
                    break;
                case 11:
                    dayAttributesImpl = (DayAttributesImpl) C4628a.m23510a(parcel, m23514a, DayAttributesImpl.CREATOR);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new Snapshot(i, activityRecognitionResult, beaconStateImpl, headphoneStateImpl, location, networkStateImpl, dataHolder, powerStateImpl, screenStateImpl, weatherImpl, dayAttributesImpl);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public Snapshot[] newArray(int i) {
        return new Snapshot[i];
    }
}
