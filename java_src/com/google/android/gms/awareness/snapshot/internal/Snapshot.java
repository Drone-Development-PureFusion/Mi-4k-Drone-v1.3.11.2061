package com.google.android.gms.awareness.snapshot.internal;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.ActivityRecognitionResult;
/* loaded from: classes2.dex */
public final class Snapshot extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Snapshot> CREATOR = new C4135k();

    /* renamed from: a */
    private final int f15665a;

    /* renamed from: b */
    private final ActivityRecognitionResult f15666b;

    /* renamed from: c */
    private final BeaconStateImpl f15667c;

    /* renamed from: d */
    private final HeadphoneStateImpl f15668d;

    /* renamed from: e */
    private final Location f15669e;

    /* renamed from: f */
    private final NetworkStateImpl f15670f;

    /* renamed from: g */
    private final DataHolder f15671g;

    /* renamed from: h */
    private final PowerStateImpl f15672h;

    /* renamed from: i */
    private final ScreenStateImpl f15673i;

    /* renamed from: j */
    private final WeatherImpl f15674j;

    /* renamed from: k */
    private final DayAttributesImpl f15675k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Snapshot(int i, ActivityRecognitionResult activityRecognitionResult, BeaconStateImpl beaconStateImpl, HeadphoneStateImpl headphoneStateImpl, Location location, NetworkStateImpl networkStateImpl, DataHolder dataHolder, PowerStateImpl powerStateImpl, ScreenStateImpl screenStateImpl, WeatherImpl weatherImpl, DayAttributesImpl dayAttributesImpl) {
        this.f15665a = i;
        this.f15666b = activityRecognitionResult;
        this.f15667c = beaconStateImpl;
        this.f15668d = headphoneStateImpl;
        this.f15669e = location;
        this.f15670f = networkStateImpl;
        this.f15671g = dataHolder;
        this.f15672h = powerStateImpl;
        this.f15673i = screenStateImpl;
        this.f15674j = weatherImpl;
        this.f15675k = dayAttributesImpl;
    }

    /* renamed from: a */
    public ActivityRecognitionResult m25442a() {
        return this.f15666b;
    }

    /* renamed from: b */
    public BeaconStateImpl m25441b() {
        return this.f15667c;
    }

    /* renamed from: c */
    public HeadphoneStateImpl m25440c() {
        return this.f15668d;
    }

    /* renamed from: d */
    public Location m25439d() {
        return this.f15669e;
    }

    /* renamed from: e */
    public NetworkStateImpl m25438e() {
        return this.f15670f;
    }

    /* renamed from: f */
    public DataHolder m25437f() {
        return this.f15671g;
    }

    /* renamed from: g */
    public PowerStateImpl m25436g() {
        return this.f15672h;
    }

    /* renamed from: h */
    public ScreenStateImpl m25435h() {
        return this.f15673i;
    }

    /* renamed from: i */
    public WeatherImpl m25434i() {
        return this.f15674j;
    }

    /* renamed from: j */
    public DayAttributesImpl m25433j() {
        return this.f15675k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public int m25432k() {
        return this.f15665a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4135k.m25370a(this, parcel, i);
    }
}
