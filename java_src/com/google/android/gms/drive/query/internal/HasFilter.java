package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.drive.metadata.AbstractC4991a;
import com.google.android.gms.drive.metadata.AbstractC4993c;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
/* loaded from: classes2.dex */
public class HasFilter<T> extends AbstractFilter {
    public static final C5044i CREATOR = new C5044i();

    /* renamed from: a */
    final MetadataBundle f18083a;

    /* renamed from: b */
    final int f18084b;

    /* renamed from: c */
    final AbstractC4991a<T> f18085c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public HasFilter(int i, MetadataBundle metadataBundle) {
        this.f18084b = i;
        this.f18083a = metadataBundle;
        this.f18085c = (AbstractC4991a<T>) C5040e.m21990a(metadataBundle);
    }

    public HasFilter(AbstractC4993c<T> abstractC4993c, T t) {
        this(1, MetadataBundle.m22153a(abstractC4993c, t));
    }

    /* renamed from: a */
    public T m22006a() {
        return (T) this.f18083a.m22154a(this.f18085c);
    }

    @Override // com.google.android.gms.drive.query.Filter
    /* renamed from: a */
    public <F> F mo22003a(AbstractC5041f<F> abstractC5041f) {
        return abstractC5041f.mo21987a((AbstractC4991a<AbstractC4991a<T>>) this.f18085c, (AbstractC4991a<T>) m22006a());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5044i.m21965a(this, parcel, i);
    }
}
