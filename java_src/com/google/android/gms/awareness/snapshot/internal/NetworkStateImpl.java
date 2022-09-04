package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class NetworkStateImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<NetworkStateImpl> CREATOR = new C4115e();

    /* renamed from: a */
    private final int f15655a;

    /* renamed from: b */
    private final int f15656b;

    /* renamed from: c */
    private final int f15657c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public NetworkStateImpl(int i, int i2, int i3) {
        this.f15655a = i;
        this.f15656b = i2;
        this.f15657c = i3;
    }

    /* renamed from: a */
    public static String m25455a(int i) {
        switch (i) {
            case 1:
                return "DISCONNECTED";
            case 2:
                return "ON_WIFI";
            case 3:
                return "ON_CELLULAR";
            default:
                return new StringBuilder(37).append("unknown connection state: ").append(i).toString();
        }
    }

    /* renamed from: b */
    public static String m25453b(int i) {
        switch (i) {
            case 1:
                return "METERED";
            case 2:
                return "UNMETERED";
            default:
                return new StringBuilder(32).append("unknown meter state: ").append(i).toString();
        }
    }

    /* renamed from: a */
    public int m25456a() {
        return this.f15656b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m25454b() {
        return this.f15655a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m25452c() {
        return this.f15657c;
    }

    public String toString() {
        String valueOf = String.valueOf(m25455a(this.f15656b));
        String valueOf2 = String.valueOf(m25453b(this.f15657c));
        return new StringBuilder(String.valueOf(valueOf).length() + 41 + String.valueOf(valueOf2).length()).append("ConnectionState = ").append(valueOf).append(" NetworkMeteredState = ").append(valueOf2).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4115e.m25408a(this, parcel, i);
    }
}
