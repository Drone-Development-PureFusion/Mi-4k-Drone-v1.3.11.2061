package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
/* loaded from: classes2.dex */
public class OwnedByMeFilter extends AbstractFilter {
    public static final C5050o CREATOR = new C5050o();

    /* renamed from: a */
    final int f18107a;

    public OwnedByMeFilter() {
        this(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public OwnedByMeFilter(int i) {
        this.f18107a = i;
    }

    @Override // com.google.android.gms.drive.query.Filter
    /* renamed from: a */
    public <F> F mo22003a(AbstractC5041f<F> abstractC5041f) {
        return abstractC5041f.mo21979b();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5050o.m21947a(this, parcel, i);
    }
}
