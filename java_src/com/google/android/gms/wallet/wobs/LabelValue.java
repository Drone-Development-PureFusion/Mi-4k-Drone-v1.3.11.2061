package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class LabelValue extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LabelValue> CREATOR = new C9417b();

    /* renamed from: a */
    String f29751a;

    /* renamed from: b */
    String f29752b;

    /* renamed from: c */
    private final int f29753c;

    LabelValue() {
        this.f29753c = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LabelValue(int i, String str, String str2) {
        this.f29753c = i;
        this.f29751a = str;
        this.f29752b = str2;
    }

    /* renamed from: a */
    public int m8180a() {
        return this.f29753c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9417b.m8167a(this, parcel, i);
    }
}
