package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.query.Filter;
/* loaded from: classes2.dex */
public class NotFilter extends AbstractFilter {
    public static final Parcelable.Creator<NotFilter> CREATOR = new C5048m();

    /* renamed from: a */
    final FilterHolder f18094a;

    /* renamed from: b */
    final int f18095b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public NotFilter(int i, FilterHolder filterHolder) {
        this.f18095b = i;
        this.f18094a = filterHolder;
    }

    public NotFilter(Filter filter) {
        this(1, new FilterHolder(filter));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.drive.query.Filter
    /* renamed from: a */
    public <T> T mo22003a(AbstractC5041f<T> abstractC5041f) {
        return (T) abstractC5041f.mo21981a((AbstractC5041f<T>) this.f18094a.m22007a().mo22003a(abstractC5041f));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5048m.m21953a(this, parcel, i);
    }
}
