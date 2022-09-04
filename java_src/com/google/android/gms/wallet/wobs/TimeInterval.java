package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class TimeInterval extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TimeInterval> CREATOR = new C9422g();

    /* renamed from: a */
    long f29773a;

    /* renamed from: b */
    long f29774b;

    /* renamed from: c */
    private final int f29775c;

    TimeInterval() {
        this.f29775c = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TimeInterval(int i, long j, long j2) {
        this.f29775c = i;
        this.f29773a = j;
        this.f29774b = j2;
    }

    /* renamed from: a */
    public int m8175a() {
        return this.f29775c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9422g.m8152a(this, parcel, i);
    }
}
