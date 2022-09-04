package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class EventParcel extends AbstractSafeParcelable {
    public static final C8737w CREATOR = new C8737w();

    /* renamed from: a */
    public final int f27609a;

    /* renamed from: b */
    public final String f27610b;

    /* renamed from: c */
    public final EventParams f27611c;

    /* renamed from: d */
    public final String f27612d;

    /* renamed from: e */
    public final long f27613e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public EventParcel(int i, String str, EventParams eventParams, String str2, long j) {
        this.f27609a = i;
        this.f27610b = str;
        this.f27611c = eventParams;
        this.f27612d = str2;
        this.f27613e = j;
    }

    public EventParcel(String str, EventParams eventParams, String str2, long j) {
        this.f27609a = 1;
        this.f27610b = str;
        this.f27611c = eventParams;
        this.f27612d = str2;
        this.f27613e = j;
    }

    public String toString() {
        String str = this.f27612d;
        String str2 = this.f27610b;
        String valueOf = String.valueOf(this.f27611c);
        return new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + String.valueOf(valueOf).length()).append("origin=").append(str).append(",name=").append(str2).append(",params=").append(valueOf).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8737w.m10339a(this, parcel, i);
    }
}
