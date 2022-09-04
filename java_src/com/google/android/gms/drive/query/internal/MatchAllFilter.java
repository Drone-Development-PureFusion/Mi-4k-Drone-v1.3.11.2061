package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
/* loaded from: classes2.dex */
public class MatchAllFilter extends AbstractFilter {
    public static final C5047l CREATOR = new C5047l();

    /* renamed from: a */
    final int f18093a;

    public MatchAllFilter() {
        this(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MatchAllFilter(int i) {
        this.f18093a = i;
    }

    @Override // com.google.android.gms.drive.query.Filter
    /* renamed from: a */
    public <F> F mo22003a(AbstractC5041f<F> abstractC5041f) {
        return abstractC5041f.mo21989a();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5047l.m21956a(this, parcel, i);
    }
}
