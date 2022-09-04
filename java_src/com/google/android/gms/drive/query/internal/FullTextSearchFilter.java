package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
/* loaded from: classes2.dex */
public class FullTextSearchFilter extends AbstractFilter {
    public static final C5043h CREATOR = new C5043h();

    /* renamed from: a */
    final String f18081a;

    /* renamed from: b */
    final int f18082b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FullTextSearchFilter(int i, String str) {
        this.f18082b = i;
        this.f18081a = str;
    }

    @Override // com.google.android.gms.drive.query.Filter
    /* renamed from: a */
    public <F> F mo22003a(AbstractC5041f<F> abstractC5041f) {
        return abstractC5041f.mo21980a(this.f18081a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5043h.m21968a(this, parcel, i);
    }
}
