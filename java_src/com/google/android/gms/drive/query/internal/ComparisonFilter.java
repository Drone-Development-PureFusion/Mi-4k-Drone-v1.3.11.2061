package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.drive.metadata.AbstractC4991a;
import com.google.android.gms.drive.metadata.AbstractC4993c;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
/* loaded from: classes2.dex */
public class ComparisonFilter<T> extends AbstractFilter {
    public static final C5036a CREATOR = new C5036a();

    /* renamed from: a */
    final Operator f18060a;

    /* renamed from: b */
    final MetadataBundle f18061b;

    /* renamed from: c */
    final int f18062c;

    /* renamed from: d */
    final AbstractC4991a<T> f18063d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ComparisonFilter(int i, Operator operator, MetadataBundle metadataBundle) {
        this.f18062c = i;
        this.f18060a = operator;
        this.f18061b = metadataBundle;
        this.f18063d = (AbstractC4991a<T>) C5040e.m21990a(metadataBundle);
    }

    public ComparisonFilter(Operator operator, AbstractC4993c<T> abstractC4993c, T t) {
        this(1, operator, MetadataBundle.m22153a(abstractC4993c, t));
    }

    /* renamed from: a */
    public T m22008a() {
        return (T) this.f18061b.m22154a(this.f18063d);
    }

    @Override // com.google.android.gms.drive.query.Filter
    /* renamed from: a */
    public <F> F mo22003a(AbstractC5041f<F> abstractC5041f) {
        return abstractC5041f.mo21984a(this.f18060a, this.f18063d, m22008a());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5036a.m22000a(this, parcel, i);
    }
}
