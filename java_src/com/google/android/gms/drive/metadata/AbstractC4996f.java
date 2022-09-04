package com.google.android.gms.drive.metadata;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* renamed from: com.google.android.gms.drive.metadata.f */
/* loaded from: classes2.dex */
public abstract class AbstractC4996f<T> implements AbstractC4991a<T> {

    /* renamed from: a */
    private final String f17984a;

    /* renamed from: b */
    private final Set<String> f17985b;

    /* renamed from: c */
    private final Set<String> f17986c;

    /* renamed from: d */
    private final int f17987d;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC4996f(String str, int i) {
        this.f17984a = (String) C4588d.m23626a(str, (Object) "fieldName");
        this.f17985b = Collections.singleton(str);
        this.f17986c = Collections.emptySet();
        this.f17987d = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC4996f(String str, Collection<String> collection, Collection<String> collection2, int i) {
        this.f17984a = (String) C4588d.m23626a(str, (Object) "fieldName");
        this.f17985b = Collections.unmodifiableSet(new HashSet(collection));
        this.f17986c = Collections.unmodifiableSet(new HashSet(collection2));
        this.f17987d = i;
    }

    @Override // com.google.android.gms.drive.metadata.AbstractC4991a
    /* renamed from: a */
    public final T mo22170a(Bundle bundle) {
        C4588d.m23626a(bundle, "bundle");
        if (bundle.get(mo22171a()) != null) {
            return mo22097c(bundle);
        }
        return null;
    }

    @Override // com.google.android.gms.drive.metadata.AbstractC4991a
    /* renamed from: a */
    public final T mo22169a(DataHolder dataHolder, int i, int i2) {
        if (mo17071b(dataHolder, i, i2)) {
            return mo17070c(dataHolder, i, i2);
        }
        return null;
    }

    @Override // com.google.android.gms.drive.metadata.AbstractC4991a
    /* renamed from: a */
    public final String mo22171a() {
        return this.f17984a;
    }

    /* renamed from: a */
    protected abstract void mo22100a(Bundle bundle, T t);

    @Override // com.google.android.gms.drive.metadata.AbstractC4991a
    /* renamed from: a */
    public final void mo22168a(DataHolder dataHolder, MetadataBundle metadataBundle, int i, int i2) {
        C4588d.m23626a(dataHolder, "dataHolder");
        C4588d.m23626a(metadataBundle, "bundle");
        if (mo17071b(dataHolder, i, i2)) {
            metadataBundle.m22150b(this, mo17070c(dataHolder, i, i2));
        }
    }

    @Override // com.google.android.gms.drive.metadata.AbstractC4991a
    /* renamed from: a */
    public final void mo22167a(T t, Bundle bundle) {
        C4588d.m23626a(bundle, "bundle");
        if (t == null) {
            bundle.putString(mo22171a(), null);
        } else {
            mo22100a(bundle, (Bundle) t);
        }
    }

    /* renamed from: b */
    public final Collection<String> m22166b() {
        return this.f17985b;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000c  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected boolean mo17071b(DataHolder dataHolder, int i, int i2) {
        for (String str : this.f17985b) {
            if (!dataHolder.m23895a(str) || dataHolder.m23876h(str, i, i2)) {
                return false;
            }
            while (r1.hasNext()) {
            }
        }
        return true;
    }

    /* renamed from: c */
    protected abstract T mo22097c(Bundle bundle);

    /* renamed from: c */
    protected abstract T mo17070c(DataHolder dataHolder, int i, int i2);

    public String toString() {
        return this.f17984a;
    }
}
