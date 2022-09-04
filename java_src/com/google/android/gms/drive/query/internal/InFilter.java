package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.drive.metadata.AbstractC4992b;
import com.google.android.gms.drive.metadata.AbstractC4997g;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Collection;
import java.util.Collections;
/* loaded from: classes2.dex */
public class InFilter<T> extends AbstractFilter {
    public static final C5045j CREATOR = new C5045j();

    /* renamed from: a */
    final MetadataBundle f18086a;

    /* renamed from: b */
    final int f18087b;

    /* renamed from: c */
    private final AbstractC4997g<T> f18088c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public InFilter(int i, MetadataBundle metadataBundle) {
        this.f18087b = i;
        this.f18086a = metadataBundle;
        this.f18088c = (AbstractC4997g) C5040e.m21990a(metadataBundle);
    }

    public InFilter(AbstractC4992b<T> abstractC4992b, T t) {
        this(1, MetadataBundle.m22153a(abstractC4992b, Collections.singleton(t)));
    }

    /* renamed from: a */
    public T m22005a() {
        return (T) ((Collection) this.f18086a.m22154a(this.f18088c)).iterator().next();
    }

    @Override // com.google.android.gms.drive.query.Filter
    /* renamed from: a */
    public <F> F mo22003a(AbstractC5041f<F> abstractC5041f) {
        return abstractC5041f.mo21986a((AbstractC4997g<AbstractC4997g<T>>) this.f18088c, (AbstractC4997g<T>) m22005a());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5045j.m21962a(this, parcel, i);
    }
}
