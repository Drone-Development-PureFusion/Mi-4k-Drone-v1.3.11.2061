package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.metadata.AbstractC4991a;
import com.google.android.gms.drive.metadata.AbstractC4993c;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
/* loaded from: classes2.dex */
public class FieldOnlyFilter extends AbstractFilter {
    public static final Parcelable.Creator<FieldOnlyFilter> CREATOR = new C5037b();

    /* renamed from: a */
    final MetadataBundle f18064a;

    /* renamed from: b */
    final int f18065b;

    /* renamed from: c */
    private final AbstractC4991a<?> f18066c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FieldOnlyFilter(int i, MetadataBundle metadataBundle) {
        this.f18065b = i;
        this.f18064a = metadataBundle;
        this.f18066c = C5040e.m21990a(metadataBundle);
    }

    public FieldOnlyFilter(AbstractC4993c<?> abstractC4993c) {
        this(1, MetadataBundle.m22153a(abstractC4993c, null));
    }

    @Override // com.google.android.gms.drive.query.Filter
    /* renamed from: a */
    public <T> T mo22003a(AbstractC5041f<T> abstractC5041f) {
        return abstractC5041f.mo21988a(this.f18066c);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5037b.m21997a(this, parcel, i);
    }
}
