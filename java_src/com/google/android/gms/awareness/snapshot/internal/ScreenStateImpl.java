package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class ScreenStateImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ScreenStateImpl> CREATOR = new C4119i();

    /* renamed from: a */
    private final int f15663a;

    /* renamed from: b */
    private final int f15664b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ScreenStateImpl(int i, int i2) {
        this.f15663a = i;
        this.f15664b = i2;
    }

    /* renamed from: a */
    public int m25444a() {
        return this.f15664b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m25443b() {
        return this.f15663a;
    }

    public String toString() {
        return this.f15664b == 1 ? "ScreenState: SCREEN_OFF" : this.f15664b == 2 ? "ScreenState: SCREEN_ON" : "ScreenState: UNKNOWN";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4119i.m25399a(this, parcel, i);
    }
}
