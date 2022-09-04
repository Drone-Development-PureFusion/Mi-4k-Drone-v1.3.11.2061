package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.state.AbstractC4141a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class HeadphoneStateImpl extends AbstractSafeParcelable implements AbstractC4141a {
    public static final Parcelable.Creator<HeadphoneStateImpl> CREATOR = new C4114d();

    /* renamed from: c */
    private final int f15653c;

    /* renamed from: d */
    private final int f15654d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public HeadphoneStateImpl(int i, int i2) {
        this.f15653c = i;
        this.f15654d = i2;
    }

    @Override // com.google.android.gms.awareness.state.AbstractC4141a
    /* renamed from: a */
    public int mo25354a() {
        return this.f15654d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m25457b() {
        return this.f15653c;
    }

    public String toString() {
        switch (this.f15654d) {
            case 1:
                return "HEADPHONE_PLUGGED";
            case 2:
                return "HEADPHONE_UNPLUGGED";
            default:
                return new StringBuilder(35).append("unknown headphone state=").append(this.f15654d).toString();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4114d.m25411a(this, parcel, i);
    }
}
