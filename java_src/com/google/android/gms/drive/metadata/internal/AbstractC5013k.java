package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.drive.metadata.AbstractC4996f;
import java.util.Collection;
/* renamed from: com.google.android.gms.drive.metadata.internal.k */
/* loaded from: classes2.dex */
public abstract class AbstractC5013k<T extends ReflectedParcelable> extends AbstractC4996f<T> {
    public AbstractC5013k(String str, Collection<String> collection, Collection<String> collection2, int i) {
        super(str, collection, collection2, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.drive.metadata.AbstractC4996f
    /* renamed from: a */
    public void mo22100a(Bundle bundle, ReflectedParcelable reflectedParcelable) {
        bundle.putParcelable(a(), reflectedParcelable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.drive.metadata.AbstractC4996f
    /* renamed from: b */
    public T mo22097c(Bundle bundle) {
        return (T) bundle.getParcelable(a());
    }
}
