package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.drive.metadata.AbstractC4997g;
import java.util.ArrayList;
import java.util.Collection;
/* renamed from: com.google.android.gms.drive.metadata.internal.j */
/* loaded from: classes2.dex */
public class C5012j<T extends Parcelable> extends AbstractC4997g<T> {
    public C5012j(String str, Collection<String> collection, Collection<String> collection2, int i) {
        super(str, collection, collection2, i);
    }

    @Override // com.google.android.gms.drive.metadata.AbstractC4996f
    /* renamed from: a */
    protected /* bridge */ /* synthetic */ void mo22100a(Bundle bundle, Object obj) {
        m22116a(bundle, (Collection) ((Collection) obj));
    }

    /* renamed from: a */
    protected void m22116a(Bundle bundle, Collection<T> collection) {
        bundle.putParcelableArrayList(a(), collection instanceof ArrayList ? (ArrayList) collection : new ArrayList<>(collection));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.drive.metadata.AbstractC4996f
    /* renamed from: b */
    public Collection<T> mo22097c(Bundle bundle) {
        return bundle.getParcelableArrayList(a());
    }
}
