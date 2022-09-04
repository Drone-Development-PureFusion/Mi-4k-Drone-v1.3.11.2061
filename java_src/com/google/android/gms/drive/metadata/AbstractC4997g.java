package com.google.android.gms.drive.metadata;

import com.google.android.gms.common.data.DataHolder;
import java.util.Collection;
/* renamed from: com.google.android.gms.drive.metadata.g */
/* loaded from: classes2.dex */
public abstract class AbstractC4997g<T> extends AbstractC4996f<Collection<T>> {
    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC4997g(String str, Collection<String> collection, Collection<String> collection2, int i) {
        super(str, collection, collection2, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.drive.metadata.AbstractC4996f
    /* renamed from: e_ */
    public Collection<T> mo17070c(DataHolder dataHolder, int i, int i2) {
        throw new UnsupportedOperationException("Cannot read collections from a dataHolder.");
    }
}
